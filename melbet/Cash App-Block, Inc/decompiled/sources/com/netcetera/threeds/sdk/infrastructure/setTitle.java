package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes5.dex */
public final class setTitle implements setTitleTextColor {
    private static int SDKNotInitializedException = 1;
    private static int rootPublicKey;
    private String ConfigParameters;
    private String ConfigurationBuilder;
    private wait SchemeConfiguration;
    private printStackTrace SchemeConfigurationBuilder;
    private setImeHintLocales ThreeDS2Service;
    private String ThreeDS2ServiceInitializationCallback;
    private String ThreeDS2ServiceInstance;
    private setPopupTheme addParam;
    private String amexConfiguration;
    private String apiKey;
    private String build;
    private load cbConfiguration;
    private setImeHintLocales cleanup;
    private String configureScheme;
    private String createTransaction;
    private Integer dinersSchemeConfiguration;
    private put eftposConfiguration;
    private String encryptionPublicKey;
    private String encryptionPublicKeyFromAssetCertificate;
    private String get;
    private String getParamValue;
    private String getSDKInfo;
    private addSuppressed getSDKVersion;
    private load getSchemeEncryptionPublicKey;
    private String getSchemeEncryptionPublicKeyId;
    private String getSchemeId;
    private String getSchemeLogo;
    private getSuppressed getSchemeLogoDark;
    private clear getSchemeName;
    private String getSchemePublicRootKeys;
    private getLocalizedMessage getWarnings;
    private String ids;
    private String initialize;
    private String jcbConfiguration;
    private putAll logo;
    private String logoDark;
    private keySet mastercardSchemeConfiguration;
    private String newSchemeConfiguration;
    private String onCompleted;
    private List<setTextIsSelectable> onError;
    private String removeParam;
    private setPopupTheme restrictedParameters;
    private String unionSchemeConfiguration;
    private List<setMarqueeRepeatLimit> visaSchemeConfiguration;

    private static /* synthetic */ Object ConfigParameters(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        load loadVar = (load) objArr[1];
        int i = SDKNotInitializedException;
        rootPublicKey = (i + 109) % 128;
        settitle.getSchemeEncryptionPublicKey = loadVar;
        int i2 = i + 19;
        rootPublicKey = i2 % 128;
        if (i2 % 2 == 0) {
            return loadVar;
        }
        throw null;
    }

    private static /* synthetic */ Object SchemeConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        List<setTextIsSelectable> list = (List) objArr[1];
        int i = SDKNotInitializedException + 19;
        rootPublicKey = i % 128;
        int i2 = i % 2;
        settitle.onError = list;
        if (i2 != 0) {
            int i3 = 50 / 0;
        }
        return list;
    }

    private static /* synthetic */ Object SchemeConfigurationBuilder(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        putAll putall = (putAll) objArr[1];
        int i = SDKNotInitializedException;
        rootPublicKey = ((-2) - (((i ^ 46) + ((i & 46) << 1)) ^ (-1))) % 128;
        settitle.logo = putall;
        int i2 = ((i ^ 53) | (i & 53)) << 1;
        int i3 = -(((~i) & 53) | (i & (-54)));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        rootPublicKey = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return putall;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInitializationCallback(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException;
        rootPublicKey = ((i & 61) + (i | 61)) % 128;
        settitle.jcbConfiguration = str;
        int i2 = ((i ^ 21) | (i & 21)) << 1;
        int i3 = -((i & (-22)) | ((~i) & 21));
        int i4 = (i2 & i3) + (i2 | i3);
        rootPublicKey = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return str;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ((i2 | i4) * (-1434)) + (i2 * 1435) + (i * (-716));
        int i6 = ~i3;
        int i7 = ~(i6 | i2);
        int i8 = ~(i | i2);
        int i9 = i4 | (~i2);
        switch (((i8 | (~(i9 | i6)) | (~(i2 | i3))) * 717) + ((i7 | i8 | (~(i9 | i3))) * 717) + i5) {
            case 1:
                setTitle settitle = (setTitle) objArr[0];
                String str = (String) objArr[1];
                int i10 = SDKNotInitializedException;
                rootPublicKey = SVG$Unit$EnumUnboxingLocalUtility.m$1((i10 | 26) << 1, i10 ^ 26, 1, 128);
                settitle.logoDark = str;
                rootPublicKey = ((-2) - ((i10 + 112) ^ (-1))) % 128;
                return str;
            case 2:
                return getWarnings(objArr);
            case 3:
                setTitle settitle2 = (setTitle) objArr[0];
                String str2 = (String) objArr[1];
                int i11 = rootPublicKey;
                int i12 = ((i11 ^ 99) + ((i11 & 99) << 1)) % 128;
                SDKNotInitializedException = i12;
                settitle2.ConfigurationBuilder = str2;
                int i13 = i12 & 101;
                int i14 = (~i13) & (i12 | 101);
                int i15 = i13 << 1;
                rootPublicKey = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
                return str2;
            case 4:
                return ThreeDS2ServiceInstance(objArr);
            case 5:
                return initialize(objArr);
            case 6:
                return get(objArr);
            case 7:
                setTitle settitle3 = (setTitle) objArr[0];
                String str3 = (String) objArr[1];
                int i16 = SDKNotInitializedException;
                int m = SVG$Unit$EnumUnboxingLocalUtility.m(i16 ^ 14, (i16 & 14) << 1, -1, 128);
                rootPublicKey = m;
                settitle3.build = str3;
                SDKNotInitializedException = (m + 125) % 128;
                return str3;
            case 8:
                return cleanup(objArr);
            case 9:
                return getSDKVersion(objArr);
            case 10:
                return getSDKInfo(objArr);
            case 11:
                return ThreeDS2ServiceInitializationCallback(objArr);
            case 12:
                setTitle settitle4 = (setTitle) objArr[0];
                String str4 = (String) objArr[1];
                int i17 = SDKNotInitializedException;
                int i18 = ((-2) - ((-1) ^ ((i17 & 34) + (i17 | 34)))) % 128;
                rootPublicKey = i18;
                settitle4.getParamValue = str4;
                SDKNotInitializedException = (i18 + 15) % 128;
                return str4;
            case 13:
                setTitle settitle5 = (setTitle) objArr[0];
                clear clearVar = (clear) objArr[1];
                int i19 = SDKNotInitializedException;
                rootPublicKey = Thread$State$EnumUnboxingLocalUtility.m(i19 & 116, i19 | 116, 1, 128);
                settitle5.getSchemeName = clearVar;
                rootPublicKey = SVG$Unit$EnumUnboxingLocalUtility.m$1((i19 & (-26)) | ((~i19) & 25), ~(-(-((i19 & 25) << 1))), 1, 128);
                return clearVar;
            case 14:
                return createTransaction(objArr);
            case 15:
                return onError(objArr);
            case 16:
                setTitle settitle6 = (setTitle) objArr[0];
                addSuppressed addsuppressed = (addSuppressed) objArr[1];
                int i20 = SDKNotInitializedException;
                int i21 = (i20 & (-10)) | ((~i20) & 9);
                int i22 = -(-((i20 & 9) << 1));
                int i23 = (((i21 | i22) << 1) - (i22 ^ i21)) % 128;
                rootPublicKey = i23;
                settitle6.getSDKVersion = addsuppressed;
                SDKNotInitializedException = (i23 + 77) % 128;
                return addsuppressed;
            case 17:
                return onCompleted(objArr);
            case 18:
                return ConfigParameters(objArr);
            case 19:
                return addParam(objArr);
            case 20:
                return getParamValue(objArr);
            case 21:
                return restrictedParameters(objArr);
            case 22:
                setTitle settitle7 = (setTitle) objArr[0];
                String str5 = (String) objArr[1];
                int i24 = rootPublicKey;
                int i25 = i24 & 121;
                SDKNotInitializedException = (i25 + ((i24 ^ 121) | i25)) % 128;
                settitle7.encryptionPublicKeyFromAssetCertificate = str5;
                SDKNotInitializedException = SVG$Unit$EnumUnboxingLocalUtility.m$1((i24 & (-90)) | ((~i24) & 89), ~(-(-((i24 & 89) << 1))), 1, 128);
                return str5;
            case 23:
                return removeParam(objArr);
            case 24:
                setTitle settitle8 = (setTitle) objArr[0];
                String str6 = (String) objArr[1];
                int i26 = rootPublicKey;
                SDKNotInitializedException = SVG$Unit$EnumUnboxingLocalUtility.m(i26 ^ 82, (i26 & 82) << 1, -1, 128);
                settitle8.get = str6;
                SDKNotInitializedException = SVG$Unit$EnumUnboxingLocalUtility.m$1(i26 & 117, ~(i26 | 117), 1, 128);
                return str6;
            case 25:
                return configureScheme(objArr);
            case 26:
                return ConfigurationBuilder(objArr);
            case 27:
                return apiKey(objArr);
            case 28:
                return visaSchemeConfiguration(objArr);
            case 29:
                return mastercardSchemeConfiguration(objArr);
            case 30:
                return build(objArr);
            case 31:
                return SchemeConfiguration(objArr);
            case 32:
                return amexConfiguration(objArr);
            case 33:
                return cbConfiguration(objArr);
            case 34:
                return dinersSchemeConfiguration(objArr);
            case 35:
                return eftposConfiguration(objArr);
            case 36:
                return jcbConfiguration(objArr);
            case 37:
                return unionSchemeConfiguration(objArr);
            case 38:
                return getSchemeLogoDark(objArr);
            case 39:
                return getSchemeId(objArr);
            case 40:
                return getSchemeName(objArr);
            case 41:
                return getSchemeLogo(objArr);
            case 42:
                return newSchemeConfiguration(objArr);
            case 43:
                return SchemeConfigurationBuilder(objArr);
            default:
                return ThreeDS2Service(objArr);
        }
    }

    private static /* synthetic */ Object amexConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = i + 85;
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        settitle.ConfigParameters = str;
        if (i3 != 0) {
            throw null;
        }
        int i4 = ((i ^ 109) | (i & 109)) << 1;
        int i5 = -(((~i) & 109) | (i & (-110)));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        rootPublicKey = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object apiKey(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        put putVar = (put) objArr[1];
        int i = rootPublicKey;
        int i2 = ((i & 49) - (~(i | 49))) - 1;
        SDKNotInitializedException = i2 % 128;
        int i3 = i2 % 2;
        settitle.eftposConfiguration = putVar;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return putVar;
    }

    private static /* synthetic */ Object build(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        load loadVar = (load) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = i & 91;
        int i3 = (i ^ 91) | i2;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        rootPublicKey = i4 % 128;
        int i5 = i4 % 2;
        settitle.cbConfiguration = loadVar;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i & 59;
        int i7 = (i | 59) & (~i6);
        int i8 = -(-(i6 << 1));
        rootPublicKey = ((i7 & i8) + (i8 | i7)) % 128;
        return loadVar;
    }

    private static /* synthetic */ Object cbConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 33;
        int i3 = (i ^ 33) | i2;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        SDKNotInitializedException = i4 % 128;
        int i5 = i4 % 2;
        settitle.getSchemePublicRootKeys = str;
        if (i5 == 0) {
            throw null;
        }
        int i6 = ((i ^ 85) | (i & 85)) << 1;
        int i7 = -(((~i) & 85) | (i & (-86)));
        SDKNotInitializedException = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
        return str;
    }

    private static /* synthetic */ Object cleanup(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = (((i & (-66)) | ((~i) & 65)) + ((i & 65) << 1)) % 128;
        rootPublicKey = i2;
        settitle.getSchemeLogo = str;
        int i3 = i2 & 9;
        int i4 = i3 + ((i2 ^ 9) | i3);
        SDKNotInitializedException = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object configureScheme(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 33;
        int i3 = (i ^ 33) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        SDKNotInitializedException = i4 % 128;
        int i5 = i4 % 2;
        settitle.getSchemeId = str;
        if (i5 == 0) {
            throw null;
        }
        SDKNotInitializedException = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 63) << 1, ~(-(((~i) & 63) | (i & (-64)))), 1, 128);
        return str;
    }

    private static /* synthetic */ Object dinersSchemeConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        getSuppressed getsuppressed = (getSuppressed) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = i ^ 21;
        int i3 = ((((i & 21) | i2) << 1) - (~(-i2))) - 1;
        int i4 = i3 % 128;
        rootPublicKey = i4;
        int i5 = i3 % 2;
        settitle.getSchemeLogoDark = getsuppressed;
        if (i5 != 0) {
            throw null;
        }
        int i6 = (i4 ^ 7) + ((i4 & 7) << 1);
        SDKNotInitializedException = i6 % 128;
        if (i6 % 2 != 0) {
            return getsuppressed;
        }
        throw null;
    }

    private static /* synthetic */ Object eftposConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        keySet keyset = (keySet) objArr[1];
        int i = SDKNotInitializedException;
        rootPublicKey = (i + 39) % 128;
        settitle.mastercardSchemeConfiguration = keyset;
        int i2 = i & 15;
        int i3 = (((i | 15) & (~i2)) - (~(i2 << 1))) - 1;
        rootPublicKey = i3 % 128;
        if (i3 % 2 == 0) {
            return keyset;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        setPopupTheme setpopuptheme = (setPopupTheme) objArr[1];
        int i = SDKNotInitializedException + 115;
        rootPublicKey = i % 128;
        int i2 = i % 2;
        settitle.restrictedParameters = setpopuptheme;
        if (i2 == 0) {
            return setpopuptheme;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKInfo(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        getLocalizedMessage getlocalizedmessage = (getLocalizedMessage) objArr[1];
        int i = (SDKNotInitializedException + 9) % 128;
        rootPublicKey = i;
        settitle.getWarnings = getlocalizedmessage;
        int i2 = (((i ^ 61) | (i & 61)) << 1) - ((i & (-62)) | ((~i) & 61));
        SDKNotInitializedException = i2 % 128;
        if (i2 % 2 != 0) {
            return getlocalizedmessage;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKVersion(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        List<setMarqueeRepeatLimit> list = (List) objArr[1];
        int i = rootPublicKey;
        int i2 = (i & (-104)) | ((~i) & 103);
        int i3 = -(-((i & 103) << 1));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        SDKNotInitializedException = i4;
        settitle.visaSchemeConfiguration = list;
        int i5 = i4 & 25;
        int i6 = (((~i5) & (i4 | 25)) - (~(-(-(i5 << 1))))) - 1;
        rootPublicKey = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        throw null;
    }

    private static /* synthetic */ Object getSchemeId(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = rootPublicKey;
        int i2 = (i & (-48)) | ((~i) & 47);
        int i3 = -(-((i & 47) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        SDKNotInitializedException = i4 % 128;
        int i5 = i4 % 2;
        settitle.dinersSchemeConfiguration = num;
        if (i5 != 0) {
            return num;
        }
        throw null;
    }

    private static /* synthetic */ Object getSchemeLogo(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        setImeHintLocales setimehintlocales = (setImeHintLocales) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = i & 9;
        int i3 = -(-((i ^ 9) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        rootPublicKey = i5;
        int i6 = i4 % 2;
        settitle.ThreeDS2Service = setimehintlocales;
        if (i6 != 0) {
            int i7 = 30 / 0;
        }
        int i8 = (i5 & 97) + (i5 | 97);
        SDKNotInitializedException = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 42 / 0;
        }
        return setimehintlocales;
    }

    private static /* synthetic */ Object getSchemeLogoDark(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 3;
        int i3 = ((((i ^ 3) | i2) << 1) - ((i | 3) & (~i2))) % 128;
        SDKNotInitializedException = i3;
        settitle.configureScheme = str;
        int i4 = ((i3 | 101) << 1) - (i3 ^ 101);
        rootPublicKey = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getSchemeName(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i + 77;
        SDKNotInitializedException = i2 % 128;
        int i3 = i2 % 2;
        settitle.removeParam = str;
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        SDKNotInitializedException = (i + 61) % 128;
        return str;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 47;
        SDKNotInitializedException = (((~i2) & (i | 47)) + (i2 << 1)) % 128;
        settitle.unionSchemeConfiguration = str;
        int i3 = i | 19;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i & 19)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        SDKNotInitializedException = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object newSchemeConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 5;
        int i3 = (((i | 5) & (~i2)) - (~(i2 << 1))) - 1;
        int i4 = i3 % 128;
        SDKNotInitializedException = i4;
        int i5 = i3 % 2;
        settitle.ThreeDS2ServiceInstance = str;
        if (i5 == 0) {
            throw null;
        }
        int i6 = (i4 & 69) + (i4 | 69);
        rootPublicKey = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onCompleted(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 73;
        int i3 = -(-(i | 73));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        SDKNotInitializedException = i5;
        int i6 = i4 % 2;
        settitle.getSchemeEncryptionPublicKeyId = str;
        if (i6 == 0) {
            throw null;
        }
        rootPublicKey = (i5 + 51) % 128;
        return str;
    }

    private static /* synthetic */ Object onError(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = i & 121;
        int i3 = -(-((i ^ 121) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        rootPublicKey = i5;
        int i6 = i4 % 2;
        settitle.ThreeDS2ServiceInitializationCallback = str;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i5 ^ 15;
        int i8 = ((i5 & 15) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        SDKNotInitializedException = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 75 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object removeParam(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = i & 87;
        int i3 = (i2 - (~((i ^ 87) | i2))) - 1;
        int i4 = i3 % 128;
        rootPublicKey = i4;
        int i5 = i3 % 2;
        settitle.newSchemeConfiguration = str;
        if (i5 != 0) {
            throw null;
        }
        SDKNotInitializedException = ((i4 & 85) + (i4 | 85)) % 128;
        return str;
    }

    private static /* synthetic */ Object restrictedParameters(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException;
        int i2 = i + 117;
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        settitle.initialize = str;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        int i5 = (i ^ 29) + ((i & 29) << 1);
        rootPublicKey = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object unionSchemeConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = (i & 109) + (i | 109);
        int i3 = i2 % 128;
        SDKNotInitializedException = i3;
        int i4 = i2 % 2;
        settitle.apiKey = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = (-2) - ((((i3 | 72) << 1) - (i3 ^ 72)) ^ (-1));
        rootPublicKey = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object visaSchemeConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        printStackTrace printstacktrace = (printStackTrace) objArr[1];
        int i = rootPublicKey;
        SDKNotInitializedException = ((-2) - (((i & 86) + (i | 86)) ^ (-1))) % 128;
        settitle.SchemeConfigurationBuilder = printstacktrace;
        int i2 = i & 31;
        int i3 = -(-((i ^ 31) | i2));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        SDKNotInitializedException = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return printstacktrace;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String ConfigurationBuilder() {
        int i = rootPublicKey;
        int i2 = (i & (-114)) | ((~i) & 113);
        int i3 = -(-((i & 113) << 1));
        int i4 = (i2 & i3) + (i2 | i3);
        SDKNotInitializedException = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ThreeDS2ServiceInitializationCallback;
        if (i5 == 0) {
            throw null;
        }
        SDKNotInitializedException = ((i & 105) + (i | 105)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String ThreeDS2Service() {
        int i = rootPublicKey;
        int i2 = (((i | 42) << 1) - (i ^ 42)) - 1;
        int i3 = i2 % 128;
        SDKNotInitializedException = i3;
        int i4 = i2 % 2;
        String str = this.jcbConfiguration;
        if (i4 == 0) {
            int i5 = 36 / 0;
        }
        int i6 = i3 ^ 89;
        int i7 = -(-((i3 & 89) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        rootPublicKey = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 15 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String addParam() {
        int i = SDKNotInitializedException;
        int i2 = ((i ^ 47) | (i & 47)) << 1;
        int i3 = -(((~i) & 47) | (i & (-48)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        rootPublicKey = i4 % 128;
        int i5 = i4 % 2;
        String str = this.initialize;
        if (i5 != 0) {
            int i6 = 93 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public setPopupTheme createTransaction() {
        int i = rootPublicKey;
        int i2 = (i ^ 74) + ((i & 74) << 1);
        int i3 = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        SDKNotInitializedException = i3;
        setPopupTheme setpopuptheme = this.restrictedParameters;
        int i4 = (i3 & (-34)) | ((~i3) & 33);
        int i5 = (i3 & 33) << 1;
        rootPublicKey = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return setpopuptheme;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public getSuppressed encryptionPublicKey() {
        int identityHashCode = System.identityHashCode(this);
        int i = ((-289964177) & identityHashCode) | ((-289964177) ^ identityHashCode);
        int i2 = (i | (~i)) & (~i);
        int i3 = ((i2 & (-1543493628)) | ((~i2) & (-1543493628)) | (1543493627 & i2)) * 449;
        int i4 = (-1637121574) & i3;
        int i5 = ((((-1637121574) ^ i3) | i4) << 1) - ((i3 | (-1637121574)) & (~i4));
        int i6 = i5 & 321745652;
        int i7 = (321745652 ^ i5) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = ~identityHashCode;
        int i10 = (i9 & (-1540068346)) | ((-1540068346) ^ i9);
        int i11 = (293389458 & i10) | ((~i10) & (-293389459));
        int i12 = i10 & (-293389459);
        int i13 = ~((i12 & i11) | (i11 ^ i12));
        int i14 = (-1543493628) & i13;
        int i15 = (((i13 | (-1543493628)) & (~i14)) | i14) * 449;
        int i16 = i8 & i15;
        int i17 = (i15 | i8) & (~i16);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        int identityHashCode2 = System.identityHashCode(this);
        int i20 = ~identityHashCode2;
        int i21 = ((346352526 ^ identityHashCode2) | (346352526 & identityHashCode2)) * (-859);
        int i22 = (-238892242) & i21;
        int i23 = (((i21 | (-238892242)) & (~i22)) - (~(i22 << 1))) - 1;
        int i24 = ~identityHashCode2;
        int i25 = ~((346352526 & i24) | (i24 ^ 346352526));
        int i26 = ~((identityHashCode2 & (-69528065)) | ((-69528065) ^ identityHashCode2));
        int i27 = ((~i26) & i25) | ((~i25) & i26);
        int i28 = i26 & i25;
        int i29 = (((i28 & i27) | (i27 ^ i28)) * 859) + i23;
        int i30 = 1925190078 ^ i20;
        int i31 = 1925190078 & i20;
        int i32 = ~((i31 & i30) | (i30 ^ i31));
        int i33 = i32 ^ (-1994718143);
        int i34 = i32 & (-1994718143);
        int i35 = -(~(-(-(((i34 & i33) | (i33 ^ i34)) * 859))));
        int i36 = (-2) - (((i29 ^ i35) + ((i29 & i35) << 1)) ^ (-1));
        getSuppressed getsuppressed = this.getSchemeLogoDark;
        if (i19 <= i36) {
            int i37 = 20 / 0;
        }
        int i38 = rootPublicKey;
        SDKNotInitializedException = SVG$Unit$EnumUnboxingLocalUtility.m(i38 & 20, i38 | 20, -1, 128);
        return getsuppressed;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public load encryptionPublicKeyFromAssetCertificate() {
        int i = SDKNotInitializedException;
        load loadVar = this.getSchemeEncryptionPublicKey;
        rootPublicKey = ((i & 27) + (i | 27)) % 128;
        return loadVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public printStackTrace getParamValue() {
        int i = rootPublicKey;
        printStackTrace printstacktrace = this.SchemeConfigurationBuilder;
        int i2 = i & 21;
        int i3 = -(-((i ^ 21) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        SDKNotInitializedException = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return printstacktrace;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeEncryptionPublicKey() {
        int i = rootPublicKey;
        String str = this.logoDark;
        int i2 = i ^ 107;
        int i3 = (i & 107) << 1;
        SDKNotInitializedException = ((i2 & i3) + (i3 | i2)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAllCaps
    public keySet getSchemeEncryptionPublicKeyId() {
        int i = rootPublicKey + 107;
        SDKNotInitializedException = i % 128;
        int i2 = i % 2;
        keySet keyset = this.mastercardSchemeConfiguration;
        if (i2 != 0) {
            return keyset;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public String getSchemePublicRootKeys() {
        int i = rootPublicKey;
        int i2 = i & 9;
        int i3 = (i ^ 9) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        SDKNotInitializedException = i4 % 128;
        int i5 = i4 % 2;
        String str = this.getSchemeId;
        if (i5 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String getWarnings() {
        int i = SDKNotInitializedException;
        int i2 = ((((i ^ 89) | (i & 89)) << 1) - (~(-(((~i) & 89) | (i & (-90)))))) - 1;
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getSchemeLogo;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public clear ids() {
        int i = rootPublicKey;
        clear clearVar = this.getSchemeName;
        SDKNotInitializedException = ((i ^ 61) + ((i & 61) << 1)) % 128;
        return clearVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String jcbConfiguration() {
        int i = rootPublicKey;
        int i2 = ((i ^ 71) | (i & 71)) << 1;
        int i3 = -(((~i) & 71) | (i & (-72)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        SDKNotInitializedException = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ids;
        if (i5 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public String logoDark() {
        int i = SDKNotInitializedException;
        String str = this.getSchemePublicRootKeys;
        rootPublicKey = (i + 57) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String mastercardSchemeConfiguration() {
        int i = SDKNotInitializedException;
        int i2 = (i ^ 43) + ((i & 43) << 1);
        int i3 = i2 % 128;
        rootPublicKey = i3;
        int i4 = i2 % 2;
        String str = this.onCompleted;
        if (i4 != 0) {
            int i5 = 48 / 0;
        }
        int i6 = i3 & 99;
        int i7 = (i3 ^ 99) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        SDKNotInitializedException = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public String rootPublicKey() {
        int i = rootPublicKey;
        int i2 = i & 71;
        int i3 = (i | 71) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        SDKNotInitializedException = i5;
        String str = this.newSchemeConfiguration;
        rootPublicKey = ((((i5 ^ 9) | (i5 & 9)) << 1) - ((i5 & (-10)) | ((~i5) & 9))) % 128;
        return str;
    }

    private setTitle() {
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String get() {
        int i = SDKNotInitializedException;
        String str = this.unionSchemeConfiguration;
        rootPublicKey = ((i ^ 25) + ((i & 25) << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String SchemeConfiguration() {
        int i = rootPublicKey;
        String str = this.ConfigParameters;
        int i2 = i ^ 85;
        int i3 = (i & 85) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        SDKNotInitializedException = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getParamValue(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException + 71;
        rootPublicKey = i % 128;
        int i2 = i % 2;
        settitle.createTransaction = str;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public getLocalizedMessage ConfigParameters() {
        int i = SDKNotInitializedException;
        int m = Thread$State$EnumUnboxingLocalUtility.m(i & 80, i | 80, 1, 128);
        rootPublicKey = m;
        getLocalizedMessage getlocalizedmessage = this.getWarnings;
        int i2 = m + 43;
        SDKNotInitializedException = i2 % 128;
        if (i2 % 2 != 0) {
            return getlocalizedmessage;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public setImeHintLocales apiKey() {
        int i = SDKNotInitializedException;
        int i2 = i & 51;
        int i3 = (i2 - (~((i ^ 51) | i2))) - 1;
        rootPublicKey = i3 % 128;
        int i4 = i3 % 2;
        setImeHintLocales setimehintlocales = this.ThreeDS2Service;
        if (i4 == 0) {
            return setimehintlocales;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public putAll getSchemeName() {
        int i = SDKNotInitializedException;
        int i2 = i ^ 71;
        int i3 = ((((i & 71) | i2) << 1) - i2) % 128;
        rootPublicKey = i3;
        putAll putall = this.logo;
        SDKNotInitializedException = ((i3 ^ 15) + ((i3 & 15) << 1)) % 128;
        return putall;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = ((i | 11) << 1) - (i ^ 11);
        SDKNotInitializedException = i2 % 128;
        int i3 = i2 % 2;
        settitle.ids = str;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object jcbConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey + 125;
        SDKNotInitializedException = i % 128;
        int i2 = i % 2;
        settitle.amexConfiguration = str;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object addParam(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = SDKNotInitializedException + 117;
        rootPublicKey = i % 128;
        int i2 = i % 2;
        settitle.encryptionPublicKey = str;
        if (i2 != 0) {
            int i3 = 61 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object ConfigurationBuilder(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        setPopupTheme setpopuptheme = (setPopupTheme) objArr[1];
        int i = rootPublicKey;
        int i2 = ((i & 3) + (i | 3)) % 128;
        SDKNotInitializedException = i2;
        settitle.addParam = setpopuptheme;
        int i3 = i2 + 67;
        rootPublicKey = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return setpopuptheme;
    }

    private static /* synthetic */ Object createTransaction(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 63;
        int i3 = (((i ^ 63) | i2) << 1) - ((i | 63) & (~i2));
        SDKNotInitializedException = i3 % 128;
        int i4 = i3 % 2;
        settitle.onCompleted = str;
        if (i4 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String eftposConfiguration() {
        int i = SDKNotInitializedException;
        String str = this.apiKey;
        int i2 = i & 87;
        int i3 = (i | 87) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        rootPublicKey = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeId() {
        int i = rootPublicKey;
        int i2 = i & 65;
        int i3 = (((i ^ 65) | i2) << 1) - ((~i2) & (i | 65));
        SDKNotInitializedException = i3 % 128;
        int i4 = i3 % 2;
        String str = this.encryptionPublicKeyFromAssetCertificate;
        if (i4 == 0) {
            throw null;
        }
        SDKNotInitializedException = (i + 101) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String removeParam() {
        int i = SDKNotInitializedException;
        int i2 = (i ^ 77) + ((i & 77) << 1);
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getSDKInfo;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public setImeHintLocales restrictedParameters() {
        int i = rootPublicKey;
        setImeHintLocales setimehintlocales = this.cleanup;
        int i2 = (i & (-50)) | ((~i) & 49);
        int i3 = -(-((i & 49) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        SDKNotInitializedException = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return setimehintlocales;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String onCompleted() {
        int i = SDKNotInitializedException;
        String str = this.get;
        int i2 = i & 51;
        int i3 = -(-((i ^ 51) | i2));
        rootPublicKey = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return str;
    }

    private static /* synthetic */ Object mastercardSchemeConfiguration(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        wait waitVar = (wait) objArr[1];
        int i = (-2) - ((rootPublicKey + 26) ^ (-1));
        SDKNotInitializedException = i % 128;
        int i2 = i % 2;
        settitle.SchemeConfiguration = waitVar;
        if (i2 != 0) {
            return waitVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInputExtras
    public List<setMarqueeRepeatLimit> getSDKInfo() {
        int i = rootPublicKey;
        int i2 = ((i ^ 79) + ((i & 79) << 1)) % 128;
        SDKNotInitializedException = i2;
        List<setMarqueeRepeatLimit> list = this.visaSchemeConfiguration;
        int i3 = (i2 | 89) << 1;
        int i4 = -(i2 ^ 89);
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        rootPublicKey = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return list;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInputExtras
    public Integer cleanup() {
        int i = rootPublicKey;
        Integer num = this.dinersSchemeConfiguration;
        int i2 = (i & 45) + (i | 45);
        SDKNotInitializedException = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return num;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeLogoDark() {
        int i = rootPublicKey;
        String str = this.amexConfiguration;
        SDKNotInitializedException = (i + 55) % 128;
        return str;
    }

    public static final class ThreeDS2ServiceInstance {
        private static int InvalidInputException = 1;
        private static int logo;
        private String ConfigParameters;
        private String ConfigurationBuilder;
        private String SchemeConfiguration;
        private String SchemeConfigurationBuilder;
        private setImeHintLocales ThreeDS2Service;
        private addSuppressed ThreeDS2ServiceInitializationCallback;
        private getLocalizedMessage ThreeDS2ServiceInstance;
        private String addParam;
        private keySet amexConfiguration;
        private setPopupTheme apiKey;
        private wait build;
        private Integer cbConfiguration;
        private String cleanup;
        private String configureScheme;
        private setImeHintLocales createTransaction;
        private String dinersSchemeConfiguration;
        private put eftposConfiguration;
        private putAll encryptionPublicKey;
        private String encryptionPublicKeyFromAssetCertificate;
        private String get;
        private List<setTextIsSelectable> getParamValue;
        private String getSDKInfo;
        private String getSDKVersion;
        private load getSchemeEncryptionPublicKey;
        private String getSchemeEncryptionPublicKeyId;
        private String getSchemeId;
        private getSuppressed getSchemeLogo;
        private clear getSchemeLogoDark;
        private String getSchemeName;
        private String getSchemePublicRootKeys;
        private String getWarnings;
        private printStackTrace ids;
        private String initialize;
        private String jcbConfiguration;
        private String logoDark;
        private List<setMarqueeRepeatLimit> mastercardSchemeConfiguration;
        private String newSchemeConfiguration;
        private setPopupTheme onCompleted;
        private String onError;
        private String removeParam;
        private String restrictedParameters;
        private String rootPublicKey;
        private load unionSchemeConfiguration;
        private String visaSchemeConfiguration;

        public ThreeDS2ServiceInstance ConfigParameters(String str) {
            int i = logo;
            int i2 = i & 105;
            int i3 = (((i | 105) & (~i2)) + (i2 << 1)) % 128;
            InvalidInputException = i3;
            this.SchemeConfiguration = str;
            int i4 = (i3 ^ 39) + ((i3 & 39) << 1);
            logo = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance ConfigurationBuilder(String str) {
            int i = logo;
            int m = SVG$Unit$EnumUnboxingLocalUtility.m(i ^ 84, (i & 84) << 1, -1, 128);
            InvalidInputException = m;
            this.getSchemeId = str;
            int i2 = m ^ 77;
            int i3 = ((((m & 77) | i2) << 1) - (~(-i2))) - 1;
            logo = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance SchemeConfiguration(String str) {
            int i = logo;
            int i2 = (i & 7) + (i | 7);
            InvalidInputException = i2 % 128;
            if (i2 % 2 == 0) {
                this.rootPublicKey = str;
                throw null;
            }
            this.rootPublicKey = str;
            int i3 = i & 31;
            int i4 = ((i ^ 31) | i3) << 1;
            int i5 = -((i | 31) & (~i3));
            InvalidInputException = ((i4 & i5) + (i4 | i5)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(getSuppressed getsuppressed) {
            int identityHashCode = System.identityHashCode(this);
            int i = ~identityHashCode;
            int i2 = ((-1888487490) & identityHashCode) | ((-1888487490) & i) | (1888487489 & identityHashCode);
            int i3 = (i2 | (~i2)) & (~i2);
            int i4 = (i & (-71321129)) | (71321128 & identityHashCode);
            int i5 = (-71321129) & identityHashCode;
            int i6 = ~((i4 & i5) | (i4 ^ i5));
            int i7 = i3 ^ i6;
            int i8 = i6 & i3;
            int i9 = -(-(((i8 & i7) | (i7 ^ i8)) * 69));
            int i10 = 1594765898 & i9;
            int i11 = (i9 ^ 1594765898) | i10;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            int i13 = 88962862 & identityHashCode;
            int i14 = ~(((88962862 | identityHashCode) & (~i13)) | i13);
            int i15 = 1906129223 & identityHashCode;
            int i16 = (identityHashCode | 1906129223) & (~i15);
            int i17 = -(-(((~((i16 & i15) | (i16 ^ i15))) | (i14 & (-1977450352)) | ((-1977450352) ^ i14)) * (-69)));
            int i18 = ((i12 | i17) << 1) - (i17 ^ i12);
            int i19 = i18 & 1217279646;
            int i20 = (i19 - (~(-(-((1217279646 ^ i18) | i19))))) - 1;
            int identityHashCode2 = System.identityHashCode(this);
            int i21 = 64045099 ^ identityHashCode2;
            int i22 = ~identityHashCode2;
            int i23 = 64045099 & identityHashCode2;
            int i24 = -(~(-(-(((i21 & i23) | (i21 ^ i23) | (-2129775317)) * (-676)))));
            int i25 = (((1624564923 | i24) << 1) - (i24 ^ 1624564923)) - 1;
            int i26 = (64045099 & i22) | ((-64045100) & i22) | ((~i22) & 64045099);
            int i27 = (i26 | (~i26)) & (~i26);
            int i28 = -(~(-(-(((i27 & 2082507476) | (2082507476 ^ i27)) * 676))));
            int i29 = (-2) - (((i25 ^ i28) + ((i28 & i25) << 1)) ^ (-1));
            int i30 = (~identityHashCode2) & (i22 | identityHashCode2);
            int i31 = (-2129775317) & i30;
            int i32 = (i30 | (-2129775317)) & (~i31);
            int i33 = ~((i32 & i31) | (i32 ^ i31));
            int i34 = 47267840 ^ i33;
            int i35 = i33 & 47267840;
            int i36 = (i35 & i34) | (i34 ^ i35);
            int i37 = 2146552575 ^ identityHashCode2;
            int i38 = identityHashCode2 & 2146552575;
            int i39 = (i38 & i37) | (i37 ^ i38);
            int i40 = (i39 | (~i39)) & (~i39);
            int i41 = ((i40 & i36) | (i36 ^ i40)) * 676;
            if (i20 <= (i29 ^ i41) + ((i41 & i29) << 1)) {
                this.getSchemeLogo = getsuppressed;
                throw null;
            }
            this.getSchemeLogo = getsuppressed;
            int i42 = InvalidInputException + 71;
            logo = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 44 / 0;
            }
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInitializationCallback(String str) {
            int i = logo;
            int m = SVG$Unit$EnumUnboxingLocalUtility.m(i & 84, i | 84, -1, 128);
            InvalidInputException = m;
            this.ConfigParameters = str;
            logo = SVG$Unit$EnumUnboxingLocalUtility.m$1((m | 36) << 1, m ^ 36, 1, 128);
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInstance(setPopupTheme setpopuptheme) {
            int i = InvalidInputException;
            int i2 = ((i | 75) << 1) - (((~i) & 75) | (i & (-76)));
            int i3 = i2 % 128;
            logo = i3;
            if (i2 % 2 != 0) {
                this.onCompleted = setpopuptheme;
                throw null;
            }
            this.onCompleted = setpopuptheme;
            int i4 = i3 ^ 57;
            int i5 = ((i3 & 57) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 & i6) + (i6 | i5);
            InvalidInputException = i7 % 128;
            if (i7 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance addParam(String str) {
            int i = logo;
            int i2 = (i & 75) + (i | 75);
            InvalidInputException = i2 % 128;
            if (i2 % 2 == 0) {
                this.removeParam = str;
                throw null;
            }
            this.removeParam = str;
            InvalidInputException = (((i | 41) << 1) - (i ^ 41)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance amexConfiguration(String str) {
            int i = logo;
            int i2 = ((i ^ 53) | (i & 53)) << 1;
            int i3 = -(((~i) & 53) | (i & (-54)));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            InvalidInputException = i4 % 128;
            if (i4 % 2 != 0) {
                this.SchemeConfigurationBuilder = str;
                return this;
            }
            this.SchemeConfigurationBuilder = str;
            int i5 = 42 / 0;
            return this;
        }

        public ThreeDS2ServiceInstance apiKey(String str) {
            int i = (InvalidInputException + 29) % 128;
            logo = i;
            this.getSchemeName = str;
            int i2 = i & 55;
            int i3 = i | 55;
            int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
            InvalidInputException = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
            return this;
        }

        public ThreeDS2ServiceInstance build(String str) {
            int i = InvalidInputException;
            this.logoDark = str;
            logo = (((i | 25) << 1) - (i ^ 25)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance cbConfiguration(String str) {
            int i = logo;
            this.encryptionPublicKeyFromAssetCertificate = str;
            int i2 = ((i ^ 21) | (i & 21)) << 1;
            int i3 = -(((~i) & 21) | (i & (-22)));
            InvalidInputException = ((i2 & i3) + (i2 | i3)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance cleanup(String str) {
            int i = logo + 37;
            int i2 = i % 128;
            InvalidInputException = i2;
            if (i % 2 == 0) {
                this.onError = str;
                throw null;
            }
            this.onError = str;
            int i3 = i2 & 63;
            logo = (i3 + ((i2 ^ 63) | i3)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance configureScheme(String str) {
            int i = logo;
            int i2 = i & 21;
            int i3 = ((i | 21) & (~i2)) + (i2 << 1);
            InvalidInputException = i3 % 128;
            if (i3 % 2 != 0) {
                this.jcbConfiguration = str;
                return this;
            }
            this.jcbConfiguration = str;
            throw null;
        }

        public ThreeDS2ServiceInstance createTransaction(String str) {
            int i = InvalidInputException;
            int i2 = (((i | 35) << 1) - (i ^ 35)) % 128;
            logo = i2;
            this.restrictedParameters = str;
            InvalidInputException = (((i2 & (-122)) | ((~i2) & 121)) + ((i2 & 121) << 1)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance get(addSuppressed addsuppressed) {
            int i = logo;
            int i2 = i & 25;
            int i3 = ((i ^ 25) | i2) << 1;
            int i4 = -((i | 25) & (~i2));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            InvalidInputException = i6;
            if (i5 % 2 == 0) {
                this.ThreeDS2ServiceInitializationCallback = addsuppressed;
                throw null;
            }
            this.ThreeDS2ServiceInitializationCallback = addsuppressed;
            int i7 = (i6 & 121) + (i6 | 121);
            logo = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance getParamValue(String str) {
            int i = logo;
            int i2 = i & 67;
            int i3 = ((i ^ 67) | i2) << 1;
            int i4 = -((i | 67) & (~i2));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            InvalidInputException = i5 % 128;
            if (i5 % 2 != 0) {
                this.ConfigurationBuilder = str;
                return this;
            }
            this.ConfigurationBuilder = str;
            throw null;
        }

        public ThreeDS2ServiceInstance getSDKInfo(String str) {
            int i = logo;
            int i2 = i & 87;
            int i3 = i | 87;
            int i4 = (i2 & i3) + (i3 | i2);
            InvalidInputException = i4 % 128;
            if (i4 % 2 != 0) {
                this.cleanup = str;
                return this;
            }
            this.cleanup = str;
            throw null;
        }

        public ThreeDS2ServiceInstance getSDKVersion(String str) {
            int i = InvalidInputException;
            this.addParam = str;
            logo = (i + 45) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance getWarnings(printStackTrace printstacktrace) {
            int i = logo;
            int i2 = i + 54;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            InvalidInputException = i3 % 128;
            if (i3 % 2 == 0) {
                this.ids = printstacktrace;
                throw null;
            }
            this.ids = printstacktrace;
            int i4 = i & 25;
            int i5 = (i | 25) & (~i4);
            int i6 = -(-(i4 << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            InvalidInputException = i7 % 128;
            if (i7 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public setTitleTextColor initialize() {
            setTitle settitle = new setTitle();
            int i = logo + 37;
            InvalidInputException = i % 128;
            if (i % 2 != 0) {
                return settitle;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance mastercardSchemeConfiguration(String str) {
            int i = logo + 11;
            int i2 = i % 128;
            InvalidInputException = i2;
            if (i % 2 == 0) {
                this.getSchemeEncryptionPublicKeyId = str;
                int i3 = 96 / 0;
            } else {
                this.getSchemeEncryptionPublicKeyId = str;
            }
            int i4 = ((i2 & 60) + (i2 | 60)) - 1;
            logo = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance onCompleted(String str) {
            int i = logo;
            int i2 = i & 73;
            int i3 = (i ^ 73) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            InvalidInputException = i4 % 128;
            if (i4 % 2 != 0) {
                this.configureScheme = str;
                return this;
            }
            this.configureScheme = str;
            throw null;
        }

        public ThreeDS2ServiceInstance onError(String str) {
            int i = InvalidInputException;
            int i2 = i & 73;
            int i3 = (i | 73) & (~i2);
            int i4 = i2 << 1;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            logo = i5 % 128;
            if (i5 % 2 == 0) {
                this.visaSchemeConfiguration = str;
                return this;
            }
            this.visaSchemeConfiguration = str;
            int i6 = 55 / 0;
            return this;
        }

        public ThreeDS2ServiceInstance removeParam(String str) {
            int identityHashCode = System.identityHashCode(this);
            int i = (identityHashCode ^ (-1899495408)) | (identityHashCode & (-1899495408));
            int i2 = ((-822235554) & i) | ((~i) & 822235553);
            int i3 = i & 822235553;
            int i4 = ((i3 & i2) | (i2 ^ i3)) * 614;
            int i5 = 676708475 ^ i4;
            int i6 = -(-((i4 & 676708475) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = ~identityHashCode;
            int i9 = 822245287 ^ i8;
            int i10 = 822245287 & i8;
            int i11 = ~((i10 & i9) | (i9 ^ i10));
            int i12 = i11 & (-1899495408);
            int i13 = ((-1899495408) | i11) & (~i12);
            int i14 = (i13 & i12) | (i13 ^ i12);
            int i15 = (~identityHashCode) & (i8 | identityHashCode);
            int i16 = i15 & 1899485673;
            int i17 = ~(((i15 | 1899485673) & (~i16)) | i16);
            int i18 = i14 & i17;
            int i19 = (((i14 | i17) & (~i18)) | i18) * (-1228);
            int i20 = i7 & i19;
            int i21 = i20 + ((i19 ^ i7) | i20);
            int i22 = ~identityHashCode;
            int i23 = ~((i22 & (-1077250121)) | ((-1077250121) ^ i22));
            int i24 = ((-822245288) & i8) | (i8 ^ (-822245288));
            int i25 = i24 & 1899485673;
            int i26 = (i24 | 1899485673) & (~i25);
            int i27 = ~((i26 & i25) | (i26 ^ i25));
            int i28 = ((~i27) & i23) | ((~i23) & i27);
            int i29 = i23 & i27;
            int i30 = -(-(((i29 & i28) | (i28 ^ i29)) * 614));
            int i31 = (((~i30) & i21) | ((~i21) & i30)) + ((i30 & i21) << 1);
            int identityHashCode2 = System.identityHashCode(this);
            int i32 = ~identityHashCode2;
            int i33 = ~identityHashCode2;
            int i34 = (i33 | identityHashCode2) & i32;
            int i35 = (-1452861411) & i34;
            int i36 = (i34 | (-1452861411)) & (~i35);
            int i37 = (i36 & i35) | (i36 ^ i35);
            int i38 = (i37 | (~i37)) & (~i37);
            int i39 = 41969280 ^ i38;
            int i40 = i38 & 41969280;
            int i41 = (i40 & i39) | (i39 ^ i40);
            int i42 = ((~i32) & (-195520149)) | (i32 & 195520148) | ((-195520149) & i32);
            int i43 = (i42 | (~i42)) & (~i42);
            int i44 = i41 ^ i43;
            int i45 = i41 & i43;
            int i46 = (i45 & i44) | (i44 ^ i45);
            int i47 = (1606412278 & i33) | (identityHashCode2 & (-1606412279));
            int i48 = 1606412278 & identityHashCode2;
            int i49 = (i48 & i47) | (i47 ^ i48);
            int i50 = (i49 | (~i49)) & (~i49);
            int i51 = i46 & i50;
            int i52 = (i46 | i50) & (~i51);
            int i53 = -(-(((i52 & i51) | (i52 ^ i51)) * (-84)));
            int i54 = (-1621488338) & i53;
            int i55 = (((-1621488338) ^ i53) | i54) << 1;
            int i56 = -((i53 | (-1621488338)) & (~i54));
            int i57 = (i55 & i56) + (i56 | i55);
            int i58 = (i33 & (-195520149)) | (identityHashCode2 & 195520148);
            int i59 = (-195520149) & identityHashCode2;
            int i60 = ~((i58 & i59) | (i58 ^ i59));
            int i61 = 1452861410 ^ i60;
            int i62 = i60 & 1452861410;
            int i63 = (i62 & i61) | (i61 ^ i62);
            int i64 = i32 ^ 195520148;
            int i65 = i32 & 195520148;
            int i66 = ~((i65 & i64) | (i64 ^ i65));
            int i67 = -(-(((i66 & i63) | (i63 ^ i66)) * (-84)));
            int i68 = i57 & i67;
            int i69 = i68 + ((i67 ^ i57) | i68);
            int i70 = ~identityHashCode2;
            int i71 = ~((i70 & 195520148) | (i70 ^ 195520148));
            int i72 = i71 & (-1606412279);
            int i73 = (i71 | (-1606412279)) & (~i72);
            int i74 = -(-(((i73 & i72) | (i73 ^ i72)) * 84));
            int i75 = ((i69 ^ i74) | (i69 & i74)) << 1;
            int i76 = -((i74 & (~i69)) | ((~i74) & i69));
            if (i31 > (i75 & i76) + (i76 | i75)) {
                this.dinersSchemeConfiguration = str;
                throw null;
            }
            this.dinersSchemeConfiguration = str;
            int i77 = InvalidInputException;
            int i78 = ((((i77 ^ 67) | (i77 & 67)) << 1) - (~(-(((~i77) & 67) | (i77 & (-68)))))) - 1;
            logo = i78 % 128;
            if (i78 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance restrictedParameters(String str) {
            int i = logo;
            this.newSchemeConfiguration = str;
            int i2 = i & 85;
            int i3 = (i | 85) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            InvalidInputException = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance visaSchemeConfiguration(String str) {
            int i = InvalidInputException;
            int i2 = ((i | 99) << 1) - (i ^ 99);
            int i3 = i2 % 128;
            logo = i3;
            if (i2 % 2 != 0) {
                this.getSchemePublicRootKeys = str;
                int i4 = 96 / 0;
            } else {
                this.getSchemePublicRootKeys = str;
            }
            int i5 = i3 & 35;
            int i6 = ((i3 | 35) & (~i5)) + (i5 << 1);
            InvalidInputException = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
            }
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInstance(String str) {
            int i = logo;
            int i2 = ((i | 74) << 1) - (i ^ 74);
            int i3 = ((i2 ^ (-1)) + (i2 << 1)) % 128;
            InvalidInputException = i3;
            this.initialize = str;
            int i4 = i3 ^ 125;
            int i5 = (i3 & 125) << 1;
            logo = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance get(String str) {
            int i = InvalidInputException;
            int i2 = (i & 71) + (i | 71);
            logo = i2 % 128;
            if (i2 % 2 == 0) {
                this.getSDKInfo = str;
                logo = ((i & 27) + (i | 27)) % 128;
                return this;
            }
            this.getSDKInfo = str;
            throw null;
        }

        public ThreeDS2ServiceInstance getWarnings(getLocalizedMessage getlocalizedmessage) {
            int i = InvalidInputException;
            int i2 = i & 115;
            int i3 = (i2 + ((i ^ 115) | i2)) % 128;
            logo = i3;
            this.ThreeDS2ServiceInstance = getlocalizedmessage;
            int i4 = ((i3 ^ 125) | (i3 & 125)) << 1;
            int i5 = -((i3 & (-126)) | ((~i3) & 125));
            InvalidInputException = ((i4 & i5) + (i4 | i5)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInstance(List<setMarqueeRepeatLimit> list) {
            int i = logo;
            this.mastercardSchemeConfiguration = list;
            int i2 = i & 27;
            InvalidInputException = (i2 + ((i ^ 27) | i2)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance getWarnings(setImeHintLocales setimehintlocales) {
            int i = logo;
            int i2 = (((i | 5) << 1) - (i ^ 5)) % 128;
            InvalidInputException = i2;
            this.ThreeDS2Service = setimehintlocales;
            logo = (i2 + 85) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance get(clear clearVar) {
            int i = logo;
            int i2 = (i & 39) + (i | 39);
            InvalidInputException = i2 % 128;
            if (i2 % 2 != 0) {
                this.getSchemeLogoDark = clearVar;
                int i3 = i & 51;
                int i4 = -(-((i ^ 51) | i3));
                InvalidInputException = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
                return this;
            }
            this.getSchemeLogoDark = clearVar;
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInstance(wait waitVar) {
            System.identityHashCode(this);
            System.identityHashCode(this);
            this.build = waitVar;
            int i = InvalidInputException;
            int i2 = i & 85;
            int i3 = (i ^ 85) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            logo = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
            return this;
        }

        public ThreeDS2ServiceInstance getWarnings(load loadVar) {
            int i = InvalidInputException;
            int i2 = i & 97;
            int i3 = ((i ^ 97) | i2) << 1;
            int i4 = -((i | 97) & (~i2));
            int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            logo = i5;
            this.getSchemeEncryptionPublicKey = loadVar;
            int i6 = ((i5 ^ 2) + ((i5 & 2) << 1)) - 1;
            InvalidInputException = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInstance(put putVar) {
            int i = InvalidInputException;
            this.eftposConfiguration = putVar;
            logo = ((((i ^ 23) | (i & 23)) << 1) - (((~i) & 23) | (i & (-24)))) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance getWarnings(String str) {
            int i = (InvalidInputException + 39) % 128;
            logo = i;
            this.getWarnings = str;
            InvalidInputException = (((i | 31) << 1) - (((~i) & 31) | (i & (-32)))) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(keySet keyset) {
            int i = InvalidInputException;
            int i2 = i & 95;
            int i3 = -(-((i ^ 95) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            logo = i4 % 128;
            if (i4 % 2 == 0) {
                this.amexConfiguration = keyset;
                return this;
            }
            this.amexConfiguration = keyset;
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(Integer num) {
            int i = logo + 21;
            InvalidInputException = i % 128;
            if (i % 2 != 0) {
                this.cbConfiguration = num;
                return this;
            }
            this.cbConfiguration = num;
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(load loadVar) {
            int i = InvalidInputException;
            this.unionSchemeConfiguration = loadVar;
            int i2 = i + 97;
            logo = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(String str) {
            int i = logo;
            int i2 = ((i & (-98)) | ((~i) & 97)) + ((i & 97) << 1);
            InvalidInputException = i2 % 128;
            if (i2 % 2 != 0) {
                this.get = str;
                int i3 = ((i | 40) << 1) - (i ^ 40);
                int i4 = (i3 ^ (-1)) + (i3 << 1);
                InvalidInputException = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 74 / 0;
                }
                return this;
            }
            this.get = str;
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(putAll putall) {
            int i = logo;
            int i2 = i & 29;
            int i3 = ((i | 29) & (~i2)) + (i2 << 1);
            InvalidInputException = i3 % 128;
            if (i3 % 2 != 0) {
                this.encryptionPublicKey = putall;
                return this;
            }
            this.encryptionPublicKey = putall;
            throw null;
        }

        public ThreeDS2ServiceInstance initialize(String str) {
            int i = logo;
            int i2 = i & 61;
            int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~(-(-((i ^ 61) | i2))), 1, 128);
            InvalidInputException = m$1;
            this.getSDKVersion = str;
            int i3 = m$1 & 79;
            int i4 = (m$1 ^ 79) | i3;
            logo = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance initialize(List<setTextIsSelectable> list) {
            int i = InvalidInputException;
            int i2 = i & 79;
            int i3 = (i2 - (~(-(-((i ^ 79) | i2))))) - 1;
            int i4 = i3 % 128;
            logo = i4;
            if (i3 % 2 == 0) {
                this.getParamValue = list;
                InvalidInputException = ((i4 ^ 53) + ((i4 & 53) << 1)) % 128;
                return this;
            }
            this.getParamValue = list;
            throw null;
        }

        public ThreeDS2ServiceInstance initialize(setPopupTheme setpopuptheme) {
            int i = InvalidInputException;
            this.apiKey = setpopuptheme;
            logo = (i + 79) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance initialize(setImeHintLocales setimehintlocales) {
            int i = InvalidInputException;
            int i2 = i & 39;
            int i3 = (((i | 39) & (~i2)) - (~(i2 << 1))) - 1;
            int i4 = i3 % 128;
            logo = i4;
            if (i3 % 2 == 0) {
                this.createTransaction = setimehintlocales;
                int i5 = i4 ^ 87;
                int i6 = ((i4 & 87) | i5) << 1;
                int i7 = -i5;
                int i8 = (i6 & i7) + (i7 | i6);
                InvalidInputException = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 11 / 0;
                }
                return this;
            }
            this.createTransaction = setimehintlocales;
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String newSchemeConfiguration() {
        int i = SDKNotInitializedException + 4;
        int i2 = (i ^ (-1)) + (i << 1);
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        String str = this.build;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String unionSchemeConfiguration() {
        int i = SDKNotInitializedException;
        String str = this.configureScheme;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        rootPublicKey = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public addSuppressed visaSchemeConfiguration() {
        int i = SDKNotInitializedException;
        int i2 = i & 67;
        int i3 = i | 67;
        int i4 = (i2 & i3) + (i3 | i2);
        rootPublicKey = i4 % 128;
        int i5 = i4 % 2;
        addSuppressed addsuppressed = this.getSDKVersion;
        if (i5 == 0) {
            return addsuppressed;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String dinersSchemeConfiguration() {
        int i = SDKNotInitializedException;
        int i2 = (i | 125) << 1;
        int i3 = -(i ^ 125);
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        rootPublicKey = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ConfigurationBuilder;
        if (i5 != 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        setImeHintLocales setimehintlocales = (setImeHintLocales) objArr[1];
        int i = rootPublicKey;
        int i2 = (i ^ 10) + ((i & 10) << 1);
        SDKNotInitializedException = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        settitle.cleanup = setimehintlocales;
        int i3 = i + 45;
        SDKNotInitializedException = i3 % 128;
        if (i3 % 2 != 0) {
            return setimehintlocales;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String build() {
        int i = rootPublicKey;
        String str = this.getParamValue;
        int i2 = i + 70;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        SDKNotInitializedException = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public put initialize() {
        int i = rootPublicKey;
        put putVar = this.eftposConfiguration;
        int i2 = i | 67;
        SDKNotInitializedException = ((i2 << 1) - ((~(i & 67)) & i2)) % 128;
        return putVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public setPopupTheme ThreeDS2ServiceInitializationCallback() {
        int i = rootPublicKey + 3;
        int i2 = i % 128;
        SDKNotInitializedException = i2;
        int i3 = i % 2;
        setPopupTheme setpopuptheme = this.addParam;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i2 & 25;
        rootPublicKey = ((((i2 ^ 25) | i4) << 1) - ((i2 | 25) & (~i4))) % 128;
        return setpopuptheme;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String configureScheme() {
        int i = SDKNotInitializedException;
        int i2 = (i & 81) + (i | 81);
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        String str = this.createTransaction;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String getSchemeLogo() {
        int i = SDKNotInitializedException;
        int i2 = (i & 37) + (i | 37);
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getSchemeEncryptionPublicKeyId;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInputExtras
    public wait getSDKVersion() {
        int i = rootPublicKey;
        int i2 = ((i | 35) << 1) - (i ^ 35);
        SDKNotInitializedException = i2 % 128;
        int i3 = i2 % 2;
        wait waitVar = this.SchemeConfiguration;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return waitVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String SchemeConfigurationBuilder() {
        int i = SDKNotInitializedException;
        String str = this.encryptionPublicKey;
        rootPublicKey = (i + 57) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public List<setTextIsSelectable> amexConfiguration() {
        int i = SDKNotInitializedException;
        int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 100) << 1, i ^ 100, 1, 128);
        rootPublicKey = m$1;
        List<setTextIsSelectable> list = this.onError;
        int i2 = m$1 & 99;
        int i3 = (m$1 | 99) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        SDKNotInitializedException = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String cbConfiguration() {
        int i = SDKNotInitializedException;
        int i2 = (((i | 28) << 1) - (i ^ 28)) - 1;
        int i3 = i2 % 128;
        rootPublicKey = i3;
        int i4 = i2 % 2;
        String str = this.removeParam;
        if (i4 != 0) {
            throw null;
        }
        SDKNotInitializedException = (i3 + 113) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public String onError() {
        int i = SDKNotInitializedException;
        int i2 = ((i & (-4)) | ((~i) & 3)) + ((i & 3) << 1);
        rootPublicKey = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        rootPublicKey = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        setTitle settitle = (setTitle) objArr[0];
        String str = (String) objArr[1];
        int i = rootPublicKey;
        int i2 = i & 97;
        int i3 = (i ^ 97) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        SDKNotInitializedException = i4 % 128;
        int i5 = i4 % 2;
        settitle.getSDKInfo = str;
        if (i5 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public load ThreeDS2ServiceInstance() {
        int i = rootPublicKey;
        int i2 = (((i & (-114)) | ((~i) & 113)) + ((i & 113) << 1)) % 128;
        SDKNotInitializedException = i2;
        load loadVar = this.cbConfiguration;
        int i3 = i2 & 9;
        int i4 = i2 | 9;
        rootPublicKey = ((i3 & i4) + (i3 | i4)) % 128;
        return loadVar;
    }
}
