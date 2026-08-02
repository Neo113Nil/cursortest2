package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
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
public final class xfl implements qfy0 {
    public final JsonParserComponent a;

    public xfl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v101, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v51, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v66, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v69, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v72, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v74, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v76, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v82, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v95, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v97, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ffl a(yf90 yf90Var, uhl uhlVar, JSONObject jSONObject) {
        exq exqVar = uhlVar.a;
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
        exq exqVar2 = uhlVar.b;
        i3y i3yVar10 = jsonParserComponent.v1;
        i3y i3yVar11 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) xcx.h(yf90Var, exqVar2, jSONObject, "action", i3yVar10, i3yVar11);
        pdk pdkVar = (pdk) xcx.h(yf90Var, uhlVar.c, jSONObject, "action_animation", jsonParserComponent.B1, jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = w2.a;
        }
        pdk pdkVar2 = pdkVar;
        List s = xcx.s(yf90Var, uhlVar.d, jSONObject, "actions", i3yVar10, i3yVar11);
        exq exqVar3 = uhlVar.e;
        qkj qkjVar = w2.r;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        Expression l = xcx.l(yf90Var, exqVar3, jSONObject, "alignment_horizontal", qkjVar, tlsVar);
        exq exqVar4 = uhlVar.f;
        qkj qkjVar2 = w2.s;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression l2 = xcx.l(yf90Var, exqVar4, jSONObject, "alignment_vertical", qkjVar2, tlsVar2);
        exq exqVar5 = uhlVar.g;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        i8l i8lVar = w2.B;
        kvo kvoVar = w2.b;
        ?? n = xcx.n(yf90Var, exqVar5, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, i8lVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s2 = xcx.s(yf90Var, uhlVar.h, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        exq exqVar6 = uhlVar.i;
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        Expression l3 = xcx.l(yf90Var, exqVar6, jSONObject, "auto_ellipsize", wmsVar, tlsVar4);
        List s3 = xcx.s(yf90Var, uhlVar.j, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, uhlVar.k, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar7 = uhlVar.l;
        kvo kvoVar3 = w2.c;
        ?? o = xcx.o(yf90Var, exqVar7, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kvoVar3);
        kvo kvoVar4 = o == 0 ? kvoVar3 : o;
        exq exqVar8 = uhlVar.m;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression m = xcx.m(yf90Var, exqVar8, jSONObject, "column_span", tmsVar, tlsVar5, w2.C);
        List s4 = xcx.s(yf90Var, uhlVar.n, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s5 = xcx.s(yf90Var, uhlVar.o, jSONObject, "doubletap_actions", i3yVar10, i3yVar11);
        afl aflVar = (afl) xcx.h(yf90Var, uhlVar.p, jSONObject, "ellipsis", jsonParserComponent.Y8, jsonParserComponent.W8);
        List s6 = xcx.s(yf90Var, uhlVar.q, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, uhlVar.r, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        exq exqVar9 = uhlVar.s;
        rms rmsVar = wm11.f;
        tls tlsVar6 = b.b;
        Expression l4 = xcx.l(yf90Var, exqVar9, jSONObject, "focused_text_color", rmsVar, tlsVar6);
        exq exqVar10 = uhlVar.t;
        ums umsVar = wm11.c;
        Expression k = xcx.k(yf90Var, exqVar10, jSONObject, "font_family", umsVar);
        Expression k2 = xcx.k(yf90Var, uhlVar.u, jSONObject, "font_feature_settings", umsVar);
        exq exqVar11 = uhlVar.v;
        i8l i8lVar2 = w2.D;
        kvo kvoVar5 = w2.d;
        ?? n2 = xcx.n(yf90Var, exqVar11, jSONObject, "font_size", tmsVar, tlsVar5, i8lVar2, kvoVar5);
        if (n2 != 0) {
            kvoVar5 = n2;
        }
        exq exqVar12 = uhlVar.w;
        qkj qkjVar3 = w2.t;
        tls tlsVar7 = DivSizeUnit.FROM_STRING;
        kvo kvoVar6 = w2.e;
        ?? o2 = xcx.o(yf90Var, exqVar12, jSONObject, "font_size_unit", qkjVar3, tlsVar7, kvoVar6);
        kvo kvoVar7 = o2 == 0 ? kvoVar6 : o2;
        Expression k3 = xcx.k(yf90Var, uhlVar.x, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h);
        Expression l5 = xcx.l(yf90Var, uhlVar.y, jSONObject, FontsContractCompat$Columns.WEIGHT, w2.u, DivFontWeight.FROM_STRING);
        Expression m2 = xcx.m(yf90Var, uhlVar.z, jSONObject, "font_weight_value", tmsVar, tlsVar5, w2.E);
        List s7 = xcx.s(yf90Var, uhlVar.A, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, uhlVar.B, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = w2.f;
        }
        DivSize divSize2 = divSize;
        List s8 = xcx.s(yf90Var, uhlVar.C, jSONObject, "hover_end_actions", i3yVar10, i3yVar11);
        List s9 = xcx.s(yf90Var, uhlVar.D, jSONObject, "hover_start_actions", i3yVar10, i3yVar11);
        String str = (String) xcx.i(uhlVar.E, q5z.c, yf90Var, "id", jSONObject);
        List s10 = xcx.s(yf90Var, uhlVar.F, jSONObject, "images", jsonParserComponent.S8, jsonParserComponent.Q8);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, uhlVar.G, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        exq exqVar13 = uhlVar.H;
        kvo kvoVar8 = w2.g;
        ?? o3 = xcx.o(yf90Var, exqVar13, jSONObject, "letter_spacing", smsVar, tlsVar3, kvoVar8);
        kvo kvoVar9 = o3 == 0 ? kvoVar8 : o3;
        Expression m3 = xcx.m(yf90Var, uhlVar.I, jSONObject, "line_height", tmsVar, tlsVar5, w2.F);
        List s11 = xcx.s(yf90Var, uhlVar.J, jSONObject, "longtap_actions", i3yVar10, i3yVar11);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, uhlVar.K, jSONObject, "margins", i3yVar7, i3yVar6);
        Expression m4 = xcx.m(yf90Var, uhlVar.L, jSONObject, "max_lines", tmsVar, tlsVar5, w2.G);
        Expression m5 = xcx.m(yf90Var, uhlVar.M, jSONObject, "min_hidden_lines", tmsVar, tlsVar5, w2.H);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, uhlVar.N, jSONObject, "paddings", i3yVar7, i3yVar6);
        List s12 = xcx.s(yf90Var, uhlVar.O, jSONObject, "press_end_actions", i3yVar10, i3yVar11);
        List s13 = xcx.s(yf90Var, uhlVar.P, jSONObject, "press_start_actions", i3yVar10, i3yVar11);
        List s14 = xcx.s(yf90Var, uhlVar.Q, jSONObject, "ranges", jsonParserComponent.P8, jsonParserComponent.N8);
        Expression k4 = xcx.k(yf90Var, uhlVar.R, jSONObject, "reuse_id", umsVar);
        Expression m6 = xcx.m(yf90Var, uhlVar.S, jSONObject, "row_span", tmsVar, tlsVar5, w2.I);
        exq exqVar14 = uhlVar.T;
        kvo kvoVar10 = w2.h;
        ?? o4 = xcx.o(yf90Var, exqVar14, jSONObject, "selectable", wmsVar, tlsVar4, kvoVar10);
        kvo kvoVar11 = o4 == 0 ? kvoVar10 : o4;
        List s15 = xcx.s(yf90Var, uhlVar.U, jSONObject, "selected_actions", i3yVar10, i3yVar11);
        exq exqVar15 = uhlVar.V;
        qkj qkjVar4 = w2.v;
        tls tlsVar8 = DivLineStyle.FROM_STRING;
        kvo kvoVar12 = w2.i;
        ?? o5 = xcx.o(yf90Var, exqVar15, jSONObject, "strike", qkjVar4, tlsVar8, kvoVar12);
        kvo kvoVar13 = o5 == 0 ? kvoVar12 : o5;
        Expression c = xcx.c(yf90Var, uhlVar.W, jSONObject, "text", umsVar);
        exq exqVar16 = uhlVar.X;
        qkj qkjVar5 = w2.w;
        kvo kvoVar14 = w2.j;
        ?? o6 = xcx.o(yf90Var, exqVar16, jSONObject, "text_alignment_horizontal", qkjVar5, tlsVar, kvoVar14);
        kvo kvoVar15 = o6 == 0 ? kvoVar14 : o6;
        exq exqVar17 = uhlVar.Y;
        qkj qkjVar6 = w2.x;
        kvo kvoVar16 = w2.k;
        ?? o7 = xcx.o(yf90Var, exqVar17, jSONObject, "text_alignment_vertical", qkjVar6, tlsVar2, kvoVar16);
        kvo kvoVar17 = o7 == 0 ? kvoVar16 : o7;
        exq exqVar18 = uhlVar.Z;
        kvo kvoVar18 = w2.l;
        ?? o8 = xcx.o(yf90Var, exqVar18, jSONObject, "text_color", rmsVar, tlsVar6, kvoVar18);
        kvo kvoVar19 = o8 == 0 ? kvoVar18 : o8;
        mfl mflVar = (mfl) xcx.h(yf90Var, uhlVar.a0, jSONObject, "text_gradient", jsonParserComponent.s8, jsonParserComponent.q8);
        m8l m8lVar = (m8l) xcx.h(yf90Var, uhlVar.b0, jSONObject, "text_shadow", jsonParserComponent.e7, jsonParserComponent.c7);
        exq exqVar19 = uhlVar.c0;
        kvo kvoVar20 = w2.m;
        ?? o9 = xcx.o(yf90Var, exqVar19, jSONObject, "tighten_width", wmsVar, tlsVar4, kvoVar20);
        kvo kvoVar21 = o9 == 0 ? kvoVar20 : o9;
        List s16 = xcx.s(yf90Var, uhlVar.d0, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, uhlVar.e0, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s17 = xcx.s(yf90Var, uhlVar.f0, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, uhlVar.g0, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, uhlVar.h0, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, uhlVar.i0, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, uhlVar.j0, jSONObject, DivTransitionTrigger.FROM_STRING, w2.J);
        exq exqVar20 = uhlVar.k0;
        qkj qkjVar7 = w2.y;
        tls tlsVar9 = DivText$Truncate.FROM_STRING;
        kvo kvoVar22 = w2.n;
        ?? o10 = xcx.o(yf90Var, exqVar20, jSONObject, "truncate", qkjVar7, tlsVar9, kvoVar22);
        kvo kvoVar23 = o10 == 0 ? kvoVar22 : o10;
        exq exqVar21 = uhlVar.l0;
        qkj qkjVar8 = w2.z;
        kvo kvoVar24 = w2.o;
        ?? o11 = xcx.o(yf90Var, exqVar21, jSONObject, "underline", qkjVar8, tlsVar8, kvoVar24);
        kvo kvoVar25 = o11 == 0 ? kvoVar24 : o11;
        List s18 = xcx.s(yf90Var, uhlVar.m0, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s19 = xcx.s(yf90Var, uhlVar.n0, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar22 = uhlVar.o0;
        qkj qkjVar9 = w2.A;
        tls tlsVar10 = DivVisibility.FROM_STRING;
        kvo kvoVar26 = w2.p;
        ?? o12 = xcx.o(yf90Var, exqVar22, jSONObject, "visibility", qkjVar9, tlsVar10, kvoVar26);
        if (o12 != 0) {
            kvoVar26 = o12;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, uhlVar.p0, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s20 = xcx.s(yf90Var, uhlVar.q0, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, uhlVar.r0, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = w2.q;
        }
        return new ffl(divAccessibility, v3kVar, pdkVar2, s, l, l2, kvoVar2, s2, l3, s3, divBorder, kvoVar4, m, s4, s5, aflVar, s6, divFocus, l4, k, k2, kvoVar5, kvoVar7, k3, l5, m2, s7, divSize2, s8, s9, str, s10, divLayoutProvider, kvoVar9, m3, s11, divEdgeInsets, m4, m5, divEdgeInsets2, s12, s13, s14, k4, m6, kvoVar11, s15, kvoVar13, c, kvoVar15, kvoVar17, kvoVar19, mflVar, m8lVar, kvoVar21, s16, divTransform, s17, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, kvoVar23, kvoVar25, s18, s19, kvoVar26, divVisibilityAction, s20, divSize3);
    }
}
