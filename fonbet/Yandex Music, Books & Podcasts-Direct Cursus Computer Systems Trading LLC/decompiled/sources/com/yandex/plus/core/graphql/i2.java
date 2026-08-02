package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i2 implements s6n {
    public final String a;
    public final com.yandex.plus.core.graphql.type.t0 b;
    public final com.yandex.plus.core.graphql.type.t0 c;

    public i2(String str, com.yandex.plus.core.graphql.type.t0 t0Var, com.yandex.plus.core.graphql.type.t0 t0Var2) {
        str.getClass();
        this.a = str;
        this.b = t0Var;
        this.c = t0Var2;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.s1 s1Var = com.yandex.plus.core.graphql.adapter.s1.a;
        tj tjVar = uj.a;
        return new qhj(s1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "5a3c3a1fc69e9842968e0cb7fcb2c30677700fe8c4f3c2adc458ff8e7da31713";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query PopupConfiguration($shortcutId: ID!, $lightTargetingInput: TargetingInput!, $darkTargetingInput: TargetingInput!) { configuration: shortcut(targeting: $lightTargetingInput, id: $shortcutId) { __typename ...popupConfigurationFragment } darkConfiguration: shortcut(targeting: $darkTargetingInput, id: $shortcutId) { __typename ...darkPopupConfigurationFragment } }  fragment hexColorFragment on HexColor { a hex }  fragment gradientFragment on Gradient { __typename colors { hexColor { __typename ...hexColorFragment } location } ... on LinearGradient { angle } ... on RadialGradient { relativeCenter { x y } relativeRadius { x y } } }  fragment colorFragment on Colors { value { __typename ... on GradientColor { gradient { __typename ...gradientFragment } } ... on HexColor { __typename ...hexColorFragment } } }  fragment configurationOverlayFragment on Overlay { text shape textColor textColors { __typename ...colorFragment } background { color } attributedText { items { __typename ... on TextProperties { name text } } } }  fragment popupConfigurationFragment on Shortcut { name id popups { textColor background { color } commonOverlays { __typename ...configurationOverlayFragment } buttons { textColor backgroundColor action { actionType silent subscriptionButtonType subscriptionPaymentMethod subscriptionProductFeatures subscriptionWidgetType acquisitionPlatformSubscriptionProperties { page places restrictions } } subscriptionProductTarget } } }  fragment darkConfigurationOverlayFragment on Overlay { shape textColor textColors { __typename ...colorFragment } background { color } }  fragment darkPopupConfigurationFragment on Shortcut { popups { textColor background { color } commonOverlays { __typename ...darkConfigurationOverlayFragment } buttons { textColor backgroundColor action { actionType } } } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.Z("shortcutId");
        uj.a.a(r7fVar, fx6Var, this.a);
        r7fVar.Z("lightTargetingInput");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.A;
        r7fVar.j();
        aVar.a(r7fVar, fx6Var, this.b);
        r7fVar.p();
        r7fVar.Z("darkTargetingInput");
        r7fVar.j();
        aVar.a(r7fVar, fx6Var, this.c);
        r7fVar.p();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.d(this.a, i2Var.a) && this.b.equals(i2Var.b) && this.c.equals(i2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "PopupConfiguration";
    }

    public final String toString() {
        return "PopupConfigurationQuery(shortcutId=" + this.a + ", lightTargetingInput=" + this.b + ", darkTargetingInput=" + this.c + ')';
    }
}
