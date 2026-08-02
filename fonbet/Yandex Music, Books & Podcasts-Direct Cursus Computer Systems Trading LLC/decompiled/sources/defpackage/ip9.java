package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ip9 implements gip, r8s {
    public final t6f a;

    public ip9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final vp9 c(t7k t7kVar, vp9 vp9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = vp9Var != null ? vp9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = kp9.m;
        c9c c9cVar2 = vp9Var != null ? vp9Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", kp9.n, d, vp9Var != null ? vp9Var.c : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, vp9Var != null ? vp9Var.d : null, kzj.E, kp9.p);
        c9c R = y2x.R(Y, jSONObject, "animators", d, vp9Var != null ? vp9Var.e : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, vp9Var != null ? vp9Var.f : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, vp9Var != null ? vp9Var.g : null, t6fVar.V1);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = vp9Var != null ? vp9Var.h : null;
        kzj kzjVar = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, c9cVar3, kzjVar, kp9.q);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, vp9Var != null ? vp9Var.i : null, t6fVar.Z2);
        ox8 ox8Var2 = vct.a;
        c9c c9cVar4 = vp9Var != null ? vp9Var.j : null;
        kzj kzjVar2 = kzj.B;
        c9c P5 = y2x.P(Y, jSONObject, "dynamic_height", ox8Var2, d, c9cVar4, kzjVar2, ns9Var);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, vp9Var != null ? vp9Var.k : null, t6fVar.l3);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, vp9Var != null ? vp9Var.l : null, t6fVar.M3);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, vp9Var != null ? vp9Var.m : null, t6fVar.V3);
        c9c P6 = y2x.P(Y, jSONObject, "has_separator", ox8Var2, d, vp9Var != null ? vp9Var.n : null, kzjVar2, ns9Var);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, vp9Var != null ? vp9Var.o : null, t6fVar.r7);
        c9c c9cVar5 = vp9Var != null ? vp9Var.p : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar5, s3fVar);
        c9c c9cVar6 = vp9Var != null ? vp9Var.q : null;
        jyr jyrVar = t6fVar.q8;
        y19 y19Var = kp9.r;
        y19Var.getClass();
        c9c L = y2x.L(Y, jSONObject, "items", d, c9cVar6, jyrVar, y19Var);
        c9c N5 = y2x.N(Y, jSONObject, "layout_provider", d, vp9Var != null ? vp9Var.r : null, t6fVar.Z4);
        c9c N6 = y2x.N(Y, jSONObject, "margins", d, vp9Var != null ? vp9Var.s : null, t6fVar.i3);
        c9c N7 = y2x.N(Y, jSONObject, "paddings", d, vp9Var != null ? vp9Var.t : null, t6fVar.i3);
        c9c P7 = y2x.P(Y, jSONObject, "restrict_parent_scroll", ox8Var2, d, vp9Var != null ? vp9Var.u : null, kzjVar2, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, vp9Var != null ? vp9Var.v : null, s3fVar, ns9Var);
        c9c P9 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, vp9Var != null ? vp9Var.w : null, kzjVar, kp9.s);
        c9c R6 = y2x.R(Y, jSONObject, "selected_actions", d, vp9Var != null ? vp9Var.x : null, t6fVar.u1);
        c9c P10 = y2x.P(Y, jSONObject, "selected_tab", ox8Var, d, vp9Var != null ? vp9Var.y : null, kzjVar, kp9.t);
        c9c P11 = y2x.P(Y, jSONObject, "separator_color", vct.f, d, vp9Var != null ? vp9Var.z : null, kzj.G, ns9Var);
        c9c N8 = y2x.N(Y, jSONObject, "separator_paddings", d, vp9Var != null ? vp9Var.A : null, t6fVar.i3);
        c9c P12 = y2x.P(Y, jSONObject, "switch_tabs_by_content_swipe_enabled", ox8Var2, d, vp9Var != null ? vp9Var.B : null, kzjVar2, ns9Var);
        c9c N9 = y2x.N(Y, jSONObject, "tab_title_delimiter", d, vp9Var != null ? vp9Var.C : null, t6fVar.n8);
        c9c N10 = y2x.N(Y, jSONObject, "tab_title_style", d, vp9Var != null ? vp9Var.D : null, t6fVar.k8);
        c9c N11 = y2x.N(Y, jSONObject, "title_paddings", d, vp9Var != null ? vp9Var.E : null, t6fVar.i3);
        c9c R7 = y2x.R(Y, jSONObject, "tooltips", d, vp9Var != null ? vp9Var.F : null, t6fVar.o9);
        c9c N12 = y2x.N(Y, jSONObject, "transform", d, vp9Var != null ? vp9Var.G : null, t6fVar.r9);
        c9c R8 = y2x.R(Y, jSONObject, "transformations", d, vp9Var != null ? vp9Var.H : null, t6fVar.u9);
        c9c N13 = y2x.N(Y, jSONObject, "transition_change", d, vp9Var != null ? vp9Var.I : null, t6fVar.e2);
        c9c N14 = y2x.N(Y, jSONObject, "transition_in", d, vp9Var != null ? vp9Var.J : null, t6fVar.J1);
        c9c N15 = y2x.N(Y, jSONObject, "transition_out", d, vp9Var != null ? vp9Var.K : null, t6fVar.J1);
        c9c c9cVar7 = vp9Var != null ? vp9Var.L : null;
        y19 y19Var2 = kp9.u;
        y19Var2.getClass();
        return new vp9(N, P, P2, P3, R, R2, N2, P4, R3, P5, R4, N3, R5, P6, N4, O, L, N5, N6, N7, P7, P8, P9, R6, P10, P11, N8, P12, N9, N10, N11, R7, N12, R8, N13, N14, N15, y2x.S(Y, jSONObject, d, c9cVar7, y19Var2), y2x.R(Y, jSONObject, "variable_triggers", d, vp9Var != null ? vp9Var.M : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, vp9Var != null ? vp9Var.N : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", kp9.o, d, vp9Var != null ? vp9Var.O : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, vp9Var != null ? vp9Var.P : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, vp9Var != null ? vp9Var.Q : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, vp9Var != null ? vp9Var.R : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, vp9 vp9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = vp9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        y2x.e0(vp9Var.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(vp9Var.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", vp9Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", vp9Var.e, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, vp9Var.f, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", vp9Var.g, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", vp9Var.h);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", vp9Var.i, t6fVar.Z2);
        y2x.f0(t7kVar, jSONObject, "dynamic_height", vp9Var.j);
        y2x.k0(t7kVar, jSONObject, "extensions", vp9Var.k, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", vp9Var.l, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", vp9Var.m, t6fVar.V3);
        y2x.f0(t7kVar, jSONObject, "has_separator", vp9Var.n);
        c9c c9cVar2 = vp9Var.o;
        jyr jyrVar = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar2, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vp9Var.p);
        y2x.k0(t7kVar, jSONObject, "items", vp9Var.q, t6fVar.q8);
        y2x.i0(t7kVar, jSONObject, "layout_provider", vp9Var.r, t6fVar.Z4);
        c9c c9cVar3 = vp9Var.s;
        jyr jyrVar2 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar3, jyrVar2);
        y2x.i0(t7kVar, jSONObject, "paddings", vp9Var.t, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "restrict_parent_scroll", vp9Var.u);
        y2x.f0(t7kVar, jSONObject, "reuse_id", vp9Var.v);
        y2x.f0(t7kVar, jSONObject, "row_span", vp9Var.w);
        y2x.k0(t7kVar, jSONObject, "selected_actions", vp9Var.x, t6fVar.u1);
        y2x.f0(t7kVar, jSONObject, "selected_tab", vp9Var.y);
        y2x.e0(vp9Var.z, t7kVar, "separator_color", kzj.D, jSONObject);
        y2x.i0(t7kVar, jSONObject, "separator_paddings", vp9Var.A, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "switch_tabs_by_content_swipe_enabled", vp9Var.B);
        y2x.i0(t7kVar, jSONObject, "tab_title_delimiter", vp9Var.C, t6fVar.n8);
        y2x.i0(t7kVar, jSONObject, "tab_title_style", vp9Var.D, t6fVar.k8);
        y2x.i0(t7kVar, jSONObject, "title_paddings", vp9Var.E, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "tooltips", vp9Var.F, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", vp9Var.G, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", vp9Var.H, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", vp9Var.I, t6fVar.e2);
        c9c c9cVar4 = vp9Var.J;
        jyr jyrVar3 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar4, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "transition_out", vp9Var.K, jyrVar3);
        y2x.j0(t7kVar, jSONObject, vp9Var.L);
        etn.l0(t7kVar, jSONObject, "type", "tabs");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", vp9Var.M, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", vp9Var.N, t6fVar.J9);
        y2x.e0(vp9Var.O, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar5 = vp9Var.P;
        jyr jyrVar4 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar5, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", vp9Var.Q, jyrVar4);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, vp9Var.R, jyrVar);
        return jSONObject;
    }
}
