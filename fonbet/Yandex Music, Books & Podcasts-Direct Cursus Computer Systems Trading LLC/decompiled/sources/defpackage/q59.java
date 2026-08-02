package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q59 implements u8s {
    public final t6f a;

    public q59(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v23, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v36, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v41, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v43, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v47, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v62, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v65, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v67, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v69, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v8, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v86, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l49 a(t7k t7kVar, h69 h69Var, JSONObject jSONObject) {
        c9c c9cVar = h69Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        c9c c9cVar2 = h69Var.b;
        tct tctVar = r59.q;
        va8 va8Var = va8.x0;
        szb O = h4a.O(t7kVar, c9cVar2, jSONObject, "alignment_horizontal", tctVar, va8Var);
        c9c c9cVar3 = h69Var.c;
        tct tctVar2 = r59.r;
        va8 va8Var2 = va8.z0;
        szb O2 = h4a.O(t7kVar, c9cVar3, jSONObject, "alignment_vertical", tctVar2, va8Var2);
        c9c c9cVar4 = h69Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = r59.A;
        ozb ozbVar = r59.a;
        ?? R = h4a.R(t7kVar, c9cVar4, jSONObject, "alpha", ox8Var, kzjVar, l29Var, ozbVar);
        ozb ozbVar2 = R == 0 ? ozbVar : R;
        List V = h4a.V(t7kVar, h69Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        c9c c9cVar5 = h69Var.f;
        tct tctVar3 = r59.s;
        p19 p19Var = p19.x0;
        ozb ozbVar3 = r59.b;
        ?? P = h4a.P(t7kVar, c9cVar5, jSONObject, "autocapitalization", tctVar3, p19Var, ozbVar3);
        ozb ozbVar4 = P == 0 ? ozbVar3 : P;
        List V2 = h4a.V(t7kVar, h69Var.g, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, h69Var.h, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar6 = h69Var.i;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar6, jSONObject, "column_span", ox8Var2, kzjVar2, r59.B);
        List V3 = h4a.V(t7kVar, h69Var.j, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, h69Var.k, jSONObject, "enter_key_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar7 = h69Var.l;
        tct tctVar4 = r59.t;
        p19 p19Var2 = p19.z0;
        ozb ozbVar5 = r59.c;
        ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "enter_key_type", tctVar4, p19Var2, ozbVar5);
        ozb ozbVar6 = P2 == 0 ? ozbVar5 : P2;
        List V5 = h4a.V(t7kVar, h69Var.m, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        List V6 = h4a.V(t7kVar, h69Var.n, jSONObject, "filters", t6fVar.D4, t6fVar.B4);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, h69Var.o, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        c9c c9cVar8 = h69Var.p;
        ox8 ox8Var3 = vct.c;
        szb N = h4a.N(t7kVar, c9cVar8, jSONObject, "font_family", ox8Var3);
        c9c c9cVar9 = h69Var.q;
        l29 l29Var2 = r59.C;
        ozb ozbVar7 = r59.d;
        ?? R2 = h4a.R(t7kVar, c9cVar9, jSONObject, "font_size", ox8Var2, kzjVar2, l29Var2, ozbVar7);
        if (R2 != 0) {
            ozbVar7 = R2;
        }
        c9c c9cVar10 = h69Var.r;
        tct tctVar5 = r59.u;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar8 = r59.e;
        ?? P3 = h4a.P(t7kVar, c9cVar10, jSONObject, "font_size_unit", tctVar5, gd9Var, ozbVar8);
        ozb ozbVar9 = P3 == 0 ? ozbVar8 : P3;
        szb N2 = h4a.N(t7kVar, h69Var.s, jSONObject, "font_variation_settings", vct.h);
        szb O3 = h4a.O(t7kVar, h69Var.t, jSONObject, "font_weight", r59.v, vv8.B);
        szb Q2 = h4a.Q(t7kVar, h69Var.u, jSONObject, "font_weight_value", ox8Var2, kzjVar2, r59.D);
        List V7 = h4a.V(t7kVar, h69Var.v, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, h69Var.w, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = r59.f;
        }
        bk9 bk9Var2 = bk9Var;
        c9c c9cVar11 = h69Var.x;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar3 = kzj.G;
        szb O4 = h4a.O(t7kVar, c9cVar11, jSONObject, "highlight_color", ox8Var4, kzjVar3);
        c9c c9cVar12 = h69Var.y;
        ozb ozbVar10 = r59.g;
        ?? P4 = h4a.P(t7kVar, c9cVar12, jSONObject, "hint_color", ox8Var4, kzjVar3, ozbVar10);
        ozb ozbVar11 = P4 == 0 ? ozbVar10 : P4;
        szb N3 = h4a.N(t7kVar, h69Var.z, jSONObject, "hint_text", ox8Var3);
        c9c c9cVar13 = h69Var.A;
        s3f s3fVar = bcx.i;
        String str = (String) h4a.L(c9cVar13, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        c9c c9cVar14 = h69Var.B;
        ox8 ox8Var5 = vct.a;
        kzj kzjVar4 = kzj.B;
        ozb ozbVar12 = r59.h;
        ozb ozbVar13 = ozbVar7;
        ?? P5 = h4a.P(t7kVar, c9cVar14, jSONObject, "is_enabled", ox8Var5, kzjVar4, ozbVar12);
        ozb ozbVar14 = P5 == 0 ? ozbVar12 : P5;
        c9c c9cVar15 = h69Var.C;
        tct tctVar6 = r59.w;
        p19 p19Var3 = p19.B0;
        ozb ozbVar15 = r59.i;
        ?? P6 = h4a.P(t7kVar, c9cVar15, jSONObject, "keyboard_type", tctVar6, p19Var3, ozbVar15);
        ozb ozbVar16 = P6 == 0 ? ozbVar15 : P6;
        w79 w79Var = (w79) h4a.K(t7kVar, h69Var.D, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        c9c c9cVar16 = h69Var.E;
        ozb ozbVar17 = r59.j;
        ?? P7 = h4a.P(t7kVar, c9cVar16, jSONObject, "letter_spacing", ox8Var, kzjVar, ozbVar17);
        ozb ozbVar18 = P7 == 0 ? ozbVar17 : P7;
        szb Q3 = h4a.Q(t7kVar, h69Var.F, jSONObject, "line_height", ox8Var2, kzjVar2, r59.E);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, h69Var.G, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        v59 v59Var = (v59) h4a.K(t7kVar, h69Var.H, jSONObject, "mask", t6fVar.G4, t6fVar.E4);
        szb Q4 = h4a.Q(t7kVar, h69Var.I, jSONObject, "max_length", ox8Var2, kzjVar2, r59.F);
        szb Q5 = h4a.Q(t7kVar, h69Var.J, jSONObject, "max_visible_lines", ox8Var2, kzjVar2, r59.G);
        k49 k49Var = (k49) h4a.K(t7kVar, h69Var.K, jSONObject, "native_interface", t6fVar.X4, t6fVar.V4);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, h69Var.L, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        szb N4 = h4a.N(t7kVar, h69Var.M, jSONObject, "reuse_id", ox8Var3);
        szb Q6 = h4a.Q(t7kVar, h69Var.N, jSONObject, "row_span", ox8Var2, kzjVar2, r59.H);
        c9c c9cVar17 = h69Var.O;
        ozb ozbVar19 = r59.k;
        ?? P8 = h4a.P(t7kVar, c9cVar17, jSONObject, "select_all_on_focus", ox8Var5, kzjVar4, ozbVar19);
        ozb ozbVar20 = P8 == 0 ? ozbVar19 : P8;
        List V8 = h4a.V(t7kVar, h69Var.P, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar18 = h69Var.Q;
        tct tctVar7 = r59.x;
        ozb ozbVar21 = r59.l;
        ?? P9 = h4a.P(t7kVar, c9cVar18, jSONObject, "text_alignment_horizontal", tctVar7, va8Var, ozbVar21);
        ozb ozbVar22 = P9 == 0 ? ozbVar21 : P9;
        c9c c9cVar19 = h69Var.R;
        tct tctVar8 = r59.y;
        ozb ozbVar23 = r59.m;
        ?? P10 = h4a.P(t7kVar, c9cVar19, jSONObject, "text_alignment_vertical", tctVar8, va8Var2, ozbVar23);
        ozb ozbVar24 = P10 == 0 ? ozbVar23 : P10;
        c9c c9cVar20 = h69Var.S;
        ozb ozbVar25 = r59.n;
        ?? P11 = h4a.P(t7kVar, c9cVar20, jSONObject, "text_color", ox8Var4, kzjVar3, ozbVar25);
        ozb ozbVar26 = P11 == 0 ? ozbVar25 : P11;
        String str2 = (String) h4a.C(h69Var.T, jSONObject, "text_variable", s3fVar, bcx.h);
        List V9 = h4a.V(t7kVar, h69Var.U, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, h69Var.V, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V10 = h4a.V(t7kVar, h69Var.W, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, h69Var.X, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, h69Var.Y, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, h69Var.Z, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, h69Var.a0, jSONObject, r59.I);
        List V11 = h4a.V(t7kVar, h69Var.b0, jSONObject, "validators", t6fVar.R4, t6fVar.P4);
        List V12 = h4a.V(t7kVar, h69Var.c0, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V13 = h4a.V(t7kVar, h69Var.d0, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar21 = h69Var.e0;
        tct tctVar9 = r59.z;
        jx9 jx9Var = jx9.z;
        ozb ozbVar27 = r59.o;
        ?? P12 = h4a.P(t7kVar, c9cVar21, jSONObject, "visibility", tctVar9, jx9Var, ozbVar27);
        if (P12 != 0) {
            ozbVar27 = P12;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, h69Var.f0, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V14 = h4a.V(t7kVar, h69Var.g0, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, h69Var.h0, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = r59.p;
        }
        return new l49(tc8Var, O, O2, ozbVar2, V, ozbVar4, V2, op8Var, Q, V3, V4, ozbVar6, V5, V6, wz8Var, N, ozbVar13, ozbVar9, N2, O3, Q2, V7, bk9Var2, O4, ozbVar11, N3, str, ozbVar14, ozbVar16, w79Var, ozbVar18, Q3, ix8Var, v59Var, Q4, Q5, k49Var, ix8Var2, N4, Q6, ozbVar20, V8, ozbVar22, ozbVar24, ozbVar26, str2, V9, qv9Var, V10, sq8Var, un8Var, un8Var2, T, V11, V12, V13, ozbVar27, l1aVar, V14, bk9Var3);
    }
}
