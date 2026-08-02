package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gg8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, fg8 fg8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, ConnectableDevice.KEY_ID, fg8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new fg8(e5f.a(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vct.c));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (fg8) obj);
    }
}
