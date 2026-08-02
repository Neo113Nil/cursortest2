package com.squareup.cash.earningstracker.backend.real;

import com.google.android.gms.internal.mlkit_genai_prompt.zzhx;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerFetchError;
import com.squareup.cash.cdf.earningstracker.Timeframe;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.Triple;

/* loaded from: classes6.dex */
public final class RealEarningsTrackerAnalytics {
    public final Analytics analytics;

    public RealEarningsTrackerAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    public final void trackFetchError(DateFilter dateFilter, int i, String str, String str2, boolean z) {
        dateFilter.getClass();
        str.getClass();
        Triple analyticsTimeframeData = zzhx.toAnalyticsTimeframeData(dateFilter);
        this.analytics.track(new EarningsTrackerFetchError((Timeframe) analyticsTimeframeData.first, (Integer) analyticsTimeframeData.second, (Integer) analyticsTimeframeData.third, Integer.valueOf(i), str, str2, Boolean.valueOf(z)), null);
    }
}
