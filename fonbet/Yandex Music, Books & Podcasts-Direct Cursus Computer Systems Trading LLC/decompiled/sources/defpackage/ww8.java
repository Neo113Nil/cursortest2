package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ww8 implements gip, r8s {
    public final t6f a;

    public ww8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        c9c P = y2x.P(Y, jSONObject, "disappear_duration", ox8Var, d, null, kzjVar, xw8.e);
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "download_callbacks", d, null, t6fVar.c3);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ns9 ns9Var = bcx.h;
        c9c P2 = y2x.P(Y, jSONObject, "is_enabled", ox8Var2, d, null, kzjVar2, ns9Var);
        c9c J = y2x.J(Y, jSONObject, "log_id", vct.c, d, null);
        c9c P3 = y2x.P(Y, jSONObject, "log_limit", ox8Var, d, null, kzjVar, xw8.f);
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, "payload", d, null, s3fVar);
        px8 px8Var = vct.e;
        kzj kzjVar3 = kzj.C;
        return new yw8(P, N, P2, J, P3, O, y2x.P(Y, jSONObject, "referer", px8Var, d, null, kzjVar3, ns9Var), y2x.O(Y, jSONObject, "scope_id", d, null, s3fVar), y2x.N(Y, jSONObject, "typed", d, null, t6fVar.l1), y2x.P(Y, jSONObject, "url", px8Var, d, null, kzjVar3, ns9Var), y2x.P(Y, jSONObject, "visibility_percentage", ox8Var, d, null, kzjVar, xw8.g));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, yw8 yw8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "disappear_duration", yw8Var.a);
        c9c c9cVar = yw8Var.b;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "download_callbacks", c9cVar, t6fVar.c3);
        y2x.f0(t7kVar, jSONObject, "is_enabled", yw8Var.c);
        y2x.f0(t7kVar, jSONObject, "log_id", yw8Var.d);
        y2x.f0(t7kVar, jSONObject, "log_limit", yw8Var.e);
        y2x.h0(t7kVar, jSONObject, "payload", yw8Var.f);
        c9c c9cVar2 = yw8Var.g;
        kzj kzjVar = kzj.H;
        y2x.e0(c9cVar2, t7kVar, "referer", kzjVar, jSONObject);
        y2x.h0(t7kVar, jSONObject, "scope_id", yw8Var.h);
        y2x.i0(t7kVar, jSONObject, "typed", yw8Var.i, t6fVar.l1);
        y2x.e0(yw8Var.j, t7kVar, "url", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "visibility_percentage", yw8Var.k);
        return jSONObject;
    }
}
