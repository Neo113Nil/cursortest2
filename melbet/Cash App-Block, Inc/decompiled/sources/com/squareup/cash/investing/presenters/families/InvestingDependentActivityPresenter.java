package com.squareup.cash.investing.presenters.families;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.activity.presenters.DependentActivitiesContextKt;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityDisplayCategory;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class InvestingDependentActivityPresenter implements MoleculePresenter {
    public final RealActivityEmbeddedPresenter activityEmbeddedPresenter;
    public final RealDependentBalanceDetailLoggingManager balanceDetailerLogger;
    public final String dependentCustomerToken;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public InvestingDependentActivityPresenter(FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl, AndroidStringManager androidStringManager, RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager, ActivityClientService activityClientService, String str, BetterNavigator.ScreenNavigator screenNavigator, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl) {
        str.getClass();
        this.stringManager = androidStringManager;
        this.balanceDetailerLogger = realDependentBalanceDetailLoggingManager;
        this.dependentCustomerToken = str;
        this.navigator = screenNavigator;
        ActivitiesManager.ActivityContext dependentActivitiesContext$default = DependentActivitiesContextKt.dependentActivitiesContext$default(str, activityClientService, ActivityDisplayCategory.ADC_INVESTING);
        this.activityEmbeddedPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(dependentActivitiesContext$default, familySharedActivityCache$Factory$Impl.create(dependentActivitiesContext$default), null, new RealGooglePayer$$ExternalSyntheticLambda0(this, 24), 0, null, null, null, null, null, 8168));
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1863231192);
        DependentActivityViewModel dependentActivityViewModel = new DependentActivityViewModel(this.activityEmbeddedPresenter.models(gapComposer, 0), this.stringManager.get(R.string.dependent_recent_activity_title));
        gapComposer.end(false);
        return dependentActivityViewModel;
    }
}
