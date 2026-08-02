package androidx.camera.camera2.pipe.config;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraPipe$CameraInteropConfig;
import androidx.camera.camera2.pipe.CameraPipe$Config;
import androidx.camera.camera2.pipe.CameraPipe$ThreadConfig;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl;
import androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor;
import androidx.camera.camera2.pipe.compat.Camera2MetadataCache;
import androidx.camera.camera2.pipe.compat.Camera2MetadataProvider;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers;
import androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager;
import androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.camera2.pipe.core.AndroidThreads;
import androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda0;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.featurecombinationquery.Camera2CameraDeviceSetupCompatProvider;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import androidx.camera.video.Recorder;
import androidx.media3.common.util.LongArrayQueue;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.plaid.internal.EnumC0170g;
import com.stripe.hcaptcha.HCaptcha;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.flow.FlowKt;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DaggerCameraPipeComponent$CameraPipeComponentImpl {
    public final Provider audioRestrictionControllerImplProvider;
    public final SwitchingProvider camera2BackendProvider;
    public final Provider camera2DeviceCacheProvider;
    public final Provider camera2DeviceCloserImplProvider;
    public final Provider camera2ErrorProcessorProvider;
    public final Provider camera2MetadataCacheProvider;
    public final Provider camera2QuirksProvider;
    public final Provider cameraDevicesImplProvider;
    public final DaggerCameraPipeComponent$CameraPipeComponentImpl cameraPipeComponentImpl;
    public final Recorder.AnonymousClass6 cameraPipeConfigModule;
    public final Provider cameraPipeLifetimeProvider;
    public final Provider concurrentSessionSequencersProvider;
    public final Provider permissionsProvider;
    public final Provider provideCameraBackendsProvider;
    public final Provider provideCameraContextProvider;
    public final Provider provideCameraDeviceSetupCompatFactoryProvider;
    public final Provider provideCameraManagerProvider;
    public final Provider provideCameraPipeJobProvider;
    public final Provider provideCameraSurfaceManagerProvider;
    public final Provider provideDevicePolicyManagerWrapperProvider;
    public final Provider providePackageManagerProvider;
    public final Provider provideStrictModeProvider;
    public final Provider provideThreadsProvider;
    public final Provider pruningCamera2DeviceManagerProvider;
    public final Provider retryingCameraStateOpenerImplProvider;
    public final Provider systemTimeSourceProvider;
    public final LongArrayQueue threadConfigModule;

    public final class SwitchingProvider implements Provider {
        public final DaggerCameraPipeComponent$CameraPipeComponentImpl cameraPipeComponentImpl;
        public final int id;

        public SwitchingProvider(DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl, int i) {
            this.cameraPipeComponentImpl = daggerCameraPipeComponent$CameraPipeComponentImpl;
            this.id = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v32 */
        @Override // javax.inject.Provider
        public final Object get() {
            String string2;
            int i = 8;
            int i2 = 0;
            Camera2CameraDeviceSetupCompatProvider camera2CameraDeviceSetupCompatProvider = 0;
            camera2CameraDeviceSetupCompatProvider = 0;
            camera2CameraDeviceSetupCompatProvider = 0;
            DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl = this.cameraPipeComponentImpl;
            int i3 = this.id;
            switch (i3) {
                case 0:
                    return new CameraPipeLifetime((Job) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                case 1:
                    return JobKt.Job$default();
                case 2:
                    return new CameraDevicesImpl((CameraBackendsImpl) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraBackendsProvider.get());
                case 3:
                    CameraPipe$Config cameraPipe$Config = (CameraPipe$Config) daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeConfigModule.this$0;
                    SwitchingProvider switchingProvider = daggerCameraPipeComponent$CameraPipeComponentImpl.camera2BackendProvider;
                    Context cameraPipeContextContext = daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext();
                    Threads threads = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                    CameraPipeLifetime cameraPipeLifetime = (CameraPipeLifetime) daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeLifetimeProvider.get();
                    switchingProvider.getClass();
                    threads.getClass();
                    cameraPipeLifetime.getClass();
                    DispatchingAndroidInjector dispatchingAndroidInjector = cameraPipe$Config.cameraBackendConfig;
                    dispatchingAndroidInjector.getClass();
                    Map map = dispatchingAndroidInjector.injectorFactories;
                    try {
                        Trace.beginSection("Initialize defaultCameraBackend");
                        Camera2Backend camera2Backend = (Camera2Backend) switchingProvider.get();
                        Trace.endSection();
                        if (map.containsKey(new CameraBackendId("CXCP-Camera2"))) {
                            Handlers$$ExternalSyntheticBUOutline0.m("CameraBackendConfig#cameraBackends should not contain a backend with ", CameraBackendId.m41toStringimpl("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.");
                            return null;
                        }
                        Map plus = MapsKt__MapsKt.plus(map, new Pair(new CameraBackendId("CXCP-Camera2"), new CameraPipeModule$Companion$$ExternalSyntheticLambda0(camera2Backend)));
                        if (plus.containsKey(new CameraBackendId("CXCP-Camera2"))) {
                            return new CameraBackendsImpl("CXCP-Camera2", plus, cameraPipeContextContext, threads, cameraPipeLifetime);
                        }
                        StringBuilder sb = new StringBuilder("Failed to find ");
                        sb.append((Object) CameraBackendId.m41toStringimpl("CXCP-Camera2"));
                        ZslControlImpl$$ExternalSyntheticLambda1.m(sb, " in the list of available CameraPipe backends! Available values are ", plus.keySet());
                        return null;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                case 4:
                    return new Camera2Backend((Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get(), (Camera2DeviceCache) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2DeviceCacheProvider.get(), (Camera2MetadataCache) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2MetadataCacheProvider.get(), (PruningCamera2DeviceManager) daggerCameraPipeComponent$CameraPipeComponentImpl.pruningCamera2DeviceManagerProvider.get(), new BiometricPrompt(daggerCameraPipeComponent$CameraPipeComponentImpl, i), daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext());
                case 5:
                    LongArrayQueue longArrayQueue = daggerCameraPipeComponent$CameraPipeComponentImpl.threadConfigModule;
                    CameraPipeLifetime cameraPipeLifetime2 = (CameraPipeLifetime) daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeLifetimeProvider.get();
                    Job job = (Job) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraPipeJobProvider.get();
                    int i4 = longArrayQueue.wrapAroundMask;
                    cameraPipeLifetime2.getClass();
                    job.getClass();
                    ArrayList arrayList = new ArrayList();
                    ((CameraPipe$ThreadConfig) longArrayQueue.data).getClass();
                    ThreadFactory threadFactory = AndroidThreads.factory;
                    ScheduledExecutorService asScheduledThreadPool = AndroidThreads.asScheduledThreadPool(new AndroidThreads$$ExternalSyntheticLambda0(i4, AndroidThreads.withPrefix(threadFactory, "CXCP-IO-")), 8);
                    arrayList.add(asScheduledThreadPool);
                    CoroutineDispatcher from = JobKt.from(asScheduledThreadPool);
                    ScheduledExecutorService asScheduledThreadPool2 = AndroidThreads.asScheduledThreadPool(new AndroidThreads$$ExternalSyntheticLambda0(i4, AndroidThreads.withPrefix(threadFactory, "CXCP-BG-")), longArrayQueue.tailIndex);
                    arrayList.add(asScheduledThreadPool2);
                    CoroutineDispatcher from2 = JobKt.from(asScheduledThreadPool2);
                    ScheduledExecutorService asScheduledThreadPool3 = AndroidThreads.asScheduledThreadPool(new AndroidThreads$$ExternalSyntheticLambda0(longArrayQueue.size, AndroidThreads.withPrefix(threadFactory, "CXCP-")), longArrayQueue.headIndex);
                    arrayList.add(asScheduledThreadPool3);
                    CoroutineDispatcher from3 = JobKt.from(asScheduledThreadPool3);
                    cameraPipeLifetime2.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new Preview$$ExternalSyntheticLambda0(arrayList, 4));
                    ThreadConfigModule$$ExternalSyntheticLambda1 threadConfigModule$$ExternalSyntheticLambda1 = new ThreadConfigModule$$ExternalSyntheticLambda1(longArrayQueue, cameraPipeLifetime2, i2);
                    ThreadConfigModule$$ExternalSyntheticLambda1 threadConfigModule$$ExternalSyntheticLambda12 = new ThreadConfigModule$$ExternalSyntheticLambda1(longArrayQueue, cameraPipeLifetime2, 1);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef.element = JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(new SupervisorJobImpl(job), from3).plus(new CoroutineName("CXCP")));
                    ref$ObjectRef2.element = JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(new SupervisorJobImpl(job), new CoroutineName("CXCP-Dispatch")));
                    cameraPipeLifetime2.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new CameraX$$ExternalSyntheticLambda2(6, ref$ObjectRef, ref$ObjectRef2));
                    return new Threads((CoroutineScope) ref$ObjectRef.element, (CoroutineScope) ref$ObjectRef2.element, asScheduledThreadPool, from, asScheduledThreadPool2, from2, asScheduledThreadPool3, from3, threadConfigModule$$ExternalSyntheticLambda1, threadConfigModule$$ExternalSyntheticLambda12);
                case 6:
                    return new Camera2DeviceCache(daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraManagerProvider, (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get(), daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext(), (PackageManager) daggerCameraPipeComponent$CameraPipeComponentImpl.providePackageManagerProvider.get(), (Camera2ErrorProcessor) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2ErrorProcessorProvider.get(), daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraDeviceSetupCompatFactoryProvider, (CameraPipeLifetime) daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeLifetimeProvider.get(), (Job) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                case 7:
                    Object systemService = daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext().getSystemService("camera");
                    systemService.getClass();
                    return (CameraManager) systemService;
                case 8:
                    PackageManager packageManager = daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext().getPackageManager();
                    packageManager.getClass();
                    return packageManager;
                case 9:
                    return new Camera2ErrorProcessor();
                case 10:
                    Context cameraPipeContextContext2 = daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext();
                    CameraDeviceSetupCompatFactory cameraDeviceSetupCompatFactory = new CameraDeviceSetupCompatFactory();
                    if (Build.VERSION.SDK_INT >= 35) {
                        cameraDeviceSetupCompatFactory.mCamera2Provider = new Camera2CameraDeviceSetupCompatProvider(cameraPipeContextContext2);
                    }
                    try {
                        ServiceInfo[] serviceInfoArr = cameraPipeContextContext2.getPackageManager().getPackageInfo(cameraPipeContextContext2.getPackageName(), EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE).services;
                        if (serviceInfoArr != null) {
                            int length = serviceInfoArr.length;
                            String str = null;
                            while (i2 < length) {
                                Bundle bundle = serviceInfoArr[i2].metaData;
                                if (bundle != null && (string2 = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                    if (str != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        return null;
                                    }
                                    str = string2;
                                }
                                i2++;
                            }
                            if (str != null) {
                                try {
                                    camera2CameraDeviceSetupCompatProvider = (Camera2CameraDeviceSetupCompatProvider) Class.forName(str).getConstructor(Context.class).newInstance(cameraPipeContextContext2);
                                } catch (Exception e) {
                                    a$$ExternalSyntheticBUOutline0.m("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                                    return null;
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    cameraDeviceSetupCompatFactory.mPlayServicesProvider = camera2CameraDeviceSetupCompatProvider;
                    return cameraDeviceSetupCompatFactory;
                case 11:
                    Context cameraPipeContextContext3 = daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext();
                    Threads threads2 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                    Permissions permissions = (Permissions) daggerCameraPipeComponent$CameraPipeComponentImpl.permissionsProvider.get();
                    Recorder.AnonymousClass4 anonymousClass4 = ((CameraPipe$Config) daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeConfigModule.this$0).cameraMetadataConfig;
                    Preconditions.checkNotNullFromProvides(anonymousClass4);
                    return new Camera2MetadataCache(cameraPipeContextContext3, threads2, permissions, anonymousClass4, (SystemTimeSource) daggerCameraPipeComponent$CameraPipeComponentImpl.systemTimeSourceProvider.get());
                case 12:
                    return new Permissions(daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext());
                case 13:
                    return new SystemTimeSource();
                case 14:
                    return new PruningCamera2DeviceManager((Permissions) daggerCameraPipeComponent$CameraPipeComponentImpl.permissionsProvider.get(), (RetryingCameraStateOpenerImpl) daggerCameraPipeComponent$CameraPipeComponentImpl.retryingCameraStateOpenerImplProvider.get(), (Camera2DeviceCloserImpl) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2DeviceCloserImplProvider.get(), (Camera2ErrorProcessor) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2ErrorProcessorProvider.get(), (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get());
                case 15:
                    Provider provider = daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraManagerProvider;
                    Recorder.AnonymousClass6 anonymousClass6 = daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeConfigModule;
                    Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(provider, (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get());
                    Camera2MetadataProvider camera2MetadataProvider = (Camera2MetadataProvider) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2MetadataCacheProvider.get();
                    Camera2ErrorProcessor camera2ErrorProcessor = (Camera2ErrorProcessor) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2ErrorProcessorProvider.get();
                    Camera2Quirks camera2Quirks = (Camera2Quirks) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2QuirksProvider.get();
                    SystemTimeSource systemTimeSource = (SystemTimeSource) daggerCameraPipeComponent$CameraPipeComponentImpl.systemTimeSourceProvider.get();
                    CameraPipe$CameraInteropConfig cameraPipe$CameraInteropConfig = ((CameraPipe$Config) anonymousClass6.this$0).cameraInteropConfig;
                    Preconditions.checkNotNullFromProvides(cameraPipe$CameraInteropConfig);
                    Threads threads3 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                    camera2MetadataProvider.getClass();
                    camera2ErrorProcessor.getClass();
                    camera2Quirks.getClass();
                    systemTimeSource.getClass();
                    threads3.getClass();
                    HCaptcha hCaptcha = new HCaptcha();
                    hCaptcha.result = anonymousClass1;
                    hCaptcha.exception = camera2MetadataProvider;
                    hCaptcha.onSuccessListeners = camera2ErrorProcessor;
                    hCaptcha.onFailureListeners = camera2Quirks;
                    hCaptcha.onOpenListeners = systemTimeSource;
                    hCaptcha.handler = cameraPipe$CameraInteropConfig;
                    hCaptcha.internalConfig = threads3;
                    hCaptcha.captchaVerifier = new CompletableDeferredImpl();
                    Camera2ErrorProcessor camera2ErrorProcessor2 = (Camera2ErrorProcessor) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2ErrorProcessorProvider.get();
                    Provider provider2 = daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraManagerProvider;
                    Threads threads4 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                    Job job2 = (Job) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraPipeJobProvider.get();
                    provider2.getClass();
                    threads4.getClass();
                    job2.getClass();
                    UnleashContext unleashContext = new UnleashContext();
                    unleashContext.userId = provider2;
                    unleashContext.sessionId = threads4;
                    unleashContext.remoteAddress = job2;
                    unleashContext.properties = FlowKt.callbackFlow(new VirtualCameraState$connect$2$1(unleashContext, (Continuation) camera2CameraDeviceSetupCompatProvider, 9));
                    SystemTimeSource systemTimeSource2 = (SystemTimeSource) daggerCameraPipeComponent$CameraPipeComponentImpl.systemTimeSourceProvider.get();
                    AndroidDevicePolicyManagerWrapper androidDevicePolicyManagerWrapper = (AndroidDevicePolicyManagerWrapper) daggerCameraPipeComponent$CameraPipeComponentImpl.provideDevicePolicyManagerWrapperProvider.get();
                    AudioRestrictionControllerImpl audioRestrictionControllerImpl = (AudioRestrictionControllerImpl) daggerCameraPipeComponent$CameraPipeComponentImpl.audioRestrictionControllerImplProvider.get();
                    CameraPipe$CameraInteropConfig cameraPipe$CameraInteropConfig2 = ((CameraPipe$Config) anonymousClass6.this$0).cameraInteropConfig;
                    Preconditions.checkNotNullFromProvides(cameraPipe$CameraInteropConfig2);
                    return new RetryingCameraStateOpenerImpl(hCaptcha, camera2ErrorProcessor2, unleashContext, systemTimeSource2, androidDevicePolicyManagerWrapper, audioRestrictionControllerImpl, cameraPipe$CameraInteropConfig2, (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get());
                case 16:
                    return new Camera2Quirks((Camera2MetadataProvider) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2MetadataCacheProvider.get(), (StrictMode) daggerCameraPipeComponent$CameraPipeComponentImpl.provideStrictModeProvider.get());
                case 17:
                    Preconditions.checkNotNullFromProvides(((CameraPipe$Config) daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeConfigModule.this$0).flags);
                    return new StrictMode();
                case 18:
                    Object systemService2 = daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext().getSystemService("device_policy");
                    systemService2.getClass();
                    return new AndroidDevicePolicyManagerWrapper((DevicePolicyManager) systemService2);
                case 19:
                    return new AudioRestrictionControllerImpl((Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get(), (CameraPipeLifetime) daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeLifetimeProvider.get(), (Job) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                case 20:
                    return new Camera2DeviceCloserImpl((Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get(), (Camera2Quirks) daggerCameraPipeComponent$CameraPipeComponentImpl.camera2QuirksProvider.get(), (RetryingCameraStateOpenerImpl) daggerCameraPipeComponent$CameraPipeComponentImpl.retryingCameraStateOpenerImplProvider.get());
                case 21:
                    daggerCameraPipeComponent$CameraPipeComponentImpl.cameraPipeContextContext();
                    Threads threads5 = (Threads) daggerCameraPipeComponent$CameraPipeComponentImpl.provideThreadsProvider.get();
                    CameraBackendsImpl cameraBackendsImpl = (CameraBackendsImpl) daggerCameraPipeComponent$CameraPipeComponentImpl.provideCameraBackendsProvider.get();
                    threads5.getClass();
                    cameraBackendsImpl.getClass();
                    return new CameraPipeModule$Companion$provideCameraContext$1();
                case 22:
                    return new CameraSurfaceManager();
                case 23:
                    return new ConcurrentSessionSequencers();
                default:
                    throw new AssertionError(i3);
            }
        }
    }

    public DaggerCameraPipeComponent$CameraPipeComponentImpl(Recorder.AnonymousClass6 anonymousClass6, LongArrayQueue longArrayQueue) {
        Object obj = SingleCheck.UNINITIALIZED;
        this.cameraPipeComponentImpl = this;
        this.cameraPipeConfigModule = anonymousClass6;
        this.threadConfigModule = longArrayQueue;
        this.provideCameraPipeJobProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 1);
        this.cameraPipeLifetimeProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 0);
        this.provideThreadsProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 5);
        SwitchingProvider switchingProvider = new SwitchingProvider(this, 7);
        SingleCheck singleCheck = new SingleCheck();
        singleCheck.instance = obj;
        singleCheck.provider = switchingProvider;
        this.provideCameraManagerProvider = singleCheck;
        this.providePackageManagerProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 8);
        this.camera2ErrorProcessorProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 9);
        this.provideCameraDeviceSetupCompatFactoryProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 10);
        this.camera2DeviceCacheProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 6);
        this.permissionsProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 12);
        this.systemTimeSourceProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 13);
        this.camera2MetadataCacheProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 11);
        this.provideStrictModeProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 17);
        this.camera2QuirksProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 16);
        SwitchingProvider switchingProvider2 = new SwitchingProvider(this, 18);
        SingleCheck singleCheck2 = new SingleCheck();
        singleCheck2.instance = obj;
        singleCheck2.provider = switchingProvider2;
        this.provideDevicePolicyManagerWrapperProvider = singleCheck2;
        this.audioRestrictionControllerImplProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 19);
        this.retryingCameraStateOpenerImplProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 15);
        this.camera2DeviceCloserImplProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 20);
        this.pruningCamera2DeviceManagerProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 14);
        this.camera2BackendProvider = new SwitchingProvider(this, 4);
        this.provideCameraBackendsProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 3);
        this.cameraDevicesImplProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 2);
        this.provideCameraContextProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 21);
        this.provideCameraSurfaceManagerProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 22);
        this.concurrentSessionSequencersProvider = CameraState$Type$EnumUnboxingLocalUtility.m(this, 23);
    }

    public final Context cameraPipeContextContext() {
        Context context = ((CameraPipe$Config) this.cameraPipeConfigModule.this$0).appContext;
        Preconditions.checkNotNullFromProvides(context);
        return context;
    }
}
