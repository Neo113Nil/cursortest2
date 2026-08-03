package i0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m0.d1;
import m0.z;
import w.i0;
import w.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2945a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2946b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f2947c;

    public e(boolean z10, float f10, d1 d1Var) {
        this.f2945a = z10;
        this.f2946b = f10;
        this.f2947c = d1Var;
    }

    @Override // w.i0
    public final j0 b(y.i iVar, m0.r rVar) {
        long b2;
        rVar.X(988743187);
        q qVar = (q) rVar.j(s.f2994a);
        d1 d1Var = this.f2947c;
        if (((f1.q) d1Var.getValue()).f2285a != f1.q.f2283h) {
            rVar.X(-303571590);
            rVar.q(false);
            b2 = ((f1.q) d1Var.getValue()).f2285a;
        } else {
            rVar.X(-303521246);
            b2 = qVar.b(rVar);
            rVar.q(false);
        }
        d1 u10 = z.u(new f1.q(b2), rVar);
        d1 u11 = z.u(qVar.a(rVar), rVar);
        rVar.X(331259447);
        ViewGroup b10 = t.b((View) rVar.j(AndroidCompositionLocals_androidKt.f607f));
        boolean f10 = rVar.f(iVar) | rVar.f(this) | rVar.f(b10);
        Object M = rVar.M();
        Object obj = m0.l.f4646a;
        if (f10 || M == obj) {
            Object aVar = new a(this.f2945a, this.f2946b, u10, u11, b10);
            rVar.i0(aVar);
            M = aVar;
        }
        a aVar2 = (a) M;
        rVar.q(false);
        boolean f11 = rVar.f(iVar) | rVar.h(aVar2);
        Object M2 = rVar.M();
        if (f11 || M2 == obj) {
            M2 = new c0.c(iVar, aVar2, (fc.d) null, 3);
            rVar.i0(M2);
        }
        z.e(aVar2, iVar, (oc.e) M2, rVar);
        rVar.q(false);
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2945a == eVar.f2945a && s2.f.a(this.f2946b, eVar.f2946b) && this.f2947c.equals(eVar.f2947c);
    }

    public final int hashCode() {
        return this.f2947c.hashCode() + a4.d.b(this.f2946b, Boolean.hashCode(this.f2945a) * 31, 31);
    }
}
