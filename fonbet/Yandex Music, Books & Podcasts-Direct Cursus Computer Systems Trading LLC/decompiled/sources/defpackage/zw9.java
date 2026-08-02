package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zw9 implements gip, r8s {
    public final t6f a;

    public zw9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final bx9 c(t7k t7kVar, bx9 bx9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = bx9Var != null ? bx9Var.a : null;
        t6f t6fVar = this.a;
        return new bx9(y2x.N(Y, jSONObject, "x", d, c9cVar, t6fVar.A9), y2x.N(Y, jSONObject, "y", d, bx9Var != null ? bx9Var.b : null, t6fVar.A9));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bx9 bx9Var) {
        JSONObject w = ouj.w(t7kVar, "type", "translation");
        c9c c9cVar = bx9Var.a;
        jyr jyrVar = this.a.A9;
        y2x.i0(t7kVar, w, "x", c9cVar, jyrVar);
        y2x.i0(t7kVar, w, "y", bx9Var.b, jyrVar);
        return w;
    }
}
