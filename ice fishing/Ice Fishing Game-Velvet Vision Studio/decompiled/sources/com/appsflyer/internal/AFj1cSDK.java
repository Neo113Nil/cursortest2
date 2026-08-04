package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

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
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFj1cSDK {
    public static final String AFAdRevenueData;
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static final String component3;
    public static final String component4;
    private static final String copy;
    public static final AFa1ySDK getCurrencyIso4217Code = new AFa1ySDK(null);
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;
    private final AFc1oSDK equals;
    public final AFk1zSDK getRevenue;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String strH = com.gamericefishpro.space.m5.a.h(com.appsflyer.internal.AFa1ySDK.getMediationNetwork, "/androidevent?app_id=");
        copy = strH;
        getMediationNetwork = com.gamericefishpro.space.m5.a.u("https://%sattr.%s/api/v", strH);
        AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.17.5/android?app_id=";
        getMonetizationNetwork = com.gamericefishpro.space.m5.a.u("https://%sconversions.%s/api/v", strH);
        areAllFieldsValid = com.gamericefishpro.space.m5.a.u("https://%slaunches.%s/api/v", strH);
        component4 = com.gamericefishpro.space.m5.a.u("https://%sinapps.%s/api/v", strH);
        component2 = com.gamericefishpro.space.m5.a.u("https://%sregister.%s/api/v", strH);
        component1 = com.gamericefishpro.space.m5.a.u("https://%svalidate.%s/api/v", strH);
        component3 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    private AFj1cSDK(AFc1oSDK aFc1oSDK, AFk1zSDK aFk1zSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFk1zSDK, "");
        this.equals = aFc1oSDK;
        this.getRevenue = aFk1zSDK;
    }

    public static String getMediationNetwork() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public static String getRevenue(String str, boolean z) {
        return com.gamericefishpro.space.m5.a.h(str, !z ? "&buildnumber=6.17.5" : "");
    }

    public final String getMonetizationNetwork(String str, String str2) {
        String packageName = this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strComponent3 = this.equals.component3();
        if (strComponent3 != null && !StringsKt.u(strComponent3)) {
            strComponent3 = com.gamericefishpro.space.m5.a.u("-", StringsKt.D(strComponent3).toString());
        }
        if (strComponent3 == null) {
            strComponent3 = "";
        }
        String string = StringsKt.D(strComponent3).toString();
        Uri.Builder builderAppendPath = Uri.parse(this.getRevenue.getMediationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")), true, false, false, true);
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFj1dSDK.getMonetizationNetwork(str2.concat(str), str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", com.appsflyer.internal.AFa1ySDK.getMediationNetwork).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String getMediationNetwork(String str) {
        return com.gamericefishpro.space.m5.a.h(str, this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
    }

    public /* synthetic */ AFj1cSDK(AFc1oSDK aFc1oSDK, AFk1zSDK aFk1zSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1oSDK, (i & 2) != 0 ? new AFk1ySDK() : aFk1zSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1cSDK(AFc1oSDK aFc1oSDK) {
        this(aFc1oSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
    }

    public final String getMediationNetwork(String str, boolean z) {
        if (z) {
            return str;
        }
        String strComponent3 = this.equals.component3();
        String strConcat = strComponent3 != null ? "&channel=".concat(strComponent3) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return com.gamericefishpro.space.m5.a.h(str, strConcat);
    }
}
