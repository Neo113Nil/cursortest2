package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jm9 implements gip, r8s {
    public final t6f a;

    public jm9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final tm9 c(t7k t7kVar, tm9 tm9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = tm9Var != null ? tm9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        c9c N2 = y2x.N(Y, jSONObject, Constants.KEY_ACTION, d, tm9Var != null ? tm9Var.b : null, t6fVar.u1);
        c9c N3 = y2x.N(Y, jSONObject, "action_animation", d, tm9Var != null ? tm9Var.c : null, t6fVar.A1);
        c9c R = y2x.R(Y, jSONObject, "actions", d, tm9Var != null ? tm9Var.d : null, t6fVar.u1);
        tct tctVar = lm9.i;
        c9c c9cVar2 = tm9Var != null ? tm9Var.e : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", lm9.j, d, tm9Var != null ? tm9Var.f : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, tm9Var != null ? tm9Var.g : null, kzj.E, lm9.m);
        c9c R2 = y2x.R(Y, jSONObject, "animators", d, tm9Var != null ? tm9Var.h : null, t6fVar.D1);
        c9c R3 = y2x.R(Y, jSONObject, C0479n3.g, d, tm9Var != null ? tm9Var.i : null, t6fVar.P1);
        c9c N4 = y2x.N(Y, jSONObject, "border", d, tm9Var != null ? tm9Var.j : null, t6fVar.V1);
        ox8 ox8Var = vct.a;
        c9c c9cVar3 = tm9Var != null ? tm9Var.k : null;
        kzj kzjVar = kzj.B;
        c9c P4 = y2x.P(Y, jSONObject, "capture_focus_on_action", ox8Var, d, c9cVar3, kzjVar, ns9Var);
        c9c P5 = y2x.P(Y, jSONObject, "clip_to_bounds", ox8Var, d, tm9Var != null ? tm9Var.l : null, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar4 = tm9Var != null ? tm9Var.m : null;
        kzj kzjVar2 = kzj.F;
        c9c P6 = y2x.P(Y, jSONObject, "column_span", ox8Var2, d, c9cVar4, kzjVar2, lm9.n);
        ox8 ox8Var3 = vct.c;
        c9c c9cVar5 = tm9Var != null ? tm9Var.n : null;
        s3f s3fVar = bcx.i;
        c9c P7 = y2x.P(Y, jSONObject, "default_state_id", ox8Var3, d, c9cVar5, s3fVar, ns9Var);
        c9c R4 = y2x.R(Y, jSONObject, "disappear_actions", d, tm9Var != null ? tm9Var.o : null, t6fVar.Z2);
        c9c O = y2x.O(Y, jSONObject, "div_id", d, tm9Var != null ? tm9Var.p : null, s3fVar);
        c9c R5 = y2x.R(Y, jSONObject, "doubletap_actions", d, tm9Var != null ? tm9Var.q : null, t6fVar.u1);
        c9c R6 = y2x.R(Y, jSONObject, "extensions", d, tm9Var != null ? tm9Var.r : null, t6fVar.l3);
        c9c N5 = y2x.N(Y, jSONObject, "focus", d, tm9Var != null ? tm9Var.s : null, t6fVar.M3);
        c9c R7 = y2x.R(Y, jSONObject, "functions", d, tm9Var != null ? tm9Var.t : null, t6fVar.V3);
        c9c N6 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, tm9Var != null ? tm9Var.u : null, t6fVar.r7);
        c9c R8 = y2x.R(Y, jSONObject, "hover_end_actions", d, tm9Var != null ? tm9Var.v : null, t6fVar.u1);
        c9c R9 = y2x.R(Y, jSONObject, "hover_start_actions", d, tm9Var != null ? tm9Var.w : null, t6fVar.u1);
        c9c O2 = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, tm9Var != null ? tm9Var.x : null, s3fVar);
        c9c N7 = y2x.N(Y, jSONObject, "layout_provider", d, tm9Var != null ? tm9Var.y : null, t6fVar.Z4);
        c9c R10 = y2x.R(Y, jSONObject, "longtap_actions", d, tm9Var != null ? tm9Var.z : null, t6fVar.u1);
        c9c N8 = y2x.N(Y, jSONObject, "margins", d, tm9Var != null ? tm9Var.A : null, t6fVar.i3);
        c9c N9 = y2x.N(Y, jSONObject, "paddings", d, tm9Var != null ? tm9Var.B : null, t6fVar.i3);
        c9c R11 = y2x.R(Y, jSONObject, "press_end_actions", d, tm9Var != null ? tm9Var.C : null, t6fVar.u1);
        c9c R12 = y2x.R(Y, jSONObject, "press_start_actions", d, tm9Var != null ? tm9Var.D : null, t6fVar.u1);
        c9c P8 = y2x.P(Y, jSONObject, "reuse_id", ox8Var3, d, tm9Var != null ? tm9Var.E : null, s3fVar, ns9Var);
        c9c P9 = y2x.P(Y, jSONObject, "row_span", ox8Var2, d, tm9Var != null ? tm9Var.F : null, kzjVar2, lm9.o);
        c9c R13 = y2x.R(Y, jSONObject, "selected_actions", d, tm9Var != null ? tm9Var.G : null, t6fVar.u1);
        c9c O3 = y2x.O(Y, jSONObject, "state_id_variable", d, tm9Var != null ? tm9Var.H : null, s3fVar);
        c9c c9cVar6 = tm9Var != null ? tm9Var.I : null;
        jyr jyrVar = t6fVar.M7;
        y19 y19Var = lm9.p;
        y19Var.getClass();
        c9c L = y2x.L(Y, jSONObject, "states", d, c9cVar6, jyrVar, y19Var);
        c9c R14 = y2x.R(Y, jSONObject, "tooltips", d, tm9Var != null ? tm9Var.J : null, t6fVar.o9);
        c9c N10 = y2x.N(Y, jSONObject, "transform", d, tm9Var != null ? tm9Var.K : null, t6fVar.r9);
        c9c R15 = y2x.R(Y, jSONObject, "transformations", d, tm9Var != null ? tm9Var.L : null, t6fVar.u9);
        c9c P10 = y2x.P(Y, jSONObject, "transition_animation_selector", lm9.k, d, tm9Var != null ? tm9Var.M : null, vq9.x0, ns9Var);
        c9c N11 = y2x.N(Y, jSONObject, "transition_change", d, tm9Var != null ? tm9Var.N : null, t6fVar.e2);
        c9c N12 = y2x.N(Y, jSONObject, "transition_in", d, tm9Var != null ? tm9Var.O : null, t6fVar.J1);
        c9c N13 = y2x.N(Y, jSONObject, "transition_out", d, tm9Var != null ? tm9Var.P : null, t6fVar.J1);
        c9c c9cVar7 = tm9Var != null ? tm9Var.Q : null;
        y19 y19Var2 = lm9.q;
        y19Var2.getClass();
        return new tm9(N, N2, N3, R, P, P2, P3, R2, R3, N4, P4, P5, P6, P7, R4, O, R5, R6, N5, R7, N6, R8, R9, O2, N7, R10, N8, N9, R11, R12, P8, P9, R13, O3, L, R14, N10, R15, P10, N11, N12, N13, y2x.S(Y, jSONObject, d, c9cVar7, y19Var2), y2x.R(Y, jSONObject, "variable_triggers", d, tm9Var != null ? tm9Var.R : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, tm9Var != null ? tm9Var.S : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", lm9.l, d, tm9Var != null ? tm9Var.T : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, tm9Var != null ? tm9Var.U : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, tm9Var != null ? tm9Var.V : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, tm9Var != null ? tm9Var.W : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, tm9 tm9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = tm9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = tm9Var.b;
        jyr jyrVar = t6fVar.u1;
        y2x.i0(t7kVar, jSONObject, Constants.KEY_ACTION, c9cVar2, jyrVar);
        y2x.i0(t7kVar, jSONObject, "action_animation", tm9Var.c, t6fVar.A1);
        y2x.k0(t7kVar, jSONObject, "actions", tm9Var.d, jyrVar);
        y2x.e0(tm9Var.e, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(tm9Var.f, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", tm9Var.g);
        y2x.k0(t7kVar, jSONObject, "animators", tm9Var.h, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, tm9Var.i, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", tm9Var.j, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "capture_focus_on_action", tm9Var.k);
        y2x.f0(t7kVar, jSONObject, "clip_to_bounds", tm9Var.l);
        y2x.f0(t7kVar, jSONObject, "column_span", tm9Var.m);
        y2x.f0(t7kVar, jSONObject, "default_state_id", tm9Var.n);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", tm9Var.o, t6fVar.Z2);
        y2x.h0(t7kVar, jSONObject, "div_id", tm9Var.p);
        y2x.k0(t7kVar, jSONObject, "doubletap_actions", tm9Var.q, jyrVar);
        y2x.k0(t7kVar, jSONObject, "extensions", tm9Var.r, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", tm9Var.s, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", tm9Var.t, t6fVar.V3);
        c9c c9cVar3 = tm9Var.u;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar3, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "hover_end_actions", tm9Var.v, jyrVar);
        y2x.k0(t7kVar, jSONObject, "hover_start_actions", tm9Var.w, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, tm9Var.x);
        y2x.i0(t7kVar, jSONObject, "layout_provider", tm9Var.y, t6fVar.Z4);
        y2x.k0(t7kVar, jSONObject, "longtap_actions", tm9Var.z, jyrVar);
        c9c c9cVar4 = tm9Var.A;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar4, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "paddings", tm9Var.B, jyrVar3);
        y2x.k0(t7kVar, jSONObject, "press_end_actions", tm9Var.C, jyrVar);
        y2x.k0(t7kVar, jSONObject, "press_start_actions", tm9Var.D, jyrVar);
        y2x.f0(t7kVar, jSONObject, "reuse_id", tm9Var.E);
        y2x.f0(t7kVar, jSONObject, "row_span", tm9Var.F);
        y2x.k0(t7kVar, jSONObject, "selected_actions", tm9Var.G, jyrVar);
        y2x.h0(t7kVar, jSONObject, "state_id_variable", tm9Var.H);
        y2x.k0(t7kVar, jSONObject, "states", tm9Var.I, t6fVar.M7);
        y2x.k0(t7kVar, jSONObject, "tooltips", tm9Var.J, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", tm9Var.K, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", tm9Var.L, t6fVar.u9);
        y2x.e0(tm9Var.M, t7kVar, "transition_animation_selector", vq9.y0, jSONObject);
        y2x.i0(t7kVar, jSONObject, "transition_change", tm9Var.N, t6fVar.e2);
        c9c c9cVar5 = tm9Var.O;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar5, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", tm9Var.P, jyrVar4);
        y2x.j0(t7kVar, jSONObject, tm9Var.Q);
        etn.l0(t7kVar, jSONObject, "type", "state");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", tm9Var.R, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", tm9Var.S, t6fVar.J9);
        y2x.e0(tm9Var.T, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar6 = tm9Var.U;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar6, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", tm9Var.V, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, tm9Var.W, jyrVar2);
        return jSONObject;
    }
}
