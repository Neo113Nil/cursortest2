package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class zku implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ alu b;
    public final /* synthetic */ blu c;
    public final /* synthetic */ xes d;
    public final /* synthetic */ f4m e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ d85 h;
    public final /* synthetic */ String i;

    public /* synthetic */ zku(alu aluVar, blu bluVar, xes xesVar, f4m f4mVar, String str, String str2, d85 d85Var, String str3, int i) {
        this.a = i;
        this.b = aluVar;
        this.c = bluVar;
        this.d = xesVar;
        this.e = f4mVar;
        this.f = str;
        this.g = str2;
        this.h = d85Var;
        this.i = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        d85 d85Var;
        String str2;
        oq5 oq5Var;
        switch (this.a) {
            case 0:
                alu aluVar = this.b;
                blu bluVar = this.c;
                xes xesVar = this.d;
                f4m f4mVar = this.e;
                String str3 = this.f;
                String str4 = this.g;
                d85 d85Var2 = this.h;
                String str5 = this.i;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-2026215533, new zku(aluVar, bluVar, xesVar, f4mVar, str3, str4, d85Var2, str5, 1), oq5Var2), oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            default:
                alu aluVar2 = this.b;
                blu bluVar2 = this.c;
                xes xesVar2 = this.d;
                f4m f4mVar2 = this.e;
                String str6 = this.f;
                String str7 = this.g;
                d85 d85Var3 = this.h;
                String str8 = this.i;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (!oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    oq5Var3.S();
                } else {
                    if (!(aluVar2 instanceof alu)) {
                        throw vz1.i(oq5Var3, -1572939730, false);
                    }
                    oq5Var3.Z(-1515874131);
                    rr5 rr5Var = aluVar2.a;
                    kxi kxiVar = bluVar2.v;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(k6l.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    k6l k6lVar = (k6l) qdcVar.C(I);
                    bdt I2 = hag.I(uwu.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    uwu uwuVar = (uwu) qdcVar2.C(I2);
                    bdt I3 = hag.I(zy7.class);
                    qdc qdcVar3 = l18Var.a;
                    qdcVar3.getClass();
                    zy7 zy7Var = (zy7) qdcVar3.C(I3);
                    kxiVar.getClass();
                    Object K = oq5Var3.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
                    }
                    mm6 mm6Var = ((fs5) K).a;
                    boolean f = oq5Var3.f(rr5Var) | oq5Var3.f(f4mVar2) | oq5Var3.f(null);
                    Object K2 = oq5Var3.K();
                    if (f || K2 == kjnVar) {
                        str = str7;
                        d85Var = d85Var3;
                        str2 = str8;
                        oq5Var = oq5Var3;
                        swu swuVar = new swu(rr5Var, kxiVar, xesVar2, k6lVar, uwuVar, zy7Var, f4mVar2, mm6Var);
                        oq5Var.k0(swuVar);
                        K2 = swuVar;
                    } else {
                        str = str7;
                        d85Var = d85Var3;
                        str2 = str8;
                        oq5Var = oq5Var3;
                    }
                    owu owuVar = (owu) K2;
                    oq5Var.p(false);
                    iz2 iz2Var = b2c.f;
                    vci vciVar = vci.a;
                    yci d = d.d(vciVar, 1.0f);
                    kfh d2 = ug3.d(iz2Var, false);
                    int i = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, d);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    knu[] knuVarArr = knu.a;
                    a4g.o(new lnu(str6, str, d85Var.a, str2 != null ? new amu(str2, null, null) : null, null, null, null, null, 240), owuVar, androidx.compose.ui.platform.a.a(vciVar, "wave_button_juicydialog"), 0.0f, oq5Var, 0, 8);
                    oq5Var.p(true);
                }
                return Unit.a;
        }
    }
}
