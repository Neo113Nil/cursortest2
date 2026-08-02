package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o59 implements gip, py7 {
    public final t6f a;

    public o59(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v23, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v36, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v40, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v42, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v46, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v61, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v64, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v66, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v68, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v85, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l49 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        jyr jyrVar5 = t6fVar.t1;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = r59.q;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        tct tctVar2 = r59.r;
        va8 va8Var2 = va8.z0;
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", tctVar2, va8Var2, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = r59.A;
        ozb ozbVar = r59.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, l29Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        tct tctVar3 = r59.s;
        p19 p19Var = p19.x0;
        ozb ozbVar3 = r59.b;
        ?? e4 = e5f.e(t7kVar, jSONObject, "autocapitalization", tctVar3, p19Var, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e5 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, r59.B, null);
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "enter_key_actions", jyrVar5);
        tct tctVar4 = r59.t;
        p19 p19Var2 = p19.z0;
        ozb ozbVar5 = r59.c;
        ?? e6 = e5f.e(t7kVar, jSONObject, "enter_key_type", tctVar4, p19Var2, ns9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        List Y5 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        List Y6 = etn.Y(t7kVar, jSONObject, "filters", t6fVar.B4);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        ox8 ox8Var3 = vct.c;
        s3f s3fVar = bcx.i;
        szb e7 = e5f.e(t7kVar, jSONObject, "font_family", ox8Var3, s3fVar, ns9Var, null);
        l29 l29Var2 = r59.C;
        ozb ozbVar7 = r59.d;
        ?? e8 = e5f.e(t7kVar, jSONObject, "font_size", ox8Var2, kzjVar2, l29Var2, ozbVar7);
        ozb ozbVar8 = e8 == 0 ? ozbVar7 : e8;
        tct tctVar5 = r59.u;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar9 = r59.e;
        ?? e9 = e5f.e(t7kVar, jSONObject, "font_size_unit", tctVar5, gd9Var, ns9Var, ozbVar9);
        ozb ozbVar10 = e9 == 0 ? ozbVar9 : e9;
        szb e10 = e5f.e(t7kVar, jSONObject, "font_variation_settings", vct.h, s3fVar, ns9Var, null);
        szb e11 = e5f.e(t7kVar, jSONObject, "font_weight", r59.v, vv8.B, ns9Var, null);
        szb e12 = e5f.e(t7kVar, jSONObject, "font_weight_value", ox8Var2, kzjVar2, r59.D, null);
        List Y7 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = r59.f;
        }
        bk9 bk9Var2 = bk9Var;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar3 = kzj.G;
        szb e13 = e5f.e(t7kVar, jSONObject, "highlight_color", ox8Var4, kzjVar3, ns9Var, null);
        ozb ozbVar11 = r59.g;
        ?? e14 = e5f.e(t7kVar, jSONObject, "hint_color", ox8Var4, kzjVar3, ns9Var, ozbVar11);
        ozb ozbVar12 = e14 == 0 ? ozbVar11 : e14;
        szb e15 = e5f.e(t7kVar, jSONObject, "hint_text", ox8Var3, s3fVar, ns9Var, null);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        ox8 ox8Var5 = vct.a;
        kzj kzjVar4 = kzj.B;
        ozb ozbVar13 = r59.h;
        ?? e16 = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var5, kzjVar4, ns9Var, ozbVar13);
        ozb ozbVar14 = e16 == 0 ? ozbVar13 : e16;
        tct tctVar6 = r59.w;
        p19 p19Var3 = p19.B0;
        ozb ozbVar15 = r59.i;
        ?? e17 = e5f.e(t7kVar, jSONObject, "keyboard_type", tctVar6, p19Var3, ns9Var, ozbVar15);
        ozb ozbVar16 = e17 == 0 ? ozbVar15 : e17;
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ozb ozbVar17 = r59.j;
        ?? e18 = e5f.e(t7kVar, jSONObject, "letter_spacing", ox8Var, kzjVar, ns9Var, ozbVar17);
        ozb ozbVar18 = e18 == 0 ? ozbVar17 : e18;
        szb e19 = e5f.e(t7kVar, jSONObject, "line_height", ox8Var2, kzjVar2, r59.E, null);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        v59 v59Var = (v59) etn.U(t7kVar, jSONObject, "mask", t6fVar.E4);
        szb e20 = e5f.e(t7kVar, jSONObject, "max_length", ox8Var2, kzjVar2, r59.F, null);
        szb e21 = e5f.e(t7kVar, jSONObject, "max_visible_lines", ox8Var2, kzjVar2, r59.G, null);
        k49 k49Var = (k49) etn.U(t7kVar, jSONObject, "native_interface", t6fVar.V4);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        szb e22 = e5f.e(t7kVar, jSONObject, "reuse_id", ox8Var3, s3fVar, ns9Var, null);
        szb e23 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, r59.H, null);
        ozb ozbVar19 = r59.k;
        ?? e24 = e5f.e(t7kVar, jSONObject, "select_all_on_focus", ox8Var5, kzjVar4, ns9Var, ozbVar19);
        ozb ozbVar20 = e24 == 0 ? ozbVar19 : e24;
        List Y8 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        tct tctVar7 = r59.x;
        ozb ozbVar21 = r59.l;
        ?? e25 = e5f.e(t7kVar, jSONObject, "text_alignment_horizontal", tctVar7, va8Var, ns9Var, ozbVar21);
        ozb ozbVar22 = e25 == 0 ? ozbVar21 : e25;
        tct tctVar8 = r59.y;
        ozb ozbVar23 = r59.m;
        ?? e26 = e5f.e(t7kVar, jSONObject, "text_alignment_vertical", tctVar8, va8Var2, ns9Var, ozbVar23);
        ozb ozbVar24 = e26 == 0 ? ozbVar23 : e26;
        ozb ozbVar25 = r59.n;
        ?? e27 = e5f.e(t7kVar, jSONObject, "text_color", ox8Var4, kzjVar3, ns9Var, ozbVar25);
        ozb ozbVar26 = e27 == 0 ? ozbVar25 : e27;
        Object opt2 = jSONObject.opt("text_variable");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw a8k.g("text_variable", jSONObject);
        }
        String str2 = (String) obj2;
        List Y9 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y10 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", r59.I);
        List Y11 = etn.Y(t7kVar, jSONObject, "validators", t6fVar.P4);
        List Y12 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y13 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar9 = r59.z;
        jx9 jx9Var = jx9.z;
        ozb ozbVar27 = r59.o;
        ?? e28 = e5f.e(t7kVar, jSONObject, "visibility", tctVar9, jx9Var, ns9Var, ozbVar27);
        if (e28 != 0) {
            ozbVar27 = e28;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y14 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = r59.p;
        }
        return new l49(tc8Var, e, e2, ozbVar2, Y, ozbVar4, Y2, op8Var, e5, Y3, Y4, ozbVar6, Y5, Y6, wz8Var, e7, ozbVar8, ozbVar10, e10, e11, e12, Y7, bk9Var2, e13, ozbVar12, e15, str, ozbVar14, ozbVar16, w79Var, ozbVar18, e19, ix8Var, v59Var, e20, e21, k49Var, ix8Var2, e22, e23, ozbVar20, Y8, ozbVar22, ozbVar24, ozbVar26, str2, Y9, qv9Var, Y10, sq8Var, un8Var, un8Var2, a0, Y11, Y12, Y13, ozbVar27, l1aVar, Y14, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, l49 l49Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = l49Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        jyr jyrVar5 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = l49Var.b;
        va8 va8Var = va8.y0;
        e5f.h(t7kVar, jSONObject, "alignment_horizontal", szbVar, va8Var);
        szb szbVar2 = l49Var.c;
        va8 va8Var2 = va8.A0;
        e5f.h(t7kVar, jSONObject, "alignment_vertical", szbVar2, va8Var2);
        e5f.g(t7kVar, jSONObject, "alpha", l49Var.d);
        etn.n0(t7kVar, jSONObject, "animators", l49Var.e, t6fVar.C1);
        szb szbVar3 = l49Var.f;
        if (szbVar3 != null) {
            Object b = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("autocapitalization", b);
                } else {
                    jSONObject.put("autocapitalization", ((g49) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.n0(t7kVar, jSONObject, C0479n3.g, l49Var.g, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", l49Var.h, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", l49Var.i);
        etn.n0(t7kVar, jSONObject, "disappear_actions", l49Var.j, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "enter_key_actions", l49Var.k, jyrVar5);
        szb szbVar4 = l49Var.l;
        if (szbVar4 != null) {
            Object b2 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("enter_key_type", b2);
                } else {
                    jSONObject.put("enter_key_type", ((h49) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        etn.n0(t7kVar, jSONObject, "extensions", l49Var.m, t6fVar.k3);
        etn.n0(t7kVar, jSONObject, "filters", l49Var.n, t6fVar.B4);
        etn.m0(t7kVar, jSONObject, "focus", l49Var.o, t6fVar.L3);
        e5f.g(t7kVar, jSONObject, "font_family", l49Var.p);
        e5f.g(t7kVar, jSONObject, "font_size", l49Var.q);
        szb szbVar5 = l49Var.r;
        if (szbVar5 != null) {
            Object b3 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("font_size_unit", b3);
                } else {
                    jSONObject.put("font_size_unit", ((jk9) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_variation_settings", l49Var.s);
        szb szbVar6 = l49Var.t;
        if (szbVar6 != null) {
            Object b4 = szbVar6.b();
            try {
                if (szbVar6 instanceof pzb) {
                    jSONObject.put("font_weight", b4);
                } else {
                    jSONObject.put("font_weight", ((e09) b4).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_weight_value", l49Var.u);
        etn.n0(t7kVar, jSONObject, "functions", l49Var.v, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, l49Var.w, jyrVar4);
        szb szbVar7 = l49Var.x;
        kzj kzjVar = kzj.D;
        e5f.h(t7kVar, jSONObject, "highlight_color", szbVar7, kzjVar);
        e5f.h(t7kVar, jSONObject, "hint_color", l49Var.y, kzjVar);
        e5f.g(t7kVar, jSONObject, "hint_text", l49Var.z);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, l49Var.A);
        e5f.g(t7kVar, jSONObject, "is_enabled", l49Var.B);
        szb szbVar8 = l49Var.C;
        if (szbVar8 != null) {
            Object b5 = szbVar8.b();
            try {
                if (szbVar8 instanceof pzb) {
                    jSONObject.put("keyboard_type", b5);
                } else {
                    jSONObject.put("keyboard_type", ((j49) b5).a);
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.m0(t7kVar, jSONObject, "layout_provider", l49Var.D, t6fVar.Y4);
        e5f.g(t7kVar, jSONObject, "letter_spacing", l49Var.E);
        e5f.g(t7kVar, jSONObject, "line_height", l49Var.F);
        etn.m0(t7kVar, jSONObject, "margins", l49Var.G, jyrVar3);
        etn.m0(t7kVar, jSONObject, "mask", l49Var.H, t6fVar.E4);
        e5f.g(t7kVar, jSONObject, "max_length", l49Var.I);
        e5f.g(t7kVar, jSONObject, "max_visible_lines", l49Var.J);
        etn.m0(t7kVar, jSONObject, "native_interface", l49Var.K, t6fVar.V4);
        etn.m0(t7kVar, jSONObject, "paddings", l49Var.L, jyrVar3);
        e5f.g(t7kVar, jSONObject, "reuse_id", l49Var.M);
        e5f.g(t7kVar, jSONObject, "row_span", l49Var.N);
        e5f.g(t7kVar, jSONObject, "select_all_on_focus", l49Var.O);
        etn.n0(t7kVar, jSONObject, "selected_actions", l49Var.P, jyrVar5);
        e5f.h(t7kVar, jSONObject, "text_alignment_horizontal", l49Var.Q, va8Var);
        e5f.h(t7kVar, jSONObject, "text_alignment_vertical", l49Var.R, va8Var2);
        e5f.h(t7kVar, jSONObject, "text_color", l49Var.S, kzjVar);
        etn.l0(t7kVar, jSONObject, "text_variable", l49Var.T);
        etn.n0(t7kVar, jSONObject, "tooltips", l49Var.U, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", l49Var.V, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", l49Var.W, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", l49Var.X, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", l49Var.Y, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", l49Var.Z, jyrVar2);
        List list = l49Var.a0;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((nw9) list.get(i)).a);
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e6) {
                t7kVar.a().a(e6);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "input");
        etn.n0(t7kVar, jSONObject, "validators", l49Var.b0, t6fVar.P4);
        etn.n0(t7kVar, jSONObject, "variable_triggers", l49Var.c0, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", l49Var.d0, t6fVar.I9);
        szb szbVar9 = l49Var.e0;
        if (szbVar9 != null) {
            Object b6 = szbVar9.b();
            try {
                if (szbVar9 instanceof pzb) {
                    jSONObject.put("visibility", b6);
                } else {
                    jSONObject.put("visibility", ((k1a) b6).a);
                }
            } catch (JSONException e7) {
                t7kVar.a().a(e7);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", l49Var.f0, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", l49Var.g0, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, l49Var.h0, jyrVar4);
        return jSONObject;
    }
}
