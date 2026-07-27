package M0;

import L0.AbstractC0061t;
import L0.C;
import L0.C0062u;
import L0.InterfaceC0067z;
import L0.Q;
import Q0.p;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import v0.i;

/* loaded from: classes.dex */
public final class c extends AbstractC0061t implements InterfaceC0067z {
    private volatile c _immediate;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f700g;

    /* renamed from: h, reason: collision with root package name */
    public final String f701h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f702i;

    /* renamed from: j, reason: collision with root package name */
    public final c f703j;

    public c(Handler handler, String str, boolean z2) {
        this.f700g = handler;
        this.f701h = str;
        this.f702i = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f703j = cVar;
    }

    @Override // L0.AbstractC0061t
    public final void c(i iVar, Runnable runnable) {
        if (this.f700g.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        Q q2 = (Q) iVar.i(C0062u.f682f);
        if (q2 != null) {
            q2.a(cancellationException);
        }
        C.f612b.c(iVar, runnable);
    }

    @Override // L0.AbstractC0061t
    public final boolean d() {
        return (this.f702i && E0.i.a(Looper.myLooper(), this.f700g.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f700g == this.f700g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f700g);
    }

    @Override // L0.AbstractC0061t
    public final String toString() {
        c cVar;
        String str;
        S0.d dVar = C.f611a;
        c cVar2 = p.f907a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f703j;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f701h;
        if (str2 == null) {
            str2 = this.f700g.toString();
        }
        if (!this.f702i) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
