package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class et9 implements gip, r8s {
    public final t6f a;

    public et9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final ht9 c(t7k t7kVar, ht9 ht9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.f;
        c9c c9cVar = ht9Var != null ? ht9Var.a : null;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        c9c K = y2x.K(Y, jSONObject, "color", ox8Var, d, c9cVar, kzjVar, ns9Var);
        c9c P = y2x.P(Y, jSONObject, "density", vct.d, d, ht9Var != null ? ht9Var.b : null, kzj.E, gt9.e);
        ox8 ox8Var2 = vct.a;
        c9c c9cVar2 = ht9Var != null ? ht9Var.c : null;
        kzj kzjVar2 = kzj.B;
        return new ht9(K, P, y2x.P(Y, jSONObject, "is_animated", ox8Var2, d, c9cVar2, kzjVar2, ns9Var), y2x.P(Y, jSONObject, "is_enabled", ox8Var2, d, ht9Var != null ? ht9Var.d : null, kzjVar2, ns9Var), y2x.N(Y, jSONObject, "particle_size", d, ht9Var != null ? ht9Var.e : null, this.a.G3));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ht9 ht9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(ht9Var.a, t7kVar, "color", kzj.D, jSONObject);
        y2x.f0(t7kVar, jSONObject, "density", ht9Var.b);
        y2x.f0(t7kVar, jSONObject, "is_animated", ht9Var.c);
        y2x.f0(t7kVar, jSONObject, "is_enabled", ht9Var.d);
        y2x.i0(t7kVar, jSONObject, "particle_size", ht9Var.e, this.a.G3);
        etn.l0(t7kVar, jSONObject, "type", "particles");
        return jSONObject;
    }
}
