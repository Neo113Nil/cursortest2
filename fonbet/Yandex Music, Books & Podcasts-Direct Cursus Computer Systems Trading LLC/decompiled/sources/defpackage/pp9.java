package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pp9 implements gip, py7 {
    public final t6f a;

    public pp9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v10, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v16, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v20, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v26, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v28, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v30, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v6, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ozb ozbVar = rp9.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "active_background_color", ox8Var, kzjVar, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        px8 px8Var = vct.h;
        s3f s3fVar = bcx.i;
        szb e2 = e5f.e(t7kVar, jSONObject, "active_font_variation_settings", px8Var, s3fVar, ns9Var, null);
        tct tctVar = rp9.l;
        vv8 vv8Var = vv8.B;
        szb e3 = e5f.e(t7kVar, jSONObject, "active_font_weight", tctVar, vv8Var, ns9Var, null);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "active_font_weight_value", ox8Var2, kzjVar2, rp9.q, null);
        ozb ozbVar3 = rp9.b;
        ?? e5 = e5f.e(t7kVar, jSONObject, "active_text_color", ox8Var, kzjVar, ns9Var, ozbVar3);
        ozb ozbVar4 = e5 == 0 ? ozbVar3 : e5;
        hm9 hm9Var = rp9.r;
        ozb ozbVar5 = rp9.c;
        ?? e6 = e5f.e(t7kVar, jSONObject, "animation_duration", ox8Var2, kzjVar2, hm9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        tct tctVar2 = rp9.m;
        rk9 rk9Var = rk9.H;
        ozb ozbVar7 = rp9.d;
        ?? e7 = e5f.e(t7kVar, jSONObject, "animation_type", tctVar2, rk9Var, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        szb e8 = e5f.e(t7kVar, jSONObject, "corner_radius", ox8Var2, kzjVar2, rp9.s, null);
        t6f t6fVar = this.a;
        fu8 fu8Var = (fu8) etn.U(t7kVar, jSONObject, "corners_radius", t6fVar.B2);
        szb e9 = e5f.e(t7kVar, jSONObject, "font_family", vct.c, s3fVar, ns9Var, null);
        hm9 hm9Var2 = rp9.t;
        ozb ozbVar9 = rp9.e;
        ?? e10 = e5f.e(t7kVar, jSONObject, "font_size", ox8Var2, kzjVar2, hm9Var2, ozbVar9);
        ozb ozbVar10 = e10 == 0 ? ozbVar9 : e10;
        tct tctVar3 = rp9.n;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar11 = rp9.f;
        ?? e11 = e5f.e(t7kVar, jSONObject, "font_size_unit", tctVar3, gd9Var, ns9Var, ozbVar11);
        ozb ozbVar12 = e11 == 0 ? ozbVar11 : e11;
        tct tctVar4 = rp9.o;
        ozb ozbVar13 = rp9.g;
        ?? e12 = e5f.e(t7kVar, jSONObject, "font_weight", tctVar4, vv8Var, ns9Var, ozbVar13);
        ozb ozbVar14 = e12 == 0 ? ozbVar13 : e12;
        szb e13 = e5f.e(t7kVar, jSONObject, "inactive_background_color", ox8Var, kzjVar, ns9Var, null);
        szb e14 = e5f.e(t7kVar, jSONObject, "inactive_font_variation_settings", px8Var, s3fVar, ns9Var, null);
        szb e15 = e5f.e(t7kVar, jSONObject, "inactive_font_weight", rp9.p, vv8Var, ns9Var, null);
        szb e16 = e5f.e(t7kVar, jSONObject, "inactive_font_weight_value", ox8Var2, kzjVar2, rp9.u, null);
        ozb ozbVar15 = rp9.h;
        ?? e17 = e5f.e(t7kVar, jSONObject, "inactive_text_color", ox8Var, kzjVar, ns9Var, ozbVar15);
        ozb ozbVar16 = e17 == 0 ? ozbVar15 : e17;
        hm9 hm9Var3 = rp9.v;
        ozb ozbVar17 = rp9.i;
        ?? e18 = e5f.e(t7kVar, jSONObject, "item_spacing", ox8Var2, kzjVar2, hm9Var3, ozbVar17);
        ozb ozbVar18 = e18 == 0 ? ozbVar17 : e18;
        ox8 ox8Var3 = vct.d;
        kzj kzjVar3 = kzj.E;
        ozb ozbVar19 = rp9.j;
        ?? e19 = e5f.e(t7kVar, jSONObject, "letter_spacing", ox8Var3, kzjVar3, ns9Var, ozbVar19);
        ozb ozbVar20 = e19 == 0 ? ozbVar19 : e19;
        szb e20 = e5f.e(t7kVar, jSONObject, "line_height", ox8Var2, kzjVar2, rp9.w, null);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "paddings", t6fVar.h3);
        if (ix8Var == null) {
            ix8Var = rp9.k;
        }
        return new uo9(ozbVar2, e2, e3, e4, ozbVar4, ozbVar6, ozbVar8, e8, fu8Var, e9, ozbVar10, ozbVar12, ozbVar14, e13, e14, e15, e16, ozbVar16, ozbVar18, ozbVar20, e20, ix8Var);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, uo9 uo9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = uo9Var.a;
        kzj kzjVar = kzj.D;
        e5f.h(t7kVar, jSONObject, "active_background_color", szbVar, kzjVar);
        e5f.g(t7kVar, jSONObject, "active_font_variation_settings", uo9Var.b);
        szb szbVar2 = uo9Var.c;
        vv8 vv8Var = vv8.C;
        e5f.h(t7kVar, jSONObject, "active_font_weight", szbVar2, vv8Var);
        e5f.g(t7kVar, jSONObject, "active_font_weight_value", uo9Var.d);
        e5f.h(t7kVar, jSONObject, "active_text_color", uo9Var.e, kzjVar);
        e5f.g(t7kVar, jSONObject, "animation_duration", uo9Var.f);
        szb szbVar3 = uo9Var.g;
        if (szbVar3 != null) {
            Object b = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("animation_type", b);
                } else {
                    jSONObject.put("animation_type", ((to9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "corner_radius", uo9Var.h);
        fu8 fu8Var = uo9Var.i;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "corners_radius", fu8Var, t6fVar.B2);
        e5f.g(t7kVar, jSONObject, "font_family", uo9Var.j);
        e5f.g(t7kVar, jSONObject, "font_size", uo9Var.k);
        szb szbVar4 = uo9Var.l;
        if (szbVar4 != null) {
            Object b2 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("font_size_unit", b2);
                } else {
                    jSONObject.put("font_size_unit", ((jk9) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.h(t7kVar, jSONObject, "font_weight", uo9Var.m, vv8Var);
        e5f.h(t7kVar, jSONObject, "inactive_background_color", uo9Var.n, kzjVar);
        e5f.g(t7kVar, jSONObject, "inactive_font_variation_settings", uo9Var.o);
        e5f.h(t7kVar, jSONObject, "inactive_font_weight", uo9Var.p, vv8Var);
        e5f.g(t7kVar, jSONObject, "inactive_font_weight_value", uo9Var.q);
        e5f.h(t7kVar, jSONObject, "inactive_text_color", uo9Var.r, kzjVar);
        e5f.g(t7kVar, jSONObject, "item_spacing", uo9Var.s);
        e5f.g(t7kVar, jSONObject, "letter_spacing", uo9Var.t);
        e5f.g(t7kVar, jSONObject, "line_height", uo9Var.u);
        etn.m0(t7kVar, jSONObject, "paddings", uo9Var.v, t6fVar.h3);
        return jSONObject;
    }
}
