package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;
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
public final class AFe1sSDK extends AFe1mSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);

    @Metadata
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static String AFAdRevenueData(String str, String str2, String str3) {
            return String.format(AFe1qSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()) + str + str3 + "?device_id=" + str2;
        }

        public static String AFAdRevenueData(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str5, str3, str + str2}), str4);
        }
    }

    private AFe1sSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
        super(str, bArr, str2, map, z);
    }

    public static final AFe1sSDK getRevenue(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String strAFAdRevenueData = AFa1vSDK.AFAdRevenueData(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFe1sSDK aFe1sSDK = new AFe1sSDK(strAFAdRevenueData, d0.d(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", strValueOf), new Pair("af_sig", AFa1vSDK.AFAdRevenueData(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFe1sSDK.component3 = 10000;
        return aFe1sSDK;
    }

    public /* synthetic */ AFe1sSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? "GET" : str2, (i2 & 16) != 0 ? false : z);
    }
}
