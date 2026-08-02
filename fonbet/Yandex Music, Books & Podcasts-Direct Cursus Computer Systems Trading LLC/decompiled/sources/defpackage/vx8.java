package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vx8 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String str = (String) etn.P(ConnectableDevice.KEY_ID, jSONObject);
        Object opt = jSONObject.opt("params");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return new rx8(str, (JSONObject) (opt != null ? opt : null));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        rx8 rx8Var = (rx8) obj;
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, rx8Var.a);
        etn.l0(t7kVar, jSONObject, "params", rx8Var.b);
        return jSONObject;
    }
}
