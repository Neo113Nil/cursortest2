package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rr8 implements gip, r8s {
    public final t6f a;

    public rr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new wr8(y2x.J(Y, jSONObject, "data", vct.g, d, null), y2x.O(Y, jSONObject, "data_element_name", d, null, bcx.i), y2x.L(Y, jSONObject, "prototypes", d, null, this.a.q2, vq2.o));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, wr8 wr8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "data", wr8Var.a);
        y2x.h0(t7kVar, jSONObject, "data_element_name", wr8Var.b);
        y2x.k0(t7kVar, jSONObject, "prototypes", wr8Var.c, this.a.q2);
        return jSONObject;
    }
}
