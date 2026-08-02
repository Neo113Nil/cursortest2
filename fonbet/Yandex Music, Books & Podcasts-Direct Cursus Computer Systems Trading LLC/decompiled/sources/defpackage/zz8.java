package defpackage;

import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zz8 implements gip, r8s {
    public final t6f a;

    public zz8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.P1;
        jyr jyrVar2 = t6fVar.u1;
        return new d09(y2x.R(Y, jSONObject, C0479n3.g, d, null, jyrVar), y2x.N(Y, jSONObject, "border", d, null, t6fVar.V1), y2x.N(Y, jSONObject, "next_focus_ids", d, null, t6fVar.P3), y2x.R(Y, jSONObject, "on_blur", d, null, jyrVar2), y2x.R(Y, jSONObject, "on_focus", d, null, jyrVar2));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, d09 d09Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = d09Var.a;
        t6f t6fVar = this.a;
        y2x.k0(t7kVar, jSONObject, C0479n3.g, c9cVar, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", d09Var.b, t6fVar.V1);
        y2x.i0(t7kVar, jSONObject, "next_focus_ids", d09Var.c, t6fVar.P3);
        c9c c9cVar2 = d09Var.d;
        jyr jyrVar = t6fVar.u1;
        y2x.k0(t7kVar, jSONObject, "on_blur", c9cVar2, jyrVar);
        y2x.k0(t7kVar, jSONObject, "on_focus", d09Var.e, jyrVar);
        return jSONObject;
    }
}
