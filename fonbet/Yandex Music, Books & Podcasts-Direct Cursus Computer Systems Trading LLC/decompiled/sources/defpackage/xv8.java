package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xv8 implements gip, r8s {
    public final t6f a;

    public xv8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        c9c R = y2x.R(Y, jSONObject, "functions", d, null, t6fVar.V3);
        c9c G = y2x.G(Y, jSONObject, "log_id", d, null);
        jyr jyrVar = t6fVar.Q2;
        rj7 rj7Var = yv8.c;
        rj7Var.getClass();
        return new fw8(R, G, y2x.L(Y, jSONObject, "states", d, null, jyrVar, rj7Var), y2x.R(Y, jSONObject, "timers", d, null, t6fVar.c9), y2x.P(Y, jSONObject, "transition_animation_selector", yv8.b, d, null, vq9.x0, bcx.h), y2x.R(Y, jSONObject, "variable_triggers", d, null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, null, t6fVar.J9));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, fw8 fw8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = fw8Var.a;
        t6f t6fVar = this.a;
        y2x.k0(t7kVar, jSONObject, "functions", c9cVar, t6fVar.V3);
        y2x.h0(t7kVar, jSONObject, "log_id", fw8Var.b);
        y2x.k0(t7kVar, jSONObject, "states", fw8Var.c, t6fVar.Q2);
        y2x.k0(t7kVar, jSONObject, "timers", fw8Var.d, t6fVar.c9);
        y2x.e0(fw8Var.e, t7kVar, "transition_animation_selector", vq9.y0, jSONObject);
        y2x.k0(t7kVar, jSONObject, "variable_triggers", fw8Var.f, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", fw8Var.g, t6fVar.J9);
        return jSONObject;
    }
}
