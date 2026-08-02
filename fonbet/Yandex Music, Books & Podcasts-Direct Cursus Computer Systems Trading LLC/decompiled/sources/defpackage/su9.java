package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class su9 implements gip, r8s {
    public final t6f a;

    public su9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.A1;
        jyr jyrVar2 = t6fVar.ba;
        c9c N = y2x.N(Y, jSONObject, "animation_in", d, null, jyrVar);
        c9c N2 = y2x.N(Y, jSONObject, "animation_out", d, null, t6fVar.A1);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        return new ov9(N, N2, y2x.P(Y, jSONObject, "background_accessibility_description", ox8Var, d, null, s3fVar, ns9Var), y2x.O(Y, jSONObject, "bring_to_top_id", d, null, s3fVar), y2x.P(Y, jSONObject, "close_by_tap_outside", vct.a, d, null, kzj.B, ns9Var), y2x.H(Y, jSONObject, "div", d, null, jyrVar2), y2x.P(Y, jSONObject, "duration", vct.b, d, null, kzj.F, uu9.e), y2x.G(Y, jSONObject, ConnectableDevice.KEY_ID, d, null), y2x.N(Y, jSONObject, "mode", d, null, t6fVar.l9), y2x.N(Y, jSONObject, "offset", d, null, t6fVar.m6), y2x.K(Y, jSONObject, "position", uu9.d, d, null, vq9.Y, ns9Var), y2x.N(Y, jSONObject, "substrate_div", d, null, jyrVar2), y2x.R(Y, jSONObject, "tap_outside_actions", d, null, t6fVar.u1));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ov9 ov9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = ov9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.A1;
        y2x.i0(t7kVar, jSONObject, "animation_in", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "animation_out", ov9Var.b, jyrVar);
        y2x.f0(t7kVar, jSONObject, "background_accessibility_description", ov9Var.c);
        y2x.h0(t7kVar, jSONObject, "bring_to_top_id", ov9Var.d);
        y2x.f0(t7kVar, jSONObject, "close_by_tap_outside", ov9Var.e);
        c9c c9cVar2 = ov9Var.f;
        jyr jyrVar2 = t6fVar.ba;
        y2x.i0(t7kVar, jSONObject, "div", c9cVar2, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "duration", ov9Var.g);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ov9Var.h);
        y2x.i0(t7kVar, jSONObject, "mode", ov9Var.i, t6fVar.l9);
        y2x.i0(t7kVar, jSONObject, "offset", ov9Var.j, t6fVar.m6);
        y2x.e0(ov9Var.k, t7kVar, "position", vq9.Z, jSONObject);
        y2x.i0(t7kVar, jSONObject, "substrate_div", ov9Var.l, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "tap_outside_actions", ov9Var.m, t6fVar.u1);
        return jSONObject;
    }
}
