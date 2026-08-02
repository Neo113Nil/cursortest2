package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs$TabTitleStyle;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.k2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xdl implements zsq0, nyi {
    public final JsonParserComponent a;

    public xdl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v36, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v49, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v72, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final mdl a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.o7;
        i3y i3yVar5 = jsonParserComponent.g3;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = k2.m;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", k2.n, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        y7l y7lVar = k2.p;
        kvo kvoVar = k2.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, y7lVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression e4 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar3, k2.q, null);
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar3 = k2.b;
        ?? e5 = a.e(yf90Var, jSONObject, "dynamic_height", wmsVar, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e5 == 0 ? kvoVar3 : e5;
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        kvo kvoVar5 = k2.c;
        ?? e6 = a.e(yf90Var, jSONObject, "has_separator", wmsVar, tlsVar4, kbsVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar4);
        if (divSize == null) {
            divSize = k2.d;
        }
        DivSize divSize2 = divSize;
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        List J = wwg.J(yf90Var, jSONObject, "items", jsonParserComponent.n8, k2.r);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar5);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar5);
        kvo kvoVar7 = k2.e;
        ?? e7 = a.e(yf90Var, jSONObject, "restrict_parent_scroll", wmsVar, tlsVar4, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        Expression e8 = a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e9 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar3, k2.s, null);
        List O6 = wwg.O(yf90Var, jSONObject, "selected_actions", jsonParserComponent.t1);
        y7l y7lVar2 = k2.t;
        kvo kvoVar9 = k2.f;
        ?? e10 = a.e(yf90Var, jSONObject, "selected_tab", tmsVar, tlsVar3, y7lVar2, kvoVar9);
        kvo kvoVar10 = e10 == 0 ? kvoVar9 : e10;
        rms rmsVar = wm11.f;
        tls tlsVar5 = b.b;
        kvo kvoVar11 = k2.g;
        ?? e11 = a.e(yf90Var, jSONObject, "separator_color", rmsVar, tlsVar5, kbsVar, kvoVar11);
        kvo kvoVar12 = e11 == 0 ? kvoVar11 : e11;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "separator_paddings", i3yVar5);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = k2.h;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        kvo kvoVar13 = k2.i;
        ?? e12 = a.e(yf90Var, jSONObject, "switch_tabs_by_content_swipe_enabled", wmsVar, tlsVar4, kbsVar, kvoVar13);
        kvo kvoVar14 = e12 == 0 ? kvoVar13 : e12;
        ldl ldlVar = (ldl) wwg.M(yf90Var, jSONObject, "tab_title_delimiter", jsonParserComponent.k8);
        DivTabs$TabTitleStyle divTabs$TabTitleStyle = (DivTabs$TabTitleStyle) wwg.M(yf90Var, jSONObject, "tab_title_style", jsonParserComponent.h8);
        DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "title_paddings", i3yVar5);
        if (divEdgeInsets5 == null) {
            divEdgeInsets5 = k2.j;
        }
        DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
        List O7 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O8 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, k2.u);
        List O9 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O10 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar2 = k2.o;
        tls tlsVar6 = DivVisibility.FROM_STRING;
        kvo kvoVar15 = k2.k;
        ?? e13 = a.e(yf90Var, jSONObject, "visibility", qkjVar2, tlsVar6, kbsVar, kvoVar15);
        if (e13 != 0) {
            kvoVar15 = e13;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O11 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar4);
        if (divSize3 == null) {
            divSize3 = k2.l;
        }
        return new mdl(divAccessibility, e, e2, kvoVar2, O, O2, divBorder, e4, O3, kvoVar4, O4, divFocus, O5, kvoVar6, divSize2, str, J, divLayoutProvider, divEdgeInsets, divEdgeInsets2, kvoVar8, e8, e9, O6, kvoVar10, kvoVar12, divEdgeInsets4, kvoVar14, ldlVar, divTabs$TabTitleStyle, divEdgeInsets6, O7, divTransform, O8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O9, O10, kvoVar15, divVisibilityAction, O11, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, mdl mdlVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = mdlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        a.h(yf90Var, jSONObject, "alignment_horizontal", mdlVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", mdlVar.c, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, mdlVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", mdlVar.e, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, mdlVar.f, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", mdlVar.g, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "column_span", mdlVar.h);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", mdlVar.i, jsonParserComponent.X2);
        a.g(yf90Var, jSONObject, "dynamic_height", mdlVar.j);
        wwg.c0(yf90Var, jSONObject, "extensions", mdlVar.k, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", mdlVar.l, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", mdlVar.m, jsonParserComponent.T3);
        a.g(yf90Var, jSONObject, "has_separator", mdlVar.n);
        DivSize divSize = mdlVar.o;
        i3y i3yVar = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", mdlVar.p);
        wwg.c0(yf90Var, jSONObject, "items", mdlVar.q, jsonParserComponent.n8);
        wwg.b0(yf90Var, jSONObject, "layout_provider", mdlVar.r, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = mdlVar.s;
        i3y i3yVar2 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar2);
        wwg.b0(yf90Var, jSONObject, "paddings", mdlVar.t, i3yVar2);
        a.g(yf90Var, jSONObject, "restrict_parent_scroll", mdlVar.u);
        a.g(yf90Var, jSONObject, "reuse_id", mdlVar.v);
        a.g(yf90Var, jSONObject, "row_span", mdlVar.w);
        wwg.c0(yf90Var, jSONObject, "selected_actions", mdlVar.x, jsonParserComponent.t1);
        a.g(yf90Var, jSONObject, "selected_tab", mdlVar.y);
        a.h(yf90Var, jSONObject, "separator_color", mdlVar.z, b.a);
        wwg.b0(yf90Var, jSONObject, "separator_paddings", mdlVar.A, i3yVar2);
        a.g(yf90Var, jSONObject, "switch_tabs_by_content_swipe_enabled", mdlVar.B);
        wwg.b0(yf90Var, jSONObject, "tab_title_delimiter", mdlVar.C, jsonParserComponent.k8);
        wwg.b0(yf90Var, jSONObject, "tab_title_style", mdlVar.D, jsonParserComponent.h8);
        wwg.b0(yf90Var, jSONObject, "title_paddings", mdlVar.E, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "tooltips", mdlVar.F, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", mdlVar.G, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", mdlVar.H, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", mdlVar.I, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = mdlVar.J;
        i3y i3yVar3 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "transition_out", mdlVar.K, i3yVar3);
        wwg.d0(yf90Var, jSONObject, mdlVar.L, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "tabs");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", mdlVar.M, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", mdlVar.N, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", mdlVar.O, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = mdlVar.P;
        i3y i3yVar4 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", mdlVar.Q, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "width", mdlVar.R, i3yVar);
        return jSONObject;
    }
}
