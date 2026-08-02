package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes5.dex */
public class setTitleMarginBottom implements setScroller {
    private static int SchemeConfigurationBuilder = 0;
    private static int getSchemeEncryptionPublicKeyId = 1;
    private final String ConfigParameters;
    private final List<setTextIsSelectable> ConfigurationBuilder;
    private final String SchemeConfiguration;
    private final String ThreeDS2Service;
    private final List<setMarqueeRepeatLimit> ThreeDS2ServiceInitializationCallback;
    private final load ThreeDS2ServiceInstance;
    private final setImeHintLocales addParam;
    private final setFilters amexConfiguration;
    private final String apiKey;
    private final String build;
    private final String cbConfiguration;
    private final wait cleanup;
    private final String configureScheme;
    private final Integer createTransaction;
    private final String dinersSchemeConfiguration;
    private final String eftposConfiguration;
    private final put get;
    private final getLocalizedMessage getParamValue;
    private final String getSDKInfo;
    private final String getSDKVersion;
    private final String getSchemeEncryptionPublicKey;
    private final printStackTrace getSchemeId;
    private final String getSchemeLogo;
    private final String getSchemeLogoDark;
    private final putAll getSchemeName;
    private final String getWarnings;
    private final String ids;
    private final String initialize;
    private final String jcbConfiguration;
    private final String mastercardSchemeConfiguration;
    private final String newSchemeConfiguration;
    private final String onCompleted;
    private final setImeHintLocales onError;
    private final addSuppressed removeParam;
    private final String restrictedParameters;
    private final setFilters unionSchemeConfiguration;
    private final String visaSchemeConfiguration;

    public setTitleMarginBottom(load loadVar, String str, String str2, put putVar, String str3, List<setMarqueeRepeatLimit> list, wait waitVar, Integer num, String str4, String str5, getLocalizedMessage getlocalizedmessage, String str6, setImeHintLocales setimehintlocales, setImeHintLocales setimehintlocales2, String str7, String str8, String str9, addSuppressed addsuppressed, List<setTextIsSelectable> list2, String str10, String str11, setFilters setfilters, String str12, String str13, String str14, setFilters setfilters2, String str15, String str16, String str17, String str18, String str19, String str20, printStackTrace printstacktrace, putAll putall, String str21, String str22, String str23) {
        this.ThreeDS2ServiceInstance = loadVar;
        this.getWarnings = str;
        this.ThreeDS2Service = str2;
        this.get = putVar;
        this.initialize = str3;
        this.ThreeDS2ServiceInitializationCallback = list;
        this.cleanup = waitVar;
        this.createTransaction = num;
        this.getSDKInfo = str4;
        this.getSDKVersion = str5;
        this.getParamValue = getlocalizedmessage;
        this.onCompleted = str6;
        this.addParam = setimehintlocales;
        this.onError = setimehintlocales2;
        this.ConfigParameters = str7;
        this.restrictedParameters = str8;
        this.apiKey = str9;
        this.removeParam = addsuppressed;
        this.ConfigurationBuilder = list2;
        this.configureScheme = str10;
        this.visaSchemeConfiguration = str11;
        this.amexConfiguration = setfilters;
        this.mastercardSchemeConfiguration = str12;
        this.build = str13;
        this.SchemeConfiguration = str14;
        this.unionSchemeConfiguration = setfilters2;
        this.cbConfiguration = str15;
        this.eftposConfiguration = str16;
        this.jcbConfiguration = str17;
        this.dinersSchemeConfiguration = str18;
        this.getSchemeLogoDark = str19;
        this.getSchemeLogo = str20;
        this.getSchemeId = printstacktrace;
        this.getSchemeName = putall;
        this.newSchemeConfiguration = str21;
        this.getSchemeEncryptionPublicKey = str22;
        this.ids = str23;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public getLocalizedMessage ConfigParameters() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = ((i & (-36)) | ((~i) & 35)) + ((i & 35) << 1);
        SchemeConfigurationBuilder = i2 % 128;
        int i3 = i2 % 2;
        getLocalizedMessage getlocalizedmessage = this.getParamValue;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return getlocalizedmessage;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String ConfigurationBuilder() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = ((i ^ 71) | (i & 71)) << 1;
        int i3 = -(((~i) & 71) | (i & (-72)));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        SchemeConfigurationBuilder = i4;
        String str = this.restrictedParameters;
        int i5 = (i4 & 3) + (i4 | 3);
        getSchemeEncryptionPublicKeyId = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String SchemeConfiguration() {
        int i = getSchemeEncryptionPublicKeyId;
        String str = this.visaSchemeConfiguration;
        SchemeConfigurationBuilder = (i + 55) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String SchemeConfigurationBuilder() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = (i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        SchemeConfigurationBuilder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ids;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i & 111;
        int i5 = (i4 - (~((i ^ 111) | i4))) - 1;
        SchemeConfigurationBuilder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String ThreeDS2Service() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = i ^ 83;
        int i3 = -(-((i & 83) << 1));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        SchemeConfigurationBuilder = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ThreeDS2Service;
        if (i5 != 0) {
            throw null;
        }
        int i6 = ((i ^ 9) | (i & 9)) << 1;
        int i7 = -(((~i) & 9) | (i & (-10)));
        int i8 = (i6 & i7) + (i7 | i6);
        SchemeConfigurationBuilder = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public setFilters ThreeDS2ServiceInitializationCallback() {
        int i = SchemeConfigurationBuilder;
        int i2 = i & 61;
        int i3 = -(-((i ^ 61) | i2));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        getSchemeEncryptionPublicKeyId = i4 % 128;
        int i5 = i4 % 2;
        setFilters setfilters = this.unionSchemeConfiguration;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i & 57;
        int i7 = ((i ^ 57) | i6) << 1;
        int i8 = -((i | 57) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        getSchemeEncryptionPublicKeyId = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 81 / 0;
        }
        return setfilters;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public load ThreeDS2ServiceInstance() {
        int i = SchemeConfigurationBuilder;
        int i2 = (i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        getSchemeEncryptionPublicKeyId = i2 % 128;
        int i3 = i2 % 2;
        load loadVar = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            return loadVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String addParam() {
        int i = SchemeConfigurationBuilder;
        int i2 = ((i | 45) << 1) - (i ^ 45);
        getSchemeEncryptionPublicKeyId = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getSDKInfo;
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public List<setTextIsSelectable> amexConfiguration() {
        int identityHashCode = System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ((-2012629563) & i) | (identityHashCode & 2012629562);
        int i3 = (-2012629563) & identityHashCode;
        int i4 = ~((i2 & i3) | (i2 ^ i3));
        int i5 = (~identityHashCode) & (i | identityHashCode);
        int i6 = i5 & 648130176;
        int i7 = (i5 | 648130176) & (~i6);
        int i8 = (i7 & i6) | (i7 ^ i6);
        int i9 = i8 & 2012629562;
        int i10 = ~(((i8 | 2012629562) & (~i9)) | i9);
        int i11 = ((~i10) & i4) | ((~i4) & i10);
        int i12 = i4 & i10;
        int i13 = ((i12 & i11) | (i11 ^ i12)) * (-406);
        int i14 = (-1698238026) & i13;
        int i15 = (i14 - (~((i13 ^ (-1698238026)) | i14))) - 1;
        int i16 = (-2012629563) ^ i;
        int i17 = (-2012629563) & i;
        int i18 = (i17 & i16) | (i16 ^ i17);
        int i19 = (i18 & 648130176) | (i18 ^ 648130176);
        int i20 = -(~(-(-(((i19 | (~i19)) & (~i19)) * (-406)))));
        int i21 = (i15 & i20) + (i20 | i15);
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        int i23 = (i & (-648130177)) | (648130176 & identityHashCode);
        int i24 = (-648130177) & identityHashCode;
        int i25 = ~((i23 & i24) | (i23 ^ i24));
        int i26 = ~identityHashCode;
        int i27 = i26 & 2012629562;
        int i28 = ~(((i26 | 2012629562) & (~i27)) | i27);
        int i29 = i25 & i28;
        int i30 = (i28 | i25) & (~i29);
        int i31 = (i22 - (~(((i30 & i29) | (i30 ^ i29)) * 406))) - 1;
        int i32 = ~System.identityHashCode(this);
        int i33 = 518848216 & i32;
        int i34 = (518848216 | i32) & (~i33);
        int i35 = (i34 & i33) | (i34 ^ i33);
        int i36 = ((((i35 | (~i35)) & (~i35)) | 58427694) * (-933)) - 652893338;
        int i37 = ((~i32) & 58427694) | ((-58427695) & i32);
        int i38 = i32 & 58427694;
        int i39 = ~((i38 & i37) | (i37 ^ i38));
        int i40 = i39 & 478443216;
        int i41 = (i39 | 478443216) & (~i40);
        int i42 = -(-(((i41 & i40) | (i41 ^ i40)) * 933));
        int i43 = i36 & i42;
        int i44 = ((i36 ^ i42) | i43) << 1;
        int i45 = -((i42 | i36) & (~i43));
        int i46 = ((i44 & i45) + (i45 | i44)) - 956840664;
        List<setTextIsSelectable> list = this.ConfigurationBuilder;
        if (i31 > i46) {
            int i47 = 26 / 0;
        }
        int i48 = getSchemeEncryptionPublicKeyId;
        SchemeConfigurationBuilder = SVG$Unit$EnumUnboxingLocalUtility.m$1((i48 & (-118)) | ((~i48) & 117), ~((i48 & 117) << 1), 1, 128);
        return list;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public setImeHintLocales apiKey() {
        int i = SchemeConfigurationBuilder + 125;
        int i2 = i % 128;
        getSchemeEncryptionPublicKeyId = i2;
        int i3 = i % 2;
        setImeHintLocales setimehintlocales = this.addParam;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i2 & 17;
        int i5 = i2 | 17;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        SchemeConfigurationBuilder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 75 / 0;
        }
        return setimehintlocales;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String build() {
        int i = SchemeConfigurationBuilder;
        String str = this.configureScheme;
        int i2 = ((i ^ 77) | (i & 77)) << 1;
        int i3 = -(((~i) & 77) | (i & (-78)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSchemeEncryptionPublicKeyId = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String cbConfiguration() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = (i & (-88)) | ((~i) & 87);
        int i3 = (i & 87) << 1;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        SchemeConfigurationBuilder = i4;
        String str = this.build;
        int i5 = i4 & 117;
        int i6 = -(-((i4 ^ 117) | i5));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        getSchemeEncryptionPublicKeyId = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInputExtras
    public Integer cleanup() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = i & 19;
        int i3 = -(-((i ^ 19) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        SchemeConfigurationBuilder = i4;
        Integer num = this.createTransaction;
        int i5 = ((i4 ^ 101) | (i4 & 101)) << 1;
        int i6 = -((i4 & (-102)) | ((~i4) & 101));
        int i7 = (i5 & i6) + (i5 | i6);
        getSchemeEncryptionPublicKeyId = i7 % 128;
        if (i7 % 2 != 0) {
            return num;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String configureScheme() {
        int i = (getSchemeEncryptionPublicKeyId + 81) % 128;
        SchemeConfigurationBuilder = i;
        String str = this.apiKey;
        int i2 = i + 119;
        getSchemeEncryptionPublicKeyId = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public setFilters createTransaction() {
        int i = SchemeConfigurationBuilder;
        int i2 = i & 43;
        int i3 = ((i ^ 43) | i2) << 1;
        int i4 = -((i | 43) & (~i2));
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        getSchemeEncryptionPublicKeyId = i5;
        setFilters setfilters = this.amexConfiguration;
        int i6 = i5 ^ 29;
        int i7 = (((i5 & 29) | i6) << 1) - i6;
        SchemeConfigurationBuilder = i7 % 128;
        if (i7 % 2 == 0) {
            return setfilters;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String dinersSchemeConfiguration() {
        int i = (getSchemeEncryptionPublicKeyId + 81) % 128;
        SchemeConfigurationBuilder = i;
        String str = this.jcbConfiguration;
        getSchemeEncryptionPublicKeyId = ((i & 77) + (i | 77)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String eftposConfiguration() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = (i & (-70)) | ((~i) & 69);
        int i3 = -(-((i & 69) << 1));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        SchemeConfigurationBuilder = i4;
        String str = this.cbConfiguration;
        int i5 = ((i4 | 44) << 1) - (i4 ^ 44);
        getSchemeEncryptionPublicKeyId = ((i5 ^ (-1)) + (i5 << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String get() {
        int i = (SchemeConfigurationBuilder + 21) % 128;
        getSchemeEncryptionPublicKeyId = i;
        String str = this.getWarnings;
        SchemeConfigurationBuilder = SVG$Unit$EnumUnboxingLocalUtility.m(i ^ 10, (i & 10) << 1, -1, 128);
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public printStackTrace getParamValue() {
        int i = SchemeConfigurationBuilder;
        int i2 = ((i ^ 51) | (i & 51)) << 1;
        int i3 = -(((~i) & 51) | (i & (-52)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        getSchemeEncryptionPublicKeyId = i5;
        int i6 = i4 % 2;
        printStackTrace printstacktrace = this.getSchemeId;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i5 & 15;
        int i8 = -(-((i5 ^ 15) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        SchemeConfigurationBuilder = i9 % 128;
        if (i9 % 2 == 0) {
            return printstacktrace;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInputExtras
    public List<setMarqueeRepeatLimit> getSDKInfo() {
        int i = SchemeConfigurationBuilder;
        List<setMarqueeRepeatLimit> list = this.ThreeDS2ServiceInitializationCallback;
        int i2 = i & 1;
        int i3 = ((i ^ 1) | i2) << 1;
        int i4 = -((i | 1) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getSchemeEncryptionPublicKeyId = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return list;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInputExtras
    public wait getSDKVersion() {
        int i = getSchemeEncryptionPublicKeyId;
        int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 108) << 1, i ^ 108, 1, 128);
        SchemeConfigurationBuilder = m$1;
        wait waitVar = this.cleanup;
        int i2 = ((m$1 & 70) + (m$1 | 70)) - 1;
        getSchemeEncryptionPublicKeyId = i2 % 128;
        if (i2 % 2 != 0) {
            return waitVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeEncryptionPublicKey() {
        int i = SchemeConfigurationBuilder;
        String str = this.getSchemeEncryptionPublicKey;
        int i2 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = -(-((i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1));
        getSchemeEncryptionPublicKeyId = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeId() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = (i | 49) << 1;
        int i3 = -(((~i) & 49) | (i & (-50)));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        SchemeConfigurationBuilder = i4;
        String str = this.newSchemeConfiguration;
        int i5 = (i4 & (-76)) | ((~i4) & 75);
        int i6 = (i4 & 75) << 1;
        getSchemeEncryptionPublicKeyId = ((i5 & i6) + (i5 | i6)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeLogo() {
        int i = SchemeConfigurationBuilder + 15;
        getSchemeEncryptionPublicKeyId = i % 128;
        int i2 = i % 2;
        String str = this.eftposConfiguration;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeLogoDark() {
        int i = SchemeConfigurationBuilder;
        String str = this.dinersSchemeConfiguration;
        int i2 = i & 59;
        int i3 = ((i ^ 59) | i2) << 1;
        int i4 = -((i | 59) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        getSchemeEncryptionPublicKeyId = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public putAll getSchemeName() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = ((i ^ 31) | (i & 31)) << 1;
        int i3 = -(((~i) & 31) | (i & (-32)));
        int i4 = (i2 & i3) + (i3 | i2);
        SchemeConfigurationBuilder = i4 % 128;
        int i5 = i4 % 2;
        putAll putall = this.getSchemeName;
        if (i5 == 0) {
            return putall;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String getWarnings() {
        int i = SchemeConfigurationBuilder;
        int i2 = (-2) - ((i + 90) ^ (-1));
        getSchemeEncryptionPublicKeyId = i2 % 128;
        int i3 = i2 % 2;
        String str = this.initialize;
        if (i3 == 0) {
            throw null;
        }
        getSchemeEncryptionPublicKeyId = ((-2) - ((i + 92) ^ (-1))) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public put initialize() {
        int i = getSchemeEncryptionPublicKeyId;
        put putVar = this.get;
        SchemeConfigurationBuilder = ((i ^ 23) + ((i & 23) << 1)) % 128;
        return putVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String jcbConfiguration() {
        int i = SchemeConfigurationBuilder;
        int i2 = (i ^ 63) + ((i & 63) << 1);
        getSchemeEncryptionPublicKeyId = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getSchemeLogo;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i & 27;
        getSchemeEncryptionPublicKeyId = (i4 + ((i ^ 27) | i4)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String mastercardSchemeConfiguration() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = (i & (-48)) | ((~i) & 47);
        int i3 = -(-((i & 47) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        SchemeConfigurationBuilder = i4 % 128;
        int i5 = i4 % 2;
        String str = this.mastercardSchemeConfiguration;
        if (i5 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String newSchemeConfiguration() {
        int i = SchemeConfigurationBuilder;
        String str = this.getSchemeLogoDark;
        int i2 = i & 81;
        int i3 = i | 81;
        int i4 = (i2 & i3) + (i3 | i2);
        getSchemeEncryptionPublicKeyId = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String onCompleted() {
        int i = SchemeConfigurationBuilder;
        int i2 = i + 49;
        getSchemeEncryptionPublicKeyId = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onCompleted;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i & 61;
        int i5 = ((i | 61) & (~i4)) + (i4 << 1);
        getSchemeEncryptionPublicKeyId = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String onError() {
        int i = SchemeConfigurationBuilder;
        int i2 = i ^ 115;
        int i3 = (i & 115) << 1;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        getSchemeEncryptionPublicKeyId = i4;
        String str = this.getSDKVersion;
        int i5 = (i4 & (-96)) | ((~i4) & 95);
        int i6 = -(-((i4 & 95) << 1));
        SchemeConfigurationBuilder = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String removeParam() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = ((((i ^ 81) | (i & 81)) << 1) - (~(-(((~i) & 81) | (i & (-82)))))) - 1;
        int i3 = i2 % 128;
        SchemeConfigurationBuilder = i3;
        int i4 = i2 % 2;
        String str = this.ConfigParameters;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 & 95;
        int i6 = (i5 - (~(-(-((i3 ^ 95) | i5))))) - 1;
        getSchemeEncryptionPublicKeyId = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public setImeHintLocales restrictedParameters() {
        int i = getSchemeEncryptionPublicKeyId;
        int i2 = (i ^ 121) + ((i & 121) << 1);
        SchemeConfigurationBuilder = i2 % 128;
        int i3 = i2 % 2;
        setImeHintLocales setimehintlocales = this.onError;
        if (i3 == 0) {
            return setimehintlocales;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String unionSchemeConfiguration() {
        int i = SchemeConfigurationBuilder;
        int i2 = ((i ^ 13) + ((i & 13) << 1)) % 128;
        getSchemeEncryptionPublicKeyId = i2;
        String str = this.SchemeConfiguration;
        int i3 = i2 + 79;
        SchemeConfigurationBuilder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public addSuppressed visaSchemeConfiguration() {
        int i = getSchemeEncryptionPublicKeyId + 121;
        SchemeConfigurationBuilder = i % 128;
        int i2 = i % 2;
        addSuppressed addsuppressed = this.removeParam;
        if (i2 == 0) {
            return addsuppressed;
        }
        throw null;
    }
}
