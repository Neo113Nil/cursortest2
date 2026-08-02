package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;

/* loaded from: classes5.dex */
public class kj extends kh {
    private static int ThreeDS2Service = 0;
    private static int get = 1;

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        kj kjVar = (kj) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization) objArr[1];
        int i = get;
        int i2 = i & 57;
        int i3 = (i | 57) & (~i2);
        int i4 = i2 << 1;
        ThreeDS2Service = ((i3 & i4) + (i3 | i4)) % 128;
        jw jwVar = (jw) initialize(new Object[]{kjVar, toolbarCustomization}, -819509774, 819509782, System.identityHashCode(kjVar));
        int i5 = ThreeDS2Service;
        int i6 = ((i5 | 54) << 1) - (i5 ^ 54);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        get = i7 % 128;
        if (i7 % 2 != 0) {
            return jwVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.kj.get = (r2 + 3) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r0 = new com.netcetera.threeds.sdk.infrastructure.lq(r5);
        r5 = com.netcetera.threeds.sdk.infrastructure.kj.ThreeDS2Service;
        r2 = r5 & 17;
        com.netcetera.threeds.sdk.infrastructure.kj.get = (((r5 | 17) & (~r2)) + (r2 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ThreeDS2ServiceInitializationCallback(Object[] objArr) {
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization) objArr[1];
        int i = ThreeDS2Service;
        int i2 = i & 3;
        int i3 = (i2 - (~((i ^ 3) | i2))) - 1;
        get = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
        }
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = (com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization) objArr[1];
        int i = ThreeDS2Service;
        int i2 = ((i ^ 19) | (i & 19)) << 1;
        int i3 = -((i & (-20)) | ((~i) & 19));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (textBoxCustomization == null) {
            int i5 = i & 85;
            get = (i5 + ((i ^ 85) | i5)) % 128;
            return null;
        }
        lt ltVar = new lt(textBoxCustomization);
        int i6 = ThreeDS2Service;
        int i7 = ((i6 | 59) << 1) - (i6 ^ 59);
        get = i7 % 128;
        if (i7 % 2 != 0) {
            return ltVar;
        }
        throw null;
    }

    private static /* synthetic */ Object createTransaction(Object[] objArr) {
        kj kjVar = (kj) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = (com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization) objArr[1];
        int i = ThreeDS2Service;
        get = ((i ^ 99) + ((i & 99) << 1)) % 128;
        jq jqVar = (jq) initialize(new Object[]{kjVar, textBoxCustomization}, -148887223, 148887227, System.identityHashCode(kjVar));
        int i2 = get;
        int i3 = (i2 & (-14)) | ((~i2) & 13);
        int i4 = (i2 & 13) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 == 0) {
            return jqVar;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization = (com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization) objArr[1];
        int i = get;
        int i2 = i & 103;
        int i3 = (~i2) & (i | 103);
        int i4 = i2 << 1;
        ThreeDS2Service = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        if (labelCustomization != null) {
            lr lrVar = new lr(labelCustomization);
            int i5 = ThreeDS2Service;
            get = ((i5 ^ 107) + ((i5 & 107) << 1)) % 128;
            return lrVar;
        }
        int i6 = i + 73;
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getSDKVersion(Object[] objArr) {
        kj kjVar = (kj) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization) objArr[1];
        int identityHashCode = System.identityHashCode(kjVar);
        int i = ~identityHashCode;
        int i2 = 123760413 & i;
        int i3 = (123760413 ^ i) | i2;
        int i4 = ~i3;
        int i5 = (939192253 & i4) | ((~i4) & (-939192254));
        int i6 = i4 & (-939192254);
        int i7 = (i5 & i6) | (i5 ^ i6);
        int i8 = (i ^ 918217649) | (i & 918217649);
        int i9 = ~i8;
        int i10 = (i8 | i9) & i9;
        int i11 = (i7 & i10) | (i7 ^ i10);
        int i12 = (-102785810) & identityHashCode;
        int i13 = ~((((-102785810) | identityHashCode) & (~i12)) | i12);
        int i14 = ((~i13) & i11) | ((~i11) & i13);
        int i15 = i11 & i13;
        int i16 = ((i15 & i14) | (i14 ^ i15)) * 590;
        int i17 = ((207723393 | i16) << 1) - (i16 ^ 207723393);
        int i18 = (i3 | i4) & i4;
        int i19 = i18 ^ (-939192254);
        int i20 = i18 & (-939192254);
        int i21 = (i20 & i19) | (i19 ^ i20);
        int i22 = (identityHashCode | i) & i;
        int i23 = i22 ^ 918217649;
        int i24 = i22 & 918217649;
        int i25 = ~((i24 & i23) | (i23 ^ i24));
        int i26 = (((i25 & i21) | ((~i25) & i21) | ((~i21) & i25)) * (-1180)) + i17;
        int i27 = ((-918217650) & i) | ((-918217650) ^ i);
        int i28 = ~i27;
        int i29 = (i27 | i28) & i28;
        int i30 = ~((i & (-123760414)) | i2 | ((~i) & (-123760414)));
        int i31 = ((~i30) & i29) | ((~i29) & i30);
        int i32 = i30 & i29;
        int i33 = -(-(((i32 & i31) | (i31 ^ i32)) * 590));
        int i34 = i26 ^ i33;
        int i35 = ((i26 & i33) | i34) << 1;
        int i36 = -i34;
        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
        int identityHashCode2 = System.identityHashCode(kjVar);
        int i38 = ~((382952418 ^ identityHashCode2) | (382952418 & identityHashCode2));
        int i39 = -(-(((i38 & (-1017761890)) | ((-1017761890) ^ i38)) * 398));
        int i40 = (-1580918176) ^ i39;
        int i41 = -(-((i39 & (-1580918176)) << 1));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        int i43 = i42 & (-1563016086);
        int i44 = ((i42 ^ (-1563016086)) | i43) << 1;
        int i45 = -(((-1563016086) | i42) & (~i43));
        int i46 = (i44 & i45) + (i45 | i44);
        int i47 = ~identityHashCode2;
        int i48 = (i47 & 382952418) | (382952418 ^ i47);
        int i49 = ~i48;
        int i50 = (i48 | i49) & i49;
        int i51 = (i50 & 38937474) | (i50 ^ 38937474);
        int i52 = ((i51 & (-1056699364)) | (1056699363 & i51) | ((~i51) & (-1056699364))) * 398;
        int i53 = i46 & i52;
        int i54 = (i52 | i46) & (~i53);
        int i55 = -(-(i53 << 1));
        if (i37 <= (i54 ^ i55) + ((i54 & i55) << 1)) {
            throw null;
        }
        if (buttonCustomization == null) {
            ThreeDS2Service = (get + 29) % 128;
            return null;
        }
        lu luVar = new lu(buttonCustomization);
        int i56 = ThreeDS2Service;
        get = ((i56 & 1) + (i56 | 1)) % 128;
        return luVar;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        kj kjVar = (kj) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization) objArr[1];
        int i = ThreeDS2Service;
        int i2 = ((i ^ 91) | (i & 91)) << 1;
        int i3 = -(((~i) & 91) | (i & (-92)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = {kjVar, buttonCustomization};
        int identityHashCode = System.identityHashCode(kjVar);
        if (i5 == 0) {
            throw null;
        }
        jo joVar = (jo) initialize(objArr2, -1722685152, 1722685161, identityHashCode);
        int i6 = get;
        ThreeDS2Service = ((i6 & 61) + (i6 | 61)) % 128;
        return joVar;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i4 | i3);
        int i6 = ~i3;
        int i7 = ((i5 | (~(i6 | i2))) * (-1808)) + (i2 * (-903)) + (i * 905);
        int i8 = ~i2;
        int i9 = i | i6;
        switch ((((~i9) | (~(i2 | i4)) | (~(i3 | i8))) * 904) + (((~(i9 | i2)) | (~(i4 | i8 | i3))) * 904) + i7) {
            case 1:
                return initialize(objArr);
            case 2:
                kj kjVar = (kj) objArr[0];
                com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization = (com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization) objArr[1];
                int i10 = ThreeDS2Service;
                int i11 = i10 ^ 75;
                int i12 = ((i10 & 75) | i11) << 1;
                int i13 = -i11;
                get = ((i12 & i13) + (i12 | i13)) % 128;
                jr jrVar = (jr) initialize(new Object[]{kjVar, labelCustomization}, 799119002, -799118999, System.identityHashCode(kjVar));
                int i14 = get;
                int i15 = i14 & 47;
                int i16 = i14 | 47;
                ThreeDS2Service = ((i15 & i16) + (i16 | i15)) % 128;
                return jrVar;
            case 3:
                return get(objArr);
            case 4:
                return ThreeDS2ServiceInstance(objArr);
            case 5:
                return ThreeDS2Service(objArr);
            case 6:
                return createTransaction(objArr);
            case 7:
                com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization viewCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization) objArr[1];
                int i17 = ThreeDS2Service;
                int i18 = i17 & 65;
                int i19 = (i18 + ((i17 ^ 65) | i18)) % 128;
                get = i19;
                if (viewCustomization == null) {
                    ThreeDS2Service = (i19 + 91) % 128;
                    return null;
                }
                ls lsVar = new ls(viewCustomization);
                ThreeDS2Service = (get + 27) % 128;
                return lsVar;
            case 8:
                return ThreeDS2ServiceInitializationCallback(objArr);
            case 9:
                return getSDKVersion(objArr);
            default:
                return getWarnings(objArr);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.kh
    public /* bridge */ /* synthetic */ ju ThreeDS2Service(com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization, UiCustomization.UiCustomizationType uiCustomizationType) {
        int i = get;
        int i2 = i & 15;
        int i3 = -(-(i | 15));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            super.ThreeDS2Service(uiCustomization, uiCustomizationType);
            throw null;
        }
        ju ThreeDS2Service2 = super.ThreeDS2Service(uiCustomization, uiCustomizationType);
        get = ((-2) - ((ThreeDS2Service + 32) ^ (-1))) % 128;
        return ThreeDS2Service2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.kh
    public ju getWarnings(final com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization) {
        ju juVar = new ju() { // from class: com.netcetera.threeds.sdk.infrastructure.kj.1
            private static int ThreeDS2Service = 0;
            private static int ThreeDS2ServiceInstance = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jr ThreeDS2Service() {
                int i = ThreeDS2ServiceInstance;
                int i2 = i & 107;
                int i3 = (i | 107) & (~i2);
                int i4 = -(-(i2 << 1));
                int i5 = (i3 & i4) + (i3 | i4);
                ThreeDS2Service = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = {kj.this, uiCustomization.getLabelCustomization()};
                int currentTimeMillis = (int) System.currentTimeMillis();
                if (i6 == 0) {
                    return (jr) kj.initialize(objArr, 1659780271, -1659780269, currentTimeMillis);
                }
                jr jrVar = (jr) kj.initialize(objArr, 1659780271, -1659780269, currentTimeMillis);
                int i7 = 0 / 0;
                return jrVar;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jq ThreeDS2ServiceInstance() {
                int identityHashCode = System.identityHashCode(this);
                int i = 1908424528 & identityHashCode;
                int i2 = (1908424528 | identityHashCode) & (~i);
                int i3 = ~((i2 & i) | (i2 ^ i));
                int i4 = (-643696311) - (~(((i3 & 36716550) | (36716550 ^ i3)) * (-140)));
                int i5 = (1945141078 & identityHashCode) | (1945141078 ^ identityHashCode);
                int i6 = -(-(((i5 | (~i5)) & (~i5)) * 70));
                int i7 = i4 ^ i6;
                int i8 = (i6 & i4) << 1;
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                int i10 = ~(identityHashCode | 1664122454);
                int i11 = ((~i10) & 317735174) | ((-317735175) & i10);
                int i12 = i10 & 317735174;
                int i13 = -(-(((i12 & i11) | (i11 ^ i12)) * 70));
                int i14 = i9 & i13;
                int i15 = (i14 - (~((i13 ^ i9) | i14))) - 1;
                int identityHashCode2 = System.identityHashCode(this);
                int i16 = 1974289678 & identityHashCode2;
                int i17 = (~i16) & (1974289678 | identityHashCode2);
                int i18 = ~((i16 & i17) | (i17 ^ i16));
                int i19 = -(-(((i18 & 145584) | (145584 ^ i18)) * 992));
                int i20 = (-968565703) & i19;
                int i21 = (((i19 | (-968565703)) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
                int i22 = ((~identityHashCode2) & 1974289678) | (identityHashCode2 & (-1974289679));
                int i23 = 1974289678 & identityHashCode2;
                int i24 = (i22 & i23) | (i22 ^ i23);
                int i25 = (i24 | (~i24)) & (~i24);
                int i26 = 145584 ^ i25;
                int i27 = 145584 & i25;
                int i28 = (i27 & i26) | (i26 ^ i27);
                int i29 = ~identityHashCode2;
                int i30 = (1974289678 & i29) | ((~i29) & (-1974289679));
                int i31 = i29 & (-1974289679);
                int i32 = (i30 & i31) | (i30 ^ i31);
                int i33 = i32 & 1342847160;
                int i34 = (i32 | 1342847160) & (~i33);
                int i35 = ~((i34 & i33) | (i34 ^ i33));
                int i36 = ((~i35) & i28) | ((~i28) & i35);
                int i37 = i35 & i28;
                int i38 = -(~(((i37 & i36) | (i36 ^ i37)) * (-496)));
                int i39 = (((i21 | i38) << 1) - (i38 ^ i21)) - 1;
                int i40 = 1342847160 & identityHashCode2;
                int i41 = -(-((((identityHashCode2 | 1342847160) & (~i40)) | i40) * 496));
                int i42 = i39 & i41;
                int i43 = ((i39 ^ i41) | i42) << 1;
                int i44 = -((i41 | i39) & (~i42));
                int i45 = (i43 & i44) + (i44 | i43);
                Object[] objArr = {kj.this, uiCustomization.getTextBoxCustomization()};
                if (i15 > i45) {
                    throw null;
                }
                jq jqVar = (jq) kj.initialize(objArr, 685761573, -685761567, (int) System.currentTimeMillis());
                int i46 = ThreeDS2ServiceInstance;
                int i47 = ((i46 & (-92)) | ((~i46) & 91)) + ((i46 & 91) << 1);
                ThreeDS2Service = i47 % 128;
                if (i47 % 2 == 0) {
                    return jqVar;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jw get() {
                int i = ThreeDS2ServiceInstance;
                int i2 = i ^ 65;
                int i3 = (i & 65) << 1;
                int i4 = (i2 & i3) + (i3 | i2);
                ThreeDS2Service = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = {kj.this, uiCustomization.getToolbarCustomization()};
                int currentTimeMillis = (int) System.currentTimeMillis();
                if (i5 != 0) {
                    throw null;
                }
                jw jwVar = (jw) kj.initialize(objArr, -303688442, 303688447, currentTimeMillis);
                int i6 = ThreeDS2ServiceInstance;
                int i7 = (i6 & (-50)) | ((~i6) & 49);
                int i8 = -(-((i6 & 49) << 1));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                ThreeDS2Service = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 8 / 0;
                }
                return jwVar;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jt getWarnings() {
                ThreeDS2Service = (ThreeDS2ServiceInstance + 3) % 128;
                jt jtVar = (jt) kj.initialize(new Object[]{kj.this, uiCustomization.getViewCustomization()}, 1511321857, -1511321856, (int) System.currentTimeMillis());
                int i = ThreeDS2Service;
                ThreeDS2ServiceInstance = Thread$State$EnumUnboxingLocalUtility.m(i & 30, i | 30, 1, 128);
                return jtVar;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.ju
            public jo get(UiCustomization.ButtonType buttonType) {
                int i = ThreeDS2ServiceInstance;
                ThreeDS2Service = ((i & 95) + (i | 95)) % 128;
                jo joVar = (jo) kj.initialize(new Object[]{kj.this, uiCustomization.getButtonCustomization(buttonType)}, 1178237858, -1178237858, (int) System.currentTimeMillis());
                ThreeDS2Service = (ThreeDS2ServiceInstance + 115) % 128;
                return joVar;
            }
        };
        int i = ThreeDS2Service;
        int i2 = (i & (-34)) | ((~i) & 33);
        int i3 = (i & 33) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        if (i4 % 2 != 0) {
            return juVar;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        kj kjVar = (kj) objArr[0];
        com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization viewCustomization = (com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization) objArr[1];
        int i = get;
        int i2 = (((i ^ 63) | (i & 63)) << 1) - (((~i) & 63) | (i & (-64)));
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {kjVar, viewCustomization};
        int identityHashCode = System.identityHashCode(kjVar);
        if (i3 == 0) {
            return (jt) initialize(objArr2, -130279095, 130279102, identityHashCode);
        }
        throw null;
    }
}
