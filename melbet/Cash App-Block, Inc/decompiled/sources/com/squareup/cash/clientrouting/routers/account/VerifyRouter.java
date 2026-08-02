package com.squareup.cash.clientrouting.routers.account;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.account.AccountSignInMagicLinkComplete;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.validation.RealPendingEmailVerification;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlinx.coroutines.channels.ChannelResult;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class VerifyRouter {
    public final FlowStarter flowStarter;
    public final Navigator navigator;
    public final RealPendingEmailVerification pendingEmailVerification;
    public final SessionManager sessionManager;

    public VerifyRouter(FlowStarter flowStarter, Navigator navigator, RealPendingEmailVerification realPendingEmailVerification, SessionManager sessionManager) {
        navigator.getClass();
        this.flowStarter = flowStarter;
        this.navigator = navigator;
        this.pendingEmailVerification = realPendingEmailVerification;
        this.sessionManager = sessionManager;
    }

    public final void route(ClientRoute.VerifyEmail verifyEmail) {
        Screen verifyAliasScreen;
        verifyEmail.getClass();
        if (PlatformKt.getCurrentSessionState(this.sessionManager) instanceof SessionState.Authenticated) {
            return;
        }
        if (this.pendingEmailVerification.codes.mo1159trySendJP2dKIU(verifyEmail.code) instanceof ChannelResult.Failed) {
            RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
            StringPreference stringPreference = realFlowStarter.pendingEmailPreference;
            String string2 = stringPreference.preferences.getString(stringPreference.key, null);
            if (string2 == null) {
                verifyAliasScreen = realFlowStarter.signOut();
            } else {
                verifyAliasScreen = new BlockersScreens.VerifyAliasScreen(FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.ONBOARDING, PaymentScreens$HomeScreens$Home.INSTANCE, null, ClientScenario.ONBOARDING, null, null, null, null, new BadgeKt$$ExternalSyntheticLambda3(string2, 26), 500), BlockersScreens.VerifyAliasScreen.AliasType.EMAIL, new RedactedString(string2), null, new RedactedString(null), null, false, null, null);
            }
            this.navigator.goTo(verifyAliasScreen);
        }
    }

    public final void route(ClientRoute.VerifyMagicLink verifyMagicLink) {
        Screen verifyMagic;
        verifyMagicLink.getClass();
        SessionManager sessionManager = this.sessionManager;
        if (PlatformKt.hasOnboardedAccount(sessionManager) || !(PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Initiated)) {
            return;
        }
        String str = verifyMagicLink.magicLinkToken;
        RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
        String persistedOnboardingFlowToken = realFlowStarter.persistedOnboardingFlowToken();
        if (persistedOnboardingFlowToken == null) {
            Timber.Forest.e(new IllegalStateException("On-boarding token was empty when starting magic flow."));
            realFlowStarter.analytics.track(new AccountSignInMagicLinkComplete(null, AccountSignInMagicLinkComplete.Result.INVALID_FLOW), null);
            verifyMagic = realFlowStarter.signOut();
        } else {
            verifyMagic = new BlockersScreens.VerifyMagic(FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.ONBOARDING, PaymentScreens$HomeScreens$Home.INSTANCE, null, ClientScenario.ONBOARDING, persistedOnboardingFlowToken, null, null, null, null, 980), str);
        }
        this.navigator.goTo(verifyMagic);
    }
}
