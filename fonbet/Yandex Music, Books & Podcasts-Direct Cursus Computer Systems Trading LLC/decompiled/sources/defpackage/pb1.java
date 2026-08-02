package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class pb1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pb1(int i, String str, long j, obh obhVar, Function0 function0, yci yciVar, int i2) {
        this.d = i;
        this.e = str;
        this.c = j;
        this.f = obhVar;
        this.g = function0;
        this.b = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                bcx.a(this.d, (String) this.e, this.c, (obh) this.f, (Function0) this.g, (yci) this.b, (hq5) obj, rvf.R(4097));
                break;
            case 1:
                yci yciVar = (yci) this.b;
                pud pudVar = (pud) this.e;
                c26 c26Var = (c26) this.f;
                yci yciVar2 = (yci) this.g;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, yciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, a, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                vci vciVar = vci.a;
                yci d = d.d(vciVar, 1.0f);
                long j = this.c;
                int i2 = this.d;
                lg3.v(pudVar, c26Var, j, i2, d, hq5Var, 24584);
                u1g.l(hq5Var, d.e(vciVar, 16));
                lg3.m(pudVar, i2, c26Var, androidx.compose.ui.platform.a.a(d.d(yciVar2, 1.0f), "concert_tab_header_buy_button"), hq5Var, 8);
                oq5Var2.p(true);
                break;
            case 2:
                ((Integer) obj2).getClass();
                leu.g(this.c, (Function0) this.g, (Function1) this.e, (wn5) this.f, (yci) this.b, (hq5) obj, rvf.R(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                vwb.C((dh3) this.e, (lrp) this.f, this.c, (lkv) this.g, (yci) this.b, (hq5) obj, rvf.R(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                vut.q((String) this.e, this.c, (obh) this.f, (Function0) this.g, (pyc) this.b, (hq5) obj, rvf.R(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                v5g.a((String) this.e, (String) this.f, (um0) this.g, this.c, (yci) this.b, (hq5) obj, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pb1(long j, Function0 function0, Function1 function1, wn5 wn5Var, yci yciVar, int i) {
        this.c = j;
        this.g = function0;
        this.e = function1;
        this.f = wn5Var;
        this.b = yciVar;
        this.d = i;
    }

    public /* synthetic */ pb1(dh3 dh3Var, lrp lrpVar, long j, lkv lkvVar, yci yciVar, int i) {
        this.e = dh3Var;
        this.f = lrpVar;
        this.c = j;
        this.g = lkvVar;
        this.b = yciVar;
        this.d = i;
    }

    public /* synthetic */ pb1(yci yciVar, pud pudVar, c26 c26Var, long j, int i, yci yciVar2) {
        this.b = yciVar;
        this.e = pudVar;
        this.f = c26Var;
        this.c = j;
        this.d = i;
        this.g = yciVar2;
    }

    public /* synthetic */ pb1(String str, long j, obh obhVar, Function0 function0, pyc pycVar, int i) {
        this.e = str;
        this.c = j;
        this.f = obhVar;
        this.g = function0;
        this.b = pycVar;
        this.d = i;
    }

    public /* synthetic */ pb1(String str, String str2, um0 um0Var, long j, yci yciVar, int i) {
        this.e = str;
        this.f = str2;
        this.g = um0Var;
        this.c = j;
        this.b = yciVar;
        this.d = i;
    }
}
