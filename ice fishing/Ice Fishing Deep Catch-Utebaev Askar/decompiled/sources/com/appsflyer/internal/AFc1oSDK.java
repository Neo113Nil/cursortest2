package com.appsflyer.internal;

import java.util.LinkedHashMap;
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
public final class AFc1oSDK {
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    final Map<String, Object> getCurrencyIso4217Code;
    final AFc1hSDK getMonetizationNetwork;

    @Metadata
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AFc1oSDK AFAdRevenueData(AFa1oSDK aFa1oSDK) {
            Intrinsics.checkNotNullParameter(aFa1oSDK, "");
            Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return new AFc1oSDK(monetizationNetwork, null, 2, 0 == true ? 1 : 0);
        }

        public static AFc1oSDK getCurrencyIso4217Code(AFc1hSDK aFc1hSDK) {
            Intrinsics.checkNotNullParameter(aFc1hSDK, "");
            return new AFc1oSDK(new LinkedHashMap(), aFc1hSDK, null);
        }
    }

    private AFc1oSDK(Map<String, Object> map, AFc1hSDK aFc1hSDK) {
        this.getCurrencyIso4217Code = map;
        this.getMonetizationNetwork = aFc1hSDK;
    }

    public static final AFc1oSDK AFAdRevenueData(AFc1hSDK aFc1hSDK) {
        return AFa1uSDK.getCurrencyIso4217Code(aFc1hSDK);
    }

    public static final AFc1oSDK getMediationNetwork(AFa1oSDK aFa1oSDK) {
        return AFa1uSDK.AFAdRevenueData(aFa1oSDK);
    }

    public final boolean getMonetizationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getCurrencyIso4217Code.containsKey(str);
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1hSDK aFc1hSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i2 & 2) != 0 ? null : aFc1hSDK);
    }

    public final void getMediationNetwork(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code.put(str, obj);
        AFc1hSDK aFc1hSDK = this.getMonetizationNetwork;
        if (aFc1hSDK != null) {
            aFc1hSDK.AFAdRevenueData(this.getCurrencyIso4217Code);
        }
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1hSDK aFc1hSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1hSDK);
    }
}
