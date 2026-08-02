package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g0a implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        return new b0a(e5f.b(t7kVar, jSONObject, CameraProperty.HEIGHT, ox8Var, kzjVar, x97.i), e5f.b(t7kVar, jSONObject, CameraProperty.WIDTH, ox8Var, kzjVar, x97.j));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        b0a b0aVar = (b0a) obj;
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, CameraProperty.HEIGHT, b0aVar.a);
        etn.l0(t7kVar, jSONObject, "type", "resolution");
        e5f.g(t7kVar, jSONObject, CameraProperty.WIDTH, b0aVar.b);
        return jSONObject;
    }
}
