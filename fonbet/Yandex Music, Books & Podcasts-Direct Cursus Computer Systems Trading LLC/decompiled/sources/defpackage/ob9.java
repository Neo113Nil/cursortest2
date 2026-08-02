package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ob9 implements gip, r8s {
    public final t6f a;

    public ob9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final ic9 c(t7k t7kVar, ic9 ic9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = ic9Var != null ? ic9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = qb9.l;
        c9c c9cVar2 = ic9Var != null ? ic9Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", qb9.m, d, ic9Var != null ? ic9Var.c : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, ic9Var != null ? ic9Var.d : null, kzj.E, qb9.r);
        c9c R = y2x.R(Y, jSONObject, "animators", d, ic9Var != null ? ic9Var.e : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, ic9Var != null ? ic9Var.f : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, ic9Var != null ? ic9Var.g : null, t6fVar.V1);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = ic9Var != null ? ic9Var.h : null;
        kzj kzjVar = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, c9cVar3, kzjVar, qb9.s);
        tct tctVar2 = qb9.n;
        c9c c9cVar4 = ic9Var != null ? ic9Var.i : null;
        i49 i49Var = i49.J;
        c9c P5 = y2x.P(Y, jSONObject, "cross_axis_alignment", tctVar2, d, c9cVar4, i49Var, ns9Var);
        c9c P6 = y2x.P(Y, jSONObject, "default_item", ox8Var, d, ic9Var != null ? ic9Var.j : null, kzjVar, qb9.t);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, ic9Var != null ? ic9Var.k : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, ic9Var != null ? ic9Var.l : null, t6fVar.l3);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, ic9Var != null ? ic9Var.m : null, t6fVar.M3);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, ic9Var != null ? ic9Var.n : null, t6fVar.V3);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, ic9Var != null ? ic9Var.o : null, t6fVar.r7);
        c9c c9cVar5 = ic9Var != null ? ic9Var.p : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar5, s3fVar);
        ox8 ox8Var2 = vct.a;
        c9c c9cVar6 = ic9Var != null ? ic9Var.q : null;
        kzj kzjVar2 = kzj.B;
        c9c P7 = y2x.P(Y, jSONObject, "infinite_scroll", ox8Var2, d, c9cVar6, kzjVar2, ns9Var);
        c9c N5 = y2x.N(Y, jSONObject, "item_builder", d, ic9Var != null ? ic9Var.r : null, t6fVar.n2);
        c9c N6 = y2x.N(Y, jSONObject, "item_spacing", d, ic9Var != null ? ic9Var.s : null, t6fVar.G3);
        c9c R6 = y2x.R(Y, jSONObject, "items", d, ic9Var != null ? ic9Var.t : null, t6fVar.ba);
        c9c H = y2x.H(Y, jSONObject, "layout_mode", d, ic9Var != null ? ic9Var.u : null, t6fVar.J5);
        c9c N7 = y2x.N(Y, jSONObject, "layout_provider", d, ic9Var != null ? ic9Var.v : null, t6fVar.Z4);
        c9c N8 = y2x.N(Y, jSONObject, "margins", d, ic9Var != null ? ic9Var.w : null, t6fVar.i3);
        c9c P8 = y2x.P(Y, jSONObject, "orientation", qb9.o, d, ic9Var != null ? ic9Var.x : null, i49.L, ns9Var);
        c9c N9 = y2x.N(Y, jSONObject, "paddings", d, ic9Var != null ? ic9Var.y : null, t6fVar.i3);
        c9c N10 = y2x.N(Y, jSONObject, "page_transformation", d, ic9Var != null ? ic9Var.z : null, t6fVar.G5);
        c9c P9 = y2x.P(Y, jSONObject, "restrict_parent_scroll", ox8Var2, d, ic9Var != null ? ic9Var.A : null, kzjVar2, ns9Var);
        c9c P10 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, ic9Var != null ? ic9Var.B : null, s3fVar, ns9Var);
        c9c P11 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, ic9Var != null ? ic9Var.C : null, kzjVar, qb9.u);
        c9c P12 = y2x.P(Y, jSONObject, "scroll_axis_alignment", qb9.p, d, ic9Var != null ? ic9Var.D : null, i49Var, ns9Var);
        c9c R7 = y2x.R(Y, jSONObject, "selected_actions", d, ic9Var != null ? ic9Var.E : null, t6fVar.u1);
        c9c R8 = y2x.R(Y, jSONObject, "tooltips", d, ic9Var != null ? ic9Var.F : null, t6fVar.o9);
        c9c N11 = y2x.N(Y, jSONObject, "transform", d, ic9Var != null ? ic9Var.G : null, t6fVar.r9);
        c9c R9 = y2x.R(Y, jSONObject, "transformations", d, ic9Var != null ? ic9Var.H : null, t6fVar.u9);
        c9c N12 = y2x.N(Y, jSONObject, "transition_change", d, ic9Var != null ? ic9Var.I : null, t6fVar.e2);
        c9c N13 = y2x.N(Y, jSONObject, "transition_in", d, ic9Var != null ? ic9Var.J : null, t6fVar.J1);
        c9c N14 = y2x.N(Y, jSONObject, "transition_out", d, ic9Var != null ? ic9Var.K : null, t6fVar.J1);
        c9c c9cVar7 = ic9Var != null ? ic9Var.L : null;
        y19 y19Var = qb9.v;
        y19Var.getClass();
        return new ic9(N, P, P2, P3, R, R2, N2, P4, P5, P6, R3, R4, N3, R5, N4, O, P7, N5, N6, R6, H, N7, N8, P8, N9, N10, P9, P10, P11, P12, R7, R8, N11, R9, N12, N13, N14, y2x.S(Y, jSONObject, d, c9cVar7, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, ic9Var != null ? ic9Var.M : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, ic9Var != null ? ic9Var.N : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", qb9.q, d, ic9Var != null ? ic9Var.O : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, ic9Var != null ? ic9Var.P : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, ic9Var != null ? ic9Var.Q : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, ic9Var != null ? ic9Var.R : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ic9 ic9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = ic9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        y2x.e0(ic9Var.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(ic9Var.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", ic9Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", ic9Var.e, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, ic9Var.f, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", ic9Var.g, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", ic9Var.h);
        c9c c9cVar2 = ic9Var.i;
        i49 i49Var = i49.K;
        y2x.e0(c9cVar2, t7kVar, "cross_axis_alignment", i49Var, jSONObject);
        y2x.f0(t7kVar, jSONObject, "default_item", ic9Var.j);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", ic9Var.k, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "extensions", ic9Var.l, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", ic9Var.m, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", ic9Var.n, t6fVar.V3);
        c9c c9cVar3 = ic9Var.o;
        jyr jyrVar = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar3, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ic9Var.p);
        y2x.f0(t7kVar, jSONObject, "infinite_scroll", ic9Var.q);
        y2x.i0(t7kVar, jSONObject, "item_builder", ic9Var.r, t6fVar.n2);
        y2x.i0(t7kVar, jSONObject, "item_spacing", ic9Var.s, t6fVar.G3);
        y2x.k0(t7kVar, jSONObject, "items", ic9Var.t, t6fVar.ba);
        y2x.i0(t7kVar, jSONObject, "layout_mode", ic9Var.u, t6fVar.J5);
        y2x.i0(t7kVar, jSONObject, "layout_provider", ic9Var.v, t6fVar.Z4);
        c9c c9cVar4 = ic9Var.w;
        jyr jyrVar2 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar4, jyrVar2);
        y2x.e0(ic9Var.x, t7kVar, "orientation", i49.X, jSONObject);
        y2x.i0(t7kVar, jSONObject, "paddings", ic9Var.y, jyrVar2);
        y2x.i0(t7kVar, jSONObject, "page_transformation", ic9Var.z, t6fVar.G5);
        y2x.f0(t7kVar, jSONObject, "restrict_parent_scroll", ic9Var.A);
        y2x.f0(t7kVar, jSONObject, "reuse_id", ic9Var.B);
        y2x.f0(t7kVar, jSONObject, "row_span", ic9Var.C);
        y2x.e0(ic9Var.D, t7kVar, "scroll_axis_alignment", i49Var, jSONObject);
        y2x.k0(t7kVar, jSONObject, "selected_actions", ic9Var.E, t6fVar.u1);
        y2x.k0(t7kVar, jSONObject, "tooltips", ic9Var.F, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", ic9Var.G, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", ic9Var.H, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", ic9Var.I, t6fVar.e2);
        c9c c9cVar5 = ic9Var.J;
        jyr jyrVar3 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar5, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "transition_out", ic9Var.K, jyrVar3);
        y2x.j0(t7kVar, jSONObject, ic9Var.L);
        etn.l0(t7kVar, jSONObject, "type", "pager");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", ic9Var.M, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", ic9Var.N, t6fVar.J9);
        y2x.e0(ic9Var.O, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar6 = ic9Var.P;
        jyr jyrVar4 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar6, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", ic9Var.Q, jyrVar4);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, ic9Var.R, jyrVar);
        return jSONObject;
    }
}
