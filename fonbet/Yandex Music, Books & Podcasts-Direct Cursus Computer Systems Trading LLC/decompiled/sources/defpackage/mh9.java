package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mh9 implements gip, r8s {
    public final t6f a;

    public mh9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final ph9 c(t7k t7kVar, ph9 ph9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c K = y2x.K(Y, jSONObject, "angle", vct.d, d, ph9Var != null ? ph9Var.a : null, kzj.E, bcx.h);
        c9c c9cVar = ph9Var != null ? ph9Var.b : null;
        t6f t6fVar = this.a;
        return new ph9(K, y2x.N(Y, jSONObject, "pivot_x", d, c9cVar, t6fVar.j6), y2x.N(Y, jSONObject, "pivot_y", d, ph9Var != null ? ph9Var.c : null, t6fVar.j6));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ph9 ph9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "angle", ph9Var.a);
        c9c c9cVar = ph9Var.b;
        jyr jyrVar = this.a.j6;
        y2x.i0(t7kVar, jSONObject, "pivot_x", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "pivot_y", ph9Var.c, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", CameraProperty.ROTATION);
        return jSONObject;
    }
}
