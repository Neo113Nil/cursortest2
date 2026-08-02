package defpackage;

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

/* loaded from: classes.dex */
public final class zdl implements qfy0 {
    public final JsonParserComponent a;

    public zdl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v39, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v41, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v70, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mdl a(yf90 yf90Var, fel felVar, JSONObject jSONObject) {
        exq exqVar = felVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.J;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.T9;
        i3y i3yVar4 = jsonParserComponent.I1;
        i3y i3yVar5 = jsonParserComponent.K1;
        i3y i3yVar6 = jsonParserComponent.o7;
        i3y i3yVar7 = jsonParserComponent.q7;
        i3y i3yVar8 = jsonParserComponent.g3;
        i3y i3yVar9 = jsonParserComponent.i3;
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, jsonParserComponent.H);
        Expression l = xcx.l(yf90Var, felVar.b, jSONObject, "alignment_horizontal", k2.m, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, felVar.c, jSONObject, "alignment_vertical", k2.n, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = felVar.d;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        y7l y7lVar = k2.p;
        kvo kvoVar = k2.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, y7lVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s = xcx.s(yf90Var, felVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, felVar.f, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, felVar.g, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar3 = felVar.h;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression m = xcx.m(yf90Var, exqVar3, jSONObject, "column_span", tmsVar, tlsVar2, k2.q);
        List s3 = xcx.s(yf90Var, felVar.i, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        exq exqVar4 = felVar.j;
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar3 = k2.b;
        ?? o = xcx.o(yf90Var, exqVar4, jSONObject, "dynamic_height", wmsVar, tlsVar3, kvoVar3);
        kvo kvoVar4 = o == 0 ? kvoVar3 : o;
        List s4 = xcx.s(yf90Var, felVar.k, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, felVar.l, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s5 = xcx.s(yf90Var, felVar.m, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        exq exqVar5 = felVar.n;
        kvo kvoVar5 = k2.c;
        ?? o2 = xcx.o(yf90Var, exqVar5, jSONObject, "has_separator", wmsVar, tlsVar3, kvoVar5);
        kvo kvoVar6 = o2 == 0 ? kvoVar5 : o2;
        DivSize divSize = (DivSize) xcx.h(yf90Var, felVar.o, jSONObject, "height", i3yVar7, i3yVar6);
        if (divSize == null) {
            divSize = k2.d;
        }
        DivSize divSize2 = divSize;
        String str = (String) xcx.i(felVar.p, q5z.c, yf90Var, "id", jSONObject);
        List g = xcx.g(yf90Var, felVar.q, jSONObject, "items", jsonParserComponent.p8, jsonParserComponent.n8, k2.r);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, felVar.r, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, felVar.s, jSONObject, "margins", i3yVar9, i3yVar8);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, felVar.t, jSONObject, "paddings", i3yVar9, i3yVar8);
        exq exqVar6 = felVar.u;
        kvo kvoVar7 = k2.e;
        ?? o3 = xcx.o(yf90Var, exqVar6, jSONObject, "restrict_parent_scroll", wmsVar, tlsVar3, kvoVar7);
        kvo kvoVar8 = o3 == 0 ? kvoVar7 : o3;
        Expression k = xcx.k(yf90Var, felVar.v, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, felVar.w, jSONObject, "row_span", tmsVar, tlsVar2, k2.s);
        List s6 = xcx.s(yf90Var, felVar.x, jSONObject, "selected_actions", jsonParserComponent.v1, jsonParserComponent.t1);
        exq exqVar7 = felVar.y;
        y7l y7lVar2 = k2.t;
        kvo kvoVar9 = k2.f;
        ?? n2 = xcx.n(yf90Var, exqVar7, jSONObject, "selected_tab", tmsVar, tlsVar2, y7lVar2, kvoVar9);
        if (n2 != 0) {
            kvoVar9 = n2;
        }
        exq exqVar8 = felVar.z;
        rms rmsVar = wm11.f;
        tls tlsVar4 = b.b;
        kvo kvoVar10 = k2.g;
        ?? o4 = xcx.o(yf90Var, exqVar8, jSONObject, "separator_color", rmsVar, tlsVar4, kvoVar10);
        kvo kvoVar11 = o4 == 0 ? kvoVar10 : o4;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) xcx.h(yf90Var, felVar.A, jSONObject, "separator_paddings", i3yVar9, i3yVar8);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = k2.h;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        exq exqVar9 = felVar.B;
        kvo kvoVar12 = k2.i;
        ?? o5 = xcx.o(yf90Var, exqVar9, jSONObject, "switch_tabs_by_content_swipe_enabled", wmsVar, tlsVar3, kvoVar12);
        kvo kvoVar13 = o5 == 0 ? kvoVar12 : o5;
        ldl ldlVar = (ldl) xcx.h(yf90Var, felVar.C, jSONObject, "tab_title_delimiter", jsonParserComponent.m8, jsonParserComponent.k8);
        DivTabs$TabTitleStyle divTabs$TabTitleStyle = (DivTabs$TabTitleStyle) xcx.h(yf90Var, felVar.D, jSONObject, "tab_title_style", jsonParserComponent.j8, jsonParserComponent.h8);
        DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) xcx.h(yf90Var, felVar.E, jSONObject, "title_paddings", i3yVar9, i3yVar8);
        if (divEdgeInsets5 == null) {
            divEdgeInsets5 = k2.j;
        }
        DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
        List s7 = xcx.s(yf90Var, felVar.F, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, felVar.G, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s8 = xcx.s(yf90Var, felVar.H, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, felVar.I, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, felVar.J, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, felVar.K, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, felVar.L, jSONObject, DivTransitionTrigger.FROM_STRING, k2.u);
        List s9 = xcx.s(yf90Var, felVar.M, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s10 = xcx.s(yf90Var, felVar.N, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar10 = felVar.O;
        qkj qkjVar = k2.o;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar14 = k2.k;
        ?? o6 = xcx.o(yf90Var, exqVar10, jSONObject, "visibility", qkjVar, tlsVar5, kvoVar14);
        if (o6 != 0) {
            kvoVar14 = o6;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, felVar.P, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s11 = xcx.s(yf90Var, felVar.Q, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, felVar.R, jSONObject, "width", i3yVar7, i3yVar6);
        if (divSize3 == null) {
            divSize3 = k2.l;
        }
        return new mdl(divAccessibility, l, l2, kvoVar2, s, s2, divBorder, m, s3, kvoVar4, s4, divFocus, s5, kvoVar6, divSize2, str, g, divLayoutProvider, divEdgeInsets, divEdgeInsets2, kvoVar8, k, m2, s6, kvoVar9, kvoVar11, divEdgeInsets4, kvoVar13, ldlVar, divTabs$TabTitleStyle, divEdgeInsets6, s7, divTransform, s8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s9, s10, kvoVar14, divVisibilityAction, s11, divSize3);
    }
}
