package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import app.cash.badging.backend.RealBadger2$clear$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Camera2DeviceCache {
    public final LinkedHashMap camera2DeviceSetupWrapperCache;
    public final LinkedHashMap cameraDeviceSetupCache;
    public final Lazy cameraDeviceSetupCompatFactory$delegate;
    public final Provider cameraDeviceSetupCompatFactoryProvider;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final ReadonlySharedFlow cameraIds;
    public final Provider cameraManager;
    public final Object lock;
    public final int minimumCameraCount;
    public ArrayList openableCameras;
    public final ContextScope scope;
    public final Threads threads;

    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    public Camera2DeviceCache(Provider provider, Threads threads, Context context, PackageManager packageManager, Camera2ErrorProcessor camera2ErrorProcessor, Provider provider2, CameraPipeLifetime cameraPipeLifetime, Job job) {
        provider.getClass();
        threads.getClass();
        packageManager.getClass();
        camera2ErrorProcessor.getClass();
        provider2.getClass();
        cameraPipeLifetime.getClass();
        job.getClass();
        this.cameraManager = provider;
        this.threads = threads;
        this.cameraErrorListener = camera2ErrorProcessor;
        this.cameraDeviceSetupCompatFactoryProvider = provider2;
        ContextScope CoroutineScope = JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(new SupervisorJobImpl(job), threads.lightweightDispatcher).plus(new CoroutineName("Camera2DeviceCache")));
        this.scope = CoroutineScope;
        this.lock = new Object();
        this.cameraDeviceSetupCache = new LinkedHashMap();
        this.camera2DeviceSetupWrapperCache = new LinkedHashMap();
        int hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i = packageManager.hasSystemFeature("android.hardware.camera.front") ? hasSystemFeature + 1 : hasSystemFeature;
        this.minimumCameraCount = i;
        CameraState$Type$EnumUnboxingLocalUtility.m(i, "Camera2DeviceCache: Expected minimum camera count = ", "CXCP");
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new Preview$$ExternalSyntheticLambda0(this, 3));
        this.cameraIds = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.callbackFlow(new VirtualCameraState$connect$2$1(this, (Continuation) null, 11))), CoroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
        this.cameraDeviceSetupCompatFactory$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 9));
    }

    public static final void access$onCameraAvailabilityChanged(Camera2DeviceCache camera2DeviceCache, ProducerScope producerScope, String str, boolean z) {
        ArrayList arrayList;
        synchronized (camera2DeviceCache.lock) {
            arrayList = camera2DeviceCache.openableCameras;
        }
        ArrayList arrayList2 = null;
        if (!z) {
            if (!z) {
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((CameraId) it.next()).value, str)) {
                            }
                        }
                    }
                }
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayList2 = camera2DeviceCache.readCameraIds();
                break;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((CameraId) it2.next()).value, str)) {
                    break;
                }
            }
        }
        Log.i("CXCP", "New camera " + str + " detected");
        arrayList2 = camera2DeviceCache.readCameraIds();
        if (arrayList2 != null && (arrayList2.size() >= camera2DeviceCache.minimumCameraCount || arrayList == null)) {
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            sendCameraIdList(producerScope, arrayList);
        }
    }

    public static void sendCameraIdList(ProducerScope producerScope, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (ChannelsKt__ChannelsKt.trySendBlocking(arrayList, producerScope) instanceof ChannelResult.Failed) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: getOrInitializeDeviceSetupCompat-0r8Bogc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m67getOrInitializeDeviceSetupCompat0r8Bogc(String str, ContinuationImpl continuationImpl) {
        Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 camera2DeviceCache$getOrInitializeDeviceSetupCompat$1;
        int i;
        Deferred deferred;
        CameraDeviceSetupCompat cameraDeviceSetupCompat;
        if (continuationImpl instanceof Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1) {
            camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 = (Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1) continuationImpl;
            int i2 = camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Build.VERSION.SDK_INT < 35) {
                        return null;
                    }
                    synchronized (this.lock) {
                        try {
                            LinkedHashMap linkedHashMap = this.cameraDeviceSetupCache;
                            CameraId cameraId = new CameraId(str);
                            Object obj2 = linkedHashMap.get(cameraId);
                            if (obj2 == null) {
                                obj2 = JobKt.async$default(this.scope, this.threads.backgroundDispatcher, null, new RealBadger2$clear$2(str, this, continuation, 9), 2);
                                linkedHashMap.put(cameraId, obj2);
                            }
                            deferred = (Deferred) obj2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.L$0 = str;
                    camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.L$1 = deferred;
                    camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.label = 1;
                    obj = deferred.await(camera2DeviceCache$getOrInitializeDeviceSetupCompat$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Deferred deferred2 = camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.L$1;
                    String str2 = camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    deferred = deferred2;
                    str = str2;
                }
                cameraDeviceSetupCompat = (CameraDeviceSetupCompat) obj;
                if (cameraDeviceSetupCompat == null) {
                    return cameraDeviceSetupCompat;
                }
                Log.d("CXCP", "Removing null CameraDeviceSetupCompat from cache for " + ((Object) CameraId.m46toStringimpl(str)));
                synchronized (this.lock) {
                    this.cameraDeviceSetupCache.remove(new CameraId(str), deferred);
                }
                return cameraDeviceSetupCompat;
            }
        }
        camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 = new Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1(this, continuationImpl);
        Object obj3 = camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2DeviceCache$getOrInitializeDeviceSetupCompat$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        cameraDeviceSetupCompat = (CameraDeviceSetupCompat) obj3;
        if (cameraDeviceSetupCompat == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: getOrInitializeDeviceSetupWrapper-0r8Bogc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m68getOrInitializeDeviceSetupWrapper0r8Bogc(String str, ContinuationImpl continuationImpl) {
        Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1;
        int i;
        Deferred deferred;
        Camera2DeviceSetupWrapper camera2DeviceSetupWrapper;
        if (continuationImpl instanceof Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1) {
            camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 = (Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1) continuationImpl;
            int i2 = camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    synchronized (this.lock) {
                        try {
                            LinkedHashMap linkedHashMap = this.camera2DeviceSetupWrapperCache;
                            CameraId cameraId = new CameraId(str);
                            Object obj2 = linkedHashMap.get(cameraId);
                            if (obj2 == null) {
                                obj2 = JobKt.async$default(this.scope, this.threads.backgroundDispatcher, null, new Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1(str, this, null), 2);
                                linkedHashMap.put(cameraId, obj2);
                            }
                            deferred = (Deferred) obj2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.L$0 = str;
                    camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.L$1 = deferred;
                    camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.label = 1;
                    obj = deferred.await(camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Deferred deferred2 = camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.L$1;
                    String str2 = camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    deferred = deferred2;
                    str = str2;
                }
                camera2DeviceSetupWrapper = (Camera2DeviceSetupWrapper) obj;
                if (camera2DeviceSetupWrapper == null) {
                    return camera2DeviceSetupWrapper;
                }
                Log.d("CXCP", "Removing null camera2DeviceSetupWrapper from cache for " + ((Object) CameraId.m46toStringimpl(str)));
                synchronized (this.lock) {
                    this.camera2DeviceSetupWrapperCache.remove(new CameraId(str), deferred);
                }
                return camera2DeviceSetupWrapper;
            }
        }
        camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 = new Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1(this, continuationImpl);
        Object obj3 = camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1.label;
        if (i != 0) {
        }
        camera2DeviceSetupWrapper = (Camera2DeviceSetupWrapper) obj3;
        if (camera2DeviceSetupWrapper == null) {
        }
    }

    public final ArrayList readCameraIds() {
        try {
            String[] cameraIdList = ((CameraManager) this.cameraManager.get()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                str.getClass();
                CameraId.m45constructorimpl(str);
                arrayList.add(new CameraId(str));
            }
            if (arrayList.size() < this.minimumCameraCount) {
                Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
                return arrayList;
            }
            synchronized (this.lock) {
                this.openableCameras = arrayList;
            }
            Log.i("CXCP", "Loaded CameraIdList " + arrayList);
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
            return null;
        }
    }
}
