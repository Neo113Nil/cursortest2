package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x29 implements gip, r8s {
    public final t6f a;

    public x29(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final h39 c(t7k t7kVar, h39 h39Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = h39Var != null ? h39Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        c9c N2 = y2x.N(Y, jSONObject, Constants.KEY_ACTION, d, h39Var != null ? h39Var.b : null, t6fVar.u1);
        c9c N3 = y2x.N(Y, jSONObject, "action_animation", d, h39Var != null ? h39Var.c : null, t6fVar.A1);
        c9c R = y2x.R(Y, jSONObject, "actions", d, h39Var != null ? h39Var.d : null, t6fVar.u1);
        tct tctVar = z29.n;
        c9c c9cVar2 = h39Var != null ? h39Var.e : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        tct tctVar2 = z29.o;
        c9c c9cVar3 = h39Var != null ? h39Var.f : null;
        va8 va8Var2 = va8.z0;
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", tctVar2, d, c9cVar3, va8Var2, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, h39Var != null ? h39Var.g : null, kzj.E, z29.u);
        c9c R2 = y2x.R(Y, jSONObject, "animators", d, h39Var != null ? h39Var.h : null, t6fVar.D1);
        c9c N4 = y2x.N(Y, jSONObject, "appearance_animation", d, h39Var != null ? h39Var.i : null, t6fVar.o3);
        c9c N5 = y2x.N(Y, jSONObject, "aspect", d, h39Var != null ? h39Var.j : null, t6fVar.M1);
        c9c R3 = y2x.R(Y, jSONObject, C0479n3.g, d, h39Var != null ? h39Var.k : null, t6fVar.P1);
        c9c N6 = y2x.N(Y, jSONObject, "border", d, h39Var != null ? h39Var.l : null, t6fVar.V1);
        ox8 ox8Var = vct.a;
        c9c c9cVar4 = h39Var != null ? h39Var.m : null;
        kzj kzjVar = kzj.B;
        c9c P4 = y2x.P(Y, jSONObject, "capture_focus_on_action", ox8Var, d, c9cVar4, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar5 = h39Var != null ? h39Var.n : null;
        kzj kzjVar2 = kzj.F;
        c9c P5 = y2x.P(Y, jSONObject, "column_span", ox8Var2, d, c9cVar5, kzjVar2, z29.v);
        c9c P6 = y2x.P(Y, jSONObject, "content_alignment_horizontal", z29.p, d, h39Var != null ? h39Var.o : null, va8Var, ns9Var);
        c9c P7 = y2x.P(Y, jSONObject, "content_alignment_vertical", z29.q, d, h39Var != null ? h39Var.p : null, va8Var2, ns9Var);
        c9c R4 = y2x.R(Y, jSONObject, "disappear_actions", d, h39Var != null ? h39Var.q : null, t6fVar.Z2);
        c9c R5 = y2x.R(Y, jSONObject, "doubletap_actions", d, h39Var != null ? h39Var.r : null, t6fVar.u1);
        c9c R6 = y2x.R(Y, jSONObject, "extensions", d, h39Var != null ? h39Var.s : null, t6fVar.l3);
        c9c R7 = y2x.R(Y, jSONObject, "filters", d, h39Var != null ? h39Var.t : null, t6fVar.u3);
        c9c N7 = y2x.N(Y, jSONObject, "focus", d, h39Var != null ? h39Var.u : null, t6fVar.M3);
        c9c R8 = y2x.R(Y, jSONObject, "functions", d, h39Var != null ? h39Var.v : null, t6fVar.V3);
        c9c N8 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, h39Var != null ? h39Var.w : null, t6fVar.r7);
        c9c P8 = y2x.P(Y, jSONObject, "high_priority_preview_show", ox8Var, d, h39Var != null ? h39Var.x : null, kzjVar, ns9Var);
        c9c R9 = y2x.R(Y, jSONObject, "hover_end_actions", d, h39Var != null ? h39Var.y : null, t6fVar.u1);
        c9c R10 = y2x.R(Y, jSONObject, "hover_start_actions", d, h39Var != null ? h39Var.z : null, t6fVar.u1);
        c9c c9cVar6 = h39Var != null ? h39Var.A : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar6, s3fVar);
        c9c K = y2x.K(Y, jSONObject, "image_url", vct.e, d, h39Var != null ? h39Var.B : null, kzj.C, ns9Var);
        c9c N9 = y2x.N(Y, jSONObject, "layout_provider", d, h39Var != null ? h39Var.C : null, t6fVar.Z4);
        c9c R11 = y2x.R(Y, jSONObject, "longtap_actions", d, h39Var != null ? h39Var.D : null, t6fVar.u1);
        c9c N10 = y2x.N(Y, jSONObject, "margins", d, h39Var != null ? h39Var.E : null, t6fVar.i3);
        c9c N11 = y2x.N(Y, jSONObject, "paddings", d, h39Var != null ? h39Var.F : null, t6fVar.i3);
        ox8 ox8Var3 = vct.f;
        c9c c9cVar7 = h39Var != null ? h39Var.G : null;
        kzj kzjVar3 = kzj.G;
        c9c P9 = y2x.P(Y, jSONObject, "placeholder_color", ox8Var3, d, c9cVar7, kzjVar3, ns9Var);
        c9c P10 = y2x.P(Y, jSONObject, "preload_required", ox8Var, d, h39Var != null ? h39Var.H : null, kzjVar, ns9Var);
        c9c R12 = y2x.R(Y, jSONObject, "press_end_actions", d, h39Var != null ? h39Var.I : null, t6fVar.u1);
        c9c R13 = y2x.R(Y, jSONObject, "press_start_actions", d, h39Var != null ? h39Var.J : null, t6fVar.u1);
        ox8 ox8Var4 = vct.c;
        c9c P11 = y2x.P(Y, jSONObject, "preview", ox8Var4, d, h39Var != null ? h39Var.K : null, s3fVar, ns9Var);
        c9c P12 = y2x.P(Y, jSONObject, "reuse_id", ox8Var4, d, h39Var != null ? h39Var.L : null, s3fVar, ns9Var);
        c9c P13 = y2x.P(Y, jSONObject, "row_span", ox8Var2, d, h39Var != null ? h39Var.M : null, kzjVar2, z29.w);
        c9c P14 = y2x.P(Y, jSONObject, "scale", z29.r, d, h39Var != null ? h39Var.N : null, p19.J, ns9Var);
        c9c R14 = y2x.R(Y, jSONObject, "selected_actions", d, h39Var != null ? h39Var.O : null, t6fVar.u1);
        c9c P15 = y2x.P(Y, jSONObject, "tint_color", ox8Var3, d, h39Var != null ? h39Var.P : null, kzjVar3, ns9Var);
        c9c P16 = y2x.P(Y, jSONObject, "tint_mode", z29.s, d, h39Var != null ? h39Var.Q : null, qm8.z, ns9Var);
        c9c R15 = y2x.R(Y, jSONObject, "tooltips", d, h39Var != null ? h39Var.R : null, t6fVar.o9);
        c9c N12 = y2x.N(Y, jSONObject, "transform", d, h39Var != null ? h39Var.S : null, t6fVar.r9);
        c9c R16 = y2x.R(Y, jSONObject, "transformations", d, h39Var != null ? h39Var.T : null, t6fVar.u9);
        c9c N13 = y2x.N(Y, jSONObject, "transition_change", d, h39Var != null ? h39Var.U : null, t6fVar.e2);
        c9c N14 = y2x.N(Y, jSONObject, "transition_in", d, h39Var != null ? h39Var.V : null, t6fVar.J1);
        c9c N15 = y2x.N(Y, jSONObject, "transition_out", d, h39Var != null ? h39Var.W : null, t6fVar.J1);
        c9c c9cVar8 = h39Var != null ? h39Var.X : null;
        y19 y19Var = z29.x;
        y19Var.getClass();
        return new h39(N, N2, N3, R, P, P2, P3, R2, N4, N5, R3, N6, P4, P5, P6, P7, R4, R5, R6, R7, N7, R8, N8, P8, R9, R10, O, K, N9, R11, N10, N11, P9, P10, R12, R13, P11, P12, P13, P14, R14, P15, P16, R15, N12, R16, N13, N14, N15, y2x.S(Y, jSONObject, d, c9cVar8, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, h39Var != null ? h39Var.Y : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, h39Var != null ? h39Var.Z : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", z29.t, d, h39Var != null ? h39Var.a0 : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, h39Var != null ? h39Var.b0 : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, h39Var != null ? h39Var.c0 : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, h39Var != null ? h39Var.d0 : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, h39 h39Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = h39Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = h39Var.b;
        jyr jyrVar = t6fVar.u1;
        y2x.i0(t7kVar, jSONObject, Constants.KEY_ACTION, c9cVar2, jyrVar);
        y2x.i0(t7kVar, jSONObject, "action_animation", h39Var.c, t6fVar.A1);
        y2x.k0(t7kVar, jSONObject, "actions", h39Var.d, jyrVar);
        c9c c9cVar3 = h39Var.e;
        va8 va8Var = va8.y0;
        y2x.e0(c9cVar3, t7kVar, "alignment_horizontal", va8Var, jSONObject);
        c9c c9cVar4 = h39Var.f;
        va8 va8Var2 = va8.A0;
        y2x.e0(c9cVar4, t7kVar, "alignment_vertical", va8Var2, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", h39Var.g);
        y2x.k0(t7kVar, jSONObject, "animators", h39Var.h, t6fVar.D1);
        y2x.i0(t7kVar, jSONObject, "appearance_animation", h39Var.i, t6fVar.o3);
        y2x.i0(t7kVar, jSONObject, "aspect", h39Var.j, t6fVar.M1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, h39Var.k, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", h39Var.l, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "capture_focus_on_action", h39Var.m);
        y2x.f0(t7kVar, jSONObject, "column_span", h39Var.n);
        y2x.e0(h39Var.o, t7kVar, "content_alignment_horizontal", va8Var, jSONObject);
        y2x.e0(h39Var.p, t7kVar, "content_alignment_vertical", va8Var2, jSONObject);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", h39Var.q, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "doubletap_actions", h39Var.r, jyrVar);
        y2x.k0(t7kVar, jSONObject, "extensions", h39Var.s, t6fVar.l3);
        y2x.k0(t7kVar, jSONObject, "filters", h39Var.t, t6fVar.u3);
        y2x.i0(t7kVar, jSONObject, "focus", h39Var.u, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", h39Var.v, t6fVar.V3);
        c9c c9cVar5 = h39Var.w;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar5, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "high_priority_preview_show", h39Var.x);
        y2x.k0(t7kVar, jSONObject, "hover_end_actions", h39Var.y, jyrVar);
        y2x.k0(t7kVar, jSONObject, "hover_start_actions", h39Var.z, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, h39Var.A);
        y2x.e0(h39Var.B, t7kVar, "image_url", kzj.H, jSONObject);
        y2x.i0(t7kVar, jSONObject, "layout_provider", h39Var.C, t6fVar.Z4);
        y2x.k0(t7kVar, jSONObject, "longtap_actions", h39Var.D, jyrVar);
        c9c c9cVar6 = h39Var.E;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar6, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "paddings", h39Var.F, jyrVar3);
        c9c c9cVar7 = h39Var.G;
        kzj kzjVar = kzj.D;
        y2x.e0(c9cVar7, t7kVar, "placeholder_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "preload_required", h39Var.H);
        y2x.k0(t7kVar, jSONObject, "press_end_actions", h39Var.I, jyrVar);
        y2x.k0(t7kVar, jSONObject, "press_start_actions", h39Var.J, jyrVar);
        y2x.f0(t7kVar, jSONObject, "preview", h39Var.K);
        y2x.f0(t7kVar, jSONObject, "reuse_id", h39Var.L);
        y2x.f0(t7kVar, jSONObject, "row_span", h39Var.M);
        y2x.e0(h39Var.N, t7kVar, "scale", p19.K, jSONObject);
        y2x.k0(t7kVar, jSONObject, "selected_actions", h39Var.O, jyrVar);
        y2x.e0(h39Var.P, t7kVar, "tint_color", kzjVar, jSONObject);
        y2x.e0(h39Var.Q, t7kVar, "tint_mode", qm8.A, jSONObject);
        y2x.k0(t7kVar, jSONObject, "tooltips", h39Var.R, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", h39Var.S, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", h39Var.T, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", h39Var.U, t6fVar.e2);
        c9c c9cVar8 = h39Var.V;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar8, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", h39Var.W, jyrVar4);
        y2x.j0(t7kVar, jSONObject, h39Var.X);
        etn.l0(t7kVar, jSONObject, "type", "image");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", h39Var.Y, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", h39Var.Z, t6fVar.J9);
        y2x.e0(h39Var.a0, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar9 = h39Var.b0;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar9, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", h39Var.c0, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, h39Var.d0, jyrVar2);
        return jSONObject;
    }
}
