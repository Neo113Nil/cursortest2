package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hi9 implements gip, r8s {
    public final t6f a;

    public hi9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final ni9 c(t7k t7kVar, ni9 ni9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = ni9Var != null ? ni9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = ji9.j;
        c9c c9cVar2 = ni9Var != null ? ni9Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", ji9.k, d, ni9Var != null ? ni9Var.c : null, va8.z0, ns9Var);
        ox8 ox8Var = vct.d;
        c9c c9cVar3 = ni9Var != null ? ni9Var.d : null;
        kzj kzjVar = kzj.E;
        c9c P3 = y2x.P(Y, jSONObject, "alpha", ox8Var, d, c9cVar3, kzjVar, ji9.o);
        c9c R = y2x.R(Y, jSONObject, "animators", d, ni9Var != null ? ni9Var.e : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, ni9Var != null ? ni9Var.f : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, ni9Var != null ? ni9Var.g : null, t6fVar.V1);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar4 = ni9Var != null ? ni9Var.h : null;
        kzj kzjVar2 = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "column_span", ox8Var2, d, c9cVar4, kzjVar2, ji9.p);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, ni9Var != null ? ni9Var.i : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, ni9Var != null ? ni9Var.j : null, t6fVar.l3);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, ni9Var != null ? ni9Var.k : null, t6fVar.M3);
        ox8 ox8Var3 = vct.c;
        c9c c9cVar5 = ni9Var != null ? ni9Var.l : null;
        s3f s3fVar = bcx.i;
        c9c P5 = y2x.P(Y, jSONObject, "font_family", ox8Var3, d, c9cVar5, s3fVar, ns9Var);
        c9c P6 = y2x.P(Y, jSONObject, "font_size", ox8Var2, d, ni9Var != null ? ni9Var.m : null, kzjVar2, ji9.q);
        c9c P7 = y2x.P(Y, jSONObject, "font_size_unit", ji9.l, d, ni9Var != null ? ni9Var.n : null, gd9.w0, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "font_variation_settings", vct.h, d, ni9Var != null ? ni9Var.o : null, s3fVar, ns9Var);
        c9c P9 = y2x.P(Y, jSONObject, "font_weight", ji9.m, d, ni9Var != null ? ni9Var.p : null, vv8.B, ns9Var);
        c9c P10 = y2x.P(Y, jSONObject, "font_weight_value", ox8Var2, d, ni9Var != null ? ni9Var.q : null, kzjVar2, ji9.r);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, ni9Var != null ? ni9Var.r : null, t6fVar.V3);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, ni9Var != null ? ni9Var.s : null, t6fVar.r7);
        ox8 ox8Var4 = vct.f;
        c9c c9cVar6 = ni9Var != null ? ni9Var.t : null;
        kzj kzjVar3 = kzj.G;
        c9c P11 = y2x.P(Y, jSONObject, "hint_color", ox8Var4, d, c9cVar6, kzjVar3, ns9Var);
        c9c P12 = y2x.P(Y, jSONObject, "hint_text", ox8Var3, d, ni9Var != null ? ni9Var.u : null, s3fVar, ns9Var);
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, ni9Var != null ? ni9Var.v : null, s3fVar);
        c9c N5 = y2x.N(Y, jSONObject, "layout_provider", d, ni9Var != null ? ni9Var.w : null, t6fVar.Z4);
        c9c P13 = y2x.P(Y, jSONObject, "letter_spacing", ox8Var, d, ni9Var != null ? ni9Var.x : null, kzjVar, ns9Var);
        c9c P14 = y2x.P(Y, jSONObject, "line_height", ox8Var2, d, ni9Var != null ? ni9Var.y : null, kzjVar2, ji9.s);
        c9c N6 = y2x.N(Y, jSONObject, "margins", d, ni9Var != null ? ni9Var.z : null, t6fVar.i3);
        c9c c9cVar7 = ni9Var != null ? ni9Var.A : null;
        jyr jyrVar = t6fVar.W6;
        y19 y19Var = ji9.t;
        y19Var.getClass();
        c9c L = y2x.L(Y, jSONObject, "options", d, c9cVar7, jyrVar, y19Var);
        c9c N7 = y2x.N(Y, jSONObject, "paddings", d, ni9Var != null ? ni9Var.B : null, t6fVar.i3);
        c9c P15 = y2x.P(Y, jSONObject, "reuse_id", ox8Var3, d, ni9Var != null ? ni9Var.C : null, s3fVar, ns9Var);
        c9c P16 = y2x.P(Y, jSONObject, "row_span", ox8Var2, d, ni9Var != null ? ni9Var.D : null, kzjVar2, ji9.u);
        c9c R6 = y2x.R(Y, jSONObject, "selected_actions", d, ni9Var != null ? ni9Var.E : null, t6fVar.u1);
        c9c P17 = y2x.P(Y, jSONObject, "text_color", ox8Var4, d, ni9Var != null ? ni9Var.F : null, kzjVar3, ns9Var);
        c9c R7 = y2x.R(Y, jSONObject, "tooltips", d, ni9Var != null ? ni9Var.G : null, t6fVar.o9);
        c9c N8 = y2x.N(Y, jSONObject, "transform", d, ni9Var != null ? ni9Var.H : null, t6fVar.r9);
        c9c R8 = y2x.R(Y, jSONObject, "transformations", d, ni9Var != null ? ni9Var.I : null, t6fVar.u9);
        c9c N9 = y2x.N(Y, jSONObject, "transition_change", d, ni9Var != null ? ni9Var.J : null, t6fVar.e2);
        c9c N10 = y2x.N(Y, jSONObject, "transition_in", d, ni9Var != null ? ni9Var.K : null, t6fVar.J1);
        c9c N11 = y2x.N(Y, jSONObject, "transition_out", d, ni9Var != null ? ni9Var.L : null, t6fVar.J1);
        c9c c9cVar8 = ni9Var != null ? ni9Var.M : null;
        y19 y19Var2 = ji9.v;
        y19Var2.getClass();
        return new ni9(N, P, P2, P3, R, R2, N2, P4, R3, R4, N3, P5, P6, P7, P8, P9, P10, R5, N4, P11, P12, O, N5, P13, P14, N6, L, N7, P15, P16, R6, P17, R7, N8, R8, N9, N10, N11, y2x.S(Y, jSONObject, d, c9cVar8, y19Var2), y2x.G(Y, jSONObject, "value_variable", d, ni9Var != null ? ni9Var.N : null), y2x.R(Y, jSONObject, "variable_triggers", d, ni9Var != null ? ni9Var.O : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, ni9Var != null ? ni9Var.P : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", ji9.n, d, ni9Var != null ? ni9Var.Q : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, ni9Var != null ? ni9Var.R : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, ni9Var != null ? ni9Var.S : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, ni9Var != null ? ni9Var.T : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ni9 ni9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = ni9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        y2x.e0(ni9Var.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(ni9Var.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", ni9Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", ni9Var.e, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, ni9Var.f, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", ni9Var.g, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", ni9Var.h);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", ni9Var.i, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "extensions", ni9Var.j, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", ni9Var.k, t6fVar.M3);
        y2x.f0(t7kVar, jSONObject, "font_family", ni9Var.l);
        y2x.f0(t7kVar, jSONObject, "font_size", ni9Var.m);
        y2x.e0(ni9Var.n, t7kVar, "font_size_unit", gd9.x0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_variation_settings", ni9Var.o);
        y2x.e0(ni9Var.p, t7kVar, "font_weight", vv8.C, jSONObject);
        y2x.f0(t7kVar, jSONObject, "font_weight_value", ni9Var.q);
        y2x.k0(t7kVar, jSONObject, "functions", ni9Var.r, t6fVar.V3);
        c9c c9cVar2 = ni9Var.s;
        jyr jyrVar = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar2, jyrVar);
        c9c c9cVar3 = ni9Var.t;
        kzj kzjVar = kzj.D;
        y2x.e0(c9cVar3, t7kVar, "hint_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "hint_text", ni9Var.u);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ni9Var.v);
        y2x.i0(t7kVar, jSONObject, "layout_provider", ni9Var.w, t6fVar.Z4);
        y2x.f0(t7kVar, jSONObject, "letter_spacing", ni9Var.x);
        y2x.f0(t7kVar, jSONObject, "line_height", ni9Var.y);
        c9c c9cVar4 = ni9Var.z;
        jyr jyrVar2 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar4, jyrVar2);
        y2x.k0(t7kVar, jSONObject, "options", ni9Var.A, t6fVar.W6);
        y2x.i0(t7kVar, jSONObject, "paddings", ni9Var.B, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "reuse_id", ni9Var.C);
        y2x.f0(t7kVar, jSONObject, "row_span", ni9Var.D);
        y2x.k0(t7kVar, jSONObject, "selected_actions", ni9Var.E, t6fVar.u1);
        y2x.e0(ni9Var.F, t7kVar, "text_color", kzjVar, jSONObject);
        y2x.k0(t7kVar, jSONObject, "tooltips", ni9Var.G, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", ni9Var.H, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", ni9Var.I, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", ni9Var.J, t6fVar.e2);
        c9c c9cVar5 = ni9Var.K;
        jyr jyrVar3 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar5, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "transition_out", ni9Var.L, jyrVar3);
        y2x.j0(t7kVar, jSONObject, ni9Var.M);
        etn.l0(t7kVar, jSONObject, "type", "select");
        y2x.h0(t7kVar, jSONObject, "value_variable", ni9Var.N);
        y2x.k0(t7kVar, jSONObject, "variable_triggers", ni9Var.O, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", ni9Var.P, t6fVar.J9);
        y2x.e0(ni9Var.Q, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar6 = ni9Var.R;
        jyr jyrVar4 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar6, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", ni9Var.S, jyrVar4);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, ni9Var.T, jyrVar);
        return jSONObject;
    }
}
