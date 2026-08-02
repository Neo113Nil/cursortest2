package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ut8 implements u8s {
    public final t6f a;

    public ut8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v20, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v22, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v27, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v45, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v48, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v54, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v59, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v83, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jt8 a(t7k t7kVar, au8 au8Var, JSONObject jSONObject) {
        c9c c9cVar = au8Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        bd8 bd8Var = (bd8) h4a.K(t7kVar, au8Var.b, jSONObject, Constants.KEY_ACTION, t6fVar.v1, t6fVar.t1);
        sm8 sm8Var = (sm8) h4a.K(t7kVar, au8Var.c, jSONObject, "action_animation", t6fVar.B1, t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = vt8.a;
        }
        sm8 sm8Var2 = sm8Var;
        List V = h4a.V(t7kVar, au8Var.d, jSONObject, "actions", t6fVar.v1, t6fVar.t1);
        szb O = h4a.O(t7kVar, au8Var.e, jSONObject, "alignment_horizontal", vt8.n, va8.x0);
        szb O2 = h4a.O(t7kVar, au8Var.f, jSONObject, "alignment_vertical", vt8.o, va8.z0);
        c9c c9cVar2 = au8Var.g;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        lc8 lc8Var = vt8.u;
        ozb ozbVar = vt8.b;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, lc8Var, ozbVar);
        ozb ozbVar2 = R == 0 ? ozbVar : R;
        List V2 = h4a.V(t7kVar, au8Var.h, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        do8 do8Var = (do8) h4a.K(t7kVar, au8Var.i, jSONObject, "aspect", t6fVar.N1, t6fVar.L1);
        List V3 = h4a.V(t7kVar, au8Var.j, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, au8Var.k, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = au8Var.l;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = vt8.c;
        ?? P = h4a.P(t7kVar, c9cVar3, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ozbVar3);
        ozb ozbVar4 = P == 0 ? ozbVar3 : P;
        c9c c9cVar4 = au8Var.m;
        ozb ozbVar5 = vt8.d;
        ?? P2 = h4a.P(t7kVar, c9cVar4, jSONObject, "clip_to_bounds", ox8Var2, kzjVar2, ozbVar5);
        ozb ozbVar6 = P2 == 0 ? ozbVar5 : P2;
        c9c c9cVar5 = au8Var.n;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar5, jSONObject, "column_span", ox8Var3, kzjVar3, vt8.v);
        c9c c9cVar6 = au8Var.o;
        tct tctVar = vt8.p;
        qm8 qm8Var = qm8.v0;
        ozb ozbVar7 = vt8.e;
        ?? P3 = h4a.P(t7kVar, c9cVar6, jSONObject, "content_alignment_horizontal", tctVar, qm8Var, ozbVar7);
        ozb ozbVar8 = P3 == 0 ? ozbVar7 : P3;
        c9c c9cVar7 = au8Var.p;
        tct tctVar2 = vt8.q;
        qm8 qm8Var2 = qm8.x0;
        ozb ozbVar9 = vt8.f;
        ?? P4 = h4a.P(t7kVar, c9cVar7, jSONObject, "content_alignment_vertical", tctVar2, qm8Var2, ozbVar9);
        ozb ozbVar10 = P4 == 0 ? ozbVar9 : P4;
        List V4 = h4a.V(t7kVar, au8Var.q, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V5 = h4a.V(t7kVar, au8Var.r, jSONObject, "doubletap_actions", t6fVar.v1, t6fVar.t1);
        List V6 = h4a.V(t7kVar, au8Var.s, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, au8Var.t, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V7 = h4a.V(t7kVar, au8Var.u, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, au8Var.v, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = vt8.g;
        }
        bk9 bk9Var2 = bk9Var;
        List V8 = h4a.V(t7kVar, au8Var.w, jSONObject, "hover_end_actions", t6fVar.v1, t6fVar.t1);
        List V9 = h4a.V(t7kVar, au8Var.x, jSONObject, "hover_start_actions", t6fVar.v1, t6fVar.t1);
        String str = (String) h4a.L(au8Var.y, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        pr8 pr8Var = (pr8) h4a.K(t7kVar, au8Var.z, jSONObject, "item_builder", t6fVar.o2, t6fVar.m2);
        c9c c9cVar8 = au8Var.A;
        lc8 lc8Var2 = vt8.w;
        ozb ozbVar11 = vt8.h;
        ?? R2 = h4a.R(t7kVar, c9cVar8, jSONObject, "item_spacing", ox8Var3, kzjVar3, lc8Var2, ozbVar11);
        ozb ozbVar12 = R2 == 0 ? ozbVar11 : R2;
        List V10 = h4a.V(t7kVar, au8Var.B, jSONObject, "items", t6fVar.ca, t6fVar.aa);
        c9c c9cVar9 = au8Var.C;
        tct tctVar3 = vt8.r;
        qm8 qm8Var3 = qm8.E;
        ozb ozbVar13 = vt8.i;
        ?? P5 = h4a.P(t7kVar, c9cVar9, jSONObject, "layout_mode", tctVar3, qm8Var3, ozbVar13);
        ozb ozbVar14 = P5 == 0 ? ozbVar13 : P5;
        w79 w79Var = (w79) h4a.K(t7kVar, au8Var.D, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ht8 ht8Var = (ht8) h4a.K(t7kVar, au8Var.E, jSONObject, "line_separator", t6fVar.A2, t6fVar.y2);
        c9c c9cVar10 = au8Var.F;
        lc8 lc8Var3 = vt8.x;
        ozb ozbVar15 = vt8.j;
        ?? R3 = h4a.R(t7kVar, c9cVar10, jSONObject, "line_spacing", ox8Var3, kzjVar3, lc8Var3, ozbVar15);
        if (R3 != 0) {
            ozbVar15 = R3;
        }
        List V11 = h4a.V(t7kVar, au8Var.G, jSONObject, "longtap_actions", t6fVar.v1, t6fVar.t1);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, au8Var.H, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        c9c c9cVar11 = au8Var.I;
        tct tctVar4 = vt8.s;
        qm8 qm8Var4 = qm8.G;
        ozb ozbVar16 = vt8.k;
        ?? P6 = h4a.P(t7kVar, c9cVar11, jSONObject, "orientation", tctVar4, qm8Var4, ozbVar16);
        ozb ozbVar17 = P6 == 0 ? ozbVar16 : P6;
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, au8Var.J, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        List V12 = h4a.V(t7kVar, au8Var.K, jSONObject, "press_end_actions", t6fVar.v1, t6fVar.t1);
        List V13 = h4a.V(t7kVar, au8Var.L, jSONObject, "press_start_actions", t6fVar.v1, t6fVar.t1);
        szb N = h4a.N(t7kVar, au8Var.M, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, au8Var.N, jSONObject, "row_span", ox8Var3, kzjVar3, vt8.y);
        List V14 = h4a.V(t7kVar, au8Var.O, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        ht8 ht8Var2 = (ht8) h4a.K(t7kVar, au8Var.P, jSONObject, "separator", t6fVar.A2, t6fVar.y2);
        List V15 = h4a.V(t7kVar, au8Var.Q, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, au8Var.R, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V16 = h4a.V(t7kVar, au8Var.S, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, au8Var.T, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, au8Var.U, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, au8Var.V, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, au8Var.W, jSONObject, vt8.z);
        List V17 = h4a.V(t7kVar, au8Var.X, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V18 = h4a.V(t7kVar, au8Var.Y, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar12 = au8Var.Z;
        tct tctVar5 = vt8.t;
        jx9 jx9Var = jx9.z;
        ozb ozbVar18 = vt8.l;
        ?? P7 = h4a.P(t7kVar, c9cVar12, jSONObject, "visibility", tctVar5, jx9Var, ozbVar18);
        if (P7 != 0) {
            ozbVar18 = P7;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, au8Var.a0, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V19 = h4a.V(t7kVar, au8Var.b0, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, au8Var.c0, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = vt8.m;
        }
        return new jt8(tc8Var, bd8Var, sm8Var2, V, O, O2, ozbVar2, V2, do8Var, V3, op8Var, ozbVar4, ozbVar6, Q, ozbVar8, ozbVar10, V4, V5, V6, wz8Var, V7, bk9Var2, V8, V9, str, pr8Var, ozbVar12, V10, ozbVar14, w79Var, ht8Var, ozbVar15, V11, ix8Var, ozbVar17, ix8Var2, V12, V13, N, Q2, V14, ht8Var2, V15, qv9Var, V16, sq8Var, un8Var, un8Var2, T, V17, V18, ozbVar18, l1aVar, V19, bk9Var3);
    }
}
