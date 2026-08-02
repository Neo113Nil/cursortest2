package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sv9 implements gip, r8s {
    public final t6f a;

    public sv9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new uv9(y2x.N(Y, jSONObject, "pivot_x", d, null, t6fVar.j6), y2x.N(Y, jSONObject, "pivot_y", d, null, t6fVar.j6), y2x.P(Y, jSONObject, CameraProperty.ROTATION, vct.d, d, null, kzj.E, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, uv9 uv9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = uv9Var.a;
        jyr jyrVar = this.a.j6;
        y2x.i0(t7kVar, jSONObject, "pivot_x", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "pivot_y", uv9Var.b, jyrVar);
        y2x.f0(t7kVar, jSONObject, CameraProperty.ROTATION, uv9Var.c);
        return jSONObject;
    }
}
