package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ug8 implements gip, r8s {
    public static xg8 c(t7k t7kVar, xg8 xg8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.a;
        c9c c9cVar = xg8Var != null ? xg8Var.a : null;
        kzj kzjVar = kzj.B;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "animated", ox8Var, d, c9cVar, kzjVar, ns9Var);
        c9c J = y2x.J(Y, jSONObject, ConnectableDevice.KEY_ID, vct.c, d, xg8Var != null ? xg8Var.b : null);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar2 = xg8Var != null ? xg8Var.c : null;
        kzj kzjVar2 = kzj.F;
        return new xg8(P, J, y2x.P(Y, jSONObject, "item_count", ox8Var2, d, c9cVar2, kzjVar2, ns9Var), y2x.P(Y, jSONObject, "offset", ox8Var2, d, xg8Var != null ? xg8Var.d : null, kzjVar2, ns9Var), y2x.P(Y, jSONObject, "overflow", wg8.e, d, xg8Var != null ? xg8Var.e : null, va8.C, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, xg8 xg8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "animated", xg8Var.a);
        y2x.f0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, xg8Var.b);
        y2x.f0(t7kVar, jSONObject, "item_count", xg8Var.c);
        y2x.f0(t7kVar, jSONObject, "offset", xg8Var.d);
        y2x.e0(xg8Var.e, t7kVar, "overflow", va8.D, jSONObject);
        etn.l0(t7kVar, jSONObject, "type", "scroll_by");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (xg8) obj);
    }
}
