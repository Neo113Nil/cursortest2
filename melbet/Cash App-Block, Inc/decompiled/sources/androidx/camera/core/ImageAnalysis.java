package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.plaid.internal.EnumC0170g;
import com.squareup.workflow1.internal.SubtreeManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import net.oneformapp.ProfileStore_;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ImageAnalysis extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public final Object mAnalysisLock;
    public SessionConfig.CloseableErrorListener mCloseableErrorListener;
    public SurfaceRequest.AnonymousClass2 mDeferrableSurface;
    public ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    public Matrix mSensorToBufferTransformMatrix;
    public SessionConfig.Builder mSessionConfigBuilder;
    public Analyzer mSubscribedAnalyzer;
    public Executor mSubscribedAnalyzerExecutor;
    public Rect mViewPortCropRect;

    public interface Analyzer {
        void analyze(SettableImageProxy settableImageProxy);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BackpressureStrategy {
    }

    public final class Defaults {
        public static final ImageAnalysisConfig DEFAULT_CONFIG;

        static {
            Object size = new Size(640, 480);
            Object resolutionSelector = new ResolutionSelector(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY, new ResolutionStrategy(1, SizeUtil.RESOLUTION_VGA));
            Preview.Builder builder = new Preview.Builder(1);
            AutoValue_Config_Option autoValue_Config_Option = ImageOutputConfig.OPTION_DEFAULT_RESOLUTION;
            MutableOptionsBundle mutableOptionsBundle = builder.mMutableConfig;
            mutableOptionsBundle.insertOption(autoValue_Config_Option, size);
            mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, 1);
            mutableOptionsBundle.insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, 0);
            mutableOptionsBundle.insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            DynamicRange dynamicRange = DynamicRange.SDR;
            if (!dynamicRange.equals(dynamicRange)) {
                a$$ExternalSyntheticBUOutline0.m("ImageAnalysis currently only supports SDR");
            } else {
                mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
                DEFAULT_CONFIG = new ImageAnalysisConfig(OptionsBundle.from(mutableOptionsBundle));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputImageFormat {
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.mAnalysisLock = new Object();
    }

    public final void clearAnalyzer() {
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setAnalyzer(null, null);
                }
                if (this.mSubscribedAnalyzer != null) {
                    this.mState = 2;
                    notifyState();
                }
                this.mSubscribedAnalyzerExecutor = null;
                this.mSubscribedAnalyzer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionConfig.Builder createPipeline(ImageAnalysisConfig imageAnalysisConfig, AutoValue_StreamSpec autoValue_StreamSpec) {
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer;
        boolean z;
        int height;
        int width;
        int i;
        boolean z2;
        Config config;
        SurfaceRequest.AnonymousClass2 anonymousClass2;
        SessionConfig.CloseableErrorListener closeableErrorListener;
        Threads.checkMainThread();
        Size size = autoValue_StreamSpec.resolution;
        Executor executor = (Executor) imageAnalysisConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, zzabp.highPriorityExecutor());
        executor.getClass();
        int intValue = ((Integer) ((ImageAnalysisConfig) this.mCurrentConfig).retrieveOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, 0)).intValue() == 1 ? ((Integer) ((ImageAnalysisConfig) this.mCurrentConfig).retrieveOption(ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, 6)).intValue() : 4;
        ProfileStore_ profileStore_ = null;
        if (imageAnalysisConfig.retrieveOption(ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, null) != null) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        ProfileStore_ profileStore_2 = new ProfileStore_(AnyUtilsKt.createIsolatedReader(size.getWidth(), size.getHeight(), this.mCurrentConfig.getInputFormat(), intValue));
        synchronized (this.mAnalysisLock) {
            recreateImageAnalysisAbstractAnalyzer();
            imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
        }
        if (getCamera() != null) {
            CameraInternal camera = getCamera();
            if (((Boolean) ((ImageAnalysisConfig) this.mCurrentConfig).retrieveOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.FALSE)).booleanValue() && getRelativeRotation(camera, false) % EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE != 0) {
                z = true;
                height = !z ? size.getHeight() : size.getWidth();
                width = !z ? size.getWidth() : size.getHeight();
                i = getOutputImageFormat() != 2 ? 1 : 35;
                z2 = this.mCurrentConfig.getInputFormat() != 35 && getOutputImageFormat() == 2;
                boolean z3 = this.mCurrentConfig.getInputFormat() != 35 && getOutputImageFormat() == 3;
                boolean z4 = this.mCurrentConfig.getInputFormat() != 35 && (!(getCamera() == null || getRelativeRotation(getCamera(), false) == 0) || Boolean.TRUE.equals((Boolean) ((ImageAnalysisConfig) this.mCurrentConfig).retrieveOption(ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, null)));
                if (!z2 || (z4 && !z3)) {
                    profileStore_ = new ProfileStore_(AnyUtilsKt.createIsolatedReader(height, width, i, profileStore_2.getMaxImages()));
                }
                if (profileStore_ != null) {
                    synchronized (imageAnalysisAbstractAnalyzer.mAnalyzerLock) {
                        imageAnalysisAbstractAnalyzer.mProcessedImageReaderProxy = profileStore_;
                    }
                }
                tryUpdateRelativeRotation();
                profileStore_2.setOnImageAvailableListener(imageAnalysisAbstractAnalyzer, executor);
                SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(imageAnalysisConfig, autoValue_StreamSpec.resolution);
                config = autoValue_StreamSpec.implementationOptions;
                if (config != null) {
                    createFrom.mCaptureConfigBuilder.addImplementationOptions(config);
                }
                anonymousClass2 = this.mDeferrableSurface;
                if (anonymousClass2 != null) {
                    anonymousClass2.close();
                }
                SurfaceRequest.AnonymousClass2 anonymousClass22 = new SurfaceRequest.AnonymousClass2(profileStore_2.getSurface(), size, this.mCurrentConfig.getInputFormat());
                this.mDeferrableSurface = anonymousClass22;
                Futures.nonCancellationPropagating(anonymousClass22.mTerminationFuture).addListener(new CameraX$$ExternalSyntheticLambda2(8, profileStore_2, profileStore_), zzabp.mainThreadExecutor());
                createFrom.mSessionType = autoValue_StreamSpec.sessionType;
                applyExpectedFrameRateRange(createFrom, autoValue_StreamSpec);
                createFrom.addSurface(this.mDeferrableSurface, autoValue_StreamSpec.dynamicRange, -1);
                closeableErrorListener = this.mCloseableErrorListener;
                if (closeableErrorListener != null) {
                    closeableErrorListener.close();
                }
                SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new ImageAnalysis$$ExternalSyntheticLambda2(this, imageAnalysisAbstractAnalyzer, 0));
                this.mCloseableErrorListener = closeableErrorListener2;
                createFrom.mErrorListener = closeableErrorListener2;
                return createFrom;
            }
        }
        z = false;
        if (!z) {
        }
        if (!z) {
        }
        if (getOutputImageFormat() != 2) {
        }
        if (this.mCurrentConfig.getInputFormat() != 35) {
        }
        if (this.mCurrentConfig.getInputFormat() != 35) {
        }
        if (this.mCurrentConfig.getInputFormat() != 35) {
        }
        if (!z2) {
        }
        profileStore_ = new ProfileStore_(AnyUtilsKt.createIsolatedReader(height, width, i, profileStore_2.getMaxImages()));
        if (profileStore_ != null) {
        }
        tryUpdateRelativeRotation();
        profileStore_2.setOnImageAvailableListener(imageAnalysisAbstractAnalyzer, executor);
        SessionConfig.Builder createFrom2 = SessionConfig.Builder.createFrom(imageAnalysisConfig, autoValue_StreamSpec.resolution);
        config = autoValue_StreamSpec.implementationOptions;
        if (config != null) {
        }
        anonymousClass2 = this.mDeferrableSurface;
        if (anonymousClass2 != null) {
        }
        SurfaceRequest.AnonymousClass2 anonymousClass222 = new SurfaceRequest.AnonymousClass2(profileStore_2.getSurface(), size, this.mCurrentConfig.getInputFormat());
        this.mDeferrableSurface = anonymousClass222;
        Futures.nonCancellationPropagating(anonymousClass222.mTerminationFuture).addListener(new CameraX$$ExternalSyntheticLambda2(8, profileStore_2, profileStore_), zzabp.mainThreadExecutor());
        createFrom2.mSessionType = autoValue_StreamSpec.sessionType;
        applyExpectedFrameRateRange(createFrom2, autoValue_StreamSpec);
        createFrom2.addSurface(this.mDeferrableSurface, autoValue_StreamSpec.dynamicRange, -1);
        closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
        }
        SessionConfig.CloseableErrorListener closeableErrorListener22 = new SessionConfig.CloseableErrorListener(new ImageAnalysis$$ExternalSyntheticLambda2(this, imageAnalysisAbstractAnalyzer, 0));
        this.mCloseableErrorListener = closeableErrorListener22;
        createFrom2.mErrorListener = closeableErrorListener22;
        return createFrom2;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        DEFAULT_CONFIG.getClass();
        ImageAnalysisConfig imageAnalysisConfig = Defaults.DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(imageAnalysisConfig.getCaptureType(), 1);
        if (z) {
            config = Config.mergeConfigs(config, imageAnalysisConfig);
        }
        if (config == null) {
            return null;
        }
        return new ImageAnalysisConfig(OptionsBundle.from(((Preview.Builder) getUseCaseConfigBuilder(config)).mMutableConfig));
    }

    public final int getOutputImageFormat() {
        return ((Integer) ((ImageAnalysisConfig) this.mCurrentConfig).retrieveOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT, 1)).intValue();
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder getUseCaseConfigBuilder(Config config) {
        return new Preview.Builder(MutableOptionsBundle.from(config), 1);
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        synchronized (this.mAnalysisLock) {
        }
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
        StringUtilsKt.d("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + autoValue_StreamSpec + ", secondaryStreamSpec " + autoValue_StreamSpec2);
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) this.mCurrentConfig;
        getCameraId();
        SessionConfig.Builder createPipeline = createPipeline(imageAnalysisConfig, autoValue_StreamSpec);
        this.mSessionConfigBuilder = createPipeline;
        Object[] objArr = {createPipeline.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        return autoValue_StreamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        SurfaceRequest.AnonymousClass2 anonymousClass2 = this.mDeferrableSurface;
        if (anonymousClass2 != null) {
            anonymousClass2.close();
            this.mDeferrableSurface = null;
        }
        synchronized (this.mAnalysisLock) {
            ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
            imageAnalysisAbstractAnalyzer.mIsAttached = false;
            imageAnalysisAbstractAnalyzer.clearCache();
            this.mImageAnalysisAbstractAnalyzer = null;
        }
    }

    public final void recreateImageAnalysisAbstractAnalyzer() {
        Analyzer analyzer;
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) this.mCurrentConfig;
                if (((Integer) imageAnalysisConfig.retrieveOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, 0)).intValue() == 1) {
                    this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisBlockingAnalyzer();
                } else {
                    this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisNonBlockingAnalyzer((Executor) imageAnalysisConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, zzabp.highPriorityExecutor()));
                }
                this.mImageAnalysisAbstractAnalyzer.mOutputImageFormat = getOutputImageFormat();
                this.mImageAnalysisAbstractAnalyzer.mOutputImageRotationEnabled = ((Boolean) ((ImageAnalysisConfig) this.mCurrentConfig).retrieveOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.FALSE)).booleanValue();
                CameraInternal camera = getCamera();
                Boolean bool = (Boolean) ((ImageAnalysisConfig) this.mCurrentConfig).retrieveOption(ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, null);
                boolean contains = camera != null ? camera.getCameraInfoInternal().getCameraQuirks().contains(OnePixelShiftQuirk.class) : false;
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (bool != null) {
                    contains = bool.booleanValue();
                }
                imageAnalysisAbstractAnalyzer.mOnePixelShiftEnabled = contains;
                if (camera != null) {
                    this.mImageAnalysisAbstractAnalyzer.mRelativeRotation = getRelativeRotation(camera, false);
                }
                Rect rect = this.mViewPortCropRect;
                if (rect != null) {
                    this.mImageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
                }
                Matrix matrix = this.mSensorToBufferTransformMatrix;
                if (matrix != null) {
                    this.mImageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
                }
                Executor executor = this.mSubscribedAnalyzerExecutor;
                if (executor != null && (analyzer = this.mSubscribedAnalyzer) != null) {
                    this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, analyzer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setAnalyzer(Executor executor, Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setAnalyzer(executor, new StreamSharing$$ExternalSyntheticLambda1(analyzer, 6));
                }
                if (this.mSubscribedAnalyzer == null) {
                    this.mState = 1;
                    notifyState();
                }
                this.mSubscribedAnalyzerExecutor = executor;
                this.mSubscribedAnalyzer = analyzer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void setSensorToBufferTransformMatrix(Matrix matrix) {
        super.setSensorToBufferTransformMatrix(matrix);
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
                }
                this.mSensorToBufferTransformMatrix = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void setViewPortCropRect(Rect rect) {
        super.mViewPortCropRect = rect;
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
                }
                this.mViewPortCropRect = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return "ImageAnalysis:".concat(getName());
    }

    public final void tryUpdateRelativeRotation() {
        synchronized (this.mAnalysisLock) {
            try {
                CameraInternal camera = getCamera();
                if (camera != null) {
                    this.mImageAnalysisAbstractAnalyzer.mRelativeRotation = getRelativeRotation(camera, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
