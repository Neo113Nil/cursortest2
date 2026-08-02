package defpackage;

import com.connectsdk.service.DeviceService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qr9 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, rq9 rq9Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, DeviceService.KEY_DESC, rq9Var.a);
        qq9 qq9Var = rq9Var.b;
        if (qq9Var != null) {
            try {
                jSONObject.put("type", qq9Var.a);
                return jSONObject;
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        szb c = e5f.c(t7kVar, jSONObject, DeviceService.KEY_DESC);
        qq9 qq9Var = (qq9) etn.X(t7kVar, jSONObject, rk9.y0);
        if (qq9Var == null) {
            qq9Var = sr9.a;
        }
        return new rq9(c, qq9Var);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (rq9) obj);
    }
}
