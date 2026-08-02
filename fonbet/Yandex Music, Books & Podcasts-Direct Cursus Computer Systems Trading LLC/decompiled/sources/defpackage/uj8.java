package defpackage;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uj8 implements u8s {
    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        wj8 wj8Var = (wj8) d7fVar;
        return new rj8(h4a.G(t7kVar, wj8Var.a, jSONObject, Constants.KEY_ACTION, vj8.a, va8.L), h4a.F(t7kVar, wj8Var.b, jSONObject, ConnectableDevice.KEY_ID, vct.c));
    }
}
