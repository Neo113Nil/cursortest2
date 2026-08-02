package com.squareup.cash.attribution.wrappers;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/attribution/wrappers/InvalidAppsFlyerDeepLinkDomain;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InvalidAppsFlyerDeepLinkDomain extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.DeepLinking.INSTANCE);
    public final String message;

    public InvalidAppsFlyerDeepLinkDomain(String str) {
        this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Received deep link from AppsFlyer with invalid domain (", str, ")");
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
