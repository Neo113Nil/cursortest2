package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFi1uSDK {
    public List<String> AFAdRevenueData;
    public final String component4;
    public final String getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final float getMonetizationNetwork;
    public final int getRevenue;

    public AFi1uSDK(long j2, float f2, List<String> list, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMediationNetwork = j2;
        this.getMonetizationNetwork = f2;
        this.AFAdRevenueData = list;
        this.getRevenue = i2;
        this.getCurrencyIso4217Code = str;
        this.component4 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.a(AFi1uSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFi1uSDK aFi1uSDK = (AFi1uSDK) obj;
        if (this.getMediationNetwork != aFi1uSDK.getMediationNetwork) {
            return false;
        }
        return ((this.getMonetizationNetwork > aFi1uSDK.getMonetizationNetwork ? 1 : (this.getMonetizationNetwork == aFi1uSDK.getMonetizationNetwork ? 0 : -1)) == 0) && Intrinsics.a(this.AFAdRevenueData, aFi1uSDK.AFAdRevenueData) && this.getRevenue == aFi1uSDK.getRevenue && Intrinsics.a(this.getCurrencyIso4217Code, aFi1uSDK.getCurrencyIso4217Code) && Intrinsics.a(this.component4, aFi1uSDK.component4);
    }

    public final boolean getCurrencyIso4217Code() {
        return TimeUnit.SECONDS.toMillis(this.getMediationNetwork) > AFb1rSDK.getRevenue().getMonetizationNetwork().component1().getCurrencyIso4217Code();
    }

    public final int hashCode() {
        return this.component4.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + ((((this.AFAdRevenueData.hashCode() + ((Float.hashCode(this.getMonetizationNetwork) + (Long.hashCode(this.getMediationNetwork) * 31)) * 31)) * 31) + this.getRevenue) * 31)) * 31);
    }
}
