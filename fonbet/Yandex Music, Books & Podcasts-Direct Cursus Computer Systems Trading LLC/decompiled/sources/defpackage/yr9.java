package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yr9 implements u8s {
    public final t6f a;

    public yr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v101, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v19, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v32, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v34, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v51, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v66, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v69, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v72, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v74, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v76, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v82, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v95, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v97, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xq9 a(t7k t7kVar, zt9 zt9Var, JSONObject jSONObject) {
        c9c c9cVar = zt9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        bd8 bd8Var = (bd8) h4a.K(t7kVar, zt9Var.b, jSONObject, Constants.KEY_ACTION, t6fVar.v1, t6fVar.t1);
        sm8 sm8Var = (sm8) h4a.K(t7kVar, zt9Var.c, jSONObject, "action_animation", t6fVar.B1, t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = zr9.a;
        }
        sm8 sm8Var2 = sm8Var;
        List V = h4a.V(t7kVar, zt9Var.d, jSONObject, "actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar2 = zt9Var.e;
        tct tctVar = zr9.r;
        va8 va8Var = va8.x0;
        szb O = h4a.O(t7kVar, c9cVar2, jSONObject, "alignment_horizontal", tctVar, va8Var);
        c9c c9cVar3 = zt9Var.f;
        tct tctVar2 = zr9.s;
        va8 va8Var2 = va8.z0;
        szb O2 = h4a.O(t7kVar, c9cVar3, jSONObject, "alignment_vertical", tctVar2, va8Var2);
        c9c c9cVar4 = zt9Var.g;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = zr9.B;
        ozb ozbVar = zr9.b;
        ?? R = h4a.R(t7kVar, c9cVar4, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        ozb ozbVar2 = R == 0 ? ozbVar : R;
        List V2 = h4a.V(t7kVar, zt9Var.h, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        c9c c9cVar5 = zt9Var.i;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        szb O3 = h4a.O(t7kVar, c9cVar5, jSONObject, "auto_ellipsize", ox8Var2, kzjVar2);
        List V3 = h4a.V(t7kVar, zt9Var.j, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, zt9Var.k, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar6 = zt9Var.l;
        ozb ozbVar3 = zr9.c;
        ?? P = h4a.P(t7kVar, c9cVar6, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ozbVar3);
        ozb ozbVar4 = P == 0 ? ozbVar3 : P;
        c9c c9cVar7 = zt9Var.m;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar7, jSONObject, "column_span", ox8Var3, kzjVar3, zr9.C);
        List V4 = h4a.V(t7kVar, zt9Var.n, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V5 = h4a.V(t7kVar, zt9Var.o, jSONObject, "doubletap_actions", t6fVar.v1, t6fVar.t1);
        pq9 pq9Var = (pq9) h4a.K(t7kVar, zt9Var.p, jSONObject, "ellipsis", t6fVar.a9, t6fVar.Y8);
        List V6 = h4a.V(t7kVar, zt9Var.q, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, zt9Var.r, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        c9c c9cVar8 = zt9Var.s;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar4 = kzj.G;
        szb O4 = h4a.O(t7kVar, c9cVar8, jSONObject, "focused_text_color", ox8Var4, kzjVar4);
        c9c c9cVar9 = zt9Var.t;
        ox8 ox8Var5 = vct.c;
        szb N = h4a.N(t7kVar, c9cVar9, jSONObject, "font_family", ox8Var5);
        szb N2 = h4a.N(t7kVar, zt9Var.u, jSONObject, "font_feature_settings", ox8Var5);
        c9c c9cVar10 = zt9Var.v;
        hm9 hm9Var2 = zr9.D;
        ozb ozbVar5 = zr9.d;
        ?? R2 = h4a.R(t7kVar, c9cVar10, jSONObject, "font_size", ox8Var3, kzjVar3, hm9Var2, ozbVar5);
        if (R2 != 0) {
            ozbVar5 = R2;
        }
        c9c c9cVar11 = zt9Var.w;
        tct tctVar3 = zr9.t;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar6 = zr9.e;
        ?? P2 = h4a.P(t7kVar, c9cVar11, jSONObject, "font_size_unit", tctVar3, gd9Var, ozbVar6);
        ozb ozbVar7 = P2 == 0 ? ozbVar6 : P2;
        szb N3 = h4a.N(t7kVar, zt9Var.x, jSONObject, "font_variation_settings", vct.h);
        szb O5 = h4a.O(t7kVar, zt9Var.y, jSONObject, "font_weight", zr9.u, vv8.B);
        szb Q2 = h4a.Q(t7kVar, zt9Var.z, jSONObject, "font_weight_value", ox8Var3, kzjVar3, zr9.E);
        List V7 = h4a.V(t7kVar, zt9Var.A, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, zt9Var.B, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = zr9.f;
        }
        bk9 bk9Var2 = bk9Var;
        List V8 = h4a.V(t7kVar, zt9Var.C, jSONObject, "hover_end_actions", t6fVar.v1, t6fVar.t1);
        List V9 = h4a.V(t7kVar, zt9Var.D, jSONObject, "hover_start_actions", t6fVar.v1, t6fVar.t1);
        String str = (String) h4a.L(zt9Var.E, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        List V10 = h4a.V(t7kVar, zt9Var.F, jSONObject, "images", t6fVar.U8, t6fVar.S8);
        w79 w79Var = (w79) h4a.K(t7kVar, zt9Var.G, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        c9c c9cVar12 = zt9Var.H;
        ozb ozbVar8 = zr9.g;
        ?? P3 = h4a.P(t7kVar, c9cVar12, jSONObject, "letter_spacing", ox8Var, kzjVar, ozbVar8);
        ozb ozbVar9 = P3 == 0 ? ozbVar8 : P3;
        szb Q3 = h4a.Q(t7kVar, zt9Var.I, jSONObject, "line_height", ox8Var3, kzjVar3, zr9.F);
        List V11 = h4a.V(t7kVar, zt9Var.J, jSONObject, "longtap_actions", t6fVar.v1, t6fVar.t1);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, zt9Var.K, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        szb Q4 = h4a.Q(t7kVar, zt9Var.L, jSONObject, "max_lines", ox8Var3, kzjVar3, zr9.G);
        szb Q5 = h4a.Q(t7kVar, zt9Var.M, jSONObject, "min_hidden_lines", ox8Var3, kzjVar3, zr9.H);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, zt9Var.N, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        List V12 = h4a.V(t7kVar, zt9Var.O, jSONObject, "press_end_actions", t6fVar.v1, t6fVar.t1);
        List V13 = h4a.V(t7kVar, zt9Var.P, jSONObject, "press_start_actions", t6fVar.v1, t6fVar.t1);
        List V14 = h4a.V(t7kVar, zt9Var.Q, jSONObject, "ranges", t6fVar.R8, t6fVar.P8);
        szb N4 = h4a.N(t7kVar, zt9Var.R, jSONObject, "reuse_id", ox8Var5);
        szb Q6 = h4a.Q(t7kVar, zt9Var.S, jSONObject, "row_span", ox8Var3, kzjVar3, zr9.I);
        c9c c9cVar13 = zt9Var.T;
        ozb ozbVar10 = zr9.h;
        ?? P4 = h4a.P(t7kVar, c9cVar13, jSONObject, "selectable", ox8Var2, kzjVar2, ozbVar10);
        ozb ozbVar11 = P4 == 0 ? ozbVar10 : P4;
        List V15 = h4a.V(t7kVar, zt9Var.U, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar14 = zt9Var.V;
        tct tctVar4 = zr9.v;
        i49 i49Var = i49.D;
        ozb ozbVar12 = zr9.i;
        ?? P5 = h4a.P(t7kVar, c9cVar14, jSONObject, "strike", tctVar4, i49Var, ozbVar12);
        ozb ozbVar13 = P5 == 0 ? ozbVar12 : P5;
        szb F = h4a.F(t7kVar, zt9Var.W, jSONObject, "text", ox8Var5);
        c9c c9cVar15 = zt9Var.X;
        tct tctVar5 = zr9.w;
        ozb ozbVar14 = zr9.j;
        ?? P6 = h4a.P(t7kVar, c9cVar15, jSONObject, "text_alignment_horizontal", tctVar5, va8Var, ozbVar14);
        ozb ozbVar15 = P6 == 0 ? ozbVar14 : P6;
        c9c c9cVar16 = zt9Var.Y;
        tct tctVar6 = zr9.x;
        ozb ozbVar16 = zr9.k;
        ?? P7 = h4a.P(t7kVar, c9cVar16, jSONObject, "text_alignment_vertical", tctVar6, va8Var2, ozbVar16);
        ozb ozbVar17 = P7 == 0 ? ozbVar16 : P7;
        c9c c9cVar17 = zt9Var.Z;
        ozb ozbVar18 = zr9.l;
        ?? P8 = h4a.P(t7kVar, c9cVar17, jSONObject, "text_color", ox8Var4, kzjVar4, ozbVar18);
        ozb ozbVar19 = P8 == 0 ? ozbVar18 : P8;
        jr9 jr9Var = (jr9) h4a.K(t7kVar, zt9Var.a0, jSONObject, "text_gradient", t6fVar.u8, t6fVar.s8);
        dj9 dj9Var = (dj9) h4a.K(t7kVar, zt9Var.b0, jSONObject, "text_shadow", t6fVar.g7, t6fVar.e7);
        c9c c9cVar18 = zt9Var.c0;
        ozb ozbVar20 = zr9.m;
        ?? P9 = h4a.P(t7kVar, c9cVar18, jSONObject, "tighten_width", ox8Var2, kzjVar2, ozbVar20);
        ozb ozbVar21 = P9 == 0 ? ozbVar20 : P9;
        List V16 = h4a.V(t7kVar, zt9Var.d0, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, zt9Var.e0, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V17 = h4a.V(t7kVar, zt9Var.f0, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, zt9Var.g0, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, zt9Var.h0, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, zt9Var.i0, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, zt9Var.j0, jSONObject, zr9.J);
        c9c c9cVar19 = zt9Var.k0;
        tct tctVar7 = zr9.y;
        rk9 rk9Var = rk9.B0;
        ozb ozbVar22 = zr9.n;
        ?? P10 = h4a.P(t7kVar, c9cVar19, jSONObject, "truncate", tctVar7, rk9Var, ozbVar22);
        ozb ozbVar23 = P10 == 0 ? ozbVar22 : P10;
        c9c c9cVar20 = zt9Var.l0;
        tct tctVar8 = zr9.z;
        ozb ozbVar24 = zr9.o;
        ?? P11 = h4a.P(t7kVar, c9cVar20, jSONObject, "underline", tctVar8, i49Var, ozbVar24);
        ozb ozbVar25 = P11 == 0 ? ozbVar24 : P11;
        List V18 = h4a.V(t7kVar, zt9Var.m0, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V19 = h4a.V(t7kVar, zt9Var.n0, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar21 = zt9Var.o0;
        tct tctVar9 = zr9.A;
        jx9 jx9Var = jx9.z;
        ozb ozbVar26 = zr9.p;
        ?? P12 = h4a.P(t7kVar, c9cVar21, jSONObject, "visibility", tctVar9, jx9Var, ozbVar26);
        if (P12 != 0) {
            ozbVar26 = P12;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, zt9Var.p0, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V20 = h4a.V(t7kVar, zt9Var.q0, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, zt9Var.r0, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = zr9.q;
        }
        return new xq9(tc8Var, bd8Var, sm8Var2, V, O, O2, ozbVar2, V2, O3, V3, op8Var, ozbVar4, Q, V4, V5, pq9Var, V6, wz8Var, O4, N, N2, ozbVar5, ozbVar7, N3, O5, Q2, V7, bk9Var2, V8, V9, str, V10, w79Var, ozbVar9, Q3, V11, ix8Var, Q4, Q5, ix8Var2, V12, V13, V14, N4, Q6, ozbVar11, V15, ozbVar13, F, ozbVar15, ozbVar17, ozbVar19, jr9Var, dj9Var, ozbVar21, V16, qv9Var, V17, sq8Var, un8Var, un8Var2, T, ozbVar23, ozbVar25, V18, V19, ozbVar26, l1aVar, V20, bk9Var3);
    }
}
