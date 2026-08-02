package defpackage;

import androidx.compose.foundation.e;
import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.selection.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jdp extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdp(Object obj, boolean z, uoi uoiVar, int i) {
        super(3);
        this.r = i;
        this.t = obj;
        this.s = z;
        this.u = uoiVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        boolean z = this.s;
        uoi uoiVar = null;
        Object obj4 = gq5.a;
        Object obj5 = this.u;
        Object obj6 = this.t;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(-2124609672);
                yie yieVar = (yie) oq5Var.j(e.a);
                if (yieVar instanceof cje) {
                    oq5Var.Z(-1412174474);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1412041856);
                    Object K = oq5Var.K();
                    if (K == obj4) {
                        K = vz1.h(oq5Var);
                    }
                    uoiVar = (uoi) K;
                    oq5Var.p(false);
                }
                yci a = b.a(vci.a, this.s, uoiVar, yieVar, true, (meo) obj6, (Function0) obj5);
                oq5Var.p(false);
                return a;
            case 1:
                ((Number) obj3).intValue();
                oq5 oq5Var2 = (oq5) ((hq5) obj2);
                oq5Var2.Z(-1272940975);
                hs7 hs7Var = (hs7) obj6;
                vne vneVar = vne.a;
                oq5Var2.Z(727091888);
                aqi o0 = szf.o0(new d85(!z ? hs7Var.r : ((Boolean) zc4.u((uoi) obj5, oq5Var2, 0).getValue()).booleanValue() ? hs7Var.p : hs7Var.q), oq5Var2);
                oq5Var2.p(false);
                return k5r.f(oq5Var2, false, ((d85) o0.getValue()).a);
            case 2:
                ((Number) obj3).intValue();
                lbs lbsVar = (lbs) obj6;
                x6k x6kVar = lbsVar.f;
                oq5 oq5Var3 = (oq5) ((hq5) obj2);
                oq5Var3.Z(805428266);
                boolean z2 = ((bxj) x6kVar.getValue()) == bxj.a || !(oq5Var3.j(es5.n) == xof.b);
                boolean f = oq5Var3.f(lbsVar);
                Object K2 = oq5Var3.K();
                if (f || K2 == obj4) {
                    K2 = new hxo(19, lbsVar);
                    oq5Var3.k0(K2);
                }
                aqi o02 = szf.o0((Function1) K2, oq5Var3);
                Object K3 = oq5Var3.K();
                if (K3 == obj4) {
                    hq7 hq7Var = new hq7(new kf0(o02, 6));
                    oq5Var3.k0(hq7Var);
                    K3 = hq7Var;
                }
                mxo mxoVar = (mxo) K3;
                boolean f2 = oq5Var3.f(mxoVar) | oq5Var3.f(lbsVar);
                Object K4 = oq5Var3.K();
                if (f2 || K4 == obj4) {
                    K4 = new kbs(mxoVar, lbsVar);
                    oq5Var3.k0(K4);
                }
                yci b = a.b((kbs) K4, (bxj) x6kVar.getValue(), z && lbsVar.b.e() != 0.0f, z2, (uoi) obj5, 16);
                oq5Var3.p(false);
                return b;
            default:
                ((Number) obj3).intValue();
                oq5 oq5Var4 = (oq5) ((hq5) obj2);
                oq5Var4.Z(290332169);
                yie yieVar2 = (yie) oq5Var4.j(e.a);
                if (yieVar2 instanceof cje) {
                    oq5Var4.Z(-2130062114);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.Z(-2129929496);
                    Object K5 = oq5Var4.K();
                    if (K5 == obj4) {
                        K5 = vz1.h(oq5Var4);
                    }
                    uoiVar = (uoi) K5;
                    oq5Var4.p(false);
                }
                yci b2 = b.b(this.s, uoiVar, yieVar2, true, (meo) obj6, (Function1) obj5);
                oq5Var4.p(false);
                return b2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdp(boolean z, meo meoVar, syc sycVar, int i) {
        super(3);
        this.r = i;
        this.s = z;
        this.t = meoVar;
        this.u = sycVar;
    }
}
