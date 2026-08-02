package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k09 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public k09(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        j09 j09Var = (j09) rj3.b.S3.getValue();
        pt0 pt0Var = rj3.a;
        j09Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.h0(pt0Var, jSONObject, "name", this.a);
        c9c c9cVar = this.b;
        if (c9cVar instanceof a9c) {
            Object obj = ((a9c) c9cVar).c;
            if (obj != null) {
                try {
                    jSONObject.put("type", ((nx8) obj).a);
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
