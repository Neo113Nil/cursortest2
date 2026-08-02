package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eu9 implements gip, r8s {
    public final t6f a;

    public eu9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        c9c P = y2x.P(Y, jSONObject, "duration", ox8Var, d, null, kzjVar, fu9.b);
        t6f t6fVar = this.a;
        return new gu9(P, y2x.R(Y, jSONObject, "end_actions", d, null, t6fVar.u1), y2x.G(Y, jSONObject, ConnectableDevice.KEY_ID, d, null), y2x.R(Y, jSONObject, "tick_actions", d, null, t6fVar.u1), y2x.P(Y, jSONObject, "tick_interval", ox8Var, d, null, kzjVar, fu9.c), y2x.O(Y, jSONObject, "value_variable", d, null, bcx.i));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, gu9 gu9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "duration", gu9Var.a);
        c9c c9cVar = gu9Var.b;
        jyr jyrVar = this.a.u1;
        y2x.k0(t7kVar, jSONObject, "end_actions", c9cVar, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, gu9Var.c);
        y2x.k0(t7kVar, jSONObject, "tick_actions", gu9Var.d, jyrVar);
        y2x.f0(t7kVar, jSONObject, "tick_interval", gu9Var.e);
        y2x.h0(t7kVar, jSONObject, "value_variable", gu9Var.f);
        return jSONObject;
    }
}
