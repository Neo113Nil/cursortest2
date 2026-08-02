package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cw8 implements gip, r8s {
    public final t6f a;

    public cw8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new ew8(y2x.H(Y, jSONObject, "div", d, null, this.a.ba), y2x.I(Y, jSONObject, "state_id", d, null, kzj.F, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        ew8 ew8Var = (ew8) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "div", ew8Var.a, this.a.ba);
        y2x.h0(t7kVar, jSONObject, "state_id", ew8Var.b);
        return jSONObject;
    }
}
