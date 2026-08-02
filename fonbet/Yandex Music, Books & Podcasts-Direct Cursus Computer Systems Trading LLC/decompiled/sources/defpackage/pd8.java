package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pd8 implements gip, r8s {
    public final t6f a;

    public pd8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final rd8 c(t7k t7kVar, rd8 rd8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new rd8(y2x.P(Y, jSONObject, "index", vct.b, d, rd8Var != null ? rd8Var.a : null, kzj.F, bcx.h), y2x.H(Y, jSONObject, Constants.KEY_VALUE, d, rd8Var != null ? rd8Var.b : null, this.a.G9), y2x.J(Y, jSONObject, "variable_name", vct.c, d, rd8Var != null ? rd8Var.c : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, rd8 rd8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "index", rd8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "array_insert_value");
        y2x.i0(t7kVar, jSONObject, Constants.KEY_VALUE, rd8Var.b, this.a.G9);
        y2x.f0(t7kVar, jSONObject, "variable_name", rd8Var.c);
        return jSONObject;
    }
}
