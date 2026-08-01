package M1;

import D1.h;
import L1.AbstractC0015p;
import L1.AbstractC0023y;
import L1.C0016q;
import L1.InterfaceC0021w;
import L1.K;
import L1.T;
import Q1.n;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import v1.i;

/* loaded from: classes.dex */
public final class c extends AbstractC0015p implements InterfaceC0021w {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f626c;

    /* renamed from: d, reason: collision with root package name */
    public final String f627d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final c f628f;

    public c(Handler handler, String str, boolean z2) {
        this.f626c = handler;
        this.f627d = str;
        this.e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f628f = cVar;
    }

    @Override // L1.AbstractC0015p
    public final void b(i iVar, Runnable runnable) {
        if (this.f626c.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        K k2 = (K) iVar.e(C0016q.f576b);
        if (k2 != null) {
            ((T) k2).i(cancellationException);
        }
        AbstractC0023y.f587b.b(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f626c == this.f626c;
    }

    @Override // L1.AbstractC0015p
    public final boolean g() {
        return (this.e && D1.i.a(Looper.myLooper(), this.f626c.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f626c);
    }

    @Override // L1.AbstractC0015p
    public final String toString() {
        c cVar;
        String str;
        R1.d dVar = AbstractC0023y.f586a;
        c cVar2 = n.f964a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f628f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f627d;
        if (str2 == null) {
            str2 = this.f626c.toString();
        }
        return this.e ? h.f(str2, ".immediate") : str2;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
