package defpackage;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jm8 implements gip, r8s {
    public static mm8 c(t7k t7kVar, mm8 mm8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new mm8(y2x.K(Y, jSONObject, Constants.KEY_ACTION, lm8.a, d, mm8Var != null ? mm8Var.a : null, va8.Z, bcx.h), y2x.J(Y, jSONObject, ConnectableDevice.KEY_ID, vct.c, d, mm8Var != null ? mm8Var.b : null));
    }

    public static JSONObject d(t7k t7kVar, mm8 mm8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(mm8Var.a, t7kVar, Constants.KEY_ACTION, va8.v0, jSONObject);
        y2x.f0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, mm8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "video");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (mm8) obj);
    }
}
