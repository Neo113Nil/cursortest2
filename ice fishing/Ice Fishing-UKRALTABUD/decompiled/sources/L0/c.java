package L0;

import K0.AbstractC0043t;
import K0.C;
import K0.C0044u;
import K0.InterfaceC0049z;
import K0.Q;
import P0.p;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import v0.i;

/* loaded from: classes.dex */
public final class c extends AbstractC0043t implements InterfaceC0049z {
    private volatile c _immediate;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f687h;

    /* renamed from: i, reason: collision with root package name */
    public final String f688i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f689j;

    /* renamed from: k, reason: collision with root package name */
    public final c f690k;

    public c(Handler handler, String str, boolean z2) {
        this.f687h = handler;
        this.f688i = str;
        this.f689j = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f690k = cVar;
    }

    @Override // K0.AbstractC0043t
    public final void c(i iVar, Runnable runnable) {
        if (this.f687h.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        Q q2 = (Q) iVar.i(C0044u.f534g);
        if (q2 != null) {
            q2.a(cancellationException);
        }
        C.f464b.c(iVar, runnable);
    }

    @Override // K0.AbstractC0043t
    public final boolean d() {
        return (this.f689j && E0.i.a(Looper.myLooper(), this.f687h.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f687h == this.f687h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f687h);
    }

    @Override // K0.AbstractC0043t
    public final String toString() {
        c cVar;
        String str;
        R0.d dVar = C.f463a;
        c cVar2 = p.f898a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f690k;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f688i;
        if (str2 == null) {
            str2 = this.f687h.toString();
        }
        if (!this.f689j) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
