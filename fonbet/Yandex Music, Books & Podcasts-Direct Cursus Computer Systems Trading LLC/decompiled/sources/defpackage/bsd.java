package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bsd extends y4h implements xu7 {
    public final Handler d;
    public final String e;
    public final boolean f;
    public final bsd g;

    public bsd(Handler handler, String str, boolean z) {
        this.d = handler;
        this.e = str;
        this.f = z;
        this.g = z ? this : new bsd(handler, str, true);
    }

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.d.post(runnable)) {
            return;
        }
        J0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.a
    public final boolean H0(CoroutineContext coroutineContext) {
        return (this.f && Intrinsics.d(Looper.myLooper(), this.d.getLooper())) ? false : true;
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable) {
        saf.B(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        dq7 dq7Var = ca8.a;
        mn7.d.F0(coroutineContext, runnable);
    }

    @Override // defpackage.xu7
    public final void Q(long j, zt3 zt3Var) {
        juc jucVar = new juc(2, zt3Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.d.postDelayed(jucVar, j)) {
            zt3Var.u(new ny2(27, this, jucVar));
        } else {
            J0(zt3Var.e, jucVar);
        }
    }

    @Override // defpackage.xu7
    public final qa8 S(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.d.postDelayed(runnable, j)) {
            return new qa8() { // from class: asd
                @Override // defpackage.qa8
                public final void a() {
                    bsd.this.d.removeCallbacks(runnable);
                }
            };
        }
        J0(coroutineContext, runnable);
        return m8j.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bsd)) {
            return false;
        }
        bsd bsdVar = (bsd) obj;
        return bsdVar.d == this.d && bsdVar.f == this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.d) ^ (this.f ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        bsd bsdVar;
        String str;
        dq7 dq7Var = ca8.a;
        bsd bsdVar2 = j5h.a;
        if (this == bsdVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                bsdVar = bsdVar2.g;
            } catch (UnsupportedOperationException unused) {
                bsdVar = null;
            }
            str = this == bsdVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.e;
        if (str2 == null) {
            str2 = this.d.toString();
        }
        return this.f ? ouj.n(str2, ".immediate") : str2;
    }

    public bsd(Handler handler) {
        this(handler, null, false);
    }
}
