package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;

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
public interface AFb1aSDK {
    public static final AFa1zSDK AFa1zSDK = AFa1zSDK.getCurrencyIso4217Code;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public interface AFa1tSDK {
        void getMediationNetwork();

        void getRevenue(AFh1qSDK aFh1qSDK);
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class AFa1zSDK {
        static final /* synthetic */ AFa1zSDK getCurrencyIso4217Code = new AFa1zSDK();
        private static long AFAdRevenueData = 500;

        private AFa1zSDK() {
        }

        public static long getMediationNetwork() {
            return AFAdRevenueData;
        }
    }

    void AFAdRevenueData(Context context, AFa1tSDK aFa1tSDK);

    boolean getMediationNetwork();

    void getMonetizationNetwork();
}
