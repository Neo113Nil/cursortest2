package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y39 implements u8s {
    public final t6f a;

    public y39(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v13, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v3, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v31, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v43, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v73, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k39 a(t7k t7kVar, a49 a49Var, JSONObject jSONObject) {
        c9c c9cVar = a49Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        c9c c9cVar2 = a49Var.b;
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ozb ozbVar = z39.a;
        ?? P = h4a.P(t7kVar, c9cVar2, jSONObject, "active_item_color", ox8Var, kzjVar, ozbVar);
        ozb ozbVar2 = P == 0 ? ozbVar : P;
        c9c c9cVar3 = a49Var.c;
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        l29 l29Var = z39.p;
        ozb ozbVar3 = z39.b;
        ?? R = h4a.R(t7kVar, c9cVar3, jSONObject, "active_item_size", ox8Var2, kzjVar2, l29Var, ozbVar3);
        ozb ozbVar4 = R == 0 ? ozbVar3 : R;
        qh9 qh9Var = (qh9) h4a.K(t7kVar, a49Var.d, jSONObject, "active_shape", t6fVar.O6, t6fVar.M6);
        szb O = h4a.O(t7kVar, a49Var.e, jSONObject, "alignment_horizontal", z39.l, va8.x0);
        szb O2 = h4a.O(t7kVar, a49Var.f, jSONObject, "alignment_vertical", z39.m, va8.z0);
        c9c c9cVar4 = a49Var.g;
        l29 l29Var2 = z39.q;
        ozb ozbVar5 = z39.c;
        ?? R2 = h4a.R(t7kVar, c9cVar4, jSONObject, "alpha", ox8Var2, kzjVar2, l29Var2, ozbVar5);
        ozb ozbVar6 = R2 == 0 ? ozbVar5 : R2;
        c9c c9cVar5 = a49Var.h;
        tct tctVar = z39.n;
        p19 p19Var = p19.L;
        ozb ozbVar7 = z39.d;
        ?? P2 = h4a.P(t7kVar, c9cVar5, jSONObject, "animation", tctVar, p19Var, ozbVar7);
        ozb ozbVar8 = P2 == 0 ? ozbVar7 : P2;
        List V = h4a.V(t7kVar, a49Var.i, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, a49Var.j, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, a49Var.k, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar6 = a49Var.l;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar6, jSONObject, "column_span", ox8Var3, kzjVar3, z39.r);
        List V3 = h4a.V(t7kVar, a49Var.m, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, a49Var.n, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, a49Var.o, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V5 = h4a.V(t7kVar, a49Var.p, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, a49Var.q, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = z39.e;
        }
        bk9 bk9Var2 = bk9Var;
        c9c c9cVar7 = a49Var.r;
        s3f s3fVar = bcx.i;
        String str = (String) h4a.L(c9cVar7, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        c9c c9cVar8 = a49Var.s;
        ozb ozbVar9 = z39.f;
        ?? P3 = h4a.P(t7kVar, c9cVar8, jSONObject, "inactive_item_color", ox8Var, kzjVar, ozbVar9);
        ozb ozbVar10 = P3 == 0 ? ozbVar9 : P3;
        qh9 qh9Var2 = (qh9) h4a.K(t7kVar, a49Var.t, jSONObject, "inactive_minimum_shape", t6fVar.O6, t6fVar.M6);
        qh9 qh9Var3 = (qh9) h4a.K(t7kVar, a49Var.u, jSONObject, "inactive_shape", t6fVar.O6, t6fVar.M6);
        p39 p39Var = (p39) h4a.K(t7kVar, a49Var.v, jSONObject, "items_placement", t6fVar.o4, t6fVar.m4);
        w79 w79Var = (w79) h4a.K(t7kVar, a49Var.w, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, a49Var.x, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        c9c c9cVar9 = a49Var.y;
        l29 l29Var3 = z39.s;
        ozb ozbVar11 = z39.g;
        ?? R3 = h4a.R(t7kVar, c9cVar9, jSONObject, "minimum_item_size", ox8Var2, kzjVar2, l29Var3, ozbVar11);
        if (R3 != 0) {
            ozbVar11 = R3;
        }
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, a49Var.z, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        String str2 = (String) h4a.L(a49Var.A, t7kVar, "pager_id", s3fVar, jSONObject);
        szb N = h4a.N(t7kVar, a49Var.B, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, a49Var.C, jSONObject, "row_span", ox8Var3, kzjVar3, z39.t);
        List V6 = h4a.V(t7kVar, a49Var.D, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        kj9 kj9Var = (kj9) h4a.K(t7kVar, a49Var.E, jSONObject, "shape", t6fVar.m7, t6fVar.k7);
        if (kj9Var == null) {
            kj9Var = z39.h;
        }
        kj9 kj9Var2 = kj9Var;
        jz8 jz8Var = (jz8) h4a.K(t7kVar, a49Var.F, jSONObject, "space_between_centers", t6fVar.H3, t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = z39.i;
        }
        jz8 jz8Var2 = jz8Var;
        List V7 = h4a.V(t7kVar, a49Var.G, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, a49Var.H, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V8 = h4a.V(t7kVar, a49Var.I, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, a49Var.J, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, a49Var.K, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, a49Var.L, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, a49Var.M, jSONObject, z39.u);
        List V9 = h4a.V(t7kVar, a49Var.N, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V10 = h4a.V(t7kVar, a49Var.O, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar10 = a49Var.P;
        tct tctVar2 = z39.o;
        jx9 jx9Var = jx9.z;
        ozb ozbVar12 = z39.j;
        ?? P4 = h4a.P(t7kVar, c9cVar10, jSONObject, "visibility", tctVar2, jx9Var, ozbVar12);
        if (P4 != 0) {
            ozbVar12 = P4;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, a49Var.Q, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V11 = h4a.V(t7kVar, a49Var.R, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, a49Var.S, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = z39.k;
        }
        return new k39(tc8Var, ozbVar2, ozbVar4, qh9Var, O, O2, ozbVar6, ozbVar8, V, V2, op8Var, Q, V3, V4, wz8Var, V5, bk9Var2, str, ozbVar10, qh9Var2, qh9Var3, p39Var, w79Var, ix8Var, ozbVar11, ix8Var2, str2, N, Q2, V6, kj9Var2, jz8Var2, V7, qv9Var, V8, sq8Var, un8Var, un8Var2, T, V9, V10, ozbVar12, l1aVar, V11, bk9Var3);
    }
}
