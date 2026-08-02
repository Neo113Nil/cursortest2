package defpackage;

import com.connectsdk.service.DeviceService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wc8 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, yc8 yc8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, DeviceService.KEY_DESC, yc8Var.a);
        y2x.f0(t7kVar, jSONObject, "hint", yc8Var.b);
        y2x.f0(t7kVar, jSONObject, "is_checked", yc8Var.c);
        y2x.e0(yc8Var.d, t7kVar, "mode", va8.u, jSONObject);
        y2x.f0(t7kVar, jSONObject, "mute_after_action", yc8Var.e);
        y2x.f0(t7kVar, jSONObject, "state_description", yc8Var.f);
        c9c c9cVar = yc8Var.g;
        if (c9cVar instanceof a9c) {
            Object obj = ((a9c) c9cVar).c;
            if (obj != null) {
                try {
                    jSONObject.put("type", ((sc8) obj).a);
                } catch (JSONException e) {
                    t7kVar.a().a(e);
                }
            }
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat("type"), ((z8c) c9cVar).c);
        }
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, DeviceService.KEY_DESC, ox8Var, d, null, s3fVar, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "hint", ox8Var, d, null, s3fVar, ns9Var);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar = kzj.B;
        return new yc8(P, P2, y2x.P(Y, jSONObject, "is_checked", ox8Var2, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "mode", xc8.d, d, null, va8.t, ns9Var), y2x.P(Y, jSONObject, "mute_after_action", ox8Var2, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "state_description", ox8Var, d, null, s3fVar, ns9Var), y2x.O(Y, jSONObject, "type", d, null, va8.v));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (yc8) obj);
    }
}
