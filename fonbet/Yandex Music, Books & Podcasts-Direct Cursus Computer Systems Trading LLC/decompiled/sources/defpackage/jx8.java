package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jx8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, ix8 ix8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "bottom", ix8Var.a);
        e5f.g(t7kVar, jSONObject, "end", ix8Var.b);
        e5f.g(t7kVar, jSONObject, "left", ix8Var.c);
        e5f.g(t7kVar, jSONObject, "right", ix8Var.d);
        e5f.g(t7kVar, jSONObject, "start", ix8Var.e);
        e5f.g(t7kVar, jSONObject, "top", ix8Var.f);
        szb szbVar = ix8Var.g;
        if (szbVar == null) {
            return jSONObject;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put("unit", b);
                return jSONObject;
            }
            jSONObject.put("unit", ((jk9) b).a);
            return jSONObject;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return jSONObject;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v4, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v6, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v9, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        uw8 uw8Var = lx8.g;
        ozb ozbVar = lx8.a;
        ?? e = e5f.e(t7kVar, jSONObject, "bottom", ox8Var, kzjVar, uw8Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        szb e2 = e5f.e(t7kVar, jSONObject, "end", ox8Var, kzjVar, lx8.h, null);
        uw8 uw8Var2 = lx8.i;
        ozb ozbVar3 = lx8.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "left", ox8Var, kzjVar, uw8Var2, ozbVar3);
        ozb ozbVar4 = e3 == 0 ? ozbVar3 : e3;
        uw8 uw8Var3 = lx8.j;
        ozb ozbVar5 = lx8.c;
        ?? e4 = e5f.e(t7kVar, jSONObject, "right", ox8Var, kzjVar, uw8Var3, ozbVar5);
        ozb ozbVar6 = e4 == 0 ? ozbVar5 : e4;
        szb e5 = e5f.e(t7kVar, jSONObject, "start", ox8Var, kzjVar, lx8.k, null);
        uw8 uw8Var4 = lx8.l;
        ozb ozbVar7 = lx8.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "top", ox8Var, kzjVar, uw8Var4, ozbVar7);
        ozb ozbVar8 = e6 == 0 ? ozbVar7 : e6;
        tct tctVar = lx8.f;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar9 = lx8.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "unit", tctVar, gd9Var, bcx.h, ozbVar9);
        return new ix8(ozbVar2, e2, ozbVar4, ozbVar6, e5, ozbVar8, e7 == 0 ? ozbVar9 : e7);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (ix8) obj);
    }
}
