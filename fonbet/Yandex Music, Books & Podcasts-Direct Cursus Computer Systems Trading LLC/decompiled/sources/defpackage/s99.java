package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.Argument;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s99 implements gip, r8s {
    public final t6f a;

    public s99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final v99 c(t7k t7kVar, v99 v99Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = v99Var != null ? v99Var.a : null;
        t6f t6fVar = this.a;
        c9c R = y2x.R(Y, jSONObject, "cancel_actions", d, c9cVar, t6fVar.u1);
        tct tctVar = u99.e;
        c9c c9cVar2 = v99Var != null ? v99Var.b : null;
        qm8 qm8Var = qm8.t;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, Argument.TAG_DIRECTION, tctVar, d, c9cVar2, qm8Var, ns9Var);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = v99Var != null ? v99Var.c : null;
        kzj kzjVar = kzj.F;
        c9c K = y2x.K(Y, jSONObject, "duration", ox8Var, d, c9cVar3, kzjVar, u99.g);
        c9c R2 = y2x.R(Y, jSONObject, "end_actions", d, v99Var != null ? v99Var.d : null, t6fVar.u1);
        ox8 ox8Var2 = vct.d;
        c9c c9cVar4 = v99Var != null ? v99Var.e : null;
        kzj kzjVar2 = kzj.E;
        return new v99(R, P, K, R2, y2x.K(Y, jSONObject, "end_value", ox8Var2, d, c9cVar4, kzjVar2, ns9Var), y2x.G(Y, jSONObject, ConnectableDevice.KEY_ID, d, v99Var != null ? v99Var.f : null), y2x.P(Y, jSONObject, "interpolator", u99.f, d, v99Var != null ? v99Var.g : null, qm8.v, ns9Var), y2x.N(Y, jSONObject, "repeat_count", d, v99Var != null ? v99Var.h : null, t6fVar.F2), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, v99Var != null ? v99Var.i : null, kzjVar, u99.h), y2x.P(Y, jSONObject, "start_value", ox8Var2, d, v99Var != null ? v99Var.j : null, kzjVar2, ns9Var), y2x.G(Y, jSONObject, "variable_name", d, v99Var != null ? v99Var.k : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, v99 v99Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = v99Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.u1;
        y2x.k0(t7kVar, jSONObject, "cancel_actions", c9cVar, jyrVar);
        y2x.e0(v99Var.b, t7kVar, Argument.TAG_DIRECTION, qm8.u, jSONObject);
        y2x.f0(t7kVar, jSONObject, "duration", v99Var.c);
        y2x.k0(t7kVar, jSONObject, "end_actions", v99Var.d, jyrVar);
        y2x.f0(t7kVar, jSONObject, "end_value", v99Var.e);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, v99Var.f);
        y2x.e0(v99Var.g, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.i0(t7kVar, jSONObject, "repeat_count", v99Var.h, t6fVar.F2);
        y2x.f0(t7kVar, jSONObject, "start_delay", v99Var.i);
        y2x.f0(t7kVar, jSONObject, "start_value", v99Var.j);
        etn.l0(t7kVar, jSONObject, "type", "number_animator");
        y2x.h0(t7kVar, jSONObject, "variable_name", v99Var.k);
        return jSONObject;
    }
}
