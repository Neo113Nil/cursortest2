package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ua9 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static ta9 c(t7k t7kVar, JSONObject jSONObject) {
        tct tctVar = xa9.f;
        qm8 qm8Var = qm8.v;
        ozb ozbVar = xa9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "interpolator", tctVar, qm8Var, bcx.h, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = xa9.g;
        ozb ozbVar3 = xa9.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "next_page_alpha", ox8Var, kzjVar, l29Var, ozbVar3);
        if (e2 == null) {
            e2 = ozbVar3;
        }
        l29 l29Var2 = xa9.h;
        ozb ozbVar4 = xa9.c;
        szb e3 = e5f.e(t7kVar, jSONObject, "next_page_scale", ox8Var, kzjVar, l29Var2, ozbVar4);
        if (e3 == null) {
            e3 = ozbVar4;
        }
        l29 l29Var3 = xa9.i;
        ozb ozbVar5 = xa9.d;
        szb e4 = e5f.e(t7kVar, jSONObject, "previous_page_alpha", ox8Var, kzjVar, l29Var3, ozbVar5);
        if (e4 == null) {
            e4 = ozbVar5;
        }
        l29 l29Var4 = xa9.j;
        ozb ozbVar6 = xa9.e;
        ?? e5 = e5f.e(t7kVar, jSONObject, "previous_page_scale", ox8Var, kzjVar, l29Var4, ozbVar6);
        return new ta9(ozbVar2, e2, e3, e4, e5 == 0 ? ozbVar6 : e5);
    }

    public static JSONObject d(t7k t7kVar, ta9 ta9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = ta9Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("interpolator", b);
                } else {
                    jSONObject.put("interpolator", ((um8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "next_page_alpha", ta9Var.b);
        e5f.g(t7kVar, jSONObject, "next_page_scale", ta9Var.c);
        e5f.g(t7kVar, jSONObject, "previous_page_alpha", ta9Var.d);
        e5f.g(t7kVar, jSONObject, "previous_page_scale", ta9Var.e);
        etn.l0(t7kVar, jSONObject, "type", "slide");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ta9) obj);
    }
}
