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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFh1pSDK {
    public Boolean AFAdRevenueData;
    public Boolean areAllFieldsValid;
    public Map<String, Object> component2;
    public String component3;
    public Boolean getCurrencyIso4217Code;
    public Boolean getMediationNetwork;
    public String getMonetizationNetwork;
    public Boolean getRevenue;

    public AFh1pSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1pSDK)) {
            return false;
        }
        AFh1pSDK aFh1pSDK = (AFh1pSDK) obj;
        return Intrinsics.a(this.getMonetizationNetwork, aFh1pSDK.getMonetizationNetwork) && Intrinsics.a(this.AFAdRevenueData, aFh1pSDK.AFAdRevenueData) && Intrinsics.a(this.getCurrencyIso4217Code, aFh1pSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getRevenue, aFh1pSDK.getRevenue) && Intrinsics.a(this.getMediationNetwork, aFh1pSDK.getMediationNetwork) && Intrinsics.a(this.component3, aFh1pSDK.component3) && Intrinsics.a(this.areAllFieldsValid, aFh1pSDK.areAllFieldsValid) && Intrinsics.a(this.component2, aFh1pSDK.component2);
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getCurrencyIso4217Code;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getRevenue;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getMediationNetwork;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.component3;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.areAllFieldsValid;
        return this.component2.hashCode() + ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getMonetizationNetwork + ", isLimited=" + this.AFAdRevenueData + ", isEnabled=" + this.getCurrencyIso4217Code + ", isGaidWithGps=" + this.getRevenue + ", isGaidWithSamsungCloudDev=" + this.getMediationNetwork + ", gaidError=" + this.component3 + ", retry=" + this.areAllFieldsValid + ", metadata=" + this.component2 + ")";
    }

    private AFh1pSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork = str;
        this.AFAdRevenueData = bool;
        this.getCurrencyIso4217Code = bool2;
        this.getRevenue = bool3;
        this.getMediationNetwork = bool4;
        this.component3 = str2;
        this.areAllFieldsValid = bool5;
        this.component2 = map;
    }

    public /* synthetic */ AFh1pSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : bool3, (i2 & 16) != 0 ? null : bool4, (i2 & 32) != 0 ? null : str2, (i2 & 64) == 0 ? bool5 : null, (i2 & 128) != 0 ? new HashMap() : map);
    }
}
