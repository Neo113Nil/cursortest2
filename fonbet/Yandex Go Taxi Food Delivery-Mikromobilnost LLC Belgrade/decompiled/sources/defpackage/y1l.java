package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivPager$ItemAlignment;
import com.yandex.div2.DivPager$Orientation;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y1l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public y1l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final r2l c(yf90 yf90Var, r2l r2lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = r2lVar != null ? r2lVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = h1.l;
        exq exqVar2 = r2lVar != null ? r2lVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", h1.m, i, r2lVar != null ? r2lVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, r2lVar != null ? r2lVar.d : null, b.g, h1.r);
        exq k = wcx.k(Q, jSONObject, "animators", i, r2lVar != null ? r2lVar.e : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, r2lVar != null ? r2lVar.f : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, r2lVar != null ? r2lVar.g : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar3 = r2lVar != null ? r2lVar.h : null;
        tls tlsVar2 = b.h;
        exq j4 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar3, tlsVar2, h1.s);
        qkj qkjVar2 = h1.n;
        exq exqVar4 = r2lVar != null ? r2lVar.i : null;
        tls tlsVar3 = DivPager$ItemAlignment.FROM_STRING;
        exq j5 = wcx.j(Q, jSONObject, "cross_axis_alignment", qkjVar2, i, exqVar4, tlsVar3, kbsVar);
        exq j6 = wcx.j(Q, jSONObject, "default_item", tmsVar, i, r2lVar != null ? r2lVar.j : null, tlsVar2, h1.t);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, r2lVar != null ? r2lVar.k : null, jsonParserComponent.Y2);
        exq k4 = wcx.k(Q, jSONObject, "extensions", i, r2lVar != null ? r2lVar.l : null, jsonParserComponent.k3);
        exq i4 = wcx.i(Q, jSONObject, "focus", i, r2lVar != null ? r2lVar.m : null, jsonParserComponent.L3);
        exq k5 = wcx.k(Q, jSONObject, "functions", i, r2lVar != null ? r2lVar.n : null, jsonParserComponent.U3);
        exq i5 = wcx.i(Q, jSONObject, "height", i, r2lVar != null ? r2lVar.o : null, i3yVar5);
        exq exqVar5 = r2lVar != null ? r2lVar.p : null;
        abl0 abl0Var = q5z.c;
        exq h = wcx.h(Q, jSONObject, "id", i, exqVar5, abl0Var);
        wms wmsVar = wm11.a;
        exq exqVar6 = r2lVar != null ? r2lVar.q : null;
        tls tlsVar4 = b.f;
        return new r2l(i2, j, j2, j3, k, k2, i3, j4, j5, j6, k3, k4, i4, k5, i5, h, wcx.j(Q, jSONObject, "infinite_scroll", wmsVar, i, exqVar6, tlsVar4, kbsVar), wcx.i(Q, jSONObject, "item_builder", i, r2lVar != null ? r2lVar.r : null, jsonParserComponent.n2), wcx.i(Q, jSONObject, "item_spacing", i, r2lVar != null ? r2lVar.s : null, jsonParserComponent.F3), wcx.k(Q, jSONObject, "items", i, r2lVar != null ? r2lVar.t : null, jsonParserComponent.Y9), wcx.c(Q, jSONObject, "layout_mode", i, r2lVar != null ? r2lVar.u : null, jsonParserComponent.I5), wcx.i(Q, jSONObject, "layout_provider", i, r2lVar != null ? r2lVar.v : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "margins", i, r2lVar != null ? r2lVar.w : null, i3yVar4), wcx.j(Q, jSONObject, "orientation", h1.o, i, r2lVar != null ? r2lVar.x : null, DivPager$Orientation.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "paddings", i, r2lVar != null ? r2lVar.y : null, i3yVar4), wcx.i(Q, jSONObject, "page_transformation", i, r2lVar != null ? r2lVar.z : null, jsonParserComponent.F5), wcx.j(Q, jSONObject, "restrict_parent_scroll", wmsVar, i, r2lVar != null ? r2lVar.A : null, tlsVar4, kbsVar), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, r2lVar != null ? r2lVar.B : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, r2lVar != null ? r2lVar.C : null, tlsVar2, h1.u), wcx.j(Q, jSONObject, "scroll_axis_alignment", h1.p, i, r2lVar != null ? r2lVar.D : null, tlsVar3, kbsVar), wcx.k(Q, jSONObject, "selected_actions", i, r2lVar != null ? r2lVar.E : null, jsonParserComponent.u1), wcx.k(Q, jSONObject, "tooltips", i, r2lVar != null ? r2lVar.F : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, r2lVar != null ? r2lVar.G : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, r2lVar != null ? r2lVar.H : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, r2lVar != null ? r2lVar.I : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, r2lVar != null ? r2lVar.J : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, r2lVar != null ? r2lVar.K : null, i3yVar3), wcx.l(Q, jSONObject, i, r2lVar != null ? r2lVar.L : null, DivTransitionTrigger.FROM_STRING, h1.v), wcx.k(Q, jSONObject, "variable_triggers", i, r2lVar != null ? r2lVar.M : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, r2lVar != null ? r2lVar.N : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", h1.q, i, r2lVar != null ? r2lVar.O : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, r2lVar != null ? r2lVar.P : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, r2lVar != null ? r2lVar.Q : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, r2lVar != null ? r2lVar.R : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, r2l r2lVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = r2lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(r2lVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(r2lVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, r2lVar.d);
        wcx.w(yf90Var, jSONObject, "animators", r2lVar.e, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, r2lVar.f, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", r2lVar.g, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", r2lVar.h);
        exq exqVar2 = r2lVar.i;
        tls tlsVar = DivPager$ItemAlignment.TO_STRING;
        wcx.p(exqVar2, tlsVar, yf90Var, "cross_axis_alignment", jSONObject);
        wcx.q(yf90Var, jSONObject, "default_item", r2lVar.j);
        wcx.w(yf90Var, jSONObject, "disappear_actions", r2lVar.k, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "extensions", r2lVar.l, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", r2lVar.m, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", r2lVar.n, jsonParserComponent.U3);
        exq exqVar3 = r2lVar.o;
        i3y i3yVar = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar3, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", r2lVar.p);
        wcx.q(yf90Var, jSONObject, "infinite_scroll", r2lVar.q);
        wcx.u(yf90Var, jSONObject, "item_builder", r2lVar.r, jsonParserComponent.n2);
        wcx.u(yf90Var, jSONObject, "item_spacing", r2lVar.s, jsonParserComponent.F3);
        wcx.w(yf90Var, jSONObject, "items", r2lVar.t, jsonParserComponent.Y9);
        wcx.u(yf90Var, jSONObject, "layout_mode", r2lVar.u, jsonParserComponent.I5);
        wcx.u(yf90Var, jSONObject, "layout_provider", r2lVar.v, jsonParserComponent.Y4);
        exq exqVar4 = r2lVar.w;
        i3y i3yVar2 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar4, i3yVar2);
        wcx.p(r2lVar.x, DivPager$Orientation.TO_STRING, yf90Var, "orientation", jSONObject);
        wcx.u(yf90Var, jSONObject, "paddings", r2lVar.y, i3yVar2);
        wcx.u(yf90Var, jSONObject, "page_transformation", r2lVar.z, jsonParserComponent.F5);
        wcx.q(yf90Var, jSONObject, "restrict_parent_scroll", r2lVar.A);
        wcx.q(yf90Var, jSONObject, "reuse_id", r2lVar.B);
        wcx.q(yf90Var, jSONObject, "row_span", r2lVar.C);
        wcx.p(r2lVar.D, tlsVar, yf90Var, "scroll_axis_alignment", jSONObject);
        wcx.w(yf90Var, jSONObject, "selected_actions", r2lVar.E, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "tooltips", r2lVar.F, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", r2lVar.G, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", r2lVar.H, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", r2lVar.I, jsonParserComponent.e2);
        exq exqVar5 = r2lVar.J;
        i3y i3yVar3 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar5, i3yVar3);
        wcx.u(yf90Var, jSONObject, "transition_out", r2lVar.K, i3yVar3);
        wcx.v(yf90Var, jSONObject, r2lVar.L, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "pager");
        wcx.w(yf90Var, jSONObject, "variable_triggers", r2lVar.M, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", r2lVar.N, jsonParserComponent.G9);
        wcx.p(r2lVar.O, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar6 = r2lVar.P;
        i3y i3yVar4 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar6, i3yVar4);
        wcx.w(yf90Var, jSONObject, "visibility_actions", r2lVar.Q, i3yVar4);
        wcx.u(yf90Var, jSONObject, "width", r2lVar.R, i3yVar);
        return jSONObject;
    }
}
