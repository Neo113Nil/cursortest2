package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ul9 implements gip, r8s {
    public final t6f a;

    public ul9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "font_family", ox8Var, d, null, s3fVar, ns9Var);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar = kzj.F;
        return new rl9(P, y2x.P(Y, jSONObject, "font_size", ox8Var2, d, null, kzjVar, vl9.g), y2x.P(Y, jSONObject, "font_size_unit", vl9.e, d, null, gd9.w0, ns9Var), y2x.P(Y, jSONObject, "font_variation_settings", vct.h, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "font_weight", vl9.f, d, null, vv8.B, ns9Var), y2x.P(Y, jSONObject, "font_weight_value", ox8Var2, d, null, kzjVar, vl9.h), y2x.P(Y, jSONObject, "letter_spacing", vct.d, d, null, kzj.E, ns9Var), y2x.N(Y, jSONObject, "offset", d, null, this.a.m6), y2x.P(Y, jSONObject, "text_color", vct.f, d, null, kzj.G, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, rl9 rl9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "font_family", rl9Var.a);
        y2x.f0(t7kVar, jSONObject, "font_size", rl9Var.b);
        y2x.e0(rl9Var.c, t7kVar, "font_size_unit", gd9.x0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_variation_settings", rl9Var.d);
        y2x.e0(rl9Var.e, t7kVar, "font_weight", vv8.C, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_weight_value", rl9Var.f);
        y2x.f0(t7kVar, jSONObject, "letter_spacing", rl9Var.g);
        y2x.i0(t7kVar, jSONObject, "offset", rl9Var.h, this.a.m6);
        y2x.e0(rl9Var.i, t7kVar, "text_color", kzj.D, jSONObject);
        return jSONObject;
    }
}
