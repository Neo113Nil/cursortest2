package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class wv3 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;

    public /* synthetic */ wv3(yci yciVar, int i) {
        this.a = i;
        this.b = yciVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(zknVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                boolean z = k instanceof zr1;
                yci yciVar = this.b;
                if (z) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(258913913);
                    pm0.a(lm0.d, ild.C(-1803517920, new u71(yciVar, 8), oq5Var2), oq5Var2, 48, 0);
                    oq5Var2.p(false);
                } else if (k instanceof as1) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(259287029);
                    irf.r(((as1) k).a, null, yciVar, null, hd6.a, 0.0f, null, oq5Var3, 24624, 104);
                    oq5Var3.p(false);
                } else {
                    if (!Intrinsics.d(k, xr1.a) && !(k instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var, -684387377, false);
                    }
                    oq5 oq5Var4 = (oq5) hq5Var;
                    oq5Var4.Z(-684359885);
                    oq5Var4.p(false);
                }
                return Unit.a;
            default:
                zkn zknVar2 = (zkn) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zknVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(zknVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                bs1 k2 = zknVar2.b.k();
                boolean z2 = k2 instanceof as1;
                yci yciVar2 = this.b;
                if (z2) {
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(1214355555);
                    irf.r(((as1) k2).a, null, xp3.u(yciVar2, ugo.a), zknVar2.d, zknVar2.e, 0.0f, null, oq5Var6, 48, 96);
                    oq5Var6.p(false);
                } else if (Intrinsics.d(k2, xr1.a) || (k2 instanceof zr1)) {
                    oq5 oq5Var7 = (oq5) hq5Var2;
                    oq5Var7.Z(-792099589);
                    ivf.k(6, 0, oq5Var7, xp3.u(yciVar2, ugo.a), true);
                    oq5Var7.p(false);
                } else {
                    if (!(k2 instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var2, -792113746, false);
                    }
                    oq5 oq5Var8 = (oq5) hq5Var2;
                    oq5Var8.Z(-792095656);
                    oq5Var8.p(false);
                }
                return Unit.a;
        }
    }
}
