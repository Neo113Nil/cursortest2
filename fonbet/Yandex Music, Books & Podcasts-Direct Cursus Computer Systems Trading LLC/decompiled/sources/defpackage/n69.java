package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n69 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "allow_empty", ox8Var, d, null, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.c;
        s3f s3fVar = bcx.i;
        return new p69(P, y2x.P(Y, jSONObject, "label_id", ox8Var2, d, null, s3fVar, ns9Var), y2x.O(Y, jSONObject, "variable", d, null, s3fVar));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        p69 p69Var = (p69) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "allow_empty", p69Var.a);
        y2x.f0(t7kVar, jSONObject, "label_id", p69Var.b);
        y2x.h0(t7kVar, jSONObject, "variable", p69Var.c);
        return jSONObject;
    }
}
