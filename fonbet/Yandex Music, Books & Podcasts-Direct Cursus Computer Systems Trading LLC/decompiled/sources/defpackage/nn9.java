package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nn9 implements gip, r8s {
    public final t6f a;

    public nn9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        return new io9(y2x.K(Y, jSONObject, "color", ox8Var, d, null, kzjVar, ns9Var), y2x.N(Y, jSONObject, "style", d, null, this.a.Y7), y2x.P(Y, jSONObject, "unit", on9.d, d, null, gd9.w0, ns9Var), y2x.P(Y, jSONObject, CameraProperty.WIDTH, vct.d, d, null, kzj.E, on9.e));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, io9 io9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(io9Var.a, t7kVar, "color", kzj.D, jSONObject);
        y2x.i0(t7kVar, jSONObject, "style", io9Var.b, this.a.Y7);
        y2x.e0(io9Var.c, t7kVar, "unit", gd9.x0, jSONObject);
        y2x.f0(t7kVar, jSONObject, CameraProperty.WIDTH, io9Var.d);
        return jSONObject;
    }
}
