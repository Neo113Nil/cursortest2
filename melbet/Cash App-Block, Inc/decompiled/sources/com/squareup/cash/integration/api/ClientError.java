package com.squareup.cash.integration.api;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.util.Strings;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/integration/api/ClientError;", "Lcom/squareup/cash/observability/types/ReportedError;", "cash-os"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientError extends ReportedError {
    public final int code;
    public final String errorMessage;
    public final HttpUrl url;

    public ClientError(int i, HttpUrl httpUrl, String str) {
        httpUrl.getClass();
        this.code = i;
        this.url = httpUrl;
        this.errorMessage = str;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return EmptySet.INSTANCE;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        int i = this.code;
        if (i == 429) {
            return "HTTP 429";
        }
        return this.url + " - " + i + (Strings.emptyAsNull(getMessage()) != null ? " - ".concat(getMessage()) : "");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format(Locale.US, "HTTP %d response from <%s>: %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.code), this.url.url, this.errorMessage}, 3));
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return BalanceFeedKt$$ExternalSyntheticOutline0.m("Endpoint Call", MapsKt__MapsKt.mapOf(new Pair("HTTP Code", Integer.valueOf(this.code)), new Pair("URL", this.url.encodedPath())));
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return SetsKt___SetsKt.minus(this.targets, ReportedError.ErrorReportingTarget.DATADOG);
    }
}
