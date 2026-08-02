package androidx.camera.camera2.pipe.compat;

import android.util.Log;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.MutexToken;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$onAttach$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PruningCamera2DeviceManager {
    public final LinkedHashSet activeCameras;
    public final Camera2DeviceCloserImpl camera2DeviceCloser;
    public final Camera2ErrorProcessor camera2ErrorProcessor;
    public final ArrayList pendingRequestOpens;
    public final e0 queue;
    public final RetryingCameraStateOpenerImpl retryingCameraStateOpener;
    public final CoroutineScope scope;

    public interface OpenVirtualCameraResult {

        public final class Error implements OpenVirtualCameraResult {
            public final CameraError lastCameraError;

            public Error(CameraError cameraError) {
                this.lastCameraError = cameraError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.lastCameraError, ((Error) obj).lastCameraError);
            }

            public final int hashCode() {
                CameraError cameraError = this.lastCameraError;
                if (cameraError == null) {
                    return 0;
                }
                return Integer.hashCode(cameraError.value);
            }

            public final String toString() {
                return "Error(lastCameraError=" + this.lastCameraError + ')';
            }
        }

        public final class Success implements OpenVirtualCameraResult {
            public final ActiveCamera activeCamera;

            public Success(ActiveCamera activeCamera) {
                this.activeCamera = activeCamera;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.activeCamera == ((Success) obj).activeCamera;
            }

            public final int hashCode() {
                return this.activeCamera.hashCode();
            }

            public final String toString() {
                return "Success(activeCamera=" + this.activeCamera + ')';
            }
        }
    }

    public final class PendingRequestOpen {
        public final ActiveCamera activeCamera;
        public final RequestOpen request;
        public final MutexToken token;

        public PendingRequestOpen(RequestOpen requestOpen, ActiveCamera activeCamera, MutexToken mutexToken) {
            this.request = requestOpen;
            this.activeCamera = activeCamera;
            this.token = mutexToken;
        }
    }

    public interface RetrieveActiveCameraResult {

        public final class Error implements RetrieveActiveCameraResult {
            public final CameraError lastCameraError;

            public Error(CameraError cameraError) {
                this.lastCameraError = cameraError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.lastCameraError, ((Error) obj).lastCameraError);
            }

            public final int hashCode() {
                CameraError cameraError = this.lastCameraError;
                if (cameraError == null) {
                    return 0;
                }
                return Integer.hashCode(cameraError.value);
            }

            public final String toString() {
                return "Error(lastCameraError=" + this.lastCameraError + ')';
            }
        }

        public final class Success implements RetrieveActiveCameraResult {
            public final ActiveCamera activeCamera;
            public final MutexToken token;

            public Success(ActiveCamera activeCamera, MutexToken mutexToken) {
                this.activeCamera = activeCamera;
                this.token = mutexToken;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.activeCamera == success.activeCamera && this.token == success.token;
            }

            public final int hashCode() {
                return this.token.hashCode() + (this.activeCamera.hashCode() * 31);
            }

            public final String toString() {
                return "Success(activeCamera=" + this.activeCamera + ", token=" + this.token + ')';
            }
        }
    }

    public PruningCamera2DeviceManager(Permissions permissions, RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl, Camera2DeviceCloserImpl camera2DeviceCloserImpl, Camera2ErrorProcessor camera2ErrorProcessor, Threads threads) {
        permissions.getClass();
        retryingCameraStateOpenerImpl.getClass();
        camera2DeviceCloserImpl.getClass();
        camera2ErrorProcessor.getClass();
        threads.getClass();
        this.retryingCameraStateOpener = retryingCameraStateOpenerImpl;
        this.camera2DeviceCloser = camera2DeviceCloserImpl;
        this.camera2ErrorProcessor = camera2ErrorProcessor;
        CoroutineScope coroutineScope = threads.cameraPipeScope;
        this.scope = coroutineScope;
        Continuation continuation = null;
        e0 e0Var = new e0(new GraphLoop$processingQueue$1(1, this, PruningCamera2DeviceManager.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 1), new VirtualCameraState$connect$2$1(this, continuation, 12));
        coroutineScope.getClass();
        if (!((AtomicBoolean) e0Var.i).compareAndSet()) {
            a$$ExternalSyntheticBUOutline0.m$1("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (JobKt.launch$default(coroutineScope, null, null, new ThumbNode$onAttach$1(e0Var, continuation, 10), 3).isCancelled()) {
            e0.access$closeAndReleaseUnprocessedElements(e0Var, null);
        }
        this.queue = e0Var;
        this.activeCameras = new LinkedHashSet();
        this.pendingRequestOpens = new ArrayList();
    }

    /* renamed from: close-EfqyGwQ, reason: not valid java name */
    public final void m76closeEfqyGwQ(String str) {
        str.getClass();
        RequestCloseById requestCloseById = new RequestCloseById(str);
        if (((BufferedChannel) this.queue.f).mo1159trySendJP2dKIU(requestCloseById) instanceof ChannelResult.Failed) {
            Log.e("CXCP", "Camera close by ID request failed for " + ((Object) CameraId.m46toStringimpl(str)) + '!');
            requestCloseById.deferred.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00df -> B:10:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object connectPendingRequestOpens(Set set, ContinuationImpl continuationImpl) {
        PruningCamera2DeviceManager$connectPendingRequestOpens$1 pruningCamera2DeviceManager$connectPendingRequestOpens$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PruningCamera2DeviceManager$connectPendingRequestOpens$1) {
            pruningCamera2DeviceManager$connectPendingRequestOpens$1 = (PruningCamera2DeviceManager$connectPendingRequestOpens$1) continuationImpl;
            int i2 = pruningCamera2DeviceManager$connectPendingRequestOpens$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pruningCamera2DeviceManager$connectPendingRequestOpens$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pruningCamera2DeviceManager$connectPendingRequestOpens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pruningCamera2DeviceManager$connectPendingRequestOpens$1.label;
                ArrayList arrayList = this.pendingRequestOpens;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (set.contains(new CameraId(((PendingRequestOpen) next).request.virtualCamera.cameraId))) {
                            arrayList2.add(next);
                        }
                    }
                    it = arrayList2.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PendingRequestOpen pendingRequestOpen = pruningCamera2DeviceManager$connectPendingRequestOpens$1.L$1;
                    it = pruningCamera2DeviceManager$connectPendingRequestOpens$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    arrayList.remove(pendingRequestOpen);
                    if (it.hasNext()) {
                        pendingRequestOpen = (PendingRequestOpen) it.next();
                        RequestOpen requestOpen = pendingRequestOpen.request;
                        VirtualCameraState virtualCameraState = requestOpen.virtualCamera;
                        ArrayList plus = CollectionsKt.plus((Iterable) requestOpen.sharedCameraIds, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new CameraId(virtualCameraState.cameraId)));
                        if (!plus.isEmpty()) {
                            Iterator it3 = plus.iterator();
                            loop0: while (it3.hasNext()) {
                                String str = ((CameraId) it3.next()).value;
                                LinkedHashSet linkedHashSet = this.activeCameras;
                                if (linkedHashSet != null && linkedHashSet.isEmpty()) {
                                    break;
                                }
                                Iterator it4 = linkedHashSet.iterator();
                                while (it4.hasNext()) {
                                    if (Intrinsics.areEqual(((ActiveCamera) it4.next()).androidCameraState.cameraId, str)) {
                                        break;
                                    }
                                }
                                break loop0;
                            }
                        }
                        ActiveCamera activeCamera = pendingRequestOpen.activeCamera;
                        MutexToken mutexToken = pendingRequestOpen.token;
                        pruningCamera2DeviceManager$connectPendingRequestOpens$1.L$0 = it;
                        pruningCamera2DeviceManager$connectPendingRequestOpens$1.L$1 = pendingRequestOpen;
                        pruningCamera2DeviceManager$connectPendingRequestOpens$1.label = 1;
                        if (activeCamera.connectTo(virtualCameraState, mutexToken) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        arrayList.remove(pendingRequestOpen);
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        pruningCamera2DeviceManager$connectPendingRequestOpens$1 = new PruningCamera2DeviceManager$connectPendingRequestOpens$1(this, continuationImpl);
        Object obj2 = pruningCamera2DeviceManager$connectPendingRequestOpens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pruningCamera2DeviceManager$connectPendingRequestOpens$1.label;
        ArrayList arrayList3 = this.pendingRequestOpens;
        if (i != 0) {
        }
    }

    public final Unit disconnectPendingRequestOpens(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PendingRequestOpen pendingRequestOpen = (PendingRequestOpen) it.next();
            pendingRequestOpen.token.release();
            this.pendingRequestOpens.remove(pendingRequestOpen);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: openCameraWithRetry-zDSwpeU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m77openCameraWithRetryzDSwpeU(String str, List list, Camera2CameraController$$ExternalSyntheticLambda1 camera2CameraController$$ExternalSyntheticLambda1, CoroutineScope coroutineScope, ContinuationImpl continuationImpl) {
        PruningCamera2DeviceManager$openCameraWithRetry$1 pruningCamera2DeviceManager$openCameraWithRetry$1;
        int i;
        if (continuationImpl instanceof PruningCamera2DeviceManager$openCameraWithRetry$1) {
            pruningCamera2DeviceManager$openCameraWithRetry$1 = (PruningCamera2DeviceManager$openCameraWithRetry$1) continuationImpl;
            int i2 = pruningCamera2DeviceManager$openCameraWithRetry$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pruningCamera2DeviceManager$openCameraWithRetry$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pruningCamera2DeviceManager$openCameraWithRetry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pruningCamera2DeviceManager$openCameraWithRetry$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Log.d("CXCP", "Opening " + ((Object) CameraId.m46toStringimpl(str)) + " with retries...");
                    pruningCamera2DeviceManager$openCameraWithRetry$1.L$0 = str;
                    pruningCamera2DeviceManager$openCameraWithRetry$1.L$1 = list;
                    pruningCamera2DeviceManager$openCameraWithRetry$1.L$2 = coroutineScope;
                    pruningCamera2DeviceManager$openCameraWithRetry$1.label = 1;
                    obj = this.retryingCameraStateOpener.m79openCameraWithRetryaeCOTgg(str, this.camera2DeviceCloser, camera2CameraController$$ExternalSyntheticLambda1, pruningCamera2DeviceManager$openCameraWithRetry$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineScope = pruningCamera2DeviceManager$openCameraWithRetry$1.L$2;
                    list = pruningCamera2DeviceManager$openCameraWithRetry$1.L$1;
                    str = pruningCamera2DeviceManager$openCameraWithRetry$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                OpenCameraResult openCameraResult = (OpenCameraResult) obj;
                AndroidCameraState androidCameraState = openCameraResult.cameraState;
                return androidCameraState != null ? new OpenVirtualCameraResult.Error(openCameraResult.errorCode) : new OpenVirtualCameraResult.Success(new ActiveCamera(androidCameraState, CollectionsKt.toSet(CollectionsKt.plus((Collection) list, (Object) new CameraId(str))), coroutineScope, new ObjectList$$ExternalSyntheticLambda0(this, 5)));
            }
        }
        pruningCamera2DeviceManager$openCameraWithRetry$1 = new PruningCamera2DeviceManager$openCameraWithRetry$1(this, continuationImpl);
        Object obj2 = pruningCamera2DeviceManager$openCameraWithRetry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pruningCamera2DeviceManager$openCameraWithRetry$1.label;
        if (i != 0) {
        }
        OpenCameraResult openCameraResult2 = (OpenCameraResult) obj2;
        AndroidCameraState androidCameraState2 = openCameraResult2.cameraState;
        if (androidCameraState2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (r9.awaitClosed(r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (disconnectPendingRequestOpens(r2) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processRequestClose(RequestClose requestClose, ContinuationImpl continuationImpl) {
        PruningCamera2DeviceManager$processRequestClose$1 pruningCamera2DeviceManager$processRequestClose$1;
        int i;
        if (continuationImpl instanceof PruningCamera2DeviceManager$processRequestClose$1) {
            pruningCamera2DeviceManager$processRequestClose$1 = (PruningCamera2DeviceManager$processRequestClose$1) continuationImpl;
            int i2 = pruningCamera2DeviceManager$processRequestClose$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pruningCamera2DeviceManager$processRequestClose$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pruningCamera2DeviceManager$processRequestClose$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pruningCamera2DeviceManager$processRequestClose$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActiveCamera activeCamera = requestClose.activeCamera;
                    Log.i("CXCP", "PruningCamera2DeviceManager#processRequestClose(" + ((Object) CameraId.m46toStringimpl(activeCamera.androidCameraState.cameraId)) + ')');
                    LinkedHashSet linkedHashSet = this.activeCameras;
                    if (linkedHashSet.contains(activeCamera)) {
                        linkedHashSet.remove(activeCamera);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.pendingRequestOpens.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((PendingRequestOpen) next).activeCamera == activeCamera) {
                            arrayList.add(next);
                        }
                    }
                    pruningCamera2DeviceManager$processRequestClose$1.L$0 = requestClose;
                    pruningCamera2DeviceManager$processRequestClose$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    requestClose = pruningCamera2DeviceManager$processRequestClose$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                requestClose.activeCamera.close();
                ActiveCamera activeCamera2 = requestClose.activeCamera;
                pruningCamera2DeviceManager$processRequestClose$1.L$0 = null;
                pruningCamera2DeviceManager$processRequestClose$1.label = 2;
            }
        }
        pruningCamera2DeviceManager$processRequestClose$1 = new PruningCamera2DeviceManager$processRequestClose$1(this, continuationImpl);
        Object obj2 = pruningCamera2DeviceManager$processRequestClose$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pruningCamera2DeviceManager$processRequestClose$1.label;
        if (i != 0) {
        }
        requestClose.activeCamera.close();
        ActiveCamera activeCamera22 = requestClose.activeCamera;
        pruningCamera2DeviceManager$processRequestClose$1.L$0 = null;
        pruningCamera2DeviceManager$processRequestClose$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (disconnectPendingRequestOpens(r6.pendingRequestOpens) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[LOOP:1: B:27:0x0058->B:29:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processRequestCloseAll(RequestCloseAll requestCloseAll, ContinuationImpl continuationImpl) {
        PruningCamera2DeviceManager$processRequestCloseAll$1 pruningCamera2DeviceManager$processRequestCloseAll$1;
        int i;
        Iterator it;
        Iterator it2;
        if (continuationImpl instanceof PruningCamera2DeviceManager$processRequestCloseAll$1) {
            pruningCamera2DeviceManager$processRequestCloseAll$1 = (PruningCamera2DeviceManager$processRequestCloseAll$1) continuationImpl;
            int i2 = pruningCamera2DeviceManager$processRequestCloseAll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pruningCamera2DeviceManager$processRequestCloseAll$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pruningCamera2DeviceManager$processRequestCloseAll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pruningCamera2DeviceManager$processRequestCloseAll$1.label;
                LinkedHashSet linkedHashSet = this.activeCameras;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseAll()");
                    pruningCamera2DeviceManager$processRequestCloseAll$1.L$0 = requestCloseAll;
                    pruningCamera2DeviceManager$processRequestCloseAll$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it2 = pruningCamera2DeviceManager$processRequestCloseAll$1.L$1;
                        requestCloseAll = pruningCamera2DeviceManager$processRequestCloseAll$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        while (it2.hasNext()) {
                            ActiveCamera activeCamera = (ActiveCamera) it2.next();
                            pruningCamera2DeviceManager$processRequestCloseAll$1.L$0 = requestCloseAll;
                            pruningCamera2DeviceManager$processRequestCloseAll$1.L$1 = it2;
                            pruningCamera2DeviceManager$processRequestCloseAll$1.label = 2;
                            if (activeCamera.awaitClosed(pruningCamera2DeviceManager$processRequestCloseAll$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        linkedHashSet.clear();
                        CompletableDeferredImpl completableDeferredImpl = requestCloseAll.deferred;
                        Unit unit = Unit.INSTANCE;
                        completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(unit);
                        return unit;
                    }
                    requestCloseAll = pruningCamera2DeviceManager$processRequestCloseAll$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((ActiveCamera) it.next()).close();
                }
                it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                }
                linkedHashSet.clear();
                CompletableDeferredImpl completableDeferredImpl2 = requestCloseAll.deferred;
                Unit unit2 = Unit.INSTANCE;
                completableDeferredImpl2.makeCompleting$kotlinx_coroutines_core(unit2);
                return unit2;
            }
        }
        pruningCamera2DeviceManager$processRequestCloseAll$1 = new PruningCamera2DeviceManager$processRequestCloseAll$1(this, continuationImpl);
        Object obj2 = pruningCamera2DeviceManager$processRequestCloseAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pruningCamera2DeviceManager$processRequestCloseAll$1.label;
        LinkedHashSet linkedHashSet2 = this.activeCameras;
        if (i != 0) {
        }
        it = linkedHashSet2.iterator();
        while (it.hasNext()) {
        }
        it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
        }
        linkedHashSet2.clear();
        CompletableDeferredImpl completableDeferredImpl22 = requestCloseAll.deferred;
        Unit unit22 = Unit.INSTANCE;
        completableDeferredImpl22.makeCompleting$kotlinx_coroutines_core(unit22);
        return unit22;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processRequestCloseById(RequestCloseById requestCloseById, ContinuationImpl continuationImpl) {
        PruningCamera2DeviceManager$processRequestCloseById$1 pruningCamera2DeviceManager$processRequestCloseById$1;
        int i;
        RequestCloseById requestCloseById2;
        String str;
        Iterator it;
        Object obj;
        ActiveCamera activeCamera;
        RequestCloseById requestCloseById3;
        if (continuationImpl instanceof PruningCamera2DeviceManager$processRequestCloseById$1) {
            pruningCamera2DeviceManager$processRequestCloseById$1 = (PruningCamera2DeviceManager$processRequestCloseById$1) continuationImpl;
            int i2 = pruningCamera2DeviceManager$processRequestCloseById$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pruningCamera2DeviceManager$processRequestCloseById$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = pruningCamera2DeviceManager$processRequestCloseById$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pruningCamera2DeviceManager$processRequestCloseById$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    String str2 = requestCloseById.activeCameraId;
                    Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseById(" + ((Object) CameraId.m46toStringimpl(requestCloseById.activeCameraId)) + ')');
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = this.pendingRequestOpens.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (Intrinsics.areEqual(((PendingRequestOpen) next).request.virtualCamera.cameraId, str2)) {
                            arrayList.add(next);
                        }
                    }
                    pruningCamera2DeviceManager$processRequestCloseById$1.L$0 = requestCloseById;
                    pruningCamera2DeviceManager$processRequestCloseById$1.L$1 = str2;
                    pruningCamera2DeviceManager$processRequestCloseById$1.label = 1;
                    if (disconnectPendingRequestOpens(arrayList) != coroutineSingletons) {
                        requestCloseById2 = requestCloseById;
                        str = str2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    requestCloseById3 = pruningCamera2DeviceManager$processRequestCloseById$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    requestCloseById2 = requestCloseById3;
                    CompletableDeferredImpl completableDeferredImpl = requestCloseById2.deferred;
                    Unit unit = Unit.INSTANCE;
                    completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(unit);
                    return unit;
                }
                str = pruningCamera2DeviceManager$processRequestCloseById$1.L$1;
                requestCloseById2 = pruningCamera2DeviceManager$processRequestCloseById$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                LinkedHashSet linkedHashSet = this.activeCameras;
                it = linkedHashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((ActiveCamera) obj).androidCameraState.cameraId, str)) {
                        break;
                    }
                }
                activeCamera = (ActiveCamera) obj;
                if (activeCamera != null) {
                    linkedHashSet.remove(activeCamera);
                    activeCamera.close();
                    pruningCamera2DeviceManager$processRequestCloseById$1.L$0 = requestCloseById2;
                    pruningCamera2DeviceManager$processRequestCloseById$1.L$1 = null;
                    pruningCamera2DeviceManager$processRequestCloseById$1.label = 2;
                    if (activeCamera.awaitClosed(pruningCamera2DeviceManager$processRequestCloseById$1) != coroutineSingletons) {
                        requestCloseById3 = requestCloseById2;
                        requestCloseById2 = requestCloseById3;
                    }
                    return coroutineSingletons;
                }
                CompletableDeferredImpl completableDeferredImpl2 = requestCloseById2.deferred;
                Unit unit2 = Unit.INSTANCE;
                completableDeferredImpl2.makeCompleting$kotlinx_coroutines_core(unit2);
                return unit2;
            }
        }
        pruningCamera2DeviceManager$processRequestCloseById$1 = new PruningCamera2DeviceManager$processRequestCloseById$1(this, continuationImpl);
        Object obj22 = pruningCamera2DeviceManager$processRequestCloseById$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pruningCamera2DeviceManager$processRequestCloseById$1.label;
        if (i != 0) {
        }
        LinkedHashSet linkedHashSet2 = this.activeCameras;
        it = linkedHashSet2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        activeCamera = (ActiveCamera) obj;
        if (activeCamera != null) {
        }
        CompletableDeferredImpl completableDeferredImpl22 = requestCloseById2.deferred;
        Unit unit22 = Unit.INSTANCE;
        completableDeferredImpl22.makeCompleting$kotlinx_coroutines_core(unit22);
        return unit22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0277, code lost:
    
        if (connectPendingRequestOpens(r10, r0) != r1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028a, code lost:
    
        if (r11.connectTo(r9, r0) == r1) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0139 A[LOOP:3: B:87:0x0133->B:89:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processRequestOpen(RequestOpen requestOpen, ContinuationImpl continuationImpl) {
        PruningCamera2DeviceManager$processRequestOpen$1 pruningCamera2DeviceManager$processRequestOpen$1;
        String str;
        ArrayList arrayList;
        RequestOpen requestOpen2;
        List list;
        Iterator it;
        Iterator it2;
        Camera2ErrorProcessor camera2ErrorProcessor;
        PruningCamera2DeviceManager$processRequestOpen$1 pruningCamera2DeviceManager$processRequestOpen$12;
        Object obj;
        String str2;
        RequestOpen requestOpen3;
        RetrieveActiveCameraResult retrieveActiveCameraResult;
        if (continuationImpl instanceof PruningCamera2DeviceManager$processRequestOpen$1) {
            pruningCamera2DeviceManager$processRequestOpen$1 = (PruningCamera2DeviceManager$processRequestOpen$1) continuationImpl;
            int i = pruningCamera2DeviceManager$processRequestOpen$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                pruningCamera2DeviceManager$processRequestOpen$1.label = i - PKIFailureInfo.systemUnavail;
                Object obj2 = pruningCamera2DeviceManager$processRequestOpen$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (pruningCamera2DeviceManager$processRequestOpen$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj2);
                        str = requestOpen.virtualCamera.cameraId;
                        Log.i("CXCP", "PruningCamera2DeviceManager#processRequestOpen(" + ((Object) CameraId.m46toStringimpl(str)) + ')');
                        if (requestOpen.sharedCameraIds.isEmpty()) {
                            LinkedHashSet linkedHashSet = this.activeCameras;
                            arrayList = new ArrayList();
                            for (Object obj4 : linkedHashSet) {
                                if (!Intrinsics.areEqual(((ActiveCamera) obj4).androidCameraState.cameraId, str)) {
                                    arrayList.add(obj4);
                                }
                            }
                        } else {
                            Set set = CollectionsKt.toSet(CollectionsKt.plus((Collection) requestOpen.sharedCameraIds, (Object) new CameraId(requestOpen.virtualCamera.cameraId)));
                            LinkedHashSet linkedHashSet2 = this.activeCameras;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : linkedHashSet2) {
                                if (!Intrinsics.areEqual(((ActiveCamera) obj5).allCameraIds, set)) {
                                    arrayList2.add(obj5);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        if (!arrayList.isEmpty()) {
                            this.activeCameras.removeAll(arrayList);
                            ArrayList arrayList3 = this.pendingRequestOpens;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                if (arrayList.contains(((PendingRequestOpen) next).activeCamera)) {
                                    arrayList4.add(next);
                                }
                            }
                            pruningCamera2DeviceManager$processRequestOpen$1.L$0 = requestOpen;
                            pruningCamera2DeviceManager$processRequestOpen$1.L$1 = str;
                            pruningCamera2DeviceManager$processRequestOpen$1.L$2 = arrayList;
                            pruningCamera2DeviceManager$processRequestOpen$1.label = 1;
                            if (disconnectPendingRequestOpens(arrayList4) != obj3) {
                                ArrayList arrayList5 = arrayList;
                                requestOpen2 = requestOpen;
                                list = arrayList5;
                                it = list.iterator();
                                while (it.hasNext()) {
                                    ((ActiveCamera) it.next()).close();
                                }
                                it2 = list.iterator();
                                while (it2.hasNext()) {
                                    ActiveCamera activeCamera = (ActiveCamera) it2.next();
                                    pruningCamera2DeviceManager$processRequestOpen$1.L$0 = requestOpen2;
                                    pruningCamera2DeviceManager$processRequestOpen$1.L$1 = str;
                                    pruningCamera2DeviceManager$processRequestOpen$1.L$2 = it2;
                                    pruningCamera2DeviceManager$processRequestOpen$1.label = 2;
                                    if (activeCamera.awaitClosed(pruningCamera2DeviceManager$processRequestOpen$1) == obj3) {
                                    }
                                }
                                String str3 = str;
                                camera2ErrorProcessor = this.camera2ErrorProcessor;
                                VirtualCameraState virtualCameraState = requestOpen2.virtualCamera;
                                camera2ErrorProcessor.getClass();
                                str3.getClass();
                                synchronized (camera2ErrorProcessor.lock) {
                                    camera2ErrorProcessor.virtualCameraStateMap.put(new CameraId(str3), virtualCameraState);
                                }
                                pruningCamera2DeviceManager$processRequestOpen$1.L$0 = requestOpen2;
                                pruningCamera2DeviceManager$processRequestOpen$1.L$1 = str3;
                                pruningCamera2DeviceManager$processRequestOpen$1.L$2 = null;
                                pruningCamera2DeviceManager$processRequestOpen$1.label = 3;
                                Object m78retrieveActiveCameraRzXb1QE = m78retrieveActiveCameraRzXb1QE(str3, requestOpen2, pruningCamera2DeviceManager$processRequestOpen$1);
                                if (m78retrieveActiveCameraRzXb1QE != obj3) {
                                    pruningCamera2DeviceManager$processRequestOpen$12 = pruningCamera2DeviceManager$processRequestOpen$1;
                                    obj = m78retrieveActiveCameraRzXb1QE;
                                    str2 = str3;
                                    requestOpen3 = requestOpen2;
                                    retrieveActiveCameraResult = (RetrieveActiveCameraResult) obj;
                                    if (!(retrieveActiveCameraResult instanceof RetrieveActiveCameraResult.Error)) {
                                        RetrieveActiveCameraResult.Error error = (RetrieveActiveCameraResult.Error) retrieveActiveCameraResult;
                                        if (error.lastCameraError != null) {
                                            Log.e("CXCP", "Failed to retrieve active camera for " + ((Object) CameraId.m46toStringimpl(str2)) + ". Last camera error was " + ((Object) CameraError.m43toStringimpl(error.lastCameraError.value)));
                                        } else {
                                            Log.w("CXCP", "Failed to retrieve active camera for " + ((Object) CameraId.m46toStringimpl(str2)) + ". Camera might have been closed during opening.");
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    if (!(retrieveActiveCameraResult instanceof RetrieveActiveCameraResult.Success)) {
                                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                                        return null;
                                    }
                                    RetrieveActiveCameraResult.Success success = (RetrieveActiveCameraResult.Success) retrieveActiveCameraResult;
                                    ActiveCamera activeCamera2 = success.activeCamera;
                                    MutexToken mutexToken = success.token;
                                    if (requestOpen3.sharedCameraIds.isEmpty()) {
                                        VirtualCameraState virtualCameraState2 = requestOpen3.virtualCamera;
                                        pruningCamera2DeviceManager$processRequestOpen$12.L$0 = null;
                                        pruningCamera2DeviceManager$processRequestOpen$12.L$1 = null;
                                        pruningCamera2DeviceManager$processRequestOpen$12.label = 6;
                                        break;
                                    } else {
                                        List list2 = requestOpen3.sharedCameraIds;
                                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                            Iterator it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                String str4 = ((CameraId) it4.next()).value;
                                                ArrayList arrayList6 = this.pendingRequestOpens;
                                                if (arrayList6 == null || !arrayList6.isEmpty()) {
                                                    Iterator it5 = arrayList6.iterator();
                                                    while (it5.hasNext()) {
                                                        if (Intrinsics.areEqual(((PendingRequestOpen) it5.next()).activeCamera.androidCameraState.cameraId, str4)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                this.pendingRequestOpens.add(new PendingRequestOpen(requestOpen3, activeCamera2, mutexToken));
                                                return Unit.INSTANCE;
                                                break;
                                            }
                                        }
                                        VirtualCameraState virtualCameraState3 = requestOpen3.virtualCamera;
                                        pruningCamera2DeviceManager$processRequestOpen$12.L$0 = requestOpen3;
                                        pruningCamera2DeviceManager$processRequestOpen$12.L$1 = null;
                                        pruningCamera2DeviceManager$processRequestOpen$12.label = 4;
                                        if (activeCamera2.connectTo(virtualCameraState3, mutexToken) != obj3) {
                                            pruningCamera2DeviceManager$processRequestOpen$1 = pruningCamera2DeviceManager$processRequestOpen$12;
                                            Set set2 = CollectionsKt.toSet(requestOpen3.sharedCameraIds);
                                            pruningCamera2DeviceManager$processRequestOpen$1.L$0 = null;
                                            pruningCamera2DeviceManager$processRequestOpen$1.label = 5;
                                            break;
                                        }
                                    }
                                }
                            }
                            return obj3;
                        }
                        requestOpen2 = requestOpen;
                        String str32 = str;
                        camera2ErrorProcessor = this.camera2ErrorProcessor;
                        VirtualCameraState virtualCameraState4 = requestOpen2.virtualCamera;
                        camera2ErrorProcessor.getClass();
                        str32.getClass();
                        synchronized (camera2ErrorProcessor.lock) {
                        }
                        break;
                    case 1:
                        list = (List) pruningCamera2DeviceManager$processRequestOpen$1.L$2;
                        str = pruningCamera2DeviceManager$processRequestOpen$1.L$1;
                        requestOpen2 = pruningCamera2DeviceManager$processRequestOpen$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                        }
                        String str322 = str;
                        camera2ErrorProcessor = this.camera2ErrorProcessor;
                        VirtualCameraState virtualCameraState42 = requestOpen2.virtualCamera;
                        camera2ErrorProcessor.getClass();
                        str322.getClass();
                        synchronized (camera2ErrorProcessor.lock) {
                        }
                        break;
                    case 2:
                        it2 = (Iterator) pruningCamera2DeviceManager$processRequestOpen$1.L$2;
                        str = pruningCamera2DeviceManager$processRequestOpen$1.L$1;
                        requestOpen2 = pruningCamera2DeviceManager$processRequestOpen$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        while (it2.hasNext()) {
                        }
                        String str3222 = str;
                        camera2ErrorProcessor = this.camera2ErrorProcessor;
                        VirtualCameraState virtualCameraState422 = requestOpen2.virtualCamera;
                        camera2ErrorProcessor.getClass();
                        str3222.getClass();
                        synchronized (camera2ErrorProcessor.lock) {
                        }
                        break;
                    case 3:
                        String str5 = pruningCamera2DeviceManager$processRequestOpen$1.L$1;
                        RequestOpen requestOpen4 = pruningCamera2DeviceManager$processRequestOpen$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        str2 = str5;
                        requestOpen3 = requestOpen4;
                        pruningCamera2DeviceManager$processRequestOpen$12 = pruningCamera2DeviceManager$processRequestOpen$1;
                        obj = obj2;
                        retrieveActiveCameraResult = (RetrieveActiveCameraResult) obj;
                        if (!(retrieveActiveCameraResult instanceof RetrieveActiveCameraResult.Error)) {
                        }
                        break;
                    case 4:
                        requestOpen3 = pruningCamera2DeviceManager$processRequestOpen$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        Set set22 = CollectionsKt.toSet(requestOpen3.sharedCameraIds);
                        pruningCamera2DeviceManager$processRequestOpen$1.L$0 = null;
                        pruningCamera2DeviceManager$processRequestOpen$1.label = 5;
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    case 6:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        pruningCamera2DeviceManager$processRequestOpen$1 = new PruningCamera2DeviceManager$processRequestOpen$1(this, continuationImpl);
        Object obj22 = pruningCamera2DeviceManager$processRequestOpen$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (pruningCamera2DeviceManager$processRequestOpen$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r11 = r10.acquire();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        if (r11 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006e, code lost:
    
        r10.close();
        r2.L$0 = r1;
        r2.L$1 = r9;
        r2.L$2 = r3;
        r2.L$3 = r10;
        r2.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r10.awaitClosed(r2) != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
    
        r12 = r9;
        r9 = r3;
        r3 = r10;
        r10 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0082 -> B:34:0x0086). Please report as a decompilation issue!!! */
    /* renamed from: retrieveActiveCamera-RzXb1QE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m78retrieveActiveCameraRzXb1QE(String str, RequestOpen requestOpen, ContinuationImpl continuationImpl) {
        PruningCamera2DeviceManager$retrieveActiveCamera$1 pruningCamera2DeviceManager$retrieveActiveCamera$1;
        int i;
        RequestOpen requestOpen2;
        Iterator it;
        String str2;
        ActiveCamera activeCamera;
        MutexToken mutexToken;
        String str3;
        RequestOpen requestOpen3;
        OpenVirtualCameraResult openVirtualCameraResult;
        if (continuationImpl instanceof PruningCamera2DeviceManager$retrieveActiveCamera$1) {
            pruningCamera2DeviceManager$retrieveActiveCamera$1 = (PruningCamera2DeviceManager$retrieveActiveCamera$1) continuationImpl;
            int i2 = pruningCamera2DeviceManager$retrieveActiveCamera$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pruningCamera2DeviceManager$retrieveActiveCamera$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pruningCamera2DeviceManager$retrieveActiveCamera$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pruningCamera2DeviceManager$retrieveActiveCamera$1.label;
                LinkedHashSet linkedHashSet = this.activeCameras;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    requestOpen2 = requestOpen;
                    it = linkedHashSet.iterator();
                    str2 = str;
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    if (activeCamera == null) {
                    }
                    if (mutexToken != null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        requestOpen3 = pruningCamera2DeviceManager$retrieveActiveCamera$1.L$1;
                        str3 = pruningCamera2DeviceManager$retrieveActiveCamera$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        openVirtualCameraResult = (OpenVirtualCameraResult) obj;
                        if (openVirtualCameraResult instanceof OpenVirtualCameraResult.Success) {
                            if (!(openVirtualCameraResult instanceof OpenVirtualCameraResult.Error)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Log.i("CXCP", "PruningCameraDeviceManager: Failed to open " + ((Object) CameraId.m46toStringimpl(str3)));
                            VirtualCameraState virtualCameraState = requestOpen3.virtualCamera;
                            CameraError cameraError = ((OpenVirtualCameraResult.Error) openVirtualCameraResult).lastCameraError;
                            virtualCameraState.m80disconnectTPqeGZw(cameraError);
                            return new RetrieveActiveCameraResult.Error(cameraError);
                        }
                        activeCamera = ((OpenVirtualCameraResult.Success) openVirtualCameraResult).activeCamera;
                        mutexToken = activeCamera.acquire();
                        if (mutexToken == null) {
                            Log.i("CXCP", "PruningCameraDeviceManager: Failed to open " + ((Object) CameraId.m46toStringimpl(str3)) + ": Camera may have been closed (possibly due to an error) immediately after opening");
                            requestOpen3.virtualCamera.m80disconnectTPqeGZw(null);
                            return new RetrieveActiveCameraResult.Error(null);
                        }
                        Log.i("CXCP", "PruningCameraDeviceManager: " + ((Object) CameraId.m46toStringimpl(str3)) + " opened successfully");
                        linkedHashSet.add(activeCamera);
                        if (mutexToken != null) {
                            return new RetrieveActiveCameraResult.Success(activeCamera, mutexToken);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    ActiveCamera activeCamera2 = pruningCamera2DeviceManager$retrieveActiveCamera$1.L$3;
                    Iterator it2 = pruningCamera2DeviceManager$retrieveActiveCamera$1.L$2;
                    RequestOpen requestOpen4 = pruningCamera2DeviceManager$retrieveActiveCamera$1.L$1;
                    String str4 = pruningCamera2DeviceManager$retrieveActiveCamera$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str2 = str4;
                    linkedHashSet.remove(activeCamera2);
                    it = it2;
                    requestOpen2 = requestOpen4;
                    while (true) {
                        if (!it.hasNext()) {
                            activeCamera = (ActiveCamera) it.next();
                            if (Intrinsics.areEqual(activeCamera.androidCameraState.cameraId, str2)) {
                                break;
                            }
                        } else {
                            activeCamera = null;
                            mutexToken = null;
                            break;
                        }
                    }
                    if (activeCamera == null) {
                        List list = requestOpen2.sharedCameraIds;
                        Camera2CameraController$$ExternalSyntheticLambda1 camera2CameraController$$ExternalSyntheticLambda1 = requestOpen2.isForegroundObserver;
                        pruningCamera2DeviceManager$retrieveActiveCamera$1.L$0 = str2;
                        pruningCamera2DeviceManager$retrieveActiveCamera$1.L$1 = requestOpen2;
                        pruningCamera2DeviceManager$retrieveActiveCamera$1.L$2 = null;
                        pruningCamera2DeviceManager$retrieveActiveCamera$1.L$3 = null;
                        pruningCamera2DeviceManager$retrieveActiveCamera$1.label = 2;
                        Object m77openCameraWithRetryzDSwpeU = m77openCameraWithRetryzDSwpeU(str2, list, camera2CameraController$$ExternalSyntheticLambda1, this.scope, pruningCamera2DeviceManager$retrieveActiveCamera$1);
                        if (m77openCameraWithRetryzDSwpeU != coroutineSingletons) {
                            str3 = str2;
                            obj = m77openCameraWithRetryzDSwpeU;
                            requestOpen3 = requestOpen2;
                            openVirtualCameraResult = (OpenVirtualCameraResult) obj;
                            if (openVirtualCameraResult instanceof OpenVirtualCameraResult.Success) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (mutexToken != null) {
                    }
                }
            }
        }
        pruningCamera2DeviceManager$retrieveActiveCamera$1 = new PruningCamera2DeviceManager$retrieveActiveCamera$1(this, continuationImpl);
        Object obj2 = pruningCamera2DeviceManager$retrieveActiveCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pruningCamera2DeviceManager$retrieveActiveCamera$1.label;
        LinkedHashSet linkedHashSet2 = this.activeCameras;
        if (i != 0) {
        }
    }
}
