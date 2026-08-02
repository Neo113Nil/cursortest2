package com.squareup.cash.cdf.crypto;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoStablecoinDepositShareDestinationAddress implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String asset;
    public final String chain;
    public final LinkedHashMap parameters;

    public CryptoStablecoinDepositShareDestinationAddress(String str, String str2) {
        this.chain = str;
        this.asset = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "StablecoinDeposit");
        Countries.putSafe(m, "chain", str);
        Countries.putSafe(m, "asset", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoStablecoinDepositShareDestinationAddress)) {
            return false;
        }
        CryptoStablecoinDepositShareDestinationAddress cryptoStablecoinDepositShareDestinationAddress = (CryptoStablecoinDepositShareDestinationAddress) obj;
        return Intrinsics.areEqual(this.chain, cryptoStablecoinDepositShareDestinationAddress.chain) && Intrinsics.areEqual(this.asset, cryptoStablecoinDepositShareDestinationAddress.asset);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto StablecoinDeposit ShareDestinationAddress";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.chain;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.asset;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CryptoStablecoinDepositShareDestinationAddress(chain=", this.chain, ", asset=", this.asset, ")");
    }
}
