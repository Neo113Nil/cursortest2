package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class si8 implements u8s {
    public final t6f a;

    public si8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pi8 a(t7k t7kVar, ti8 ti8Var, JSONObject jSONObject) {
        c9c c9cVar = ti8Var.a;
        t6f t6fVar = this.a;
        return new pi8((wx9) h4a.D(t7kVar, c9cVar, jSONObject, Constants.KEY_VALUE, t6fVar.H9, t6fVar.F9), h4a.F(t7kVar, ti8Var.b, jSONObject, "variable_name", vct.c));
    }
}
