package com.appsflyer.internal;

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
public final class AFe1ySDK extends AFd1gSDK {
    private final AFe1uSDK component3;
    public AFd1qSDK getMonetizationNetwork;
    private final boolean getRevenue;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1ySDK(AFd1qSDK aFd1qSDK, byte[] bArr) {
        this(aFd1qSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final AFe1uSDK getCurrencyIso4217Code() {
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean getMediationNetwork() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String getMonetizationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String getRevenue() {
        AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMonetizationNetwork, null, 2, null);
        return aFj1jSDK.getMediationNetwork(aFj1jSDK.AFAdRevenueData.getMonetizationNetwork(AFj1jSDK.component2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1ySDK(AFd1qSDK aFd1qSDK, byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMonetizationNetwork = aFd1qSDK;
        this.component3 = AFe1uSDK.OCTET_STREAM;
    }

    public /* synthetic */ AFe1ySDK(AFd1qSDK aFd1qSDK, byte[] bArr, Map map, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1qSDK, bArr, (i3 & 4) != 0 ? null : map, (i3 & 8) != 0 ? 2000 : i2);
    }
}
