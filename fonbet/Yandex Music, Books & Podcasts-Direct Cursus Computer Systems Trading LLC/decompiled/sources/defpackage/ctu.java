package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ctu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ftu b;

    public /* synthetic */ ctu(ftu ftuVar, int i) {
        this.a = i;
        this.b = ftuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ftu ftuVar = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                l18 l18Var = l18.b;
                boolean z = false;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean I = asq.I((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a));
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        bdt I2 = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        K = Boolean.valueOf(((r1v) ((byb) qdcVar.C(I2)).c(ern.a(r1v.class))).h());
                        oq5Var.k0(K);
                    }
                    Boolean bool = (Boolean) K;
                    boolean booleanValue = bool.booleanValue();
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        bdt I3 = hag.I(byb.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        if (((v3v) ((byb) qdcVar2.C(I3)).c(ern.a(v3v.class))).h() && booleanValue && !I) {
                            z = true;
                        }
                        K2 = Boolean.valueOf(z);
                        oq5Var.k0(K2);
                    }
                    Boolean bool2 = (Boolean) K2;
                    bool2.getClass();
                    Object K3 = oq5Var.K();
                    if (K3 == kjnVar) {
                        bdt I4 = hag.I(byb.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        K3 = Boolean.valueOf(((d5n) ((byb) qdcVar3.C(I4)).c(ern.a(d5n.class))).h());
                        oq5Var.k0(K3);
                    }
                    Boolean bool3 = (Boolean) K3;
                    bool3.getClass();
                    qzm a = upg.a.a(bool);
                    qzm a2 = vpg.a.a(bool2);
                    agr agrVar = rkg.a;
                    Object K4 = oq5Var.K();
                    if (K4 == kjnVar) {
                        bdt I5 = hag.I(byb.class);
                        qdc qdcVar4 = l18Var.a;
                        qdcVar4.getClass();
                        K4 = Boolean.valueOf(((pfc) ((byb) qdcVar4.C(I5)).c(ern.a(pfc.class))).h());
                        oq5Var.k0(K4);
                    }
                    Boolean bool4 = (Boolean) K4;
                    bool4.getClass();
                    pd.b(new qzm[]{a, a2, agrVar.a(bool4), gmg.a.a(bool3)}, true, ild.C(-1581029522, new ctu(ftuVar, 1), oq5Var), oq5Var, 440, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ftu ftuVar2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    asq.c(true, oq5Var2, 54);
                    uwf.e((eii) ftuVar2.r.getValue(), (ltu) ftuVar2.D.getValue(), ild.C(242150549, new n31(5, ftuVar2), oq5Var2), j66.n0(oq5Var2), oq5Var2, 384);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
