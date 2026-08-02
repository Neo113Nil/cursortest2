package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qd8 implements u8s {
    public final t6f a;

    public qd8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nd8 a(t7k t7kVar, rd8 rd8Var, JSONObject jSONObject) {
        szb O = h4a.O(t7kVar, rd8Var.a, jSONObject, "index", vct.b, kzj.F);
        c9c c9cVar = rd8Var.b;
        t6f t6fVar = this.a;
        return new nd8(O, (wx9) h4a.D(t7kVar, c9cVar, jSONObject, Constants.KEY_VALUE, t6fVar.H9, t6fVar.F9), h4a.F(t7kVar, rd8Var.c, jSONObject, "variable_name", vct.c));
    }
}
