package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p59 implements gip, r8s {
    public final t6f a;

    public p59(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final h69 c(t7k t7kVar, h69 h69Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = h69Var != null ? h69Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = r59.q;
        c9c c9cVar2 = h69Var != null ? h69Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        tct tctVar2 = r59.r;
        c9c c9cVar3 = h69Var != null ? h69Var.c : null;
        va8 va8Var2 = va8.z0;
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", tctVar2, d, c9cVar3, va8Var2, ns9Var);
        ox8 ox8Var = vct.d;
        c9c c9cVar4 = h69Var != null ? h69Var.d : null;
        kzj kzjVar = kzj.E;
        c9c P3 = y2x.P(Y, jSONObject, "alpha", ox8Var, d, c9cVar4, kzjVar, r59.A);
        c9c R = y2x.R(Y, jSONObject, "animators", d, h69Var != null ? h69Var.e : null, t6fVar.D1);
        c9c P4 = y2x.P(Y, jSONObject, "autocapitalization", r59.s, d, h69Var != null ? h69Var.f : null, p19.x0, ns9Var);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, h69Var != null ? h69Var.g : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, h69Var != null ? h69Var.h : null, t6fVar.V1);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar5 = h69Var != null ? h69Var.i : null;
        kzj kzjVar2 = kzj.F;
        c9c P5 = y2x.P(Y, jSONObject, "column_span", ox8Var2, d, c9cVar5, kzjVar2, r59.B);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, h69Var != null ? h69Var.j : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "enter_key_actions", d, h69Var != null ? h69Var.k : null, t6fVar.u1);
        c9c P6 = y2x.P(Y, jSONObject, "enter_key_type", r59.t, d, h69Var != null ? h69Var.l : null, p19.z0, ns9Var);
        c9c R5 = y2x.R(Y, jSONObject, "extensions", d, h69Var != null ? h69Var.m : null, t6fVar.l3);
        c9c R6 = y2x.R(Y, jSONObject, "filters", d, h69Var != null ? h69Var.n : null, t6fVar.C4);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, h69Var != null ? h69Var.o : null, t6fVar.M3);
        ox8 ox8Var3 = vct.c;
        c9c c9cVar6 = h69Var != null ? h69Var.p : null;
        s3f s3fVar = bcx.i;
        c9c P7 = y2x.P(Y, jSONObject, "font_family", ox8Var3, d, c9cVar6, s3fVar, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "font_size", ox8Var2, d, h69Var != null ? h69Var.q : null, kzjVar2, r59.C);
        c9c P9 = y2x.P(Y, jSONObject, "font_size_unit", r59.u, d, h69Var != null ? h69Var.r : null, gd9.w0, ns9Var);
        c9c P10 = y2x.P(Y, jSONObject, "font_variation_settings", vct.h, d, h69Var != null ? h69Var.s : null, s3fVar, ns9Var);
        c9c P11 = y2x.P(Y, jSONObject, "font_weight", r59.v, d, h69Var != null ? h69Var.t : null, vv8.B, ns9Var);
        c9c P12 = y2x.P(Y, jSONObject, "font_weight_value", ox8Var2, d, h69Var != null ? h69Var.u : null, kzjVar2, r59.D);
        c9c R7 = y2x.R(Y, jSONObject, "functions", d, h69Var != null ? h69Var.v : null, t6fVar.V3);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, h69Var != null ? h69Var.w : null, t6fVar.r7);
        ox8 ox8Var4 = vct.f;
        c9c c9cVar7 = h69Var != null ? h69Var.x : null;
        kzj kzjVar3 = kzj.G;
        c9c P13 = y2x.P(Y, jSONObject, "highlight_color", ox8Var4, d, c9cVar7, kzjVar3, ns9Var);
        c9c P14 = y2x.P(Y, jSONObject, "hint_color", ox8Var4, d, h69Var != null ? h69Var.y : null, kzjVar3, ns9Var);
        c9c P15 = y2x.P(Y, jSONObject, "hint_text", ox8Var3, d, h69Var != null ? h69Var.z : null, s3fVar, ns9Var);
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, h69Var != null ? h69Var.A : null, s3fVar);
        ox8 ox8Var5 = vct.a;
        c9c c9cVar8 = h69Var != null ? h69Var.B : null;
        kzj kzjVar4 = kzj.B;
        c9c P16 = y2x.P(Y, jSONObject, "is_enabled", ox8Var5, d, c9cVar8, kzjVar4, ns9Var);
        c9c P17 = y2x.P(Y, jSONObject, "keyboard_type", r59.w, d, h69Var != null ? h69Var.C : null, p19.B0, ns9Var);
        c9c N5 = y2x.N(Y, jSONObject, "layout_provider", d, h69Var != null ? h69Var.D : null, t6fVar.Z4);
        c9c P18 = y2x.P(Y, jSONObject, "letter_spacing", ox8Var, d, h69Var != null ? h69Var.E : null, kzjVar, ns9Var);
        c9c P19 = y2x.P(Y, jSONObject, "line_height", ox8Var2, d, h69Var != null ? h69Var.F : null, kzjVar2, r59.E);
        c9c N6 = y2x.N(Y, jSONObject, "margins", d, h69Var != null ? h69Var.G : null, t6fVar.i3);
        c9c N7 = y2x.N(Y, jSONObject, "mask", d, h69Var != null ? h69Var.H : null, t6fVar.F4);
        c9c P20 = y2x.P(Y, jSONObject, "max_length", ox8Var2, d, h69Var != null ? h69Var.I : null, kzjVar2, r59.F);
        c9c P21 = y2x.P(Y, jSONObject, "max_visible_lines", ox8Var2, d, h69Var != null ? h69Var.J : null, kzjVar2, r59.G);
        c9c N8 = y2x.N(Y, jSONObject, "native_interface", d, h69Var != null ? h69Var.K : null, t6fVar.W4);
        c9c N9 = y2x.N(Y, jSONObject, "paddings", d, h69Var != null ? h69Var.L : null, t6fVar.i3);
        c9c P22 = y2x.P(Y, jSONObject, "reuse_id", ox8Var3, d, h69Var != null ? h69Var.M : null, s3fVar, ns9Var);
        c9c P23 = y2x.P(Y, jSONObject, "row_span", ox8Var2, d, h69Var != null ? h69Var.N : null, kzjVar2, r59.H);
        c9c P24 = y2x.P(Y, jSONObject, "select_all_on_focus", ox8Var5, d, h69Var != null ? h69Var.O : null, kzjVar4, ns9Var);
        c9c R8 = y2x.R(Y, jSONObject, "selected_actions", d, h69Var != null ? h69Var.P : null, t6fVar.u1);
        c9c P25 = y2x.P(Y, jSONObject, "text_alignment_horizontal", r59.x, d, h69Var != null ? h69Var.Q : null, va8Var, ns9Var);
        c9c P26 = y2x.P(Y, jSONObject, "text_alignment_vertical", r59.y, d, h69Var != null ? h69Var.R : null, va8Var2, ns9Var);
        c9c P27 = y2x.P(Y, jSONObject, "text_color", ox8Var4, d, h69Var != null ? h69Var.S : null, kzjVar3, ns9Var);
        c9c G = y2x.G(Y, jSONObject, "text_variable", d, h69Var != null ? h69Var.T : null);
        c9c R9 = y2x.R(Y, jSONObject, "tooltips", d, h69Var != null ? h69Var.U : null, t6fVar.o9);
        c9c N10 = y2x.N(Y, jSONObject, "transform", d, h69Var != null ? h69Var.V : null, t6fVar.r9);
        c9c R10 = y2x.R(Y, jSONObject, "transformations", d, h69Var != null ? h69Var.W : null, t6fVar.u9);
        c9c N11 = y2x.N(Y, jSONObject, "transition_change", d, h69Var != null ? h69Var.X : null, t6fVar.e2);
        c9c N12 = y2x.N(Y, jSONObject, "transition_in", d, h69Var != null ? h69Var.Y : null, t6fVar.J1);
        c9c N13 = y2x.N(Y, jSONObject, "transition_out", d, h69Var != null ? h69Var.Z : null, t6fVar.J1);
        c9c c9cVar9 = h69Var != null ? h69Var.a0 : null;
        y19 y19Var = r59.I;
        y19Var.getClass();
        return new h69(N, P, P2, P3, R, P4, R2, N2, P5, R3, R4, P6, R5, R6, N3, P7, P8, P9, P10, P11, P12, R7, N4, P13, P14, P15, O, P16, P17, N5, P18, P19, N6, N7, P20, P21, N8, N9, P22, P23, P24, R8, P25, P26, P27, G, R9, N10, R10, N11, N12, N13, y2x.S(Y, jSONObject, d, c9cVar9, y19Var), y2x.R(Y, jSONObject, "validators", d, h69Var != null ? h69Var.b0 : null, t6fVar.Q4), y2x.R(Y, jSONObject, "variable_triggers", d, h69Var != null ? h69Var.c0 : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, h69Var != null ? h69Var.d0 : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", r59.z, d, h69Var != null ? h69Var.e0 : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, h69Var != null ? h69Var.f0 : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, h69Var != null ? h69Var.g0 : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, h69Var != null ? h69Var.h0 : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, h69 h69Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = h69Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = h69Var.b;
        va8 va8Var = va8.y0;
        y2x.e0(c9cVar2, t7kVar, "alignment_horizontal", va8Var, jSONObject);
        c9c c9cVar3 = h69Var.c;
        va8 va8Var2 = va8.A0;
        y2x.e0(c9cVar3, t7kVar, "alignment_vertical", va8Var2, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", h69Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", h69Var.e, t6fVar.D1);
        y2x.e0(h69Var.f, t7kVar, "autocapitalization", p19.y0, jSONObject);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, h69Var.g, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", h69Var.h, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", h69Var.i);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", h69Var.j, t6fVar.Z2);
        c9c c9cVar4 = h69Var.k;
        jyr jyrVar = t6fVar.u1;
        y2x.k0(t7kVar, jSONObject, "enter_key_actions", c9cVar4, jyrVar);
        y2x.e0(h69Var.l, t7kVar, "enter_key_type", p19.A0, jSONObject);
        y2x.k0(t7kVar, jSONObject, "extensions", h69Var.m, t6fVar.l3);
        y2x.k0(t7kVar, jSONObject, "filters", h69Var.n, t6fVar.C4);
        y2x.i0(t7kVar, jSONObject, "focus", h69Var.o, t6fVar.M3);
        y2x.f0(t7kVar, jSONObject, "font_family", h69Var.p);
        y2x.f0(t7kVar, jSONObject, "font_size", h69Var.q);
        y2x.e0(h69Var.r, t7kVar, "font_size_unit", gd9.x0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_variation_settings", h69Var.s);
        y2x.e0(h69Var.t, t7kVar, "font_weight", vv8.C, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_weight_value", h69Var.u);
        y2x.k0(t7kVar, jSONObject, "functions", h69Var.v, t6fVar.V3);
        c9c c9cVar5 = h69Var.w;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar5, jyrVar2);
        c9c c9cVar6 = h69Var.x;
        kzj kzjVar = kzj.D;
        y2x.e0(c9cVar6, t7kVar, "highlight_color", kzjVar, jSONObject);
        y2x.e0(h69Var.y, t7kVar, "hint_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "hint_text", h69Var.z);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, h69Var.A);
        y2x.f0(t7kVar, jSONObject, "is_enabled", h69Var.B);
        y2x.e0(h69Var.C, t7kVar, "keyboard_type", i49.s, jSONObject);
        y2x.i0(t7kVar, jSONObject, "layout_provider", h69Var.D, t6fVar.Z4);
        y2x.f0(t7kVar, jSONObject, "letter_spacing", h69Var.E);
        y2x.f0(t7kVar, jSONObject, "line_height", h69Var.F);
        c9c c9cVar7 = h69Var.G;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar7, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "mask", h69Var.H, t6fVar.F4);
        y2x.f0(t7kVar, jSONObject, "max_length", h69Var.I);
        y2x.f0(t7kVar, jSONObject, "max_visible_lines", h69Var.J);
        y2x.i0(t7kVar, jSONObject, "native_interface", h69Var.K, t6fVar.W4);
        y2x.i0(t7kVar, jSONObject, "paddings", h69Var.L, jyrVar3);
        y2x.f0(t7kVar, jSONObject, "reuse_id", h69Var.M);
        y2x.f0(t7kVar, jSONObject, "row_span", h69Var.N);
        y2x.f0(t7kVar, jSONObject, "select_all_on_focus", h69Var.O);
        y2x.k0(t7kVar, jSONObject, "selected_actions", h69Var.P, jyrVar);
        y2x.e0(h69Var.Q, t7kVar, "text_alignment_horizontal", va8Var, jSONObject);
        y2x.e0(h69Var.R, t7kVar, "text_alignment_vertical", va8Var2, jSONObject);
        y2x.e0(h69Var.S, t7kVar, "text_color", kzjVar, jSONObject);
        y2x.h0(t7kVar, jSONObject, "text_variable", h69Var.T);
        y2x.k0(t7kVar, jSONObject, "tooltips", h69Var.U, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", h69Var.V, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", h69Var.W, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", h69Var.X, t6fVar.e2);
        c9c c9cVar8 = h69Var.Y;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar8, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", h69Var.Z, jyrVar4);
        y2x.j0(t7kVar, jSONObject, h69Var.a0);
        etn.l0(t7kVar, jSONObject, "type", "input");
        y2x.k0(t7kVar, jSONObject, "validators", h69Var.b0, t6fVar.Q4);
        y2x.k0(t7kVar, jSONObject, "variable_triggers", h69Var.c0, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", h69Var.d0, t6fVar.J9);
        y2x.e0(h69Var.e0, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar9 = h69Var.f0;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar9, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", h69Var.g0, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, h69Var.h0, jyrVar2);
        return jSONObject;
    }
}
