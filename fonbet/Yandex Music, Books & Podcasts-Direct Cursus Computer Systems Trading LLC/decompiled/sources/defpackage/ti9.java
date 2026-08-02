package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ti9 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, qi9 qi9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = qi9Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("color", b);
                } else {
                    jSONObject.put("color", c85.a(((Number) b).intValue()));
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        szb szbVar2 = qi9Var.b;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("orientation", b2);
                } else {
                    jSONObject.put("orientation", ((pi9) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ozb ozbVar = vi9.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "color", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        tct tctVar = vi9.c;
        gd9 gd9Var = gd9.K;
        ozb ozbVar2 = vi9.b;
        ?? e2 = e5f.e(t7kVar, jSONObject, "orientation", tctVar, gd9Var, ns9Var, ozbVar2);
        if (e2 != 0) {
            ozbVar2 = e2;
        }
        return new qi9(ozbVar, ozbVar2);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (qi9) obj);
    }
}
