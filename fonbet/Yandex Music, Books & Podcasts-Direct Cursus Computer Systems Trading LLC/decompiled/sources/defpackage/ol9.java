package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ol9 implements gip, py7 {
    public final t6f a;

    public ol9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        szb d = e5f.d(t7kVar, jSONObject, "end", ox8Var, kzjVar);
        t6f t6fVar = this.a;
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", t6fVar.h3);
        szb e = e5f.e(t7kVar, jSONObject, "start", ox8Var, kzjVar, bcx.h, null);
        jyr jyrVar = t6fVar.e3;
        return new xk9(d, ix8Var, e, (dx8) etn.U(t7kVar, jSONObject, "track_active_style", jyrVar), (dx8) etn.U(t7kVar, jSONObject, "track_inactive_style", jyrVar));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xk9 xk9Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "end", xk9Var.a);
        ix8 ix8Var = xk9Var.b;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "margins", ix8Var, t6fVar.h3);
        e5f.g(t7kVar, jSONObject, "start", xk9Var.c);
        dx8 dx8Var = xk9Var.d;
        jyr jyrVar = t6fVar.e3;
        etn.m0(t7kVar, jSONObject, "track_active_style", dx8Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "track_inactive_style", xk9Var.e, jyrVar);
        return jSONObject;
    }
}
