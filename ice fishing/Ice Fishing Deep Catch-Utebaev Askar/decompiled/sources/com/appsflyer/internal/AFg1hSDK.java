package com.appsflyer.internal;

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
public enum AFg1hSDK {
    IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED("isSamsungPreloadReferrerEnabled", false),
    IS_PLAY_INTEGRITY_DATA_COLLECTION_ENABLED("isPlayIntegrityDataCollectionEnabled", true);

    private final boolean AFAdRevenueData;
    private final boolean getMonetizationNetwork = false;
    private final String getRevenue;

    AFg1hSDK(String str, boolean z) {
        this.getRevenue = str;
        this.AFAdRevenueData = z;
    }

    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    public final boolean getRevenue() {
        return this.getMonetizationNetwork;
    }
}
