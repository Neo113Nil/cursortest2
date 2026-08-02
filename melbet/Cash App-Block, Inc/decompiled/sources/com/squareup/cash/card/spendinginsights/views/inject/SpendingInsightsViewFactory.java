package com.squareup.cash.card.spendinginsights.views.inject;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.spendinginsights.screens.CardActivityListScreen;
import com.squareup.cash.card.spendinginsights.screens.RecurringPaymentInfoScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightsHomeScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightsScreen;
import com.squareup.cash.card.spendinginsights.views.RecurringPaymentInfoSheet;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.profile.views.ProfileUiView;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SpendingInsightsViewFactory implements ViewFactory {
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;
    public final RealCashVibrator vibrator;

    public /* synthetic */ SpendingInsightsViewFactory(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, int i) {
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
        this.vibrator = realCashVibrator;
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        int i = this.$r8$classId;
        RealCashVibrator realCashVibrator = this.vibrator;
        RealImageLoader realImageLoader = this.imageLoader;
        context.getClass();
        switch (i) {
            case 0:
                SpendingInsightsScreen spendingInsightsScreen = screen instanceof SpendingInsightsScreen ? (SpendingInsightsScreen) screen : null;
                ComposeUiView p2PListView = spendingInsightsScreen instanceof SpendingInsightsHomeScreen ? new P2PListView(context, realImageLoader, 10) : spendingInsightsScreen instanceof CardActivityListScreen ? new ProfileUiView(context, realImageLoader, realCashVibrator, 1) : spendingInsightsScreen instanceof SpendingInsightDetailScreen ? new P2PListView(context, realImageLoader, 9) : Intrinsics.areEqual(spendingInsightsScreen, RecurringPaymentInfoScreen.INSTANCE) ? new RecurringPaymentInfoSheet(context) : null;
                if (p2PListView != null) {
                    return new ViewFactory.ScreenView(p2PListView, p2PListView);
                }
                return null;
            default:
                ProfileUiView profileUiView = screen instanceof BlockersScreens.ActivityPickerScreen ? new ProfileUiView(context, realImageLoader, realCashVibrator, 2) : null;
                if (profileUiView != null) {
                    return new ViewFactory.ScreenView(profileUiView, profileUiView);
                }
                return null;
        }
    }
}
