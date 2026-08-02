package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pw8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, ow8 ow8Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = ow8Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("unit", b);
                } else {
                    jSONObject.put("unit", ((jk9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, Constants.KEY_VALUE, ow8Var.b);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        tct tctVar = rw8.b;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = rw8.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "unit", tctVar, gd9Var, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new ow8(ozbVar, e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E, ns9Var));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (ow8) obj);
    }
}
