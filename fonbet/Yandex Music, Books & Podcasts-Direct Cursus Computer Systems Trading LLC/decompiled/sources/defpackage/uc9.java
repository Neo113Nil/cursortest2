package defpackage;

import com.connectsdk.device.ConnectableDevice;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uc9 implements u1f {
    public final String a;
    public final List b;

    public uc9(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        yc9 yc9Var = (yc9) rj3.b.Q5.getValue();
        pt0 pt0Var = rj3.a;
        yc9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, ConnectableDevice.KEY_ID, this.a);
        etn.n0(pt0Var, jSONObject, "items", this.b, yc9Var.a.aa);
        return jSONObject;
    }
}
