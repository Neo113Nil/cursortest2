package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tr8 implements gip, r8s {
    public final t6f a;

    public tr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c H = y2x.H(Y, jSONObject, "div", d, null, this.a.ba);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        return new vr8(H, y2x.P(Y, jSONObject, ConnectableDevice.KEY_ID, ox8Var, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "selector", vct.a, d, null, kzj.B, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, vr8 vr8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "div", vr8Var.a, this.a.ba);
        y2x.f0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vr8Var.b);
        y2x.f0(t7kVar, jSONObject, "selector", vr8Var.c);
        return jSONObject;
    }
}
