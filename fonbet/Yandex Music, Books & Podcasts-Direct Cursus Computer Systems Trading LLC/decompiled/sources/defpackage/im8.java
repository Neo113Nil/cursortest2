package defpackage;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class im8 implements gip, py7 {
    public static hm8 c(t7k t7kVar, JSONObject jSONObject) {
        tct tctVar = lm8.a;
        va8 va8Var = va8.Z;
        ns9 ns9Var = bcx.h;
        return new hm8(e5f.b(t7kVar, jSONObject, Constants.KEY_ACTION, tctVar, va8Var, ns9Var), e5f.b(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vct.c, bcx.i, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, hm8 hm8Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = hm8Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put(Constants.KEY_ACTION, b);
                } else {
                    jSONObject.put(Constants.KEY_ACTION, ((gm8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, ConnectableDevice.KEY_ID, hm8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "video");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (hm8) obj);
    }
}
