package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class li8 implements gip, r8s {
    public final t6f a;

    public li8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final oi8 c(t7k t7kVar, oi8 oi8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        c9c c9cVar = oi8Var != null ? oi8Var.a : null;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = bcx.h;
        return new oi8(y2x.K(Y, jSONObject, "lifetime", ox8Var, d, c9cVar, kzjVar, ns9Var), y2x.J(Y, jSONObject, "name", vct.c, d, oi8Var != null ? oi8Var.b : null), y2x.P(Y, jSONObject, "scope", ni8.a, d, oi8Var != null ? oi8Var.c : null, va8.F, ns9Var), y2x.H(Y, jSONObject, Constants.KEY_VALUE, d, oi8Var != null ? oi8Var.d : null, this.a.G9));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, oi8 oi8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "lifetime", oi8Var.a);
        y2x.f0(t7kVar, jSONObject, "name", oi8Var.b);
        y2x.e0(oi8Var.c, t7kVar, "scope", va8.G, jSONObject);
        etn.l0(t7kVar, jSONObject, "type", "set_stored_value");
        y2x.i0(t7kVar, jSONObject, Constants.KEY_VALUE, oi8Var.d, this.a.G9);
        return jSONObject;
    }
}
