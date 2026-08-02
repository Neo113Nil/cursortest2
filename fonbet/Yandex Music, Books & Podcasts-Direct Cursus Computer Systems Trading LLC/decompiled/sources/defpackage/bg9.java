package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bg9 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [szb] */
    public static ag9 c(t7k t7kVar, JSONObject jSONObject) {
        tct tctVar = eg9.b;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = eg9.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "unit", tctVar, gd9Var, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new ag9(ozbVar, e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, ag9 ag9Var) {
        JSONObject w = ouj.w(t7kVar, "type", "fixed");
        szb szbVar = ag9Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    w.put("unit", b);
                } else {
                    w.put("unit", ((jk9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, w, Constants.KEY_VALUE, ag9Var.b);
        return w;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ag9) obj);
    }
}
