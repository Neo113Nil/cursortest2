package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z1a implements gip, r8s {
    public final t6f a;

    public z1a(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final b2a c(t7k t7kVar, b2a b2aVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "constrained", vct.a, d, b2aVar != null ? b2aVar.a : null, kzj.B, bcx.h);
        c9c c9cVar = b2aVar != null ? b2aVar.b : null;
        t6f t6fVar = this.a;
        return new b2a(P, y2x.N(Y, jSONObject, "max_size", d, c9cVar, t6fVar.o7), y2x.N(Y, jSONObject, "min_size", d, b2aVar != null ? b2aVar.c : null, t6fVar.o7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, b2a b2aVar) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "constrained", b2aVar.a);
        c9c c9cVar = b2aVar.b;
        jyr jyrVar = this.a.o7;
        y2x.i0(t7kVar, jSONObject, "max_size", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "min_size", b2aVar.c, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
