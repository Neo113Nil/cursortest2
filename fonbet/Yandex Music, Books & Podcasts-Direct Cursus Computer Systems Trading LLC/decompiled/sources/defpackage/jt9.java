package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jt9 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [szb] */
    public static it9 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        szb b = e5f.b(t7kVar, jSONObject, "color", ox8Var, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar = mt9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var2, kzjVar2, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new it9(b, ozbVar);
    }

    public static JSONObject d(t7k t7kVar, it9 it9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = it9Var.a;
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
        e5f.g(t7kVar, jSONObject, "is_enabled", it9Var.b);
        etn.l0(t7kVar, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (it9) obj);
    }
}
