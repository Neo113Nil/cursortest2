package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ez9 implements u8s {
    public final t6f a;

    public ez9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zy9 a(t7k t7kVar, oz9 oz9Var, JSONObject jSONObject) {
        ns9 ns9Var = bcx.h;
        s3f s3fVar = bcx.i;
        boolean z = oz9Var instanceof mz9;
        t6f t6fVar = this.a;
        if (z) {
            zir zirVar = (zir) t6fVar.Ma.getValue();
            ajr ajrVar = ((mz9) oz9Var).a;
            zirVar.getClass();
            return new xy9(new wir(h4a.F(t7kVar, ajrVar.b, jSONObject, Constants.KEY_VALUE, vct.c), (String) h4a.C(ajrVar.a, jSONObject, "name", s3fVar, ns9Var)));
        }
        if (oz9Var instanceof kz9) {
            mhj mhjVar = (mhj) t6fVar.xa.getValue();
            nhj nhjVar = ((kz9) oz9Var).a;
            mhjVar.getClass();
            return new vy9(new jhj(h4a.G(t7kVar, nhjVar.b, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E), (String) h4a.C(nhjVar.a, jSONObject, "name", s3fVar, ns9Var)));
        }
        if (oz9Var instanceof jz9) {
            mre mreVar = (mre) t6fVar.oa.getValue();
            nre nreVar = ((jz9) oz9Var).a;
            mreVar.getClass();
            return new uy9(new jre(h4a.G(t7kVar, nreVar.b, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F), (String) h4a.C(nreVar.a, jSONObject, "name", s3fVar, ns9Var)));
        }
        if (oz9Var instanceof gz9) {
            bc3 bc3Var = (bc3) t6fVar.l.getValue();
            cc3 cc3Var = ((gz9) oz9Var).a;
            bc3Var.getClass();
            return new ry9(new yb3(h4a.G(t7kVar, cc3Var.b, jSONObject, Constants.KEY_VALUE, vct.a, kzj.B), (String) h4a.C(cc3Var.a, jSONObject, "name", s3fVar, ns9Var)));
        }
        if (oz9Var instanceof hz9) {
            ja5 ja5Var = (ja5) t6fVar.r.getValue();
            ka5 ka5Var = ((hz9) oz9Var).a;
            ja5Var.getClass();
            return new sy9(new ga5(h4a.G(t7kVar, ka5Var.b, jSONObject, Constants.KEY_VALUE, vct.f, kzj.G), (String) h4a.C(ka5Var.a, jSONObject, "name", s3fVar, ns9Var)));
        }
        if (oz9Var instanceof nz9) {
            tqt tqtVar = (tqt) t6fVar.Sa.getValue();
            uqt uqtVar = ((nz9) oz9Var).a;
            tqtVar.getClass();
            return new yy9(new qqt(h4a.G(t7kVar, uqtVar.b, jSONObject, Constants.KEY_VALUE, vct.e, kzj.C), (String) h4a.C(uqtVar.a, jSONObject, "name", s3fVar, ns9Var)));
        }
        if (oz9Var instanceof iz9) {
            p28 p28Var = (p28) t6fVar.D.getValue();
            q28 q28Var = ((iz9) oz9Var).a;
            p28Var.getClass();
            return new ty9(new m28(h4a.F(t7kVar, q28Var.b, jSONObject, Constants.KEY_VALUE, vct.h), (String) h4a.C(q28Var.a, jSONObject, "name", s3fVar, ns9Var)));
        }
        if (!(oz9Var instanceof fz9)) {
            if (oz9Var instanceof lz9) {
                return new wy9(((hym) t6fVar.Da.getValue()).a(t7kVar, ((lz9) oz9Var).a, jSONObject));
            }
            b6e.s();
            return null;
        }
        nz0 nz0Var = (nz0) t6fVar.f.getValue();
        oz0 oz0Var = ((fz9) oz9Var).a;
        nz0Var.getClass();
        return new qy9(new kz0(h4a.F(t7kVar, oz0Var.b, jSONObject, Constants.KEY_VALUE, vct.g), (String) h4a.C(oz0Var.a, jSONObject, "name", s3fVar, ns9Var)));
    }
}
