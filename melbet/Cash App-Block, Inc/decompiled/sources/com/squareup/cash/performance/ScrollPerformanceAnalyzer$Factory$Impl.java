package com.squareup.cash.performance;

import android.app.Activity;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.integration.analytics.Analytics;

/* loaded from: classes.dex */
public final class ScrollPerformanceAnalyzer$Factory$Impl {
    public final RealRouter.MetroFactory delegateFactory;

    public ScrollPerformanceAnalyzer$Factory$Impl(RealRouter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final ScrollPerformanceAnalyzer create(PerformanceMeasureScrollPerformance.Element element) {
        RealRouter.MetroFactory metroFactory = this.delegateFactory;
        Activity activity = (Activity) metroFactory.urlRouterFactory.value;
        Analytics analytics = (Analytics) metroFactory.clientRouteRouterFactory.invoke();
        activity.getClass();
        analytics.getClass();
        return new ScrollPerformanceAnalyzer(element, activity, analytics);
    }
}
