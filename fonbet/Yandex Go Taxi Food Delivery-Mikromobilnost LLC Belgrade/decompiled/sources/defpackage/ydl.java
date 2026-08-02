package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.k2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ydl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public ydl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final fel c(yf90 yf90Var, fel felVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = felVar != null ? felVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.p7;
        i3y i3yVar5 = jsonParserComponent.h3;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = k2.m;
        exq exqVar2 = felVar != null ? felVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", k2.n, i, felVar != null ? felVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, felVar != null ? felVar.d : null, b.g, k2.p);
        exq k = wcx.k(Q, jSONObject, "animators", i, felVar != null ? felVar.e : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, felVar != null ? felVar.f : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, felVar != null ? felVar.g : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar3 = felVar != null ? felVar.h : null;
        tls tlsVar2 = b.h;
        exq j4 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar3, tlsVar2, k2.q);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, felVar != null ? felVar.i : null, jsonParserComponent.Y2);
        wms wmsVar = wm11.a;
        exq exqVar4 = felVar != null ? felVar.j : null;
        tls tlsVar3 = b.f;
        exq j5 = wcx.j(Q, jSONObject, "dynamic_height", wmsVar, i, exqVar4, tlsVar3, kbsVar);
        exq k4 = wcx.k(Q, jSONObject, "extensions", i, felVar != null ? felVar.k : null, jsonParserComponent.k3);
        exq i4 = wcx.i(Q, jSONObject, "focus", i, felVar != null ? felVar.l : null, jsonParserComponent.L3);
        exq k5 = wcx.k(Q, jSONObject, "functions", i, felVar != null ? felVar.m : null, jsonParserComponent.U3);
        exq j6 = wcx.j(Q, jSONObject, "has_separator", wmsVar, i, felVar != null ? felVar.n : null, tlsVar3, kbsVar);
        exq i5 = wcx.i(Q, jSONObject, "height", i, felVar != null ? felVar.o : null, i3yVar4);
        exq exqVar5 = felVar != null ? felVar.p : null;
        abl0 abl0Var = q5z.c;
        return new fel(i2, j, j2, j3, k, k2, i3, j4, k3, j5, k4, i4, k5, j6, i5, wcx.h(Q, jSONObject, "id", i, exqVar5, abl0Var), wcx.f(Q, jSONObject, "items", i, felVar != null ? felVar.q : null, jsonParserComponent.o8, k2.r), wcx.i(Q, jSONObject, "layout_provider", i, felVar != null ? felVar.r : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "margins", i, felVar != null ? felVar.s : null, i3yVar5), wcx.i(Q, jSONObject, "paddings", i, felVar != null ? felVar.t : null, i3yVar5), wcx.j(Q, jSONObject, "restrict_parent_scroll", wmsVar, i, felVar != null ? felVar.u : null, tlsVar3, kbsVar), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, felVar != null ? felVar.v : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, felVar != null ? felVar.w : null, tlsVar2, k2.s), wcx.k(Q, jSONObject, "selected_actions", i, felVar != null ? felVar.x : null, jsonParserComponent.u1), wcx.j(Q, jSONObject, "selected_tab", tmsVar, i, felVar != null ? felVar.y : null, tlsVar2, k2.t), wcx.j(Q, jSONObject, "separator_color", wm11.f, i, felVar != null ? felVar.z : null, b.b, kbsVar), wcx.i(Q, jSONObject, "separator_paddings", i, felVar != null ? felVar.A : null, i3yVar5), wcx.j(Q, jSONObject, "switch_tabs_by_content_swipe_enabled", wmsVar, i, felVar != null ? felVar.B : null, tlsVar3, kbsVar), wcx.i(Q, jSONObject, "tab_title_delimiter", i, felVar != null ? felVar.C : null, jsonParserComponent.l8), wcx.i(Q, jSONObject, "tab_title_style", i, felVar != null ? felVar.D : null, jsonParserComponent.i8), wcx.i(Q, jSONObject, "title_paddings", i, felVar != null ? felVar.E : null, i3yVar5), wcx.k(Q, jSONObject, "tooltips", i, felVar != null ? felVar.F : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, felVar != null ? felVar.G : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, felVar != null ? felVar.H : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, felVar != null ? felVar.I : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, felVar != null ? felVar.J : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, felVar != null ? felVar.K : null, i3yVar3), wcx.l(Q, jSONObject, i, felVar != null ? felVar.L : null, DivTransitionTrigger.FROM_STRING, k2.u), wcx.k(Q, jSONObject, "variable_triggers", i, felVar != null ? felVar.M : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, felVar != null ? felVar.N : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", k2.o, i, felVar != null ? felVar.O : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, felVar != null ? felVar.P : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, felVar != null ? felVar.Q : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, felVar != null ? felVar.R : null, i3yVar4));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, fel felVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = felVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(felVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(felVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, felVar.d);
        wcx.w(yf90Var, jSONObject, "animators", felVar.e, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, felVar.f, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", felVar.g, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", felVar.h);
        wcx.w(yf90Var, jSONObject, "disappear_actions", felVar.i, jsonParserComponent.Y2);
        wcx.q(yf90Var, jSONObject, "dynamic_height", felVar.j);
        wcx.w(yf90Var, jSONObject, "extensions", felVar.k, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", felVar.l, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", felVar.m, jsonParserComponent.U3);
        wcx.q(yf90Var, jSONObject, "has_separator", felVar.n);
        exq exqVar2 = felVar.o;
        i3y i3yVar = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar2, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", felVar.p);
        wcx.w(yf90Var, jSONObject, "items", felVar.q, jsonParserComponent.o8);
        wcx.u(yf90Var, jSONObject, "layout_provider", felVar.r, jsonParserComponent.Y4);
        exq exqVar3 = felVar.s;
        i3y i3yVar2 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar3, i3yVar2);
        wcx.u(yf90Var, jSONObject, "paddings", felVar.t, i3yVar2);
        wcx.q(yf90Var, jSONObject, "restrict_parent_scroll", felVar.u);
        wcx.q(yf90Var, jSONObject, "reuse_id", felVar.v);
        wcx.q(yf90Var, jSONObject, "row_span", felVar.w);
        wcx.w(yf90Var, jSONObject, "selected_actions", felVar.x, jsonParserComponent.u1);
        wcx.q(yf90Var, jSONObject, "selected_tab", felVar.y);
        wcx.p(felVar.z, b.a, yf90Var, "separator_color", jSONObject);
        wcx.u(yf90Var, jSONObject, "separator_paddings", felVar.A, i3yVar2);
        wcx.q(yf90Var, jSONObject, "switch_tabs_by_content_swipe_enabled", felVar.B);
        wcx.u(yf90Var, jSONObject, "tab_title_delimiter", felVar.C, jsonParserComponent.l8);
        wcx.u(yf90Var, jSONObject, "tab_title_style", felVar.D, jsonParserComponent.i8);
        wcx.u(yf90Var, jSONObject, "title_paddings", felVar.E, i3yVar2);
        wcx.w(yf90Var, jSONObject, "tooltips", felVar.F, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", felVar.G, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", felVar.H, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", felVar.I, jsonParserComponent.e2);
        exq exqVar4 = felVar.J;
        i3y i3yVar3 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar4, i3yVar3);
        wcx.u(yf90Var, jSONObject, "transition_out", felVar.K, i3yVar3);
        wcx.v(yf90Var, jSONObject, felVar.L, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "tabs");
        wcx.w(yf90Var, jSONObject, "variable_triggers", felVar.M, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", felVar.N, jsonParserComponent.G9);
        wcx.p(felVar.O, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar5 = felVar.P;
        i3y i3yVar4 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar5, i3yVar4);
        wcx.w(yf90Var, jSONObject, "visibility_actions", felVar.Q, i3yVar4);
        wcx.u(yf90Var, jSONObject, "width", felVar.R, i3yVar);
        return jSONObject;
    }
}
