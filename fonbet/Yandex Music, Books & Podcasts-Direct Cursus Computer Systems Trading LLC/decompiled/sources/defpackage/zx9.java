package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zx9 implements u8s {
    public final t6f a;

    public zx9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wx9 a(t7k t7kVar, iy9 iy9Var, JSONObject jSONObject) {
        boolean z = iy9Var instanceof gy9;
        t6f t6fVar = this.a;
        if (z) {
            uir uirVar = (uir) t6fVar.Ja.getValue();
            vir virVar = ((gy9) iy9Var).a;
            uirVar.getClass();
            return new ux9(new rir(h4a.F(t7kVar, virVar.a, jSONObject, Constants.KEY_VALUE, vct.c)));
        }
        if (iy9Var instanceof ey9) {
            gre greVar = (gre) t6fVar.la.getValue();
            ire ireVar = ((ey9) iy9Var).a;
            greVar.getClass();
            return new sx9(new dre(h4a.G(t7kVar, ireVar.a, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F)));
        }
        if (iy9Var instanceof fy9) {
            ghj ghjVar = (ghj) t6fVar.ua.getValue();
            ihj ihjVar = ((fy9) iy9Var).a;
            ghjVar.getClass();
            return new tx9(new dhj(h4a.G(t7kVar, ihjVar.a, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E)));
        }
        if (iy9Var instanceof cy9) {
            ea5 ea5Var = (ea5) t6fVar.o.getValue();
            fa5 fa5Var = ((cy9) iy9Var).a;
            ea5Var.getClass();
            return new qx9(new ba5(h4a.G(t7kVar, fa5Var.a, jSONObject, Constants.KEY_VALUE, vct.f, kzj.G)));
        }
        if (iy9Var instanceof by9) {
            wb3 wb3Var = (wb3) t6fVar.i.getValue();
            xb3 xb3Var = ((by9) iy9Var).a;
            wb3Var.getClass();
            return new px9(new tb3(h4a.G(t7kVar, xb3Var.a, jSONObject, Constants.KEY_VALUE, vct.a, kzj.B)));
        }
        if (iy9Var instanceof hy9) {
            oqt oqtVar = (oqt) t6fVar.Pa.getValue();
            pqt pqtVar = ((hy9) iy9Var).a;
            oqtVar.getClass();
            return new vx9(new lqt(h4a.G(t7kVar, pqtVar.a, jSONObject, Constants.KEY_VALUE, vct.e, kzj.C)));
        }
        if (iy9Var instanceof dy9) {
            k28 k28Var = (k28) t6fVar.A.getValue();
            l28 l28Var = ((dy9) iy9Var).a;
            k28Var.getClass();
            return new rx9(new h28(h4a.F(t7kVar, l28Var.a, jSONObject, Constants.KEY_VALUE, vct.h)));
        }
        if (!(iy9Var instanceof ay9)) {
            b6e.s();
            return null;
        }
        hz0 hz0Var = (hz0) t6fVar.c.getValue();
        iz0 iz0Var = ((ay9) iy9Var).a;
        hz0Var.getClass();
        return new ox9(new ez0(h4a.F(t7kVar, iz0Var.a, jSONObject, Constants.KEY_VALUE, vct.g)));
    }
}
