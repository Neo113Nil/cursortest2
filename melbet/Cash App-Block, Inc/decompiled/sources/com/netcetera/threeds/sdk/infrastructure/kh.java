package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
abstract class kh {
    private static int getWarnings = 0;
    private static int initialize = 1;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.kh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        private static int ThreeDS2Service = 0;
        private static int get = 1;
        static final /* synthetic */ int[] getWarnings;

        static {
            int[] iArr = new int[UiCustomization.UiCustomizationType.values().length];
            getWarnings = iArr;
            try {
                iArr[UiCustomization.UiCustomizationType.DARK.ordinal()] = 1;
                int i = get;
                ThreeDS2Service = (((i | 11) << 1) - (i ^ 11)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getWarnings[UiCustomization.UiCustomizationType.DEFAULT.ordinal()] = 2;
                int i2 = get;
                int i3 = i2 | 107;
                int i4 = i3 << 1;
                int i5 = -((~(i2 & 107)) & i3);
                ThreeDS2Service = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                getWarnings[UiCustomization.UiCustomizationType.MONOCHROME.ordinal()] = 3;
                int i6 = ThreeDS2Service;
                int i7 = i6 & 41;
                int i8 = -(-((i6 ^ 41) | i7));
                get = ((i7 & i8) + (i8 | i7)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i9 = get;
            ThreeDS2Service = (((i9 | 117) << 1) - (i9 ^ 117)) % 128;
        }
    }

    public ju ThreeDS2Service(com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization, UiCustomization.UiCustomizationType uiCustomizationType) {
        ju juVar;
        int i = initialize;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m(i ^ 96, (i & 96) << 1, -1, 128);
        if (AnonymousClass1.getWarnings[uiCustomizationType.ordinal()] != 1) {
            juVar = (ju) kl.ThreeDS2Service(new Object[0], 1005207549, -1005207549, (int) System.currentTimeMillis());
            int i2 = initialize;
            int i3 = (i2 & (-98)) | ((~i2) & 97);
            int i4 = (i2 & 97) << 1;
            getWarnings = ((i3 & i4) + (i4 | i3)) % 128;
        } else {
            juVar = (ju) kg.get(new Object[0], 1910829066, -1910829066, (int) System.currentTimeMillis());
            initialize = (getWarnings + 121) % 128;
        }
        ll llVar = new ll(getWarnings(uiCustomization), juVar);
        int i5 = initialize;
        getWarnings = ((i5 & 45) + (i5 | 45)) % 128;
        return llVar;
    }

    public abstract ju getWarnings(com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization);
}
