package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yx8 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public yx8(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        wx8 wx8Var = (wx8) rj3.b.l3.getValue();
        pt0 pt0Var = rj3.a;
        wx8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.h0(pt0Var, jSONObject, ConnectableDevice.KEY_ID, this.a);
        y2x.h0(pt0Var, jSONObject, "params", this.b);
        return jSONObject;
    }
}
