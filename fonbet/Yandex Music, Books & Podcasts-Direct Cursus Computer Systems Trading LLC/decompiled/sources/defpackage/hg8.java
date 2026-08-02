package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hg8 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, jg8 jg8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, jg8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new jg8(y2x.J(y1g.Y(t7kVar), jSONObject, ConnectableDevice.KEY_ID, vct.c, t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (jg8) obj);
    }
}
