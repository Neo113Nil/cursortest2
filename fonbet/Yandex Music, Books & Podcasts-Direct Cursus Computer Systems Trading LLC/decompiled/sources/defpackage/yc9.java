package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yc9 implements gip, py7 {
    public final t6f a;

    public yc9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new uc9((String) etn.P(ConnectableDevice.KEY_ID, jSONObject), etn.Y(t7kVar, jSONObject, "items", this.a.aa));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        uc9 uc9Var = (uc9) obj;
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, uc9Var.a);
        etn.n0(t7kVar, jSONObject, "items", uc9Var.b, this.a.aa);
        return jSONObject;
    }
}
