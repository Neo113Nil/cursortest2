package com.squareup.cash.activity.presenters;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.backend.ActivityFeedProducer;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ActivityEmbeddedPresenter$Companion {
    public static ActivityEmbeddedPresenter$Configuration EmbeddedRecentsConfiguration$default(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache, Screen screen, Function0 function0, int i, String str, String str2, ActivityItemEventHandler.Factory factory, ActivityItemPresenter.Factory factory2, ActivitiesManager.Factory factory3, int i2) {
        ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode = ActivityEmbeddedPresenter$RefreshMode.FirstLoadOnly;
        ActivitiesCache inMemory = (i2 & 2) != 0 ? new ActivitiesCache.InMemory() : activitiesCache;
        if ((i2 & 8) != 0) {
            activityEmbeddedPresenter$RefreshMode = ActivityEmbeddedPresenter$RefreshMode.AlwaysOnBack;
        }
        ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode2 = activityEmbeddedPresenter$RefreshMode;
        int i3 = (i2 & 32) != 0 ? 5 : i;
        String str3 = (i2 & 128) != 0 ? null : str;
        String str4 = (i2 & 256) != 0 ? null : str2;
        ActivityItemEventHandler.Factory factory4 = (i2 & 512) != 0 ? null : factory;
        ActivityItemPresenter.Factory factory5 = (i2 & 1024) != 0 ? null : factory2;
        ActivitiesManager.Factory factory6 = (i2 & 2048) != 0 ? null : factory3;
        activityContext.getClass();
        inMemory.getClass();
        return new ActivityEmbeddedPresenter$Configuration(activityContext, inMemory, screen, activityEmbeddedPresenter$RefreshMode2, true, false, function0, i3, false, false, str3, str4, factory4, factory5, factory6, null, 1, 65600);
    }

    public static ActivityEmbeddedPresenter$Configuration FilteredFeedConfiguration$default(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache, Screen screen, boolean z, String str, ActivityItemEventHandler.Factory factory, ActivityItemPresenter.Factory factory2, InvestingStockDetailsPresenter$$ExternalSyntheticLambda1 investingStockDetailsPresenter$$ExternalSyntheticLambda1, ActivityFeedProducer activityFeedProducer, int i) {
        ActivitiesCache inMemory = (i & 2) != 0 ? new ActivitiesCache.InMemory() : activitiesCache;
        ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode = ActivityEmbeddedPresenter$RefreshMode.Never;
        boolean z2 = (i & 16) == 0;
        boolean z3 = (i & 32) == 0;
        boolean z4 = (i & 64) != 0 ? true : z;
        String str2 = (i & 128) != 0 ? null : str;
        ActivityItemEventHandler.Factory factory3 = (i & 512) != 0 ? null : factory;
        ActivityItemPresenter.Factory factory4 = (i & 1024) != 0 ? null : factory2;
        InvestingStockDetailsPresenter$$ExternalSyntheticLambda1 investingStockDetailsPresenter$$ExternalSyntheticLambda12 = (i & 2048) != 0 ? null : investingStockDetailsPresenter$$ExternalSyntheticLambda1;
        ActivityFeedProducer activityFeedProducer2 = (i & 4096) != 0 ? null : activityFeedProducer;
        int i2 = (i & PKIFailureInfo.certRevoked) == 0 ? Integer.MAX_VALUE : 1;
        activityContext.getClass();
        inMemory.getClass();
        return new ActivityEmbeddedPresenter$Configuration(activityContext, inMemory, screen, activityEmbeddedPresenter$RefreshMode, z2, z3, null, Integer.MAX_VALUE, z4, false, str2, null, factory3, factory4, investingStockDetailsPresenter$$ExternalSyntheticLambda12, activityFeedProducer2, i2, 1088);
    }
}
