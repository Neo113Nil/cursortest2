package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pb9 implements u8s {
    public final t6f a;

    public pb9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v14, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v27, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v42, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v48, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v52, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v68, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eb9 a(t7k t7kVar, ic9 ic9Var, JSONObject jSONObject) {
        c9c c9cVar = ic9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, ic9Var.b, jSONObject, "alignment_horizontal", qb9.l, va8.x0);
        szb O2 = h4a.O(t7kVar, ic9Var.c, jSONObject, "alignment_vertical", qb9.m, va8.z0);
        c9c c9cVar2 = ic9Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = qb9.r;
        ozb ozbVar = qb9.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        ozb ozbVar2 = R == 0 ? ozbVar : R;
        List V = h4a.V(t7kVar, ic9Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, ic9Var.f, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, ic9Var.g, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = ic9Var.h;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar3, jSONObject, "column_span", ox8Var2, kzjVar2, qb9.s);
        c9c c9cVar4 = ic9Var.i;
        tct tctVar = qb9.n;
        i49 i49Var = i49.J;
        ozb ozbVar3 = qb9.b;
        ?? P = h4a.P(t7kVar, c9cVar4, jSONObject, "cross_axis_alignment", tctVar, i49Var, ozbVar3);
        ozb ozbVar4 = P == 0 ? ozbVar3 : P;
        c9c c9cVar5 = ic9Var.j;
        mb9 mb9Var2 = qb9.t;
        ozb ozbVar5 = qb9.c;
        ?? R2 = h4a.R(t7kVar, c9cVar5, jSONObject, "default_item", ox8Var2, kzjVar2, mb9Var2, ozbVar5);
        if (R2 != 0) {
            ozbVar5 = R2;
        }
        List V3 = h4a.V(t7kVar, ic9Var.k, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, ic9Var.l, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, ic9Var.m, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V5 = h4a.V(t7kVar, ic9Var.n, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, ic9Var.o, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = qb9.d;
        }
        bk9 bk9Var2 = bk9Var;
        String str = (String) h4a.L(ic9Var.p, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        c9c c9cVar6 = ic9Var.q;
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar6 = qb9.e;
        ?? P2 = h4a.P(t7kVar, c9cVar6, jSONObject, "infinite_scroll", ox8Var3, kzjVar3, ozbVar6);
        ozb ozbVar7 = P2 == 0 ? ozbVar6 : P2;
        pr8 pr8Var = (pr8) h4a.K(t7kVar, ic9Var.r, jSONObject, "item_builder", t6fVar.o2, t6fVar.m2);
        jz8 jz8Var = (jz8) h4a.K(t7kVar, ic9Var.s, jSONObject, "item_spacing", t6fVar.H3, t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = qb9.f;
        }
        jz8 jz8Var2 = jz8Var;
        List V6 = h4a.V(t7kVar, ic9Var.t, jSONObject, "items", t6fVar.ca, t6fVar.aa);
        ub9 ub9Var = (ub9) h4a.D(t7kVar, ic9Var.u, jSONObject, "layout_mode", t6fVar.K5, t6fVar.I5);
        w79 w79Var = (w79) h4a.K(t7kVar, ic9Var.v, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, ic9Var.w, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        c9c c9cVar7 = ic9Var.x;
        tct tctVar2 = qb9.o;
        i49 i49Var2 = i49.L;
        ozb ozbVar8 = qb9.g;
        ?? P3 = h4a.P(t7kVar, c9cVar7, jSONObject, "orientation", tctVar2, i49Var2, ozbVar8);
        ozb ozbVar9 = P3 == 0 ? ozbVar8 : P3;
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, ic9Var.y, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        ja9 ja9Var = (ja9) h4a.K(t7kVar, ic9Var.z, jSONObject, "page_transformation", t6fVar.H5, t6fVar.F5);
        c9c c9cVar8 = ic9Var.A;
        ozb ozbVar10 = qb9.h;
        ?? P4 = h4a.P(t7kVar, c9cVar8, jSONObject, "restrict_parent_scroll", ox8Var3, kzjVar3, ozbVar10);
        ozb ozbVar11 = P4 == 0 ? ozbVar10 : P4;
        szb N = h4a.N(t7kVar, ic9Var.B, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, ic9Var.C, jSONObject, "row_span", ox8Var2, kzjVar2, qb9.u);
        c9c c9cVar9 = ic9Var.D;
        tct tctVar3 = qb9.p;
        ozb ozbVar12 = qb9.i;
        ?? P5 = h4a.P(t7kVar, c9cVar9, jSONObject, "scroll_axis_alignment", tctVar3, i49Var, ozbVar12);
        ozb ozbVar13 = P5 == 0 ? ozbVar12 : P5;
        List V7 = h4a.V(t7kVar, ic9Var.E, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V8 = h4a.V(t7kVar, ic9Var.F, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, ic9Var.G, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V9 = h4a.V(t7kVar, ic9Var.H, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, ic9Var.I, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, ic9Var.J, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, ic9Var.K, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, ic9Var.L, jSONObject, qb9.v);
        List V10 = h4a.V(t7kVar, ic9Var.M, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V11 = h4a.V(t7kVar, ic9Var.N, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar10 = ic9Var.O;
        tct tctVar4 = qb9.q;
        jx9 jx9Var = jx9.z;
        ozb ozbVar14 = qb9.j;
        ?? P6 = h4a.P(t7kVar, c9cVar10, jSONObject, "visibility", tctVar4, jx9Var, ozbVar14);
        if (P6 != 0) {
            ozbVar14 = P6;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, ic9Var.P, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V12 = h4a.V(t7kVar, ic9Var.Q, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, ic9Var.R, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = qb9.k;
        }
        return new eb9(tc8Var, O, O2, ozbVar2, V, V2, op8Var, Q, ozbVar4, ozbVar5, V3, V4, wz8Var, V5, bk9Var2, str, ozbVar7, pr8Var, jz8Var2, V6, ub9Var, w79Var, ix8Var, ozbVar9, ix8Var2, ja9Var, ozbVar11, N, Q2, ozbVar13, V7, V8, qv9Var, V9, sq8Var, un8Var, un8Var2, T, V10, V11, ozbVar14, l1aVar, V12, bk9Var3);
    }
}
