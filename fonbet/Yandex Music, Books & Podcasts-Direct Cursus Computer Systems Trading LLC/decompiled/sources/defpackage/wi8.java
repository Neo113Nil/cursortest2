package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wi8 implements gip, r8s {
    public static yi8 c(t7k t7kVar, yi8 yi8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new yi8(y2x.J(Y, jSONObject, ConnectableDevice.KEY_ID, vct.c, d, yi8Var != null ? yi8Var.a : null), y2x.P(Y, jSONObject, "multiple", vct.a, d, yi8Var != null ? yi8Var.b : null, kzj.B, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, yi8 yi8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, yi8Var.a);
        y2x.f0(t7kVar, jSONObject, "multiple", yi8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (yi8) obj);
    }
}
