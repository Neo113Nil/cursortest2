package com.squareup.cash.bitcoin.presenters;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/bitcoin/presenters/NullWalletAddressError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NullWalletAddressError extends ReportedError {
    public static final NullWalletAddressError INSTANCE = new NullWalletAddressError();

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return SetsKt__SetsJVMKt.setOf(ErrorFeature.Bitcoin.INSTANCE);
    }
}
