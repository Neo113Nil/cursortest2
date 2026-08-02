package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i0a implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public i0a(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        h0a h0aVar = (h0a) rj3.b.P9.getValue();
        pt0 pt0Var = rj3.a;
        h0aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, CameraProperty.HEIGHT, this.a);
        etn.l0(pt0Var, jSONObject, "type", "resolution");
        y2x.f0(pt0Var, jSONObject, CameraProperty.WIDTH, this.b);
        return jSONObject;
    }
}
