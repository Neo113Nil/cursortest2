package defpackage;

import androidx.compose.foundation.layout.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tkl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iml b;
    public final /* synthetic */ sdr c;
    public final /* synthetic */ jub d;
    public final /* synthetic */ hvb e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ tkl(iml imlVar, sdr sdrVar, jub jubVar, hvb hvbVar, boolean z, int i) {
        this.a = i;
        this.b = imlVar;
        this.c = sdrVar;
        this.d = jubVar;
        this.e = hvbVar;
        this.f = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        Object obj3 = gq5.a;
        boolean z = this.f;
        iml imlVar = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(1 & intValue, (intValue & 3) != 2)) {
                    jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                    boolean f = oq5Var.f(jx7Var);
                    Object K = oq5Var.K();
                    if (f || K == obj3) {
                        K = Integer.valueOf((int) Math.ceil(jx7Var.n0(cub.c)));
                        oq5Var.k0(K);
                    }
                    int intValue2 = ((Number) K).intValue();
                    float f2 = r43.a;
                    float p = w1g.p(r43.b(), 0, oq5Var, 0, 2);
                    ozm ozmVar = lkg.a;
                    float f3 = 16;
                    float a = ((o0k) oq5Var.j(ozmVar)).a() + ((o0k) oq5Var.j(ozmVar)).d() + p + f3 + f3;
                    boolean f4 = oq5Var.f(jx7Var);
                    Object K2 = oq5Var.K();
                    if (f4 || K2 == obj3) {
                        K2 = Integer.valueOf((int) Math.ceil(jx7Var.n0(a) + jx7Var.n0(cub.c)));
                        oq5Var.k0(K2);
                    }
                    int intValue3 = ((Number) K2).intValue();
                    boolean f5 = oq5Var.f(imlVar);
                    Object K3 = oq5Var.K();
                    if (f5 || K3 == obj3) {
                        K3 = imlVar.a();
                        oq5Var.k0(K3);
                    }
                    st4 st4Var = (st4) K3;
                    bb0 n0 = j66.n0(oq5Var);
                    float F = tt0.F(oq5Var);
                    f83 e0 = etn.e0(oq5Var);
                    List h = u75.h("PLAYER_ARTISTS_INFO", "PLAYER_ARTISTS_CONCERTS", "TRACK_SIMILAR_ENTITIES");
                    yci c = d.c(vciVar, 1.0f);
                    boolean d = oq5Var.d(intValue3) | oq5Var.d(intValue2);
                    Object K4 = oq5Var.K();
                    if (d || K4 == obj3) {
                        K4 = new k3e(intValue3, intValue2, 2);
                        oq5Var.k0(K4);
                    }
                    vwb.q(this.c, this.d, st4Var, F, this.e, n0, e0, h, (Function1) K4, ild.C(163423060, new xu0(18, z), oq5Var), c, oq5Var, 113246208);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(1770516641, new tkl(this.b, this.c, this.d, this.e, this.f, 0), oq5Var2), oq5Var2, 432, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(1859638768, new tkl(this.b, this.c, this.d, this.e, this.f, 3), oq5Var3), oq5Var3, 432, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                hq5 hq5Var4 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(1 & intValue6, (intValue6 & 3) != 2)) {
                    jx7 jx7Var2 = (jx7) oq5Var4.j(es5.h);
                    boolean f6 = oq5Var4.f(jx7Var2);
                    Object K5 = oq5Var4.K();
                    if (f6 || K5 == obj3) {
                        K5 = Integer.valueOf((int) Math.ceil(jx7Var2.n0(cub.c)));
                        oq5Var4.k0(K5);
                    }
                    int intValue7 = ((Number) K5).intValue();
                    float f7 = r43.a;
                    float p2 = w1g.p(r43.b(), 0, oq5Var4, 0, 2);
                    agr agrVar = lkg.a;
                    float f8 = 16;
                    float a2 = ((o0k) oq5Var4.j(agrVar)).a() + ((o0k) oq5Var4.j(agrVar)).d() + p2 + f8 + f8;
                    boolean f9 = oq5Var4.f(jx7Var2);
                    Object K6 = oq5Var4.K();
                    if (f9 || K6 == obj3) {
                        K6 = Integer.valueOf((int) Math.ceil(jx7Var2.n0(a2) + jx7Var2.n0(cub.c)));
                        oq5Var4.k0(K6);
                    }
                    int intValue8 = ((Number) K6).intValue();
                    boolean f10 = oq5Var4.f(imlVar);
                    Object K7 = oq5Var4.K();
                    if (f10 || K7 == obj3) {
                        K7 = imlVar.a();
                        oq5Var4.k0(K7);
                    }
                    st4 st4Var2 = (st4) K7;
                    bb0 n02 = j66.n0(oq5Var4);
                    float F2 = tt0.F(oq5Var4);
                    f83 e02 = etn.e0(oq5Var4);
                    List h2 = u75.h("PLAYER_ARTISTS_INFO", "PLAYER_ARTISTS_CONCERTS", "TRACK_SIMILAR_ENTITIES");
                    yci c2 = d.c(vciVar, 1.0f);
                    boolean d2 = oq5Var4.d(intValue8) | oq5Var4.d(intValue7);
                    Object K8 = oq5Var4.K();
                    if (d2 || K8 == obj3) {
                        K8 = new k3e(intValue8, intValue7, 3);
                        oq5Var4.k0(K8);
                    }
                    cxb.l(this.c, this.d, st4Var2, F2, this.e, n02, e02, h2, (Function1) K8, ild.C(912081972, new xu0(19, z), oq5Var4), c2, oq5Var4, 113246208);
                } else {
                    oq5Var4.S();
                }
                break;
        }
        return Unit.a;
    }
}
