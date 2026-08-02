package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s19 implements u8s {
    public final t6f a;

    public s19(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v20, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v23, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v49, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v51, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v59, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v75, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i19 a(t7k t7kVar, u19 u19Var, JSONObject jSONObject) {
        c9c c9cVar = u19Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        bd8 bd8Var = (bd8) h4a.K(t7kVar, u19Var.b, jSONObject, Constants.KEY_ACTION, t6fVar.v1, t6fVar.t1);
        sm8 sm8Var = (sm8) h4a.K(t7kVar, u19Var.c, jSONObject, "action_animation", t6fVar.B1, t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = t19.a;
        }
        sm8 sm8Var2 = sm8Var;
        List V = h4a.V(t7kVar, u19Var.d, jSONObject, "actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar2 = u19Var.e;
        tct tctVar = t19.l;
        va8 va8Var = va8.x0;
        szb O = h4a.O(t7kVar, c9cVar2, jSONObject, "alignment_horizontal", tctVar, va8Var);
        c9c c9cVar3 = u19Var.f;
        tct tctVar2 = t19.m;
        va8 va8Var2 = va8.z0;
        szb O2 = h4a.O(t7kVar, c9cVar3, jSONObject, "alignment_vertical", tctVar2, va8Var2);
        c9c c9cVar4 = u19Var.g;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = t19.r;
        ozb ozbVar = t19.b;
        ?? R = h4a.R(t7kVar, c9cVar4, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V2 = h4a.V(t7kVar, u19Var.h, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        do8 do8Var = (do8) h4a.K(t7kVar, u19Var.i, jSONObject, "aspect", t6fVar.N1, t6fVar.L1);
        List V3 = h4a.V(t7kVar, u19Var.j, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, u19Var.k, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar5 = u19Var.l;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar2 = t19.c;
        ?? P = h4a.P(t7kVar, c9cVar5, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ozbVar2);
        ozb ozbVar3 = P == 0 ? ozbVar2 : P;
        c9c c9cVar6 = u19Var.m;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar6, jSONObject, "column_span", ox8Var3, kzjVar3, t19.s);
        c9c c9cVar7 = u19Var.n;
        tct tctVar3 = t19.n;
        ozb ozbVar4 = t19.d;
        ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "content_alignment_horizontal", tctVar3, va8Var, ozbVar4);
        ozb ozbVar5 = P2 == 0 ? ozbVar4 : P2;
        c9c c9cVar8 = u19Var.o;
        tct tctVar4 = t19.o;
        ozb ozbVar6 = t19.e;
        ?? P3 = h4a.P(t7kVar, c9cVar8, jSONObject, "content_alignment_vertical", tctVar4, va8Var2, ozbVar6);
        ozb ozbVar7 = P3 == 0 ? ozbVar6 : P3;
        List V4 = h4a.V(t7kVar, u19Var.p, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V5 = h4a.V(t7kVar, u19Var.q, jSONObject, "doubletap_actions", t6fVar.v1, t6fVar.t1);
        List V6 = h4a.V(t7kVar, u19Var.r, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, u19Var.s, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V7 = h4a.V(t7kVar, u19Var.t, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        c9c c9cVar9 = u19Var.u;
        px8 px8Var = vct.e;
        kzj kzjVar4 = kzj.C;
        szb G = h4a.G(t7kVar, c9cVar9, jSONObject, "gif_url", px8Var, kzjVar4);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, u19Var.v, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = t19.f;
        }
        bk9 bk9Var2 = bk9Var;
        List V8 = h4a.V(t7kVar, u19Var.w, jSONObject, "hover_end_actions", t6fVar.v1, t6fVar.t1);
        List V9 = h4a.V(t7kVar, u19Var.x, jSONObject, "hover_start_actions", t6fVar.v1, t6fVar.t1);
        String str = (String) h4a.L(u19Var.y, t7kVar, ConnectableDevice.KEY_ID, bcx.i, jSONObject);
        w79 w79Var = (w79) h4a.K(t7kVar, u19Var.z, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        List V10 = h4a.V(t7kVar, u19Var.A, jSONObject, "longtap_actions", t6fVar.v1, t6fVar.t1);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, u19Var.B, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, u19Var.C, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        c9c c9cVar10 = u19Var.D;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar5 = kzj.G;
        ozb ozbVar8 = t19.g;
        ?? P4 = h4a.P(t7kVar, c9cVar10, jSONObject, "placeholder_color", ox8Var4, kzjVar5, ozbVar8);
        ozb ozbVar9 = P4 == 0 ? ozbVar8 : P4;
        c9c c9cVar11 = u19Var.E;
        ozb ozbVar10 = t19.h;
        ?? P5 = h4a.P(t7kVar, c9cVar11, jSONObject, "preload_required", ox8Var2, kzjVar2, ozbVar10);
        ozb ozbVar11 = P5 == 0 ? ozbVar10 : P5;
        List V11 = h4a.V(t7kVar, u19Var.F, jSONObject, "press_end_actions", t6fVar.v1, t6fVar.t1);
        List V12 = h4a.V(t7kVar, u19Var.G, jSONObject, "press_start_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar12 = u19Var.H;
        ox8 ox8Var5 = vct.c;
        szb N = h4a.N(t7kVar, c9cVar12, jSONObject, "preview", ox8Var5);
        szb O3 = h4a.O(t7kVar, u19Var.I, jSONObject, "preview_url", px8Var, kzjVar4);
        szb N2 = h4a.N(t7kVar, u19Var.J, jSONObject, "reuse_id", ox8Var5);
        szb Q2 = h4a.Q(t7kVar, u19Var.K, jSONObject, "row_span", ox8Var3, kzjVar3, t19.t);
        c9c c9cVar13 = u19Var.L;
        tct tctVar5 = t19.p;
        p19 p19Var = p19.J;
        ozb ozbVar12 = t19.i;
        ?? P6 = h4a.P(t7kVar, c9cVar13, jSONObject, "scale", tctVar5, p19Var, ozbVar12);
        ozb ozbVar13 = P6 == 0 ? ozbVar12 : P6;
        List V13 = h4a.V(t7kVar, u19Var.M, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V14 = h4a.V(t7kVar, u19Var.N, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, u19Var.O, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V15 = h4a.V(t7kVar, u19Var.P, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, u19Var.Q, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, u19Var.R, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, u19Var.S, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, u19Var.T, jSONObject, t19.u);
        List V16 = h4a.V(t7kVar, u19Var.U, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V17 = h4a.V(t7kVar, u19Var.V, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar14 = u19Var.W;
        tct tctVar6 = t19.q;
        jx9 jx9Var = jx9.z;
        ozb ozbVar14 = t19.j;
        ?? P7 = h4a.P(t7kVar, c9cVar14, jSONObject, "visibility", tctVar6, jx9Var, ozbVar14);
        if (P7 != 0) {
            ozbVar14 = P7;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, u19Var.X, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V18 = h4a.V(t7kVar, u19Var.Y, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, u19Var.Z, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = t19.k;
        }
        return new i19(tc8Var, bd8Var, sm8Var2, V, O, O2, ozbVar, V2, do8Var, V3, op8Var, ozbVar3, Q, ozbVar5, ozbVar7, V4, V5, V6, wz8Var, V7, G, bk9Var2, V8, V9, str, w79Var, V10, ix8Var, ix8Var2, ozbVar9, ozbVar11, V11, V12, N, O3, N2, Q2, ozbVar13, V13, V14, qv9Var, V15, sq8Var, un8Var, un8Var2, T, V16, V17, ozbVar14, l1aVar, V18, bk9Var3);
    }
}
