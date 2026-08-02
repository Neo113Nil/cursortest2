package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cm8 implements gip, py7 {
    public final t6f a;

    public cm8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bm8 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.c;
        lc8 lc8Var = jf0.n;
        s3f s3fVar = bcx.i;
        return new bm8(e5f.b(t7kVar, jSONObject, "path", ox8Var, s3fVar, lc8Var), (wx9) etn.O(t7kVar, jSONObject, Constants.KEY_VALUE, this.a.F9), e5f.b(t7kVar, jSONObject, "variable_name", ox8Var, s3fVar, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bm8 bm8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "path", bm8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "update_structure");
        etn.m0(t7kVar, jSONObject, Constants.KEY_VALUE, bm8Var.b, this.a.F9);
        e5f.g(t7kVar, jSONObject, "variable_name", bm8Var.c);
        return jSONObject;
    }
}
