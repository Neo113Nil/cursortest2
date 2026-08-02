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
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.y;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ulk implements zsq0, nyi {
    public final JsonParserComponent a;

    public ulk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v53, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final clk a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = y.e;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", y.f, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        tlk tlkVar = y.h;
        kvo kvoVar = y.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, tlkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression e4 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar3, y.i, null);
        Object opt = jSONObject.opt("custom_props");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        JSONObject jSONObject2 = (JSONObject) opt;
        Object opt2 = jSONObject.opt("custom_type");
        if (opt2 == obj) {
            opt2 = null;
        }
        if (opt2 == null) {
            throw fg90.h("custom_type", jSONObject);
        }
        String str = (String) opt2;
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = y.b;
        }
        DivSize divSize2 = divSize;
        Object opt3 = jSONObject.opt("id");
        if (opt3 == obj) {
            opt3 = null;
        }
        String str2 = (String) (opt3 != null ? opt3 : null);
        List O6 = wwg.O(yf90Var, jSONObject, "items", jsonParserComponent.X9);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        Expression e5 = a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e6 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar3, y.j, null);
        List O7 = wwg.O(yf90Var, jSONObject, "selected_actions", jsonParserComponent.t1);
        List O8 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O9 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, y.k);
        List O10 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O11 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar2 = y.g;
        tls tlsVar4 = DivVisibility.FROM_STRING;
        kvo kvoVar3 = y.c;
        ?? e7 = a.e(yf90Var, jSONObject, "visibility", qkjVar2, tlsVar4, kbsVar, kvoVar3);
        if (e7 != 0) {
            kvoVar3 = e7;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O12 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = y.d;
        }
        return new clk(divAccessibility, e, e2, kvoVar2, O, O2, divBorder, e4, jSONObject2, str, O3, O4, divFocus, O5, divSize2, str2, O6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, e5, e6, O7, O8, divTransform, O9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O10, O11, kvoVar3, divVisibilityAction, O12, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, clk clkVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = clkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        a.h(yf90Var, jSONObject, "alignment_horizontal", clkVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", clkVar.c, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, clkVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", clkVar.e, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, clkVar.f, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", clkVar.g, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "column_span", clkVar.h);
        wwg.Z(yf90Var, jSONObject, "custom_props", clkVar.i);
        wwg.Z(yf90Var, jSONObject, "custom_type", clkVar.j);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", clkVar.k, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "extensions", clkVar.l, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", clkVar.m, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", clkVar.n, jsonParserComponent.T3);
        DivSize divSize = clkVar.o;
        i3y i3yVar = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", clkVar.p);
        wwg.c0(yf90Var, jSONObject, "items", clkVar.q, jsonParserComponent.X9);
        wwg.b0(yf90Var, jSONObject, "layout_provider", clkVar.r, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = clkVar.s;
        i3y i3yVar2 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar2);
        wwg.b0(yf90Var, jSONObject, "paddings", clkVar.t, i3yVar2);
        a.g(yf90Var, jSONObject, "reuse_id", clkVar.u);
        a.g(yf90Var, jSONObject, "row_span", clkVar.v);
        wwg.c0(yf90Var, jSONObject, "selected_actions", clkVar.w, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "tooltips", clkVar.x, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", clkVar.y, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", clkVar.z, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", clkVar.A, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = clkVar.B;
        i3y i3yVar3 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "transition_out", clkVar.C, i3yVar3);
        wwg.d0(yf90Var, jSONObject, clkVar.D, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "custom");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", clkVar.E, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", clkVar.F, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", clkVar.G, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = clkVar.H;
        i3y i3yVar4 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", clkVar.I, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "width", clkVar.J, i3yVar);
        return jSONObject;
    }
}
