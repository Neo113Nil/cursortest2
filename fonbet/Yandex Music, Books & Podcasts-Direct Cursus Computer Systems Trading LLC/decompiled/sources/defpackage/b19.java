package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b19 implements gip, r8s {
    public final t6f a;

    public b19(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final f19 c(t7k t7kVar, f19 f19Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = f19Var != null ? f19Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = d19.l;
        c9c c9cVar2 = f19Var != null ? f19Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", d19.m, d, f19Var != null ? f19Var.c : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, f19Var != null ? f19Var.d : null, kzj.E, d19.s);
        c9c R = y2x.R(Y, jSONObject, "animators", d, f19Var != null ? f19Var.e : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, f19Var != null ? f19Var.f : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, f19Var != null ? f19Var.g : null, t6fVar.V1);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = f19Var != null ? f19Var.h : null;
        kzj kzjVar = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "column_count", ox8Var, d, c9cVar3, kzjVar, d19.t);
        c9c P5 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, f19Var != null ? f19Var.i : null, kzjVar, d19.u);
        c9c P6 = y2x.P(Y, jSONObject, "cross_content_alignment", d19.n, d, f19Var != null ? f19Var.j : null, vv8.D, ns9Var);
        c9c P7 = y2x.P(Y, jSONObject, "cross_spacing", ox8Var, d, f19Var != null ? f19Var.k : null, kzjVar, d19.v);
        c9c P8 = y2x.P(Y, jSONObject, "default_item", ox8Var, d, f19Var != null ? f19Var.l : null, kzjVar, d19.w);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, f19Var != null ? f19Var.m : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, f19Var != null ? f19Var.n : null, t6fVar.l3);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, f19Var != null ? f19Var.o : null, t6fVar.M3);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, f19Var != null ? f19Var.p : null, t6fVar.V3);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, f19Var != null ? f19Var.q : null, t6fVar.r7);
        c9c c9cVar4 = f19Var != null ? f19Var.r : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar4, s3fVar);
        c9c N5 = y2x.N(Y, jSONObject, "item_builder", d, f19Var != null ? f19Var.s : null, t6fVar.n2);
        c9c P9 = y2x.P(Y, jSONObject, "item_spacing", ox8Var, d, f19Var != null ? f19Var.t : null, kzjVar, d19.x);
        c9c R6 = y2x.R(Y, jSONObject, "items", d, f19Var != null ? f19Var.u : null, t6fVar.ba);
        c9c N6 = y2x.N(Y, jSONObject, "layout_provider", d, f19Var != null ? f19Var.v : null, t6fVar.Z4);
        c9c N7 = y2x.N(Y, jSONObject, "margins", d, f19Var != null ? f19Var.w : null, t6fVar.i3);
        c9c P10 = y2x.P(Y, jSONObject, "orientation", d19.o, d, f19Var != null ? f19Var.x : null, vv8.F, ns9Var);
        c9c N8 = y2x.N(Y, jSONObject, "paddings", d, f19Var != null ? f19Var.y : null, t6fVar.i3);
        c9c P11 = y2x.P(Y, jSONObject, "restrict_parent_scroll", vct.a, d, f19Var != null ? f19Var.z : null, kzj.B, ns9Var);
        c9c P12 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, f19Var != null ? f19Var.A : null, s3fVar, ns9Var);
        c9c P13 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, f19Var != null ? f19Var.B : null, kzjVar, d19.y);
        c9c P14 = y2x.P(Y, jSONObject, "scroll_mode", d19.p, d, f19Var != null ? f19Var.C : null, vv8.H, ns9Var);
        c9c P15 = y2x.P(Y, jSONObject, "scrollbar", d19.q, d, f19Var != null ? f19Var.D : null, vv8.J, ns9Var);
        c9c R7 = y2x.R(Y, jSONObject, "selected_actions", d, f19Var != null ? f19Var.E : null, t6fVar.u1);
        c9c R8 = y2x.R(Y, jSONObject, "tooltips", d, f19Var != null ? f19Var.F : null, t6fVar.o9);
        c9c N9 = y2x.N(Y, jSONObject, "transform", d, f19Var != null ? f19Var.G : null, t6fVar.r9);
        c9c R9 = y2x.R(Y, jSONObject, "transformations", d, f19Var != null ? f19Var.H : null, t6fVar.u9);
        c9c N10 = y2x.N(Y, jSONObject, "transition_change", d, f19Var != null ? f19Var.I : null, t6fVar.e2);
        c9c N11 = y2x.N(Y, jSONObject, "transition_in", d, f19Var != null ? f19Var.J : null, t6fVar.J1);
        c9c N12 = y2x.N(Y, jSONObject, "transition_out", d, f19Var != null ? f19Var.K : null, t6fVar.J1);
        c9c c9cVar5 = f19Var != null ? f19Var.L : null;
        rj7 rj7Var = d19.z;
        rj7Var.getClass();
        return new f19(N, P, P2, P3, R, R2, N2, P4, P5, P6, P7, P8, R3, R4, N3, R5, N4, O, N5, P9, R6, N6, N7, P10, N8, P11, P12, P13, P14, P15, R7, R8, N9, R9, N10, N11, N12, y2x.S(Y, jSONObject, d, c9cVar5, rj7Var), y2x.R(Y, jSONObject, "variable_triggers", d, f19Var != null ? f19Var.M : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, f19Var != null ? f19Var.N : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", d19.r, d, f19Var != null ? f19Var.O : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, f19Var != null ? f19Var.P : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, f19Var != null ? f19Var.Q : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, f19Var != null ? f19Var.R : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, f19 f19Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = f19Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        y2x.e0(f19Var.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(f19Var.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", f19Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", f19Var.e, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, f19Var.f, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", f19Var.g, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_count", f19Var.h);
        y2x.f0(t7kVar, jSONObject, "column_span", f19Var.i);
        y2x.e0(f19Var.j, t7kVar, "cross_content_alignment", vv8.E, jSONObject);
        y2x.f0(t7kVar, jSONObject, "cross_spacing", f19Var.k);
        y2x.f0(t7kVar, jSONObject, "default_item", f19Var.l);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", f19Var.m, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "extensions", f19Var.n, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", f19Var.o, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", f19Var.p, t6fVar.V3);
        c9c c9cVar2 = f19Var.q;
        jyr jyrVar = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar2, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, f19Var.r);
        y2x.i0(t7kVar, jSONObject, "item_builder", f19Var.s, t6fVar.n2);
        y2x.f0(t7kVar, jSONObject, "item_spacing", f19Var.t);
        y2x.k0(t7kVar, jSONObject, "items", f19Var.u, t6fVar.ba);
        y2x.i0(t7kVar, jSONObject, "layout_provider", f19Var.v, t6fVar.Z4);
        c9c c9cVar3 = f19Var.w;
        jyr jyrVar2 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar3, jyrVar2);
        y2x.e0(f19Var.x, t7kVar, "orientation", vv8.G, jSONObject);
        y2x.i0(t7kVar, jSONObject, "paddings", f19Var.y, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "restrict_parent_scroll", f19Var.z);
        y2x.f0(t7kVar, jSONObject, "reuse_id", f19Var.A);
        y2x.f0(t7kVar, jSONObject, "row_span", f19Var.B);
        y2x.e0(f19Var.C, t7kVar, "scroll_mode", vv8.I, jSONObject);
        y2x.e0(f19Var.D, t7kVar, "scrollbar", vv8.K, jSONObject);
        y2x.k0(t7kVar, jSONObject, "selected_actions", f19Var.E, t6fVar.u1);
        y2x.k0(t7kVar, jSONObject, "tooltips", f19Var.F, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", f19Var.G, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", f19Var.H, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", f19Var.I, t6fVar.e2);
        c9c c9cVar4 = f19Var.J;
        jyr jyrVar3 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar4, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "transition_out", f19Var.K, jyrVar3);
        y2x.j0(t7kVar, jSONObject, f19Var.L);
        etn.l0(t7kVar, jSONObject, "type", "gallery");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", f19Var.M, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", f19Var.N, t6fVar.J9);
        y2x.e0(f19Var.O, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar5 = f19Var.P;
        jyr jyrVar4 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar5, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", f19Var.Q, jyrVar4);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, f19Var.R, jyrVar);
        return jSONObject;
    }
}
