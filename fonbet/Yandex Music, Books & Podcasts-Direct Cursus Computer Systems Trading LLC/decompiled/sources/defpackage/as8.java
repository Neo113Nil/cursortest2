package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.Argument;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class as8 implements gip, r8s {
    public final t6f a;

    public as8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final ds8 c(t7k t7kVar, ds8 ds8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = ds8Var != null ? ds8Var.a : null;
        t6f t6fVar = this.a;
        c9c R = y2x.R(Y, jSONObject, "cancel_actions", d, c9cVar, t6fVar.u1);
        tct tctVar = cs8.e;
        c9c c9cVar2 = ds8Var != null ? ds8Var.b : null;
        qm8 qm8Var = qm8.t;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, Argument.TAG_DIRECTION, tctVar, d, c9cVar2, qm8Var, ns9Var);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = ds8Var != null ? ds8Var.c : null;
        kzj kzjVar = kzj.F;
        c9c K = y2x.K(Y, jSONObject, "duration", ox8Var, d, c9cVar3, kzjVar, cs8.g);
        c9c R2 = y2x.R(Y, jSONObject, "end_actions", d, ds8Var != null ? ds8Var.d : null, t6fVar.u1);
        ox8 ox8Var2 = vct.f;
        c9c c9cVar4 = ds8Var != null ? ds8Var.e : null;
        kzj kzjVar2 = kzj.G;
        return new ds8(R, P, K, R2, y2x.K(Y, jSONObject, "end_value", ox8Var2, d, c9cVar4, kzjVar2, ns9Var), y2x.G(Y, jSONObject, ConnectableDevice.KEY_ID, d, ds8Var != null ? ds8Var.f : null), y2x.P(Y, jSONObject, "interpolator", cs8.f, d, ds8Var != null ? ds8Var.g : null, qm8.v, ns9Var), y2x.N(Y, jSONObject, "repeat_count", d, ds8Var != null ? ds8Var.h : null, t6fVar.F2), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, ds8Var != null ? ds8Var.i : null, kzjVar, cs8.h), y2x.P(Y, jSONObject, "start_value", ox8Var2, d, ds8Var != null ? ds8Var.j : null, kzjVar2, ns9Var), y2x.G(Y, jSONObject, "variable_name", d, ds8Var != null ? ds8Var.k : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ds8 ds8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = ds8Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.u1;
        y2x.k0(t7kVar, jSONObject, "cancel_actions", c9cVar, jyrVar);
        y2x.e0(ds8Var.b, t7kVar, Argument.TAG_DIRECTION, qm8.u, jSONObject);
        y2x.f0(t7kVar, jSONObject, "duration", ds8Var.c);
        y2x.k0(t7kVar, jSONObject, "end_actions", ds8Var.d, jyrVar);
        c9c c9cVar2 = ds8Var.e;
        kzj kzjVar = kzj.D;
        y2x.e0(c9cVar2, t7kVar, "end_value", kzjVar, jSONObject);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ds8Var.f);
        y2x.e0(ds8Var.g, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.i0(t7kVar, jSONObject, "repeat_count", ds8Var.h, t6fVar.F2);
        y2x.f0(t7kVar, jSONObject, "start_delay", ds8Var.i);
        y2x.e0(ds8Var.j, t7kVar, "start_value", kzjVar, jSONObject);
        etn.l0(t7kVar, jSONObject, "type", "color_animator");
        y2x.h0(t7kVar, jSONObject, "variable_name", ds8Var.k);
        return jSONObject;
    }
}
