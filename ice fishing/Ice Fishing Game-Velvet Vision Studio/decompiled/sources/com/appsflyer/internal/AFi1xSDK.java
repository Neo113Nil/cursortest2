package com.appsflyer.internal;

import com.gamericefishpro.space.t0.y0;
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
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFi1xSDK {
    public List<String> AFAdRevenueData;
    public final String component4;
    public final String getCurrencyIso4217Code;
    public final float getMediationNetwork;
    public final int getMonetizationNetwork;
    public long getRevenue;

    public AFi1xSDK(long j, float f, List<String> list, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getRevenue = j;
        this.getMediationNetwork = f;
        this.AFAdRevenueData = list;
        this.getMonetizationNetwork = i;
        this.getCurrencyIso4217Code = str;
        this.component4 = str2;
    }

    public final boolean AFAdRevenueData() {
        return TimeUnit.SECONDS.toMillis(this.getRevenue) > AFa1ySDK.getRevenue().getMonetizationNetwork().component3().getCurrencyIso4217Code();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFi1xSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return this.getRevenue == aFi1xSDK.getRevenue && this.getMediationNetwork == aFi1xSDK.getMediationNetwork && Intrinsics.a(this.AFAdRevenueData, aFi1xSDK.AFAdRevenueData) && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.a(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code) && Intrinsics.a(this.component4, aFi1xSDK.component4);
    }

    public final int hashCode() {
        return this.component4.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + ((((this.AFAdRevenueData.hashCode() + y0.a(this.getMediationNetwork, Long.hashCode(this.getRevenue) * 31, 31)) * 31) + this.getMonetizationNetwork) * 31)) * 31);
    }
}
