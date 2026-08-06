package B1;

import A1.A;
import A1.AbstractC0018t;
import A1.C0019u;
import A1.D;
import A1.S;
import F1.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import l1.i;

/* loaded from: classes.dex */
public final class c extends AbstractC0018t implements A {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f89c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f91e;

    /* renamed from: f, reason: collision with root package name */
    public final c f92f;

    public c(Handler handler, String str, boolean z2) {
        this.f89c = handler;
        this.f90d = str;
        this.f91e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f92f = cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f89c == this.f89c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f89c);
    }

    @Override // A1.AbstractC0018t
    public final void j(i iVar, Runnable runnable) {
        if (this.f89c.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        S s2 = (S) iVar.m(C0019u.f73b);
        if (s2 != null) {
            s2.a(cancellationException);
        }
        D.f3b.j(iVar, runnable);
    }

    @Override // A1.AbstractC0018t
    public final boolean n() {
        return (this.f91e && kotlin.jvm.internal.i.a(Looper.myLooper(), this.f89c.getLooper())) ? false : true;
    }

    @Override // A1.AbstractC0018t
    public final String toString() {
        c cVar;
        String str;
        H1.d dVar = D.f2a;
        c cVar2 = o.f624a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f92f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f90d;
        if (str2 == null) {
            str2 = this.f89c.toString();
        }
        if (!this.f91e) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
