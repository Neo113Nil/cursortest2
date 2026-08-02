package com.squareup.cash.investing.presenters.stockdetails;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.afterpayapplet.presenters.FilteredActivitiesManager;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager;

/* loaded from: classes5.dex */
public final /* synthetic */ class InvestingStockDetailsPresenter$$ExternalSyntheticLambda1 implements ActivitiesManager.Factory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ InvestingStockDetailsPresenter$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.Factory
    public final ActivitiesManager create(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                RealInvestingActivitiesManager realInvestingActivitiesManager = (RealInvestingActivitiesManager) obj;
                activityContext.getClass();
                activitiesCache.getClass();
                return realInvestingActivitiesManager;
            default:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj;
                activityContext.getClass();
                activitiesCache.getClass();
                return new FilteredActivitiesManager(((ActivitiesManager.Factory) localHomePresenter.localHomeGeoPresenterFactory).create(activityContext, activitiesCache), ((AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) localHomePresenter.syncer).orderActivityType);
        }
    }
}
