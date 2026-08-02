package defpackage;

import com.connectsdk.service.DeviceService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wt9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public wt9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        rr9 rr9Var = (rr9) rj3.b.W8.getValue();
        pt0 pt0Var = rj3.a;
        rr9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, DeviceService.KEY_DESC, this.a);
        c9c c9cVar = this.b;
        if (c9cVar instanceof a9c) {
            Object obj = ((a9c) c9cVar).c;
            if (obj != null) {
                try {
                    jSONObject.put("type", ((qq9) obj).a);
                    return jSONObject;
                } catch (JSONException e) {
                    ((gy2) pt0Var.a()).a(e);
                    return jSONObject;
                }
            }
        } else if (c9cVar instanceof z8c) {
            etn.l0(pt0Var, jSONObject, "$".concat("type"), ((z8c) c9cVar).c);
        }
        return jSONObject;
    }
}
