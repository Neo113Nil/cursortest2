package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yh9 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v2, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v3, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v4, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v6, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static xh9 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        mb9 mb9Var = bi9.h;
        ozb ozbVar = bi9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "duration", ox8Var, kzjVar, mb9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        tct tctVar = bi9.g;
        qm8 qm8Var = qm8.v;
        ozb ozbVar3 = bi9.b;
        ?? e2 = e5f.e(t7kVar, jSONObject, "interpolator", tctVar, qm8Var, bcx.h, ozbVar3);
        ozb ozbVar4 = e2 == 0 ? ozbVar3 : e2;
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        mb9 mb9Var2 = bi9.i;
        ozb ozbVar5 = bi9.c;
        ?? e3 = e5f.e(t7kVar, jSONObject, "pivot_x", ox8Var2, kzjVar2, mb9Var2, ozbVar5);
        ozb ozbVar6 = e3 == 0 ? ozbVar5 : e3;
        mb9 mb9Var3 = bi9.j;
        ozb ozbVar7 = bi9.d;
        ?? e4 = e5f.e(t7kVar, jSONObject, "pivot_y", ox8Var2, kzjVar2, mb9Var3, ozbVar7);
        ozb ozbVar8 = e4 == 0 ? ozbVar7 : e4;
        mb9 mb9Var4 = bi9.k;
        ozb ozbVar9 = bi9.e;
        ?? e5 = e5f.e(t7kVar, jSONObject, "scale", ox8Var2, kzjVar2, mb9Var4, ozbVar9);
        if (e5 != 0) {
            ozbVar9 = e5;
        }
        mb9 mb9Var5 = bi9.l;
        ozb ozbVar10 = bi9.f;
        ?? e6 = e5f.e(t7kVar, jSONObject, "start_delay", ox8Var, kzjVar, mb9Var5, ozbVar10);
        return new xh9(ozbVar2, ozbVar4, ozbVar6, ozbVar8, ozbVar9, e6 == 0 ? ozbVar10 : e6);
    }

    public static JSONObject d(t7k t7kVar, xh9 xh9Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "duration", xh9Var.a);
        szb szbVar = xh9Var.b;
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
        e5f.g(t7kVar, jSONObject, "pivot_x", xh9Var.c);
        e5f.g(t7kVar, jSONObject, "pivot_y", xh9Var.d);
        e5f.g(t7kVar, jSONObject, "scale", xh9Var.e);
        e5f.g(t7kVar, jSONObject, "start_delay", xh9Var.f);
        etn.l0(t7kVar, jSONObject, "type", "scale");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (xh9) obj);
    }
}
