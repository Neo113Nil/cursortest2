package com.squareup.cash.blockers.presenters;

import android.content.Context;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coroutines.Signal;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import net.idrnd.face.iad.capture.internal.o0;

/* loaded from: classes4.dex */
public final class PromotionPanePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.StatusResultScreen args;
    public final RealBlockersHelper blockersHelper;
    public final Context context;
    public final o0 drawerOpener;
    public final FeatureFlagManager featureFlagManager;
    public final Lazy flowStarter;
    public final RealIntentFactory intentFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidNotificationManager notificationManager;
    public final RealProfileManager profileManager;
    public final RealRouter$Factory$Impl routerFactory;
    public final CoroutineScope scope;
    public final Signal signOut;
    public final TransferManager transferManager;
    public final CoroutineContext uiDispatcher;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ClientScenario.values().length];
            try {
                iArr[ClientScenario.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientScenario.ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientScenario.ONBOARDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientScenario.RETURNING_CUSTOMER_LOGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientScenario.PAYMENT_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClientScenario.CHANGE_PASSCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClientScenario.CREATE_PASSCODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClientScenario.RESET_PASSCODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UiAlias.Type.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[AppMessageAction.Action.values().length];
            try {
                iArr3[AppMessageAction.Action.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_BOOST_PICKER_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[AppMessageAction.Action.OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[AppMessageAction.Action.OPEN_URL_AND_DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[AppMessageAction.Action.DISMISS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[AppMessageAction.Action.INITIATE_CLIENT_SCENARIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_ACCOUNT_PROFILE.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_ACTIVITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_THREADED_CUSTOMER_ACTIVITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_PAYMENT_DETAILS.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_BUSINESS_UPSELL.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[AppMessageAction.Action.SHARE.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_INVITATION_SCREEN.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[AppMessageAction.Action.SET_BUSINESS_RATE_PLAN.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_LINK_CARD_SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_DIALOG.ordinal()] = 16;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[AppMessageAction.Action.REGISTER_ALIAS.ordinal()] = 17;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[AppMessageAction.Action.UNREGISTER_ALIAS.ordinal()] = 18;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[AppMessageAction.Action.INITIATE_TRANSFER_TO_STORED_BALANCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_BITCOIN_DRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[AppMessageAction.Action.SHOW_CASH_DRAWER.ordinal()] = 21;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[AppMessageAction.Action.START_SUPPORT_FLOW.ordinal()] = 22;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[AppMessageAction.Action.DRAFT_PAYMENT.ordinal()] = 23;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public PromotionPanePresenter(Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, AppService appService, RealIntentFactory realIntentFactory, Lazy lazy, Signal signal, TransferManager transferManager, RealProfileManager realProfileManager, o0 o0Var, AndroidNotificationManager androidNotificationManager, Context context, CoroutineContext coroutineContext, BlockersScreens.StatusResultScreen statusResultScreen, BetterNavigator.ScreenNavigator screenNavigator, FeatureFlagManager featureFlagManager, RealMoneyNavigatorHelper realMoneyNavigatorHelper, CoroutineScope coroutineScope, RealUuidGenerator realUuidGenerator) {
        this.analytics = analytics;
        this.routerFactory = realRouter$Factory$Impl;
        this.appService = appService;
        this.intentFactory = realIntentFactory;
        this.flowStarter = lazy;
        this.signOut = signal;
        this.transferManager = transferManager;
        this.profileManager = realProfileManager;
        this.drawerOpener = o0Var;
        this.notificationManager = androidNotificationManager;
        this.context = context;
        this.uiDispatcher = coroutineContext;
        this.args = statusResultScreen;
        this.navigator = screenNavigator;
        this.featureFlagManager = featureFlagManager;
        this.scope = coroutineScope;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }
}
