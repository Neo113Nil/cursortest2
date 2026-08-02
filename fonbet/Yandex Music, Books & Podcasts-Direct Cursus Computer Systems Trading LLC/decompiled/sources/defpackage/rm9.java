package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rm9 implements gip, r8s {
    public final t6f a;

    public rm9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new sm9(y2x.N(Y, jSONObject, "animation_in", d, null, t6fVar.A1), y2x.N(Y, jSONObject, "animation_out", d, null, t6fVar.A1), y2x.N(Y, jSONObject, "div", d, null, t6fVar.ba), y2x.G(Y, jSONObject, "state_id", d, null), y2x.R(Y, jSONObject, "swipe_out_actions", d, null, t6fVar.u1));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sm9 sm9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = sm9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.A1;
        y2x.i0(t7kVar, jSONObject, "animation_in", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "animation_out", sm9Var.b, jyrVar);
        y2x.i0(t7kVar, jSONObject, "div", sm9Var.c, t6fVar.ba);
        y2x.h0(t7kVar, jSONObject, "state_id", sm9Var.d);
        y2x.k0(t7kVar, jSONObject, "swipe_out_actions", sm9Var.e, t6fVar.u1);
        return jSONObject;
    }
}
