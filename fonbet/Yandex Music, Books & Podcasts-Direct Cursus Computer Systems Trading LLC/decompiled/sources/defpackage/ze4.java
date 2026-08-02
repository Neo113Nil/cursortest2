package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class ze4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ze4(cwk cwkVar, float f) {
        this.a = 2;
        this.c = cwkVar;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i;
        int i2;
        b95 b95Var;
        int i3 = this.a;
        vci vciVar = vci.a;
        Object obj3 = this.c;
        float f = this.b;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                qwp.f((ve4) obj3, f, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 1:
                n1g n1gVar = (n1g) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(1 & intValue, (intValue & 3) != 2)) {
                    yci m = d.m(a.m(vciVar, 8), f);
                    w4k E = a0g.E(R.drawable.ic_dislike_24, 0, oq5Var);
                    if (n1gVar.a == j1g.c) {
                        oq5Var.Z(1006309449);
                        j = ((dq0) oq5Var.j(eq0.a)).a.a;
                    } else {
                        oq5Var.Z(1006310507);
                        j = ((dq0) oq5Var.j(eq0.a)).a.c;
                    }
                    oq5Var.p(false);
                    gae.b(E, null, m, j, oq5Var, 48, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 2:
                cwk cwkVar = (cwk) obj3;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = cwkVar.ordinal();
                    if (ordinal == 0) {
                        i = R.string.listen;
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        i = R.string.pause;
                    }
                    int ordinal2 = cwkVar.ordinal();
                    if (ordinal2 == 0) {
                        i2 = R.drawable.ic_play_64;
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        i2 = R.drawable.ic_pause_64;
                    }
                    gae.b(a0g.E(i2, 0, oq5Var2), rvf.M(i, oq5Var2), d.m(vciVar, f), ((dq0) oq5Var2.j(eq0.a)).a.h, oq5Var2, 0, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                c3x.p((hvq) obj3, f, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 4:
                wn5 wn5Var = (wn5) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    yci d = d.d(d.e(vciVar, f), 1.0f);
                    kfh d2 = ug3.d(b2c.b, false);
                    int i4 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                    yci H = vnj.H(oq5Var3, d);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, d2, wp5.f);
                    g0g.U(oq5Var3, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var3, i4, kb5Var);
                    }
                    g0g.U(oq5Var3, H, wp5.d);
                    wn5Var.invoke(b.a, oq5Var3, 6);
                    oq5Var3.p(true);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            default:
                plv plvVar = (plv) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ukd I = o5g.I(new yov(new n38(f)), f);
                    if (plvVar instanceof nlv) {
                        oq5Var4.Z(88978213);
                        oq5Var4.p(false);
                        b95Var = new sfc(((nlv) plvVar).d);
                    } else {
                        if (!Intrinsics.d(plvVar, olv.b)) {
                            throw vz1.i(oq5Var4, 88976160, false);
                        }
                        oq5Var4.Z(88981385);
                        b95Var = ((fxa) oq5Var4.j(cs5.e)).e;
                        oq5Var4.p(false);
                    }
                    jf0.i(I, b95Var, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ze4(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }

    public /* synthetic */ ze4(Object obj, float f, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = f;
    }
}
