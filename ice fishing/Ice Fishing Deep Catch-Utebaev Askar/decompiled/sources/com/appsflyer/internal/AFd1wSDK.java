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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public interface AFd1wSDK {
    public static final AFa1ySDK AFa1ySDK = AFa1ySDK.getCurrencyIso4217Code;

    public interface AFa1tSDK {
        void getMonetizationNetwork(AFh1mSDK aFh1mSDK);

        void getRevenue();
    }

    public static final class AFa1ySDK {
        static final /* synthetic */ AFa1ySDK getCurrencyIso4217Code = new AFa1ySDK();
        private static long getMediationNetwork = 500;

        private AFa1ySDK() {
        }

        public static long getCurrencyIso4217Code() {
            return getMediationNetwork;
        }
    }

    void AFAdRevenueData();

    boolean getMediationNetwork();

    void getRevenue(Context context, AFa1tSDK aFa1tSDK);
}
