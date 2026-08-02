package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class fdg implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ fdg(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_listeners_16, 0, hq5Var), null, a.q(d.c(vciVar, 1.0f), 0.0f, 0.0f, ff7.P(v7g.z(4), hq5Var), ff7.P(v7g.z(1), hq5Var), 3), this.b, hq5Var, 48, 0);
            default:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(zknVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    bs1 k = zknVar.b.k();
                    if (k instanceof as1) {
                        oq5Var2.Z(-398247434);
                        irf.r(((as1) k).a, null, null, null, zknVar.e, 0.0f, null, oq5Var2, 48, 108);
                        oq5Var2.p(false);
                    } else if (k instanceof yr1) {
                        oq5Var2.Z(-397897754);
                        iz2 iz2Var = b2c.f;
                        yci b = androidx.compose.foundation.a.b(vciVar, this.b, vnj.i);
                        kfh d = ug3.d(iz2Var, false);
                        int i2 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, b);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d, wp5.f);
                        g0g.U(oq5Var2, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                            ouj.x(i2, oq5Var2, i2, kb5Var);
                        }
                        g0g.U(oq5Var2, H, wp5.d);
                        gae.b(a0g.E(R.drawable.ic_clip_24, 0, oq5Var2), null, d.m(vciVar, 72), d85.b(d85.f, 0.2f, 0.0f, 0.0f, 0.0f, 14), oq5Var2, 3504, 0);
                        oq5Var2.p(true);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(-567004495);
                        oq5Var2.p(false);
                    }
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
