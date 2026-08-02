package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dv(int i, ukd ukdVar, ArrayList arrayList) {
        this.a = 3;
        this.b = i;
        this.c = ukdVar;
        this.d = arrayList;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        int i = this.a;
        vci vciVar = vci.a;
        int i2 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj5;
                uy uyVar = (uy) obj4;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    uy uyVar2 = (uy) CollectionsKt.S(list, i2 + 1);
                    boolean z = uyVar instanceof ly;
                    if (z && (uyVar2 instanceof ly)) {
                        oq5Var.Z(-1839332630);
                        f = 16;
                    } else if (z) {
                        oq5Var.Z(-1839202523);
                        f = qbb.b;
                    } else {
                        oq5Var.Z(-1839072726);
                        f = 40;
                    }
                    eta.p(vciVar, f, oq5Var, false);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                jzb jzbVar = (jzb) obj5;
                String str = (String) obj4;
                c cVar = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                boolean z2 = jzbVar != null;
                xme E = ox6.E(jzbVar, 0L, hq5Var2, 6);
                mn0 mn0Var = new mn0(6, str, (ArrayList) null);
                float f2 = upd.a;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xv7.i(mn0Var, androidx.compose.ui.platform.a.a(vciVar, "title"), ((dq0) ((oq5) hq5Var2).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, this.b, 0, bow.l(E), null, nu0.j(), z2 ? bow.k(cVar, new xme[]{E}) : null, null, hq5Var2, 48, 134217776, 612344);
            case 2:
                wn5 wn5Var = (wn5) obj5;
                oho ohoVar = (oho) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ohoVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(ohoVar) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                wn5Var.invoke(ohoVar, obj4, hq5Var3, Integer.valueOf((intValue3 & 14) | (((i2 >> 6) & 8) << 3)));
            case 3:
                ukd ukdVar = (ukd) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                hq5 hq5Var4 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((pho) obj).getClass();
                for (int i3 = 0; i3 < 2; i3++) {
                    vq2.c(pho.a().d(new bxd(p38.a)).d(ukdVar), null, ild.C(-1381966665, new i4(arrayList, (i2 * 2) + i3, 21), hq5Var4), hq5Var4, 384, 2);
                }
                break;
            case 4:
                xsq xsqVar = (xsq) obj5;
                hvq hvqVar = (hvq) obj4;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((um0) obj).getClass();
                if ((intValue4 & 17) == 16) {
                    oq5 oq5Var4 = (oq5) hq5Var5;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                yci c = d.c(vciVar, 1.0f);
                oq5 oq5Var5 = (oq5) hq5Var5;
                boolean f3 = oq5Var5.f(xsqVar) | oq5Var5.d(i2) | oq5Var5.h(hvqVar);
                Object K = oq5Var5.K();
                if (f3 || K == gq5.a) {
                    K = new x8l(i2, xsqVar, hvqVar);
                    oq5Var5.k0(K);
                }
                ug3.a(com.yandex.music.core.ui.compose.a.b(c, null, 0L, 0.0f, null, (Function2) K, 15), oq5Var5, 0);
                break;
            case 5:
                z5t z5tVar = (z5t) obj5;
                w5t w5tVar = (w5t) obj4;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var6, 0);
                    int i4 = oq5Var6.P;
                    androidx.compose.runtime.internal.a l = oq5Var6.l();
                    yci H = vnj.H(oq5Var6, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var6.d0();
                    if (oq5Var6.O) {
                        oq5Var6.k(grbVar);
                    } else {
                        oq5Var6.n0();
                    }
                    g0g.U(oq5Var6, a, wp5.f);
                    g0g.U(oq5Var6, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var6, i4, kb5Var);
                    }
                    g0g.U(oq5Var6, H, wp5.d);
                    oq5Var6.Z(-238661057);
                    for (int i5 = 0; i5 < i2; i5++) {
                        hyf.h(w5tVar, null, oq5Var6, 0);
                    }
                    oq5Var6.p(false);
                    oq5Var6.p(true);
                    u1g.l(oq5Var6, d.m(vciVar, 32));
                    float f4 = 16;
                    float f5 = 48;
                    yci d = d.d(d.e(androidx.compose.foundation.layout.a.o(vciVar, f4, 0.0f, 2), f5), 1.0f);
                    tgo tgoVar = ugo.a;
                    ivf.k(0, 0, oq5Var6, xp3.u(d, tgoVar), true);
                    if (z5tVar.b) {
                        oq5Var6.Z(1322359423);
                        u1g.l(oq5Var6, d.m(vciVar, 8));
                        ivf.k(0, 0, oq5Var6, xp3.u(d.d(d.e(androidx.compose.foundation.layout.a.o(vciVar, f4, 0.0f, 2), f5), 1.0f), tgoVar), true);
                    } else {
                        oq5Var6.Z(1320614774);
                    }
                    oq5Var6.p(false);
                    u1g.l(oq5Var6, d.m(vciVar, 24));
                } else {
                    oq5Var6.S();
                }
                break;
            default:
                am0 am0Var = (am0) obj;
                int intValue6 = ((Integer) obj3).intValue();
                am0Var.getClass();
                ((wn5) obj5).invoke(am0Var, ((aqi) obj4).getValue(), (hq5) obj2, Integer.valueOf((intValue6 & 14) | ((i2 & 8) << 3)));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dv(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ dv(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
