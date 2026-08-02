package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class od8 implements gip, py7 {
    public final t6f a;

    public od8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nd8 a(t7k t7kVar, JSONObject jSONObject) {
        return new nd8(e5f.d(t7kVar, jSONObject, "index", vct.b, kzj.F), (wx9) etn.O(t7kVar, jSONObject, Constants.KEY_VALUE, this.a.F9), e5f.b(t7kVar, jSONObject, "variable_name", vct.c, bcx.i, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, nd8 nd8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "index", nd8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "array_insert_value");
        etn.m0(t7kVar, jSONObject, Constants.KEY_VALUE, nd8Var.b, this.a.F9);
        e5f.g(t7kVar, jSONObject, "variable_name", nd8Var.c);
        return jSONObject;
    }
}
