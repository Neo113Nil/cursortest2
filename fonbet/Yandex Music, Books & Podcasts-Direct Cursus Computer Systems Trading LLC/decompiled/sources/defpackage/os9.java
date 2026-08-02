package defpackage;

import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class os9 implements gip, py7 {
    public final t6f a;

    public os9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v22, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        List Y = etn.Y(t7kVar, jSONObject, "actions", t6fVar.t1);
        tct tctVar = qs9.d;
        vq9 vq9Var = vq9.t;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_vertical", tctVar, vq9Var, ns9Var, null);
        cs9 cs9Var = (cs9) etn.U(t7kVar, jSONObject, C0479n3.g, t6fVar.v8);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        ozb ozbVar = qs9.a;
        ?? e2 = e5f.e(t7kVar, jSONObject, "baseline_offset", ox8Var, kzjVar, ns9Var, ozbVar);
        ozb ozbVar2 = e2 == 0 ? ozbVar : e2;
        js9 js9Var = (js9) etn.U(t7kVar, jSONObject, "border", t6fVar.y8);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e3 = e5f.e(t7kVar, jSONObject, "end", ox8Var2, kzjVar2, qs9.i, null);
        ox8 ox8Var3 = vct.c;
        s3f s3fVar = bcx.i;
        szb e4 = e5f.e(t7kVar, jSONObject, "font_family", ox8Var3, s3fVar, ns9Var, null);
        szb e5 = e5f.e(t7kVar, jSONObject, "font_feature_settings", ox8Var3, s3fVar, ns9Var, null);
        szb e6 = e5f.e(t7kVar, jSONObject, "font_size", ox8Var2, kzjVar2, qs9.j, null);
        tct tctVar2 = qs9.e;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar3 = qs9.b;
        ?? e7 = e5f.e(t7kVar, jSONObject, "font_size_unit", tctVar2, gd9Var, ns9Var, ozbVar3);
        ozb ozbVar4 = e7 == 0 ? ozbVar3 : e7;
        szb e8 = e5f.e(t7kVar, jSONObject, "font_variation_settings", vct.h, s3fVar, ns9Var, null);
        szb e9 = e5f.e(t7kVar, jSONObject, "font_weight", qs9.f, vv8.B, ns9Var, null);
        szb e10 = e5f.e(t7kVar, jSONObject, "font_weight_value", ox8Var2, kzjVar2, qs9.k, null);
        szb e11 = e5f.e(t7kVar, jSONObject, "letter_spacing", ox8Var, kzjVar, ns9Var, null);
        szb e12 = e5f.e(t7kVar, jSONObject, "line_height", ox8Var2, kzjVar2, qs9.l, null);
        ts9 ts9Var = (ts9) etn.U(t7kVar, jSONObject, "mask", t6fVar.J8);
        ns9 ns9Var2 = qs9.m;
        ozb ozbVar5 = qs9.c;
        ?? e13 = e5f.e(t7kVar, jSONObject, "start", ox8Var2, kzjVar2, ns9Var2, ozbVar5);
        ozb ozbVar6 = e13 == 0 ? ozbVar5 : e13;
        tct tctVar3 = qs9.g;
        i49 i49Var = i49.D;
        return new uq9(Y, e, cs9Var, ozbVar2, js9Var, e3, e4, e5, e6, ozbVar4, e8, e9, e10, e11, e12, ts9Var, ozbVar6, e5f.e(t7kVar, jSONObject, "strike", tctVar3, i49Var, ns9Var, null), e5f.e(t7kVar, jSONObject, "text_color", vct.f, kzj.G, ns9Var, null), (dj9) etn.U(t7kVar, jSONObject, "text_shadow", t6fVar.e7), e5f.e(t7kVar, jSONObject, "top_offset", ox8Var2, kzjVar2, qs9.n, null), e5f.e(t7kVar, jSONObject, "underline", qs9.h, i49Var, ns9Var, null));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, uq9 uq9Var) {
        JSONObject jSONObject = new JSONObject();
        List list = uq9Var.a;
        t6f t6fVar = this.a;
        etn.n0(t7kVar, jSONObject, "actions", list, t6fVar.t1);
        szb szbVar = uq9Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("alignment_vertical", b);
                } else {
                    jSONObject.put("alignment_vertical", ((yq9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, C0479n3.g, uq9Var.c, t6fVar.v8);
        e5f.g(t7kVar, jSONObject, "baseline_offset", uq9Var.d);
        etn.m0(t7kVar, jSONObject, "border", uq9Var.e, t6fVar.y8);
        e5f.g(t7kVar, jSONObject, "end", uq9Var.f);
        e5f.g(t7kVar, jSONObject, "font_family", uq9Var.g);
        e5f.g(t7kVar, jSONObject, "font_feature_settings", uq9Var.h);
        e5f.g(t7kVar, jSONObject, "font_size", uq9Var.i);
        szb szbVar2 = uq9Var.j;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("font_size_unit", b2);
                } else {
                    jSONObject.put("font_size_unit", ((jk9) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_variation_settings", uq9Var.k);
        szb szbVar3 = uq9Var.l;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("font_weight", b3);
                } else {
                    jSONObject.put("font_weight", ((e09) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_weight_value", uq9Var.m);
        e5f.g(t7kVar, jSONObject, "letter_spacing", uq9Var.n);
        e5f.g(t7kVar, jSONObject, "line_height", uq9Var.o);
        etn.m0(t7kVar, jSONObject, "mask", uq9Var.p, t6fVar.J8);
        e5f.g(t7kVar, jSONObject, "start", uq9Var.q);
        szb szbVar4 = uq9Var.r;
        i49 i49Var = i49.E;
        e5f.h(t7kVar, jSONObject, "strike", szbVar4, i49Var);
        szb szbVar5 = uq9Var.s;
        if (szbVar5 != null) {
            Object b4 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("text_color", b4);
                } else {
                    jSONObject.put("text_color", c85.a(((Number) b4).intValue()));
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.m0(t7kVar, jSONObject, "text_shadow", uq9Var.t, t6fVar.e7);
        e5f.g(t7kVar, jSONObject, "top_offset", uq9Var.u);
        e5f.h(t7kVar, jSONObject, "underline", uq9Var.v, i49Var);
        return jSONObject;
    }
}
