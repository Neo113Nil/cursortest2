package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qi8 implements gip, py7 {
    public final t6f a;

    public qi8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final pi8 a(t7k t7kVar, JSONObject jSONObject) {
        return new pi8((wx9) etn.O(t7kVar, jSONObject, Constants.KEY_VALUE, this.a.F9), e5f.b(t7kVar, jSONObject, "variable_name", vct.c, bcx.i, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pi8 pi8Var) {
        JSONObject w = ouj.w(t7kVar, "type", "set_variable");
        etn.m0(t7kVar, w, Constants.KEY_VALUE, pi8Var.a, this.a.F9);
        e5f.g(t7kVar, w, "variable_name", pi8Var.b);
        return w;
    }
}
