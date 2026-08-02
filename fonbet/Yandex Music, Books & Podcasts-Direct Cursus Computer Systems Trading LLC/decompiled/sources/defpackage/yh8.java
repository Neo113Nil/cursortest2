package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yh8 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        return new th8(e5f.d(t7kVar, jSONObject, "end", ox8Var, kzjVar), e5f.b(t7kVar, jSONObject, "start", ox8Var, kzjVar, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        th8 th8Var = (th8) obj;
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "end", th8Var.a);
        e5f.g(t7kVar, jSONObject, "start", th8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "absolute");
        return jSONObject;
    }
}
