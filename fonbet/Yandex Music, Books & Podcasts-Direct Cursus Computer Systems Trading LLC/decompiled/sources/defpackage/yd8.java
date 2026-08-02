package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yd8 implements gip, py7 {
    public final t6f a;

    public yd8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xd8 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = bcx.h;
        return new xd8(e5f.b(t7kVar, jSONObject, "index", ox8Var, kzjVar, ns9Var), (wx9) etn.O(t7kVar, jSONObject, Constants.KEY_VALUE, this.a.F9), e5f.b(t7kVar, jSONObject, "variable_name", vct.c, bcx.i, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xd8 xd8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "index", xd8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "array_set_value");
        etn.m0(t7kVar, jSONObject, Constants.KEY_VALUE, xd8Var.b, this.a.F9);
        e5f.g(t7kVar, jSONObject, "variable_name", xd8Var.c);
        return jSONObject;
    }
}
