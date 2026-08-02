package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x39 implements gip, r8s {
    public final t6f a;

    public x39(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final a49 c(t7k t7kVar, a49 a49Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = a49Var != null ? a49Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        ox8 ox8Var = vct.f;
        c9c c9cVar2 = a49Var != null ? a49Var.b : null;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "active_item_color", ox8Var, d, c9cVar2, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.d;
        c9c c9cVar3 = a49Var != null ? a49Var.c : null;
        kzj kzjVar2 = kzj.E;
        c9c P2 = y2x.P(Y, jSONObject, "active_item_size", ox8Var2, d, c9cVar3, kzjVar2, z39.p);
        c9c N2 = y2x.N(Y, jSONObject, "active_shape", d, a49Var != null ? a49Var.d : null, t6fVar.N6);
        c9c P3 = y2x.P(Y, jSONObject, "alignment_horizontal", z39.l, d, a49Var != null ? a49Var.e : null, va8.x0, ns9Var);
        c9c P4 = y2x.P(Y, jSONObject, "alignment_vertical", z39.m, d, a49Var != null ? a49Var.f : null, va8.z0, ns9Var);
        c9c P5 = y2x.P(Y, jSONObject, "alpha", ox8Var2, d, a49Var != null ? a49Var.g : null, kzjVar2, z39.q);
        c9c P6 = y2x.P(Y, jSONObject, "animation", z39.n, d, a49Var != null ? a49Var.h : null, p19.L, ns9Var);
        c9c R = y2x.R(Y, jSONObject, "animators", d, a49Var != null ? a49Var.i : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, a49Var != null ? a49Var.j : null, t6fVar.P1);
        c9c N3 = y2x.N(Y, jSONObject, "border", d, a49Var != null ? a49Var.k : null, t6fVar.V1);
        ox8 ox8Var3 = vct.b;
        c9c c9cVar4 = a49Var != null ? a49Var.l : null;
        kzj kzjVar3 = kzj.F;
        c9c P7 = y2x.P(Y, jSONObject, "column_span", ox8Var3, d, c9cVar4, kzjVar3, z39.r);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, a49Var != null ? a49Var.m : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, a49Var != null ? a49Var.n : null, t6fVar.l3);
        c9c N4 = y2x.N(Y, jSONObject, "focus", d, a49Var != null ? a49Var.o : null, t6fVar.M3);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, a49Var != null ? a49Var.p : null, t6fVar.V3);
        c9c N5 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, a49Var != null ? a49Var.q : null, t6fVar.r7);
        c9c c9cVar5 = a49Var != null ? a49Var.r : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar5, s3fVar);
        c9c P8 = y2x.P(Y, jSONObject, "inactive_item_color", ox8Var, d, a49Var != null ? a49Var.s : null, kzjVar, ns9Var);
        c9c N6 = y2x.N(Y, jSONObject, "inactive_minimum_shape", d, a49Var != null ? a49Var.t : null, t6fVar.N6);
        c9c N7 = y2x.N(Y, jSONObject, "inactive_shape", d, a49Var != null ? a49Var.u : null, t6fVar.N6);
        c9c N8 = y2x.N(Y, jSONObject, "items_placement", d, a49Var != null ? a49Var.v : null, t6fVar.n4);
        c9c N9 = y2x.N(Y, jSONObject, "layout_provider", d, a49Var != null ? a49Var.w : null, t6fVar.Z4);
        c9c N10 = y2x.N(Y, jSONObject, "margins", d, a49Var != null ? a49Var.x : null, t6fVar.i3);
        c9c P9 = y2x.P(Y, jSONObject, "minimum_item_size", ox8Var2, d, a49Var != null ? a49Var.y : null, kzjVar2, z39.s);
        c9c N11 = y2x.N(Y, jSONObject, "paddings", d, a49Var != null ? a49Var.z : null, t6fVar.i3);
        c9c O2 = y2x.O(Y, jSONObject, "pager_id", d, a49Var != null ? a49Var.A : null, s3fVar);
        c9c P10 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, a49Var != null ? a49Var.B : null, s3fVar, ns9Var);
        c9c P11 = y2x.P(Y, jSONObject, "row_span", ox8Var3, d, a49Var != null ? a49Var.C : null, kzjVar3, z39.t);
        c9c R6 = y2x.R(Y, jSONObject, "selected_actions", d, a49Var != null ? a49Var.D : null, t6fVar.u1);
        c9c N12 = y2x.N(Y, jSONObject, "shape", d, a49Var != null ? a49Var.E : null, t6fVar.l7);
        c9c N13 = y2x.N(Y, jSONObject, "space_between_centers", d, a49Var != null ? a49Var.F : null, t6fVar.G3);
        c9c R7 = y2x.R(Y, jSONObject, "tooltips", d, a49Var != null ? a49Var.G : null, t6fVar.o9);
        c9c N14 = y2x.N(Y, jSONObject, "transform", d, a49Var != null ? a49Var.H : null, t6fVar.r9);
        c9c R8 = y2x.R(Y, jSONObject, "transformations", d, a49Var != null ? a49Var.I : null, t6fVar.u9);
        c9c N15 = y2x.N(Y, jSONObject, "transition_change", d, a49Var != null ? a49Var.J : null, t6fVar.e2);
        c9c N16 = y2x.N(Y, jSONObject, "transition_in", d, a49Var != null ? a49Var.K : null, t6fVar.J1);
        c9c N17 = y2x.N(Y, jSONObject, "transition_out", d, a49Var != null ? a49Var.L : null, t6fVar.J1);
        c9c c9cVar6 = a49Var != null ? a49Var.M : null;
        y19 y19Var = z39.u;
        y19Var.getClass();
        return new a49(N, P, P2, N2, P3, P4, P5, P6, R, R2, N3, P7, R3, R4, N4, R5, N5, O, P8, N6, N7, N8, N9, N10, P9, N11, O2, P10, P11, R6, N12, N13, R7, N14, R8, N15, N16, N17, y2x.S(Y, jSONObject, d, c9cVar6, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, a49Var != null ? a49Var.N : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, a49Var != null ? a49Var.O : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", z39.o, d, a49Var != null ? a49Var.P : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, a49Var != null ? a49Var.Q : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, a49Var != null ? a49Var.R : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, a49Var != null ? a49Var.S : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, a49 a49Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = a49Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        c9c c9cVar2 = a49Var.b;
        kzj kzjVar = kzj.D;
        y2x.e0(c9cVar2, t7kVar, "active_item_color", kzjVar, jSONObject);
        y2x.f0(t7kVar, jSONObject, "active_item_size", a49Var.c);
        c9c c9cVar3 = a49Var.d;
        jyr jyrVar = t6fVar.N6;
        y2x.i0(t7kVar, jSONObject, "active_shape", c9cVar3, jyrVar);
        y2x.e0(a49Var.e, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(a49Var.f, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", a49Var.g);
        y2x.e0(a49Var.h, t7kVar, "animation", p19.X, jSONObject);
        y2x.k0(t7kVar, jSONObject, "animators", a49Var.i, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, a49Var.j, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", a49Var.k, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", a49Var.l);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", a49Var.m, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "extensions", a49Var.n, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", a49Var.o, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", a49Var.p, t6fVar.V3);
        c9c c9cVar4 = a49Var.q;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar4, jyrVar2);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, a49Var.r);
        y2x.e0(a49Var.s, t7kVar, "inactive_item_color", kzjVar, jSONObject);
        y2x.i0(t7kVar, jSONObject, "inactive_minimum_shape", a49Var.t, jyrVar);
        y2x.i0(t7kVar, jSONObject, "inactive_shape", a49Var.u, jyrVar);
        y2x.i0(t7kVar, jSONObject, "items_placement", a49Var.v, t6fVar.n4);
        y2x.i0(t7kVar, jSONObject, "layout_provider", a49Var.w, t6fVar.Z4);
        c9c c9cVar5 = a49Var.x;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar5, jyrVar3);
        y2x.f0(t7kVar, jSONObject, "minimum_item_size", a49Var.y);
        y2x.i0(t7kVar, jSONObject, "paddings", a49Var.z, jyrVar3);
        y2x.h0(t7kVar, jSONObject, "pager_id", a49Var.A);
        y2x.f0(t7kVar, jSONObject, "reuse_id", a49Var.B);
        y2x.f0(t7kVar, jSONObject, "row_span", a49Var.C);
        y2x.k0(t7kVar, jSONObject, "selected_actions", a49Var.D, t6fVar.u1);
        y2x.i0(t7kVar, jSONObject, "shape", a49Var.E, t6fVar.l7);
        y2x.i0(t7kVar, jSONObject, "space_between_centers", a49Var.F, t6fVar.G3);
        y2x.k0(t7kVar, jSONObject, "tooltips", a49Var.G, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", a49Var.H, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", a49Var.I, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", a49Var.J, t6fVar.e2);
        c9c c9cVar6 = a49Var.K;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar6, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", a49Var.L, jyrVar4);
        y2x.j0(t7kVar, jSONObject, a49Var.M);
        etn.l0(t7kVar, jSONObject, "type", "indicator");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", a49Var.N, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", a49Var.O, t6fVar.J9);
        y2x.e0(a49Var.P, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar7 = a49Var.Q;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar7, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", a49Var.R, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, a49Var.S, jyrVar2);
        return jSONObject;
    }
}
