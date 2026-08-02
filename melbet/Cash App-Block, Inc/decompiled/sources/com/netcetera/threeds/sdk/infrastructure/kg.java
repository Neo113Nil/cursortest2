package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class kg implements ju {
    private static int createTransaction = 1;
    private static int getSDKVersion;
    private final Map<String, jo> ThreeDS2Service;
    private final jr ThreeDS2ServiceInstance;
    private final jo get;
    private final jt getSDKInfo;
    private final jq getWarnings;
    private final jw initialize;

    private kg(Map<String, jo> map, jw jwVar, jq jqVar, jr jrVar, jo joVar, jt jtVar) {
        this.ThreeDS2Service = map;
        this.initialize = jwVar;
        this.getWarnings = jqVar;
        this.ThreeDS2ServiceInstance = jrVar;
        this.get = joVar;
        this.getSDKInfo = jtVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jr ThreeDS2Service() {
        int i = createTransaction;
        int i2 = i & 87;
        int i3 = i | 87;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getSDKVersion = i4 % 128;
        int i5 = i4 % 2;
        jr jrVar = this.ThreeDS2ServiceInstance;
        if (i5 == 0) {
            return jrVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jq ThreeDS2ServiceInstance() {
        int i = createTransaction;
        int i2 = i & 65;
        int i3 = ((((i ^ 65) | i2) << 1) - (~(-((i | 65) & (~i2))))) - 1;
        int i4 = i3 % 128;
        getSDKVersion = i4;
        int i5 = i3 % 2;
        jq jqVar = this.getWarnings;
        if (i5 != 0) {
            throw null;
        }
        createTransaction = SVG$Unit$EnumUnboxingLocalUtility.m$1((i4 | 77) << 1, ~(-(i4 ^ 77)), 1, 128);
        return jqVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jw get() {
        int identityHashCode = System.identityHashCode(this);
        int i = ~((~identityHashCode) | 950478048);
        int i2 = 2144293219 & i;
        int i3 = (i | 2144293219) & (~i2);
        int i4 = -(-(((i3 & i2) | (i3 ^ i2)) * (-235)));
        int i5 = (-329728583) & i4;
        int i6 = (((-329728583) ^ i4) | i5) << 1;
        int i7 = -((i4 | (-329728583)) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = 950478048 & identityHashCode;
        int i10 = (950478048 | identityHashCode) & (~i9);
        int i11 = ~((i9 & i10) | (i10 ^ i9));
        int i12 = 2144293219 & i11;
        int i13 = (i11 | 2144293219) & (~i12);
        int i14 = ((i13 & i12) | (i13 ^ i12)) * (-470);
        int i15 = i8 & i14;
        int i16 = (i14 ^ i8) | i15;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        int i18 = (identityHashCode & 2146399715) | (2146399715 ^ identityHashCode);
        int i19 = (i18 | (~i18)) & (~i18);
        int i20 = 948371552 ^ i19;
        int i21 = i19 & 948371552;
        int i22 = -(-(((i21 & i20) | (i20 ^ i21)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
        int i23 = i17 & i22;
        int i24 = (i22 | i17) & (~i23);
        int i25 = i23 << 1;
        int i26 = (i24 & i25) + (i24 | i25);
        int identityHashCode2 = System.identityHashCode(this);
        int i27 = ((~identityHashCode2) & 1772945845) | (identityHashCode2 & (-1772945846));
        int i28 = 1772945845 & identityHashCode2;
        int i29 = ~((i27 & i28) | (i27 ^ i28));
        int i30 = ((~i29) & (-1984622245)) | (1984622244 & i29);
        int i31 = i29 & (-1984622245);
        int i32 = (((i31 & i30) | (i30 ^ i31)) * 398) + 98037973;
        int i33 = i32 ^ (-447544942);
        int i34 = ((i32 & (-447544942)) | i33) << 1;
        int i35 = -i33;
        int i36 = (i34 & i35) + (i34 | i35);
        int i37 = ~identityHashCode2;
        int i38 = ((~i37) & 1772945845) | ((-1772945846) & i37);
        int i39 = i37 & 1772945845;
        int i40 = ~((i39 & i38) | (i38 ^ i39));
        int i41 = ((-161808658) & i40) | ((~i40) & 161808657);
        int i42 = i40 & 161808657;
        int i43 = (i42 & i41) | (i41 ^ i42);
        int i44 = i43 & (-2146430902);
        int i45 = (i43 | (-2146430902)) & (~i44);
        int i46 = -(~(-(-(((i45 & i44) | (i45 ^ i44)) * 398))));
        int i47 = ((i36 ^ i46) + ((i46 & i36) << 1)) - 1;
        jw jwVar = this.initialize;
        if (i26 <= i47) {
            throw null;
        }
        int i48 = getSDKVersion;
        int i49 = i48 & 39;
        int i50 = -(-((i48 ^ 39) | i49));
        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
        createTransaction = i51 % 128;
        if (i51 % 2 == 0) {
            int i52 = 47 / 0;
        }
        return jwVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jt getWarnings() {
        int i = createTransaction;
        int i2 = (i ^ 93) + ((i & 93) << 1);
        getSDKVersion = i2 % 128;
        int i3 = i2 % 2;
        jt jtVar = this.getSDKInfo;
        if (i3 == 0) {
            return jtVar;
        }
        throw null;
    }

    public jo initialize(String str) {
        int i = createTransaction;
        int i2 = (i & (-62)) | ((~i) & 61);
        int i3 = (i & 61) << 1;
        getSDKVersion = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        jo joVar = (jo) og.ThreeDS2Service(this.ThreeDS2Service.get(str), this.get);
        int i4 = getSDKVersion;
        int i5 = (i4 | 107) << 1;
        int i6 = -(i4 ^ 107);
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        createTransaction = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 37 / 0;
        }
        return joVar;
    }

    public static ju initialize() {
        return (ju) get(new Object[0], 1910829066, -1910829066, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jo get(UiCustomization.ButtonType buttonType) {
        String str;
        int i = createTransaction;
        int i2 = i & 125;
        int i3 = (~i2) & (i | 125);
        int i4 = i2 << 1;
        int i5 = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        getSDKVersion = i5;
        if (buttonType != null) {
            int i6 = i & 19;
            int i7 = (i | 19) & (~i6);
            int i8 = -(-(i6 << 1));
            getSDKVersion = ((i7 & i8) + (i7 | i8)) % 128;
            str = buttonType.name();
            int i9 = getSDKVersion;
            int i10 = i9 ^ 55;
            int i11 = (i9 & 55) << 1;
            createTransaction = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
        } else {
            createTransaction = (i5 + 125) % 128;
            str = null;
        }
        jo initialize = initialize(str);
        int i12 = getSDKVersion;
        int i13 = i12 & 39;
        int i14 = (i13 - (~((i12 ^ 39) | i13))) - 1;
        createTransaction = i14 % 128;
        if (i14 % 2 != 0) {
            return initialize;
        }
        throw null;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        jx jxVar = new jx();
        jz jzVar = new jz();
        ka kaVar = new ka();
        jo onError = jy.onError();
        jo sDKVersion = jy.getSDKVersion();
        jo ThreeDS2ServiceInitializationCallback = jy.ThreeDS2ServiceInitializationCallback();
        jo cleanup = jy.cleanup();
        jo createTransaction2 = jy.createTransaction();
        jo sDKInfo = jy.getSDKInfo();
        jo joVar = (jo) jy.get(new Object[0], 464217402, -464217402, (int) System.currentTimeMillis());
        jo ConfigParameters = jy.ConfigParameters();
        hashMap.put(UiCustomization.ButtonType.SUBMIT.name(), sDKVersion);
        hashMap.put(UiCustomization.ButtonType.CONTINUE.name(), ThreeDS2ServiceInitializationCallback);
        hashMap.put(UiCustomization.ButtonType.NEXT.name(), cleanup);
        hashMap.put(UiCustomization.ButtonType.RESEND.name(), createTransaction2);
        hashMap.put(UiCustomization.ButtonType.CANCEL.name(), sDKInfo);
        hashMap.put(UiCustomization.ButtonType.OPEN_OOB_APP.name(), joVar);
        hashMap.put(UiCustomization.ButtonType.ADD_CH.name(), ConfigParameters);
        kg kgVar = new kg(hashMap, jxVar, jzVar, kaVar, onError, new ke());
        int i4 = createTransaction;
        int i5 = i4 & 59;
        int i6 = i4 | 59;
        getSDKVersion = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        return kgVar;
    }
}
