package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ll9 implements gip, r8s {
    public final t6f a;

    public ll9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final sl9 c(t7k t7kVar, sl9 sl9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = sl9Var != null ? sl9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = nl9.h;
        c9c c9cVar2 = sl9Var != null ? sl9Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", nl9.i, d, sl9Var != null ? sl9Var.c : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, sl9Var != null ? sl9Var.d : null, kzj.E, nl9.k);
        c9c R = y2x.R(Y, jSONObject, "animators", d, sl9Var != null ? sl9Var.e : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, sl9Var != null ? sl9Var.f : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, sl9Var != null ? sl9Var.g : null, t6fVar.V1);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = sl9Var != null ? sl9Var.h : null;
        kzj kzjVar = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, c9cVar3, kzjVar, nl9.l);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, sl9Var != null ? sl9Var.i : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, sl9Var != null ? sl9Var.j : null, t6fVar.l3);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, sl9Var != null ? sl9Var.k : null, t6fVar.M3);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, sl9Var != null ? sl9Var.l : null, t6fVar.V3);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, sl9Var != null ? sl9Var.m : null, t6fVar.r7);
        c9c c9cVar4 = sl9Var != null ? sl9Var.n : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar4, s3fVar);
        c9c P5 = y2x.P(Y, jSONObject, "is_enabled", vct.a, d, sl9Var != null ? sl9Var.o : null, kzj.B, ns9Var);
        c9c N5 = y2x.N(Y, jSONObject, "layout_provider", d, sl9Var != null ? sl9Var.p : null, t6fVar.Z4);
        c9c N6 = y2x.N(Y, jSONObject, "margins", d, sl9Var != null ? sl9Var.q : null, t6fVar.i3);
        c9c P6 = y2x.P(Y, jSONObject, "max_value", ox8Var, d, sl9Var != null ? sl9Var.r : null, kzjVar, ns9Var);
        c9c P7 = y2x.P(Y, jSONObject, "min_value", ox8Var, d, sl9Var != null ? sl9Var.s : null, kzjVar, ns9Var);
        c9c N7 = y2x.N(Y, jSONObject, "paddings", d, sl9Var != null ? sl9Var.t : null, t6fVar.i3);
        c9c R6 = y2x.R(Y, jSONObject, "ranges", d, sl9Var != null ? sl9Var.u : null, t6fVar.D7);
        c9c P8 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, sl9Var != null ? sl9Var.v : null, s3fVar, ns9Var);
        c9c P9 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, sl9Var != null ? sl9Var.w : null, kzjVar, nl9.m);
        c9c N8 = y2x.N(Y, jSONObject, "secondary_value_accessibility", d, sl9Var != null ? sl9Var.x : null, t6fVar.I);
        c9c R7 = y2x.R(Y, jSONObject, "selected_actions", d, sl9Var != null ? sl9Var.y : null, t6fVar.u1);
        c9c N9 = y2x.N(Y, jSONObject, "thumb_secondary_style", d, sl9Var != null ? sl9Var.z : null, t6fVar.f3);
        c9c N10 = y2x.N(Y, jSONObject, "thumb_secondary_text_style", d, sl9Var != null ? sl9Var.A : null, t6fVar.A7);
        c9c O2 = y2x.O(Y, jSONObject, "thumb_secondary_value_variable", d, sl9Var != null ? sl9Var.B : null, s3fVar);
        c9c H = y2x.H(Y, jSONObject, "thumb_style", d, sl9Var != null ? sl9Var.C : null, t6fVar.f3);
        c9c N11 = y2x.N(Y, jSONObject, "thumb_text_style", d, sl9Var != null ? sl9Var.D : null, t6fVar.A7);
        c9c O3 = y2x.O(Y, jSONObject, "thumb_value_variable", d, sl9Var != null ? sl9Var.E : null, s3fVar);
        c9c N12 = y2x.N(Y, jSONObject, "tick_mark_active_style", d, sl9Var != null ? sl9Var.F : null, t6fVar.f3);
        c9c N13 = y2x.N(Y, jSONObject, "tick_mark_inactive_style", d, sl9Var != null ? sl9Var.G : null, t6fVar.f3);
        c9c R8 = y2x.R(Y, jSONObject, "tooltips", d, sl9Var != null ? sl9Var.H : null, t6fVar.o9);
        c9c H2 = y2x.H(Y, jSONObject, "track_active_style", d, sl9Var != null ? sl9Var.I : null, t6fVar.f3);
        c9c H3 = y2x.H(Y, jSONObject, "track_inactive_style", d, sl9Var != null ? sl9Var.J : null, t6fVar.f3);
        c9c N14 = y2x.N(Y, jSONObject, "transform", d, sl9Var != null ? sl9Var.K : null, t6fVar.r9);
        c9c R9 = y2x.R(Y, jSONObject, "transformations", d, sl9Var != null ? sl9Var.L : null, t6fVar.u9);
        c9c N15 = y2x.N(Y, jSONObject, "transition_change", d, sl9Var != null ? sl9Var.M : null, t6fVar.e2);
        c9c N16 = y2x.N(Y, jSONObject, "transition_in", d, sl9Var != null ? sl9Var.N : null, t6fVar.J1);
        c9c N17 = y2x.N(Y, jSONObject, "transition_out", d, sl9Var != null ? sl9Var.O : null, t6fVar.J1);
        c9c c9cVar5 = sl9Var != null ? sl9Var.P : null;
        y19 y19Var = nl9.n;
        y19Var.getClass();
        return new sl9(N, P, P2, P3, R, R2, N2, P4, R3, R4, N3, R5, N4, O, P5, N5, N6, P6, P7, N7, R6, P8, P9, N8, R7, N9, N10, O2, H, N11, O3, N12, N13, R8, H2, H3, N14, R9, N15, N16, N17, y2x.S(Y, jSONObject, d, c9cVar5, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, sl9Var != null ? sl9Var.Q : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, sl9Var != null ? sl9Var.R : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", nl9.j, d, sl9Var != null ? sl9Var.S : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, sl9Var != null ? sl9Var.T : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, sl9Var != null ? sl9Var.U : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, sl9Var != null ? sl9Var.V : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sl9 sl9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = sl9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.I;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, jyrVar);
        y2x.e0(sl9Var.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(sl9Var.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", sl9Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", sl9Var.e, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, sl9Var.f, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", sl9Var.g, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", sl9Var.h);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", sl9Var.i, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "extensions", sl9Var.j, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", sl9Var.k, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", sl9Var.l, t6fVar.V3);
        c9c c9cVar2 = sl9Var.m;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar2, jyrVar2);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, sl9Var.n);
        y2x.f0(t7kVar, jSONObject, "is_enabled", sl9Var.o);
        y2x.i0(t7kVar, jSONObject, "layout_provider", sl9Var.p, t6fVar.Z4);
        c9c c9cVar3 = sl9Var.q;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar3, jyrVar3);
        y2x.f0(t7kVar, jSONObject, "max_value", sl9Var.r);
        y2x.f0(t7kVar, jSONObject, "min_value", sl9Var.s);
        y2x.i0(t7kVar, jSONObject, "paddings", sl9Var.t, jyrVar3);
        y2x.k0(t7kVar, jSONObject, "ranges", sl9Var.u, t6fVar.D7);
        y2x.f0(t7kVar, jSONObject, "reuse_id", sl9Var.v);
        y2x.f0(t7kVar, jSONObject, "row_span", sl9Var.w);
        y2x.i0(t7kVar, jSONObject, "secondary_value_accessibility", sl9Var.x, jyrVar);
        y2x.k0(t7kVar, jSONObject, "selected_actions", sl9Var.y, t6fVar.u1);
        c9c c9cVar4 = sl9Var.z;
        jyr jyrVar4 = t6fVar.f3;
        y2x.i0(t7kVar, jSONObject, "thumb_secondary_style", c9cVar4, jyrVar4);
        c9c c9cVar5 = sl9Var.A;
        jyr jyrVar5 = t6fVar.A7;
        y2x.i0(t7kVar, jSONObject, "thumb_secondary_text_style", c9cVar5, jyrVar5);
        y2x.h0(t7kVar, jSONObject, "thumb_secondary_value_variable", sl9Var.B);
        y2x.i0(t7kVar, jSONObject, "thumb_style", sl9Var.C, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "thumb_text_style", sl9Var.D, jyrVar5);
        y2x.h0(t7kVar, jSONObject, "thumb_value_variable", sl9Var.E);
        y2x.i0(t7kVar, jSONObject, "tick_mark_active_style", sl9Var.F, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "tick_mark_inactive_style", sl9Var.G, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "tooltips", sl9Var.H, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "track_active_style", sl9Var.I, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "track_inactive_style", sl9Var.J, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transform", sl9Var.K, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", sl9Var.L, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", sl9Var.M, t6fVar.e2);
        c9c c9cVar6 = sl9Var.N;
        jyr jyrVar6 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar6, jyrVar6);
        y2x.i0(t7kVar, jSONObject, "transition_out", sl9Var.O, jyrVar6);
        y2x.j0(t7kVar, jSONObject, sl9Var.P);
        etn.l0(t7kVar, jSONObject, "type", "slider");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", sl9Var.Q, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", sl9Var.R, t6fVar.J9);
        y2x.e0(sl9Var.S, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar7 = sl9Var.T;
        jyr jyrVar7 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar7, jyrVar7);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", sl9Var.U, jyrVar7);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, sl9Var.V, jyrVar2);
        return jSONObject;
    }
}
