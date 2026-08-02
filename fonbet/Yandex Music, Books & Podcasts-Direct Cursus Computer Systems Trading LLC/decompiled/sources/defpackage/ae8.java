package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ae8 implements u8s {
    public final t6f a;

    public ae8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xd8 a(t7k t7kVar, be8 be8Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, be8Var.a, jSONObject, "index", vct.b, kzj.F);
        c9c c9cVar = be8Var.b;
        t6f t6fVar = this.a;
        return new xd8(G, (wx9) h4a.D(t7kVar, c9cVar, jSONObject, Constants.KEY_VALUE, t6fVar.H9, t6fVar.F9), h4a.F(t7kVar, be8Var.c, jSONObject, "variable_name", vct.c));
    }
}
