package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda3;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class Preview extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public static final HandlerScheduledExecutorService DEFAULT_SURFACE_PROVIDER_EXECUTOR = zzabp.mainThreadExecutor();
    public SurfaceEdge mCameraEdge;
    public SessionConfig.CloseableErrorListener mCloseableErrorListener;
    public SurfaceRequest mCurrentSurfaceRequest;
    public SessionConfig.Builder mSessionConfigBuilder;
    public SurfaceRequest.AnonymousClass2 mSessionDeferrableSurface;
    public SurfaceProvider mSurfaceProvider;
    public Executor mSurfaceProviderExecutor;

    public final class Defaults {
        public static final PreviewConfig DEFAULT_CONFIG;

        static {
            ResolutionSelector resolutionSelector = new ResolutionSelector(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY, ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY);
            Builder builder = new Builder(0);
            AutoValue_Config_Option autoValue_Config_Option = UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY;
            MutableOptionsBundle mutableOptionsBundle = builder.mMutableConfig;
            mutableOptionsBundle.insertOption(autoValue_Config_Option, 2);
            mutableOptionsBundle.insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, 0);
            mutableOptionsBundle.insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.TRUE);
            mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
            DEFAULT_CONFIG = new PreviewConfig(OptionsBundle.from(mutableOptionsBundle));
        }
    }

    public interface SurfaceProvider {
        void onSurfaceRequested(SurfaceRequest surfaceRequest);
    }

    public final void clearPipeline$2() {
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        SurfaceRequest.AnonymousClass2 anonymousClass2 = this.mSessionDeferrableSurface;
        if (anonymousClass2 != null) {
            anonymousClass2.close();
            this.mSessionDeferrableSurface = null;
        }
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        SurfaceRequest surfaceRequest = this.mCurrentSurfaceRequest;
        if (surfaceRequest != null) {
            synchronized (surfaceRequest.mLock) {
                surfaceRequest.mTransformationInfoListener = null;
                surfaceRequest.mTransformationInfoExecutor = null;
            }
        }
        this.mCurrentSurfaceRequest = null;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        DEFAULT_CONFIG.getClass();
        PreviewConfig previewConfig = Defaults.DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(previewConfig.getCaptureType(), 1);
        if (z) {
            config = Config.mergeConfigs(config, previewConfig);
        }
        if (config == null) {
            return null;
        }
        return new PreviewConfig(OptionsBundle.from(((Builder) getUseCaseConfigBuilder(config)).mMutableConfig));
    }

    @Override // androidx.camera.core.UseCase
    public final Set getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder getUseCaseConfigBuilder(Config config) {
        return new Builder(MutableOptionsBundle.from(config), 0);
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final AutoValue_StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        Object[] objArr = {this.mSessionConfigBuilder.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        SubtreeManager builder = this.mAttachedStreamSpec.toBuilder();
        builder.idCounter = config;
        return builder.build();
    }

    @Override // androidx.camera.core.UseCase
    public final AutoValue_StreamSpec onSuggestedStreamSpecUpdated(AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2) {
        StringUtilsKt.d("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + autoValue_StreamSpec + ", secondaryStreamSpec " + autoValue_StreamSpec2);
        updateConfigAndOutput((PreviewConfig) this.mCurrentConfig, autoValue_StreamSpec);
        return autoValue_StreamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        clearPipeline$2();
    }

    public final void sendTransformationInfoIfReady() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        Threads.runOnMain(new SurfaceEdge$$ExternalSyntheticLambda3(surfaceEdge, getRelativeRotation(camera, isMirroringRequired(camera)), getAppTargetRotation()));
    }

    public final void setSurfaceProvider(SurfaceProvider surfaceProvider) {
        Threads.checkMainThread();
        if (surfaceProvider == null) {
            this.mSurfaceProvider = null;
            this.mState = 2;
            notifyState();
            return;
        }
        this.mSurfaceProvider = surfaceProvider;
        this.mSurfaceProviderExecutor = DEFAULT_SURFACE_PROVIDER_EXECUTOR;
        if (getAttachedSurfaceResolution() != null) {
            updateConfigAndOutput((PreviewConfig) this.mCurrentConfig, this.mAttachedStreamSpec);
            notifyReset();
        }
        this.mState = 1;
        notifyState();
    }

    @Override // androidx.camera.core.UseCase
    public final void setViewPortCropRect(Rect rect) {
        this.mViewPortCropRect = rect;
        sendTransformationInfoIfReady();
    }

    public final String toString() {
        return "Preview:".concat(getName());
    }

    public final void updateConfigAndOutput(PreviewConfig previewConfig, AutoValue_StreamSpec autoValue_StreamSpec) {
        Threads.checkMainThread();
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        clearPipeline$2();
        int i = 0;
        TransactorKt.checkState(null, this.mCameraEdge == null);
        Matrix matrix = this.mSensorToBufferTransformMatrix;
        boolean hasTransform = camera.getHasTransform();
        Size size = autoValue_StreamSpec.resolution;
        Rect rect = this.mViewPortCropRect;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        SurfaceEdge surfaceEdge = new SurfaceEdge(1, 34, autoValue_StreamSpec, matrix, hasTransform, rect, getRelativeRotation(camera, isMirroringRequired(camera)), getAppTargetRotation(), camera.getHasTransform() && isMirroringRequired(camera));
        this.mCameraEdge = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(new Preview$$ExternalSyntheticLambda0(this, i));
        SurfaceRequest createSurfaceRequest = this.mCameraEdge.createSurfaceRequest(camera, true);
        this.mCurrentSurfaceRequest = createSurfaceRequest;
        this.mSessionDeferrableSurface = createSurfaceRequest.mInternalDeferrableSurface;
        if (this.mSurfaceProvider != null) {
            sendTransformationInfoIfReady();
            SurfaceProvider surfaceProvider = this.mSurfaceProvider;
            surfaceProvider.getClass();
            SurfaceRequest surfaceRequest = this.mCurrentSurfaceRequest;
            surfaceRequest.getClass();
            this.mSurfaceProviderExecutor.execute(new CameraX$$ExternalSyntheticLambda2(10, surfaceProvider, surfaceRequest));
        }
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(previewConfig, autoValue_StreamSpec.resolution);
        TraceParser traceParser = createFrom.mCaptureConfigBuilder;
        createFrom.mSessionType = autoValue_StreamSpec.sessionType;
        applyExpectedFrameRateRange(createFrom, autoValue_StreamSpec);
        int previewStabilizationMode = previewConfig.getPreviewStabilizationMode();
        if (previewStabilizationMode != 0) {
            traceParser.getClass();
            if (previewStabilizationMode != 0) {
                ((MutableOptionsBundle) traceParser.projectPackages).insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, Integer.valueOf(previewStabilizationMode));
            }
        }
        Config config = autoValue_StreamSpec.implementationOptions;
        if (config != null) {
            traceParser.addImplementationOptions(config);
        }
        if (this.mSurfaceProvider != null) {
            createFrom.addSurface(this.mSessionDeferrableSurface, autoValue_StreamSpec.dynamicRange, ((Integer) ((ImageOutputConfig) this.mCurrentConfig).retrieveOption(ImageOutputConfig.OPTION_MIRROR_MODE, -1)).intValue());
        }
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new Preview$$ExternalSyntheticLambda2(this, i));
        this.mCloseableErrorListener = closeableErrorListener2;
        createFrom.mErrorListener = closeableErrorListener2;
        this.mSessionConfigBuilder = createFrom;
        Object[] objArr = {createFrom.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
    }

    public final class Builder implements UseCaseConfig.Builder {
        public final /* synthetic */ int $r8$classId;
        public final MutableOptionsBundle mMutableConfig;

        public Builder(MutableOptionsBundle mutableOptionsBundle, int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.mMutableConfig = mutableOptionsBundle;
                    AutoValue_Config_Option autoValue_Config_Option = TargetConfig.OPTION_TARGET_CLASS;
                    Class cls = (Class) mutableOptionsBundle.retrieveOption(autoValue_Config_Option, null);
                    if (cls != null && !cls.equals(ImageAnalysis.class)) {
                        Handlers$$ExternalSyntheticBUOutline0.m$1("Invalid target class configuration for ", this, ": ", cls);
                        throw null;
                    }
                    mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
                    mutableOptionsBundle.insertOption(autoValue_Config_Option, ImageAnalysis.class);
                    AutoValue_Config_Option autoValue_Config_Option2 = TargetConfig.OPTION_TARGET_NAME;
                    if (mutableOptionsBundle.retrieveOption(autoValue_Config_Option2, null) == null) {
                        mutableOptionsBundle.insertOption(autoValue_Config_Option2, ImageAnalysis.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                case 2:
                    this.mMutableConfig = mutableOptionsBundle;
                    AutoValue_Config_Option autoValue_Config_Option3 = TargetConfig.OPTION_TARGET_CLASS;
                    Class cls2 = (Class) mutableOptionsBundle.retrieveOption(autoValue_Config_Option3, null);
                    if (cls2 != null && !cls2.equals(ImageCapture.class)) {
                        Handlers$$ExternalSyntheticBUOutline0.m$1("Invalid target class configuration for ", this, ": ", cls2);
                        throw null;
                    }
                    mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
                    mutableOptionsBundle.insertOption(autoValue_Config_Option3, ImageCapture.class);
                    AutoValue_Config_Option autoValue_Config_Option4 = TargetConfig.OPTION_TARGET_NAME;
                    if (mutableOptionsBundle.retrieveOption(autoValue_Config_Option4, null) == null) {
                        mutableOptionsBundle.insertOption(autoValue_Config_Option4, ImageCapture.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                case 3:
                    this.mMutableConfig = mutableOptionsBundle;
                    if (!mutableOptionsBundle.mOptions.containsKey(VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                        a$$ExternalSyntheticBUOutline0.m$3("VideoOutput is required");
                        throw null;
                    }
                    AutoValue_Config_Option autoValue_Config_Option5 = TargetConfig.OPTION_TARGET_CLASS;
                    Class cls3 = (Class) mutableOptionsBundle.retrieveOption(autoValue_Config_Option5, null);
                    if (cls3 != null && !cls3.equals(VideoCapture.class)) {
                        Handlers$$ExternalSyntheticBUOutline0.m$1("Invalid target class configuration for ", this, ": ", cls3);
                        throw null;
                    }
                    mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
                    mutableOptionsBundle.insertOption(autoValue_Config_Option5, VideoCapture.class);
                    AutoValue_Config_Option autoValue_Config_Option6 = TargetConfig.OPTION_TARGET_NAME;
                    if (mutableOptionsBundle.retrieveOption(autoValue_Config_Option6, null) == null) {
                        mutableOptionsBundle.insertOption(autoValue_Config_Option6, VideoCapture.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                default:
                    this.mMutableConfig = mutableOptionsBundle;
                    AutoValue_Config_Option autoValue_Config_Option7 = TargetConfig.OPTION_TARGET_CLASS;
                    Class cls4 = (Class) mutableOptionsBundle.retrieveOption(autoValue_Config_Option7, null);
                    if (cls4 != null && !cls4.equals(Preview.class)) {
                        Handlers$$ExternalSyntheticBUOutline0.m$1("Invalid target class configuration for ", this, ": ", cls4);
                        throw null;
                    }
                    mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.PREVIEW);
                    mutableOptionsBundle.insertOption(autoValue_Config_Option7, Preview.class);
                    AutoValue_Config_Option autoValue_Config_Option8 = TargetConfig.OPTION_TARGET_NAME;
                    if (mutableOptionsBundle.retrieveOption(autoValue_Config_Option8, null) == null) {
                        mutableOptionsBundle.insertOption(autoValue_Config_Option8, Preview.class.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                    AutoValue_Config_Option autoValue_Config_Option9 = ImageOutputConfig.OPTION_MIRROR_MODE;
                    if (((Integer) mutableOptionsBundle.retrieveOption(autoValue_Config_Option9, -1)).intValue() == -1) {
                        mutableOptionsBundle.insertOption(autoValue_Config_Option9, 2);
                        return;
                    }
                    return;
            }
        }

        /* renamed from: build, reason: collision with other method in class */
        public ImageCapture m101build() {
            AutoValue_Config_Option autoValue_Config_Option = ImageCaptureConfig.OPTION_BUFFER_FORMAT;
            MutableOptionsBundle mutableOptionsBundle = this.mMutableConfig;
            Integer num = (Integer) mutableOptionsBundle.retrieveOption(autoValue_Config_Option, null);
            if (num != null) {
                mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, num);
            } else {
                ImageCapture.Defaults defaults = ImageCapture.DEFAULT_CONFIG;
                AutoValue_Config_Option autoValue_Config_Option2 = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
                if (Objects.equals(mutableOptionsBundle.retrieveOption(autoValue_Config_Option2, null), 2)) {
                    mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
                } else if (Objects.equals(mutableOptionsBundle.retrieveOption(autoValue_Config_Option2, null), 3)) {
                    mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
                    mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, 256);
                } else if (Objects.equals(mutableOptionsBundle.retrieveOption(autoValue_Config_Option2, null), 1)) {
                    mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
                    mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
                } else {
                    mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                }
            }
            ImageCaptureConfig imageCaptureConfig = new ImageCaptureConfig(OptionsBundle.from(mutableOptionsBundle));
            ImageOutputConfig.validateConfig(imageCaptureConfig);
            ImageCapture imageCapture = new ImageCapture(imageCaptureConfig);
            Size size = (Size) mutableOptionsBundle.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null);
            if (size != null) {
                imageCapture.mCropAspectRatio = new Rational(size.getWidth(), size.getHeight());
            }
            TransactorKt.checkNotNull((Executor) mutableOptionsBundle.retrieveOption(IoConfig.OPTION_IO_EXECUTOR, zzabp.ioExecutor()), "The IO executor can't be null");
            AutoValue_Config_Option autoValue_Config_Option3 = ImageCaptureConfig.OPTION_FLASH_MODE;
            if (mutableOptionsBundle.mOptions.containsKey(autoValue_Config_Option3)) {
                Integer num2 = (Integer) mutableOptionsBundle.retrieveOption(autoValue_Config_Option3);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) num2, "The flash mode is not allowed to set: ");
                    return null;
                }
                if (num2.intValue() == 3 && mutableOptionsBundle.retrieveOption(ImageCaptureConfig.OPTION_SCREEN_FLASH, null) == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                    return null;
                }
            }
            return imageCapture;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableOptionsBundle getMutableConfig() {
            switch (this.$r8$classId) {
            }
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final UseCaseConfig getUseCaseConfig() {
            int i = this.$r8$classId;
            MutableOptionsBundle mutableOptionsBundle = this.mMutableConfig;
            switch (i) {
                case 0:
                    return new PreviewConfig(OptionsBundle.from(mutableOptionsBundle));
                case 1:
                    return new ImageAnalysisConfig(OptionsBundle.from(mutableOptionsBundle));
                case 2:
                    return new ImageCaptureConfig(OptionsBundle.from(mutableOptionsBundle));
                default:
                    return new VideoCaptureConfig(OptionsBundle.from(mutableOptionsBundle));
            }
        }

        public void setBackpressureStrategy() {
            this.mMutableConfig.insertOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, 0);
        }

        public void setTargetRotation$2(int i) {
            AutoValue_Config_Option autoValue_Config_Option = ImageOutputConfig.OPTION_TARGET_ROTATION;
            Integer valueOf = Integer.valueOf(i);
            MutableOptionsBundle mutableOptionsBundle = this.mMutableConfig;
            mutableOptionsBundle.insertOption(autoValue_Config_Option, valueOf);
            mutableOptionsBundle.insertOption(ImageOutputConfig.OPTION_APP_TARGET_ROTATION, Integer.valueOf(i));
        }

        public ImageAnalysis build() {
            ImageAnalysisConfig imageAnalysisConfig = new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
            ImageOutputConfig.validateConfig(imageAnalysisConfig);
            return new ImageAnalysis(imageAnalysisConfig);
        }

        /* renamed from: build, reason: collision with other method in class */
        public Preview m102build() {
            PreviewConfig previewConfig = new PreviewConfig(OptionsBundle.from(this.mMutableConfig));
            ImageOutputConfig.validateConfig(previewConfig);
            Preview preview = new Preview(previewConfig);
            preview.mSurfaceProviderExecutor = Preview.DEFAULT_SURFACE_PROVIDER_EXECUTOR;
            return preview;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(int i) {
            this(MutableOptionsBundle.create(), 0);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this(MutableOptionsBundle.create(), 1);
                    break;
                case 2:
                    this(MutableOptionsBundle.create(), 2);
                    break;
                default:
                    break;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(VideoOutput videoOutput) {
            this(r1, 3);
            this.$r8$classId = 3;
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, videoOutput);
            create.insertOption(UseCaseConfig.OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT, Boolean.valueOf(videoOutput.isQualitySelectorDefault()));
        }
    }
}
