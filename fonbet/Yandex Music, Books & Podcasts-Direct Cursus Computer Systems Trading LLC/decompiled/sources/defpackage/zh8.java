package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zh8 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = bcx.h;
        return new ai8(y2x.P(Y, jSONObject, "end", ox8Var, d, null, kzjVar, ns9Var), y2x.K(Y, jSONObject, "start", ox8Var, d, null, kzjVar, ns9Var));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        ai8 ai8Var = (ai8) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "end", ai8Var.a);
        y2x.f0(t7kVar, jSONObject, "start", ai8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "absolute");
        return jSONObject;
    }
}
