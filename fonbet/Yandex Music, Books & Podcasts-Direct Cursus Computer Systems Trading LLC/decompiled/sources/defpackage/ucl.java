package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ucl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ adl b;
    public final /* synthetic */ h4b c;

    public /* synthetic */ ucl(adl adlVar, h4b h4bVar, int i) {
        this.a = i;
        this.b = adlVar;
        this.c = h4bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        na0 na0Var;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    qzm[] qzmVarArr = {ypg.a, qkg.d.o(0, oq5Var), wpg.d.o(0, oq5Var)};
                    adl adlVar = this.b;
                    jf0.a(qzmVarArr, pd.u(new qzm[0], (vdr) adlVar.x.getValue()), false, ild.C(-165442216, new ucl(adlVar, this.c, 1), oq5Var), oq5Var, 3080, 4);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                    mfc mfcVar = (mfc) oq5Var2.j((agr) qkg.d.c);
                    adl adlVar2 = this.b;
                    aqi x = bcx.x((vdr) adlVar2.v.getValue(), oq5Var2, 0);
                    mfcVar.getClass();
                    if (mfcVar == mfc.a || mfcVar == mfc.c) {
                        oq5Var2.Z(1933802016);
                        dwf dwfVar = (dwf) ((kpv) oq5Var2.j(es5.t));
                        if (dwfVar.b == null) {
                            Function0 function0 = dwfVar.a;
                            dwfVar.b = szf.g0(new hqe(function0 != null ? ((hqe) function0.invoke()).a : 0L));
                            dwfVar.a = null;
                        }
                        x6k x6kVar = dwfVar.b;
                        x6kVar.getClass();
                        int i = (int) (((hqe) x6kVar.getValue()).a & 4294967295L);
                        float b = zs4.b(jx7Var);
                        Parcelable parcelable = adlVar2.requireArguments().getParcelable("playerScreen:args");
                        if (parcelable == null) {
                            xq0.x("Required value was null.");
                            break;
                        } else {
                            na0 D = yd5.D(b, ((v9l) parcelable).a, ((Boolean) x.getValue()).booleanValue(), i, mfcVar == mfc.c, oq5Var2, 0);
                            oq5Var2.p(false);
                            na0Var = D;
                        }
                    } else {
                        oq5Var2.Z(1934372726);
                        oq5Var2.p(false);
                        na0Var = null;
                    }
                    pm0.a(null, ild.C(-1822290591, new pli(na0Var, jx7Var, adlVar2, x, this.c, 6), oq5Var2), oq5Var2, 48, 1);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
