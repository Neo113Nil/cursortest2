package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zc9 implements gip, r8s {
    public final t6f a;

    public zc9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new ed9(y2x.G(Y, jSONObject, ConnectableDevice.KEY_ID, d, null), y2x.R(Y, jSONObject, "items", d, null, this.a.ba));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        ed9 ed9Var = (ed9) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ed9Var.a);
        y2x.k0(t7kVar, jSONObject, "items", ed9Var.b, this.a.ba);
        return jSONObject;
    }
}
