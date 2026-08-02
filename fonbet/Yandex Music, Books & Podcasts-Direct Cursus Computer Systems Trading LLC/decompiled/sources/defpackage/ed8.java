package defpackage;

import com.connectsdk.discovery.provider.ssdp.Argument;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ed8 implements gip, r8s {
    public final t6f a;

    public ed8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final hd8 c(t7k t7kVar, hd8 hd8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c G = y2x.G(Y, jSONObject, "animator_id", d, hd8Var != null ? hd8Var.a : null);
        tct tctVar = gd8.a;
        c9c c9cVar = hd8Var != null ? hd8Var.b : null;
        qm8 qm8Var = qm8.t;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, Argument.TAG_DIRECTION, tctVar, d, c9cVar, qm8Var, ns9Var);
        ox8 ox8Var = vct.b;
        c9c c9cVar2 = hd8Var != null ? hd8Var.c : null;
        kzj kzjVar = kzj.F;
        c9c P2 = y2x.P(Y, jSONObject, "duration", ox8Var, d, c9cVar2, kzjVar, gd8.c);
        c9c c9cVar3 = hd8Var != null ? hd8Var.d : null;
        t6f t6fVar = this.a;
        return new hd8(G, P, P2, y2x.N(Y, jSONObject, "end_value", d, c9cVar3, t6fVar.G9), y2x.P(Y, jSONObject, "interpolator", gd8.b, d, hd8Var != null ? hd8Var.e : null, qm8.v, ns9Var), y2x.N(Y, jSONObject, "repeat_count", d, hd8Var != null ? hd8Var.f : null, t6fVar.F2), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, hd8Var != null ? hd8Var.g : null, kzjVar, gd8.d), y2x.N(Y, jSONObject, "start_value", d, hd8Var != null ? hd8Var.h : null, t6fVar.G9));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, hd8 hd8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "animator_id", hd8Var.a);
        y2x.e0(hd8Var.b, t7kVar, Argument.TAG_DIRECTION, qm8.u, jSONObject);
        y2x.f0(t7kVar, jSONObject, "duration", hd8Var.c);
        c9c c9cVar = hd8Var.d;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.G9;
        y2x.i0(t7kVar, jSONObject, "end_value", c9cVar, jyrVar);
        y2x.e0(hd8Var.e, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.i0(t7kVar, jSONObject, "repeat_count", hd8Var.f, t6fVar.F2);
        y2x.f0(t7kVar, jSONObject, "start_delay", hd8Var.g);
        y2x.i0(t7kVar, jSONObject, "start_value", hd8Var.h, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "animator_start");
        return jSONObject;
    }
}
