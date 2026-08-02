package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dm8 implements gip, r8s {
    public final t6f a;

    public dm8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final fm8 c(t7k t7kVar, fm8 fm8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        return new fm8(y2x.K(Y, jSONObject, "path", ox8Var, d, fm8Var != null ? fm8Var.a : null, bcx.i, jf0.n), y2x.H(Y, jSONObject, Constants.KEY_VALUE, d, fm8Var != null ? fm8Var.b : null, this.a.G9), y2x.J(Y, jSONObject, "variable_name", ox8Var, d, fm8Var != null ? fm8Var.c : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, fm8 fm8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "path", fm8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "update_structure");
        y2x.i0(t7kVar, jSONObject, Constants.KEY_VALUE, fm8Var.b, this.a.G9);
        y2x.f0(t7kVar, jSONObject, "variable_name", fm8Var.c);
        return jSONObject;
    }
}
