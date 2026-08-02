package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vz9 implements gip, r8s {
    public final t6f a;

    public vz9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final k0a c(t7k t7kVar, k0a k0aVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = k0aVar != null ? k0aVar.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "accessibility", d, c9cVar, t6fVar.I);
        tct tctVar = xz9.j;
        c9c c9cVar2 = k0aVar != null ? k0aVar.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "alignment_horizontal", tctVar, d, c9cVar2, va8Var, ns9Var);
        c9c P2 = y2x.P(Y, jSONObject, "alignment_vertical", xz9.k, d, k0aVar != null ? k0aVar.c : null, va8.z0, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "alpha", vct.d, d, k0aVar != null ? k0aVar.d : null, kzj.E, xz9.n);
        c9c R = y2x.R(Y, jSONObject, "animators", d, k0aVar != null ? k0aVar.e : null, t6fVar.D1);
        c9c N2 = y2x.N(Y, jSONObject, "aspect", d, k0aVar != null ? k0aVar.f : null, t6fVar.M1);
        ox8 ox8Var = vct.a;
        c9c c9cVar3 = k0aVar != null ? k0aVar.g : null;
        kzj kzjVar = kzj.B;
        c9c P4 = y2x.P(Y, jSONObject, "autostart", ox8Var, d, c9cVar3, kzjVar, ns9Var);
        c9c R2 = y2x.R(Y, jSONObject, C0479n3.g, d, k0aVar != null ? k0aVar.h : null, t6fVar.P1);
        c9c N3 = y2x.N(Y, jSONObject, "border", d, k0aVar != null ? k0aVar.i : null, t6fVar.V1);
        c9c R3 = y2x.R(Y, jSONObject, "buffering_actions", d, k0aVar != null ? k0aVar.j : null, t6fVar.u1);
        ox8 ox8Var2 = vct.b;
        c9c c9cVar4 = k0aVar != null ? k0aVar.k : null;
        kzj kzjVar2 = kzj.F;
        c9c P5 = y2x.P(Y, jSONObject, "column_span", ox8Var2, d, c9cVar4, kzjVar2, xz9.o);
        c9c R4 = y2x.R(Y, jSONObject, "disappear_actions", d, k0aVar != null ? k0aVar.l : null, t6fVar.Z2);
        c9c c9cVar5 = k0aVar != null ? k0aVar.m : null;
        s3f s3fVar = bcx.i;
        c9c O = y2x.O(Y, jSONObject, "elapsed_time_variable", d, c9cVar5, s3fVar);
        c9c R5 = y2x.R(Y, jSONObject, "end_actions", d, k0aVar != null ? k0aVar.n : null, t6fVar.u1);
        c9c R6 = y2x.R(Y, jSONObject, "extensions", d, k0aVar != null ? k0aVar.o : null, t6fVar.l3);
        c9c R7 = y2x.R(Y, jSONObject, "fatal_actions", d, k0aVar != null ? k0aVar.p : null, t6fVar.u1);
        c9c N4 = y2x.N(Y, jSONObject, "focus", d, k0aVar != null ? k0aVar.q : null, t6fVar.M3);
        c9c R8 = y2x.R(Y, jSONObject, "functions", d, k0aVar != null ? k0aVar.r : null, t6fVar.V3);
        c9c N5 = y2x.N(Y, jSONObject, CameraProperty.HEIGHT, d, k0aVar != null ? k0aVar.s : null, t6fVar.r7);
        c9c O2 = y2x.O(Y, jSONObject, ConnectableDevice.KEY_ID, d, k0aVar != null ? k0aVar.t : null, s3fVar);
        c9c N6 = y2x.N(Y, jSONObject, "layout_provider", d, k0aVar != null ? k0aVar.u : null, t6fVar.Z4);
        c9c N7 = y2x.N(Y, jSONObject, "margins", d, k0aVar != null ? k0aVar.v : null, t6fVar.i3);
        c9c P6 = y2x.P(Y, jSONObject, "muted", ox8Var, d, k0aVar != null ? k0aVar.w : null, kzjVar, ns9Var);
        c9c N8 = y2x.N(Y, jSONObject, "paddings", d, k0aVar != null ? k0aVar.x : null, t6fVar.i3);
        c9c R9 = y2x.R(Y, jSONObject, "pause_actions", d, k0aVar != null ? k0aVar.y : null, t6fVar.u1);
        c9c P7 = y2x.P(Y, jSONObject, "player_settings_payload", vct.h, d, k0aVar != null ? k0aVar.z : null, s3fVar, ns9Var);
        c9c P8 = y2x.P(Y, jSONObject, "preload_required", ox8Var, d, k0aVar != null ? k0aVar.A : null, kzjVar, ns9Var);
        ox8 ox8Var3 = vct.c;
        c9c P9 = y2x.P(Y, jSONObject, "preview", ox8Var3, d, k0aVar != null ? k0aVar.B : null, s3fVar, ns9Var);
        c9c P10 = y2x.P(Y, jSONObject, "repeatable", ox8Var, d, k0aVar != null ? k0aVar.C : null, kzjVar, ns9Var);
        c9c R10 = y2x.R(Y, jSONObject, "resume_actions", d, k0aVar != null ? k0aVar.D : null, t6fVar.u1);
        c9c P11 = y2x.P(Y, jSONObject, "reuse_id", ox8Var3, d, k0aVar != null ? k0aVar.E : null, s3fVar, ns9Var);
        c9c P12 = y2x.P(Y, jSONObject, "row_span", ox8Var2, d, k0aVar != null ? k0aVar.F : null, kzjVar2, xz9.p);
        c9c P13 = y2x.P(Y, jSONObject, "scale", xz9.l, d, k0aVar != null ? k0aVar.G : null, jx9.x, ns9Var);
        c9c R11 = y2x.R(Y, jSONObject, "selected_actions", d, k0aVar != null ? k0aVar.H : null, t6fVar.u1);
        c9c R12 = y2x.R(Y, jSONObject, "tooltips", d, k0aVar != null ? k0aVar.I : null, t6fVar.o9);
        c9c N9 = y2x.N(Y, jSONObject, "transform", d, k0aVar != null ? k0aVar.J : null, t6fVar.r9);
        c9c R13 = y2x.R(Y, jSONObject, "transformations", d, k0aVar != null ? k0aVar.K : null, t6fVar.u9);
        c9c N10 = y2x.N(Y, jSONObject, "transition_change", d, k0aVar != null ? k0aVar.L : null, t6fVar.e2);
        c9c N11 = y2x.N(Y, jSONObject, "transition_in", d, k0aVar != null ? k0aVar.M : null, t6fVar.J1);
        c9c N12 = y2x.N(Y, jSONObject, "transition_out", d, k0aVar != null ? k0aVar.N : null, t6fVar.J1);
        c9c c9cVar6 = k0aVar != null ? k0aVar.O : null;
        y19 y19Var = xz9.q;
        y19Var.getClass();
        return new k0a(N, P, P2, P3, R, N2, P4, R2, N3, R3, P5, R4, O, R5, R6, R7, N4, R8, N5, O2, N6, N7, P6, N8, R9, P7, P8, P9, P10, R10, P11, P12, P13, R11, R12, N9, R13, N10, N11, N12, y2x.S(Y, jSONObject, d, c9cVar6, y19Var), y2x.R(Y, jSONObject, "variable_triggers", d, k0aVar != null ? k0aVar.P : null, t6fVar.D9), y2x.R(Y, jSONObject, "variables", d, k0aVar != null ? k0aVar.Q : null, t6fVar.J9), y2x.R(Y, jSONObject, "video_sources", d, k0aVar != null ? k0aVar.R : null, t6fVar.M9), y2x.P(Y, jSONObject, "visibility", xz9.m, d, k0aVar != null ? k0aVar.S : null, jx9.z, ns9Var), y2x.N(Y, jSONObject, "visibility_action", d, k0aVar != null ? k0aVar.T : null, t6fVar.V9), y2x.R(Y, jSONObject, "visibility_actions", d, k0aVar != null ? k0aVar.U : null, t6fVar.V9), y2x.N(Y, jSONObject, CameraProperty.WIDTH, d, k0aVar != null ? k0aVar.V : null, t6fVar.r7));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, k0a k0aVar) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = k0aVar.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "accessibility", c9cVar, t6fVar.I);
        y2x.e0(k0aVar.b, t7kVar, "alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(k0aVar.c, t7kVar, "alignment_vertical", va8.A0, jSONObject);
        y2x.f0(t7kVar, jSONObject, "alpha", k0aVar.d);
        y2x.k0(t7kVar, jSONObject, "animators", k0aVar.e, t6fVar.D1);
        y2x.i0(t7kVar, jSONObject, "aspect", k0aVar.f, t6fVar.M1);
        y2x.f0(t7kVar, jSONObject, "autostart", k0aVar.g);
        y2x.k0(t7kVar, jSONObject, C0479n3.g, k0aVar.h, t6fVar.P1);
        y2x.i0(t7kVar, jSONObject, "border", k0aVar.i, t6fVar.V1);
        c9c c9cVar2 = k0aVar.j;
        jyr jyrVar = t6fVar.u1;
        y2x.k0(t7kVar, jSONObject, "buffering_actions", c9cVar2, jyrVar);
        y2x.f0(t7kVar, jSONObject, "column_span", k0aVar.k);
        y2x.k0(t7kVar, jSONObject, "disappear_actions", k0aVar.l, t6fVar.Z2);
        y2x.h0(t7kVar, jSONObject, "elapsed_time_variable", k0aVar.m);
        y2x.k0(t7kVar, jSONObject, "end_actions", k0aVar.n, jyrVar);
        y2x.k0(t7kVar, jSONObject, "extensions", k0aVar.o, t6fVar.l3);
        y2x.k0(t7kVar, jSONObject, "fatal_actions", k0aVar.p, jyrVar);
        y2x.i0(t7kVar, jSONObject, "focus", k0aVar.q, t6fVar.M3);
        y2x.k0(t7kVar, jSONObject, "functions", k0aVar.r, t6fVar.V3);
        c9c c9cVar3 = k0aVar.s;
        jyr jyrVar2 = t6fVar.r7;
        y2x.i0(t7kVar, jSONObject, CameraProperty.HEIGHT, c9cVar3, jyrVar2);
        y2x.h0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, k0aVar.t);
        y2x.i0(t7kVar, jSONObject, "layout_provider", k0aVar.u, t6fVar.Z4);
        c9c c9cVar4 = k0aVar.v;
        jyr jyrVar3 = t6fVar.i3;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar4, jyrVar3);
        y2x.f0(t7kVar, jSONObject, "muted", k0aVar.w);
        y2x.i0(t7kVar, jSONObject, "paddings", k0aVar.x, jyrVar3);
        y2x.k0(t7kVar, jSONObject, "pause_actions", k0aVar.y, jyrVar);
        y2x.f0(t7kVar, jSONObject, "player_settings_payload", k0aVar.z);
        y2x.f0(t7kVar, jSONObject, "preload_required", k0aVar.A);
        y2x.f0(t7kVar, jSONObject, "preview", k0aVar.B);
        y2x.f0(t7kVar, jSONObject, "repeatable", k0aVar.C);
        y2x.k0(t7kVar, jSONObject, "resume_actions", k0aVar.D, jyrVar);
        y2x.f0(t7kVar, jSONObject, "reuse_id", k0aVar.E);
        y2x.f0(t7kVar, jSONObject, "row_span", k0aVar.F);
        y2x.e0(k0aVar.G, t7kVar, "scale", jx9.y, jSONObject);
        y2x.k0(t7kVar, jSONObject, "selected_actions", k0aVar.H, jyrVar);
        y2x.k0(t7kVar, jSONObject, "tooltips", k0aVar.I, t6fVar.o9);
        y2x.i0(t7kVar, jSONObject, "transform", k0aVar.J, t6fVar.r9);
        y2x.k0(t7kVar, jSONObject, "transformations", k0aVar.K, t6fVar.u9);
        y2x.i0(t7kVar, jSONObject, "transition_change", k0aVar.L, t6fVar.e2);
        c9c c9cVar5 = k0aVar.M;
        jyr jyrVar4 = t6fVar.J1;
        y2x.i0(t7kVar, jSONObject, "transition_in", c9cVar5, jyrVar4);
        y2x.i0(t7kVar, jSONObject, "transition_out", k0aVar.N, jyrVar4);
        y2x.j0(t7kVar, jSONObject, k0aVar.O);
        etn.l0(t7kVar, jSONObject, "type", "video");
        y2x.k0(t7kVar, jSONObject, "variable_triggers", k0aVar.P, t6fVar.D9);
        y2x.k0(t7kVar, jSONObject, "variables", k0aVar.Q, t6fVar.J9);
        y2x.k0(t7kVar, jSONObject, "video_sources", k0aVar.R, t6fVar.M9);
        y2x.e0(k0aVar.S, t7kVar, "visibility", jx9.A, jSONObject);
        c9c c9cVar6 = k0aVar.T;
        jyr jyrVar5 = t6fVar.V9;
        y2x.i0(t7kVar, jSONObject, "visibility_action", c9cVar6, jyrVar5);
        y2x.k0(t7kVar, jSONObject, "visibility_actions", k0aVar.U, jyrVar5);
        y2x.i0(t7kVar, jSONObject, CameraProperty.WIDTH, k0aVar.V, jyrVar2);
        return jSONObject;
    }
}
