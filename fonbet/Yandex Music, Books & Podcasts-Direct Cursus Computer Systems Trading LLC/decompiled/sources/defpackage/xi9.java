package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xi9 implements gip, r8s {
    public final t6f a;

    public xi9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final bj9 c(t7k t7kVar, bj9 bj9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = bj9Var != null ? bj9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        c9c N2 = y2x.N(Y, jSONObject, Constants.KEY_ACTION, d, bj9Var != null ? bj9Var.b : null, t6fVar.u1);
        c9c N3 = y2x.N(Y, jSONObject, "action_animation", d, bj9Var != null ? bj9Var.c : null, t6fVar.A1);
        c9c R = y2x.R(Y, jSONObject, "actions", d, bj9Var != null ? bj9Var.d : null, t6fVar.u1);
        tct tctVar = zi9.g;
        c9c c9cVar2 = bj9Var != null ? bj9Var.e : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", zi9.h, d, bj9Var != null ? bj9Var.f : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, bj9Var != null ? bj9Var.g : null, kzj.E, zi9.j);
        c9c R2 = y2x.R(Y, jSONObject, "animators", d, bj9Var != null ? bj9Var.h : null, t6fVar.D1);
        c9c R3 = y2x.R(Y, jSONObject, C0479n3.g, d, bj9Var != null ? bj9Var.i : null, t6fVar.P1);
        c9c N4 = y2x.N(Y, jSONObject, "border", d, bj9Var != null ? bj9Var.j : null, t6fVar.V1);
        c9c P4 = y2x.P(Y, jSONObject, "capture_focus_on_action", vct.a, d, bj9Var != null ? bj9Var.k : null, kzj.B, ns9Var);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = bj9Var != null ? bj9Var.l : null;
        kzj kzjVar = kzj.F;
        c9c P5 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, c9cVar3, kzjVar, zi9.k);
        c9c N5 = y2x.N(Y, jSONObject, "delimiter_style", d, bj9Var != null ? bj9Var.m : null, t6fVar.c7);
        c9c R4 = y2x.R(Y, jSONObject, "disappear_actions", d, bj9Var != null ? bj9Var.n : null, t6fVar.Z2);
        c9c R5 = y2x.R(Y, jSONObject, "doubletap_actions", d, bj9Var != null ? bj9Var.o : null, t6fVar.u1);
        c9c R6 = y2x.R(Y, jSONObject, "extensions", d, bj9Var != null ? bj9Var.p : null, t6fVar.l3);
        c9c N6 = y2x.N(Y, jSONObject, "focus", d, bj9Var != null ? bj9Var.q : null, t6fVar.M3);
        c9c R7 = y2x.R(Y, jSONObject, "functions", d, bj9Var != null ? bj9Var.r : null, t6fVar.V3);
        c9c N7 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, bj9Var != null ? bj9Var.s : null, t6fVar.r7);
        c9c R8 = y2x.R(Y, jSONObject, "hover_end_actions", d, bj9Var != null ? bj9Var.t : null, t6fVar.u1);
        c9c R9 = y2x.R(Y, jSONObject, "hover_start_actions", d, bj9Var != null ? bj9Var.u : null, t6fVar.u1);
        c9c c9cVar4 = bj9Var != null ? bj9Var.v : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar4, s3fVar);
        c9c N8 = y2x.N(Y, jSONObject, "layout_provider", d, bj9Var != null ? bj9Var.w : null, t6fVar.Z4);
        c9c R10 = y2x.R(Y, jSONObject, "longtap_actions", d, bj9Var != null ? bj9Var.x : null, t6fVar.u1);
        c9c N9 = y2x.N(Y, jSONObject, "margins", d, bj9Var != null ? bj9Var.y : null, t6fVar.i3);
        c9c N10 = y2x.N(Y, jSONObject, "paddings", d, bj9Var != null ? bj9Var.z : null, t6fVar.i3);
        c9c R11 = y2x.R(Y, jSONObject, "press_end_actions", d, bj9Var != null ? bj9Var.A : null, t6fVar.u1);
        c9c R12 = y2x.R(Y, jSONObject, "press_start_actions", d, bj9Var != null ? bj9Var.B : null, t6fVar.u1);
        c9c P6 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, bj9Var != null ? bj9Var.C : null, s3fVar, ns9Var);
        c9c P7 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, bj9Var != null ? bj9Var.D : null, kzjVar, zi9.l);
        c9c R13 = y2x.R(Y, jSONObject, "selected_actions", d, bj9Var != null ? bj9Var.E : null, t6fVar.u1);
        c9c R14 = y2x.R(Y, jSONObject, "tooltips", d, bj9Var != null ? bj9Var.F : null, t6fVar.o9);
        c9c N11 = y2x.N(Y, jSONObject, "transform", d, bj9Var != null ? bj9Var.G : null, t6fVar.r9);
        c9c R15 = y2x.R(Y, jSONObject, "transformations", d, bj9Var != null ? bj9Var.H : null, t6fVar.u9);
        c9c N12 = y2x.N(Y, jSONObject, "transition_change", d, bj9Var != null ? bj9Var.I : null, t6fVar.e2);
        c9c N13 = y2x.N(Y, jSONObject, "transition_in", d, bj9Var != null ? bj9Var.J : null, t6fVar.J1);
        c9c N14 = y2x.N(Y, jSONObject, "transition_out", d, bj9Var != null ? bj9Var.K : null, t6fVar.J1);
        c9c c9cVar5 = bj9Var != null ? bj9Var.L : null;
        y19 y19Var = zi9.m;
        y19Var.getClass();
        return new bj9(N, N2, N3, R, P, P2, P3, R2, R3, N4, P4, P5, N5, R4, R5, R6, N6, R7, N7, R8, R9, O, N8, R10, N9, N10, R11, R12, P6, P7, R13, R14, N11, R15, N12, N13, N14, y2x.S(Y, jSONObject, d, c9cVar5, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, bj9Var != null ? bj9Var.M : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, bj9Var != null ? bj9Var.N : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", zi9.i, d, bj9Var != null ? bj9Var.O : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, bj9Var != null ? bj9Var.P : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, bj9Var != null ? bj9Var.Q : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, bj9Var != null ? bj9Var.R : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bj9 bj9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = bj9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = bj9Var.b;
        jyr jyrVar = t6fVar.u1;
        y2x.i0(t7kVar, jSONObject, Constants.KEY_ACTION, c9cVar2, jyrVar);
        y2x.i0(t7kVar, jSONObject, "action_animation", bj9Var.c, t6fVar.A1);
        y2x.k0(t7kVar, jSONObject, "actions", bj9Var.d, jyrVar);
        y2x.e0(bj9Var.e, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(bj9Var.f, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", bj9Var.g);
        y2x.k0(t7kVar, jSONObject, "animators", bj9Var.h, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, bj9Var.i, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", bj9Var.j, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "capture_focus_on_action", bj9Var.k);
        y2x.f0(t7kVar, jSONObject, "column_span", bj9Var.l);
        y2x.i0(t7kVar, jSONObject, "delimiter_style", bj9Var.m, t6fVar.c7);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", bj9Var.n, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "doubletap_actions", bj9Var.o, jyrVar);
        y2x.k0(t7kVar, jSONObject, "extensions", bj9Var.p, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", bj9Var.q, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", bj9Var.r, t6fVar.V3);
        c9c c9cVar3 = bj9Var.s;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar3, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "hover_end_actions", bj9Var.t, jyrVar);
        y2x.k0(t7kVar, jSONObject, "hover_start_actions", bj9Var.u, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, bj9Var.v);
        y2x.i0(t7kVar, jSONObject, "layout_provider", bj9Var.w, t6fVar.Z4);
        y2x.k0(t7kVar, jSONObject, "longtap_actions", bj9Var.x, jyrVar);
        c9c c9cVar4 = bj9Var.y;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar4, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "paddings", bj9Var.z, jyrVar3);
        y2x.k0(t7kVar, jSONObject, "press_end_actions", bj9Var.A, jyrVar);
        y2x.k0(t7kVar, jSONObject, "press_start_actions", bj9Var.B, jyrVar);
        y2x.f0(t7kVar, jSONObject, "reuse_id", bj9Var.C);
        y2x.f0(t7kVar, jSONObject, "row_span", bj9Var.D);
        y2x.k0(t7kVar, jSONObject, "selected_actions", bj9Var.E, jyrVar);
        y2x.k0(t7kVar, jSONObject, "tooltips", bj9Var.F, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", bj9Var.G, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", bj9Var.H, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", bj9Var.I, t6fVar.e2);
        c9c c9cVar5 = bj9Var.J;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar5, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", bj9Var.K, jyrVar4);
        y2x.j0(t7kVar, jSONObject, bj9Var.L);
        etn.l0(t7kVar, jSONObject, "type", "separator");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", bj9Var.M, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", bj9Var.N, t6fVar.J9);
        y2x.e0(bj9Var.O, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar6 = bj9Var.P;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar6, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", bj9Var.Q, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, bj9Var.R, jyrVar2);
        return jSONObject;
    }
}
