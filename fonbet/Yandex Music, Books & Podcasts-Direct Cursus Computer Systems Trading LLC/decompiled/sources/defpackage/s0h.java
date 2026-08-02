package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class s0h implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4k b;

    public /* synthetic */ s0h(w4k w4kVar, int i) {
        this.a = i;
        this.b = w4kVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                str.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(str) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                w1g.j(str, null, null, null, null, null, null, 0.0f, null, 0, ild.C(51555909, new s0h(this.b, 1), hq5Var), hq5Var, (intValue & 14) | 48, 1020);
                return Unit.a;
            default:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zknVar.getClass();
                fs1 fs1Var = zknVar.b;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(zknVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                bs1 k = fs1Var.k();
                if (k instanceof as1) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    oq5Var3.Z(-1696101268);
                    a4g.d(fs1Var, zknVar.c, null, zknVar.d, zknVar.e, oq5Var3, 0, 4);
                    oq5Var3.p(false);
                } else {
                    if (!Intrinsics.d(k, xr1.a) && !(k instanceof yr1) && !(k instanceof zr1)) {
                        throw vz1.i((oq5) hq5Var2, -1994377789, false);
                    }
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(-1994362710);
                    a4g.d(this.b, null, null, null, null, oq5Var4, 48, 28);
                    oq5Var4.p(false);
                }
                return Unit.a;
        }
    }
}
