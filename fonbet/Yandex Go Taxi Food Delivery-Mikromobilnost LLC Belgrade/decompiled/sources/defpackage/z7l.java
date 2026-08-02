package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
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
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.n1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class z7l implements zsq0, nyi {
    public final JsonParserComponent a;

    public z7l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v39, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v66, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final x7l a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = n1.j;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", n1.k, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        ivk ivkVar = n1.o;
        kvo kvoVar = n1.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, ivkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression e4 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar3, n1.p, null);
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression e5 = a.e(yf90Var, jSONObject, "font_family", umsVar, abl0Var, kbsVar, null);
        ivk ivkVar2 = n1.q;
        kvo kvoVar3 = n1.b;
        ?? e6 = a.e(yf90Var, jSONObject, "font_size", tmsVar, tlsVar3, ivkVar2, kvoVar3);
        kvo kvoVar4 = e6 == 0 ? kvoVar3 : e6;
        qkj qkjVar2 = n1.l;
        tls tlsVar4 = DivSizeUnit.FROM_STRING;
        kvo kvoVar5 = n1.c;
        ?? e7 = a.e(yf90Var, jSONObject, "font_size_unit", qkjVar2, tlsVar4, kbsVar, kvoVar5);
        kvo kvoVar6 = e7 == 0 ? kvoVar5 : e7;
        Expression e8 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, abl0Var, kbsVar, null);
        Expression e9 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, n1.m, DivFontWeight.FROM_STRING, kbsVar, null);
        Expression e10 = a.e(yf90Var, jSONObject, "font_weight_value", tmsVar, tlsVar3, n1.r, null);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = n1.d;
        }
        DivSize divSize2 = divSize;
        rms rmsVar = wm11.f;
        tls tlsVar5 = b.b;
        kvo kvoVar7 = n1.e;
        ?? e11 = a.e(yf90Var, jSONObject, "hint_color", rmsVar, tlsVar5, kbsVar, kvoVar7);
        kvo kvoVar8 = e11 == 0 ? kvoVar7 : e11;
        Expression e12 = a.e(yf90Var, jSONObject, "hint_text", umsVar, abl0Var, kbsVar, null);
        Object opt = jSONObject.opt("id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        kvo kvoVar9 = n1.f;
        ?? e13 = a.e(yf90Var, jSONObject, "letter_spacing", smsVar, tlsVar2, kbsVar, kvoVar9);
        kvo kvoVar10 = e13 == 0 ? kvoVar9 : e13;
        Expression e14 = a.e(yf90Var, jSONObject, "line_height", tmsVar, tlsVar3, n1.s, null);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        List J = wwg.J(yf90Var, jSONObject, "options", jsonParserComponent.T6, n1.t);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        Expression e15 = a.e(yf90Var, jSONObject, "reuse_id", umsVar, abl0Var, kbsVar, null);
        Expression e16 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar3, n1.u, null);
        List O6 = wwg.O(yf90Var, jSONObject, "selected_actions", jsonParserComponent.t1);
        kvo kvoVar11 = n1.g;
        ?? e17 = a.e(yf90Var, jSONObject, "text_color", rmsVar, tlsVar5, kbsVar, kvoVar11);
        kvo kvoVar12 = e17 == 0 ? kvoVar11 : e17;
        List O7 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O8 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, n1.v);
        Object opt2 = jSONObject.opt("value_variable");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw fg90.h("value_variable", jSONObject);
        }
        String str2 = (String) obj2;
        List O9 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O10 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar3 = n1.n;
        tls tlsVar6 = DivVisibility.FROM_STRING;
        kvo kvoVar13 = n1.h;
        ?? e18 = a.e(yf90Var, jSONObject, "visibility", qkjVar3, tlsVar6, kbsVar, kvoVar13);
        if (e18 != 0) {
            kvoVar13 = e18;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O11 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = n1.i;
        }
        return new x7l(divAccessibility, e, e2, kvoVar2, O, O2, divBorder, e4, O3, O4, divFocus, e5, kvoVar4, kvoVar6, e8, e9, e10, O5, divSize2, kvoVar8, e12, str, divLayoutProvider, kvoVar10, e14, divEdgeInsets, J, divEdgeInsets2, e15, e16, O6, kvoVar12, O7, divTransform, O8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, str2, O9, O10, kvoVar13, divVisibilityAction, O11, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, x7l x7lVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = x7lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        a.h(yf90Var, jSONObject, "alignment_horizontal", x7lVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", x7lVar.c, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, x7lVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", x7lVar.e, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, x7lVar.f, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", x7lVar.g, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "column_span", x7lVar.h);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", x7lVar.i, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "extensions", x7lVar.j, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", x7lVar.k, jsonParserComponent.K3);
        a.g(yf90Var, jSONObject, "font_family", x7lVar.l);
        a.g(yf90Var, jSONObject, "font_size", x7lVar.m);
        a.h(yf90Var, jSONObject, "font_size_unit", x7lVar.n, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, x7lVar.o);
        a.h(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, x7lVar.p, DivFontWeight.TO_STRING);
        a.g(yf90Var, jSONObject, "font_weight_value", x7lVar.q);
        wwg.c0(yf90Var, jSONObject, "functions", x7lVar.r, jsonParserComponent.T3);
        DivSize divSize = x7lVar.s;
        i3y i3yVar = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar);
        Expression expression = x7lVar.t;
        tls tlsVar = b.a;
        a.h(yf90Var, jSONObject, "hint_color", expression, tlsVar);
        a.g(yf90Var, jSONObject, "hint_text", x7lVar.u);
        wwg.Z(yf90Var, jSONObject, "id", x7lVar.v);
        wwg.b0(yf90Var, jSONObject, "layout_provider", x7lVar.w, jsonParserComponent.X4);
        a.g(yf90Var, jSONObject, "letter_spacing", x7lVar.x);
        a.g(yf90Var, jSONObject, "line_height", x7lVar.y);
        DivEdgeInsets divEdgeInsets = x7lVar.z;
        i3y i3yVar2 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "options", x7lVar.A, jsonParserComponent.T6);
        wwg.b0(yf90Var, jSONObject, "paddings", x7lVar.B, i3yVar2);
        a.g(yf90Var, jSONObject, "reuse_id", x7lVar.C);
        a.g(yf90Var, jSONObject, "row_span", x7lVar.D);
        wwg.c0(yf90Var, jSONObject, "selected_actions", x7lVar.E, jsonParserComponent.t1);
        a.h(yf90Var, jSONObject, "text_color", x7lVar.F, tlsVar);
        wwg.c0(yf90Var, jSONObject, "tooltips", x7lVar.G, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", x7lVar.H, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", x7lVar.I, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", x7lVar.J, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = x7lVar.K;
        i3y i3yVar3 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "transition_out", x7lVar.L, i3yVar3);
        wwg.d0(yf90Var, jSONObject, x7lVar.M, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "select");
        wwg.Z(yf90Var, jSONObject, "value_variable", x7lVar.N);
        wwg.c0(yf90Var, jSONObject, "variable_triggers", x7lVar.O, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", x7lVar.P, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", x7lVar.Q, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = x7lVar.R;
        i3y i3yVar4 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", x7lVar.S, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "width", x7lVar.T, i3yVar);
        return jSONObject;
    }
}
