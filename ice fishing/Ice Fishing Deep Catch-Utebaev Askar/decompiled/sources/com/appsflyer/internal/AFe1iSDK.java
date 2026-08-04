package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFe1iSDK {
    private static AFe1hSDK areAllFieldsValid;
    private final f.a component3;
    private final AFd1rSDK getCurrencyIso4217Code;
    public final f.a getMonetizationNetwork;
    private final AFd1qSDK getRevenue;
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    public static String getMediationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String AFAdRevenueData = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component1 = kotlin.collections.o.b("googleplay", "playstore", "googleplaystore");

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1iSDK$4, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass4 extends m.d implements Function0<String> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String monetizationNetwork = AFb1rSDK.getMonetizationNetwork(AFe1iSDK.this.getCurrencyIso4217Code, AFe1iSDK.this.getRevenue.component4());
            if (!(monetizationNetwork == null || kotlin.text.o.b(monetizationNetwork))) {
                String string = kotlin.text.q.l(monetizationNetwork).toString();
                List<String> currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (currencyIso4217Code.contains(lowerCase)) {
                    String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFLogger.afWarnLog(str);
                    monetizationNetwork = "";
                } else {
                    monetizationNetwork = "-".concat(string);
                }
            }
            return kotlin.text.q.l(monetizationNetwork != null ? monetizationNetwork : "").toString();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1iSDK$5, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass5 extends m.d implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1iSDK.this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1iSDK.getMediationNetwork(packageName, AFe1iSDK.getMonetizationNetwork(AFe1iSDK.this));
        }
    }

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1fSDK.values().length];
            try {
                iArr[AFe1fSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1fSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1fSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static List<String> getCurrencyIso4217Code() {
            return AFe1iSDK.component1;
        }

        public static void getMonetizationNetwork(AFe1hSDK aFe1hSDK) {
            AFe1iSDK.areAllFieldsValid = aFe1hSDK;
        }
    }

    public AFe1iSDK(AFd1qSDK aFd1qSDK, AFd1rSDK aFd1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        this.getRevenue = aFd1qSDK;
        this.getCurrencyIso4217Code = aFd1rSDK;
        this.component3 = f.b.a(new AnonymousClass4());
        this.getMonetizationNetwork = f.b.a(new AnonymousClass5());
    }

    public static final /* synthetic */ String getMonetizationNetwork(AFe1iSDK aFe1iSDK) {
        return (String) ((f.g) aFe1iSDK.component3).a();
    }

    public final String AFAdRevenueData() {
        int i2 = AFa1uSDK.getRevenue[(getCurrencyIso4217Code() ? AFe1fSDK.DEFAULT : AFe1fSDK.API).ordinal()];
        if (i2 == 1) {
            return "appsflyersdk.com";
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new f.c();
        }
        AFe1hSDK aFe1hSDK = areAllFieldsValid;
        String str = aFe1hSDK != null ? aFe1hSDK.getMediationNetwork : null;
        return str == null ? "" : str;
    }

    public static boolean getCurrencyIso4217Code() {
        return areAllFieldsValid == null;
    }

    public final String getMediationNetwork() {
        int i2 = AFa1uSDK.getRevenue[(getCurrencyIso4217Code() ? AFe1fSDK.DEFAULT : AFe1fSDK.API).ordinal()];
        if (i2 == 1) {
            return (String) ((f.g) this.getMonetizationNetwork).a();
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new f.c();
        }
        AFe1hSDK aFe1hSDK = areAllFieldsValid;
        String str = aFe1hSDK != null ? aFe1hSDK.AFAdRevenueData : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "-";
    }

    public static final void getMonetizationNetwork(AFe1hSDK aFe1hSDK) {
        AFa1zSDK.getMonetizationNetwork(aFe1hSDK);
    }
}
