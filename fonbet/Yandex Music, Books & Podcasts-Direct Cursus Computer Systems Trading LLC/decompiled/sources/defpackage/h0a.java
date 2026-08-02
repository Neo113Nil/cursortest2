package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h0a implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        return new i0a(y2x.K(Y, jSONObject, CameraProperty.HEIGHT, ox8Var, d, null, kzjVar, x97.i), y2x.K(Y, jSONObject, CameraProperty.WIDTH, ox8Var, d, null, kzjVar, x97.j));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        i0a i0aVar = (i0a) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, CameraProperty.HEIGHT, i0aVar.a);
        etn.l0(t7kVar, jSONObject, "type", "resolution");
        y2x.f0(t7kVar, jSONObject, CameraProperty.WIDTH, i0aVar.b);
        return jSONObject;
    }
}
