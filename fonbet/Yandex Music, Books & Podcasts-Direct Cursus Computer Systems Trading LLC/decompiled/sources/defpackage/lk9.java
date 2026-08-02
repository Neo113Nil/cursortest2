package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lk9 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, kk9 kk9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = kk9Var.a;
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
        e5f.g(t7kVar, jSONObject, Constants.KEY_VALUE, kk9Var.b);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        tct tctVar = nk9.b;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = nk9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "unit", tctVar, gd9Var, bcx.h, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new kk9(ozbVar, e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F, nk9.c));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (kk9) obj);
    }
}
