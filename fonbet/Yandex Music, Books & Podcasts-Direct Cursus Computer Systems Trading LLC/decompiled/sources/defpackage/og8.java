package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class og8 implements gip, py7 {
    public final t6f a;

    public og8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.t1;
        return new zc8((bd8) etn.U(t7kVar, jSONObject, Constants.KEY_ACTION, jyrVar), etn.Y(t7kVar, jSONObject, "actions", jyrVar), e5f.b(t7kVar, jSONObject, "text", vct.c, bcx.i, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, zc8 zc8Var) {
        JSONObject jSONObject = new JSONObject();
        bd8 bd8Var = zc8Var.a;
        jyr jyrVar = this.a.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar);
        etn.n0(t7kVar, jSONObject, "actions", zc8Var.b, jyrVar);
        e5f.g(t7kVar, jSONObject, "text", zc8Var.c);
        return jSONObject;
    }
}
