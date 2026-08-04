package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFb1kSDK {
    public static final AFb1kSDK INSTANCE = new AFb1kSDK();
    private static String getMonetizationNetwork;

    private AFb1kSDK() {
    }

    public static final synchronized void getCurrencyIso4217Code(String str, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        getMonetizationNetwork = str;
        aFc1qSDK.AFAdRevenueData("CUSTOM_INSTALL_ID_APPLIED", true);
        aFc1qSDK.getRevenue("AF_INSTALLATION", str);
    }

    public static final synchronized String getCurrencyIso4217Code(AFc1qSDK aFc1qSDK) {
        String str;
        try {
            Intrinsics.checkNotNullParameter(aFc1qSDK, "");
            if (getMonetizationNetwork == null) {
                String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("AF_INSTALLATION", (String) null);
                if (monetizationNetwork == null) {
                    monetizationNetwork = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    aFc1qSDK.getRevenue("AF_INSTALLATION", monetizationNetwork);
                }
                getMonetizationNetwork = monetizationNetwork;
            }
            str = getMonetizationNetwork;
            Intrinsics.b(str);
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }
}
