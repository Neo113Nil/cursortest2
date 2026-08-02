package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fv8 implements gip, r8s {
    public final t6f a;

    public fv8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final jv8 c(t7k t7kVar, jv8 jv8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = jv8Var != null ? jv8Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = hv8.e;
        c9c c9cVar2 = jv8Var != null ? jv8Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", hv8.f, d, jv8Var != null ? jv8Var.c : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, jv8Var != null ? jv8Var.d : null, kzj.E, hv8.h);
        c9c R = y2x.R(Y, jSONObject, "animators", d, jv8Var != null ? jv8Var.e : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, jv8Var != null ? jv8Var.f : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, jv8Var != null ? jv8Var.g : null, t6fVar.V1);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = jv8Var != null ? jv8Var.h : null;
        kzj kzjVar = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, c9cVar3, kzjVar, hv8.i);
        c9c c9cVar4 = jv8Var != null ? jv8Var.i : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, "custom_props", d, c9cVar4, s3fVar);
        c9c G = y2x.G(Y, jSONObject, "custom_type", d, jv8Var != null ? jv8Var.j : null);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, jv8Var != null ? jv8Var.k : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, jv8Var != null ? jv8Var.l : null, t6fVar.l3);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, jv8Var != null ? jv8Var.m : null, t6fVar.M3);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, jv8Var != null ? jv8Var.n : null, t6fVar.V3);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, jv8Var != null ? jv8Var.o : null, t6fVar.r7);
        c9c O2 = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, jv8Var != null ? jv8Var.p : null, s3fVar);
        c9c R6 = y2x.R(Y, jSONObject, "items", d, jv8Var != null ? jv8Var.q : null, t6fVar.ba);
        c9c N5 = y2x.N(Y, jSONObject, "layout_provider", d, jv8Var != null ? jv8Var.r : null, t6fVar.Z4);
        c9c N6 = y2x.N(Y, jSONObject, "margins", d, jv8Var != null ? jv8Var.s : null, t6fVar.i3);
        c9c N7 = y2x.N(Y, jSONObject, "paddings", d, jv8Var != null ? jv8Var.t : null, t6fVar.i3);
        c9c P5 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, jv8Var != null ? jv8Var.u : null, s3fVar, ns9Var);
        c9c P6 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, jv8Var != null ? jv8Var.v : null, kzjVar, hv8.j);
        c9c R7 = y2x.R(Y, jSONObject, "selected_actions", d, jv8Var != null ? jv8Var.w : null, t6fVar.u1);
        c9c R8 = y2x.R(Y, jSONObject, "tooltips", d, jv8Var != null ? jv8Var.x : null, t6fVar.o9);
        c9c N8 = y2x.N(Y, jSONObject, "transform", d, jv8Var != null ? jv8Var.y : null, t6fVar.r9);
        c9c R9 = y2x.R(Y, jSONObject, "transformations", d, jv8Var != null ? jv8Var.z : null, t6fVar.u9);
        c9c N9 = y2x.N(Y, jSONObject, "transition_change", d, jv8Var != null ? jv8Var.A : null, t6fVar.e2);
        c9c N10 = y2x.N(Y, jSONObject, "transition_in", d, jv8Var != null ? jv8Var.B : null, t6fVar.J1);
        c9c N11 = y2x.N(Y, jSONObject, "transition_out", d, jv8Var != null ? jv8Var.C : null, t6fVar.J1);
        c9c c9cVar5 = jv8Var != null ? jv8Var.D : null;
        rj7 rj7Var = hv8.k;
        rj7Var.getClass();
        return new jv8(N, P, P2, P3, R, R2, N2, P4, O, G, R3, R4, N3, R5, N4, O2, R6, N5, N6, N7, P5, P6, R7, R8, N8, R9, N9, N10, N11, y2x.S(Y, jSONObject, d, c9cVar5, rj7Var), y2x.R(Y, jSONObject, "variable_triggers", d, jv8Var != null ? jv8Var.E : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, jv8Var != null ? jv8Var.F : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", hv8.g, d, jv8Var != null ? jv8Var.G : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, jv8Var != null ? jv8Var.H : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, jv8Var != null ? jv8Var.I : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, jv8Var != null ? jv8Var.J : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, jv8 jv8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = jv8Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        y2x.e0(jv8Var.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(jv8Var.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", jv8Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", jv8Var.e, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, jv8Var.f, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", jv8Var.g, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", jv8Var.h);
        y2x.h0(t7kVar, jSONObject, "custom_props", jv8Var.i);
        y2x.h0(t7kVar, jSONObject, "custom_type", jv8Var.j);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", jv8Var.k, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "extensions", jv8Var.l, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", jv8Var.m, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", jv8Var.n, t6fVar.V3);
        c9c c9cVar2 = jv8Var.o;
        jyr jyrVar = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar2, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, jv8Var.p);
        y2x.k0(t7kVar, jSONObject, "items", jv8Var.q, t6fVar.ba);
        y2x.i0(t7kVar, jSONObject, "layout_provider", jv8Var.r, t6fVar.Z4);
        c9c c9cVar3 = jv8Var.s;
        jyr jyrVar2 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar3, jyrVar2);
        y2x.i0(t7kVar, jSONObject, "paddings", jv8Var.t, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "reuse_id", jv8Var.u);
        y2x.f0(t7kVar, jSONObject, "row_span", jv8Var.v);
        y2x.k0(t7kVar, jSONObject, "selected_actions", jv8Var.w, t6fVar.u1);
        y2x.k0(t7kVar, jSONObject, "tooltips", jv8Var.x, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", jv8Var.y, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", jv8Var.z, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", jv8Var.A, t6fVar.e2);
        c9c c9cVar4 = jv8Var.B;
        jyr jyrVar3 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar4, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "transition_out", jv8Var.C, jyrVar3);
        y2x.j0(t7kVar, jSONObject, jv8Var.D);
        etn.l0(t7kVar, jSONObject, "type", "custom");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", jv8Var.E, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", jv8Var.F, t6fVar.J9);
        y2x.e0(jv8Var.G, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar5 = jv8Var.H;
        jyr jyrVar4 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar5, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", jv8Var.I, jyrVar4);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, jv8Var.J, jyrVar);
        return jSONObject;
    }
}
