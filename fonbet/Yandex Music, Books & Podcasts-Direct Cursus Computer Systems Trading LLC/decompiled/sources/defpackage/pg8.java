package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pg8 implements gip, r8s {
    public final t6f a;

    public pg8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new oj8(y2x.N(Y, jSONObject, Constants.KEY_ACTION, d, null, t6fVar.u1), y2x.R(Y, jSONObject, "actions", d, null, t6fVar.u1), y2x.J(Y, jSONObject, "text", vct.c, d, null));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, oj8 oj8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = oj8Var.a;
        jyr jyrVar = this.a.u1;
        y2x.i0(t7kVar, jSONObject, Constants.KEY_ACTION, c9cVar, jyrVar);
        y2x.k0(t7kVar, jSONObject, "actions", oj8Var.b, jyrVar);
        y2x.f0(t7kVar, jSONObject, "text", oj8Var.c);
        return jSONObject;
    }
}
