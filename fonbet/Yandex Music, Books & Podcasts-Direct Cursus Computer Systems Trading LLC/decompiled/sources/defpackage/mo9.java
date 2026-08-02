package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mo9 implements gip, r8s {
    public final t6f a;

    public mo9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final po9 c(t7k t7kVar, po9 po9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = po9Var != null ? po9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = oo9.f;
        c9c c9cVar2 = po9Var != null ? po9Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", oo9.g, d, po9Var != null ? po9Var.c : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, po9Var != null ? po9Var.d : null, kzj.E, oo9.i);
        c9c R = y2x.R(Y, jSONObject, "animators", d, po9Var != null ? po9Var.e : null, t6fVar.D1);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, po9Var != null ? po9Var.f : null, t6fVar.P1);
        c9c N2 = y2x.N(Y, jSONObject, "border", d, po9Var != null ? po9Var.g : null, t6fVar.V1);
        ox8 ox8Var = vct.b;
        c9c c9cVar3 = po9Var != null ? po9Var.h : null;
        kzj kzjVar = kzj.F;
        c9c P4 = y2x.P(Y, jSONObject, "column_span", ox8Var, d, c9cVar3, kzjVar, oo9.j);
        c9c R3 = y2x.R(Y, jSONObject, "disappear_actions", d, po9Var != null ? po9Var.i : null, t6fVar.Z2);
        c9c R4 = y2x.R(Y, jSONObject, "extensions", d, po9Var != null ? po9Var.j : null, t6fVar.l3);
        c9c N3 = y2x.N(Y, jSONObject, "focus", d, po9Var != null ? po9Var.k : null, t6fVar.M3);
        c9c R5 = y2x.R(Y, jSONObject, "functions", d, po9Var != null ? po9Var.l : null, t6fVar.V3);
        c9c N4 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, po9Var != null ? po9Var.m : null, t6fVar.r7);
        c9c c9cVar4 = po9Var != null ? po9Var.n : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, c9cVar4, s3fVar);
        c9c P5 = y2x.P(Y, jSONObject, "is_enabled", vct.a, d, po9Var != null ? po9Var.o : null, kzj.B, ns9Var);
        c9c G = y2x.G(Y, jSONObject, "is_on_variable", d, po9Var != null ? po9Var.p : null);
        c9c N5 = y2x.N(Y, jSONObject, "layout_provider", d, po9Var != null ? po9Var.q : null, t6fVar.Z4);
        c9c N6 = y2x.N(Y, jSONObject, "margins", d, po9Var != null ? po9Var.r : null, t6fVar.i3);
        c9c P6 = y2x.P(Y, jSONObject, "on_color", vct.f, d, po9Var != null ? po9Var.s : null, kzj.G, ns9Var);
        c9c N7 = y2x.N(Y, jSONObject, "paddings", d, po9Var != null ? po9Var.t : null, t6fVar.i3);
        c9c P7 = y2x.P(Y, jSONObject, "reuse_id", vct.c, d, po9Var != null ? po9Var.u : null, s3fVar, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "row_span", ox8Var, d, po9Var != null ? po9Var.v : null, kzjVar, oo9.k);
        c9c R6 = y2x.R(Y, jSONObject, "selected_actions", d, po9Var != null ? po9Var.w : null, t6fVar.u1);
        c9c R7 = y2x.R(Y, jSONObject, "tooltips", d, po9Var != null ? po9Var.x : null, t6fVar.o9);
        c9c N8 = y2x.N(Y, jSONObject, "transform", d, po9Var != null ? po9Var.y : null, t6fVar.r9);
        c9c R8 = y2x.R(Y, jSONObject, "transformations", d, po9Var != null ? po9Var.z : null, t6fVar.u9);
        c9c N9 = y2x.N(Y, jSONObject, "transition_change", d, po9Var != null ? po9Var.A : null, t6fVar.e2);
        c9c N10 = y2x.N(Y, jSONObject, "transition_in", d, po9Var != null ? po9Var.B : null, t6fVar.J1);
        c9c N11 = y2x.N(Y, jSONObject, "transition_out", d, po9Var != null ? po9Var.C : null, t6fVar.J1);
        c9c c9cVar5 = po9Var != null ? po9Var.D : null;
        y19 y19Var = oo9.l;
        y19Var.getClass();
        return new po9(N, P, P2, P3, R, R2, N2, P4, R3, R4, N3, R5, N4, O, P5, G, N5, N6, P6, N7, P7, P8, R6, R7, N8, R8, N9, N10, N11, y2x.S(Y, jSONObject, d, c9cVar5, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, po9Var != null ? po9Var.E : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, po9Var != null ? po9Var.F : null, t6fVar.J9), y2x.P(Y, jSONObject, "visibility", oo9.h, d, po9Var != null ? po9Var.G : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, po9Var != null ? po9Var.H : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, po9Var != null ? po9Var.I : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, po9Var != null ? po9Var.J : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, po9 po9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = po9Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        y2x.e0(po9Var.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(po9Var.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", po9Var.d);
        y2x.k0(t7kVar, jSONObject, "animators", po9Var.e, t6fVar.D1);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, po9Var.f, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", po9Var.g, t6fVar.V1);
        y2x.f0(t7kVar, jSONObject, "column_span", po9Var.h);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", po9Var.i, t6fVar.Z2);
        y2x.k0(t7kVar, jSONObject, "extensions", po9Var.j, t6fVar.l3);
        y2x.i0(t7kVar, jSONObject, "focus", po9Var.k, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", po9Var.l, t6fVar.V3);
        c9c c9cVar2 = po9Var.m;
        jyr jyrVar = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar2, jyrVar);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, po9Var.n);
        y2x.f0(t7kVar, jSONObject, "is_enabled", po9Var.o);
        y2x.h0(t7kVar, jSONObject, "is_on_variable", po9Var.p);
        y2x.i0(t7kVar, jSONObject, "layout_provider", po9Var.q, t6fVar.Z4);
        c9c c9cVar3 = po9Var.r;
        jyr jyrVar2 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar3, jyrVar2);
        y2x.e0(po9Var.s, t7kVar, "on_color", kzj.D, jSONObject);
        y2x.i0(t7kVar, jSONObject, "paddings", po9Var.t, jyrVar2);
        y2x.f0(t7kVar, jSONObject, "reuse_id", po9Var.u);
        y2x.f0(t7kVar, jSONObject, "row_span", po9Var.v);
        y2x.k0(t7kVar, jSONObject, "selected_actions", po9Var.w, t6fVar.u1);
        y2x.k0(t7kVar, jSONObject, "tooltips", po9Var.x, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", po9Var.y, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", po9Var.z, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", po9Var.A, t6fVar.e2);
        c9c c9cVar4 = po9Var.B;
        jyr jyrVar3 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar4, jyrVar3);
        y2x.i0(t7kVar, jSONObject, "transition_out", po9Var.C, jyrVar3);
        y2x.j0(t7kVar, jSONObject, po9Var.D);
        etn.l0(t7kVar, jSONObject, "type", "switch");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", po9Var.E, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", po9Var.F, t6fVar.J9);
        y2x.e0(po9Var.G, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar5 = po9Var.H;
        jyr jyrVar4 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar5, jyrVar4);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", po9Var.I, jyrVar4);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, po9Var.J, jyrVar);
        return jSONObject;
    }
}
