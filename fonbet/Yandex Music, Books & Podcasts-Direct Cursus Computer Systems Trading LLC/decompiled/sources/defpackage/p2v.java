package defpackage;

import defpackage.b2c;
import defpackage.g0g;
import defpackage.grb;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.i95;
import defpackage.j95;
import defpackage.kb5;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.v7g;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xp5;
import defpackage.yci;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class p2v implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p2v(float f, int i, List list) {
        this.d = list;
        this.b = f;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                spl splVar = (spl) this.d;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.a(this.b);
                zcoVar.x((((int) (splVar.b.c >> 32)) + this.c) / 2.0f);
                break;
            default:
                final List list = (List) this.d;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                int size = list.size();
                final float f = this.b;
                final int i = this.c;
                vufVar.Z(size, null, vsf.v, new wn5(new ryc() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.a
                    @Override // defpackage.ryc
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int intValue = ((Integer) obj3).intValue();
                        hq5 hq5Var = (hq5) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        ((androidx.compose.foundation.lazy.a) obj2).getClass();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                        }
                        if ((intValue2 & 145) == 144) {
                            oq5 oq5Var = (oq5) hq5Var;
                            if (oq5Var.z()) {
                                oq5Var.S();
                                return Unit.a;
                            }
                        }
                        com.yandex.passport.internal.entities.n nVar = (com.yandex.passport.internal.entities.n) list.get(intValue);
                        gz2 gz2Var = b2c.o;
                        vci vciVar = vci.a;
                        float f2 = f;
                        yci r = androidx.compose.foundation.layout.d.r(vciVar, f2);
                        ta5 a = sa5.a(qx0.c, gz2Var, hq5Var, 48);
                        oq5 oq5Var2 = (oq5) hq5Var;
                        int i2 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l = oq5Var2.l();
                        yci H = vnj.H(hq5Var, r);
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
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                            ouj.x(i2, oq5Var2, i2, kb5Var);
                        }
                        g0g.U(hq5Var, H, wp5.d);
                        c.a(i, 0, hq5Var, androidx.compose.foundation.layout.d.m(vciVar, f2), nVar.g, nVar.h.contains("has_plus"));
                        u1g.l(hq5Var, androidx.compose.foundation.layout.d.m(vciVar, 8));
                        String str = nVar.e;
                        if (str == null) {
                            str = "";
                        }
                        oq5 oq5Var3 = (oq5) hq5Var;
                        wcs.b(str, null, ((i95) oq5Var3.j(j95.a)).a, v7g.z(12), null, 0L, null, v7g.z(14), 2, false, 1, 0, ((rdt) oq5Var3.j(vdt.a)).l, hq5Var, 3072, 3126, 54258);
                        oq5Var2.p(true);
                        return Unit.a;
                    }
                }, -355123216, true));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p2v(float f, spl splVar, int i) {
        this.b = f;
        this.d = splVar;
        this.c = i;
    }
}
