package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wr9 implements gip, py7 {
    public final t6f a;

    public wr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v102, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v19, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v32, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v34, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v52, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v67, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v70, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v73, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v75, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v77, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v83, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v96, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v98, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xq9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        jyr jyrVar5 = t6fVar.t1;
        bd8 bd8Var = (bd8) etn.U(t7kVar, jSONObject, Constants.KEY_ACTION, jyrVar5);
        sm8 sm8Var = (sm8) etn.U(t7kVar, jSONObject, "action_animation", t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = zr9.a;
        }
        sm8 sm8Var2 = sm8Var;
        List Y = etn.Y(t7kVar, jSONObject, "actions", jyrVar5);
        tct tctVar = zr9.r;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        tct tctVar2 = zr9.s;
        va8 va8Var2 = va8.z0;
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", tctVar2, va8Var2, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = zr9.B;
        ozb ozbVar = zr9.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y2 = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        szb e4 = e5f.e(t7kVar, jSONObject, "auto_ellipsize", ox8Var2, kzjVar2, ns9Var, null);
        List Y3 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ozb ozbVar3 = zr9.c;
        ?? e5 = e5f.e(t7kVar, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e5 == 0 ? ozbVar3 : e5;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e6 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, zr9.C, null);
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y5 = etn.Y(t7kVar, jSONObject, "doubletap_actions", jyrVar5);
        pq9 pq9Var = (pq9) etn.U(t7kVar, jSONObject, "ellipsis", t6fVar.Y8);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        ox8 ox8Var4 = vct.f;
        kzj kzjVar4 = kzj.G;
        szb e7 = e5f.e(t7kVar, jSONObject, "focused_text_color", ox8Var4, kzjVar4, ns9Var, null);
        ox8 ox8Var5 = vct.c;
        s3f s3fVar = bcx.i;
        szb e8 = e5f.e(t7kVar, jSONObject, "font_family", ox8Var5, s3fVar, ns9Var, null);
        szb e9 = e5f.e(t7kVar, jSONObject, "font_feature_settings", ox8Var5, s3fVar, ns9Var, null);
        hm9 hm9Var2 = zr9.D;
        ozb ozbVar5 = zr9.d;
        ?? e10 = e5f.e(t7kVar, jSONObject, "font_size", ox8Var3, kzjVar3, hm9Var2, ozbVar5);
        ozb ozbVar6 = e10 == 0 ? ozbVar5 : e10;
        tct tctVar3 = zr9.t;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar7 = zr9.e;
        ?? e11 = e5f.e(t7kVar, jSONObject, "font_size_unit", tctVar3, gd9Var, ns9Var, ozbVar7);
        ozb ozbVar8 = e11 == 0 ? ozbVar7 : e11;
        szb e12 = e5f.e(t7kVar, jSONObject, "font_variation_settings", vct.h, s3fVar, ns9Var, null);
        szb e13 = e5f.e(t7kVar, jSONObject, "font_weight", zr9.u, vv8.B, ns9Var, null);
        szb e14 = e5f.e(t7kVar, jSONObject, "font_weight_value", ox8Var3, kzjVar3, zr9.E, null);
        List Y7 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = zr9.f;
        }
        bk9 bk9Var2 = bk9Var;
        List Y8 = etn.Y(t7kVar, jSONObject, "hover_end_actions", jyrVar5);
        List Y9 = etn.Y(t7kVar, jSONObject, "hover_start_actions", jyrVar5);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        List Y10 = etn.Y(t7kVar, jSONObject, "images", t6fVar.S8);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ozb ozbVar9 = zr9.g;
        ?? e15 = e5f.e(t7kVar, jSONObject, "letter_spacing", ox8Var, kzjVar, ns9Var, ozbVar9);
        ozb ozbVar10 = e15 == 0 ? ozbVar9 : e15;
        szb e16 = e5f.e(t7kVar, jSONObject, "line_height", ox8Var3, kzjVar3, zr9.F, null);
        List Y11 = etn.Y(t7kVar, jSONObject, "longtap_actions", jyrVar5);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        szb e17 = e5f.e(t7kVar, jSONObject, "max_lines", ox8Var3, kzjVar3, zr9.G, null);
        szb e18 = e5f.e(t7kVar, jSONObject, "min_hidden_lines", ox8Var3, kzjVar3, zr9.H, null);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        List Y12 = etn.Y(t7kVar, jSONObject, "press_end_actions", jyrVar5);
        List Y13 = etn.Y(t7kVar, jSONObject, "press_start_actions", jyrVar5);
        List Y14 = etn.Y(t7kVar, jSONObject, "ranges", t6fVar.P8);
        szb e19 = e5f.e(t7kVar, jSONObject, "reuse_id", ox8Var5, s3fVar, ns9Var, null);
        szb e20 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, zr9.I, null);
        ozb ozbVar11 = zr9.h;
        ?? e21 = e5f.e(t7kVar, jSONObject, "selectable", ox8Var2, kzjVar2, ns9Var, ozbVar11);
        ozb ozbVar12 = e21 == 0 ? ozbVar11 : e21;
        List Y15 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        tct tctVar4 = zr9.v;
        i49 i49Var = i49.D;
        ozb ozbVar13 = zr9.i;
        ?? e22 = e5f.e(t7kVar, jSONObject, "strike", tctVar4, i49Var, ns9Var, ozbVar13);
        ozb ozbVar14 = e22 == 0 ? ozbVar13 : e22;
        szb b = e5f.b(t7kVar, jSONObject, "text", ox8Var5, s3fVar, ns9Var);
        tct tctVar5 = zr9.w;
        ozb ozbVar15 = zr9.j;
        ?? e23 = e5f.e(t7kVar, jSONObject, "text_alignment_horizontal", tctVar5, va8Var, ns9Var, ozbVar15);
        ozb ozbVar16 = e23 == 0 ? ozbVar15 : e23;
        tct tctVar6 = zr9.x;
        ozb ozbVar17 = zr9.k;
        ?? e24 = e5f.e(t7kVar, jSONObject, "text_alignment_vertical", tctVar6, va8Var2, ns9Var, ozbVar17);
        ozb ozbVar18 = e24 == 0 ? ozbVar17 : e24;
        ozb ozbVar19 = zr9.l;
        ?? e25 = e5f.e(t7kVar, jSONObject, "text_color", ox8Var4, kzjVar4, ns9Var, ozbVar19);
        ozb ozbVar20 = e25 == 0 ? ozbVar19 : e25;
        jr9 jr9Var = (jr9) etn.U(t7kVar, jSONObject, "text_gradient", t6fVar.s8);
        dj9 dj9Var = (dj9) etn.U(t7kVar, jSONObject, "text_shadow", t6fVar.e7);
        ozb ozbVar21 = zr9.m;
        ?? e26 = e5f.e(t7kVar, jSONObject, "tighten_width", ox8Var2, kzjVar2, ns9Var, ozbVar21);
        ozb ozbVar22 = e26 == 0 ? ozbVar21 : e26;
        List Y16 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y17 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", zr9.J);
        tct tctVar7 = zr9.y;
        rk9 rk9Var = rk9.B0;
        ozb ozbVar23 = zr9.n;
        ?? e27 = e5f.e(t7kVar, jSONObject, "truncate", tctVar7, rk9Var, ns9Var, ozbVar23);
        ozb ozbVar24 = e27 == 0 ? ozbVar23 : e27;
        tct tctVar8 = zr9.z;
        ozb ozbVar25 = zr9.o;
        ?? e28 = e5f.e(t7kVar, jSONObject, "underline", tctVar8, i49Var, ns9Var, ozbVar25);
        ozb ozbVar26 = e28 == 0 ? ozbVar25 : e28;
        List Y18 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y19 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar9 = zr9.A;
        jx9 jx9Var = jx9.z;
        ozb ozbVar27 = zr9.p;
        ?? e29 = e5f.e(t7kVar, jSONObject, "visibility", tctVar9, jx9Var, ns9Var, ozbVar27);
        if (e29 != 0) {
            ozbVar27 = e29;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y20 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = zr9.q;
        }
        return new xq9(tc8Var, bd8Var, sm8Var2, Y, e, e2, ozbVar2, Y2, e4, Y3, op8Var, ozbVar4, e6, Y4, Y5, pq9Var, Y6, wz8Var, e7, e8, e9, ozbVar6, ozbVar8, e12, e13, e14, Y7, bk9Var2, Y8, Y9, str, Y10, w79Var, ozbVar10, e16, Y11, ix8Var, e17, e18, ix8Var2, Y12, Y13, Y14, e19, e20, ozbVar12, Y15, ozbVar14, b, ozbVar16, ozbVar18, ozbVar20, jr9Var, dj9Var, ozbVar22, Y16, qv9Var, Y17, sq8Var, un8Var, un8Var2, a0, ozbVar24, ozbVar26, Y18, Y19, ozbVar27, l1aVar, Y20, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xq9 xq9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = xq9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        bd8 bd8Var = xq9Var.b;
        jyr jyrVar5 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar5);
        etn.m0(t7kVar, jSONObject, "action_animation", xq9Var.c, t6fVar.z1);
        etn.n0(t7kVar, jSONObject, "actions", xq9Var.d, jyrVar5);
        szb szbVar = xq9Var.e;
        va8 va8Var = va8.y0;
        e5f.h(t7kVar, jSONObject, "alignment_horizontal", szbVar, va8Var);
        szb szbVar2 = xq9Var.f;
        va8 va8Var2 = va8.A0;
        e5f.h(t7kVar, jSONObject, "alignment_vertical", szbVar2, va8Var2);
        e5f.g(t7kVar, jSONObject, "alpha", xq9Var.g);
        etn.n0(t7kVar, jSONObject, "animators", xq9Var.h, t6fVar.C1);
        e5f.g(t7kVar, jSONObject, "auto_ellipsize", xq9Var.i);
        etn.n0(t7kVar, jSONObject, C0479n3.g, xq9Var.j, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", xq9Var.k, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "capture_focus_on_action", xq9Var.l);
        e5f.g(t7kVar, jSONObject, "column_span", xq9Var.m);
        etn.n0(t7kVar, jSONObject, "disappear_actions", xq9Var.n, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "doubletap_actions", xq9Var.o, jyrVar5);
        etn.m0(t7kVar, jSONObject, "ellipsis", xq9Var.p, t6fVar.Y8);
        etn.n0(t7kVar, jSONObject, "extensions", xq9Var.q, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", xq9Var.r, t6fVar.L3);
        szb szbVar3 = xq9Var.s;
        kzj kzjVar = kzj.D;
        e5f.h(t7kVar, jSONObject, "focused_text_color", szbVar3, kzjVar);
        e5f.g(t7kVar, jSONObject, "font_family", xq9Var.t);
        e5f.g(t7kVar, jSONObject, "font_feature_settings", xq9Var.u);
        e5f.g(t7kVar, jSONObject, "font_size", xq9Var.v);
        szb szbVar4 = xq9Var.w;
        if (szbVar4 != null) {
            Object b = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("font_size_unit", b);
                } else {
                    jSONObject.put("font_size_unit", ((jk9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_variation_settings", xq9Var.x);
        szb szbVar5 = xq9Var.y;
        if (szbVar5 != null) {
            Object b2 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("font_weight", b2);
                } else {
                    jSONObject.put("font_weight", ((e09) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_weight_value", xq9Var.z);
        etn.n0(t7kVar, jSONObject, "functions", xq9Var.A, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, xq9Var.B, jyrVar4);
        etn.n0(t7kVar, jSONObject, "hover_end_actions", xq9Var.C, jyrVar5);
        etn.n0(t7kVar, jSONObject, "hover_start_actions", xq9Var.D, jyrVar5);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, xq9Var.E);
        etn.n0(t7kVar, jSONObject, "images", xq9Var.F, t6fVar.S8);
        etn.m0(t7kVar, jSONObject, "layout_provider", xq9Var.G, t6fVar.Y4);
        e5f.g(t7kVar, jSONObject, "letter_spacing", xq9Var.H);
        e5f.g(t7kVar, jSONObject, "line_height", xq9Var.I);
        etn.n0(t7kVar, jSONObject, "longtap_actions", xq9Var.J, jyrVar5);
        etn.m0(t7kVar, jSONObject, "margins", xq9Var.K, jyrVar3);
        e5f.g(t7kVar, jSONObject, "max_lines", xq9Var.L);
        e5f.g(t7kVar, jSONObject, "min_hidden_lines", xq9Var.M);
        etn.m0(t7kVar, jSONObject, "paddings", xq9Var.N, jyrVar3);
        etn.n0(t7kVar, jSONObject, "press_end_actions", xq9Var.O, jyrVar5);
        etn.n0(t7kVar, jSONObject, "press_start_actions", xq9Var.P, jyrVar5);
        etn.n0(t7kVar, jSONObject, "ranges", xq9Var.Q, t6fVar.P8);
        e5f.g(t7kVar, jSONObject, "reuse_id", xq9Var.R);
        e5f.g(t7kVar, jSONObject, "row_span", xq9Var.S);
        e5f.g(t7kVar, jSONObject, "selectable", xq9Var.T);
        etn.n0(t7kVar, jSONObject, "selected_actions", xq9Var.U, jyrVar5);
        szb szbVar6 = xq9Var.V;
        i49 i49Var = i49.E;
        e5f.h(t7kVar, jSONObject, "strike", szbVar6, i49Var);
        e5f.g(t7kVar, jSONObject, "text", xq9Var.W);
        e5f.h(t7kVar, jSONObject, "text_alignment_horizontal", xq9Var.X, va8Var);
        e5f.h(t7kVar, jSONObject, "text_alignment_vertical", xq9Var.Y, va8Var2);
        e5f.h(t7kVar, jSONObject, "text_color", xq9Var.Z, kzjVar);
        etn.m0(t7kVar, jSONObject, "text_gradient", xq9Var.a0, t6fVar.s8);
        etn.m0(t7kVar, jSONObject, "text_shadow", xq9Var.b0, t6fVar.e7);
        e5f.g(t7kVar, jSONObject, "tighten_width", xq9Var.c0);
        etn.n0(t7kVar, jSONObject, "tooltips", xq9Var.d0, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", xq9Var.e0, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", xq9Var.f0, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", xq9Var.g0, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", xq9Var.h0, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", xq9Var.i0, jyrVar2);
        List list = xq9Var.j0;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((nw9) list.get(i)).a);
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        szb szbVar7 = xq9Var.k0;
        if (szbVar7 != null) {
            Object b3 = szbVar7.b();
            try {
                if (szbVar7 instanceof pzb) {
                    jSONObject.put("truncate", b3);
                } else {
                    jSONObject.put("truncate", ((wq9) b3).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "text");
        e5f.h(t7kVar, jSONObject, "underline", xq9Var.l0, i49Var);
        etn.n0(t7kVar, jSONObject, "variable_triggers", xq9Var.m0, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", xq9Var.n0, t6fVar.I9);
        szb szbVar8 = xq9Var.o0;
        if (szbVar8 != null) {
            Object b4 = szbVar8.b();
            try {
                if (szbVar8 instanceof pzb) {
                    jSONObject.put("visibility", b4);
                } else {
                    jSONObject.put("visibility", ((k1a) b4).a);
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", xq9Var.p0, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", xq9Var.q0, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, xq9Var.r0, jyrVar4);
        return jSONObject;
    }
}
