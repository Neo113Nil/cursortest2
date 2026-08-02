package androidx.camera.camera2.config;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.CameraControlAdapter;
import androidx.camera.camera2.adapter.CameraControlStateAdapter;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.CameraInfoAdapter;
import androidx.camera.camera2.adapter.CameraInternalAdapter;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.adapter.ZslControlImpl;
import androidx.camera.camera2.compat.Camera2CameraControlCompatImpl;
import androidx.camera.camera2.compat.EvCompImpl;
import androidx.camera.camera2.compat.NoOpZoomCompat;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.State3AControl;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.impl.VideoUsageControl;
import androidx.camera.camera2.impl.ZoomControl;
import androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory;
import androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory;
import androidx.camera.camera2.pipe.compat.AndroidMSessionFactory;
import androidx.camera.camera2.pipe.compat.AndroidPSessionFactory;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor;
import androidx.camera.camera2.pipe.compat.Camera2MetadataProvider;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers;
import androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager;
import androidx.camera.camera2.pipe.config.CameraPipeModule$Companion$provideCameraContext$1;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent$CameraGraphComponentImpl;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent$CameraPipeComponentImpl;
import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.Controller3A;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.camera2.pipe.graph.GraphState3A;
import androidx.camera.camera2.pipe.graph.Listener3A;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.AutoValue_CameraThreadConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.Recorder;
import androidx.core.view.WindowCompat$Api35Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
import com.bumptech.glide.GlideBuilder$1;
import com.fillr.e0;
import com.fillr.n;
import com.nimbusds.jose.JWECryptoParts;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.serialization.internal.ClassValueCache;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class DaggerCameraAppComponent$CameraComponentImpl {
    public final Provider camera2CameraControlCompatImplProvider;
    public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
    public final Provider cameraCallbackMapProvider;
    public final n.a cameraConfig;
    public final Provider cameraControlAdapterProvider;
    public final Provider cameraControlStateAdapterProvider;
    public final Provider cameraGraphConfigProvider;
    public final Provider cameraInfoAdapterProvider;
    public final DelegateFactory cameraInternalAdapterProvider = new DelegateFactory();
    public final Provider cameraPipeCameraPropertiesProvider;
    public final Provider cameraQuirksProvider;
    public final Provider cameraStateAdapterProvider;
    public final Provider comboRequestListenerProvider;
    public final Provider evCompControlProvider;
    public final Provider evCompImplProvider;
    public final Provider flashControlProvider;
    public final Provider focusMeteringControlProvider;
    public final Provider intrinsicZoomCalculatorImplProvider;
    public final Provider lowLightBoostControlProvider;
    public final Provider outputSizesCorrectorProvider;
    public final Provider provideCamera2CameraControlProvider;
    public final Provider provideCameraIdStringProvider;
    public final Provider provideCameraMetadataProvider;
    public final Provider provideEncoderProfilesProvider;
    public final Provider provideStreamConfigurationMapProvider;
    public final Provider provideUseCaseThreadsProvider;
    public final Provider provideZslControlProvider;
    public final Provider state3AControlProvider;
    public final Provider stillCaptureRequestControlProvider;
    public final Provider streamConfigurationMapCompatProvider;
    public final Recorder.AnonymousClass1 streamSpecsCalculator;
    public final Provider torchControlProvider;
    public final Provider useCaseManagerProvider;
    public final Provider videoUsageControlProvider;
    public final Provider zoomControlProvider;

    public final class SwitchingProvider implements Provider {
        public final /* synthetic */ int $r8$classId;
        public final Object cameraAppComponentImpl;
        public final Object cameraComponentImpl;
        public final int id;

        public /* synthetic */ SwitchingProvider(Object obj, Object obj2, int i, int i2) {
            this.$r8$classId = i2;
            this.cameraAppComponentImpl = obj;
            this.cameraComponentImpl = obj2;
            this.id = i;
        }

        @Override // javax.inject.Provider
        public final Object get() {
            Object cameraInternalAdapter;
            Object useCaseManager;
            Object graphProcessorImpl;
            Object obj;
            int i = 6;
            int i2 = 4;
            int i3 = 2;
            int i4 = 0;
            int i5 = 1;
            switch (this.$r8$classId) {
                case 0:
                    DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl = (DaggerCameraAppComponent$CameraAppComponentImpl) this.cameraAppComponentImpl;
                    DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl = (DaggerCameraAppComponent$CameraComponentImpl) this.cameraComponentImpl;
                    int i6 = this.id;
                    switch (i6) {
                        case 0:
                            n.a aVar = daggerCameraAppComponent$CameraComponentImpl.cameraConfig;
                            aVar.getClass();
                            cameraInternalAdapter = new CameraInternalAdapter(aVar, (UseCaseManager) daggerCameraAppComponent$CameraComponentImpl.useCaseManagerProvider.get(), (CameraInfoInternal) daggerCameraAppComponent$CameraComponentImpl.cameraInfoAdapterProvider.get(), (CameraControlInternal) daggerCameraAppComponent$CameraComponentImpl.cameraControlAdapterProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get(), (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl.cameraStateAdapterProvider.get());
                            return cameraInternalAdapter;
                        case 1:
                            e0 e0Var = daggerCameraAppComponent$CameraAppComponentImpl.cameraAppConfig;
                            e0 e0Var2 = daggerCameraAppComponent$CameraAppComponentImpl.cameraAppConfig;
                            CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) e0Var.c;
                            Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                            CameraCoordinatorAdapter cameraCoordinatorAdapter = (CameraCoordinatorAdapter) e0Var2.f;
                            Preconditions.checkNotNullFromProvides(cameraCoordinatorAdapter);
                            Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(i2, daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl);
                            ZslControl zslControl = (ZslControl) daggerCameraAppComponent$CameraComponentImpl.provideZslControlProvider.get();
                            LowLightBoostControl lowLightBoostControl = (LowLightBoostControl) daggerCameraAppComponent$CameraComponentImpl.lowLightBoostControlProvider.get();
                            SetBuilder setBuilder = new SetBuilder();
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.evCompControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.flashControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.focusMeteringControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.state3AControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.stillCaptureRequestControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.torchControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.lowLightBoostControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.videoUsageControlProvider.get());
                            setBuilder.add(daggerCameraAppComponent$CameraComponentImpl.zoomControlProvider.get());
                            ArrayList arrayList = (ArrayList) setBuilder.contributions;
                            Set singleton = arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
                            Camera2CameraControl camera2CameraControl = (Camera2CameraControl) daggerCameraAppComponent$CameraComponentImpl.provideCamera2CameraControlProvider.get();
                            CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl.cameraStateAdapterProvider.get();
                            DelegateFactory delegateFactory = daggerCameraAppComponent$CameraComponentImpl.cameraInternalAdapterProvider;
                            Provider provider = daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider;
                            Provider provider2 = daggerCameraAppComponent$CameraComponentImpl.cameraInfoAdapterProvider;
                            EncoderProfilesProvider encoderProfilesProvider = (EncoderProfilesProvider) daggerCameraAppComponent$CameraComponentImpl.provideEncoderProfilesProvider.get();
                            CameraPipeCameraProperties cameraPipeCameraProperties = (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get();
                            CameraXConfig cameraXConfig = (CameraXConfig) e0Var2.h;
                            CameraGraphConfigProvider cameraGraphConfigProvider = (CameraGraphConfigProvider) daggerCameraAppComponent$CameraComponentImpl.cameraGraphConfigProvider.get();
                            Context context = (Context) e0Var2.a;
                            Preconditions.checkNotNullFromProvides(context);
                            Context context2 = (Context) e0Var2.a;
                            Preconditions.checkNotNullFromProvides(context2);
                            useCaseManager = new UseCaseManager(cameraPipeImpl, cameraCoordinatorAdapter, anonymousClass1, zslControl, lowLightBoostControl, singleton, camera2CameraControl, cameraStateAdapter, delegateFactory, provider, provider2, encoderProfilesProvider, cameraPipeCameraProperties, cameraXConfig, cameraGraphConfigProvider, context, DisplayInfoManager.Companion.getInstance(context2));
                            return useCaseManager;
                        case 2:
                            CameraPipeCameraProperties cameraPipeCameraProperties2 = (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get();
                            cameraPipeCameraProperties2.getClass();
                            return new ZslControlImpl(cameraPipeCameraProperties2);
                        case 3:
                            n.a aVar2 = daggerCameraAppComponent$CameraComponentImpl.cameraConfig;
                            aVar2.getClass();
                            return new CameraPipeCameraProperties(aVar2, (CameraMetadata) daggerCameraAppComponent$CameraComponentImpl.provideCameraMetadataProvider.get());
                        case 4:
                            CameraPipeImpl cameraPipeImpl2 = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl.cameraAppConfig.c;
                            Preconditions.checkNotNullFromProvides(cameraPipeImpl2);
                            n.a aVar3 = daggerCameraAppComponent$CameraComponentImpl.cameraConfig;
                            aVar3.getClass();
                            try {
                                return CameraDevicesImpl.m93awaitCameraMetadataFpsL5FU$default(cameraPipeImpl2.cameras(), aVar3.b);
                            } catch (DoNotDisturbException unused) {
                                if (!StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                    return null;
                                }
                                Log.e("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                                return null;
                            }
                        case 5:
                            return new LowLightBoostControl((CameraMetadata) daggerCameraAppComponent$CameraComponentImpl.provideCameraMetadataProvider.get(), (State3AControl) daggerCameraAppComponent$CameraComponentImpl.state3AControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get(), (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl.comboRequestListenerProvider.get());
                        case 6:
                            CameraPipeCameraProperties cameraPipeCameraProperties3 = (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get();
                            CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl.cameraQuirksProvider.get();
                            cameraQuirks.getClass();
                            return new State3AControl(cameraPipeCameraProperties3, (DeviceQuirks.getAll().get(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !cameraQuirks.getQuirks().contains(ImageCaptureFailWithAutoFlashQuirk.class)) ? TargetAspectRatio.INSTANCE$2 : TargetAspectRatio.INSTANCE, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get());
                        case 7:
                            return new CameraQuirks((CameraMetadata) daggerCameraAppComponent$CameraComponentImpl.provideCameraMetadataProvider.get(), (StreamConfigurationMapCompat) daggerCameraAppComponent$CameraComponentImpl.streamConfigurationMapCompatProvider.get());
                        case 8:
                            return new StreamConfigurationMapCompat((StreamConfigurationMap) daggerCameraAppComponent$CameraComponentImpl.provideStreamConfigurationMapProvider.get(), (OutputSizesCorrector) daggerCameraAppComponent$CameraComponentImpl.outputSizesCorrectorProvider.get());
                        case 9:
                            CameraMetadata cameraMetadata = (CameraMetadata) daggerCameraAppComponent$CameraComponentImpl.provideCameraMetadataProvider.get();
                            if (cameraMetadata == null) {
                                return null;
                            }
                            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                            key.getClass();
                            return (StreamConfigurationMap) ((Camera2CameraMetadata) cameraMetadata).get(key);
                        case 10:
                            CameraMetadata cameraMetadata2 = (CameraMetadata) daggerCameraAppComponent$CameraComponentImpl.provideCameraMetadataProvider.get();
                            return new OutputSizesCorrector(cameraMetadata2);
                        case 11:
                            n.a aVar4 = daggerCameraAppComponent$CameraComponentImpl.cameraConfig;
                            aVar4.getClass();
                            AutoValue_CameraThreadConfig autoValue_CameraThreadConfig = (AutoValue_CameraThreadConfig) daggerCameraAppComponent$CameraAppComponentImpl.cameraAppConfig.b;
                            Preconditions.checkNotNullFromProvides(autoValue_CameraThreadConfig);
                            Executor executor = autoValue_CameraThreadConfig.cameraExecutor;
                            executor.getClass();
                            CoroutineDispatcher from = JobKt.from(executor);
                            useCaseManager = new UseCaseThreads(JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(JobKt.SupervisorJob$default(), from).plus(new CoroutineName("CXCP-UseCase-" + aVar4.b))), executor, from);
                            return useCaseManager;
                        case 12:
                            return new ComboRequestListener();
                        case 13:
                            return new EvCompControl((EvCompImpl) daggerCameraAppComponent$CameraComponentImpl.evCompImplProvider.get());
                        case 14:
                            return new EvCompImpl((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get(), (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl.comboRequestListenerProvider.get());
                        case 15:
                            CameraPipeCameraProperties cameraPipeCameraProperties4 = (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get();
                            State3AControl state3AControl = (State3AControl) daggerCameraAppComponent$CameraComponentImpl.state3AControlProvider.get();
                            UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get();
                            TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl.torchControlProvider.get();
                            CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl.cameraQuirksProvider.get();
                            cameraQuirks2.getClass();
                            cameraInternalAdapter = new FlashControl(cameraPipeCameraProperties4, state3AControl, useCaseThreads, torchControl, cameraQuirks2.getQuirks().contains(TorchFlashRequiredFor3aUpdateQuirk.class) ? TargetAspectRatio.INSTANCE$8 : TargetAspectRatio.INSTANCE$6);
                            return cameraInternalAdapter;
                        case 16:
                            return new TorchControl((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (State3AControl) daggerCameraAppComponent$CameraComponentImpl.state3AControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get());
                        case 17:
                            CameraPipeCameraProperties cameraPipeCameraProperties5 = (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get();
                            CameraQuirks cameraQuirks3 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl.cameraQuirksProvider.get();
                            cameraQuirks3.getClass();
                            useCaseManager = new FocusMeteringControl(cameraPipeCameraProperties5, cameraQuirks3.getQuirks().contains(AfRegionFlipHorizontallyQuirk.class) ? TargetAspectRatio.INSTANCE$1 : TargetAspectRatio.INSTANCE$4, (State3AControl) daggerCameraAppComponent$CameraComponentImpl.state3AControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl.zoomCompat());
                            return useCaseManager;
                        case 18:
                            return new StillCaptureRequestControl((FlashControl) daggerCameraAppComponent$CameraComponentImpl.flashControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get());
                        case 19:
                            return new VideoUsageControl();
                        case 20:
                            return new ZoomControl(daggerCameraAppComponent$CameraComponentImpl.zoomCompat());
                        case 21:
                            Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = (Camera2CameraControlCompatImpl) daggerCameraAppComponent$CameraComponentImpl.camera2CameraControlCompatImplProvider.get();
                            UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get();
                            ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl.comboRequestListenerProvider.get();
                            camera2CameraControlCompatImpl.getClass();
                            useCaseThreads2.getClass();
                            comboRequestListener.getClass();
                            useCaseManager = new Camera2CameraControl(camera2CameraControlCompatImpl, useCaseThreads2, comboRequestListener);
                            return useCaseManager;
                        case 22:
                            return new Camera2CameraControlCompatImpl();
                        case 23:
                            return new CameraStateAdapter();
                        case 24:
                            CameraPipeCameraProperties cameraPipeCameraProperties6 = (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get();
                            n.a aVar5 = daggerCameraAppComponent$CameraComponentImpl.cameraConfig;
                            aVar5.getClass();
                            return new CameraInfoAdapter(cameraPipeCameraProperties6, aVar5, (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl.cameraStateAdapterProvider.get(), (CameraControlStateAdapter) daggerCameraAppComponent$CameraComponentImpl.cameraControlStateAdapterProvider.get(), (CameraCallbackMap) daggerCameraAppComponent$CameraComponentImpl.cameraCallbackMapProvider.get(), (FocusMeteringControl) daggerCameraAppComponent$CameraComponentImpl.focusMeteringControlProvider.get(), (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl.cameraQuirksProvider.get(), (EncoderProfilesProvider) daggerCameraAppComponent$CameraComponentImpl.provideEncoderProfilesProvider.get(), (StreamConfigurationMapCompat) daggerCameraAppComponent$CameraComponentImpl.streamConfigurationMapCompatProvider.get(), (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl.intrinsicZoomCalculatorImplProvider.get(), daggerCameraAppComponent$CameraComponentImpl.streamSpecsCalculator);
                        case 25:
                            return new CameraControlStateAdapter((ZoomControl) daggerCameraAppComponent$CameraComponentImpl.zoomControlProvider.get(), (EvCompControl) daggerCameraAppComponent$CameraComponentImpl.evCompControlProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl.torchControlProvider.get(), (LowLightBoostControl) daggerCameraAppComponent$CameraComponentImpl.lowLightBoostControlProvider.get());
                        case 26:
                            return new CameraCallbackMap();
                        case 27:
                            String str = (String) daggerCameraAppComponent$CameraComponentImpl.provideCameraIdStringProvider.get();
                            CameraQuirks cameraQuirks4 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl.cameraQuirksProvider.get();
                            str.getClass();
                            cameraQuirks4.getClass();
                            return new EncoderProfilesProviderAdapter(str, cameraQuirks4.getQuirks());
                        case 28:
                            n.a aVar6 = daggerCameraAppComponent$CameraComponentImpl.cameraConfig;
                            aVar6.getClass();
                            String str2 = aVar6.b;
                            Preconditions.checkNotNullFromProvides(str2);
                            return str2;
                        case 29:
                            return new IntrinsicZoomCalculatorImpl(daggerCameraAppComponent$CameraAppComponentImpl.getCameraDevices());
                        case 30:
                            CameraCallbackMap cameraCallbackMap = (CameraCallbackMap) daggerCameraAppComponent$CameraComponentImpl.cameraCallbackMapProvider.get();
                            ComboRequestListener comboRequestListener2 = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl.comboRequestListenerProvider.get();
                            n.a aVar7 = daggerCameraAppComponent$CameraComponentImpl.cameraConfig;
                            aVar7.getClass();
                            CameraQuirks cameraQuirks5 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl.cameraQuirksProvider.get();
                            ZslControl zslControl2 = (ZslControl) daggerCameraAppComponent$CameraComponentImpl.provideZslControlProvider.get();
                            TemplateParamsOverride templateParamsOverride = daggerCameraAppComponent$CameraComponentImpl.templateParamsOverride();
                            CameraMetadata cameraMetadata3 = (CameraMetadata) daggerCameraAppComponent$CameraComponentImpl.provideCameraMetadataProvider.get();
                            e0 e0Var3 = daggerCameraAppComponent$CameraAppComponentImpl.cameraAppConfig;
                            CameraXConfig cameraXConfig2 = (CameraXConfig) e0Var3.h;
                            Recorder.AnonymousClass1 anonymousClass12 = (Recorder.AnonymousClass1) e0Var3.i;
                            Preconditions.checkNotNullFromProvides(anonymousClass12);
                            useCaseManager = new CameraGraphConfigProvider(cameraCallbackMap, comboRequestListener2, aVar7, cameraQuirks5, zslControl2, templateParamsOverride, cameraMetadata3, cameraXConfig2, anonymousClass12);
                            return useCaseManager;
                        case 31:
                            return new CameraControlAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (EvCompControl) daggerCameraAppComponent$CameraComponentImpl.evCompControlProvider.get(), (FlashControl) daggerCameraAppComponent$CameraComponentImpl.flashControlProvider.get(), (FocusMeteringControl) daggerCameraAppComponent$CameraComponentImpl.focusMeteringControlProvider.get(), (StillCaptureRequestControl) daggerCameraAppComponent$CameraComponentImpl.stillCaptureRequestControlProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl.torchControlProvider.get(), (LowLightBoostControl) daggerCameraAppComponent$CameraComponentImpl.lowLightBoostControlProvider.get(), (ZoomControl) daggerCameraAppComponent$CameraComponentImpl.zoomControlProvider.get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl.provideZslControlProvider.get(), (Camera2CameraControl) daggerCameraAppComponent$CameraComponentImpl.provideCamera2CameraControlProvider.get(), (UseCaseManager) daggerCameraAppComponent$CameraComponentImpl.useCaseManagerProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl.provideUseCaseThreadsProvider.get(), (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl.videoUsageControlProvider.get());
                        default:
                            throw new AssertionError(i6);
                    }
                case 1:
                    DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl = (DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl;
                    RequestQueue requestQueue = (RequestQueue) this.cameraComponentImpl;
                    e0 e0Var4 = (e0) requestQueue.mSequenceGenerator;
                    int i7 = this.id;
                    switch (i7) {
                        case 0:
                            CoroutineScope coroutineScope = (CoroutineScope) ((Provider) requestQueue.mCacheQueue).get();
                            Threads threads = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                            StrictMode strictMode = (StrictMode) daggerCameraPipeComponent$CameraPipeComponentImpl.provideStrictModeProvider.get();
                            CameraGraph$Config cameraGraph$Config = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config);
                            GraphProcessorImpl graphProcessorImpl2 = (GraphProcessorImpl) e0Var4.c;
                            SurfaceGraph surfaceGraph = (SurfaceGraph) e0Var4.f;
                            Camera2CameraStatusMonitor camera2CameraStatusMonitor = (Camera2CameraStatusMonitor) ((Provider) requestQueue.mNetworkQueue).get();
                            CaptureSessionFactory captureSessionFactory = (CaptureSessionFactory) ((Provider) requestQueue.mFinishedListeners).get();
                            DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl2 = (DaggerCameraPipeComponent$CameraPipeComponentImpl) requestQueue.mCurrentRequests;
                            Threads threads2 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl2.provideThreadsProvider.get();
                            CameraGraph$Config cameraGraph$Config2 = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config2);
                            StreamGraphImpl streamGraphImpl = (StreamGraphImpl) e0Var4.i;
                            Camera2Quirks camera2Quirks = (Camera2Quirks) daggerCameraPipeComponent$CameraPipeComponentImpl2.camera2QuirksProvider.get();
                            StrictMode strictMode2 = (StrictMode) daggerCameraPipeComponent$CameraPipeComponentImpl2.provideStrictModeProvider.get();
                            threads2.getClass();
                            cameraGraph$Config2.getClass();
                            camera2Quirks.getClass();
                            strictMode2.getClass();
                            JWECryptoParts jWECryptoParts = new JWECryptoParts();
                            jWECryptoParts.header = threads2;
                            jWECryptoParts.encryptedKey = cameraGraph$Config2;
                            jWECryptoParts.iv = streamGraphImpl;
                            jWECryptoParts.cipherText = camera2Quirks;
                            jWECryptoParts.authenticationTag = strictMode2;
                            return new Camera2CameraController(coroutineScope, threads, strictMode, cameraGraph$Config, graphProcessorImpl2, surfaceGraph, camera2CameraStatusMonitor, captureSessionFactory, jWECryptoParts, (PruningCamera2DeviceManager) daggerCameraPipeComponent$CameraPipeComponentImpl.pruningCamera2DeviceManagerProvider.get(), (CameraSurfaceManager) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraSurfaceManagerProvider.get(), (Camera2Quirks) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2QuirksProvider.get(), (SystemTimeSource) daggerCameraPipeComponent$CameraPipeComponentImpl.systemTimeSourceProvider.get(), (CameraGraphId) e0Var4.a, (Camera2Backend) e0Var4.h, (StreamGraphImpl) e0Var4.i, (ConcurrentSessionSequencers) daggerCameraPipeComponent$CameraPipeComponentImpl.concurrentSessionSequencersProvider.get());
                        case 1:
                            Threads threads3 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                            Job job = (Job) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraPipeJobProvider.get();
                            threads3.getClass();
                            job.getClass();
                            return JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(new SupervisorJobImpl(job), threads3.lightweightDispatcher.plus(new CoroutineName("CXCP-Camera2Controller"))));
                        case 2:
                            Provider provider3 = daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraManagerProvider;
                            Threads threads4 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                            CameraGraph$Config cameraGraph$Config3 = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config3);
                            Job job2 = (Job) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraPipeJobProvider.get();
                            provider3.getClass();
                            threads4.getClass();
                            job2.getClass();
                            return new Camera2CameraStatusMonitor(provider3, threads4, cameraGraph$Config3.camera, job2);
                        case 3:
                            SwitchingProvider switchingProvider = (SwitchingProvider) requestQueue.mCache;
                            SwitchingProvider switchingProvider2 = (SwitchingProvider) requestQueue.mNetwork;
                            SwitchingProvider switchingProvider3 = (SwitchingProvider) requestQueue.mDelivery;
                            SwitchingProvider switchingProvider4 = (SwitchingProvider) requestQueue.mDispatchers;
                            SwitchingProvider switchingProvider5 = (SwitchingProvider) requestQueue.mCacheDispatcher;
                            CameraGraph$Config cameraGraph$Config4 = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config4);
                            switchingProvider.getClass();
                            switchingProvider2.getClass();
                            switchingProvider3.getClass();
                            switchingProvider4.getClass();
                            switchingProvider5.getClass();
                            if (cameraGraph$Config4.sessionMode != 2) {
                                return (CaptureSessionFactory) switchingProvider4.get();
                            }
                            if (Build.VERSION.SDK_INT >= 31) {
                                return (CaptureSessionFactory) switchingProvider5.get();
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("Cannot use Extension sessions below Android S");
                            return null;
                        case 4:
                            Threads threads5 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                            StreamGraphImpl streamGraphImpl2 = (StreamGraphImpl) e0Var4.i;
                            CameraGraph$Config cameraGraph$Config5 = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config5);
                            return new AndroidMSessionFactory(threads5, streamGraphImpl2, cameraGraph$Config5, 0);
                        case 5:
                            return new AndroidMHighSpeedSessionFactory((StreamGraphImpl) e0Var4.i, (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get());
                        case 6:
                            Threads threads6 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                            StreamGraphImpl streamGraphImpl3 = (StreamGraphImpl) e0Var4.i;
                            CameraGraph$Config cameraGraph$Config6 = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config6);
                            return new AndroidMSessionFactory(threads6, streamGraphImpl3, cameraGraph$Config6, 1);
                        case 7:
                            Threads threads7 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                            CameraGraph$Config cameraGraph$Config7 = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config7);
                            return new AndroidPSessionFactory(threads7, cameraGraph$Config7, (StreamGraphImpl) e0Var4.i);
                        case 8:
                            Threads threads8 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                            CameraGraph$Config cameraGraph$Config8 = (CameraGraph$Config) e0Var4.b;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config8);
                            return new AndroidExtensionSessionFactory(threads8, cameraGraph$Config8, (StreamGraphImpl) e0Var4.i, (Camera2MetadataProvider) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2MetadataCacheProvider.get(), (StrictMode) daggerCameraPipeComponent$CameraPipeComponentImpl.provideStrictModeProvider.get());
                        default:
                            throw new AssertionError(i7);
                    }
                default:
                    int i8 = this.id;
                    int i9 = 3;
                    switch (i8) {
                        case 0:
                            CameraGraph$Config cameraGraph$Config9 = (CameraGraph$Config) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphConfigModule.val$audioErrorConsumer;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config9);
                            CameraMetadata cameraMetadata4 = (CameraMetadata) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraMetadataProvider.get();
                            GraphProcessorImpl graphProcessorImpl3 = (GraphProcessorImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphProcessorImplProvider.get();
                            GraphProcessorImpl graphProcessorImpl4 = (GraphProcessorImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphProcessorImplProvider.get();
                            StreamGraphImpl streamGraphImpl4 = (StreamGraphImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).streamGraphImplProvider.get();
                            SurfaceGraph surfaceGraph2 = (SurfaceGraph) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideSurfaceGraphProvider.get();
                            Camera2CameraController camera2CameraController = (Camera2CameraController) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraControllerProvider.get();
                            FrameDistributor frameDistributor = (FrameDistributor) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideFrameDistributorProvider.get();
                            FrameCaptureQueue frameCaptureQueue = (FrameCaptureQueue) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).frameCaptureQueueProvider.get();
                            AudioRestrictionControllerImpl audioRestrictionControllerImpl = (AudioRestrictionControllerImpl) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).audioRestrictionControllerImplProvider.get();
                            DaggerCameraPipeComponent$CameraGraphComponentImpl daggerCameraPipeComponent$CameraGraphComponentImpl = (DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl;
                            return new CameraGraphImpl(cameraGraph$Config9, cameraMetadata4, graphProcessorImpl3, graphProcessorImpl4, streamGraphImpl4, surfaceGraph2, camera2CameraController, frameDistributor, frameCaptureQueue, audioRestrictionControllerImpl, (CameraGraphId) daggerCameraPipeComponent$CameraGraphComponentImpl.cameraGraphConfigModule.this$0, (CameraGraphParametersImpl) daggerCameraPipeComponent$CameraGraphComponentImpl.cameraGraphParametersImplProvider.get(), (CameraGraphRequestListenersImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphRequestListenersImplProvider.get(), (GraphSessionLock) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphSessionLockProvider.get(), (CoroutineScope) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraGraphCoroutineScopeProvider.get(), (Controller3A) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).controller3AProvider.get());
                        case 1:
                            CameraGraph$Config cameraGraph$Config10 = (CameraGraph$Config) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphConfigModule.val$audioErrorConsumer;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config10);
                            Camera2Backend camera2Backend = (Camera2Backend) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraBackendProvider.get();
                            camera2Backend.getClass();
                            String str3 = cameraGraph$Config10.camera;
                            str3.getClass();
                            return camera2Backend.camera2MetadataCache.m72awaitCameraMetadataEfqyGwQ(str3);
                        case 2:
                            CameraBackendsImpl cameraBackendsImpl = (CameraBackendsImpl) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideCameraBackendsProvider.get();
                            Preconditions.checkNotNullFromProvides((CameraGraph$Config) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphConfigModule.val$audioErrorConsumer);
                            CameraPipeModule$Companion$provideCameraContext$1 cameraPipeModule$Companion$provideCameraContext$1 = (CameraPipeModule$Companion$provideCameraContext$1) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideCameraContextProvider.get();
                            cameraBackendsImpl.getClass();
                            cameraPipeModule$Companion$provideCameraContext$1.getClass();
                            Camera2Backend camera2Backend2 = cameraBackendsImpl.f1default;
                            Preconditions.checkNotNullFromProvides(camera2Backend2);
                            return camera2Backend2;
                        case 3:
                            Threads threads9 = (Threads) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideThreadsProvider.get();
                            Recorder.AnonymousClass4 anonymousClass4 = ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphConfigModule;
                            CameraGraphId cameraGraphId = (CameraGraphId) anonymousClass4.this$0;
                            CameraGraph$Config cameraGraph$Config11 = (CameraGraph$Config) anonymousClass4.val$audioErrorConsumer;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config11);
                            graphProcessorImpl = new GraphProcessorImpl(threads9, cameraGraphId, cameraGraph$Config11, (Listener3A) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).listener3AProvider.get(), (List) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideRequestListenersProvider.get(), (Camera2Quirks) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).camera2QuirksProvider.get());
                            return graphProcessorImpl;
                        case 4:
                            return new Listener3A();
                        case 5:
                            CameraGraph$Config cameraGraph$Config12 = (CameraGraph$Config) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphConfigModule.val$audioErrorConsumer;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config12);
                            Listener3A listener3A = (Listener3A) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).listener3AProvider.get();
                            FrameDistributor frameDistributor2 = (FrameDistributor) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideFrameDistributorProvider.get();
                            listener3A.getClass();
                            frameDistributor2.getClass();
                            ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(listener3A);
                            mutableListOf.add(listener3A);
                            mutableListOf.add(frameDistributor2);
                            mutableListOf.addAll(cameraGraph$Config12.defaultListeners);
                            obj = mutableListOf;
                            return obj;
                        case 6:
                            StreamGraphImpl streamGraphImpl5 = (StreamGraphImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).streamGraphImplProvider.get();
                            FrameCaptureQueue frameCaptureQueue2 = (FrameCaptureQueue) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).frameCaptureQueueProvider.get();
                            CameraMetadata cameraMetadata5 = (CameraMetadata) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraMetadataProvider.get();
                            SystemClockOffsets systemClockOffsets = (SystemClockOffsets) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideSystemClockOffsetsProvider.get();
                            streamGraphImpl5.getClass();
                            frameCaptureQueue2.getClass();
                            cameraMetadata5.getClass();
                            systemClockOffsets.getClass();
                            CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                            key2.getClass();
                            Integer num = (Integer) ((Camera2CameraMetadata) cameraMetadata5).get(key2);
                            if (num != null) {
                                num.intValue();
                            }
                            return new FrameDistributor(streamGraphImpl5, frameCaptureQueue2);
                        case 7:
                            CameraMetadata cameraMetadata6 = (CameraMetadata) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraMetadataProvider.get();
                            CameraGraph$Config cameraGraph$Config13 = (CameraGraph$Config) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphConfigModule.val$audioErrorConsumer;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config13);
                            ((Threads) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideThreadsProvider.get()).getClass();
                            graphProcessorImpl = new StreamGraphImpl(cameraMetadata6, cameraGraph$Config13, new GlideBuilder$1(), ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraControllerProvider);
                            return graphProcessorImpl;
                        case 8:
                            Recorder.AnonymousClass4 anonymousClass42 = ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).cameraGraphConfigModule;
                            CameraGraphId cameraGraphId2 = (CameraGraphId) anonymousClass42.this$0;
                            CameraGraph$Config cameraGraph$Config14 = (CameraGraph$Config) anonymousClass42.val$audioErrorConsumer;
                            Preconditions.checkNotNullFromProvides(cameraGraph$Config14);
                            Camera2Backend camera2Backend3 = (Camera2Backend) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraBackendProvider.get();
                            CameraPipeModule$Companion$provideCameraContext$1 cameraPipeModule$Companion$provideCameraContext$12 = (CameraPipeModule$Companion$provideCameraContext$1) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideCameraContextProvider.get();
                            GraphProcessorImpl graphProcessorImpl5 = (GraphProcessorImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphProcessorImplProvider.get();
                            StreamGraphImpl streamGraphImpl6 = (StreamGraphImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).streamGraphImplProvider.get();
                            SurfaceGraph surfaceGraph3 = (SurfaceGraph) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideSurfaceGraphProvider.get();
                            camera2Backend3.getClass();
                            cameraPipeModule$Companion$provideCameraContext$12.getClass();
                            graphProcessorImpl5.getClass();
                            streamGraphImpl6.getClass();
                            surfaceGraph3.getClass();
                            BiometricPrompt biometricPrompt = camera2Backend3.camera2CameraControllerComponent;
                            e0 e0Var5 = new e0(camera2Backend3, cameraGraphId2, cameraGraph$Config14, graphProcessorImpl5, streamGraphImpl6, surfaceGraph3, camera2Backend3);
                            DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl3 = (DaggerCameraPipeComponent$CameraPipeComponentImpl) biometricPrompt.mClientFragmentManager;
                            RequestQueue requestQueue2 = new RequestQueue();
                            requestQueue2.mCurrentRequests = daggerCameraPipeComponent$CameraPipeComponentImpl3;
                            requestQueue2.mSequenceGenerator = e0Var5;
                            requestQueue2.mCacheQueue = DoubleCheck.provider(new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, i5, i5));
                            requestQueue2.mNetworkQueue = DoubleCheck.provider(new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, i3, i5));
                            requestQueue2.mCache = new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, i2, i5);
                            requestQueue2.mNetwork = new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, 5, i5);
                            requestQueue2.mDelivery = new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, i, i5);
                            requestQueue2.mDispatchers = new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, 7, i5);
                            requestQueue2.mCacheDispatcher = new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, 8, i5);
                            requestQueue2.mFinishedListeners = DoubleCheck.provider(new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, i9, i5));
                            requestQueue2.mEventListeners = DoubleCheck.provider(new SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl3, requestQueue2, i4, i5));
                            Camera2CameraController camera2CameraController2 = (Camera2CameraController) ((Provider) requestQueue2.mEventListeners).get();
                            synchronized (camera2Backend3.lock) {
                                camera2Backend3.activeCameraControllers.add(camera2CameraController2);
                            }
                            Preconditions.checkNotNullFromProvides(camera2CameraController2);
                            return camera2CameraController2;
                        case 9:
                            StreamGraphImpl streamGraphImpl7 = (StreamGraphImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).streamGraphImplProvider.get();
                            DelegateFactory delegateFactory2 = ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraControllerProvider;
                            CameraSurfaceManager cameraSurfaceManager = (CameraSurfaceManager) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideCameraSurfaceManagerProvider.get();
                            streamGraphImpl7.getClass();
                            delegateFactory2.getClass();
                            cameraSurfaceManager.getClass();
                            obj = new SurfaceGraph(streamGraphImpl7, delegateFactory2, cameraSurfaceManager, streamGraphImpl7.imageSourceMap);
                            return obj;
                        case 10:
                            return new FrameCaptureQueue();
                        case 11:
                            long j = Long.MAX_VALUE;
                            long j2 = Long.MAX_VALUE;
                            for (int i10 = 0; i10 < 3; i10++) {
                                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                System.currentTimeMillis();
                                long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                                if (elapsedRealtimeNanos2 < j2) {
                                    j2 = elapsedRealtimeNanos2;
                                }
                            }
                            while (i4 < 3) {
                                long nanoTime = System.nanoTime();
                                SystemClock.elapsedRealtimeNanos();
                                long nanoTime2 = System.nanoTime() - nanoTime;
                                if (nanoTime2 < j) {
                                    j = nanoTime2;
                                }
                                i4++;
                            }
                            return new SystemClockOffsets();
                        case 12:
                            graphProcessorImpl = new CameraGraphParametersImpl((GraphSessionLock) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphSessionLockProvider.get(), (GraphProcessorImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphProcessorImplProvider.get(), (CoroutineScope) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraGraphCoroutineScopeProvider.get());
                            return graphProcessorImpl;
                        case 13:
                            return new GraphSessionLock();
                        case 14:
                            Threads threads10 = (Threads) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideThreadsProvider.get();
                            Job job3 = (Job) ((DaggerCameraPipeComponent$CameraPipeComponentImpl) this.cameraAppComponentImpl).provideCameraPipeJobProvider.get();
                            threads10.getClass();
                            job3.getClass();
                            return JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(new SupervisorJobImpl(job3), threads10.lightweightDispatcher.plus(new CoroutineName("CXCP-Graph"))));
                        case 15:
                            graphProcessorImpl = new CameraGraphRequestListenersImpl((GraphSessionLock) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphSessionLockProvider.get(), (GraphProcessorImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphProcessorImplProvider.get(), (CoroutineScope) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraGraphCoroutineScopeProvider.get());
                            return graphProcessorImpl;
                        case 16:
                            graphProcessorImpl = new Controller3A((GraphProcessorImpl) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphProcessorImplProvider.get(), (CameraMetadata) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).provideCameraMetadataProvider.get(), (GraphState3A) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).graphState3AProvider.get(), (Listener3A) ((DaggerCameraPipeComponent$CameraGraphComponentImpl) this.cameraComponentImpl).listener3AProvider.get());
                            return graphProcessorImpl;
                        case 17:
                            return new GraphState3A();
                        default:
                            throw new AssertionError(i8);
                    }
            }
        }
    }

    public DaggerCameraAppComponent$CameraComponentImpl(DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl, n.a aVar, Recorder.AnonymousClass1 anonymousClass1) {
        this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
        this.cameraConfig = aVar;
        this.streamSpecsCalculator = anonymousClass1;
        this.provideCameraMetadataProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 4);
        this.cameraPipeCameraPropertiesProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 3);
        this.provideZslControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 2);
        this.provideStreamConfigurationMapProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 9);
        this.outputSizesCorrectorProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 10);
        this.streamConfigurationMapCompatProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 8);
        this.cameraQuirksProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 7);
        this.provideUseCaseThreadsProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 11);
        this.state3AControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 6);
        this.comboRequestListenerProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 12);
        this.lowLightBoostControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 5);
        this.evCompImplProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 14);
        this.evCompControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 13);
        this.torchControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 16);
        this.flashControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 15);
        this.focusMeteringControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 17);
        this.stillCaptureRequestControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 18);
        this.videoUsageControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 19);
        this.zoomControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 20);
        this.camera2CameraControlCompatImplProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 22);
        this.provideCamera2CameraControlProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 21);
        this.cameraStateAdapterProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 23);
        this.cameraControlStateAdapterProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 25);
        this.cameraCallbackMapProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 26);
        this.provideCameraIdStringProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 28);
        this.provideEncoderProfilesProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 27);
        this.intrinsicZoomCalculatorImplProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 29);
        this.cameraInfoAdapterProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 24);
        this.cameraGraphConfigProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 30);
        this.useCaseManagerProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 1);
        this.cameraControlAdapterProvider = CameraState$Type$EnumUnboxingLocalUtility.m(daggerCameraAppComponent$CameraAppComponentImpl, this, 31);
        int i = 0;
        DelegateFactory.setDelegate(this.cameraInternalAdapterProvider, DoubleCheck.provider(new SwitchingProvider(daggerCameraAppComponent$CameraAppComponentImpl, this, i, i)));
    }

    public final TemplateParamsOverride templateParamsOverride() {
        CameraQuirks cameraQuirks = (CameraQuirks) this.cameraQuirksProvider.get();
        cameraQuirks.getClass();
        Quirks quirks = cameraQuirks.getQuirks();
        quirks.getClass();
        Iterator it = quirks.getAll(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                    break;
                }
            } else if (!quirks.contains(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
                return TargetAspectRatio.INSTANCE$5;
            }
        }
        return new SharedModule(quirks);
    }

    public final ZoomCompat zoomCompat() {
        Range controlZoomRatioRangeSafely;
        CameraPipeCameraProperties cameraPipeCameraProperties = (CameraPipeCameraProperties) this.cameraPipeCameraPropertiesProvider.get();
        cameraPipeCameraProperties.getClass();
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = NoOpZoomCompat.requiredCharacteristics;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                        Log.w("CXCP", "Failed to read " + key + " for zoom features.");
                    }
                    key.getClass();
                    if (((Camera2CameraMetadata) cameraMetadata).get(key) == null) {
                        return new NoOpZoomCompat(cameraPipeCameraProperties);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30 && (controlZoomRatioRangeSafely = WindowCompat$Api35Impl.getControlZoomRatioRangeSafely(cameraMetadata)) != null) {
            return new ClassValueCache(cameraPipeCameraProperties, controlZoomRatioRangeSafely);
        }
        return new Recorder.AnonymousClass3(cameraPipeCameraProperties);
    }
}
