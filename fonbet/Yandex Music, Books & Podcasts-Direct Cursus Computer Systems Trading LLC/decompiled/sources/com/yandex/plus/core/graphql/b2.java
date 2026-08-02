package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.kwj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 implements s6n {
    public final List a;
    public final com.yandex.plus.core.graphql.type.t0 b;
    public final com.yandex.plus.core.graphql.type.t0 c;
    public final q7g d;

    public b2(List list, com.yandex.plus.core.graphql.type.t0 t0Var, com.yandex.plus.core.graphql.type.t0 t0Var2, q7g q7gVar) {
        list.getClass();
        this.a = list;
        this.b = t0Var;
        this.c = t0Var2;
        this.d = q7gVar;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.m1 m1Var = com.yandex.plus.core.graphql.adapter.m1.a;
        tj tjVar = uj.a;
        return new qhj(m1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "ba84df104aa5bed0f94dcacbc26dc519c40f9f88a8d9f885c7d37af59ef4231a";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query PanelSections($ids: [ID!]!, $lightTargetingInput: TargetingInput!, $darkTargetingInput: TargetingInput!, $weightType: SHORTCUT_WEIGHT_TYPE) { sections: sections(ids: $ids) { __typename ...sectionFragment } darkSections: sections(ids: $ids) { __typename ...darkSectionFragment } }  fragment hexColorFragment on HexColor { a hex }  fragment gradientFragment on Gradient { __typename colors { hexColor { __typename ...hexColorFragment } location } ... on LinearGradient { angle } ... on RadialGradient { relativeCenter { x y } relativeRadius { x y } } }  fragment colorFragment on Colors { value { __typename ... on GradientColor { gradient { __typename ...gradientFragment } } ... on HexColor { __typename ...hexColorFragment } } }  fragment actionFragment on Action { text textColor textColors { __typename ...colorFragment } backgroundColor backgroundColors { __typename ...colorFragment } url deeplink actionType }  fragment attributedTextItemFragment on AttributedTextItem { __typename ... on TextProperties { name text } }  fragment textIconFragment on AttributedTextItem { __typename ... on TextIconProperties { id url fallbackText } }  fragment styledTextFragment on AttributedTextItem { __typename ... on StyledTextProperties { id text textColor { __typename ...colorFragment } isBold isItalic } }  fragment attributedTextFragment on AttributedText { items { __typename ...attributedTextItemFragment ...textIconFragment ...styledTextFragment } }  fragment overlayFragment on Overlay { text textColor textColors { __typename ...colorFragment } shape imageUrl background { color } attributedText { __typename ...attributedTextFragment } }  fragment shortcutFragment on Shortcut { __typename id name actions { __typename ...actionFragment } iconUrl title subtitle textStyle { color } background { color colors { __typename ...colorFragment } imageUrl } commonOverlays { __typename ...overlayFragment } additionalData }  fragment sectionFragment on Section { id name viewType shortcuts(targeting: $lightTargetingInput, weightType: $weightType) { __typename ...shortcutFragment } hasHeavyShortcuts(targeting: $lightTargetingInput) }  fragment darkOverlayFragment on Overlay { text textColor textColors { __typename ...colorFragment } shape imageUrl background { color } attributedText { __typename ...attributedTextFragment } }  fragment darkShortcutFragment on Shortcut { id name iconUrl actions { __typename ...actionFragment } textStyle { color } background { color colors { __typename ...colorFragment } imageUrl } commonOverlays { __typename ...darkOverlayFragment } additionalData }  fragment darkSectionFragment on Section { shortcuts(targeting: $darkTargetingInput) { __typename ...darkShortcutFragment } id viewType }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.getClass();
        fx6Var.getClass();
        r7fVar.Z("ids");
        tj tjVar = uj.a;
        List list = this.a;
        list.getClass();
        r7fVar.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("lightTargetingInput");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.A;
        r7fVar.j();
        aVar.a(r7fVar, fx6Var, this.b);
        r7fVar.p();
        r7fVar.Z("darkTargetingInput");
        r7fVar.j();
        aVar.a(r7fVar, fx6Var, this.c);
        r7fVar.p();
        q7g q7gVar = this.d;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("weightType");
            com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.s;
            Object obj = ((kwj) q7gVar).f;
            if (obj == null) {
                r7fVar.B0();
            } else {
                aVar2.a(r7fVar, fx6Var, obj);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.d(this.a, b2Var.a) && this.b.equals(b2Var.b) && this.c.equals(b2Var.c) && this.d.equals(b2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "PanelSections";
    }

    public final String toString() {
        return "PanelSectionsQuery(ids=" + this.a + ", lightTargetingInput=" + this.b + ", darkTargetingInput=" + this.c + ", weightType=" + this.d + ')';
    }
}
