package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b29 implements u8s {
    public final t6f a;

    public b29(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v22, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v24, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v66, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w19 a(t7k t7kVar, e29 e29Var, JSONObject jSONObject) {
        c9c c9cVar = e29Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        bd8 bd8Var = (bd8) h4a.K(t7kVar, e29Var.b, jSONObject, Constants.KEY_ACTION, t6fVar.v1, t6fVar.t1);
        sm8 sm8Var = (sm8) h4a.K(t7kVar, e29Var.c, jSONObject, "action_animation", t6fVar.B1, t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = c29.a;
        }
        sm8 sm8Var2 = sm8Var;
        List V = h4a.V(t7kVar, e29Var.d, jSONObject, "actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar2 = e29Var.e;
        tct tctVar = c29.i;
        va8 va8Var = va8.x0;
        szb O = h4a.O(t7kVar, c9cVar2, jSONObject, "alignment_horizontal", tctVar, va8Var);
        c9c c9cVar3 = e29Var.f;
        tct tctVar2 = c29.j;
        va8 va8Var2 = va8.z0;
        szb O2 = h4a.O(t7kVar, c9cVar3, jSONObject, "alignment_vertical", tctVar2, va8Var2);
        c9c c9cVar4 = e29Var.g;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = c29.n;
        ozb ozbVar = c29.b;
        ?? R = h4a.R(t7kVar, c9cVar4, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V2 = h4a.V(t7kVar, e29Var.h, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V3 = h4a.V(t7kVar, e29Var.i, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, e29Var.j, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar5 = e29Var.k;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar2 = c29.c;
        ?? P = h4a.P(t7kVar, c9cVar5, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ozbVar2);
        ozb ozbVar3 = P == 0 ? ozbVar2 : P;
        c9c c9cVar6 = e29Var.l;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb H = h4a.H(t7kVar, c9cVar6, jSONObject, "column_count", ox8Var3, kzjVar3, c29.o);
        szb Q = h4a.Q(t7kVar, e29Var.m, jSONObject, "column_span", ox8Var3, kzjVar3, c29.p);
        c9c c9cVar7 = e29Var.n;
        tct tctVar3 = c29.k;
        ozb ozbVar4 = c29.d;
        ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "content_alignment_horizontal", tctVar3, va8Var, ozbVar4);
        ozb ozbVar5 = P2 == 0 ? ozbVar4 : P2;
        c9c c9cVar8 = e29Var.o;
        tct tctVar4 = c29.l;
        ozb ozbVar6 = c29.e;
        ?? P3 = h4a.P(t7kVar, c9cVar8, jSONObject, "content_alignment_vertical", tctVar4, va8Var2, ozbVar6);
        ozb ozbVar7 = P3 == 0 ? ozbVar6 : P3;
        List V4 = h4a.V(t7kVar, e29Var.p, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V5 = h4a.V(t7kVar, e29Var.q, jSONObject, "doubletap_actions", t6fVar.v1, t6fVar.t1);
        List V6 = h4a.V(t7kVar, e29Var.r, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, e29Var.s, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V7 = h4a.V(t7kVar, e29Var.t, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, e29Var.u, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = c29.f;
        }
        bk9 bk9Var2 = bk9Var;
        List V8 = h4a.V(t7kVar, e29Var.v, jSONObject, "hover_end_actions", t6fVar.v1, t6fVar.t1);
        List V9 = h4a.V(t7kVar, e29Var.w, jSONObject, "hover_start_actions", t6fVar.v1, t6fVar.t1);
        String str = (String) h4a.L(e29Var.x, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        List V10 = h4a.V(t7kVar, e29Var.y, jSONObject, "items", t6fVar.ca, t6fVar.aa);
        w79 w79Var = (w79) h4a.K(t7kVar, e29Var.z, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        List V11 = h4a.V(t7kVar, e29Var.A, jSONObject, "longtap_actions", t6fVar.v1, t6fVar.t1);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, e29Var.B, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, e29Var.C, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        List V12 = h4a.V(t7kVar, e29Var.D, jSONObject, "press_end_actions", t6fVar.v1, t6fVar.t1);
        List V13 = h4a.V(t7kVar, e29Var.E, jSONObject, "press_start_actions", t6fVar.v1, t6fVar.t1);
        szb N = h4a.N(t7kVar, e29Var.F, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, e29Var.G, jSONObject, "row_span", ox8Var3, kzjVar3, c29.q);
        List V14 = h4a.V(t7kVar, e29Var.H, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V15 = h4a.V(t7kVar, e29Var.I, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, e29Var.J, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V16 = h4a.V(t7kVar, e29Var.K, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, e29Var.L, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, e29Var.M, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, e29Var.N, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, e29Var.O, jSONObject, c29.r);
        List V17 = h4a.V(t7kVar, e29Var.P, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V18 = h4a.V(t7kVar, e29Var.Q, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar9 = e29Var.R;
        tct tctVar5 = c29.m;
        jx9 jx9Var = jx9.z;
        ozb ozbVar8 = c29.g;
        ?? P4 = h4a.P(t7kVar, c9cVar9, jSONObject, "visibility", tctVar5, jx9Var, ozbVar8);
        if (P4 != 0) {
            ozbVar8 = P4;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, e29Var.S, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V19 = h4a.V(t7kVar, e29Var.T, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, e29Var.U, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = c29.h;
        }
        return new w19(tc8Var, bd8Var, sm8Var2, V, O, O2, ozbVar, V2, V3, op8Var, ozbVar3, H, Q, ozbVar5, ozbVar7, V4, V5, V6, wz8Var, V7, bk9Var2, V8, V9, str, V10, w79Var, V11, ix8Var, ix8Var2, V12, V13, N, Q2, V14, V15, qv9Var, V16, sq8Var, un8Var, un8Var2, T, V17, V18, ozbVar8, l1aVar, V19, bk9Var3);
    }
}
