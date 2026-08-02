package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vi8 implements gip, py7 {
    public static ui8 c(t7k t7kVar, JSONObject jSONObject) {
        return new ui8(e5f.a(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vct.c), e5f.e(t7kVar, jSONObject, "multiple", vct.a, kzj.B, bcx.h, null));
    }

    public static JSONObject d(t7k t7kVar, ui8 ui8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ui8Var.a);
        e5f.g(t7kVar, jSONObject, "multiple", ui8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ui8) obj);
    }
}
