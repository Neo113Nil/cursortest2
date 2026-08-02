package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ed9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public ed9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        zc9 zc9Var = (zc9) rj3.b.R5.getValue();
        pt0 pt0Var = rj3.a;
        zc9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.h0(pt0Var, jSONObject, ConnectableDevice.KEY_ID, this.a);
        y2x.k0(pt0Var, jSONObject, "items", this.b, zc9Var.a.ba);
        return jSONObject;
    }
}
