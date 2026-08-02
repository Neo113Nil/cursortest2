package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.passport.common.ui.progress.g;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class wl3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wl3(Function0 function0, boolean z) {
        this.a = 7;
        this.c = (ezc) function0;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [ezc, java.lang.Object, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object iaaVar;
        w7v w7vVar;
        int i = this.a;
        Object obj3 = gq5.a;
        boolean z = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ubb ubbVar = (ubb) obj4;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                boolean z2 = ubbVar.a instanceof edq;
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                if (K == obj3) {
                    K = new s2(28);
                    oq5Var2.k0(K);
                }
                Function0 function0 = (Function0) K;
                Function0 q = ubbVar.a.q();
                agr agrVar = eq0.a;
                cb0.a(z2, 0, function0, q, false, false, this.b, new d85(((dq0) oq5Var2.j(agrVar)).c.c), new d85(((dq0) oq5Var2.j(agrVar)).a.g), 2, oq5Var2, 805331376, 32);
                oq5 oq5Var3 = oq5Var2;
                wbq wbqVar = ubbVar.b;
                if (wbqVar == null) {
                    oq5Var3.Z(1404521129);
                } else {
                    oq5Var3.Z(1404521130);
                    boolean f = oq5Var3.f(wbqVar);
                    Object K2 = oq5Var3.K();
                    if (f || K2 == obj3) {
                        if (wbqVar instanceof vbq) {
                            iaaVar = new kaa(0.0f);
                        } else if (wbqVar instanceof ybq) {
                            iaaVar = new iaa(false, 0.0f);
                        } else {
                            if (!(wbqVar instanceof fdq)) {
                                b6e.s();
                                return null;
                            }
                            K2 = haa.a;
                            oq5Var3.k0(K2);
                        }
                        K2 = iaaVar;
                        oq5Var3.k0(K2);
                    }
                    laa laaVar = (laa) K2;
                    Function0 q2 = wbqVar.q();
                    Object K3 = oq5Var3.K();
                    if (K3 == obj3) {
                        K3 = new s2(28);
                        oq5Var3.k0(K3);
                    }
                    etn.r(laaVar, q2, (Function0) K3, false, new d85(((dq0) oq5Var3.j(agrVar)).c.c), 2, oq5Var3, 196992, 8);
                    oq5Var3 = oq5Var3;
                }
                oq5Var3.p(false);
                cdq cdqVar = ubbVar.c;
                if (cdqVar == null) {
                    oq5Var3.Z(1404914643);
                } else {
                    oq5Var3.Z(1404914644);
                    Function0 q3 = cdqVar.q();
                    Object K4 = oq5Var3.K();
                    if (K4 == obj3) {
                        K4 = new s2(28);
                        oq5Var3.k0(K4);
                    }
                    y1g.q(q3, (Function0) K4, new d85(((dq0) oq5Var3.j(agrVar)).c.c), oq5Var3, 48, 0);
                }
                oq5Var3.p(false);
                return Unit.a;
            case 1:
                wn5 wn5Var = (wn5) obj4;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(new uvd(z), hq5Var2, 0);
                return Unit.a;
            case 2:
                hg5 hg5Var = (hg5) obj4;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                float p = w1g.p(nu0.j(), 0, hq5Var3, 0, 2);
                float f2 = mu0.a;
                float p2 = w1g.p(nu0.i(), 0, hq5Var3, 0, 2) + p + f2;
                vci vciVar = vci.a;
                yci u = d.u(d.e(vciVar, p2), b2c.l, true);
                ta5 a = sa5.a(qx0.e, b2c.n, hq5Var3, 6);
                oq5 oq5Var6 = (oq5) hq5Var3;
                int i2 = oq5Var6.P;
                a l = oq5Var6.l();
                yci H = vnj.H(hq5Var3, u);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar);
                } else {
                    oq5Var6.n0();
                }
                g0g.U(hq5Var3, a, wp5.f);
                g0g.U(hq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var6, i2, kb5Var);
                }
                g0g.U(hq5Var3, H, wp5.d);
                String str = hg5Var.a;
                boolean z3 = hg5Var.e;
                jzb jzbVar = hg5Var.d;
                boolean z4 = this.b;
                qgg.r(str, z3, jzbVar, null, z4, 0, hq5Var3, 0, 40);
                String str2 = hg5Var.b;
                if (str2 != null) {
                    oq5Var6.Z(-850509719);
                    u1g.l(hq5Var3, d.e(vciVar, f2));
                    t7g.i(str2, z4, null, hq5Var3, 0, 4);
                } else {
                    oq5Var6.Z(-853898639);
                }
                oq5Var6.p(false);
                oq5Var6.p(true);
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                o2g.j((y5n) obj4, z, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 4:
                ja0 ja0Var = (ja0) obj4;
                float f3 = (int) (((hqe) obj).a >> 32);
                poa poaVar = new poa();
                poaVar.a(dwn.b, 0.0f);
                dwn dwnVar = dwn.a;
                if (!z) {
                    f3 = -f3;
                }
                poaVar.a(dwnVar, f3);
                float[] fArr = poaVar.b;
                ArrayList arrayList = poaVar.a;
                int size = arrayList.size();
                fArr.getClass();
                rz0.a(size, fArr.length);
                float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
                copyOfRange.getClass();
                return new Pair(new ml7(arrayList, copyOfRange), ja0Var.i.getValue());
            case 5:
                ((Integer) obj2).getClass();
                ((iyq) obj4).a(z, (hq5) obj, rvf.R(65));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                o5g.h((n5r) obj4, z, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                ?? r9 = (ezc) obj4;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var8 = (oq5) hq5Var4;
                boolean f4 = oq5Var8.f(r9);
                Object K5 = oq5Var8.K();
                if (f4 || K5 == obj3) {
                    K5 = new adq(r9, z);
                    oq5Var8.k0(K5);
                }
                ivf.o((adq) K5, r9, vci.a, null, null, oq5Var8, 384, 24);
                return Unit.a;
            case 8:
                w1s w1sVar = (w1s) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var5;
                if (oq5Var9.P(intValue & 1, (intValue & 3) != 2)) {
                    wdg.j(w1sVar.d, null, z, oq5Var9, 0);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                o8g.f((mcu) obj4, z, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                swf.s((ltu) obj4, z, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                w0v.a((k2v) obj4, z, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 12:
                z9v z9vVar = (z9v) obj4;
                ((Integer) obj2).getClass();
                oq5 oq5Var10 = (oq5) ((hq5) obj);
                oq5Var10.Z(2130593729);
                if (z) {
                    oq5Var10.Z(1491175678);
                    w7vVar = ((Boolean) z9vVar.invoke(oq5Var10, 0)).booleanValue() ? w7v.c : w7v.a;
                    oq5Var10.p(false);
                } else {
                    oq5Var10.Z(-1198815610);
                    oq5Var10.p(false);
                    w7vVar = w7v.b;
                }
                oq5Var10.p(false);
                return w7vVar;
            default:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.a.f((g) obj4, z, (hq5) obj, rvf.R(1));
                return Unit.a;
        }
    }

    public /* synthetic */ wl3(Object obj, boolean z, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ wl3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ wl3(boolean z, z9v z9vVar) {
        this.a = 12;
        this.b = z;
        this.c = z9vVar;
    }
}
