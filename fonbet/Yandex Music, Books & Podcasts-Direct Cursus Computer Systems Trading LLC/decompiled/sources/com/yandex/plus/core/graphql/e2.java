package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.j8g;
import defpackage.jwj;
import defpackage.kwj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e2 implements s6n {
    public final q7g a;
    public final q7g b;
    public final q7g c;
    public final com.yandex.plus.core.graphql.type.t0 d;

    public e2(q7g q7gVar, q7g q7gVar2, com.yandex.plus.core.graphql.type.t0 t0Var) {
        t0Var.getClass();
        this.a = q7gVar;
        this.b = jwj.f;
        this.c = q7gVar2;
        this.d = t0Var;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.o1 o1Var = com.yandex.plus.core.graphql.adapter.o1.a;
        tj tjVar = uj.a;
        return new qhj(o1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "0f1fe543454e194394237906ca8791fc9d24ec51584d4c1d6d3e5c5cdb938fe7";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query Plaque($supportedFeatures: [SupportedFeatureInput!], $existingPlaques: [ExistingPlaqueInput!], $sizeHint: Int, $targetingInput: TargetingInput!) { plaque: plaque(plaqueInput: { supportedFeatures: $supportedFeatures existingPlaques: $existingPlaques sizeHint: $sizeHint } , targeting: $targetingInput) { __typename ...plaqueDefinitions } }  fragment plaqueContentDescription on ContentDescription { text templates actionText accessibilityEnabled }  fragment strictPlaqueAction on StrictCrossAction { __typename ... on DeeplinkCrossAction { deeplink } ... on ServiceSpecificCrossAction { type params { key value } } ... on JustInteractCrossAction { __typename } }  fragment plaqueIndent on IndentRules { indentLeft indentRight indentTop indentBottom }  fragment plaqueColor on Color { color opacity position }  fragment plaquePoint on Point { x y }  fragment plaqueLinearGradient on LinearColorSettings { colors { __typename ...plaqueColor } startPoint { __typename ...plaquePoint } endPoint { __typename ...plaquePoint } }  fragment plaqueRadialGradient on RadialColorSettings { colors { __typename ...plaqueColor } centralPoint { __typename ...plaquePoint } }  fragment plaqueColorSettings on ColorSettings { type linear { __typename ...plaqueLinearGradient } radial { __typename ...plaqueRadialGradient } }  fragment plaqueCorner on CornerSettings { type heightFix }  fragment plaqueShapeSettings on ShapeSettings { leftTopCorner { __typename ...plaqueCorner } rightTopCorner { __typename ...plaqueCorner } leftBottomCorner { __typename ...plaqueCorner } rightBottomCorner { __typename ...plaqueCorner } }  fragment plaqueDisplayRules on DisplayRules { indentRules { __typename ...plaqueIndent } backgroundColorSettings { __typename ...plaqueColorSettings } backgroundShapeSettings { __typename ...plaqueShapeSettings } }  fragment plaqueWidgetRules on DisplayWidgetRules { displayRules { __typename ...plaqueDisplayRules } opacity horizontalRule verticalRule widthFix widthType }  fragment plaqueTextProperty on TaxiATTextProperty { text textDecoration color metaColor metaStyle fontSize fontStyle fontWeight }  fragment plaqueLinkProperty on TaxiATLinkProperty { description { __typename ...plaqueTextProperty } link }  fragment plaqueImageProperty on TaxiATImageProperty { color metaColor verticalAlignment imageTag width height }  fragment plaqueProperty on TaxiATProperty { __typename ... on TaxiATTextProperty { __typename ...plaqueTextProperty } ... on TaxiATLinkProperty { __typename ...plaqueLinkProperty } ... on TaxiATImageProperty { __typename ...plaqueImageProperty } }  fragment plaqueContainer on TaxiATContainer { metaColor items { __typename ...plaqueProperty } }  fragment plaqueUnit on TaxiATUnit { __typename ... on TaxiATTextProperty { __typename ...plaqueTextProperty } ... on TaxiATLinkProperty { __typename ...plaqueLinkProperty } ... on TaxiATImageProperty { __typename ...plaqueImageProperty } ... on TaxiATContainer { __typename ...plaqueContainer } }  fragment plaqueTextWidget on TextWidget { text { items { __typename ...plaqueUnit } } lineHeight }  fragment plaqueBalanceWidget on BalanceWidget { title { items { __typename ...plaqueUnit } } subtitle { items { __typename ...plaqueUnit } } balance { items { __typename ...plaqueUnit } } }  fragment plaqueButtonWidget on ButtonWidget { text { items { __typename ...plaqueUnit } } }  fragment plaqueSwitchWidget on SwitchWidget { text { items { __typename ...plaqueUnit } } }  fragment plaqueIconWidget on IconWidget { image }  fragment plaqueWidget on CrossWidget { widgetId contentDescription { __typename ...plaqueContentDescription } templates strictAction { __typename ...strictPlaqueAction } displayWidgetRules { __typename ...plaqueWidgetRules } type textWidget { __typename ...plaqueTextWidget } balanceWidget { __typename ...plaqueBalanceWidget } buttonWidget { __typename ...plaqueButtonWidget } switchWidget { __typename ...plaqueSwitchWidget } iconWidget { __typename ...plaqueIconWidget } }  fragment widgetGroupWidth on Width { __typename ... on FillWidth { __typename } ... on FitWidth { __typename } ... on FixWidth { fix } }  fragment groupDisplayRules on WidgetGroupDisplayRules { indentRules { __typename ...plaqueIndent } backgroundColorSettings { __typename ...plaqueColorSettings } backgroundShapeSettings { __typename ...plaqueShapeSettings } width { __typename ...widgetGroupWidth } }  fragment typedWidgetGroupProperties on TypedCrossWidgetGroupProperties { __typename ... on RowCrossWidgetGroupProperties { verticalContentAlignment } ... on ColumnCrossWidgetGroupProperties { horizontalContentAlignment } ... on BoxCrossWidgetGroupProperties { horizontalContentAlignment verticalContentAlignment } }  fragment plaqueWidgetGroup on CrossWidgetGroup { widgetGroupId widgets groupDisplayRules { __typename ...groupDisplayRules } typedProperties { __typename ...typedWidgetGroupProperties } strictAction { __typename ...strictPlaqueAction } contentDescription { __typename ...plaqueContentDescription } }  fragment plaqueLevelElement on ElementLevel { widgetId widgetGroupId type }  fragment plaqueWidgetsLevel on CrossWidgetsLevel { widgetsLevelId contentDescription { __typename ...plaqueContentDescription } elements { __typename ...plaqueLevelElement } displayRules { __typename ...plaqueDisplayRules } strictAction { __typename ...strictPlaqueAction } }  fragment plaquePredicate on CommonPredicate { type argCheckingPredicate { type argName } booleanLiteralPredicate { value } notPredicate { nodeId } unifyingPredicate { type nodeIds } comparisonPredicate { type argName intValue doubleValue stringValue } containsPredicate { argName intValue stringValue } inSetPredicate { argName intSet stringSet } }  fragment plaquePredicateTree on PredicateTree { rootNodeId nodes { __typename ...plaquePredicate } }  fragment plaqueMetric on MetricContext { metrics { name value } }  fragment plaqueIconNotification on IconPlaqueNotification { url displayRules { __typename ... on PlaqueNotificationDisplayRules { position } } }  fragment plaqueCounterNotification on CounterPlaqueNotification { count displayRules { __typename ... on PlaqueNotificationDisplayRules { position } } }  fragment plaque on CrossPlaque { plaqueId priority widgetsLevelIds contentDescription { __typename ...plaqueContentDescription } condition { __typename ...plaquePredicateTree } displayRules { __typename ...plaqueDisplayRules } strictAction { __typename ...strictPlaqueAction } metricContext { __typename ...plaqueMetric } params { showAfter closeAfter } seenContext notification { __typename ...plaqueIconNotification ...plaqueCounterNotification } serviceMeta }  fragment plaqueDefinitions on CrossPlaqueDefinitions { widgets { __typename ...plaqueWidget } widgetGroups { __typename ...plaqueWidgetGroup } widgetsLevels { __typename ...plaqueWidgetsLevel } plaques { __typename ...plaque } prefetchPlaqueList { __typename ...plaque } defaultPlaqueList { __typename ...plaque } fallbackPlaqueList { __typename ...plaque } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.getClass();
        fx6Var.getClass();
        q7g q7gVar = this.a;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("supportedFeatures");
            com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.y;
            tj tjVar = uj.a;
            j8g j8gVar = new j8g(new qhj(aVar, false), 0);
            Object obj = ((kwj) q7gVar).f;
            if (obj == null) {
                r7fVar.B0();
            } else {
                j8gVar.a(r7fVar, fx6Var, obj);
            }
        }
        q7g q7gVar2 = this.b;
        if (q7gVar2 instanceof kwj) {
            r7fVar.Z("existingPlaques");
            com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.h;
            tj tjVar2 = uj.a;
            j8g j8gVar2 = new j8g(new qhj(aVar2, false), 0);
            Object obj2 = ((kwj) q7gVar2).f;
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                j8gVar2.a(r7fVar, fx6Var, obj2);
            }
        }
        q7g q7gVar3 = this.c;
        if (q7gVar3 instanceof kwj) {
            r7fVar.Z("sizeHint");
            uj.b(uj.k).d(r7fVar, fx6Var, (kwj) q7gVar3);
        }
        r7fVar.Z("targetingInput");
        com.yandex.plus.core.graphql.type.adapter.a aVar3 = com.yandex.plus.core.graphql.type.adapter.a.A;
        tj tjVar3 = uj.a;
        r7fVar.j();
        aVar3.a(r7fVar, fx6Var, this.d);
        r7fVar.p();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.a.equals(e2Var.a) && this.b.equals(e2Var.b) && this.c.equals(e2Var.c) && Intrinsics.d(this.d, e2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.appsflyer.internal.k.a(this.c, com.appsflyer.internal.k.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "Plaque";
    }

    public final String toString() {
        return "PlaqueQuery(supportedFeatures=" + this.a + ", existingPlaques=" + this.b + ", sizeHint=" + this.c + ", targetingInput=" + this.d + ')';
    }
}
