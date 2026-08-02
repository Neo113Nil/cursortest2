package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gr9 implements gip, r8s {
    public final t6f a;

    public gr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new vt9(y2x.R(Y, jSONObject, "actions", d, null, t6fVar.u1), y2x.R(Y, jSONObject, "images", d, null, t6fVar.T8), y2x.R(Y, jSONObject, "ranges", d, null, t6fVar.Q8), y2x.J(Y, jSONObject, "text", vct.c, d, null));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, vt9 vt9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = vt9Var.a;
        t6f t6fVar = this.a;
        y2x.k0(t7kVar, jSONObject, "actions", c9cVar, t6fVar.u1);
        y2x.k0(t7kVar, jSONObject, "images", vt9Var.b, t6fVar.T8);
        y2x.k0(t7kVar, jSONObject, "ranges", vt9Var.c, t6fVar.Q8);
        y2x.f0(t7kVar, jSONObject, "text", vt9Var.d);
        return jSONObject;
    }
}
