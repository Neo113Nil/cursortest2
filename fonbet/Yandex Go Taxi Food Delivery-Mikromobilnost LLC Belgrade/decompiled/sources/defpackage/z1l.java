package defpackage;

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

/* loaded from: classes.dex */
public final class z1l implements qfy0 {
    public final JsonParserComponent a;

    public z1l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v42, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v48, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v52, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v68, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final t1l a(yf90 yf90Var, r2l r2lVar, JSONObject jSONObject) {
        exq exqVar = r2lVar.a;
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
        Expression l = xcx.l(yf90Var, r2lVar.b, jSONObject, "alignment_horizontal", h1.l, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, r2lVar.c, jSONObject, "alignment_vertical", h1.m, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = r2lVar.d;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        zrk zrkVar = h1.r;
        kvo kvoVar = h1.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, zrkVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s = xcx.s(yf90Var, r2lVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, r2lVar.f, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, r2lVar.g, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar3 = r2lVar.h;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression m = xcx.m(yf90Var, exqVar3, jSONObject, "column_span", tmsVar, tlsVar2, h1.s);
        exq exqVar4 = r2lVar.i;
        qkj qkjVar = h1.n;
        tls tlsVar3 = DivPager$ItemAlignment.FROM_STRING;
        kvo kvoVar3 = h1.b;
        ?? o = xcx.o(yf90Var, exqVar4, jSONObject, "cross_axis_alignment", qkjVar, tlsVar3, kvoVar3);
        kvo kvoVar4 = o == 0 ? kvoVar3 : o;
        exq exqVar5 = r2lVar.j;
        zrk zrkVar2 = h1.t;
        kvo kvoVar5 = h1.c;
        ?? n2 = xcx.n(yf90Var, exqVar5, jSONObject, "default_item", tmsVar, tlsVar2, zrkVar2, kvoVar5);
        if (n2 != 0) {
            kvoVar5 = n2;
        }
        List s3 = xcx.s(yf90Var, r2lVar.k, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, r2lVar.l, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, r2lVar.m, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s5 = xcx.s(yf90Var, r2lVar.n, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, r2lVar.o, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = h1.d;
        }
        DivSize divSize2 = divSize;
        String str = (String) xcx.i(r2lVar.p, q5z.c, yf90Var, "id", jSONObject);
        exq exqVar6 = r2lVar.q;
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar6 = h1.e;
        ?? o2 = xcx.o(yf90Var, exqVar6, jSONObject, "infinite_scroll", wmsVar, tlsVar4, kvoVar6);
        kvo kvoVar7 = o2 == 0 ? kvoVar6 : o2;
        DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) xcx.h(yf90Var, r2lVar.r, jSONObject, "item_builder", jsonParserComponent.o2, jsonParserComponent.m2);
        sqk sqkVar = (sqk) xcx.h(yf90Var, r2lVar.s, jSONObject, "item_spacing", jsonParserComponent.G3, jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = h1.f;
        }
        sqk sqkVar2 = sqkVar;
        List s6 = xcx.s(yf90Var, r2lVar.t, jSONObject, "items", jsonParserComponent.Z9, jsonParserComponent.X9);
        d2l d2lVar = (d2l) xcx.b(yf90Var, r2lVar.u, jSONObject, "layout_mode", jsonParserComponent.J5, jsonParserComponent.H5);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, r2lVar.v, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, r2lVar.w, jSONObject, "margins", i3yVar7, i3yVar6);
        exq exqVar7 = r2lVar.x;
        qkj qkjVar2 = h1.o;
        tls tlsVar5 = DivPager$Orientation.FROM_STRING;
        kvo kvoVar8 = h1.g;
        ?? o3 = xcx.o(yf90Var, exqVar7, jSONObject, "orientation", qkjVar2, tlsVar5, kvoVar8);
        kvo kvoVar9 = o3 == 0 ? kvoVar8 : o3;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, r2lVar.y, jSONObject, "paddings", i3yVar7, i3yVar6);
        a1l a1lVar = (a1l) xcx.h(yf90Var, r2lVar.z, jSONObject, "page_transformation", jsonParserComponent.G5, jsonParserComponent.E5);
        exq exqVar8 = r2lVar.A;
        kvo kvoVar10 = h1.h;
        ?? o4 = xcx.o(yf90Var, exqVar8, jSONObject, "restrict_parent_scroll", wmsVar, tlsVar4, kvoVar10);
        kvo kvoVar11 = o4 == 0 ? kvoVar10 : o4;
        Expression k = xcx.k(yf90Var, r2lVar.B, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, r2lVar.C, jSONObject, "row_span", tmsVar, tlsVar2, h1.u);
        exq exqVar9 = r2lVar.D;
        qkj qkjVar3 = h1.p;
        kvo kvoVar12 = h1.i;
        ?? o5 = xcx.o(yf90Var, exqVar9, jSONObject, "scroll_axis_alignment", qkjVar3, tlsVar3, kvoVar12);
        kvo kvoVar13 = o5 == 0 ? kvoVar12 : o5;
        List s7 = xcx.s(yf90Var, r2lVar.E, jSONObject, "selected_actions", jsonParserComponent.v1, jsonParserComponent.t1);
        List s8 = xcx.s(yf90Var, r2lVar.F, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, r2lVar.G, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s9 = xcx.s(yf90Var, r2lVar.H, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, r2lVar.I, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, r2lVar.J, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, r2lVar.K, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, r2lVar.L, jSONObject, DivTransitionTrigger.FROM_STRING, h1.v);
        List s10 = xcx.s(yf90Var, r2lVar.M, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s11 = xcx.s(yf90Var, r2lVar.N, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar10 = r2lVar.O;
        qkj qkjVar4 = h1.q;
        tls tlsVar6 = DivVisibility.FROM_STRING;
        kvo kvoVar14 = h1.j;
        ?? o6 = xcx.o(yf90Var, exqVar10, jSONObject, "visibility", qkjVar4, tlsVar6, kvoVar14);
        if (o6 != 0) {
            kvoVar14 = o6;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, r2lVar.P, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s12 = xcx.s(yf90Var, r2lVar.Q, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, r2lVar.R, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = h1.k;
        }
        return new t1l(divAccessibility, l, l2, kvoVar2, s, s2, divBorder, m, kvoVar4, kvoVar5, s3, s4, divFocus, s5, divSize2, str, kvoVar7, divCollectionItemBuilder, sqkVar2, s6, d2lVar, divLayoutProvider, divEdgeInsets, kvoVar9, divEdgeInsets2, a1lVar, kvoVar11, k, m2, kvoVar13, s7, s8, divTransform, s9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s10, s11, kvoVar14, divVisibilityAction, s12, divSize3);
    }
}
