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
import com.yandex.div2.i2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zcl implements zsq0, nyi {
    public final JsonParserComponent a;

    public zcl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v53, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ycl a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = i2.f;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", i2.g, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        y7l y7lVar = i2.i;
        kvo kvoVar = i2.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, y7lVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression e4 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar3, i2.j, null);
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = i2.b;
        }
        DivSize divSize2 = divSize;
        Object opt = jSONObject.opt("id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar3 = i2.c;
        ?? e5 = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e5 == 0 ? kvoVar3 : e5;
        Object opt2 = jSONObject.opt("is_on_variable");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw fg90.h("is_on_variable", jSONObject);
        }
        String str2 = (String) obj2;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        Expression e6 = a.e(yf90Var, jSONObject, "on_color", wm11.f, b.b, kbsVar, null);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        Expression e7 = a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e8 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar3, i2.k, null);
        List O6 = wwg.O(yf90Var, jSONObject, "selected_actions", jsonParserComponent.t1);
        List O7 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O8 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, i2.l);
        List O9 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O10 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar2 = i2.h;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar5 = i2.d;
        ?? e9 = a.e(yf90Var, jSONObject, "visibility", qkjVar2, tlsVar5, kbsVar, kvoVar5);
        if (e9 != 0) {
            kvoVar5 = e9;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O11 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = i2.e;
        }
        return new ycl(divAccessibility, e, e2, kvoVar2, O, O2, divBorder, e4, O3, O4, divFocus, O5, divSize2, str, kvoVar4, str2, divLayoutProvider, divEdgeInsets, e6, divEdgeInsets2, e7, e8, O6, O7, divTransform, O8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O9, O10, kvoVar5, divVisibilityAction, O11, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ycl yclVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = yclVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        a.h(yf90Var, jSONObject, "alignment_horizontal", yclVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", yclVar.c, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, yclVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", yclVar.e, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, yclVar.f, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", yclVar.g, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "column_span", yclVar.h);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", yclVar.i, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "extensions", yclVar.j, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", yclVar.k, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", yclVar.l, jsonParserComponent.T3);
        DivSize divSize = yclVar.m;
        i3y i3yVar = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", yclVar.n);
        a.g(yf90Var, jSONObject, "is_enabled", yclVar.o);
        wwg.Z(yf90Var, jSONObject, "is_on_variable", yclVar.p);
        wwg.b0(yf90Var, jSONObject, "layout_provider", yclVar.q, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = yclVar.r;
        i3y i3yVar2 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar2);
        a.h(yf90Var, jSONObject, "on_color", yclVar.s, b.a);
        wwg.b0(yf90Var, jSONObject, "paddings", yclVar.t, i3yVar2);
        a.g(yf90Var, jSONObject, "reuse_id", yclVar.u);
        a.g(yf90Var, jSONObject, "row_span", yclVar.v);
        wwg.c0(yf90Var, jSONObject, "selected_actions", yclVar.w, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "tooltips", yclVar.x, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", yclVar.y, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", yclVar.z, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", yclVar.A, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = yclVar.B;
        i3y i3yVar3 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "transition_out", yclVar.C, i3yVar3);
        wwg.d0(yf90Var, jSONObject, yclVar.D, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "switch");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", yclVar.E, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", yclVar.F, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", yclVar.G, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = yclVar.H;
        i3y i3yVar4 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", yclVar.I, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "width", yclVar.J, i3yVar);
        return jSONObject;
    }
}
