package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class sd5 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sd5(int i, long j, Object obj, boolean z) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = j;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                cma cmaVar = (cma) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).c(cmaVar.a) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                lg3.k(str, this.b, this.c, d.m(vci.a, cmaVar.a), hq5Var, 0);
                return Unit.a;
            case 1:
                yci yciVar = (yci) this.d;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zknVar.getClass();
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
                bs1 k = zknVar.b.k();
                act S = weo.S(0, 0, nya.d, 3);
                final boolean z = this.b;
                final long j = this.c;
                tt0.g(k, yciVar, S, "donation_informer_state", ild.C(-948628069, new pyc() { // from class: ud5
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        bs1 bs1Var = (bs1) obj4;
                        hq5 hq5Var3 = (hq5) obj5;
                        int intValue3 = ((Integer) obj6).intValue();
                        bs1Var.getClass();
                        if ((intValue3 & 6) == 0) {
                            intValue3 |= (intValue3 & 8) == 0 ? ((oq5) hq5Var3).f(bs1Var) : ((oq5) hq5Var3).h(bs1Var) ? 4 : 2;
                        }
                        if ((intValue3 & 19) == 18) {
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        if (bs1Var instanceof as1) {
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            oq5Var4.Z(306139852);
                            irf.r(((as1) bs1Var).a, null, d.c(vci.a, 1.0f), null, null, 0.0f, z ? new d43(j, 9) : null, oq5Var4, 432, 56);
                            oq5Var4.p(false);
                        } else {
                            if (!bs1Var.equals(xr1.a) && !(bs1Var instanceof yr1) && !(bs1Var instanceof zr1)) {
                                throw vz1.i((oq5) hq5Var3, -1098505573, false);
                            }
                            oq5 oq5Var5 = (oq5) hq5Var3;
                            oq5Var5.Z(306716731);
                            pm0.a(null, ild.C(-802213229, new kv4(7, bs1Var), oq5Var5), oq5Var5, 48, 1);
                            oq5Var5.p(false);
                        }
                        return Unit.a;
                    }
                }, hq5Var2), hq5Var2, 27648, 0);
                return Unit.a;
            default:
                ((Integer) obj3).getClass();
                return rb.c((fk0) this.d, this.b, this.c, (yci) obj, (hq5) obj2);
        }
    }
}
