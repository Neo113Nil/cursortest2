package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ii9 implements u8s {
    public final t6f a;

    public ii9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v19, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v29, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v36, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v47, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v64, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ei9 a(t7k t7kVar, ni9 ni9Var, JSONObject jSONObject) {
        c9c c9cVar = ni9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, ni9Var.b, jSONObject, "alignment_horizontal", ji9.j, va8.x0);
        szb O2 = h4a.O(t7kVar, ni9Var.c, jSONObject, "alignment_vertical", ji9.k, va8.z0);
        c9c c9cVar2 = ni9Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = ji9.o;
        ozb ozbVar = ji9.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        ozb ozbVar2 = R == 0 ? ozbVar : R;
        List V = h4a.V(t7kVar, ni9Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, ni9Var.f, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, ni9Var.g, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = ni9Var.h;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar3, jSONObject, "column_span", ox8Var2, kzjVar2, ji9.p);
        List V3 = h4a.V(t7kVar, ni9Var.i, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, ni9Var.j, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, ni9Var.k, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        c9c c9cVar4 = ni9Var.l;
        ox8 ox8Var3 = vct.c;
        szb N = h4a.N(t7kVar, c9cVar4, jSONObject, "font_family", ox8Var3);
        c9c c9cVar5 = ni9Var.m;
        mb9 mb9Var2 = ji9.q;
        ozb ozbVar3 = ji9.b;
        ?? R2 = h4a.R(t7kVar, c9cVar5, jSONObject, "font_size", ox8Var2, kzjVar2, mb9Var2, ozbVar3);
        if (R2 != 0) {
            ozbVar3 = R2;
        }
        c9c c9cVar6 = ni9Var.n;
        tct tctVar = ji9.l;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar4 = ji9.c;
        ?? P = h4a.P(t7kVar, c9cVar6, jSONObject, "font_size_unit", tctVar, gd9Var, ozbVar4);
        ozb ozbVar5 = P == 0 ? ozbVar4 : P;
        szb N2 = h4a.N(t7kVar, ni9Var.o, jSONObject, "font_variation_settings", vct.h);
        szb O3 = h4a.O(t7kVar, ni9Var.p, jSONObject, "font_weight", ji9.m, vv8.B);
        szb Q2 = h4a.Q(t7kVar, ni9Var.q, jSONObject, "font_weight_value", ox8Var2, kzjVar2, ji9.r);
        List V5 = h4a.V(t7kVar, ni9Var.r, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, ni9Var.s, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = ji9.d;
        }
        bk9 bk9Var2 = bk9Var;
        c9c c9cVar7 = ni9Var.t;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar3 = kzj.G;
        ozb ozbVar6 = ji9.e;
        ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "hint_color", ox8Var4, kzjVar3, ozbVar6);
        ozb ozbVar7 = P2 == 0 ? ozbVar6 : P2;
        szb N3 = h4a.N(t7kVar, ni9Var.u, jSONObject, "hint_text", ox8Var3);
        c9c c9cVar8 = ni9Var.v;
        s3f s3fVar = bcx.i;
        String str = (String) h4a.L(c9cVar8, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        w79 w79Var = (w79) h4a.K(t7kVar, ni9Var.w, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        c9c c9cVar9 = ni9Var.x;
        ozb ozbVar8 = ji9.f;
        ?? P3 = h4a.P(t7kVar, c9cVar9, jSONObject, "letter_spacing", ox8Var, kzjVar, ozbVar8);
        ozb ozbVar9 = P3 == 0 ? ozbVar8 : P3;
        szb Q3 = h4a.Q(t7kVar, ni9Var.y, jSONObject, "line_height", ox8Var2, kzjVar2, ji9.s);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, ni9Var.z, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        List J = h4a.J(t7kVar, ni9Var.A, jSONObject, "options", t6fVar.X6, t6fVar.V6, ji9.t);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, ni9Var.B, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        szb N4 = h4a.N(t7kVar, ni9Var.C, jSONObject, "reuse_id", ox8Var3);
        szb Q4 = h4a.Q(t7kVar, ni9Var.D, jSONObject, "row_span", ox8Var2, kzjVar2, ji9.u);
        List V6 = h4a.V(t7kVar, ni9Var.E, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar10 = ni9Var.F;
        ozb ozbVar10 = ji9.g;
        ?? P4 = h4a.P(t7kVar, c9cVar10, jSONObject, "text_color", ox8Var4, kzjVar3, ozbVar10);
        ozb ozbVar11 = P4 == 0 ? ozbVar10 : P4;
        List V7 = h4a.V(t7kVar, ni9Var.G, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, ni9Var.H, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V8 = h4a.V(t7kVar, ni9Var.I, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, ni9Var.J, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, ni9Var.K, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, ni9Var.L, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, ni9Var.M, jSONObject, ji9.v);
        String str2 = (String) h4a.C(ni9Var.N, jSONObject, "value_variable", s3fVar, bcx.h);
        List V9 = h4a.V(t7kVar, ni9Var.O, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V10 = h4a.V(t7kVar, ni9Var.P, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar11 = ni9Var.Q;
        tct tctVar2 = ji9.n;
        jx9 jx9Var = jx9.z;
        ozb ozbVar12 = ji9.h;
        ?? P5 = h4a.P(t7kVar, c9cVar11, jSONObject, "visibility", tctVar2, jx9Var, ozbVar12);
        if (P5 != 0) {
            ozbVar12 = P5;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, ni9Var.R, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V11 = h4a.V(t7kVar, ni9Var.S, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, ni9Var.T, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = ji9.i;
        }
        return new ei9(tc8Var, O, O2, ozbVar2, V, V2, op8Var, Q, V3, V4, wz8Var, N, ozbVar3, ozbVar5, N2, O3, Q2, V5, bk9Var2, ozbVar7, N3, str, w79Var, ozbVar9, Q3, ix8Var, J, ix8Var2, N4, Q4, V6, ozbVar11, V7, qv9Var, V8, sq8Var, un8Var, un8Var2, T, str2, V9, V10, ozbVar12, l1aVar, V11, bk9Var3);
    }
}
