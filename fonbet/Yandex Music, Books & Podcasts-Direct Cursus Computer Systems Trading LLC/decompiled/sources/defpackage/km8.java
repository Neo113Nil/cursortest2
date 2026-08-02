package defpackage;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class km8 implements u8s {
    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        mm8 mm8Var = (mm8) d7fVar;
        return new hm8(h4a.G(t7kVar, mm8Var.a, jSONObject, Constants.KEY_ACTION, lm8.a, va8.Z), h4a.F(t7kVar, mm8Var.b, jSONObject, ConnectableDevice.KEY_ID, vct.c));
    }
}
