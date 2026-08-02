package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ri8 implements gip, r8s {
    public final t6f a;

    public ri8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final ti8 c(t7k t7kVar, ti8 ti8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new ti8(y2x.H(Y, jSONObject, Constants.KEY_VALUE, d, ti8Var != null ? ti8Var.a : null, this.a.G9), y2x.J(Y, jSONObject, "variable_name", vct.c, d, ti8Var != null ? ti8Var.b : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ti8 ti8Var) {
        JSONObject w = ouj.w(t7kVar, "type", "set_variable");
        y2x.i0(t7kVar, w, Constants.KEY_VALUE, ti8Var.a, this.a.G9);
        y2x.f0(t7kVar, w, "variable_name", ti8Var.b);
        return w;
    }
}
