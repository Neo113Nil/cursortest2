package com.appsflyer;

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
public final class AFPurchaseDetails {
    private final String currency;
    private final String price;
    private final String productId;
    private final String purchaseToken;
    private final AFPurchaseType purchaseType;

    public AFPurchaseDetails(AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = str;
        this.productId = str2;
        this.price = str3;
        this.currency = str4;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((i2 & 2) != 0) {
            str = aFPurchaseDetails.purchaseToken;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = aFPurchaseDetails.productId;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = aFPurchaseDetails.price;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = aFPurchaseDetails.currency;
        }
        return aFPurchaseDetails.copy(aFPurchaseType, str5, str6, str7, str4);
    }

    public final AFPurchaseType component1() {
        return this.purchaseType;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final String component3() {
        return this.productId;
    }

    public final String component4() {
        return this.price;
    }

    public final String component5() {
        return this.currency;
    }

    public final AFPurchaseDetails copy(AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AFPurchaseDetails(aFPurchaseType, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) obj;
        return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.a(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.a(this.productId, aFPurchaseDetails.productId) && Intrinsics.a(this.price, aFPurchaseDetails.price) && Intrinsics.a(this.currency, aFPurchaseDetails.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        return this.currency.hashCode() + ((this.price.hashCode() + ((this.productId.hashCode() + ((this.purchaseToken.hashCode() + (this.purchaseType.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AFPurchaseDetails(purchaseType=" + this.purchaseType + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", price=" + this.price + ", currency=" + this.currency + ")";
    }
}
