package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mc8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, kc8 kc8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "bottom", kc8Var.a);
        e5f.g(t7kVar, jSONObject, "left", kc8Var.b);
        e5f.g(t7kVar, jSONObject, "right", kc8Var.c);
        e5f.g(t7kVar, jSONObject, "top", kc8Var.d);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v3, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        lc8 lc8Var = pc8.e;
        ozb ozbVar = pc8.a;
        szb e = e5f.e(t7kVar, jSONObject, "bottom", ox8Var, kzjVar, lc8Var, ozbVar);
        if (e == null) {
            e = ozbVar;
        }
        lc8 lc8Var2 = pc8.f;
        ozb ozbVar2 = pc8.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "left", ox8Var, kzjVar, lc8Var2, ozbVar2);
        if (e2 == null) {
            e2 = ozbVar2;
        }
        lc8 lc8Var3 = pc8.g;
        ozb ozbVar3 = pc8.c;
        ?? e3 = e5f.e(t7kVar, jSONObject, "right", ox8Var, kzjVar, lc8Var3, ozbVar3);
        ozb ozbVar4 = e3 == 0 ? ozbVar3 : e3;
        lc8 lc8Var4 = pc8.h;
        ozb ozbVar5 = pc8.d;
        ?? e4 = e5f.e(t7kVar, jSONObject, "top", ox8Var, kzjVar, lc8Var4, ozbVar5);
        if (e4 != 0) {
            ozbVar5 = e4;
        }
        return new kc8(e, e2, ozbVar4, ozbVar5);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (kc8) obj);
    }
}
