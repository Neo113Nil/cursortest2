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

/* loaded from: classes.dex */
public final class wlk implements qfy0 {
    public final JsonParserComponent a;

    public wlk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v50, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final clk a(yf90 yf90Var, emk emkVar, JSONObject jSONObject) {
        exq exqVar = emkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.J;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.T9;
        i3y i3yVar4 = jsonParserComponent.I1;
        i3y i3yVar5 = jsonParserComponent.K1;
        i3y i3yVar6 = jsonParserComponent.g3;
        i3y i3yVar7 = jsonParserComponent.i3;
        i3y i3yVar8 = jsonParserComponent.o7;
        i3y i3yVar9 = jsonParserComponent.q7;
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, jsonParserComponent.H);
        Expression l = xcx.l(yf90Var, emkVar.b, jSONObject, "alignment_horizontal", y.e, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, emkVar.c, jSONObject, "alignment_vertical", y.f, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = emkVar.d;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        tlk tlkVar = y.h;
        kvo kvoVar = y.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, tlkVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s = xcx.s(yf90Var, emkVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, emkVar.f, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, emkVar.g, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar3 = emkVar.h;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression m = xcx.m(yf90Var, exqVar3, jSONObject, "column_span", tmsVar, tlsVar2, y.i);
        exq exqVar4 = emkVar.i;
        abl0 abl0Var = q5z.c;
        JSONObject jSONObject2 = (JSONObject) xcx.i(exqVar4, abl0Var, yf90Var, "custom_props", jSONObject);
        String str = (String) xcx.a(emkVar.j, jSONObject, "custom_type", abl0Var, q5z.b);
        List s3 = xcx.s(yf90Var, emkVar.k, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, emkVar.l, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, emkVar.m, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s5 = xcx.s(yf90Var, emkVar.n, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, emkVar.o, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = y.b;
        }
        DivSize divSize2 = divSize;
        String str2 = (String) xcx.i(emkVar.p, abl0Var, yf90Var, "id", jSONObject);
        List s6 = xcx.s(yf90Var, emkVar.q, jSONObject, "items", jsonParserComponent.Z9, jsonParserComponent.X9);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, emkVar.r, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, emkVar.s, jSONObject, "margins", i3yVar7, i3yVar6);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, emkVar.t, jSONObject, "paddings", i3yVar7, i3yVar6);
        Expression k = xcx.k(yf90Var, emkVar.u, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, emkVar.v, jSONObject, "row_span", tmsVar, tlsVar2, y.j);
        List s7 = xcx.s(yf90Var, emkVar.w, jSONObject, "selected_actions", jsonParserComponent.v1, jsonParserComponent.t1);
        List s8 = xcx.s(yf90Var, emkVar.x, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, emkVar.y, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s9 = xcx.s(yf90Var, emkVar.z, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, emkVar.A, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, emkVar.B, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, emkVar.C, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, emkVar.D, jSONObject, DivTransitionTrigger.FROM_STRING, y.k);
        List s10 = xcx.s(yf90Var, emkVar.E, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s11 = xcx.s(yf90Var, emkVar.F, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar5 = emkVar.G;
        qkj qkjVar = y.g;
        tls tlsVar3 = DivVisibility.FROM_STRING;
        kvo kvoVar2 = y.c;
        ?? o = xcx.o(yf90Var, exqVar5, jSONObject, "visibility", qkjVar, tlsVar3, kvoVar2);
        if (o != 0) {
            kvoVar2 = o;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, emkVar.H, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s12 = xcx.s(yf90Var, emkVar.I, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, emkVar.J, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = y.d;
        }
        return new clk(divAccessibility, l, l2, kvoVar, s, s2, divBorder, m, jSONObject2, str, s3, s4, divFocus, s5, divSize2, str2, s6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, k, m2, s7, s8, divTransform, s9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s10, s11, kvoVar2, divVisibilityAction, s12, divSize3);
    }
}
