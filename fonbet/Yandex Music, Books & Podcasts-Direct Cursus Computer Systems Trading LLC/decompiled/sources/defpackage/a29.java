package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a29 implements gip, r8s {
    public final t6f a;

    public a29(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final e29 c(t7k t7kVar, e29 e29Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = e29Var != null ? e29Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        c9c N2 = y2x.N(Y, jSONObject, Constants.KEY_ACTION, d, e29Var != null ? e29Var.b : null, t6fVar.u1);
        c9c N3 = y2x.N(Y, jSONObject, "action_animation", d, e29Var != null ? e29Var.c : null, t6fVar.A1);
        c9c R = y2x.R(Y, jSONObject, "actions", d, e29Var != null ? e29Var.d : null, t6fVar.u1);
        tct tctVar = c29.i;
        c9c c9cVar2 = e29Var != null ? e29Var.e : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        tct tctVar2 = c29.j;
        c9c c9cVar3 = e29Var != null ? e29Var.f : null;
        va8 va8Var2 = va8.z0;
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", tctVar2, d, c9cVar3, va8Var2, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, e29Var != null ? e29Var.g : null, kzj.E, c29.n);
        c9c R2 = y2x.R(Y, jSONObject, "animators", d, e29Var != null ? e29Var.h : null, t6fVar.D1);
        c9c R3 = y2x.R(Y, jSONObject, C0479n3.g, d, e29Var != null ? e29Var.i : null, t6fVar.P1);
        c9c N4 = y2x.N(Y, jSONObject, "border", d, e29Var != null ? e29Var.j : null, t6fVar.V1);
        c9c P4 = y2x.P(Y, jSONObject, "capture_focus_on_action", vct.a, d, e29Var != null ? e29Var.k : null, kzj.B, ns9Var);
        ox8 ox8Var = vct.b;
        c9c c9cVar4 = e29Var != null ? e29Var.l : null;
        kzj kzjVar = kzj.F;
        c9c K = y2x.K(Y, jSONObject, "column_count", ox8Var, d, c9cVar4, kzjVar, c29.o);
        c9c P5 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, e29Var != null ? e29Var.m : null, kzjVar, c29.p);
        c9c P6 = y2x.P(Y, jSONObject, "content_alignment_horizontal", c29.k, d, e29Var != null ? e29Var.n : null, va8Var, ns9Var);
        c9c P7 = y2x.P(Y, jSONObject, "content_alignment_vertical", c29.l, d, e29Var != null ? e29Var.o : null, va8Var2, ns9Var);
        c9c R4 = y2x.R(Y, jSONObject, "disappear_actions", d, e29Var != null ? e29Var.p : null, t6fVar.Z2);
        c9c R5 = y2x.R(Y, jSONObject, "doubletap_actions", d, e29Var != null ? e29Var.q : null, t6fVar.u1);
        c9c R6 = y2x.R(Y, jSONObject, "extensions", d, e29Var != null ? e29Var.r : null, t6fVar.l3);
        c9c N5 = y2x.N(Y, jSONObject, "focus", d, e29Var != null ? e29Var.s : null, t6fVar.M3);
        c9c R7 = y2x.R(Y, jSONObject, "functions", d, e29Var != null ? e29Var.t : null, t6fVar.V3);
        c9c N6 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, e29Var != null ? e29Var.u : null, t6fVar.r7);
        c9c R8 = y2x.R(Y, jSONObject, "hover_end_actions", d, e29Var != null ? e29Var.v : null, t6fVar.u1);
        c9c R9 = y2x.R(Y, jSONObject, "hover_start_actions", d, e29Var != null ? e29Var.w : null, t6fVar.u1);
        c9c c9cVar5 = e29Var != null ? e29Var.x : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar5, s3fVar);
        c9c R10 = y2x.R(Y, jSONObject, "items", d, e29Var != null ? e29Var.y : null, t6fVar.ba);
        c9c N7 = y2x.N(Y, jSONObject, "layout_provider", d, e29Var != null ? e29Var.z : null, t6fVar.Z4);
        c9c R11 = y2x.R(Y, jSONObject, "longtap_actions", d, e29Var != null ? e29Var.A : null, t6fVar.u1);
        c9c N8 = y2x.N(Y, jSONObject, "margins", d, e29Var != null ? e29Var.B : null, t6fVar.i3);
        c9c N9 = y2x.N(Y, jSONObject, "paddings", d, e29Var != null ? e29Var.C : null, t6fVar.i3);
        c9c R12 = y2x.R(Y, jSONObject, "press_end_actions", d, e29Var != null ? e29Var.D : null, t6fVar.u1);
        c9c R13 = y2x.R(Y, jSONObject, "press_start_actions", d, e29Var != null ? e29Var.E : null, t6fVar.u1);
        c9c P8 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, e29Var != null ? e29Var.F : null, s3fVar, ns9Var);
        c9c P9 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, e29Var != null ? e29Var.G : null, kzjVar, c29.q);
        c9c R14 = y2x.R(Y, jSONObject, "selected_actions", d, e29Var != null ? e29Var.H : null, t6fVar.u1);
        c9c R15 = y2x.R(Y, jSONObject, "tooltips", d, e29Var != null ? e29Var.I : null, t6fVar.o9);
        c9c N10 = y2x.N(Y, jSONObject, "transform", d, e29Var != null ? e29Var.J : null, t6fVar.r9);
        c9c R16 = y2x.R(Y, jSONObject, "transformations", d, e29Var != null ? e29Var.K : null, t6fVar.u9);
        c9c N11 = y2x.N(Y, jSONObject, "transition_change", d, e29Var != null ? e29Var.L : null, t6fVar.e2);
        c9c N12 = y2x.N(Y, jSONObject, "transition_in", d, e29Var != null ? e29Var.M : null, t6fVar.J1);
        c9c N13 = y2x.N(Y, jSONObject, "transition_out", d, e29Var != null ? e29Var.N : null, t6fVar.J1);
        c9c c9cVar6 = e29Var != null ? e29Var.O : null;
        y19 y19Var = c29.r;
        y19Var.getClass();
        return new e29(N, N2, N3, R, P, P2, P3, R2, R3, N4, P4, K, P5, P6, P7, R4, R5, R6, N5, R7, N6, R8, R9, O, R10, N7, R11, N8, N9, R12, R13, P8, P9, R14, R15, N10, R16, N11, N12, N13, y2x.S(Y, jSONObject, d, c9cVar6, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, e29Var != null ? e29Var.P : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, e29Var != null ? e29Var.Q : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", c29.m, d, e29Var != null ? e29Var.R : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, e29Var != null ? e29Var.S : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, e29Var != null ? e29Var.T : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, e29Var != null ? e29Var.U : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, e29 e29Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = e29Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = e29Var.b;
        jyr jyrVar = t6fVar.u1;
        y2x.i0(t7kVar, jSONObject, Constants.KEY_ACTION, c9cVar2, jyrVar);
        y2x.i0(t7kVar, jSONObject, "action_animation", e29Var.c, t6fVar.A1);
        y2x.k0(t7kVar, jSONObject, "actions", e29Var.d, jyrVar);
        c9c c9cVar3 = e29Var.e;
        va8 va8Var = va8.y0;
        y2x.e0(c9cVar3, t7kVar, "alignment_horizontal", va8Var, jSONObject);
        c9c c9cVar4 = e29Var.f;
        va8 va8Var2 = va8.A0;
        y2x.e0(c9cVar4, t7kVar, "alignment_vertical", va8Var2, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", e29Var.g);
        y2x.k0(t7kVar, jSONObject, "animators", e29Var.h, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, e29Var.i, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", e29Var.j, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "capture_focus_on_action", e29Var.k);
        y2x.f0(t7kVar, jSONObject, "column_count", e29Var.l);
        y2x.f0(t7kVar, jSONObject, "column_span", e29Var.m);
        y2x.e0(e29Var.n, t7kVar, "content_alignment_horizontal", va8Var, jSONObject);
        y2x.e0(e29Var.o, t7kVar, "content_alignment_vertical", va8Var2, jSONObject);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", e29Var.p, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "doubletap_actions", e29Var.q, jyrVar);
        y2x.k0(t7kVar, jSONObject, "extensions", e29Var.r, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", e29Var.s, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", e29Var.t, t6fVar.V3);
        c9c c9cVar5 = e29Var.u;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar5, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "hover_end_actions", e29Var.v, jyrVar);
        y2x.k0(t7kVar, jSONObject, "hover_start_actions", e29Var.w, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, e29Var.x);
        y2x.k0(t7kVar, jSONObject, "items", e29Var.y, t6fVar.ba);
        y2x.i0(t7kVar, jSONObject, "layout_provider", e29Var.z, t6fVar.Z4);
        y2x.k0(t7kVar, jSONObject, "longtap_actions", e29Var.A, jyrVar);
        c9c c9cVar6 = e29Var.B;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar6, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "paddings", e29Var.C, jyrVar3);
        y2x.k0(t7kVar, jSONObject, "press_end_actions", e29Var.D, jyrVar);
        y2x.k0(t7kVar, jSONObject, "press_start_actions", e29Var.E, jyrVar);
        y2x.f0(t7kVar, jSONObject, "reuse_id", e29Var.F);
        y2x.f0(t7kVar, jSONObject, "row_span", e29Var.G);
        y2x.k0(t7kVar, jSONObject, "selected_actions", e29Var.H, jyrVar);
        y2x.k0(t7kVar, jSONObject, "tooltips", e29Var.I, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", e29Var.J, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", e29Var.K, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", e29Var.L, t6fVar.e2);
        c9c c9cVar7 = e29Var.M;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar7, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", e29Var.N, jyrVar4);
        y2x.j0(t7kVar, jSONObject, e29Var.O);
        etn.l0(t7kVar, jSONObject, "type", "grid");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", e29Var.P, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", e29Var.Q, t6fVar.J9);
        y2x.e0(e29Var.R, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar8 = e29Var.S;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar8, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", e29Var.T, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, e29Var.U, jyrVar2);
        return jSONObject;
    }
}
