package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gu8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, fu8 fu8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "bottom-left", fu8Var.a);
        e5f.g(t7kVar, jSONObject, "bottom-right", fu8Var.b);
        e5f.g(t7kVar, jSONObject, "top-left", fu8Var.c);
        e5f.g(t7kVar, jSONObject, "top-right", fu8Var.d);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        return new fu8(e5f.e(t7kVar, jSONObject, "bottom-left", ox8Var, kzjVar, bg3.f, null), e5f.e(t7kVar, jSONObject, "bottom-right", ox8Var, kzjVar, bg3.g, null), e5f.e(t7kVar, jSONObject, "top-left", ox8Var, kzjVar, bg3.h, null), e5f.e(t7kVar, jSONObject, "top-right", ox8Var, kzjVar, bg3.i, null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (fu8) obj);
    }
}
