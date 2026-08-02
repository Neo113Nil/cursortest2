package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c19 implements u8s {
    public final t6f a;

    public c19(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v16, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v31, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v38, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v42, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v46, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v48, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v64, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final s09 a(t7k t7kVar, f19 f19Var, JSONObject jSONObject) {
        c9c c9cVar = f19Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, f19Var.b, jSONObject, "alignment_horizontal", d19.l, va8.x0);
        szb O2 = h4a.O(t7kVar, f19Var.c, jSONObject, "alignment_vertical", d19.m, va8.z0);
        c9c c9cVar2 = f19Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = d19.s;
        ozb ozbVar = d19.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        ozb ozbVar2 = R == 0 ? ozbVar : R;
        List V = h4a.V(t7kVar, f19Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, f19Var.f, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, f19Var.g, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = f19Var.h;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar3, jSONObject, "column_count", ox8Var2, kzjVar2, d19.t);
        szb Q2 = h4a.Q(t7kVar, f19Var.i, jSONObject, "column_span", ox8Var2, kzjVar2, d19.u);
        c9c c9cVar4 = f19Var.j;
        tct tctVar = d19.n;
        vv8 vv8Var = vv8.D;
        ozb ozbVar3 = d19.b;
        ?? P = h4a.P(t7kVar, c9cVar4, jSONObject, "cross_content_alignment", tctVar, vv8Var, ozbVar3);
        ozb ozbVar4 = P == 0 ? ozbVar3 : P;
        szb Q3 = h4a.Q(t7kVar, f19Var.k, jSONObject, "cross_spacing", ox8Var2, kzjVar2, d19.v);
        c9c c9cVar5 = f19Var.l;
        uw8 uw8Var2 = d19.w;
        ozb ozbVar5 = d19.c;
        ?? R2 = h4a.R(t7kVar, c9cVar5, jSONObject, "default_item", ox8Var2, kzjVar2, uw8Var2, ozbVar5);
        ozb ozbVar6 = R2 == 0 ? ozbVar5 : R2;
        List V3 = h4a.V(t7kVar, f19Var.m, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, f19Var.n, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, f19Var.o, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V5 = h4a.V(t7kVar, f19Var.p, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, f19Var.q, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = d19.d;
        }
        bk9 bk9Var2 = bk9Var;
        String str = (String) h4a.L(f19Var.r, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        pr8 pr8Var = (pr8) h4a.K(t7kVar, f19Var.s, jSONObject, "item_builder", t6fVar.o2, t6fVar.m2);
        c9c c9cVar6 = f19Var.t;
        uw8 uw8Var3 = d19.x;
        ozb ozbVar7 = d19.e;
        ?? R3 = h4a.R(t7kVar, c9cVar6, jSONObject, "item_spacing", ox8Var2, kzjVar2, uw8Var3, ozbVar7);
        if (R3 != 0) {
            ozbVar7 = R3;
        }
        List V6 = h4a.V(t7kVar, f19Var.u, jSONObject, "items", t6fVar.ca, t6fVar.aa);
        w79 w79Var = (w79) h4a.K(t7kVar, f19Var.v, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, f19Var.w, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        c9c c9cVar7 = f19Var.x;
        tct tctVar2 = d19.o;
        vv8 vv8Var2 = vv8.F;
        ozb ozbVar8 = d19.f;
        ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "orientation", tctVar2, vv8Var2, ozbVar8);
        ozb ozbVar9 = P2 == 0 ? ozbVar8 : P2;
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, f19Var.y, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        c9c c9cVar8 = f19Var.z;
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar10 = d19.g;
        ?? P3 = h4a.P(t7kVar, c9cVar8, jSONObject, "restrict_parent_scroll", ox8Var3, kzjVar3, ozbVar10);
        ozb ozbVar11 = P3 == 0 ? ozbVar10 : P3;
        szb N = h4a.N(t7kVar, f19Var.A, jSONObject, "reuse_id", vct.c);
        szb Q4 = h4a.Q(t7kVar, f19Var.B, jSONObject, "row_span", ox8Var2, kzjVar2, d19.y);
        c9c c9cVar9 = f19Var.C;
        tct tctVar3 = d19.p;
        vv8 vv8Var3 = vv8.H;
        ozb ozbVar12 = d19.h;
        ?? P4 = h4a.P(t7kVar, c9cVar9, jSONObject, "scroll_mode", tctVar3, vv8Var3, ozbVar12);
        ozb ozbVar13 = P4 == 0 ? ozbVar12 : P4;
        c9c c9cVar10 = f19Var.D;
        tct tctVar4 = d19.q;
        vv8 vv8Var4 = vv8.J;
        ozb ozbVar14 = d19.i;
        ?? P5 = h4a.P(t7kVar, c9cVar10, jSONObject, "scrollbar", tctVar4, vv8Var4, ozbVar14);
        ozb ozbVar15 = P5 == 0 ? ozbVar14 : P5;
        List V7 = h4a.V(t7kVar, f19Var.E, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V8 = h4a.V(t7kVar, f19Var.F, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, f19Var.G, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V9 = h4a.V(t7kVar, f19Var.H, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, f19Var.I, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, f19Var.J, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, f19Var.K, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, f19Var.L, jSONObject, d19.z);
        List V10 = h4a.V(t7kVar, f19Var.M, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V11 = h4a.V(t7kVar, f19Var.N, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar11 = f19Var.O;
        tct tctVar5 = d19.r;
        jx9 jx9Var = jx9.z;
        ozb ozbVar16 = d19.j;
        ?? P6 = h4a.P(t7kVar, c9cVar11, jSONObject, "visibility", tctVar5, jx9Var, ozbVar16);
        if (P6 != 0) {
            ozbVar16 = P6;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, f19Var.P, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V12 = h4a.V(t7kVar, f19Var.Q, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, f19Var.R, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = d19.k;
        }
        return new s09(tc8Var, O, O2, ozbVar2, V, V2, op8Var, Q, Q2, ozbVar4, Q3, ozbVar6, V3, V4, wz8Var, V5, bk9Var2, str, pr8Var, ozbVar7, V6, w79Var, ix8Var, ozbVar9, ix8Var2, ozbVar11, N, Q4, ozbVar13, ozbVar15, V7, V8, qv9Var, V9, sq8Var, un8Var, un8Var2, T, V10, V11, ozbVar16, l1aVar, V12, bk9Var3);
    }
}
