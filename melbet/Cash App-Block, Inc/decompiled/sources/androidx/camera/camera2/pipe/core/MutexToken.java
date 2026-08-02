package androidx.camera.camera2.pipe.core;

import androidx.compose.material3.ThumbNode$onAttach$1;
import com.google.mlkit.vision.face.internal.zzm;
import kotlin.coroutines.Continuation;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes3.dex */
public final class MutexToken {
    public final /* synthetic */ int $r8$classId;
    public final AtomicBoolean _released;
    public final Object mutex;

    public MutexToken(Mutex mutex) {
        this.$r8$classId = 0;
        mutex.getClass();
        this.mutex = mutex;
        this._released = AtomicFU.atomic(false);
    }

    public final boolean getReleased() {
        switch (this.$r8$classId) {
        }
        return this._released.getValue();
    }

    public final boolean release() {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                if (!this._released.compareAndSet()) {
                    return false;
                }
                ((Mutex) this.mutex).unlock(null);
                return true;
            default:
                if (!this._released.compareAndSet()) {
                    return false;
                }
                zzm zzmVar = (zzm) this.mutex;
                synchronized (zzmVar.zze) {
                    int i = zzmVar.zzd - 1;
                    zzmVar.zzd = i;
                    if (i == 0 && !zzmVar.zza) {
                        zzmVar.zzf = JobKt.launch$default((CoroutineScope) zzmVar.zzb, null, null, new ThumbNode$onAttach$1(zzmVar, continuation, 11), 3);
                    }
                }
                return true;
        }
    }

    public MutexToken(zzm zzmVar) {
        this.$r8$classId = 1;
        this.mutex = zzmVar;
        this._released = AtomicFU.atomic(false);
    }
}
