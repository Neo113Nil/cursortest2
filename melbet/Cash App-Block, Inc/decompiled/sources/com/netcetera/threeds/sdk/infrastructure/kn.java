package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class kn extends kh {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization) objArr[1];
        int i = initialize;
        int i2 = i & 105;
        int i3 = (i | 105) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        ThreeDS2ServiceInstance = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (toolbarCustomization == null) {
            int i7 = ((i6 ^ 106) + ((i6 & 106) << 1)) - 1;
            initialize = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 32 / 0;
            }
            return null;
        }
        lz lzVar = new lz(toolbarCustomization);
        int i9 = initialize + 13;
        ThreeDS2ServiceInstance = i9 % 128;
        if (i9 % 2 == 0) {
            return lzVar;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-317)) + (i * EnumC0170g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE);
        int i5 = ~i2;
        int i6 = (((~((~i) | i3)) | i5) * (-318)) + i4;
        int i7 = ~(i5 | i3);
        int i8 = ~i3;
        switch ((((~(i | i2 | i3)) | (~(i5 | i8 | i))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) + ((i7 | (~(i8 | i | i2))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) + i6) {
            case 1:
                return getWarnings(objArr);
            case 2:
                kn knVar = (kn) objArr[0];
                com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization viewCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization) objArr[1];
                int i9 = ThreeDS2ServiceInstance;
                int i10 = (i9 & (-70)) | ((~i9) & 69);
                int i11 = -(-((i9 & 69) << 1));
                initialize = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                jt jtVar = (jt) ThreeDS2ServiceInstance(new Object[]{knVar, viewCustomization}, -607186516, 607186521, System.identityHashCode(knVar));
                ThreeDS2ServiceInstance = (initialize + 73) % 128;
                return jtVar;
            case 3:
                kn knVar2 = (kn) objArr[0];
                com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization) objArr[1];
                int i12 = ThreeDS2ServiceInstance;
                int i13 = i12 ^ 35;
                int i14 = -(-((i12 & 35) << 1));
                initialize = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
                jo joVar = (jo) ThreeDS2ServiceInstance(new Object[]{knVar2, buttonCustomization}, -1924828286, 1924828295, System.identityHashCode(knVar2));
                int i15 = initialize;
                int i16 = i15 & 55;
                ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i16, ~((i15 ^ 55) | i16), 1, 128);
                return joVar;
            case 4:
                return initialize(objArr);
            case 5:
                com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization viewCustomization2 = (com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization) objArr[1];
                int i17 = initialize;
                ThreeDS2ServiceInstance = ((i17 & 119) + (i17 | 119)) % 128;
                if (viewCustomization2 == null) {
                    ThreeDS2ServiceInstance = ((i17 & 117) + (i17 | 117)) % 128;
                    return null;
                }
                lx lxVar = new lx(viewCustomization2);
                ThreeDS2ServiceInstance = (initialize + 115) % 128;
                return lxVar;
            case 6:
                return ThreeDS2Service(objArr);
            case 7:
                return get(objArr);
            case 8:
                return cleanup(objArr);
            case 9:
                return getSDKInfo(objArr);
            default:
                return ThreeDS2ServiceInstance(objArr);
        }
    }

    private static /* synthetic */ Object cleanup(Object[] objArr) {
        com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization = (com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization) objArr[1];
        int i = initialize;
        int i2 = i ^ 69;
        int i3 = ((i & 69) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        ThreeDS2ServiceInstance = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (labelCustomization == null) {
            int i7 = (i6 & 62) + (i6 | 62);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            initialize = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            throw null;
        }
        lw lwVar = new lw(labelCustomization);
        int i9 = ThreeDS2ServiceInstance;
        int i10 = (((i9 | 84) << 1) - (i9 ^ 84)) - 1;
        initialize = i10 % 128;
        if (i10 % 2 != 0) {
            return lwVar;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        kn knVar = (kn) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = (com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization) objArr[1];
        int i = initialize;
        int i2 = i & 111;
        int i3 = (i2 - (~(-(-((i ^ 111) | i2))))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = {knVar, textBoxCustomization};
        int identityHashCode = System.identityHashCode(knVar);
        if (i4 != 0) {
            throw null;
        }
        jq jqVar = (jq) ThreeDS2ServiceInstance(objArr2, -994265892, 994265896, identityHashCode);
        int i5 = initialize;
        int i6 = (((i5 | 69) << 1) - (~(-(((~i5) & 69) | (i5 & (-70)))))) - 1;
        ThreeDS2ServiceInstance = i6 % 128;
        if (i6 % 2 == 0) {
            return jqVar;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKInfo(Object[] objArr) {
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization) objArr[1];
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i ^ 27) + ((i & 27) << 1)) % 128;
        initialize = i2;
        if (buttonCustomization != null) {
            ly lyVar = new ly(buttonCustomization);
            int i3 = initialize;
            int i4 = i3 & 61;
            int i5 = -(-((i3 ^ 61) | i4));
            ThreeDS2ServiceInstance = ((i4 & i5) + (i5 | i4)) % 128;
            return lyVar;
        }
        int i6 = i2 & 121;
        int i7 = (i2 ^ 121) | i6;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        ThreeDS2ServiceInstance = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        kn knVar = (kn) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization = (com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization) objArr[1];
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 119;
        int i3 = i2 + ((i ^ 119) | i2);
        initialize = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = {knVar, labelCustomization};
        int identityHashCode = System.identityHashCode(knVar);
        if (i4 != 0) {
            return (jr) ThreeDS2ServiceInstance(objArr2, -624115987, 624115995, identityHashCode);
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = (com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization) objArr[1];
        int i = initialize;
        int i2 = i & 43;
        int i3 = (i ^ 43) | i2;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        ThreeDS2ServiceInstance = i4;
        if (textBoxCustomization != null) {
            lv lvVar = new lv(textBoxCustomization);
            int i5 = initialize + 17;
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
            return lvVar;
        }
        int i7 = i4 & 93;
        int i8 = i4 | 93;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        initialize = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 39 / 0;
        }
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.kh
    public ju getWarnings(final com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization) {
        ju juVar = new ju() { // from class: com.netcetera.threeds.sdk.infrastructure.kn.2
            private static int get = 1;
            private static int getWarnings;

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jr ThreeDS2Service() {
                int i = get;
                int i2 = i & 125;
                int i3 = (i2 - (~(-(-((i ^ 125) | i2))))) - 1;
                getWarnings = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {kn.this, uiCustomization.getLabelCustomization()};
                if (i4 == 0) {
                    return (jr) kn.ThreeDS2ServiceInstance(objArr, -88960021, 88960022, (int) System.currentTimeMillis());
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jq ThreeDS2ServiceInstance() {
                int i = get;
                int i2 = i ^ 19;
                int i3 = (i & 19) << 1;
                getWarnings = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                jq jqVar = (jq) kn.ThreeDS2ServiceInstance(new Object[]{kn.this, uiCustomization.getTextBoxCustomization()}, -1450920333, 1450920340, (int) System.currentTimeMillis());
                int i4 = getWarnings;
                int i5 = i4 & 73;
                get = (i5 + ((i4 ^ 73) | i5)) % 128;
                return jqVar;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jo get(UiCustomization.ButtonType buttonType) {
                int i = getWarnings;
                int i2 = i & 53;
                int i3 = ((i ^ 53) | i2) << 1;
                int i4 = -((i | 53) & (~i2));
                get = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
                jo joVar = (jo) kn.ThreeDS2ServiceInstance(new Object[]{kn.this, uiCustomization.getButtonCustomization(buttonType)}, -462508832, 462508835, (int) System.currentTimeMillis());
                int i5 = getWarnings;
                int i6 = i5 & 15;
                int i7 = i6 + ((i5 ^ 15) | i6);
                get = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 18 / 0;
                }
                return joVar;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jt getWarnings() {
                int i = get;
                getWarnings = ((i & 3) + (i | 3)) % 128;
                jt jtVar = (jt) kn.ThreeDS2ServiceInstance(new Object[]{kn.this, uiCustomization.getViewCustomization()}, -477794022, 477794024, (int) System.currentTimeMillis());
                int i2 = getWarnings + 65;
                get = i2 % 128;
                if (i2 % 2 != 0) {
                    return jtVar;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jw get() {
                get = (getWarnings + 115) % 128;
                jw jwVar = (jw) kn.ThreeDS2ServiceInstance(new Object[]{kn.this, uiCustomization.getToolbarCustomization()}, 1937117749, -1937117749, (int) System.currentTimeMillis());
                int i = get;
                int i2 = i & 81;
                int i3 = ((i ^ 81) | i2) << 1;
                int i4 = -((i | 81) & (~i2));
                getWarnings = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
                return jwVar;
            }
        };
        int i = ThreeDS2ServiceInstance;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1((i & (-72)) | ((~i) & 71), ~((i & 71) << 1), 1, 128);
        return juVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.kh
    public /* bridge */ /* synthetic */ ju ThreeDS2Service(com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization, UiCustomization.UiCustomizationType uiCustomizationType) {
        int i = initialize;
        ThreeDS2ServiceInstance = ((i ^ 69) + ((i & 69) << 1)) % 128;
        ju ThreeDS2Service = super.ThreeDS2Service(uiCustomization, uiCustomizationType);
        int i2 = initialize;
        int i3 = i2 & 33;
        ThreeDS2ServiceInstance = (((i2 | 33) & (~i3)) + (i3 << 1)) % 128;
        return ThreeDS2Service;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        kn knVar = (kn) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization) objArr[1];
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | 87) << 1) - (i ^ 87);
        initialize = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {knVar, toolbarCustomization};
        int identityHashCode = System.identityHashCode(knVar);
        if (i3 != 0) {
            return (jw) ThreeDS2ServiceInstance(objArr2, -1301689215, 1301689221, identityHashCode);
        }
        throw null;
    }
}
