package defpackage;

import android.view.MotionEvent;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g1v implements l5v {
    public final m5v a;
    public final int b;
    public final long c;
    public final x6k d;
    public final x6k e;
    public final t6k f;
    public final t6k g;
    public final x6k h;

    public g1v(int i, m5v m5vVar, int i2) {
        m5vVar.getClass();
        this.a = m5vVar;
        this.b = i2;
        long f = c3x.f(i);
        this.c = f;
        this.d = vz1.j(f);
        this.e = szf.g0(f1v.c);
        this.f = new t6k(0.0f);
        this.g = new t6k(0.0f);
        this.h = szf.g0(Boolean.FALSE);
    }

    @Override // defpackage.l5v
    public final void b(yy1 yy1Var) {
        yy1Var.getClass();
    }

    @Override // defpackage.l5v
    public final void c(float f) {
        this.g.h(f);
    }

    @Override // defpackage.l5v
    public final void g(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // defpackage.l5v
    public final void i(float f) {
        this.f.h(f);
    }

    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1873734);
        int i2 = (oq5Var.f(this) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            sdr b = bmq.b(((d85) this.d.getValue()).a, weo.S(this.b, 0, null, 6), "bgColorAnimation", oq5Var, 384, 8);
            yci c = d.c(vci.a, 1.0f);
            boolean f = ((i2 & 14) == 4) | oq5Var.f(b);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new wes(26, this, b);
                oq5Var.k0(K);
            }
            yci a = a.a(c, (Function1) K);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            tt0.g(this.e.getValue(), null, null, null, ild.C(-1601012108, new olu(4, this), oq5Var), oq5Var, 24576, 14);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lsu(this, i);
        }
    }

    @Override // defpackage.l5v
    public final void setGradientHorizontal(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.l5v
    public final void setTrackMoodSpecs(dys dysVar) {
        dysVar.getClass();
    }

    @Override // defpackage.l5v
    public final void setWaveScreenBackground(r3v r3vVar) {
        r3vVar.getClass();
        boolean equals = r3vVar.equals(p3v.a);
        long j = this.c;
        x6k x6kVar = this.e;
        x6k x6kVar2 = this.d;
        if (equals) {
            x6kVar2.setValue(new d85(j));
            x6kVar.setValue(f1v.b);
        } else if (r3vVar instanceof o3v) {
            x6kVar2.setValue(new d85(j));
            x6kVar.setValue(f1v.a);
        } else if (!(r3vVar instanceof q3v)) {
            b6e.s();
        } else {
            x6kVar2.setValue(new d85(c3x.f(((q3v) r3vVar).a.b)));
            x6kVar.setValue(f1v.a);
        }
    }

    @Override // defpackage.l5v
    public final void a() {
    }

    @Override // defpackage.l5v
    public final void destroy() {
    }

    @Override // defpackage.l5v
    public final void e() {
    }

    @Override // defpackage.l5v
    public final void f() {
    }

    @Override // defpackage.l5v
    public final void onResume() {
    }

    @Override // defpackage.l5v
    public final void d(boolean z) {
    }

    @Override // defpackage.l5v
    public final void setFpsInfoCallback(jhs jhsVar) {
    }

    @Override // defpackage.l5v
    public final void setPlaying(boolean z) {
    }

    @Override // defpackage.l5v
    public final void h(long j, boolean z) {
    }
}
