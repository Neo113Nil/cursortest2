package defpackage;

import com.connectsdk.service.DeviceService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rr9 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new wt9(y2x.P(Y, jSONObject, DeviceService.KEY_DESC, vct.c, d, null, bcx.i, bcx.h), y2x.O(Y, jSONObject, "type", d, null, rk9.y0));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        wt9 wt9Var = (wt9) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, DeviceService.KEY_DESC, wt9Var.a);
        c9c c9cVar = wt9Var.b;
        if (c9cVar instanceof a9c) {
            Object obj2 = ((a9c) c9cVar).c;
            if (obj2 != null) {
                try {
                    jSONObject.put("type", ((qq9) obj2).a);
                    return jSONObject;
                } catch (JSONException e) {
                    t7kVar.a().a(e);
                    return jSONObject;
                }
            }
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat("type"), ((z8c) c9cVar).c);
        }
        return jSONObject;
    }
}
