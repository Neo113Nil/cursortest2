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
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivPager$ItemAlignment;
import com.yandex.div2.DivPager$Orientation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x1l implements zsq0, nyi {
    public final JsonParserComponent a;

    public x1l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v54, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v70, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final t1l a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = h1.l;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", h1.m, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        zrk zrkVar = h1.r;
        kvo kvoVar = h1.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, zrkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression e4 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar3, h1.s, null);
        qkj qkjVar2 = h1.n;
        tls tlsVar4 = DivPager$ItemAlignment.FROM_STRING;
        kvo kvoVar3 = h1.b;
        ?? e5 = a.e(yf90Var, jSONObject, "cross_axis_alignment", qkjVar2, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e5 == 0 ? kvoVar3 : e5;
        zrk zrkVar2 = h1.t;
        kvo kvoVar5 = h1.c;
        ?? e6 = a.e(yf90Var, jSONObject, "default_item", tmsVar, tlsVar3, zrkVar2, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = h1.d;
        }
        DivSize divSize2 = divSize;
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        wms wmsVar = wm11.a;
        tls tlsVar5 = b.f;
        kvo kvoVar7 = h1.e;
        ?? e7 = a.e(yf90Var, jSONObject, "infinite_scroll", wmsVar, tlsVar5, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) wwg.M(yf90Var, jSONObject, "item_builder", jsonParserComponent.m2);
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "item_spacing", jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = h1.f;
        }
        sqk sqkVar2 = sqkVar;
        List O6 = wwg.O(yf90Var, jSONObject, "items", jsonParserComponent.X9);
        d2l d2lVar = (d2l) wwg.E(yf90Var, jSONObject, "layout_mode", jsonParserComponent.H5);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        qkj qkjVar3 = h1.o;
        tls tlsVar6 = DivPager$Orientation.FROM_STRING;
        kvo kvoVar9 = h1.g;
        ?? e8 = a.e(yf90Var, jSONObject, "orientation", qkjVar3, tlsVar6, kbsVar, kvoVar9);
        kvo kvoVar10 = e8 == 0 ? kvoVar9 : e8;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        a1l a1lVar = (a1l) wwg.M(yf90Var, jSONObject, "page_transformation", jsonParserComponent.E5);
        kvo kvoVar11 = h1.h;
        ?? e9 = a.e(yf90Var, jSONObject, "restrict_parent_scroll", wmsVar, tlsVar5, kbsVar, kvoVar11);
        kvo kvoVar12 = e9 == 0 ? kvoVar11 : e9;
        Expression e10 = a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e11 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar3, h1.u, null);
        qkj qkjVar4 = h1.p;
        kvo kvoVar13 = h1.i;
        ?? e12 = a.e(yf90Var, jSONObject, "scroll_axis_alignment", qkjVar4, tlsVar4, kbsVar, kvoVar13);
        kvo kvoVar14 = e12 == 0 ? kvoVar13 : e12;
        List O7 = wwg.O(yf90Var, jSONObject, "selected_actions", jsonParserComponent.t1);
        List O8 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O9 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, h1.v);
        List O10 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O11 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar5 = h1.q;
        tls tlsVar7 = DivVisibility.FROM_STRING;
        kvo kvoVar15 = h1.j;
        ?? e13 = a.e(yf90Var, jSONObject, "visibility", qkjVar5, tlsVar7, kbsVar, kvoVar15);
        if (e13 != 0) {
            kvoVar15 = e13;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O12 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = h1.k;
        }
        return new t1l(divAccessibility, e, e2, kvoVar2, O, O2, divBorder, e4, kvoVar4, kvoVar6, O3, O4, divFocus, O5, divSize2, str, kvoVar8, divCollectionItemBuilder, sqkVar2, O6, d2lVar, divLayoutProvider, divEdgeInsets, kvoVar10, divEdgeInsets2, a1lVar, kvoVar12, e10, e11, kvoVar14, O7, O8, divTransform, O9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O10, O11, kvoVar15, divVisibilityAction, O12, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t1l t1lVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = t1lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        a.h(yf90Var, jSONObject, "alignment_horizontal", t1lVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", t1lVar.c, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, t1lVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", t1lVar.e, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, t1lVar.f, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", t1lVar.g, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "column_span", t1lVar.h);
        Expression expression = t1lVar.i;
        tls tlsVar = DivPager$ItemAlignment.TO_STRING;
        a.h(yf90Var, jSONObject, "cross_axis_alignment", expression, tlsVar);
        a.g(yf90Var, jSONObject, "default_item", t1lVar.j);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", t1lVar.k, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "extensions", t1lVar.l, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", t1lVar.m, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", t1lVar.n, jsonParserComponent.T3);
        DivSize divSize = t1lVar.o;
        i3y i3yVar = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", t1lVar.p);
        a.g(yf90Var, jSONObject, "infinite_scroll", t1lVar.q);
        wwg.b0(yf90Var, jSONObject, "item_builder", t1lVar.r, jsonParserComponent.m2);
        wwg.b0(yf90Var, jSONObject, "item_spacing", t1lVar.s, jsonParserComponent.E3);
        wwg.c0(yf90Var, jSONObject, "items", t1lVar.t, jsonParserComponent.X9);
        wwg.b0(yf90Var, jSONObject, "layout_mode", t1lVar.u, jsonParserComponent.H5);
        wwg.b0(yf90Var, jSONObject, "layout_provider", t1lVar.v, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = t1lVar.w;
        i3y i3yVar2 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar2);
        a.h(yf90Var, jSONObject, "orientation", t1lVar.x, DivPager$Orientation.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "paddings", t1lVar.y, i3yVar2);
        wwg.b0(yf90Var, jSONObject, "page_transformation", t1lVar.z, jsonParserComponent.E5);
        a.g(yf90Var, jSONObject, "restrict_parent_scroll", t1lVar.A);
        a.g(yf90Var, jSONObject, "reuse_id", t1lVar.B);
        a.g(yf90Var, jSONObject, "row_span", t1lVar.C);
        a.h(yf90Var, jSONObject, "scroll_axis_alignment", t1lVar.D, tlsVar);
        wwg.c0(yf90Var, jSONObject, "selected_actions", t1lVar.E, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "tooltips", t1lVar.F, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", t1lVar.G, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", t1lVar.H, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", t1lVar.I, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = t1lVar.J;
        i3y i3yVar3 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "transition_out", t1lVar.K, i3yVar3);
        wwg.d0(yf90Var, jSONObject, t1lVar.L, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "pager");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", t1lVar.M, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", t1lVar.N, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", t1lVar.O, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = t1lVar.P;
        i3y i3yVar4 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", t1lVar.Q, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "width", t1lVar.R, i3yVar);
        return jSONObject;
    }
}
