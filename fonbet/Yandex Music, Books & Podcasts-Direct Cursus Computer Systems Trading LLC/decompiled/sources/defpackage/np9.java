package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class np9 implements gip, r8s {
    public final t6f a;

    public np9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new tp9(y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, null, t6fVar.G3), y2x.K(Y, jSONObject, "image_url", vct.e, d, null, kzj.C, bcx.h), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, null, t6fVar.G3));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, tp9 tp9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = tp9Var.a;
        jyr jyrVar = this.a.G3;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar, jyrVar);
        y2x.e0(tp9Var.b, t7kVar, "image_url", kzj.H, jSONObject);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, tp9Var.c, jyrVar);
        return jSONObject;
    }
}
