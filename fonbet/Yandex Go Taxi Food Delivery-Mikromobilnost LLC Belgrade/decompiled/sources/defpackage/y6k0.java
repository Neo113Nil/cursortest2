package defpackage;

import android.content.Context;
import com.yandex.go.taxi.summary.rida_summary.header.c;
import com.yandex.go.taxi.summary.rida_summary.interactor.o;
import com.yandex.go.taxi.summary.rida_summary.interactor.q;
import kotlin.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class y6k0 extends pgd {
    public final Context F;
    public final y50 G;
    public final d7k0 H;
    public final o I;
    public final biv0 J;
    public final i130 K;
    public final q L;
    public final uet0 M;
    public final set0 N;
    public final yvf0 O;
    public final vpr0 P;
    public final c Q;
    public final yvf0 R;
    public final i3y S;
    public final mu5 T;

    public y6k0(Context context, y50 y50Var, d7k0 d7k0Var, o oVar, biv0 biv0Var, i130 i130Var, q qVar, uet0 uet0Var, set0 set0Var, y0g y0gVar, vpr0 vpr0Var, c cVar, a1g a1gVar) {
        super(0);
        this.F = context;
        this.G = y50Var;
        this.H = d7k0Var;
        this.I = oVar;
        this.J = biv0Var;
        this.K = i130Var;
        this.L = qVar;
        this.M = uet0Var;
        this.N = set0Var;
        this.O = y0gVar;
        this.P = vpr0Var;
        this.Q = cVar;
        this.R = a1gVar;
        int i = 25;
        this.S = a.a(new vyf0(i, this));
        this.T = new mu5(new odf0(i, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        this.H.getClass();
        biv0 biv0Var = this.J;
        bov0 a = biv0Var.a();
        if (a == null) {
            a = bov0.e;
        }
        biv0Var.d(new hpv0(a));
        r0 r0Var = biv0Var.c;
        r0Var.getClass();
        r0Var.m(null, 6);
        biv0Var.e();
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((zy11) obj);
        d7k0 d7k0Var = this.H;
        d7k0Var.a.t4(d7k0Var.b);
        this.J.d(fpv0.a);
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        this.P.a(this.Q);
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.P.b(this.Q);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.T;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final String R() {
        return "RidaSummaryScreen";
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.K.a();
    }
}
