package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qp9 implements gip, r8s {
    public final t6f a;

    public qp9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "active_background_color", ox8Var, d, null, kzjVar, ns9Var);
        px8 px8Var = vct.h;
        s3f s3fVar = bcx.i;
        c9c P2 = y2x.P(Y, jSONObject, "active_font_variation_settings", px8Var, d, null, s3fVar, ns9Var);
        tct tctVar = rp9.l;
        vv8 vv8Var = vv8.B;
        c9c P3 = y2x.P(Y, jSONObject, "active_font_weight", tctVar, d, null, vv8Var, ns9Var);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "active_font_weight_value", ox8Var2, d, null, kzjVar2, rp9.q);
        c9c P5 = y2x.P(Y, jSONObject, "active_text_color", ox8Var, d, null, kzjVar, ns9Var);
        c9c P6 = y2x.P(Y, jSONObject, "animation_duration", ox8Var2, d, null, kzjVar2, rp9.r);
        c9c P7 = y2x.P(Y, jSONObject, "animation_type", rp9.m, d, null, rk9.H, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "corner_radius", ox8Var2, d, null, kzjVar2, rp9.s);
        t6f t6fVar = this.a;
        return new up9(P, P2, P3, P4, P5, P6, P7, P8, y2x.N(Y, jSONObject, "corners_radius", d, null, t6fVar.C2), y2x.P(Y, jSONObject, "font_family", vct.c, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "font_size", ox8Var2, d, null, kzjVar2, rp9.t), y2x.P(Y, jSONObject, "font_size_unit", rp9.n, d, null, gd9.w0, ns9Var), y2x.P(Y, jSONObject, "font_weight", rp9.o, d, null, vv8Var, ns9Var), y2x.P(Y, jSONObject, "inactive_background_color", ox8Var, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "inactive_font_variation_settings", px8Var, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "inactive_font_weight", rp9.p, d, null, vv8Var, ns9Var), y2x.P(Y, jSONObject, "inactive_font_weight_value", ox8Var2, d, null, kzjVar2, rp9.u), y2x.P(Y, jSONObject, "inactive_text_color", ox8Var, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "item_spacing", ox8Var2, d, null, kzjVar2, rp9.v), y2x.P(Y, jSONObject, "letter_spacing", vct.d, d, null, kzj.E, ns9Var), y2x.P(Y, jSONObject, "line_height", ox8Var2, d, null, kzjVar2, rp9.w), y2x.N(Y, jSONObject, "paddings", d, null, t6fVar.i3));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, up9 up9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = up9Var.a;
        kzj kzjVar = kzj.D;
        y2x.e0(c9cVar, t7kVar, "active_background_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "active_font_variation_settings", up9Var.b);
        c9c c9cVar2 = up9Var.c;
        vv8 vv8Var = vv8.C;
        y2x.e0(c9cVar2, t7kVar, "active_font_weight", vv8Var, jSONObject);
        y2x.f0(t7kVar, jSONObject, "active_font_weight_value", up9Var.d);
        y2x.e0(up9Var.e, t7kVar, "active_text_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "animation_duration", up9Var.f);
        y2x.e0(up9Var.g, t7kVar, "animation_type", rk9.I, jSONObject);
        y2x.f0(t7kVar, jSONObject, "corner_radius", up9Var.h);
        c9c c9cVar3 = up9Var.i;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "corners_radius", c9cVar3, t6fVar.C2);
        y2x.f0(t7kVar, jSONObject, "font_family", up9Var.j);
        y2x.f0(t7kVar, jSONObject, "font_size", up9Var.k);
        y2x.e0(up9Var.l, t7kVar, "font_size_unit", gd9.x0, jSONObject);
        y2x.e0(up9Var.m, t7kVar, "font_weight", vv8Var, jSONObject);
        y2x.e0(up9Var.n, t7kVar, "inactive_background_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "inactive_font_variation_settings", up9Var.o);
        y2x.e0(up9Var.p, t7kVar, "inactive_font_weight", vv8Var, jSONObject);
        y2x.f0(t7kVar, jSONObject, "inactive_font_weight_value", up9Var.q);
        y2x.e0(up9Var.r, t7kVar, "inactive_text_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "item_spacing", up9Var.s);
        y2x.f0(t7kVar, jSONObject, "letter_spacing", up9Var.t);
        y2x.f0(t7kVar, jSONObject, "line_height", up9Var.u);
        y2x.i0(t7kVar, jSONObject, "paddings", up9Var.v, t6fVar.i3);
        return jSONObject;
    }
}
