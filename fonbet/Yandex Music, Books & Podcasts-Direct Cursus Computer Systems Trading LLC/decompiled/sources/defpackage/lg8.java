package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lg8 implements gip, r8s {
    public final t6f a;

    public lg8(t6f t6fVar) {
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
        px8 px8Var = vct.e;
        kzj kzjVar2 = kzj.C;
        c9c P2 = y2x.P(Y, jSONObject, "log_url", px8Var, d, null, kzjVar2, ns9Var);
        c9c R = y2x.R(Y, jSONObject, "menu_items", d, null, t6fVar.x1);
        s3f s3fVar = bcx.i;
        return new pj8(N, P, J, P2, R, y2x.O(Y, jSONObject, "payload", d, null, s3fVar), y2x.P(Y, jSONObject, "referer", px8Var, d, null, kzjVar2, ns9Var), y2x.O(Y, jSONObject, "scope_id", d, null, s3fVar), y2x.P(Y, jSONObject, "target", ng8.b, d, null, va8.x, ns9Var), y2x.N(Y, jSONObject, "typed", d, null, t6fVar.l1), y2x.P(Y, jSONObject, "url", px8Var, d, null, kzjVar2, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pj8 pj8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = pj8Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "download_callbacks", c9cVar, t6fVar.c3);
        y2x.f0(t7kVar, jSONObject, "is_enabled", pj8Var.b);
        y2x.f0(t7kVar, jSONObject, "log_id", pj8Var.c);
        c9c c9cVar2 = pj8Var.d;
        kzj kzjVar = kzj.H;
        y2x.e0(c9cVar2, t7kVar, "log_url", kzjVar, jSONObject);
        y2x.k0(t7kVar, jSONObject, "menu_items", pj8Var.e, t6fVar.x1);
        y2x.h0(t7kVar, jSONObject, "payload", pj8Var.f);
        y2x.e0(pj8Var.g, t7kVar, "referer", kzjVar, jSONObject);
        y2x.h0(t7kVar, jSONObject, "scope_id", pj8Var.h);
        y2x.e0(pj8Var.i, t7kVar, "target", va8.y, jSONObject);
        y2x.i0(t7kVar, jSONObject, "typed", pj8Var.j, t6fVar.l1);
        y2x.e0(pj8Var.k, t7kVar, "url", kzjVar, jSONObject);
        return jSONObject;
    }
}
