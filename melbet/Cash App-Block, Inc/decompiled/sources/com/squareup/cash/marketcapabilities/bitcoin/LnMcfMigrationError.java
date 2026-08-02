package com.squareup.cash.marketcapabilities.bitcoin;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.marketcapabilities.MarketCapabilityName;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/marketcapabilities/bitcoin/LnMcfMigrationError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LnMcfMigrationError extends ReportedError {
    public final Set features;
    public final String message;
    public final Map metadata;

    public LnMcfMigrationError(boolean z, boolean z2) {
        MarketCapabilityName marketCapabilityName = MarketCapabilityName.BANKING;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.LnMcfMigration.INSTANCE);
        this.message = "Lightning MCF value does not match fallback";
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Lightning MCF Migration", MapsKt__MapsKt.mapOf(new Pair("capabilityName", "CRYPTO_BITCOIN_LIGHTNING_DEPOSIT"), new Pair("mcfValue", String.valueOf(z)), new Pair("fallbackValue", String.valueOf(z2))));
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
