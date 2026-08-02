package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n99 implements gip, r8s {
    public final t6f a;

    public n99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final p99 c(t7k t7kVar, p99 p99Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new p99(y2x.K(Y, jSONObject, "image_url", vct.e, d, p99Var != null ? p99Var.a : null, kzj.C, bcx.h), y2x.H(Y, jSONObject, "insets", d, p99Var != null ? p99Var.b : null, this.a.F));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, p99 p99Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(p99Var.a, t7kVar, "image_url", kzj.H, jSONObject);
        y2x.i0(t7kVar, jSONObject, "insets", p99Var.b, this.a.F);
        etn.l0(t7kVar, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
