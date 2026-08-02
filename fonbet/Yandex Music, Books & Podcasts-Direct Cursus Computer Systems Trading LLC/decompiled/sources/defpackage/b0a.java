package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b0a implements u1f {
    public final szb a;
    public final szb b;
    public Integer c;

    public b0a(szb szbVar, szb szbVar2) {
        this.a = szbVar;
        this.b = szbVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        g0a g0aVar = (g0a) rj3.b.O9.getValue();
        pt0 pt0Var = rj3.a;
        g0aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, CameraProperty.HEIGHT, this.a);
        etn.l0(pt0Var, jSONObject, "type", "resolution");
        e5f.g(pt0Var, jSONObject, CameraProperty.WIDTH, this.b);
        return jSONObject;
    }
}
