package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
public final class AFj1jSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static String component3;
    private static final String component4;
    public static final String getCurrencyIso4217Code;
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;
    public final AFj1bSDK AFAdRevenueData;
    public final AFd1qSDK getRevenue;

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = AFb1rSDK.AFAdRevenueData;
        String str2 = str + "/androidevent?app_id=";
        component4 = str2;
        getMonetizationNetwork = "https://%sattr.%s/api/v" + str2;
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.15.2/android?app_id=";
        getMediationNetwork = "https://%sconversions.%s/api/v" + str2;
        areAllFieldsValid = "https://%slaunches.%s/api/v" + str2;
        component1 = "https://%sinapps.%s/api/v" + str2;
        component2 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        component3 = "https://%svalidate.%s/api/v" + str + "/androidevent?buildnumber=6.15.2&app_id=";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1jSDK(AFd1qSDK aFd1qSDK) {
        this(aFd1qSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
    }

    public static String getCurrencyIso4217Code() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public static String getMonetizationNetwork(String str, boolean z) {
        return str + (!z ? "&buildnumber=6.15.2" : "");
    }

    public final String getMediationNetwork(AFh1gSDK aFh1gSDK) {
        Intrinsics.checkNotNullParameter(aFh1gSDK, "");
        if (aFh1gSDK instanceof AFh1bSDK) {
            return this.AFAdRevenueData.getMonetizationNetwork("https://%ssdk-services.%s/validate-android-signature");
        }
        if (!(aFh1gSDK instanceof AFh1aSDK)) {
            throw new UnsupportedOperationException();
        }
        return this.AFAdRevenueData.getMonetizationNetwork(component3) + this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
    }

    public final String getRevenue(String str) {
        String strComponent4 = this.getRevenue.component4();
        String strConcat = strComponent4 != null ? "&channel=".concat(strComponent4) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return str + strConcat;
    }

    private AFj1jSDK(AFd1qSDK aFd1qSDK, AFj1bSDK aFj1bSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFj1bSDK, "");
        this.getRevenue = aFd1qSDK;
        this.AFAdRevenueData = aFj1bSDK;
    }

    public final String getMediationNetwork(String str) {
        return str + this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
    }

    public final String getRevenue(String str, String str2) {
        String packageName = this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strComponent4 = this.getRevenue.component4();
        if (!(strComponent4 == null || kotlin.text.o.b(strComponent4))) {
            strComponent4 = "-" + kotlin.text.q.l(strComponent4).toString();
        }
        if (strComponent4 == null) {
            strComponent4 = "";
        }
        String string = kotlin.text.q.l(strComponent4).toString();
        Uri.Builder builderAppendPath = Uri.parse(this.AFAdRevenueData.getMonetizationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.afErrorLog(str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")));
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFb1jSDK.getMonetizationNetwork(str2.concat(str), str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFb1rSDK.AFAdRevenueData).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public /* synthetic */ AFj1jSDK(AFd1qSDK aFd1qSDK, AFj1bSDK aFj1bSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1qSDK, (i2 & 2) != 0 ? new AFj1eSDK() : aFj1bSDK);
    }
}
