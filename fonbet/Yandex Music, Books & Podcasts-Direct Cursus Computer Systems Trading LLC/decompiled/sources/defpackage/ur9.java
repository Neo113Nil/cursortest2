package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ur9 implements gip, r8s {
    public final t6f a;

    public ur9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.W8;
        jyr jyrVar2 = t6fVar.G3;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, null, jyrVar);
        tct tctVar = vr9.g;
        vq9 vq9Var = vq9.t;
        ns9 ns9Var = bcx.h;
        return new xt9(N, y2x.P(Y, jSONObject, "alignment_vertical", tctVar, d, null, vq9Var, ns9Var), y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, null, jyrVar2), y2x.P(Y, jSONObject, "indexing_direction", vr9.h, d, null, rk9.z0, ns9Var), y2x.P(Y, jSONObject, "preload_required", vct.a, d, null, kzj.B, ns9Var), y2x.K(Y, jSONObject, "start", vct.b, d, null, kzj.F, vr9.j), y2x.P(Y, jSONObject, "tint_color", vct.f, d, null, kzj.G, ns9Var), y2x.P(Y, jSONObject, "tint_mode", vr9.i, d, null, qm8.z, ns9Var), y2x.K(Y, jSONObject, "url", vct.e, d, null, kzj.C, ns9Var), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, null, jyrVar2));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xt9 xt9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = xt9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.W8);
        y2x.e0(xt9Var.b, t7kVar, "alignment_vertical", vq9.u, jSONObject);
        c9c c9cVar2 = xt9Var.c;
        jyr jyrVar = t6fVar.G3;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar2, jyrVar);
        y2x.e0(xt9Var.d, t7kVar, "indexing_direction", rk9.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "preload_required", xt9Var.e);
        y2x.f0(t7kVar, jSONObject, "start", xt9Var.f);
        y2x.e0(xt9Var.g, t7kVar, "tint_color", kzj.D, jSONObject);
        y2x.e0(xt9Var.h, t7kVar, "tint_mode", qm8.A, jSONObject);
        y2x.e0(xt9Var.i, t7kVar, "url", kzj.H, jSONObject);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, xt9Var.j, jyrVar);
        return jSONObject;
    }
}
