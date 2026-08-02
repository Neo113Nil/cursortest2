package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o1a implements gip, r8s {
    public final t6f a;

    public o1a(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "download_callbacks", d, null, t6fVar.c3);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "is_enabled", ox8Var, d, null, kzjVar, ns9Var);
        c9c J = y2x.J(Y, jSONObject, "log_id", vct.c, d, null);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        c9c P2 = y2x.P(Y, jSONObject, "log_limit", ox8Var2, d, null, kzjVar2, p1a.e);
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, "payload", d, null, s3fVar);
        px8 px8Var = vct.e;
        kzj kzjVar3 = kzj.C;
        return new q1a(N, P, J, P2, O, y2x.P(Y, jSONObject, "referer", px8Var, d, null, kzjVar3, ns9Var), y2x.O(Y, jSONObject, "scope_id", d, null, s3fVar), y2x.N(Y, jSONObject, "typed", d, null, t6fVar.l1), y2x.P(Y, jSONObject, "url", px8Var, d, null, kzjVar3, ns9Var), y2x.P(Y, jSONObject, "visibility_duration", ox8Var2, d, null, kzjVar2, p1a.f), y2x.P(Y, jSONObject, "visibility_percentage", ox8Var2, d, null, kzjVar2, p1a.g));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, q1a q1aVar) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = q1aVar.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "download_callbacks", c9cVar, t6fVar.c3);
        y2x.f0(t7kVar, jSONObject, "is_enabled", q1aVar.b);
        y2x.f0(t7kVar, jSONObject, "log_id", q1aVar.c);
        y2x.f0(t7kVar, jSONObject, "log_limit", q1aVar.d);
        y2x.h0(t7kVar, jSONObject, "payload", q1aVar.e);
        c9c c9cVar2 = q1aVar.f;
        kzj kzjVar = kzj.H;
        y2x.e0(c9cVar2, t7kVar, "referer", kzjVar, jSONObject);
        y2x.h0(t7kVar, jSONObject, "scope_id", q1aVar.g);
        y2x.i0(t7kVar, jSONObject, "typed", q1aVar.h, t6fVar.l1);
        y2x.e0(q1aVar.i, t7kVar, "url", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "visibility_duration", q1aVar.j);
        y2x.f0(t7kVar, jSONObject, "visibility_percentage", q1aVar.k);
        return jSONObject;
    }
}
