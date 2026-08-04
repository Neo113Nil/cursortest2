package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
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
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFh1rSDK {
    public Boolean AFAdRevenueData;
    public Map<String, Object> component1;
    public Boolean component2;
    public String component3;
    public String getCurrencyIso4217Code;
    public Boolean getMediationNetwork;
    public Boolean getMonetizationNetwork;
    public Boolean getRevenue;

    private AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getCurrencyIso4217Code = str;
        this.getRevenue = bool;
        this.AFAdRevenueData = bool2;
        this.getMediationNetwork = bool3;
        this.getMonetizationNetwork = bool4;
        this.component3 = str2;
        this.component2 = bool5;
        this.component1 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1rSDK)) {
            return false;
        }
        AFh1rSDK aFh1rSDK = (AFh1rSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFh1rSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getRevenue, aFh1rSDK.getRevenue) && Intrinsics.a(this.AFAdRevenueData, aFh1rSDK.AFAdRevenueData) && Intrinsics.a(this.getMediationNetwork, aFh1rSDK.getMediationNetwork) && Intrinsics.a(this.getMonetizationNetwork, aFh1rSDK.getMonetizationNetwork) && Intrinsics.a(this.component3, aFh1rSDK.component3) && Intrinsics.a(this.component2, aFh1rSDK.component2) && Intrinsics.a(this.component1, aFh1rSDK.component1);
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.getRevenue;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFAdRevenueData;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getMediationNetwork;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getMonetizationNetwork;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.component3;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component2;
        return this.component1.hashCode() + ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getCurrencyIso4217Code + ", isLimited=" + this.getRevenue + ", isEnabled=" + this.AFAdRevenueData + ", isGaidWithGps=" + this.getMediationNetwork + ", isGaidWithSamsungCloudDev=" + this.getMonetizationNetwork + ", gaidError=" + this.component3 + ", retry=" + this.component2 + ", metadata=" + this.component1 + ")";
    }

    public /* synthetic */ AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? new HashMap() : map);
    }

    public AFh1rSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
