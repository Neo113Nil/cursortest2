package com.squareup.cash.history.payments.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import bo.app.l2$$ExternalSyntheticLambda7;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfilePaymentHistory;
import com.squareup.cash.history.payments.viewmodels.BarColorState;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfileTransactionsBarViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class ProfilePaymentHistoryPresenter implements MoleculePresenter {
    public final ActivitiesCache activitiesCache;
    public final Lazy activityContext$delegate;
    public final Lazy activityEmbeddedPresenter$delegate;
    public final GenericProfileElement.ActivityStatsElement activityStatsElement;
    public final Analytics analytics;
    public final PaymentHistoryScreens$ProfilePaymentHistory args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Screen parentScreen;
    public final AndroidStringManager stringManager;

    public ProfilePaymentHistoryPresenter(BetterNavigator.ScreenNavigator screenNavigator, Screen screen, PaymentHistoryScreens$ProfilePaymentHistory paymentHistoryScreens$ProfilePaymentHistory, GenericProfileElement.ActivityStatsElement activityStatsElement, Analytics analytics, AndroidStringManager androidStringManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivitiesCacheManager realActivitiesCacheManager, CounterpartyPageRequestHandler$Factory$Impl counterpartyPageRequestHandler$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, ProfileActivityItemEventDecorator profileActivityItemEventDecorator) {
        screen.getClass();
        this.navigator = screenNavigator;
        this.parentScreen = screen;
        this.args = paymentHistoryScreens$ProfilePaymentHistory;
        this.activityStatsElement = activityStatsElement;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.activityContext$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new GLSceneScope$$ExternalSyntheticLambda2(19, realActivityTokenFactory, counterpartyPageRequestHandler$Factory$Impl, this));
        this.activitiesCache = RealActivitiesCacheManager.take$default(realActivitiesCacheManager, paymentHistoryScreens$ProfilePaymentHistory.profileId);
        this.activityEmbeddedPresenter$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new l2$$ExternalSyntheticLambda7(realActivityEmbeddedPresenter$Factory$Impl, this, defaultActivityItemEventHandler$Factory$Impl, profileActivityItemEventDecorator, 27));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final ProfilePaymentHistoryViewModel.Data models(Flow flow, Composer composer, int i) {
        Boolean bool;
        Long l;
        Float f;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1033892233);
        PaymentHistoryScreens$ProfilePaymentHistory paymentHistoryScreens$ProfilePaymentHistory = this.args;
        ProfileTransactionsBarViewModel profileTransactionsBarViewModel = 0;
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, (Continuation) profileTransactionsBarViewModel, this, (String) paymentHistoryScreens$ProfilePaymentHistory.profileId.getValue(), 6));
        boolean z = paymentHistoryScreens$ProfilePaymentHistory.isCashCustomer;
        GenericProfileElement.ActivityStatsElement activityStatsElement = this.activityStatsElement;
        if (activityStatsElement != null) {
            GenericProfileElement.ActivityStatsElement.ActivityStats activityStats = activityStatsElement.activity_stats;
            float coerceIn = (activityStats == null || (f = activityStats.percentage_received) == null) ? 0.0f : RangesKt___RangesKt.coerceIn(f.floatValue(), RecyclerView.DECELERATION_RATE, 1.0f);
            float f2 = 1.0f - coerceIn;
            boolean z2 = f2 > coerceIn;
            float f3 = z2 ? f2 : coerceIn;
            if (f3 > RecyclerView.DECELERATION_RATE && f3 < 1.0f) {
                f3 = RangesKt___RangesKt.coerceIn(f3, 0.03f, 0.97f);
            }
            float f4 = f3;
            String str = activityStats != null ? activityStats.total_transactions : null;
            String str2 = str == null ? "" : str;
            String valueOf = (activityStats == null || (l = activityStats.total_transactions_count) == null) ? null : String.valueOf(l.longValue());
            String str3 = valueOf != null ? this.stringManager.get(R.string.total_transaction_label) : str2;
            String str4 = activityStats != null ? activityStats.total_received : null;
            String str5 = str4 == null ? "" : str4;
            String str6 = activityStats != null ? activityStats.total_sent : null;
            profileTransactionsBarViewModel = new ProfileTransactionsBarViewModel(str2, valueOf, str3, str5, str6 == null ? "" : str6, f4, z2, !((activityStats == null || (bool = activityStats.enabled) == null) ? false : bool.booleanValue()) ? BarColorState.DISABLED : (coerceIn != RecyclerView.DECELERATION_RATE || f2 <= RecyclerView.DECELERATION_RATE) ? (coerceIn <= RecyclerView.DECELERATION_RATE || f2 != RecyclerView.DECELERATION_RATE) ? coerceIn > f2 ? BarColorState.MORE_RECEIVED : coerceIn < f2 ? BarColorState.MORE_SENT : BarColorState.DEFAULT : BarColorState.ONLY_RECEIVED : BarColorState.ONLY_SENT);
        } else if (!z) {
            profileTransactionsBarViewModel = new ProfileTransactionsBarViewModel("No Transactions", (String) null, "$0.00", "$0.00", RecyclerView.DECELERATION_RATE, false, BarColorState.DISABLED, 6);
        }
        ProfilePaymentHistoryViewModel.Data data = new ProfilePaymentHistoryViewModel.Data(profileTransactionsBarViewModel, ((RealActivityEmbeddedPresenter) this.activityEmbeddedPresenter$delegate.getValue()).models(gapComposer, 0));
        gapComposer.end(false);
        return data;
    }
}
