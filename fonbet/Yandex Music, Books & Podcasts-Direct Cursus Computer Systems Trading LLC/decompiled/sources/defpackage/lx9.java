package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lx9 implements gip, r8s {
    public final t6f a;

    public lx9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        jyr jyrVar = this.a.u1;
        y19 y19Var = mx9.c;
        y19Var.getClass();
        c9c L = y2x.L(Y, jSONObject, "actions", d, null, jyrVar, y19Var);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ns9 ns9Var = bcx.h;
        return new nx9(L, y2x.K(Y, jSONObject, "condition", ox8Var, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "mode", mx9.b, d, null, vq9.A0, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, nx9 nx9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.k0(t7kVar, jSONObject, "actions", nx9Var.a, this.a.u1);
        y2x.f0(t7kVar, jSONObject, "condition", nx9Var.b);
        y2x.e0(nx9Var.c, t7kVar, "mode", vq9.B0, jSONObject);
        return jSONObject;
    }
}
