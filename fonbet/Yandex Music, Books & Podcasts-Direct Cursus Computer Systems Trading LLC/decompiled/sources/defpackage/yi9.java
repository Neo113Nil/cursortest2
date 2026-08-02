package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yi9 implements u8s {
    public final t6f a;

    public yi9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v62, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ri9 a(t7k t7kVar, bj9 bj9Var, JSONObject jSONObject) {
        c9c c9cVar = bj9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        bd8 bd8Var = (bd8) h4a.K(t7kVar, bj9Var.b, jSONObject, Constants.KEY_ACTION, t6fVar.v1, t6fVar.t1);
        sm8 sm8Var = (sm8) h4a.K(t7kVar, bj9Var.c, jSONObject, "action_animation", t6fVar.B1, t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = zi9.a;
        }
        sm8 sm8Var2 = sm8Var;
        List V = h4a.V(t7kVar, bj9Var.d, jSONObject, "actions", t6fVar.v1, t6fVar.t1);
        szb O = h4a.O(t7kVar, bj9Var.e, jSONObject, "alignment_horizontal", zi9.g, va8.x0);
        szb O2 = h4a.O(t7kVar, bj9Var.f, jSONObject, "alignment_vertical", zi9.h, va8.z0);
        c9c c9cVar2 = bj9Var.g;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = zi9.j;
        ozb ozbVar = zi9.b;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V2 = h4a.V(t7kVar, bj9Var.h, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V3 = h4a.V(t7kVar, bj9Var.i, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, bj9Var.j, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = bj9Var.k;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar2 = zi9.c;
        ?? P = h4a.P(t7kVar, c9cVar3, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ozbVar2);
        ozb ozbVar3 = P == 0 ? ozbVar2 : P;
        c9c c9cVar4 = bj9Var.l;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar4, jSONObject, "column_span", ox8Var3, kzjVar3, zi9.k);
        qi9 qi9Var = (qi9) h4a.K(t7kVar, bj9Var.m, jSONObject, "delimiter_style", t6fVar.d7, t6fVar.b7);
        List V4 = h4a.V(t7kVar, bj9Var.n, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V5 = h4a.V(t7kVar, bj9Var.o, jSONObject, "doubletap_actions", t6fVar.v1, t6fVar.t1);
        List V6 = h4a.V(t7kVar, bj9Var.p, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, bj9Var.q, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V7 = h4a.V(t7kVar, bj9Var.r, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, bj9Var.s, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = zi9.d;
        }
        bk9 bk9Var2 = bk9Var;
        List V8 = h4a.V(t7kVar, bj9Var.t, jSONObject, "hover_end_actions", t6fVar.v1, t6fVar.t1);
        List V9 = h4a.V(t7kVar, bj9Var.u, jSONObject, "hover_start_actions", t6fVar.v1, t6fVar.t1);
        String str = (String) h4a.L(bj9Var.v, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        w79 w79Var = (w79) h4a.K(t7kVar, bj9Var.w, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        List V10 = h4a.V(t7kVar, bj9Var.x, jSONObject, "longtap_actions", t6fVar.v1, t6fVar.t1);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, bj9Var.y, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, bj9Var.z, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        List V11 = h4a.V(t7kVar, bj9Var.A, jSONObject, "press_end_actions", t6fVar.v1, t6fVar.t1);
        List V12 = h4a.V(t7kVar, bj9Var.B, jSONObject, "press_start_actions", t6fVar.v1, t6fVar.t1);
        szb N = h4a.N(t7kVar, bj9Var.C, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, bj9Var.D, jSONObject, "row_span", ox8Var3, kzjVar3, zi9.l);
        List V13 = h4a.V(t7kVar, bj9Var.E, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V14 = h4a.V(t7kVar, bj9Var.F, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, bj9Var.G, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V15 = h4a.V(t7kVar, bj9Var.H, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, bj9Var.I, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, bj9Var.J, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, bj9Var.K, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, bj9Var.L, jSONObject, zi9.m);
        List V16 = h4a.V(t7kVar, bj9Var.M, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V17 = h4a.V(t7kVar, bj9Var.N, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar5 = bj9Var.O;
        tct tctVar = zi9.i;
        jx9 jx9Var = jx9.z;
        ozb ozbVar4 = zi9.e;
        ?? P2 = h4a.P(t7kVar, c9cVar5, jSONObject, "visibility", tctVar, jx9Var, ozbVar4);
        if (P2 != 0) {
            ozbVar4 = P2;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, bj9Var.P, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V18 = h4a.V(t7kVar, bj9Var.Q, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, bj9Var.R, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = zi9.f;
        }
        return new ri9(tc8Var, bd8Var, sm8Var2, V, O, O2, ozbVar, V2, V3, op8Var, ozbVar3, Q, qi9Var, V4, V5, V6, wz8Var, V7, bk9Var2, V8, V9, str, w79Var, V10, ix8Var, ix8Var2, V11, V12, N, Q2, V13, V14, qv9Var, V15, sq8Var, un8Var, un8Var2, T, V16, V17, ozbVar4, l1aVar, V18, bk9Var3);
    }
}
