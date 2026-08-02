package defpackage;

import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ps9 implements gip, r8s {
    public final t6f a;

    public ps9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        c9c R = y2x.R(Y, jSONObject, "actions", d, null, t6fVar.u1);
        tct tctVar = qs9.d;
        vq9 vq9Var = vq9.t;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_vertical", tctVar, d, null, vq9Var, ns9Var);
        c9c N = y2x.N(Y, jSONObject, C0479n3.g, d, null, t6fVar.w8);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        c9c P2 = y2x.P(Y, jSONObject, "baseline_offset", ox8Var, d, null, kzjVar, ns9Var);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, null, t6fVar.z8);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        c9c P3 = y2x.P(Y, jSONObject, "end", ox8Var2, d, null, kzjVar2, qs9.i);
        ox8 ox8Var3 = vct.c;
        s3f s3fVar = bcx.i;
        c9c P4 = y2x.P(Y, jSONObject, "font_family", ox8Var3, d, null, s3fVar, ns9Var);
        c9c P5 = y2x.P(Y, jSONObject, "font_feature_settings", ox8Var3, d, null, s3fVar, ns9Var);
        c9c P6 = y2x.P(Y, jSONObject, "font_size", ox8Var2, d, null, kzjVar2, qs9.j);
        c9c P7 = y2x.P(Y, jSONObject, "font_size_unit", qs9.e, d, null, gd9.w0, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "font_variation_settings", vct.h, d, null, s3fVar, ns9Var);
        c9c P9 = y2x.P(Y, jSONObject, "font_weight", qs9.f, d, null, vv8.B, ns9Var);
        c9c P10 = y2x.P(Y, jSONObject, "font_weight_value", ox8Var2, d, null, kzjVar2, qs9.k);
        c9c P11 = y2x.P(Y, jSONObject, "letter_spacing", ox8Var, d, null, kzjVar, ns9Var);
        c9c P12 = y2x.P(Y, jSONObject, "line_height", ox8Var2, d, null, kzjVar2, qs9.l);
        c9c N3 = y2x.N(Y, jSONObject, "mask", d, null, t6fVar.K8);
        c9c P13 = y2x.P(Y, jSONObject, "start", ox8Var2, d, null, kzjVar2, qs9.m);
        tct tctVar2 = qs9.g;
        i49 i49Var = i49.D;
        return new yt9(R, P, N, P2, N2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, N3, P13, y2x.P(Y, jSONObject, "strike", tctVar2, d, null, i49Var, ns9Var), y2x.P(Y, jSONObject, "text_color", vct.f, d, null, kzj.G, ns9Var), y2x.N(Y, jSONObject, "text_shadow", d, null, t6fVar.f7), y2x.P(Y, jSONObject, "top_offset", ox8Var2, d, null, kzjVar2, qs9.n), y2x.P(Y, jSONObject, "underline", qs9.h, d, null, i49Var, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, yt9 yt9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = yt9Var.a;
        t6f t6fVar = this.a;
        y2x.k0(t7kVar, jSONObject, "actions", c9cVar, t6fVar.u1);
        y2x.e0(yt9Var.b, t7kVar, "alignment_vertical", vq9.u, jSONObject);
        y2x.i0(t7kVar, jSONObject, C0479n3.g, yt9Var.c, t6fVar.w8);
        y2x.f0(t7kVar, jSONObject, "baseline_offset", yt9Var.d);
        y2x.i0(t7kVar, jSONObject, "border", yt9Var.e, t6fVar.z8);
        y2x.f0(t7kVar, jSONObject, "end", yt9Var.f);
        y2x.f0(t7kVar, jSONObject, "font_family", yt9Var.g);
        y2x.f0(t7kVar, jSONObject, "font_feature_settings", yt9Var.h);
        y2x.f0(t7kVar, jSONObject, "font_size", yt9Var.i);
        y2x.e0(yt9Var.j, t7kVar, "font_size_unit", gd9.x0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_variation_settings", yt9Var.k);
        y2x.e0(yt9Var.l, t7kVar, "font_weight", vv8.C, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_weight_value", yt9Var.m);
        y2x.f0(t7kVar, jSONObject, "letter_spacing", yt9Var.n);
        y2x.f0(t7kVar, jSONObject, "line_height", yt9Var.o);
        y2x.i0(t7kVar, jSONObject, "mask", yt9Var.p, t6fVar.K8);
        y2x.f0(t7kVar, jSONObject, "start", yt9Var.q);
        c9c c9cVar2 = yt9Var.r;
        i49 i49Var = i49.E;
        y2x.e0(c9cVar2, t7kVar, "strike", i49Var, jSONObject);
        y2x.e0(yt9Var.s, t7kVar, "text_color", kzj.D, jSONObject);
        y2x.i0(t7kVar, jSONObject, "text_shadow", yt9Var.t, t6fVar.f7);
        y2x.f0(t7kVar, jSONObject, "top_offset", yt9Var.u);
        y2x.e0(yt9Var.v, t7kVar, "underline", i49Var, jSONObject);
        return jSONObject;
    }
}
