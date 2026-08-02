package com.squareup.cash.notifications;

import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealAndroidNotificationSettingsChecker implements NotificationSettingsChecker {
    public final StateFlow activityLifecycleStates;
    public final AndroidNotificationManager notificationManager;
    public final Flow notificationState;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final Provider activityLifecycleStates;
        public final Provider notificationManager;

        public MetroFactory(LambdaProvider lambdaProvider, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory) {
            this.notificationManager = lambdaProvider;
            this.activityLifecycleStates = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) this.notificationManager.invoke();
            StateFlow stateFlow = (StateFlow) this.activityLifecycleStates.invoke();
            androidNotificationManager.getClass();
            stateFlow.getClass();
            return new RealAndroidNotificationSettingsChecker(androidNotificationManager, stateFlow);
        }
    }

    public RealAndroidNotificationSettingsChecker(AndroidNotificationManager androidNotificationManager, StateFlow stateFlow) {
        this.notificationManager = androidNotificationManager;
        this.activityLifecycleStates = stateFlow;
        this.notificationState = FlowKt.distinctUntilChanged(new InviteContactsPresenter$special$$inlined$map$1(new BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1(stateFlow, 4), this, 21));
    }

    public final Flow notificationChannelState(NotificationChannelId notificationChannelId) {
        notificationChannelId.getClass();
        return FlowKt.distinctUntilChanged(new RealActivityInvitePresenter(24, new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.activityLifecycleStates, 13), this, notificationChannelId));
    }
}
