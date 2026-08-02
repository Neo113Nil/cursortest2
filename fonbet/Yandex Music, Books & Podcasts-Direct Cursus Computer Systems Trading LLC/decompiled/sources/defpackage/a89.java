package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a89 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        s3f s3fVar = bcx.i;
        return new b89(y2x.O(Y, jSONObject, "height_variable_name", d, null, s3fVar), y2x.O(Y, jSONObject, "width_variable_name", d, null, s3fVar));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        b89 b89Var = (b89) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "height_variable_name", b89Var.a);
        y2x.h0(t7kVar, jSONObject, "width_variable_name", b89Var.b);
        return jSONObject;
    }
}
