package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wf8 implements u8s {
    public final t6f a;

    public wf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tf8 a(t7k t7kVar, xf8 xf8Var, JSONObject jSONObject) {
        c9c c9cVar = xf8Var.a;
        t6f t6fVar = this.a;
        return new tf8(h4a.V(t7kVar, c9cVar, jSONObject, "on_fail_actions", t6fVar.v1, t6fVar.t1), h4a.V(t7kVar, xf8Var.b, jSONObject, "on_success_actions", t6fVar.v1, t6fVar.t1), h4a.G(t7kVar, xf8Var.c, jSONObject, "url", vct.e, kzj.C));
    }
}
