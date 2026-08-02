package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.MutexToken;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.face.internal.zzm;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class ActiveCamera {
    public final Set allCameraIds;
    public final AndroidCameraState androidCameraState;
    public VirtualCameraState current;
    public final zzm wakelock;

    public ActiveCamera(AndroidCameraState androidCameraState, Set set, CoroutineScope coroutineScope, ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0) {
        androidCameraState.getClass();
        set.getClass();
        coroutineScope.getClass();
        this.androidCameraState = androidCameraState;
        this.allCameraIds = set;
        this.wakelock = new zzm(coroutineScope, new DialogHostKt$$ExternalSyntheticLambda0(3, objectList$$ExternalSyntheticLambda0, this));
        JobKt.launch$default(coroutineScope, null, null, new ThumbNode$onAttach$1(this, (Continuation) null, 5), 3);
    }

    public final MutexToken acquire() {
        zzm zzmVar = this.wakelock;
        synchronized (zzmVar.zze) {
            try {
                if (zzmVar.zza) {
                    return null;
                }
                int i = zzmVar.zzd + 1;
                zzmVar.zzd = i;
                if (i == 1) {
                    StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) zzmVar.zzf;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    zzmVar.zzf = null;
                }
                return new MutexToken(zzmVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object awaitClosed(ContinuationImpl continuationImpl) {
        int i = 2;
        Object first = FlowKt.first(this.androidCameraState._state, new DataStoreImpl$data$1.AnonymousClass2(i, null, i), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (first != coroutineSingletons) {
            first = Unit.INSTANCE;
        }
        return first == coroutineSingletons ? first : Unit.INSTANCE;
    }

    public final void close() {
        this.wakelock.release();
        this.androidCameraState.close();
    }

    public final Unit connectTo(VirtualCameraState virtualCameraState, MutexToken mutexToken) {
        Unit unit;
        VirtualCameraState virtualCameraState2 = this.current;
        this.current = virtualCameraState;
        Continuation continuation = null;
        if (virtualCameraState2 != null) {
            virtualCameraState2.m80disconnectTPqeGZw(null);
        }
        StateFlowImpl stateFlowImpl = this.androidCameraState._state;
        synchronized (virtualCameraState.lock) {
            if (virtualCameraState.closed) {
                mutexToken.release();
                unit = Unit.INSTANCE;
            } else {
                virtualCameraState.job = JobKt.launch$default(virtualCameraState.scope, null, null, new VirtualCameraState$connect$2$1(stateFlowImpl, virtualCameraState, continuation, 0), 3);
                virtualCameraState.wakelockToken = mutexToken;
                unit = Unit.INSTANCE;
            }
        }
        return unit == CoroutineSingletons.COROUTINE_SUSPENDED ? unit : Unit.INSTANCE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) CameraId.m46toStringimpl(this.androidCameraState.cameraId));
        sb.append(")@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        return sb.toString();
    }
}
