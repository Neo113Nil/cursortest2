package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class km9 implements u8s {
    public final t6f a;

    public km9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v20, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v59, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v70, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dm9 a(t7k t7kVar, tm9 tm9Var, JSONObject jSONObject) {
        c9c c9cVar = tm9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        bd8 bd8Var = (bd8) h4a.K(t7kVar, tm9Var.b, jSONObject, Constants.KEY_ACTION, t6fVar.v1, t6fVar.t1);
        sm8 sm8Var = (sm8) h4a.K(t7kVar, tm9Var.c, jSONObject, "action_animation", t6fVar.B1, t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = lm9.a;
        }
        sm8 sm8Var2 = sm8Var;
        List V = h4a.V(t7kVar, tm9Var.d, jSONObject, "actions", t6fVar.v1, t6fVar.t1);
        szb O = h4a.O(t7kVar, tm9Var.e, jSONObject, "alignment_horizontal", lm9.i, va8.x0);
        szb O2 = h4a.O(t7kVar, tm9Var.f, jSONObject, "alignment_vertical", lm9.j, va8.z0);
        c9c c9cVar2 = tm9Var.g;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = lm9.m;
        ozb ozbVar = lm9.b;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V2 = h4a.V(t7kVar, tm9Var.h, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V3 = h4a.V(t7kVar, tm9Var.i, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, tm9Var.j, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = tm9Var.k;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar2 = lm9.c;
        ?? P = h4a.P(t7kVar, c9cVar3, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ozbVar2);
        ozb ozbVar3 = P == 0 ? ozbVar2 : P;
        c9c c9cVar4 = tm9Var.l;
        ozb ozbVar4 = lm9.d;
        ?? P2 = h4a.P(t7kVar, c9cVar4, jSONObject, "clip_to_bounds", ox8Var2, kzjVar2, ozbVar4);
        ozb ozbVar5 = P2 == 0 ? ozbVar4 : P2;
        c9c c9cVar5 = tm9Var.m;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar5, jSONObject, "column_span", ox8Var3, kzjVar3, lm9.n);
        c9c c9cVar6 = tm9Var.n;
        ox8 ox8Var4 = vct.c;
        szb N = h4a.N(t7kVar, c9cVar6, jSONObject, "default_state_id", ox8Var4);
        List V4 = h4a.V(t7kVar, tm9Var.o, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        c9c c9cVar7 = tm9Var.p;
        s3f s3fVar = bcx.i;
        String str = (String) h4a.L(c9cVar7, t7kVar, "div_id", s3fVar, jSONObject);
        ozb ozbVar6 = ozbVar;
        List V5 = h4a.V(t7kVar, tm9Var.q, jSONObject, "doubletap_actions", t6fVar.v1, t6fVar.t1);
        List V6 = h4a.V(t7kVar, tm9Var.r, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, tm9Var.s, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V7 = h4a.V(t7kVar, tm9Var.t, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, tm9Var.u, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = lm9.e;
        }
        bk9 bk9Var2 = bk9Var;
        List V8 = h4a.V(t7kVar, tm9Var.v, jSONObject, "hover_end_actions", t6fVar.v1, t6fVar.t1);
        List V9 = h4a.V(t7kVar, tm9Var.w, jSONObject, "hover_start_actions", t6fVar.v1, t6fVar.t1);
        String str2 = (String) h4a.L(tm9Var.x, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        w79 w79Var = (w79) h4a.K(t7kVar, tm9Var.y, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        List V10 = h4a.V(t7kVar, tm9Var.z, jSONObject, "longtap_actions", t6fVar.v1, t6fVar.t1);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, tm9Var.A, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, tm9Var.B, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        List V11 = h4a.V(t7kVar, tm9Var.C, jSONObject, "press_end_actions", t6fVar.v1, t6fVar.t1);
        List V12 = h4a.V(t7kVar, tm9Var.D, jSONObject, "press_start_actions", t6fVar.v1, t6fVar.t1);
        szb N2 = h4a.N(t7kVar, tm9Var.E, jSONObject, "reuse_id", ox8Var4);
        szb Q2 = h4a.Q(t7kVar, tm9Var.F, jSONObject, "row_span", ox8Var3, kzjVar3, lm9.o);
        List V13 = h4a.V(t7kVar, tm9Var.G, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        String str3 = (String) h4a.L(tm9Var.H, t7kVar, "state_id_variable", s3fVar, jSONObject);
        List J = h4a.J(t7kVar, tm9Var.I, jSONObject, "states", t6fVar.N7, t6fVar.L7, lm9.p);
        List V14 = h4a.V(t7kVar, tm9Var.J, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, tm9Var.K, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V15 = h4a.V(t7kVar, tm9Var.L, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        c9c c9cVar8 = tm9Var.M;
        tct tctVar = lm9.k;
        vq9 vq9Var = vq9.x0;
        ozb ozbVar7 = lm9.f;
        ?? P3 = h4a.P(t7kVar, c9cVar8, jSONObject, "transition_animation_selector", tctVar, vq9Var, ozbVar7);
        ozb ozbVar8 = P3 == 0 ? ozbVar7 : P3;
        sq8 sq8Var = (sq8) h4a.K(t7kVar, tm9Var.N, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, tm9Var.O, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, tm9Var.P, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, tm9Var.Q, jSONObject, lm9.q);
        List V16 = h4a.V(t7kVar, tm9Var.R, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V17 = h4a.V(t7kVar, tm9Var.S, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar9 = tm9Var.T;
        tct tctVar2 = lm9.l;
        jx9 jx9Var = jx9.z;
        ozb ozbVar9 = lm9.g;
        ?? P4 = h4a.P(t7kVar, c9cVar9, jSONObject, "visibility", tctVar2, jx9Var, ozbVar9);
        if (P4 != 0) {
            ozbVar9 = P4;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, tm9Var.U, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V18 = h4a.V(t7kVar, tm9Var.V, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, tm9Var.W, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = lm9.h;
        }
        return new dm9(tc8Var, bd8Var, sm8Var2, V, O, O2, ozbVar6, V2, V3, op8Var, ozbVar3, ozbVar5, Q, N, V4, str, V5, V6, wz8Var, V7, bk9Var2, V8, V9, str2, w79Var, V10, ix8Var, ix8Var2, V11, V12, N2, Q2, V13, str3, J, V14, qv9Var, V15, ozbVar8, sq8Var, un8Var, un8Var2, T, V16, V17, ozbVar9, l1aVar, V18, bk9Var3);
    }
}
