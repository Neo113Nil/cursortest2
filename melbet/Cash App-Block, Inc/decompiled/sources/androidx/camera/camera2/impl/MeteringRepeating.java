package androidx.camera.camera2.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.compat.workaround.SupportedRepeatingSurfaceSizeKt;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda2;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class MeteringRepeating extends UseCase {
    public final CameraPipeCameraProperties cameraProperties;
    public SessionConfig.CloseableErrorListener closeableErrorListener;
    public SurfaceRequest.AnonymousClass2 deferrableSurface;
    public final Object deferrableSurfaceLock;
    public final DisplayInfoManager displayInfoManager;
    public final Size meteringSurfaceSize;

    public final class Builder implements UseCaseConfig.Builder {
        public DisplayInfoManager getInstance(Context context) {
            DisplayInfoManager displayInfoManager;
            context.getClass();
            DisplayInfoManager displayInfoManager2 = DisplayInfoManager.instance;
            if (displayInfoManager2 != null) {
                return displayInfoManager2;
            }
            synchronized (this) {
                displayInfoManager = DisplayInfoManager.instance;
                if (displayInfoManager == null) {
                    Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
                    persistentApplicationContext.getClass();
                    displayInfoManager = new DisplayInfoManager(persistentApplicationContext);
                    DisplayInfoManager.instance = displayInfoManager;
                }
            }
            return displayInfoManager;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableOptionsBundle getMutableConfig() {
            return MutableOptionsBundle.create();
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public UseCaseConfig getUseCaseConfig() {
            return new MeteringRepeatingConfig();
        }
    }

    public final class MeteringRepeatingConfig implements UseCaseConfig, ImageInputConfig {
        public final MutableOptionsBundle config;

        public MeteringRepeatingConfig() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, CameraUseCaseAdapter.DefaultSessionOptionsUnpacker.INSTANCE);
            create.insertOption(TargetConfig.OPTION_TARGET_NAME, "MeteringRepeating");
            create.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.METERING_REPEATING);
            this.config = create;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public final Config getConfig() {
            return this.config;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public final int getInputFormat() {
            return 34;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        r11 = r10[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MeteringRepeating(CameraPipeCameraProperties cameraPipeCameraProperties, MeteringRepeatingConfig meteringRepeatingConfig, DisplayInfoManager displayInfoManager) {
        super(meteringRepeatingConfig);
        Size[] outputSizes;
        Size[] sizeArr;
        cameraPipeCameraProperties.getClass();
        displayInfoManager.getClass();
        this.cameraProperties = cameraPipeCameraProperties;
        this.displayInfoManager = displayInfoManager;
        Size size = MeteringRepeatingKt.DEFAULT_PREVIEW_SIZE;
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((Camera2CameraMetadata) cameraMetadata).get(key);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                Log.e("CXCP", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = SupportedRepeatingSurfaceSizeKt.MINI_PREVIEW_SIZE_HUAWEI_MATE_9;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) DeviceQuirks.getAll().get(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (SupportedRepeatingSurfaceSizeKt.SIZE_COMPARATOR.compare(size4, SupportedRepeatingSurfaceSizeKt.MINI_PREVIEW_SIZE_HUAWEI_MATE_9) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length != 0) {
                outputSizes = sizeArr;
            } else if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "No supported output size list, fallback to current list");
            }
            if (outputSizes.length > 1) {
                MeteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1 meteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1 = new MeteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1();
                if (outputSizes.length > 1) {
                    Arrays.sort(outputSizes, meteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1);
                }
            }
            Size previewSize = displayInfoManager.getPreviewSize();
            long min = Math.min(307200L, previewSize.getWidth() * previewSize.getHeight());
            int length = outputSizes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size5 = outputSizes[i];
                long width = size5.getWidth() * size5.getHeight();
                if (width == min) {
                    size = size5;
                    break;
                } else if (width <= min) {
                    i++;
                    size2 = size5;
                }
            }
        }
        this.meteringSurfaceSize = size;
        this.deferrableSurfaceLock = new Object();
    }

    public final SurfaceRequest.AnonymousClass2 createAndManageDeferrableSurface(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SurfaceRequest.AnonymousClass2 anonymousClass2 = this.deferrableSurface;
        if (anonymousClass2 != null) {
            anonymousClass2.close();
        }
        SurfaceRequest.AnonymousClass2 anonymousClass22 = new SurfaceRequest.AnonymousClass2(surface, size, this.mCurrentConfig.getInputFormat());
        this.deferrableSurface = anonymousClass22;
        Futures.nonCancellationPropagating(anonymousClass22.mTerminationFuture).addListener(new CameraX$$ExternalSyntheticLambda2(4, surface, surfaceTexture), zzabp.directExecutor());
        return anonymousClass22;
    }

    public final SessionConfig.Builder createPipeline(Size size) {
        SurfaceRequest.AnonymousClass2 createAndManageDeferrableSurface;
        synchronized (this.deferrableSurfaceLock) {
            createAndManageDeferrableSurface = createAndManageDeferrableSurface(size);
        }
        SessionConfig.CloseableErrorListener closeableErrorListener = this.closeableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new ImageAnalysis$$ExternalSyntheticLambda2(this, size, 1));
        this.closeableErrorListener = closeableErrorListener2;
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(new MeteringRepeatingConfig(), size);
        createFrom.mCaptureConfigBuilder.state = 1;
        createFrom.addSurface(createAndManageDeferrableSurface, DynamicRange.SDR, -1);
        createFrom.mErrorListener = closeableErrorListener2;
        return createFrom;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        useCaseConfigFactory.getClass();
        this.cameraProperties.getClass();
        this.displayInfoManager.getClass();
        return new MeteringRepeatingConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder getUseCaseConfigBuilder(Config config) {
        config.getClass();
        this.cameraProperties.getClass();
        this.displayInfoManager.getClass();
        return new Builder();
    }

    @Override // androidx.camera.core.UseCase
    public final AutoValue_StreamSpec onSuggestedStreamSpecUpdated(AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2) {
        Size size = this.meteringSurfaceSize;
        updateSessionConfig(CollectionsKt__CollectionsJVMKt.listOf(createPipeline(size).build()));
        SubtreeManager builder = autoValue_StreamSpec.toBuilder();
        builder.snapshotCache = size;
        return builder.build();
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        SessionConfig.CloseableErrorListener closeableErrorListener = this.closeableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        this.closeableErrorListener = null;
        synchronized (this.deferrableSurfaceLock) {
            try {
                SurfaceRequest.AnonymousClass2 anonymousClass2 = this.deferrableSurface;
                if (anonymousClass2 != null) {
                    anonymousClass2.close();
                }
                this.deferrableSurface = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
