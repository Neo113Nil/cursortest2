package app.cash.local.backend;

import app.cash.local.primitives.BrandSpot;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BuyerIntentScope {
    public final BrandSpot brandSpot;
    public final String inStoreOrderingToken;
    public final BuyerIntentType intentType;

    public BuyerIntentScope(BrandSpot brandSpot, BuyerIntentType buyerIntentType, String str) {
        brandSpot.getClass();
        this.brandSpot = brandSpot;
        this.intentType = buyerIntentType;
        this.inStoreOrderingToken = str;
    }

    public static BuyerIntentScope copy$default(BuyerIntentScope buyerIntentScope, BrandSpot brandSpot) {
        BuyerIntentType buyerIntentType = buyerIntentScope.intentType;
        String str = buyerIntentScope.inStoreOrderingToken;
        brandSpot.getClass();
        buyerIntentType.getClass();
        return new BuyerIntentScope(brandSpot, buyerIntentType, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyerIntentScope)) {
            return false;
        }
        BuyerIntentScope buyerIntentScope = (BuyerIntentScope) obj;
        return Intrinsics.areEqual(this.brandSpot, buyerIntentScope.brandSpot) && this.intentType == buyerIntentScope.intentType && Intrinsics.areEqual(this.inStoreOrderingToken, buyerIntentScope.inStoreOrderingToken);
    }

    public final int hashCode() {
        int hashCode = (this.intentType.hashCode() + (this.brandSpot.hashCode() * 31)) * 31;
        String str = this.inStoreOrderingToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuyerIntentScope(brandSpot=");
        sb.append(this.brandSpot);
        sb.append(", intentType=");
        sb.append(this.intentType);
        sb.append(", inStoreOrderingToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.inStoreOrderingToken, ")");
    }
}
