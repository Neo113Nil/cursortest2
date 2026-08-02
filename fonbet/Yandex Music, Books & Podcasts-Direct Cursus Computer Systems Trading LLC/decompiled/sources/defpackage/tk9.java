package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tk9 implements gip, r8s {
    public final t6f a;

    public tk9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final wk9 c(t7k t7kVar, wk9 wk9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c N = y2x.N(Y, jSONObject, "distance", d, wk9Var != null ? wk9Var.a : null, this.a.W2);
        ox8 ox8Var = vct.b;
        c9c c9cVar = wk9Var != null ? wk9Var.b : null;
        kzj kzjVar = kzj.F;
        c9c P = y2x.P(Y, jSONObject, "duration", ox8Var, d, c9cVar, kzjVar, vk9.g);
        tct tctVar = vk9.e;
        c9c c9cVar2 = wk9Var != null ? wk9Var.c : null;
        gd9 gd9Var = gd9.z0;
        ns9 ns9Var = bcx.h;
        return new wk9(N, P, y2x.P(Y, jSONObject, "edge", tctVar, d, c9cVar2, gd9Var, ns9Var), y2x.P(Y, jSONObject, "interpolator", vk9.f, d, wk9Var != null ? wk9Var.d : null, qm8.v, ns9Var), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, wk9Var != null ? wk9Var.e : null, kzjVar, vk9.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, wk9 wk9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "distance", wk9Var.a, this.a.W2);
        y2x.f0(t7kVar, jSONObject, "duration", wk9Var.b);
        y2x.e0(wk9Var.c, t7kVar, "edge", gd9.A0, jSONObject);
        y2x.e0(wk9Var.d, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.f0(t7kVar, jSONObject, "start_delay", wk9Var.e);
        etn.l0(t7kVar, jSONObject, "type", "slide");
        return jSONObject;
    }
}
