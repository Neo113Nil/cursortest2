package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xi8 implements u8s {
    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        yi8 yi8Var = (yi8) d7fVar;
        return new ui8(h4a.F(t7kVar, yi8Var.a, jSONObject, ConnectableDevice.KEY_ID, vct.c), h4a.O(t7kVar, yi8Var.b, jSONObject, "multiple", vct.a, kzj.B));
    }
}
