package com.squareup.cash.investing.db;

import com.squareup.protos.cash.marketprices.CurrentPrice;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investing_entity_price_cache {
    public final CurrentPrice price;
    public final String token;

    public Investing_entity_price_cache(String str, CurrentPrice currentPrice) {
        str.getClass();
        currentPrice.getClass();
        this.token = str;
        this.price = currentPrice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investing_entity_price_cache)) {
            return false;
        }
        Investing_entity_price_cache investing_entity_price_cache = (Investing_entity_price_cache) obj;
        return Intrinsics.areEqual(this.token, investing_entity_price_cache.token) && Intrinsics.areEqual(this.price, investing_entity_price_cache.price);
    }

    public final int hashCode() {
        return this.price.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "Investing_entity_price_cache(token=" + this.token + ", price=" + this.price + ")";
    }
}
