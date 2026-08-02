package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.y;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vlk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public vlk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final emk c(yf90 yf90Var, emk emkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = emkVar != null ? emkVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = y.e;
        exq exqVar2 = emkVar != null ? emkVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", y.f, i, emkVar != null ? emkVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, emkVar != null ? emkVar.d : null, b.g, y.h);
        exq k = wcx.k(Q, jSONObject, "animators", i, emkVar != null ? emkVar.e : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, emkVar != null ? emkVar.f : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, emkVar != null ? emkVar.g : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar3 = emkVar != null ? emkVar.h : null;
        tls tlsVar2 = b.h;
        exq j4 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar3, tlsVar2, y.i);
        exq exqVar4 = emkVar != null ? emkVar.i : null;
        abl0 abl0Var = q5z.c;
        return new emk(i2, j, j2, j3, k, k2, i3, j4, wcx.h(Q, jSONObject, "custom_props", i, exqVar4, abl0Var), wcx.a(Q, jSONObject, "custom_type", i, emkVar != null ? emkVar.j : null), wcx.k(Q, jSONObject, "disappear_actions", i, emkVar != null ? emkVar.k : null, jsonParserComponent.Y2), wcx.k(Q, jSONObject, "extensions", i, emkVar != null ? emkVar.l : null, jsonParserComponent.k3), wcx.i(Q, jSONObject, "focus", i, emkVar != null ? emkVar.m : null, jsonParserComponent.L3), wcx.k(Q, jSONObject, "functions", i, emkVar != null ? emkVar.n : null, jsonParserComponent.U3), wcx.i(Q, jSONObject, "height", i, emkVar != null ? emkVar.o : null, i3yVar5), wcx.h(Q, jSONObject, "id", i, emkVar != null ? emkVar.p : null, abl0Var), wcx.k(Q, jSONObject, "items", i, emkVar != null ? emkVar.q : null, jsonParserComponent.Y9), wcx.i(Q, jSONObject, "layout_provider", i, emkVar != null ? emkVar.r : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "margins", i, emkVar != null ? emkVar.s : null, i3yVar4), wcx.i(Q, jSONObject, "paddings", i, emkVar != null ? emkVar.t : null, i3yVar4), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, emkVar != null ? emkVar.u : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, emkVar != null ? emkVar.v : null, tlsVar2, y.j), wcx.k(Q, jSONObject, "selected_actions", i, emkVar != null ? emkVar.w : null, jsonParserComponent.u1), wcx.k(Q, jSONObject, "tooltips", i, emkVar != null ? emkVar.x : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, emkVar != null ? emkVar.y : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, emkVar != null ? emkVar.z : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, emkVar != null ? emkVar.A : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, emkVar != null ? emkVar.B : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, emkVar != null ? emkVar.C : null, i3yVar3), wcx.l(Q, jSONObject, i, emkVar != null ? emkVar.D : null, DivTransitionTrigger.FROM_STRING, y.k), wcx.k(Q, jSONObject, "variable_triggers", i, emkVar != null ? emkVar.E : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, emkVar != null ? emkVar.F : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", y.g, i, emkVar != null ? emkVar.G : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, emkVar != null ? emkVar.H : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, emkVar != null ? emkVar.I : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, emkVar != null ? emkVar.J : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, emk emkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = emkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(emkVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(emkVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, emkVar.d);
        wcx.w(yf90Var, jSONObject, "animators", emkVar.e, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, emkVar.f, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", emkVar.g, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", emkVar.h);
        wcx.t(yf90Var, jSONObject, "custom_props", emkVar.i);
        wcx.t(yf90Var, jSONObject, "custom_type", emkVar.j);
        wcx.w(yf90Var, jSONObject, "disappear_actions", emkVar.k, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "extensions", emkVar.l, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", emkVar.m, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", emkVar.n, jsonParserComponent.U3);
        exq exqVar2 = emkVar.o;
        i3y i3yVar = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar2, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", emkVar.p);
        wcx.w(yf90Var, jSONObject, "items", emkVar.q, jsonParserComponent.Y9);
        wcx.u(yf90Var, jSONObject, "layout_provider", emkVar.r, jsonParserComponent.Y4);
        exq exqVar3 = emkVar.s;
        i3y i3yVar2 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar3, i3yVar2);
        wcx.u(yf90Var, jSONObject, "paddings", emkVar.t, i3yVar2);
        wcx.q(yf90Var, jSONObject, "reuse_id", emkVar.u);
        wcx.q(yf90Var, jSONObject, "row_span", emkVar.v);
        wcx.w(yf90Var, jSONObject, "selected_actions", emkVar.w, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "tooltips", emkVar.x, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", emkVar.y, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", emkVar.z, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", emkVar.A, jsonParserComponent.e2);
        exq exqVar4 = emkVar.B;
        i3y i3yVar3 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar4, i3yVar3);
        wcx.u(yf90Var, jSONObject, "transition_out", emkVar.C, i3yVar3);
        wcx.v(yf90Var, jSONObject, emkVar.D, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "custom");
        wcx.w(yf90Var, jSONObject, "variable_triggers", emkVar.E, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", emkVar.F, jsonParserComponent.G9);
        wcx.p(emkVar.G, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar5 = emkVar.H;
        i3y i3yVar4 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar5, i3yVar4);
        wcx.w(yf90Var, jSONObject, "visibility_actions", emkVar.I, i3yVar4);
        wcx.u(yf90Var, jSONObject, "width", emkVar.J, i3yVar);
        return jSONObject;
    }
}
