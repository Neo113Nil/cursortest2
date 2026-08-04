package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFd1aSDK extends AFd1gSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    public static String getRevenue = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    private final AFe1uSDK getMonetizationNetwork;

    @Metadata
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1aSDK(byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMonetizationNetwork = AFe1uSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final AFe1uSDK getCurrencyIso4217Code() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String getMonetizationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFe1zSDK.AFAdRevenueData(str);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String getRevenue() {
        String str = String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
