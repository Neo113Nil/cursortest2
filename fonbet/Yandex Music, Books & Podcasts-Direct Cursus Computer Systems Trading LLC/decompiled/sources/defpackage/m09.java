package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m09 implements gip, r8s {
    public final t6f a;

    public m09(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        c9c V;
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        try {
            V = new a9c(etn.T(Y, jSONObject, "arguments", this.a.S3), d);
        } catch (z7k e) {
            if (e.a != b8k.b) {
                throw e;
            }
            V = y2x.V(d, y2x.U(Y, jSONObject, "arguments"), null);
            if (V == null) {
                throw e;
            }
        }
        return new n09(V, y2x.G(Y, jSONObject, "body", d, null), y2x.I(Y, jSONObject, "name", d, null, bcx.i, sk3.g), y2x.I(Y, jSONObject, "return_type", d, null, vv8.v, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, n09 n09Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.k0(t7kVar, jSONObject, "arguments", n09Var.a, this.a.S3);
        y2x.h0(t7kVar, jSONObject, "body", n09Var.b);
        y2x.h0(t7kVar, jSONObject, "name", n09Var.c);
        c9c c9cVar = n09Var.d;
        if (c9cVar instanceof a9c) {
            Object obj = ((a9c) c9cVar).c;
            if (obj != null) {
                try {
                    jSONObject.put("return_type", ((nx8) obj).a);
                } catch (JSONException e) {
                    t7kVar.a().a(e);
                }
            }
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat("return_type"), ((z8c) c9cVar).c);
        }
        return jSONObject;
    }
}
