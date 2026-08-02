package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tt8 implements gip, r8s {
    public final t6f a;

    public tt8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final au8 c(t7k t7kVar, au8 au8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = au8Var != null ? au8Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        c9c N2 = y2x.N(Y, jSONObject, Constants.KEY_ACTION, d, au8Var != null ? au8Var.b : null, t6fVar.u1);
        c9c N3 = y2x.N(Y, jSONObject, "action_animation", d, au8Var != null ? au8Var.c : null, t6fVar.A1);
        c9c R = y2x.R(Y, jSONObject, "actions", d, au8Var != null ? au8Var.d : null, t6fVar.u1);
        tct tctVar = vt8.n;
        c9c c9cVar2 = au8Var != null ? au8Var.e : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", vt8.o, d, au8Var != null ? au8Var.f : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, au8Var != null ? au8Var.g : null, kzj.E, vt8.u);
        c9c R2 = y2x.R(Y, jSONObject, "animators", d, au8Var != null ? au8Var.h : null, t6fVar.D1);
        c9c N4 = y2x.N(Y, jSONObject, "aspect", d, au8Var != null ? au8Var.i : null, t6fVar.M1);
        c9c R3 = y2x.R(Y, jSONObject, C0479n3.g, d, au8Var != null ? au8Var.j : null, t6fVar.P1);
        c9c N5 = y2x.N(Y, jSONObject, "border", d, au8Var != null ? au8Var.k : null, t6fVar.V1);
        ox8 ox8Var = vct.a;
        c9c c9cVar3 = au8Var != null ? au8Var.l : null;
        kzj kzjVar = kzj.B;
        c9c P4 = y2x.P(Y, jSONObject, "capture_focus_on_action", ox8Var, d, c9cVar3, kzjVar, ns9Var);
        c9c P5 = y2x.P(Y, jSONObject, "clip_to_bounds", ox8Var, d, au8Var != null ? au8Var.m : null, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar4 = au8Var != null ? au8Var.n : null;
        kzj kzjVar2 = kzj.F;
        c9c P6 = y2x.P(Y, jSONObject, "column_span", ox8Var2, d, c9cVar4, kzjVar2, vt8.v);
        c9c P7 = y2x.P(Y, jSONObject, "content_alignment_horizontal", vt8.p, d, au8Var != null ? au8Var.o : null, qm8.v0, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "content_alignment_vertical", vt8.q, d, au8Var != null ? au8Var.p : null, qm8.x0, ns9Var);
        c9c R4 = y2x.R(Y, jSONObject, "disappear_actions", d, au8Var != null ? au8Var.q : null, t6fVar.Z2);
        c9c R5 = y2x.R(Y, jSONObject, "doubletap_actions", d, au8Var != null ? au8Var.r : null, t6fVar.u1);
        c9c R6 = y2x.R(Y, jSONObject, "extensions", d, au8Var != null ? au8Var.s : null, t6fVar.l3);
        c9c N6 = y2x.N(Y, jSONObject, "focus", d, au8Var != null ? au8Var.t : null, t6fVar.M3);
        c9c R7 = y2x.R(Y, jSONObject, "functions", d, au8Var != null ? au8Var.u : null, t6fVar.V3);
        c9c N7 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, au8Var != null ? au8Var.v : null, t6fVar.r7);
        c9c R8 = y2x.R(Y, jSONObject, "hover_end_actions", d, au8Var != null ? au8Var.w : null, t6fVar.u1);
        c9c R9 = y2x.R(Y, jSONObject, "hover_start_actions", d, au8Var != null ? au8Var.x : null, t6fVar.u1);
        c9c c9cVar5 = au8Var != null ? au8Var.y : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar5, s3fVar);
        c9c N8 = y2x.N(Y, jSONObject, "item_builder", d, au8Var != null ? au8Var.z : null, t6fVar.n2);
        c9c P9 = y2x.P(Y, jSONObject, "item_spacing", ox8Var2, d, au8Var != null ? au8Var.A : null, kzjVar2, vt8.w);
        c9c R10 = y2x.R(Y, jSONObject, "items", d, au8Var != null ? au8Var.B : null, t6fVar.ba);
        c9c P10 = y2x.P(Y, jSONObject, "layout_mode", vt8.r, d, au8Var != null ? au8Var.C : null, qm8.E, ns9Var);
        c9c N9 = y2x.N(Y, jSONObject, "layout_provider", d, au8Var != null ? au8Var.D : null, t6fVar.Z4);
        c9c N10 = y2x.N(Y, jSONObject, "line_separator", d, au8Var != null ? au8Var.E : null, t6fVar.z2);
        c9c P11 = y2x.P(Y, jSONObject, "line_spacing", ox8Var2, d, au8Var != null ? au8Var.F : null, kzjVar2, vt8.x);
        c9c R11 = y2x.R(Y, jSONObject, "longtap_actions", d, au8Var != null ? au8Var.G : null, t6fVar.u1);
        c9c N11 = y2x.N(Y, jSONObject, "margins", d, au8Var != null ? au8Var.H : null, t6fVar.i3);
        c9c P12 = y2x.P(Y, jSONObject, "orientation", vt8.s, d, au8Var != null ? au8Var.I : null, qm8.G, ns9Var);
        c9c N12 = y2x.N(Y, jSONObject, "paddings", d, au8Var != null ? au8Var.J : null, t6fVar.i3);
        c9c R12 = y2x.R(Y, jSONObject, "press_end_actions", d, au8Var != null ? au8Var.K : null, t6fVar.u1);
        c9c R13 = y2x.R(Y, jSONObject, "press_start_actions", d, au8Var != null ? au8Var.L : null, t6fVar.u1);
        c9c P13 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, au8Var != null ? au8Var.M : null, s3fVar, ns9Var);
        c9c P14 = y2x.P(Y, jSONObject, "row_span", ox8Var2, d, au8Var != null ? au8Var.N : null, kzjVar2, vt8.y);
        c9c R14 = y2x.R(Y, jSONObject, "selected_actions", d, au8Var != null ? au8Var.O : null, t6fVar.u1);
        c9c N13 = y2x.N(Y, jSONObject, "separator", d, au8Var != null ? au8Var.P : null, t6fVar.z2);
        c9c R15 = y2x.R(Y, jSONObject, "tooltips", d, au8Var != null ? au8Var.Q : null, t6fVar.o9);
        c9c N14 = y2x.N(Y, jSONObject, "transform", d, au8Var != null ? au8Var.R : null, t6fVar.r9);
        c9c R16 = y2x.R(Y, jSONObject, "transformations", d, au8Var != null ? au8Var.S : null, t6fVar.u9);
        c9c N15 = y2x.N(Y, jSONObject, "transition_change", d, au8Var != null ? au8Var.T : null, t6fVar.e2);
        c9c N16 = y2x.N(Y, jSONObject, "transition_in", d, au8Var != null ? au8Var.U : null, t6fVar.J1);
        c9c N17 = y2x.N(Y, jSONObject, "transition_out", d, au8Var != null ? au8Var.V : null, t6fVar.J1);
        c9c c9cVar6 = au8Var != null ? au8Var.W : null;
        rj7 rj7Var = vt8.z;
        rj7Var.getClass();
        return new au8(N, N2, N3, R, P, P2, P3, R2, N4, R3, N5, P4, P5, P6, P7, P8, R4, R5, R6, N6, R7, N7, R8, R9, O, N8, P9, R10, P10, N9, N10, P11, R11, N11, P12, N12, R12, R13, P13, P14, R14, N13, R15, N14, R16, N15, N16, N17, y2x.S(Y, jSONObject, d, c9cVar6, rj7Var), y2x.R(Y, jSONObject, "variable_triggers", d, au8Var != null ? au8Var.X : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, au8Var != null ? au8Var.Y : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", vt8.t, d, au8Var != null ? au8Var.Z : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, au8Var != null ? au8Var.a0 : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, au8Var != null ? au8Var.b0 : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, au8Var != null ? au8Var.c0 : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, au8 au8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = au8Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = au8Var.b;
        jyr jyrVar = t6fVar.u1;
        y2x.i0(t7kVar, jSONObject, Constants.KEY_ACTION, c9cVar2, jyrVar);
        y2x.i0(t7kVar, jSONObject, "action_animation", au8Var.c, t6fVar.A1);
        y2x.k0(t7kVar, jSONObject, "actions", au8Var.d, jyrVar);
        y2x.e0(au8Var.e, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(au8Var.f, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", au8Var.g);
        y2x.k0(t7kVar, jSONObject, "animators", au8Var.h, t6fVar.D1);
        y2x.i0(t7kVar, jSONObject, "aspect", au8Var.i, t6fVar.M1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, au8Var.j, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", au8Var.k, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "capture_focus_on_action", au8Var.l);
        y2x.f0(t7kVar, jSONObject, "clip_to_bounds", au8Var.m);
        y2x.f0(t7kVar, jSONObject, "column_span", au8Var.n);
        y2x.e0(au8Var.o, t7kVar, "content_alignment_horizontal", qm8.w0, jSONObject);
        y2x.e0(au8Var.p, t7kVar, "content_alignment_vertical", qm8.y0, jSONObject);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", au8Var.q, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "doubletap_actions", au8Var.r, jyrVar);
        y2x.k0(t7kVar, jSONObject, "extensions", au8Var.s, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", au8Var.t, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", au8Var.u, t6fVar.V3);
        c9c c9cVar3 = au8Var.v;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar3, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "hover_end_actions", au8Var.w, jyrVar);
        y2x.k0(t7kVar, jSONObject, "hover_start_actions", au8Var.x, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, au8Var.y);
        y2x.i0(t7kVar, jSONObject, "item_builder", au8Var.z, t6fVar.n2);
        y2x.f0(t7kVar, jSONObject, "item_spacing", au8Var.A);
        y2x.k0(t7kVar, jSONObject, "items", au8Var.B, t6fVar.ba);
        y2x.e0(au8Var.C, t7kVar, "layout_mode", qm8.F, jSONObject);
        y2x.i0(t7kVar, jSONObject, "layout_provider", au8Var.D, t6fVar.Z4);
        c9c c9cVar4 = au8Var.E;
        jyr jyrVar3 = t6fVar.z2;
        y2x.i0(t7kVar, jSONObject, "line_separator", c9cVar4, jyrVar3);
        y2x.f0(t7kVar, jSONObject, "line_spacing", au8Var.F);
        y2x.k0(t7kVar, jSONObject, "longtap_actions", au8Var.G, jyrVar);
        c9c c9cVar5 = au8Var.H;
        jyr jyrVar4 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar5, jyrVar4);
        y2x.e0(au8Var.I, t7kVar, "orientation", qm8.H, jSONObject);
        y2x.i0(t7kVar, jSONObject, "paddings", au8Var.J, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "press_end_actions", au8Var.K, jyrVar);
        y2x.k0(t7kVar, jSONObject, "press_start_actions", au8Var.L, jyrVar);
        y2x.f0(t7kVar, jSONObject, "reuse_id", au8Var.M);
        y2x.f0(t7kVar, jSONObject, "row_span", au8Var.N);
        y2x.k0(t7kVar, jSONObject, "selected_actions", au8Var.O, jyrVar);
        y2x.i0(t7kVar, jSONObject, "separator", au8Var.P, jyrVar3);
        y2x.k0(t7kVar, jSONObject, "tooltips", au8Var.Q, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", au8Var.R, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", au8Var.S, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", au8Var.T, t6fVar.e2);
        c9c c9cVar6 = au8Var.U;
        jyr jyrVar5 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar6, jyrVar5);
        y2x.i0(t7kVar, jSONObject, "transition_out", au8Var.V, jyrVar5);
        y2x.j0(t7kVar, jSONObject, au8Var.W);
        etn.l0(t7kVar, jSONObject, "type", "container");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", au8Var.X, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", au8Var.Y, t6fVar.J9);
        y2x.e0(au8Var.Z, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar7 = au8Var.a0;
        jyr jyrVar6 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar7, jyrVar6);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", au8Var.b0, jyrVar6);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, au8Var.c0, jyrVar2);
        return jSONObject;
    }
}
