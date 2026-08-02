package T7;

import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.C;
import S7.C0389g;
import S7.F;
import S7.H;
import S7.l0;
import S7.t0;
import X7.o;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.LD;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class e extends AbstractC0402u implements C {

    /* renamed from: v, reason: collision with root package name */
    public final Handler f3098v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f3099w;

    /* renamed from: x, reason: collision with root package name */
    public final e f3100x;

    public e(Handler handler, boolean z3) {
        this.f3098v = handler;
        this.f3099w = z3;
        this.f3100x = z3 ? this : new e(handler, true);
    }

    public final void A(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        AbstractC0406y.d(interfaceC5272i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        F.f2917c.p(interfaceC5272i, runnable);
    }

    @Override // S7.C
    public final H b(long j6, final t0 t0Var, InterfaceC5272i interfaceC5272i) {
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f3098v.postDelayed(t0Var, j6)) {
            return new H() { // from class: T7.c
                @Override // S7.H
                public final void b() {
                    e.this.f3098v.removeCallbacks(t0Var);
                }
            };
        }
        A(interfaceC5272i, t0Var);
        return l0.f2976n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f3098v == this.f3098v && eVar.f3099w == this.f3099w;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3098v) ^ (this.f3099w ? 1231 : 1237);
    }

    @Override // S7.C
    public final void k(long j6, C0389g c0389g) {
        LD ld = new LD(26, c0389g, this);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f3098v.postDelayed(ld, j6)) {
            c0389g.t(new d(0, this, ld));
        } else {
            A(c0389g.f2964x, ld);
        }
    }

    @Override // S7.AbstractC0402u
    public final void p(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        if (this.f3098v.post(runnable)) {
            return;
        }
        A(interfaceC5272i, runnable);
    }

    @Override // S7.AbstractC0402u
    public final String toString() {
        e eVar;
        String str;
        Z7.e eVar2 = F.f2915a;
        e eVar3 = o.f3856a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f3100x;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f3098v.toString();
        return this.f3099w ? AbstractC4404f.f(handler, ".immediate") : handler;
    }

    @Override // S7.AbstractC0402u
    public final boolean z() {
        return (this.f3099w && h.a(Looper.myLooper(), this.f3098v.getLooper())) ? false : true;
    }
}
