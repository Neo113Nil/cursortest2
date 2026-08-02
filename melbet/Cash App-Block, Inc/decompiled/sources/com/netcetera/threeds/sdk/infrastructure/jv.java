package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Map;

/* loaded from: classes5.dex */
public class jv {
    private static int ThreeDS2ServiceInstance = 1;
    private static int initialize;
    private final kj get;
    private final kn getWarnings;

    public jv(kn knVar, kj kjVar) {
        this.getWarnings = knVar;
        this.get = kjVar;
    }

    public static jv get() {
        return (jv) ThreeDS2ServiceInstance(new Object[0], -671843327, 671843327, (int) System.currentTimeMillis());
    }

    public ju ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization, me meVar) {
        jn jnVar = new jn(this.getWarnings.ThreeDS2Service(uiCustomization, UiCustomization.UiCustomizationType.DEFAULT), this.get.ThreeDS2Service(uiCustomization, UiCustomization.UiCustomizationType.DARK), meVar);
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 41;
        int i3 = ((i ^ 41) | i2) << 1;
        int i4 = -((i | 41) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            return jnVar;
        }
        throw null;
    }

    public ju initialize(Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization> map, me meVar) {
        kn knVar = this.getWarnings;
        UiCustomization.UiCustomizationType uiCustomizationType = UiCustomization.UiCustomizationType.DEFAULT;
        ju ThreeDS2Service = knVar.ThreeDS2Service(map.get(uiCustomizationType), uiCustomizationType);
        kn knVar2 = this.getWarnings;
        UiCustomization.UiCustomizationType uiCustomizationType2 = UiCustomization.UiCustomizationType.DARK;
        jn jnVar = new jn(ThreeDS2Service, knVar2.ThreeDS2Service(map.get(uiCustomizationType2), uiCustomizationType2), meVar);
        int i = initialize;
        int i2 = (i & 109) + (i | 109);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return jnVar;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        jv jvVar = new jv(new kn(), new kj());
        int i4 = ThreeDS2ServiceInstance;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i4 ^ 1) | (i4 & 1)) << 1, ~(-(((~i4) & 1) | (i4 & (-2)))), 1, 128);
        return jvVar;
    }
}
