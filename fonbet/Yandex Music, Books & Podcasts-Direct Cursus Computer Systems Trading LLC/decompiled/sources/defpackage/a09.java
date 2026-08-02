package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a09 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, vz8 vz8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "down", vz8Var.a);
        e5f.g(t7kVar, jSONObject, "forward", vz8Var.b);
        e5f.g(t7kVar, jSONObject, "left", vz8Var.c);
        e5f.g(t7kVar, jSONObject, "right", vz8Var.d);
        e5f.g(t7kVar, jSONObject, "up", vz8Var.e);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.c;
        szb c = e5f.c(t7kVar, jSONObject, "down");
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        return new vz8(c, e5f.e(t7kVar, jSONObject, "forward", ox8Var, s3fVar, ns9Var, null), e5f.e(t7kVar, jSONObject, "left", ox8Var, s3fVar, ns9Var, null), e5f.e(t7kVar, jSONObject, "right", ox8Var, s3fVar, ns9Var, null), e5f.e(t7kVar, jSONObject, "up", ox8Var, s3fVar, ns9Var, null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (vz8) obj);
    }
}
