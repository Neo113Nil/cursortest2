package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r19 implements gip, r8s {
    public final t6f a;

    public r19(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final u19 c(t7k t7kVar, u19 u19Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = u19Var != null ? u19Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        c9c N2 = y2x.N(Y, jSONObject, Constants.KEY_ACTION, d, u19Var != null ? u19Var.b : null, t6fVar.u1);
        c9c N3 = y2x.N(Y, jSONObject, "action_animation", d, u19Var != null ? u19Var.c : null, t6fVar.A1);
        c9c R = y2x.R(Y, jSONObject, "actions", d, u19Var != null ? u19Var.d : null, t6fVar.u1);
        tct tctVar = t19.l;
        c9c c9cVar2 = u19Var != null ? u19Var.e : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        tct tctVar2 = t19.m;
        c9c c9cVar3 = u19Var != null ? u19Var.f : null;
        va8 va8Var2 = va8.z0;
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", tctVar2, d, c9cVar3, va8Var2, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, u19Var != null ? u19Var.g : null, kzj.E, t19.r);
        c9c R2 = y2x.R(Y, jSONObject, "animators", d, u19Var != null ? u19Var.h : null, t6fVar.D1);
        c9c N4 = y2x.N(Y, jSONObject, "aspect", d, u19Var != null ? u19Var.i : null, t6fVar.M1);
        c9c R3 = y2x.R(Y, jSONObject, C0479n3.g, d, u19Var != null ? u19Var.j : null, t6fVar.P1);
        c9c N5 = y2x.N(Y, jSONObject, "border", d, u19Var != null ? u19Var.k : null, t6fVar.V1);
        ox8 ox8Var = vct.a;
        c9c c9cVar4 = u19Var != null ? u19Var.l : null;
        kzj kzjVar = kzj.B;
        c9c P4 = y2x.P(Y, jSONObject, "capture_focus_on_action", ox8Var, d, c9cVar4, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar5 = u19Var != null ? u19Var.m : null;
        kzj kzjVar2 = kzj.F;
        c9c P5 = y2x.P(Y, jSONObject, "column_span", ox8Var2, d, c9cVar5, kzjVar2, t19.s);
        c9c P6 = y2x.P(Y, jSONObject, "content_alignment_horizontal", t19.n, d, u19Var != null ? u19Var.n : null, va8Var, ns9Var);
        c9c P7 = y2x.P(Y, jSONObject, "content_alignment_vertical", t19.o, d, u19Var != null ? u19Var.o : null, va8Var2, ns9Var);
        c9c R4 = y2x.R(Y, jSONObject, "disappear_actions", d, u19Var != null ? u19Var.p : null, t6fVar.Z2);
        c9c R5 = y2x.R(Y, jSONObject, "doubletap_actions", d, u19Var != null ? u19Var.q : null, t6fVar.u1);
        c9c R6 = y2x.R(Y, jSONObject, "extensions", d, u19Var != null ? u19Var.r : null, t6fVar.l3);
        c9c N6 = y2x.N(Y, jSONObject, "focus", d, u19Var != null ? u19Var.s : null, t6fVar.M3);
        c9c R7 = y2x.R(Y, jSONObject, "functions", d, u19Var != null ? u19Var.t : null, t6fVar.V3);
        px8 px8Var = vct.e;
        c9c c9cVar6 = u19Var != null ? u19Var.u : null;
        kzj kzjVar3 = kzj.C;
        c9c K = y2x.K(Y, jSONObject, "gif_url", px8Var, d, c9cVar6, kzjVar3, ns9Var);
        c9c N7 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, u19Var != null ? u19Var.v : null, t6fVar.r7);
        c9c R8 = y2x.R(Y, jSONObject, "hover_end_actions", d, u19Var != null ? u19Var.w : null, t6fVar.u1);
        c9c R9 = y2x.R(Y, jSONObject, "hover_start_actions", d, u19Var != null ? u19Var.x : null, t6fVar.u1);
        c9c c9cVar7 = u19Var != null ? u19Var.y : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar7, s3fVar);
        c9c N8 = y2x.N(Y, jSONObject, "layout_provider", d, u19Var != null ? u19Var.z : null, t6fVar.Z4);
        c9c R10 = y2x.R(Y, jSONObject, "longtap_actions", d, u19Var != null ? u19Var.A : null, t6fVar.u1);
        c9c N9 = y2x.N(Y, jSONObject, "margins", d, u19Var != null ? u19Var.B : null, t6fVar.i3);
        c9c N10 = y2x.N(Y, jSONObject, "paddings", d, u19Var != null ? u19Var.C : null, t6fVar.i3);
        c9c P8 = y2x.P(Y, jSONObject, "placeholder_color", vct.f, d, u19Var != null ? u19Var.D : null, kzj.G, ns9Var);
        c9c P9 = y2x.P(Y, jSONObject, "preload_required", ox8Var, d, u19Var != null ? u19Var.E : null, kzjVar, ns9Var);
        c9c R11 = y2x.R(Y, jSONObject, "press_end_actions", d, u19Var != null ? u19Var.F : null, t6fVar.u1);
        c9c R12 = y2x.R(Y, jSONObject, "press_start_actions", d, u19Var != null ? u19Var.G : null, t6fVar.u1);
        ox8 ox8Var3 = vct.c;
        c9c P10 = y2x.P(Y, jSONObject, "preview", ox8Var3, d, u19Var != null ? u19Var.H : null, s3fVar, ns9Var);
        c9c P11 = y2x.P(Y, jSONObject, "preview_url", px8Var, d, u19Var != null ? u19Var.I : null, kzjVar3, ns9Var);
        c9c P12 = y2x.P(Y, jSONObject, "reuse_id", ox8Var3, d, u19Var != null ? u19Var.J : null, s3fVar, ns9Var);
        c9c P13 = y2x.P(Y, jSONObject, "row_span", ox8Var2, d, u19Var != null ? u19Var.K : null, kzjVar2, t19.t);
        c9c P14 = y2x.P(Y, jSONObject, "scale", t19.p, d, u19Var != null ? u19Var.L : null, p19.J, ns9Var);
        c9c R13 = y2x.R(Y, jSONObject, "selected_actions", d, u19Var != null ? u19Var.M : null, t6fVar.u1);
        c9c R14 = y2x.R(Y, jSONObject, "tooltips", d, u19Var != null ? u19Var.N : null, t6fVar.o9);
        c9c N11 = y2x.N(Y, jSONObject, "transform", d, u19Var != null ? u19Var.O : null, t6fVar.r9);
        c9c R15 = y2x.R(Y, jSONObject, "transformations", d, u19Var != null ? u19Var.P : null, t6fVar.u9);
        c9c N12 = y2x.N(Y, jSONObject, "transition_change", d, u19Var != null ? u19Var.Q : null, t6fVar.e2);
        c9c N13 = y2x.N(Y, jSONObject, "transition_in", d, u19Var != null ? u19Var.R : null, t6fVar.J1);
        c9c N14 = y2x.N(Y, jSONObject, "transition_out", d, u19Var != null ? u19Var.S : null, t6fVar.J1);
        c9c c9cVar8 = u19Var != null ? u19Var.T : null;
        rj7 rj7Var = t19.u;
        rj7Var.getClass();
        return new u19(N, N2, N3, R, P, P2, P3, R2, N4, R3, N5, P4, P5, P6, P7, R4, R5, R6, N6, R7, K, N7, R8, R9, O, N8, R10, N9, N10, P8, P9, R11, R12, P10, P11, P12, P13, P14, R13, R14, N11, R15, N12, N13, N14, y2x.S(Y, jSONObject, d, c9cVar8, rj7Var), y2x.R(Y, jSONObject, "variable_triggers", d, u19Var != null ? u19Var.U : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, u19Var != null ? u19Var.V : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", t19.q, d, u19Var != null ? u19Var.W : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, u19Var != null ? u19Var.X : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, u19Var != null ? u19Var.Y : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, u19Var != null ? u19Var.Z : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, u19 u19Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = u19Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = u19Var.b;
        jyr jyrVar = t6fVar.u1;
        y2x.i0(t7kVar, jSONObject, Constants.KEY_ACTION, c9cVar2, jyrVar);
        y2x.i0(t7kVar, jSONObject, "action_animation", u19Var.c, t6fVar.A1);
        y2x.k0(t7kVar, jSONObject, "actions", u19Var.d, jyrVar);
        c9c c9cVar3 = u19Var.e;
        va8 va8Var = va8.y0;
        y2x.e0(c9cVar3, t7kVar, "alignment_horizontal", va8Var, jSONObject);
        c9c c9cVar4 = u19Var.f;
        va8 va8Var2 = va8.A0;
        y2x.e0(c9cVar4, t7kVar, "alignment_vertical", va8Var2, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", u19Var.g);
        y2x.k0(t7kVar, jSONObject, "animators", u19Var.h, t6fVar.D1);
        y2x.i0(t7kVar, jSONObject, "aspect", u19Var.i, t6fVar.M1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, u19Var.j, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", u19Var.k, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "capture_focus_on_action", u19Var.l);
        y2x.f0(t7kVar, jSONObject, "column_span", u19Var.m);
        y2x.e0(u19Var.n, t7kVar, "content_alignment_horizontal", va8Var, jSONObject);
        y2x.e0(u19Var.o, t7kVar, "content_alignment_vertical", va8Var2, jSONObject);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", u19Var.p, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "doubletap_actions", u19Var.q, jyrVar);
        y2x.k0(t7kVar, jSONObject, "extensions", u19Var.r, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", u19Var.s, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", u19Var.t, t6fVar.V3);
        c9c c9cVar5 = u19Var.u;
        kzj kzjVar = kzj.H;
        y2x.e0(c9cVar5, t7kVar, "gif_url", kzjVar, jSONObject);
        c9c c9cVar6 = u19Var.v;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar6, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "hover_end_actions", u19Var.w, jyrVar);
        y2x.k0(t7kVar, jSONObject, "hover_start_actions", u19Var.x, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, u19Var.y);
        y2x.i0(t7kVar, jSONObject, "layout_provider", u19Var.z, t6fVar.Z4);
        y2x.k0(t7kVar, jSONObject, "longtap_actions", u19Var.A, jyrVar);
        c9c c9cVar7 = u19Var.B;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar7, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "paddings", u19Var.C, jyrVar3);
        y2x.e0(u19Var.D, t7kVar, "placeholder_color", kzj.D, jSONObject);
        y2x.f0(t7kVar, jSONObject, "preload_required", u19Var.E);
        y2x.k0(t7kVar, jSONObject, "press_end_actions", u19Var.F, jyrVar);
        y2x.k0(t7kVar, jSONObject, "press_start_actions", u19Var.G, jyrVar);
        y2x.f0(t7kVar, jSONObject, "preview", u19Var.H);
        y2x.e0(u19Var.I, t7kVar, "preview_url", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "reuse_id", u19Var.J);
        y2x.f0(t7kVar, jSONObject, "row_span", u19Var.K);
        y2x.e0(u19Var.L, t7kVar, "scale", p19.K, jSONObject);
        y2x.k0(t7kVar, jSONObject, "selected_actions", u19Var.M, jyrVar);
        y2x.k0(t7kVar, jSONObject, "tooltips", u19Var.N, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", u19Var.O, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", u19Var.P, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", u19Var.Q, t6fVar.e2);
        c9c c9cVar8 = u19Var.R;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar8, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", u19Var.S, jyrVar4);
        y2x.j0(t7kVar, jSONObject, u19Var.T);
        etn.l0(t7kVar, jSONObject, "type", "gif");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", u19Var.U, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", u19Var.V, t6fVar.J9);
        y2x.e0(u19Var.W, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar9 = u19Var.X;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar9, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", u19Var.Y, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, u19Var.Z, jyrVar2);
        return jSONObject;
    }
}
