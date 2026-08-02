package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ws9 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new ys9(y2x.P(y1g.Y(t7kVar), jSONObject, "is_enabled", vct.a, t7kVar.d(), null, kzj.B, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "is_enabled", ((ys9) obj).a);
        return jSONObject;
    }
}
