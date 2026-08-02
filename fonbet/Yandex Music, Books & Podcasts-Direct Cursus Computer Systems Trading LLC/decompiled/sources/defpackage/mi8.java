package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mi8 implements u8s {
    public final t6f a;

    public mi8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ji8 a(t7k t7kVar, oi8 oi8Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, oi8Var.a, jSONObject, "lifetime", vct.b, kzj.F);
        szb F = h4a.F(t7kVar, oi8Var.b, jSONObject, "name", vct.c);
        szb O = h4a.O(t7kVar, oi8Var.c, jSONObject, "scope", ni8.a, va8.F);
        c9c c9cVar = oi8Var.d;
        t6f t6fVar = this.a;
        return new ji8(G, F, O, (wx9) h4a.D(t7kVar, c9cVar, jSONObject, Constants.KEY_VALUE, t6fVar.H9, t6fVar.F9));
    }
}
