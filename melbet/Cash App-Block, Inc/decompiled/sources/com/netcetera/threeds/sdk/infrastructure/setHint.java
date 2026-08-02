package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.setFreezesText;
import com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setHint implements setFocusedSearchResultIndex, setSearchResultHighlightColor {
    private static int ThreeDS2Service = 0;
    private static int getSDKVersion = 1;
    private final setIncludeFontPadding ThreeDS2ServiceInstance;
    private final setSearchResultHighlights get;
    private final setIncludeFontPadding getWarnings;
    private final setFreezesText initialize;

    public setHint(setFreezesText setfreezestext, setSearchResultHighlights setsearchresulthighlights, setIncludeFontPadding setincludefontpadding, setIncludeFontPadding setincludefontpadding2) {
        this.initialize = setfreezestext;
        this.get = setsearchresulthighlights;
        this.ThreeDS2ServiceInstance = setincludefontpadding;
        this.getWarnings = setincludefontpadding2;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        if ((((~(i | i2)) | (~(i3 | i4))) * 433) + (((~((~i2) | i3)) | i4) * (-433)) + ((~((~i3) | i4 | i2)) * 433) + (i2 * 434) + (i * (-432)) != 1) {
            return initialize(objArr);
        }
        setHint sethint = new setHint((setFreezesText) setFreezesText.get(new Object[0], 988694001, -988694001, (int) System.currentTimeMillis()), (setSearchResultHighlights) objArr[0], (setIncludeFontPadding) objArr[1], (setIncludeFontPadding) objArr[2]);
        int i5 = getSDKVersion;
        int i6 = i5 & 115;
        int i7 = (i5 | 115) & (~i6);
        int i8 = i6 << 1;
        ThreeDS2Service = ((i7 & i8) + (i7 | i8)) % 128;
        return sethint;
    }

    public static setHint getWarnings(setSearchResultHighlights setsearchresulthighlights, setIncludeFontPadding setincludefontpadding, setIncludeFontPadding setincludefontpadding2) {
        return (setHint) ThreeDS2Service(new Object[]{setsearchresulthighlights, setincludefontpadding, setincludefontpadding2}, 745856592, -745856591, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = getSDKVersion;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(i & 65, ~(-(-(i | 65))), 1, 128);
        if (oj.get(str)) {
            int i2 = (ThreeDS2Service + 87) % 128;
            getSDKVersion = i2;
            int i3 = i2 & 91;
            int i4 = -(-((i2 ^ 91) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            ThreeDS2Service = i5 % 128;
            if (i5 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        boolean z = oj.get(str, str2);
        int i6 = getSDKVersion;
        int i7 = i6 | 53;
        int i8 = ((i7 << 1) - (~(-((~(i6 & 53)) & i7)))) - 1;
        ThreeDS2Service = i8 % 128;
        if (i8 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i9 = 87 / 0;
        return Boolean.valueOf(z);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFocusedSearchResultIndex
    public void get(setSingleLine setsingleline) {
        String ThreeDS2Service2;
        String str;
        String ThreeDS2Service3;
        String str2;
        Throwable th;
        int i = ThreeDS2Service + 22;
        getSDKVersion = ((i ^ (-1)) + (i << 1)) % 128;
        if (getLocalizedMessage.getWarnings == setsingleline.ConfigParameters()) {
            int i2 = getSDKVersion;
            int i3 = (i2 & (-100)) | ((~i2) & 99);
            int i4 = (i2 & 99) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            ThreeDS2Service = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        setSearchResultHighlights.getWarnings ThreeDS2Service4 = this.get.ThreeDS2Service(setsingleline.createTransaction());
        setSearchResultHighlights.getWarnings ThreeDS2Service5 = this.get.ThreeDS2Service(setsingleline.ThreeDS2ServiceInitializationCallback());
        boolean booleanValue = ((Boolean) ThreeDS2Service(new Object[]{this, ThreeDS2Service4.ThreeDS2Service(), this.ThreeDS2ServiceInstance.get()}, -18690166, 18690166, System.identityHashCode(this))).booleanValue();
        boolean booleanValue2 = ((Boolean) ThreeDS2Service(new Object[]{this, ThreeDS2Service4.get(), this.ThreeDS2ServiceInstance.ThreeDS2Service()}, -18690166, 18690166, System.identityHashCode(this))).booleanValue();
        boolean booleanValue3 = ((Boolean) ThreeDS2Service(new Object[]{this, ThreeDS2Service5.ThreeDS2Service(), this.getWarnings.get()}, -18690166, 18690166, System.identityHashCode(this))).booleanValue();
        boolean booleanValue4 = ((Boolean) ThreeDS2Service(new Object[]{this, ThreeDS2Service5.get(), this.getWarnings.ThreeDS2Service()}, -18690166, 18690166, System.identityHashCode(this))).booleanValue();
        if (booleanValue) {
            int i6 = getSDKVersion;
            ThreeDS2Service = Thread$State$EnumUnboxingLocalUtility.m(i6 ^ 2, (i6 & 2) << 1, 1, 128);
            if (booleanValue2) {
                int i7 = i6 + 11;
                ThreeDS2Service = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (booleanValue3 && booleanValue4) {
                    int identityHashCode = System.identityHashCode(this);
                    int i8 = ~identityHashCode;
                    int i9 = 976245105 ^ i8;
                    int i10 = 976245105 & i8;
                    int i11 = (i9 & i10) | (i9 ^ i10);
                    int i12 = i11 ^ 1742914424;
                    int i13 = i11 & 1742914424;
                    int i14 = ~((i13 & i12) | (i12 ^ i13));
                    int i15 = (-403705858) & identityHashCode;
                    int i16 = ((-403705858) | identityHashCode) & (~i15);
                    int i17 = ~((i16 & i15) | (i16 ^ i15));
                    int i18 = ((~i17) & i14) | ((~i14) & i17);
                    int i19 = i14 & i17;
                    int i20 = -(-(((i19 & i18) | (i18 ^ i19)) * 988));
                    int i21 = (-1353242338) & i20;
                    int i22 = (i20 | (-1353242338)) & (~i21);
                    int i23 = i21 << 1;
                    int i24 = ((i22 & i23) + (i22 | i23)) - (-853006596);
                    int i25 = ~((identityHashCode & 976245105) | (976245105 ^ identityHashCode));
                    int i26 = (i25 & 1170375176) | (1170375176 ^ i25);
                    int i27 = ((-1742914425) & i8) | ((~i8) & 1742914424);
                    int i28 = i8 & 1742914424;
                    int i29 = (i28 & i27) | (i27 ^ i28);
                    int i30 = (976245105 & i29) | ((~i29) & (-976245106));
                    int i31 = i29 & (-976245106);
                    int i32 = ~((i31 & i30) | (i30 ^ i31));
                    int i33 = ((~i32) & i26) | ((~i26) & i32);
                    int i34 = i26 & i32;
                    int i35 = -(-(((i34 & i33) | (i33 ^ i34)) * 988));
                    int i36 = i24 & i35;
                    int i37 = ((i35 | i24) & (~i36)) + (i36 << 1);
                    int identityHashCode2 = System.identityHashCode(this);
                    int i38 = ~identityHashCode2;
                    int i39 = ((~i38) & 623975997) | ((-623975998) & i38);
                    int i40 = 623975997 & i38;
                    int i41 = ~((i39 & i40) | (i39 ^ i40));
                    int i42 = 1519886332 & i38;
                    int i43 = (identityHashCode2 & (-1519886333)) | i42;
                    int i44 = 1519886332 & identityHashCode2;
                    int i45 = (i43 & i44) | (i43 ^ i44);
                    int i46 = (i45 | (~i45)) & (~i45);
                    int i47 = i41 & i46;
                    int i48 = (((i41 | i46) & (~i47)) | i47) * 333;
                    int i49 = (1837495421 | i48) << 1;
                    int i50 = -((i48 & (-1837495422)) | (1837495421 & (~i48)));
                    int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                    int i52 = 623975997 & identityHashCode2;
                    int i53 = ~(((identityHashCode2 | 623975997) & (~i52)) | i52);
                    int i54 = ((~i38) & 1519886332) | (i38 & (-1519886333));
                    int i55 = (i54 & i42) | (i54 ^ i42);
                    int i56 = (i55 | (~i55)) & (~i55);
                    int i57 = ((~i56) & i53) | ((~i53) & i56);
                    int i58 = i53 & i56;
                    int i59 = ((i58 & i57) | (i57 ^ i58)) * 333;
                    int i60 = ((i51 ^ i59) | (i51 & i59)) << 1;
                    int i61 = -((i59 & (~i51)) | ((~i59) & i51));
                    if (i37 > (i60 ^ i61) + ((i61 & i60) << 1)) {
                        throw null;
                    }
                    return;
                }
            }
        }
        setFreezesText setfreezestext = this.initialize;
        if (booleanValue) {
            int i62 = ThreeDS2Service;
            int i63 = (i62 | 79) << 1;
            int i64 = -(i62 ^ 79);
            getSDKVersion = ((i63 & i64) + (i64 | i63)) % 128;
            ThreeDS2Service2 = null;
        } else {
            ThreeDS2Service2 = ThreeDS2Service4.ThreeDS2Service();
            int i65 = getSDKVersion;
            int i66 = (i65 | 63) << 1;
            int i67 = -(((~i65) & 63) | (i65 & (-64)));
            ThreeDS2Service = (((i66 | i67) << 1) - (i67 ^ i66)) % 128;
        }
        if (booleanValue2) {
            int i68 = getSDKVersion;
            int i69 = i68 & 23;
            int i70 = -(-((i68 ^ 23) | i69));
            int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
            ThreeDS2Service = i71 % 128;
            if (i71 % 2 != 0) {
                throw null;
            }
            int i72 = i68 & 105;
            ThreeDS2Service = (i72 + ((i68 ^ 105) | i72)) % 128;
            str = null;
        } else {
            str = ThreeDS2Service4.get();
            int i73 = ThreeDS2Service;
            getSDKVersion = Thread$State$EnumUnboxingLocalUtility.m(i73 ^ 82, (i73 & 82) << 1, 1, 128);
        }
        if (booleanValue3) {
            getSDKVersion = (ThreeDS2Service + 31) % 128;
            System.identityHashCode(this);
            System.identityHashCode(this);
            ThreeDS2Service3 = null;
        } else {
            ThreeDS2Service3 = ThreeDS2Service5.ThreeDS2Service();
            int i74 = getSDKVersion;
            int i75 = i74 | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i76 = i75 << 1;
            int i77 = -((~(i74 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) & i75);
            ThreeDS2Service = ((i76 & i77) + (i76 | i77)) % 128;
        }
        if (booleanValue4) {
            int i78 = ThreeDS2Service;
            int i79 = (((i78 | 36) << 1) - (i78 ^ 36)) - 1;
            getSDKVersion = i79 % 128;
            if (i79 % 2 == 0) {
                throw null;
            }
            str2 = null;
            th = null;
        } else {
            str2 = ThreeDS2Service5.get();
            int i80 = ThreeDS2Service;
            th = null;
            int i81 = i80 & 19;
            getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1((~i81) & (i80 | 19), ~(i81 << 1), 1, 128);
        }
        setFreezesText.initialize warnings = setfreezestext.getWarnings(ThreeDS2Service2, str, ThreeDS2Service3, str2);
        if (!booleanValue) {
            int identityHashCode3 = System.identityHashCode(this);
            int i82 = 2130640511 & identityHashCode3;
            int i83 = (~i82) & (2130640511 | identityHashCode3);
            int i84 = ~identityHashCode3;
            int i85 = (i82 & i83) | (i83 ^ i82);
            int i86 = (i85 | (~i85)) & (~i85);
            int i87 = 143671818 ^ i86;
            int i88 = i86 & 143671818;
            int i89 = -(-(((i88 & i87) | (i87 ^ i88)) * (-756)));
            int i90 = ((~i89) & (-930433275)) | (930433274 & i89);
            int i91 = (i89 & (-930433275)) << 1;
            int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
            int i93 = (identityHashCode3 | i84) & (~identityHashCode3);
            int i94 = ((~i93) & 2130640511) | ((-2130640512) & i93);
            int i95 = i93 & 2130640511;
            int i96 = ((i95 & i94) | (i94 ^ i95)) * 756;
            int i97 = i92 & i96;
            int i98 = i97 + ((i96 ^ i92) | i97);
            int identityHashCode4 = System.identityHashCode(this);
            int i99 = (~identityHashCode4) & ((~identityHashCode4) | identityHashCode4);
            int i100 = (-946914261) ^ i99;
            int i101 = i99 & (-946914261);
            int i102 = -(-((~((i101 & i100) | (i100 ^ i101))) * 979));
            int i103 = 1879940340 & i102;
            int i104 = (i102 | 1879940340) & (~i103);
            int i105 = i103 << 1;
            int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
            int i107 = 683942907 & identityHashCode4;
            int i108 = (~i107) & (683942907 | identityHashCode4);
            int i109 = (((i107 & i108) | (i108 ^ i107)) * (-979)) + i106;
            int i110 = (-946914261) & identityHashCode4;
            int i111 = ((-946914261) | identityHashCode4) & (~i110);
            int i112 = ~((i111 & i110) | (i111 ^ i110));
            int i113 = ~identityHashCode4;
            int i114 = i113 & 683942907;
            int i115 = (i113 | 683942907) & (~i114);
            int i116 = ~((i115 & i114) | (i115 ^ i114));
            int i117 = -(-(((i116 & i112) | (i112 ^ i116)) * 979));
            int i118 = i109 & i117;
            int i119 = ((i109 ^ i117) | i118) << 1;
            int i120 = -((i117 | i109) & (~i118));
            int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
            setIncludeFontPadding setincludefontpadding = this.ThreeDS2ServiceInstance;
            if (i98 > i121) {
                setincludefontpadding.get(ThreeDS2Service4.ThreeDS2Service());
                this.ThreeDS2ServiceInstance.P_(warnings.F_());
                throw th;
            }
            setincludefontpadding.get(ThreeDS2Service4.ThreeDS2Service());
            this.ThreeDS2ServiceInstance.P_(warnings.F_());
            int i122 = ThreeDS2Service;
            int i123 = i122 & 103;
            int i124 = (i122 | 103) & (~i123);
            int i125 = i123 << 1;
            getSDKVersion = ((i124 & i125) + (i124 | i125)) % 128;
        }
        if (!booleanValue2) {
            int i126 = ThreeDS2Service;
            int i127 = i126 & 69;
            int i128 = -(-((i126 ^ 69) | i127));
            int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
            getSDKVersion = i129 % 128;
            int i130 = i129 % 2;
            setIncludeFontPadding setincludefontpadding2 = this.ThreeDS2ServiceInstance;
            if (i130 == 0) {
                setincludefontpadding2.getWarnings(ThreeDS2Service4.get());
                this.ThreeDS2ServiceInstance.Q_(warnings.G_());
                int i131 = 42 / 0;
            } else {
                setincludefontpadding2.getWarnings(ThreeDS2Service4.get());
                this.ThreeDS2ServiceInstance.Q_(warnings.G_());
            }
            ThreeDS2Service = (getSDKVersion + 93) % 128;
        }
        if (!booleanValue3) {
            int i132 = ThreeDS2Service;
            int i133 = (i132 ^ 95) + ((i132 & 95) << 1);
            getSDKVersion = i133 % 128;
            int i134 = i133 % 2;
            setIncludeFontPadding setincludefontpadding3 = this.getWarnings;
            if (i134 == 0) {
                setincludefontpadding3.get(ThreeDS2Service5.ThreeDS2Service());
                this.getWarnings.P_(warnings.H_());
                throw th;
            }
            setincludefontpadding3.get(ThreeDS2Service5.ThreeDS2Service());
            this.getWarnings.P_(warnings.H_());
            int i135 = ThreeDS2Service;
            int i136 = i135 & 75;
            getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i135 ^ 75) | i136) << 1, ~(-((i135 | 75) & (~i136))), 1, 128);
        }
        if (!booleanValue4) {
            int identityHashCode5 = System.identityHashCode(this);
            int i137 = ~identityHashCode5;
            int i138 = (-76548174) ^ i137;
            int i139 = (-76548174) & i137;
            int i140 = ((i139 & i138) | (i138 ^ i139)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            int i141 = (1889106599 ^ i140) + ((i140 & 1889106599) << 1);
            int i142 = (identityHashCode5 | i137) & (~identityHashCode5);
            int i143 = i142 ^ (-1722829022);
            int i144 = i142 & (-1722829022);
            int i145 = ~((i144 & i143) | (i143 ^ i144));
            int i146 = (i145 & 156045824) | ((~i145) & 156045824) | ((-156045825) & i145);
            int i147 = ((i146 & 1646280848) | (i146 ^ 1646280848)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            int i148 = ((i141 | i147) << 1) - (i147 ^ i141);
            int identityHashCode6 = System.identityHashCode(this);
            int i149 = ~identityHashCode6;
            int i150 = ((~i149) & 2146631631) | ((-2146631632) & i149);
            int i151 = 2146631631 & i149;
            int i152 = ~((i150 & i151) | (i150 ^ i151));
            int i153 = ((-1030942608) & i149) | (identityHashCode6 & 1030942607);
            int i154 = (-1030942608) & identityHashCode6;
            int i155 = ~((i153 & i154) | (i153 ^ i154));
            int i156 = ((~i155) & i152) | ((~i152) & i155);
            int i157 = i152 & i155;
            int i158 = -(~(((i157 & i156) | (i156 ^ i157)) * 520));
            int i159 = (-2) - (((((-909728166) | i158) << 1) - (i158 ^ (-909728166))) ^ (-1));
            int i160 = ~identityHashCode6;
            int i161 = ((-1030942608) & i160) | ((~i160) & 1030942607);
            int i162 = i160 & 1030942607;
            int i163 = ~((i161 & i162) | (i161 ^ i162));
            int i164 = (-1132468166) & identityHashCode6;
            int i165 = (identityHashCode6 | (-1132468166)) & (~i164);
            int i166 = i165 | i164;
            int i167 = (i166 | (~i166)) & (~i166);
            int i168 = i163 ^ i167;
            int i169 = i163 & i167;
            int i170 = -(~(((i169 & i168) | (i168 ^ i169)) * (-1040)));
            int i171 = (((i159 | i170) << 1) - (i159 ^ i170)) - 1;
            int i172 = (i149 & 1132468165) | (1132468165 ^ i149);
            int i173 = (i172 | (~i172)) & (~i172);
            int i174 = i173 & 1115689024;
            int i175 = ((i173 | 1115689024) & (~i174)) | i174;
            int i176 = (i165 & i164) | (i165 ^ i164);
            int i177 = (i176 | (~i176)) & (~i176);
            int i178 = ((i177 & i175) | (i175 ^ i177)) * 520;
            int i179 = (i171 ^ i178) + ((i178 & i171) << 1);
            setIncludeFontPadding setincludefontpadding4 = this.getWarnings;
            if (i148 > i179) {
                setincludefontpadding4.getWarnings(ThreeDS2Service5.get());
                this.getWarnings.Q_(warnings.I_());
                int i180 = 7 / 0;
            } else {
                setincludefontpadding4.getWarnings(ThreeDS2Service5.get());
                this.getWarnings.Q_(warnings.I_());
            }
        }
        int i181 = getSDKVersion + 53;
        ThreeDS2Service = i181 % 128;
        if (i181 % 2 != 0) {
            int i182 = 87 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlightColor
    public setFilters getWarnings() {
        int i = getSDKVersion;
        setIncludeFontPadding setincludefontpadding = this.ThreeDS2ServiceInstance;
        int i2 = i & 59;
        ThreeDS2Service = ((((i ^ 59) | i2) << 1) - ((i | 59) & (~i2))) % 128;
        return setincludefontpadding;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlightColor
    public setFilters get() {
        int i = ThreeDS2Service;
        int i2 = i ^ 47;
        int i3 = ((i & 47) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getSDKVersion = i5 % 128;
        int i6 = i5 % 2;
        setIncludeFontPadding setincludefontpadding = this.getWarnings;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i ^ 9;
        int i8 = (i & 9) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        getSDKVersion = i9 % 128;
        if (i9 % 2 != 0) {
            return setincludefontpadding;
        }
        throw null;
    }
}
