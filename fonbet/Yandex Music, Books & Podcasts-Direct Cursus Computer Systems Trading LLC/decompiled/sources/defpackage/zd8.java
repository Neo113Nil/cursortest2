package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zd8 implements gip, r8s {
    public final t6f a;

    public zd8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final be8 c(t7k t7kVar, be8 be8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new be8(y2x.K(Y, jSONObject, "index", vct.b, d, be8Var != null ? be8Var.a : null, kzj.F, bcx.h), y2x.H(Y, jSONObject, Constants.KEY_VALUE, d, be8Var != null ? be8Var.b : null, this.a.G9), y2x.J(Y, jSONObject, "variable_name", vct.c, d, be8Var != null ? be8Var.c : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, be8 be8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "index", be8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "array_set_value");
        y2x.i0(t7kVar, jSONObject, Constants.KEY_VALUE, be8Var.b, this.a.G9);
        y2x.f0(t7kVar, jSONObject, "variable_name", be8Var.c);
        return jSONObject;
    }
}
