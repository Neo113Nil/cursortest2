package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;

/* loaded from: classes4.dex */
public final class V {
    public static AdvIdentifiersResult.AdvId a(StartupParamsItem startupParamsItem) {
        String id = startupParamsItem != null ? startupParamsItem.getId() : null;
        StartupParamsItemStatus status = startupParamsItem != null ? startupParamsItem.getStatus() : null;
        int i = status == null ? -1 : U.a[status.ordinal()];
        return new AdvIdentifiersResult.AdvId(id, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? AdvIdentifiersResult.Details.INTERNAL_ERROR : AdvIdentifiersResult.Details.FORBIDDEN_BY_CLIENT_CONFIG : AdvIdentifiersResult.Details.INVALID_ADV_ID : AdvIdentifiersResult.Details.IDENTIFIER_PROVIDER_UNAVAILABLE : AdvIdentifiersResult.Details.FEATURE_DISABLED : AdvIdentifiersResult.Details.OK, startupParamsItem != null ? startupParamsItem.getErrorDetails() : null);
    }
}
