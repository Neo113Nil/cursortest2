package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y29 implements u8s {
    public final t6f a;

    public y29(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v22, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v27, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v40, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v54, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v56, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v63, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v67, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v82, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i29 a(t7k t7kVar, h39 h39Var, JSONObject jSONObject) {
        c9c c9cVar = h39Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        bd8 bd8Var = (bd8) h4a.K(t7kVar, h39Var.b, jSONObject, Constants.KEY_ACTION, t6fVar.v1, t6fVar.t1);
        sm8 sm8Var = (sm8) h4a.K(t7kVar, h39Var.c, jSONObject, "action_animation", t6fVar.B1, t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = z29.a;
        }
        sm8 sm8Var2 = sm8Var;
        List V = h4a.V(t7kVar, h39Var.d, jSONObject, "actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar2 = h39Var.e;
        tct tctVar = z29.n;
        va8 va8Var = va8.x0;
        szb O = h4a.O(t7kVar, c9cVar2, jSONObject, "alignment_horizontal", tctVar, va8Var);
        c9c c9cVar3 = h39Var.f;
        tct tctVar2 = z29.o;
        va8 va8Var2 = va8.z0;
        szb O2 = h4a.O(t7kVar, c9cVar3, jSONObject, "alignment_vertical", tctVar2, va8Var2);
        c9c c9cVar4 = h39Var.g;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = z29.u;
        ozb ozbVar = z29.b;
        ?? R = h4a.R(t7kVar, c9cVar4, jSONObject, "alpha", ox8Var, kzjVar, l29Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V2 = h4a.V(t7kVar, h39Var.h, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        zx8 zx8Var = (zx8) h4a.K(t7kVar, h39Var.i, jSONObject, "appearance_animation", t6fVar.p3, t6fVar.n3);
        do8 do8Var = (do8) h4a.K(t7kVar, h39Var.j, jSONObject, "aspect", t6fVar.N1, t6fVar.L1);
        List V3 = h4a.V(t7kVar, h39Var.k, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, h39Var.l, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar5 = h39Var.m;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar2 = z29.c;
        ?? P = h4a.P(t7kVar, c9cVar5, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ozbVar2);
        ozb ozbVar3 = P == 0 ? ozbVar2 : P;
        c9c c9cVar6 = h39Var.n;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar6, jSONObject, "column_span", ox8Var3, kzjVar3, z29.v);
        c9c c9cVar7 = h39Var.o;
        tct tctVar3 = z29.p;
        ozb ozbVar4 = z29.d;
        ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "content_alignment_horizontal", tctVar3, va8Var, ozbVar4);
        ozb ozbVar5 = P2 == 0 ? ozbVar4 : P2;
        c9c c9cVar8 = h39Var.p;
        tct tctVar4 = z29.q;
        ozb ozbVar6 = z29.e;
        ?? P3 = h4a.P(t7kVar, c9cVar8, jSONObject, "content_alignment_vertical", tctVar4, va8Var2, ozbVar6);
        ozb ozbVar7 = P3 == 0 ? ozbVar6 : P3;
        List V4 = h4a.V(t7kVar, h39Var.q, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V5 = h4a.V(t7kVar, h39Var.r, jSONObject, "doubletap_actions", t6fVar.v1, t6fVar.t1);
        List V6 = h4a.V(t7kVar, h39Var.s, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        List V7 = h4a.V(t7kVar, h39Var.t, jSONObject, "filters", t6fVar.v3, t6fVar.t3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, h39Var.u, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V8 = h4a.V(t7kVar, h39Var.v, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, h39Var.w, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = z29.f;
        }
        bk9 bk9Var2 = bk9Var;
        c9c c9cVar9 = h39Var.x;
        ozb ozbVar8 = z29.g;
        ?? P4 = h4a.P(t7kVar, c9cVar9, jSONObject, "high_priority_preview_show", ox8Var2, kzjVar2, ozbVar8);
        ozb ozbVar9 = P4 == 0 ? ozbVar8 : P4;
        List V9 = h4a.V(t7kVar, h39Var.y, jSONObject, "hover_end_actions", t6fVar.v1, t6fVar.t1);
        List V10 = h4a.V(t7kVar, h39Var.z, jSONObject, "hover_start_actions", t6fVar.v1, t6fVar.t1);
        String str = (String) h4a.L(h39Var.A, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        szb G = h4a.G(t7kVar, h39Var.B, jSONObject, "image_url", vct.e, kzj.C);
        w79 w79Var = (w79) h4a.K(t7kVar, h39Var.C, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        List V11 = h4a.V(t7kVar, h39Var.D, jSONObject, "longtap_actions", t6fVar.v1, t6fVar.t1);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, h39Var.E, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, h39Var.F, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        c9c c9cVar10 = h39Var.G;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar4 = kzj.G;
        ozb ozbVar10 = z29.h;
        ?? P5 = h4a.P(t7kVar, c9cVar10, jSONObject, "placeholder_color", ox8Var4, kzjVar4, ozbVar10);
        ozb ozbVar11 = P5 == 0 ? ozbVar10 : P5;
        c9c c9cVar11 = h39Var.H;
        ozb ozbVar12 = z29.i;
        ?? P6 = h4a.P(t7kVar, c9cVar11, jSONObject, "preload_required", ox8Var2, kzjVar2, ozbVar12);
        ozb ozbVar13 = P6 == 0 ? ozbVar12 : P6;
        List V12 = h4a.V(t7kVar, h39Var.I, jSONObject, "press_end_actions", t6fVar.v1, t6fVar.t1);
        List V13 = h4a.V(t7kVar, h39Var.J, jSONObject, "press_start_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar12 = h39Var.K;
        ox8 ox8Var5 = vct.c;
        szb N = h4a.N(t7kVar, c9cVar12, jSONObject, "preview", ox8Var5);
        szb N2 = h4a.N(t7kVar, h39Var.L, jSONObject, "reuse_id", ox8Var5);
        szb Q2 = h4a.Q(t7kVar, h39Var.M, jSONObject, "row_span", ox8Var3, kzjVar3, z29.w);
        c9c c9cVar13 = h39Var.N;
        tct tctVar5 = z29.r;
        p19 p19Var = p19.J;
        ozb ozbVar14 = z29.j;
        ?? P7 = h4a.P(t7kVar, c9cVar13, jSONObject, "scale", tctVar5, p19Var, ozbVar14);
        ozb ozbVar15 = P7 == 0 ? ozbVar14 : P7;
        List V14 = h4a.V(t7kVar, h39Var.O, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        szb O3 = h4a.O(t7kVar, h39Var.P, jSONObject, "tint_color", ox8Var4, kzjVar4);
        c9c c9cVar14 = h39Var.Q;
        tct tctVar6 = z29.s;
        qm8 qm8Var = qm8.z;
        ozb ozbVar16 = z29.k;
        ?? P8 = h4a.P(t7kVar, c9cVar14, jSONObject, "tint_mode", tctVar6, qm8Var, ozbVar16);
        ozb ozbVar17 = P8 == 0 ? ozbVar16 : P8;
        List V15 = h4a.V(t7kVar, h39Var.R, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, h39Var.S, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V16 = h4a.V(t7kVar, h39Var.T, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, h39Var.U, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, h39Var.V, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, h39Var.W, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, h39Var.X, jSONObject, z29.x);
        List V17 = h4a.V(t7kVar, h39Var.Y, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V18 = h4a.V(t7kVar, h39Var.Z, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar15 = h39Var.a0;
        tct tctVar7 = z29.t;
        jx9 jx9Var = jx9.z;
        ozb ozbVar18 = z29.l;
        ?? P9 = h4a.P(t7kVar, c9cVar15, jSONObject, "visibility", tctVar7, jx9Var, ozbVar18);
        if (P9 != 0) {
            ozbVar18 = P9;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, h39Var.b0, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V19 = h4a.V(t7kVar, h39Var.c0, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, h39Var.d0, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = z29.m;
        }
        return new i29(tc8Var, bd8Var, sm8Var2, V, O, O2, ozbVar, V2, zx8Var, do8Var, V3, op8Var, ozbVar3, Q, ozbVar5, ozbVar7, V4, V5, V6, V7, wz8Var, V8, bk9Var2, ozbVar9, V9, V10, str, G, w79Var, V11, ix8Var, ix8Var2, ozbVar11, ozbVar13, V12, V13, N, N2, Q2, ozbVar15, V14, O3, ozbVar17, V15, qv9Var, V16, sq8Var, un8Var, un8Var2, T, V17, V18, ozbVar18, l1aVar, V19, bk9Var3);
    }
}
