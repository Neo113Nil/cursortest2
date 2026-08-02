package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wx8 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new yx8(y2x.G(Y, jSONObject, ConnectableDevice.KEY_ID, d, null), y2x.O(Y, jSONObject, "params", d, null, bcx.i));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        yx8 yx8Var = (yx8) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, yx8Var.a);
        y2x.h0(t7kVar, jSONObject, "params", yx8Var.b);
        return jSONObject;
    }
}
