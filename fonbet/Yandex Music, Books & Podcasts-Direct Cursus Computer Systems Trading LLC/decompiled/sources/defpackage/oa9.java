package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oa9 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static na9 c(t7k t7kVar, JSONObject jSONObject) {
        tct tctVar = ra9.g;
        qm8 qm8Var = qm8.v;
        ozb ozbVar = ra9.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "interpolator", tctVar, qm8Var, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = ra9.h;
        ozb ozbVar3 = ra9.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "next_page_alpha", ox8Var, kzjVar, l29Var, ozbVar3);
        if (e2 == null) {
            e2 = ozbVar3;
        }
        l29 l29Var2 = ra9.i;
        ozb ozbVar4 = ra9.c;
        szb e3 = e5f.e(t7kVar, jSONObject, "next_page_scale", ox8Var, kzjVar, l29Var2, ozbVar4);
        if (e3 == null) {
            e3 = ozbVar4;
        }
        l29 l29Var3 = ra9.j;
        ozb ozbVar5 = ra9.d;
        szb e4 = e5f.e(t7kVar, jSONObject, "previous_page_alpha", ox8Var, kzjVar, l29Var3, ozbVar5);
        if (e4 == null) {
            e4 = ozbVar5;
        }
        l29 l29Var4 = ra9.k;
        ozb ozbVar6 = ra9.e;
        szb e5 = e5f.e(t7kVar, jSONObject, "previous_page_scale", ox8Var, kzjVar, l29Var4, ozbVar6);
        if (e5 == null) {
            e5 = ozbVar6;
        }
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar7 = ra9.f;
        ?? e6 = e5f.e(t7kVar, jSONObject, "reversed_stacking_order", ox8Var2, kzjVar2, ns9Var, ozbVar7);
        return new na9(ozbVar2, e2, e3, e4, e5, e6 == 0 ? ozbVar7 : e6);
    }

    public static JSONObject d(t7k t7kVar, na9 na9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = na9Var.a;
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
        e5f.g(t7kVar, jSONObject, "next_page_alpha", na9Var.b);
        e5f.g(t7kVar, jSONObject, "next_page_scale", na9Var.c);
        e5f.g(t7kVar, jSONObject, "previous_page_alpha", na9Var.d);
        e5f.g(t7kVar, jSONObject, "previous_page_scale", na9Var.e);
        e5f.g(t7kVar, jSONObject, "reversed_stacking_order", na9Var.f);
        etn.l0(t7kVar, jSONObject, "type", "overlap");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (na9) obj);
    }
}
