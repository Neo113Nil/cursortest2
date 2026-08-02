package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gp9 implements gip, r8s {
    public final t6f a;

    public gp9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new sp9(y2x.H(Y, jSONObject, "div", d, null, t6fVar.ba), y2x.J(Y, jSONObject, "title", vct.c, d, null), y2x.N(Y, jSONObject, "title_click_action", d, null, t6fVar.u1));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sp9 sp9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = sp9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "div", c9cVar, t6fVar.ba);
        y2x.f0(t7kVar, jSONObject, "title", sp9Var.b);
        y2x.i0(t7kVar, jSONObject, "title_click_action", sp9Var.c, t6fVar.u1);
        return jSONObject;
    }
}
