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
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText$Truncate;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.w2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vfl implements zsq0, nyi {
    public final JsonParserComponent a;

    public vfl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v103, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v53, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v68, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v71, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v74, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v76, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v78, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v84, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v97, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v99, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ffl a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        i3y i3yVar6 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) wwg.M(yf90Var, jSONObject, "action", i3yVar6);
        pdk pdkVar = (pdk) wwg.M(yf90Var, jSONObject, "action_animation", jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = w2.a;
        }
        pdk pdkVar2 = pdkVar;
        List O = wwg.O(yf90Var, jSONObject, "actions", i3yVar6);
        qkj qkjVar = w2.r;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        qkj qkjVar2 = w2.s;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", qkjVar2, tlsVar2, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        i8l i8lVar = w2.B;
        kvo kvoVar = w2.b;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, i8lVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O2 = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        Expression e4 = a.e(yf90Var, jSONObject, "auto_ellipsize", wmsVar, tlsVar4, kbsVar, null);
        List O3 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        kvo kvoVar3 = w2.c;
        ?? e5 = a.e(yf90Var, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e5 == 0 ? kvoVar3 : e5;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression e6 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar5, w2.C, null);
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O5 = wwg.O(yf90Var, jSONObject, "doubletap_actions", i3yVar6);
        afl aflVar = (afl) wwg.M(yf90Var, jSONObject, "ellipsis", jsonParserComponent.W8);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        rms rmsVar = wm11.f;
        tls tlsVar6 = b.b;
        Expression e7 = a.e(yf90Var, jSONObject, "focused_text_color", rmsVar, tlsVar6, kbsVar, null);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression e8 = a.e(yf90Var, jSONObject, "font_family", umsVar, abl0Var, kbsVar, null);
        Expression e9 = a.e(yf90Var, jSONObject, "font_feature_settings", umsVar, abl0Var, kbsVar, null);
        i8l i8lVar2 = w2.D;
        kvo kvoVar5 = w2.d;
        ?? e10 = a.e(yf90Var, jSONObject, "font_size", tmsVar, tlsVar5, i8lVar2, kvoVar5);
        kvo kvoVar6 = e10 == 0 ? kvoVar5 : e10;
        qkj qkjVar3 = w2.t;
        tls tlsVar7 = DivSizeUnit.FROM_STRING;
        kvo kvoVar7 = w2.e;
        ?? e11 = a.e(yf90Var, jSONObject, "font_size_unit", qkjVar3, tlsVar7, kbsVar, kvoVar7);
        kvo kvoVar8 = e11 == 0 ? kvoVar7 : e11;
        Expression e12 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, abl0Var, kbsVar, null);
        Expression e13 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, w2.u, DivFontWeight.FROM_STRING, kbsVar, null);
        Expression e14 = a.e(yf90Var, jSONObject, "font_weight_value", tmsVar, tlsVar5, w2.E, null);
        List O7 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = w2.f;
        }
        DivSize divSize2 = divSize;
        List O8 = wwg.O(yf90Var, jSONObject, "hover_end_actions", i3yVar6);
        List O9 = wwg.O(yf90Var, jSONObject, "hover_start_actions", i3yVar6);
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        List O10 = wwg.O(yf90Var, jSONObject, "images", jsonParserComponent.Q8);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        kvo kvoVar9 = w2.g;
        ?? e15 = a.e(yf90Var, jSONObject, "letter_spacing", smsVar, tlsVar3, kbsVar, kvoVar9);
        kvo kvoVar10 = e15 == 0 ? kvoVar9 : e15;
        Expression e16 = a.e(yf90Var, jSONObject, "line_height", tmsVar, tlsVar5, w2.F, null);
        List O11 = wwg.O(yf90Var, jSONObject, "longtap_actions", i3yVar6);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        Expression e17 = a.e(yf90Var, jSONObject, "max_lines", tmsVar, tlsVar5, w2.G, null);
        Expression e18 = a.e(yf90Var, jSONObject, "min_hidden_lines", tmsVar, tlsVar5, w2.H, null);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        List O12 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar6);
        List O13 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar6);
        List O14 = wwg.O(yf90Var, jSONObject, "ranges", jsonParserComponent.N8);
        Expression e19 = a.e(yf90Var, jSONObject, "reuse_id", umsVar, abl0Var, kbsVar, null);
        Expression e20 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar5, w2.I, null);
        kvo kvoVar11 = w2.h;
        ?? e21 = a.e(yf90Var, jSONObject, "selectable", wmsVar, tlsVar4, kbsVar, kvoVar11);
        kvo kvoVar12 = e21 == 0 ? kvoVar11 : e21;
        List O15 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        qkj qkjVar4 = w2.v;
        tls tlsVar8 = DivLineStyle.FROM_STRING;
        kvo kvoVar13 = w2.i;
        ?? e22 = a.e(yf90Var, jSONObject, "strike", qkjVar4, tlsVar8, kbsVar, kvoVar13);
        kvo kvoVar14 = e22 == 0 ? kvoVar13 : e22;
        Expression b = a.b(yf90Var, jSONObject, "text", umsVar, abl0Var, kbsVar);
        qkj qkjVar5 = w2.w;
        kvo kvoVar15 = w2.j;
        ?? e23 = a.e(yf90Var, jSONObject, "text_alignment_horizontal", qkjVar5, tlsVar, kbsVar, kvoVar15);
        kvo kvoVar16 = e23 == 0 ? kvoVar15 : e23;
        qkj qkjVar6 = w2.x;
        kvo kvoVar17 = w2.k;
        ?? e24 = a.e(yf90Var, jSONObject, "text_alignment_vertical", qkjVar6, tlsVar2, kbsVar, kvoVar17);
        kvo kvoVar18 = e24 == 0 ? kvoVar17 : e24;
        kvo kvoVar19 = w2.l;
        ?? e25 = a.e(yf90Var, jSONObject, "text_color", rmsVar, tlsVar6, kbsVar, kvoVar19);
        kvo kvoVar20 = e25 == 0 ? kvoVar19 : e25;
        mfl mflVar = (mfl) wwg.M(yf90Var, jSONObject, "text_gradient", jsonParserComponent.q8);
        m8l m8lVar = (m8l) wwg.M(yf90Var, jSONObject, "text_shadow", jsonParserComponent.c7);
        kvo kvoVar21 = w2.m;
        ?? e26 = a.e(yf90Var, jSONObject, "tighten_width", wmsVar, tlsVar4, kbsVar, kvoVar21);
        kvo kvoVar22 = e26 == 0 ? kvoVar21 : e26;
        List O16 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O17 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, w2.J);
        qkj qkjVar7 = w2.y;
        tls tlsVar9 = DivText$Truncate.FROM_STRING;
        kvo kvoVar23 = w2.n;
        ?? e27 = a.e(yf90Var, jSONObject, "truncate", qkjVar7, tlsVar9, kbsVar, kvoVar23);
        kvo kvoVar24 = e27 == 0 ? kvoVar23 : e27;
        qkj qkjVar8 = w2.z;
        kvo kvoVar25 = w2.o;
        ?? e28 = a.e(yf90Var, jSONObject, "underline", qkjVar8, tlsVar8, kbsVar, kvoVar25);
        kvo kvoVar26 = e28 == 0 ? kvoVar25 : e28;
        List O18 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O19 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar9 = w2.A;
        tls tlsVar10 = DivVisibility.FROM_STRING;
        kvo kvoVar27 = w2.p;
        ?? e29 = a.e(yf90Var, jSONObject, "visibility", qkjVar9, tlsVar10, kbsVar, kvoVar27);
        if (e29 != 0) {
            kvoVar27 = e29;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O20 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = w2.q;
        }
        return new ffl(divAccessibility, v3kVar, pdkVar2, O, e, e2, kvoVar2, O2, e4, O3, divBorder, kvoVar4, e6, O4, O5, aflVar, O6, divFocus, e7, e8, e9, kvoVar6, kvoVar8, e12, e13, e14, O7, divSize2, O8, O9, str, O10, divLayoutProvider, kvoVar10, e16, O11, divEdgeInsets, e17, e18, divEdgeInsets2, O12, O13, O14, e19, e20, kvoVar12, O15, kvoVar14, b, kvoVar16, kvoVar18, kvoVar20, mflVar, m8lVar, kvoVar22, O16, divTransform, O17, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, kvoVar24, kvoVar26, O18, O19, kvoVar27, divVisibilityAction, O20, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ffl fflVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = fflVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        v3k v3kVar = fflVar.b;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, i3yVar);
        wwg.b0(yf90Var, jSONObject, "action_animation", fflVar.c, jsonParserComponent.z1);
        wwg.c0(yf90Var, jSONObject, "actions", fflVar.d, i3yVar);
        Expression expression = fflVar.e;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_horizontal", expression, tlsVar);
        Expression expression2 = fflVar.f;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_vertical", expression2, tlsVar2);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, fflVar.g);
        wwg.c0(yf90Var, jSONObject, "animators", fflVar.h, jsonParserComponent.C1);
        a.g(yf90Var, jSONObject, "auto_ellipsize", fflVar.i);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, fflVar.j, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", fflVar.k, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "capture_focus_on_action", fflVar.l);
        a.g(yf90Var, jSONObject, "column_span", fflVar.m);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", fflVar.n, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "doubletap_actions", fflVar.o, i3yVar);
        wwg.b0(yf90Var, jSONObject, "ellipsis", fflVar.p, jsonParserComponent.W8);
        wwg.c0(yf90Var, jSONObject, "extensions", fflVar.q, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", fflVar.r, jsonParserComponent.K3);
        Expression expression3 = fflVar.s;
        tls tlsVar3 = b.a;
        a.h(yf90Var, jSONObject, "focused_text_color", expression3, tlsVar3);
        a.g(yf90Var, jSONObject, "font_family", fflVar.t);
        a.g(yf90Var, jSONObject, "font_feature_settings", fflVar.u);
        a.g(yf90Var, jSONObject, "font_size", fflVar.v);
        a.h(yf90Var, jSONObject, "font_size_unit", fflVar.w, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, fflVar.x);
        a.h(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, fflVar.y, DivFontWeight.TO_STRING);
        a.g(yf90Var, jSONObject, "font_weight_value", fflVar.z);
        wwg.c0(yf90Var, jSONObject, "functions", fflVar.A, jsonParserComponent.T3);
        DivSize divSize = fflVar.B;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "hover_end_actions", fflVar.C, i3yVar);
        wwg.c0(yf90Var, jSONObject, "hover_start_actions", fflVar.D, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", fflVar.E);
        wwg.c0(yf90Var, jSONObject, "images", fflVar.F, jsonParserComponent.Q8);
        wwg.b0(yf90Var, jSONObject, "layout_provider", fflVar.G, jsonParserComponent.X4);
        a.g(yf90Var, jSONObject, "letter_spacing", fflVar.H);
        a.g(yf90Var, jSONObject, "line_height", fflVar.I);
        wwg.c0(yf90Var, jSONObject, "longtap_actions", fflVar.J, i3yVar);
        DivEdgeInsets divEdgeInsets = fflVar.K;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        a.g(yf90Var, jSONObject, "max_lines", fflVar.L);
        a.g(yf90Var, jSONObject, "min_hidden_lines", fflVar.M);
        wwg.b0(yf90Var, jSONObject, "paddings", fflVar.N, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "press_end_actions", fflVar.O, i3yVar);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", fflVar.P, i3yVar);
        wwg.c0(yf90Var, jSONObject, "ranges", fflVar.Q, jsonParserComponent.N8);
        a.g(yf90Var, jSONObject, "reuse_id", fflVar.R);
        a.g(yf90Var, jSONObject, "row_span", fflVar.S);
        a.g(yf90Var, jSONObject, "selectable", fflVar.T);
        wwg.c0(yf90Var, jSONObject, "selected_actions", fflVar.U, i3yVar);
        Expression expression4 = fflVar.V;
        tls tlsVar4 = DivLineStyle.TO_STRING;
        a.h(yf90Var, jSONObject, "strike", expression4, tlsVar4);
        a.g(yf90Var, jSONObject, "text", fflVar.W);
        a.h(yf90Var, jSONObject, "text_alignment_horizontal", fflVar.X, tlsVar);
        a.h(yf90Var, jSONObject, "text_alignment_vertical", fflVar.Y, tlsVar2);
        a.h(yf90Var, jSONObject, "text_color", fflVar.Z, tlsVar3);
        wwg.b0(yf90Var, jSONObject, "text_gradient", fflVar.a0, jsonParserComponent.q8);
        wwg.b0(yf90Var, jSONObject, "text_shadow", fflVar.b0, jsonParserComponent.c7);
        a.g(yf90Var, jSONObject, "tighten_width", fflVar.c0);
        wwg.c0(yf90Var, jSONObject, "tooltips", fflVar.d0, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", fflVar.e0, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", fflVar.f0, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", fflVar.g0, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = fflVar.h0;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", fflVar.i0, i3yVar4);
        wwg.d0(yf90Var, jSONObject, fflVar.j0, DivTransitionTrigger.TO_STRING);
        a.h(yf90Var, jSONObject, "truncate", fflVar.k0, DivText$Truncate.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "text");
        a.h(yf90Var, jSONObject, "underline", fflVar.l0, tlsVar4);
        wwg.c0(yf90Var, jSONObject, "variable_triggers", fflVar.m0, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", fflVar.n0, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", fflVar.o0, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = fflVar.p0;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", fflVar.q0, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", fflVar.r0, i3yVar2);
        return jSONObject;
    }
}
