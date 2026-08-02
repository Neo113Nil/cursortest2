package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jp9 implements u8s {
    public final t6f a;

    public jp9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v19, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v34, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v39, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v41, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v47, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v70, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vo9 a(t7k t7kVar, vp9 vp9Var, JSONObject jSONObject) {
        c9c c9cVar = vp9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, vp9Var.b, jSONObject, "alignment_horizontal", kp9.m, va8.x0);
        szb O2 = h4a.O(t7kVar, vp9Var.c, jSONObject, "alignment_vertical", kp9.n, va8.z0);
        c9c c9cVar2 = vp9Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = kp9.p;
        ozb ozbVar = kp9.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        ozb ozbVar2 = R == 0 ? ozbVar : R;
        List V = h4a.V(t7kVar, vp9Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, vp9Var.f, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, vp9Var.g, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = vp9Var.h;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar3, jSONObject, "column_span", ox8Var2, kzjVar2, kp9.q);
        List V3 = h4a.V(t7kVar, vp9Var.i, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        c9c c9cVar4 = vp9Var.j;
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar3 = kp9.b;
        ?? P = h4a.P(t7kVar, c9cVar4, jSONObject, "dynamic_height", ox8Var3, kzjVar3, ozbVar3);
        ozb ozbVar4 = P == 0 ? ozbVar3 : P;
        List V4 = h4a.V(t7kVar, vp9Var.k, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, vp9Var.l, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V5 = h4a.V(t7kVar, vp9Var.m, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        c9c c9cVar5 = vp9Var.n;
        ozb ozbVar5 = kp9.c;
        ?? P2 = h4a.P(t7kVar, c9cVar5, jSONObject, "has_separator", ox8Var3, kzjVar3, ozbVar5);
        ozb ozbVar6 = P2 == 0 ? ozbVar5 : P2;
        bk9 bk9Var = (bk9) h4a.K(t7kVar, vp9Var.o, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = kp9.d;
        }
        bk9 bk9Var2 = bk9Var;
        String str = (String) h4a.L(vp9Var.p, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        List J = h4a.J(t7kVar, vp9Var.q, jSONObject, "items", t6fVar.r8, t6fVar.p8, kp9.r);
        w79 w79Var = (w79) h4a.K(t7kVar, vp9Var.r, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, vp9Var.s, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, vp9Var.t, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        c9c c9cVar6 = vp9Var.u;
        ozb ozbVar7 = kp9.e;
        ?? P3 = h4a.P(t7kVar, c9cVar6, jSONObject, "restrict_parent_scroll", ox8Var3, kzjVar3, ozbVar7);
        ozb ozbVar8 = P3 == 0 ? ozbVar7 : P3;
        szb N = h4a.N(t7kVar, vp9Var.v, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, vp9Var.w, jSONObject, "row_span", ox8Var2, kzjVar2, kp9.s);
        List V6 = h4a.V(t7kVar, vp9Var.x, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar7 = vp9Var.y;
        hm9 hm9Var2 = kp9.t;
        ozb ozbVar9 = kp9.f;
        ?? R2 = h4a.R(t7kVar, c9cVar7, jSONObject, "selected_tab", ox8Var2, kzjVar2, hm9Var2, ozbVar9);
        if (R2 != 0) {
            ozbVar9 = R2;
        }
        c9c c9cVar8 = vp9Var.z;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar4 = kzj.G;
        ozb ozbVar10 = kp9.g;
        ?? P4 = h4a.P(t7kVar, c9cVar8, jSONObject, "separator_color", ox8Var4, kzjVar4, ozbVar10);
        ozb ozbVar11 = P4 == 0 ? ozbVar10 : P4;
        ix8 ix8Var3 = (ix8) h4a.K(t7kVar, vp9Var.A, jSONObject, "separator_paddings", t6fVar.j3, t6fVar.h3);
        if (ix8Var3 == null) {
            ix8Var3 = kp9.h;
        }
        ix8 ix8Var4 = ix8Var3;
        c9c c9cVar9 = vp9Var.B;
        ozb ozbVar12 = kp9.i;
        ?? P5 = h4a.P(t7kVar, c9cVar9, jSONObject, "switch_tabs_by_content_swipe_enabled", ox8Var3, kzjVar3, ozbVar12);
        ozb ozbVar13 = P5 == 0 ? ozbVar12 : P5;
        so9 so9Var = (so9) h4a.K(t7kVar, vp9Var.C, jSONObject, "tab_title_delimiter", t6fVar.o8, t6fVar.m8);
        uo9 uo9Var = (uo9) h4a.K(t7kVar, vp9Var.D, jSONObject, "tab_title_style", t6fVar.l8, t6fVar.j8);
        ix8 ix8Var5 = (ix8) h4a.K(t7kVar, vp9Var.E, jSONObject, "title_paddings", t6fVar.j3, t6fVar.h3);
        if (ix8Var5 == null) {
            ix8Var5 = kp9.j;
        }
        ix8 ix8Var6 = ix8Var5;
        List V7 = h4a.V(t7kVar, vp9Var.F, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, vp9Var.G, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V8 = h4a.V(t7kVar, vp9Var.H, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, vp9Var.I, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, vp9Var.J, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, vp9Var.K, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, vp9Var.L, jSONObject, kp9.u);
        List V9 = h4a.V(t7kVar, vp9Var.M, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V10 = h4a.V(t7kVar, vp9Var.N, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar10 = vp9Var.O;
        tct tctVar = kp9.o;
        jx9 jx9Var = jx9.z;
        ozb ozbVar14 = kp9.k;
        ?? P6 = h4a.P(t7kVar, c9cVar10, jSONObject, "visibility", tctVar, jx9Var, ozbVar14);
        if (P6 != 0) {
            ozbVar14 = P6;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, vp9Var.P, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V11 = h4a.V(t7kVar, vp9Var.Q, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, vp9Var.R, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = kp9.l;
        }
        return new vo9(tc8Var, O, O2, ozbVar2, V, V2, op8Var, Q, V3, ozbVar4, V4, wz8Var, V5, ozbVar6, bk9Var2, str, J, w79Var, ix8Var, ix8Var2, ozbVar8, N, Q2, V6, ozbVar9, ozbVar11, ix8Var4, ozbVar13, so9Var, uo9Var, ix8Var6, V7, qv9Var, V8, sq8Var, un8Var, un8Var2, T, V9, V10, ozbVar14, l1aVar, V11, bk9Var3);
    }
}
