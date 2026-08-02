package com.squareup.cash.google.pay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.google.pay.GooglePayProvisioningCompletion;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GooglePayPresenter implements MoleculePresenter {
    public final BlockersScreens.ProvisionGooglePayScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersNavigator;
    public final FlowStarter flowStarter;
    public final RealGooglePayer googlePayer;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final GooglePayProvisioningGateway provisioningGateway;
    public final AndroidStringManager stringManager;

    public GooglePayPresenter(AndroidStringManager androidStringManager, RealGooglePayer realGooglePayer, BlockerFlowListener blockerFlowListener, BlockersDataNavigator blockersDataNavigator, FlowStarter flowStarter, GooglePayProvisioningGateway googlePayProvisioningGateway, CoroutineContext coroutineContext, BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        provisionGooglePayScreen.getClass();
        this.stringManager = androidStringManager;
        this.googlePayer = realGooglePayer;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.blockersNavigator = blockersDataNavigator;
        this.flowStarter = flowStarter;
        this.provisioningGateway = googlePayProvisioningGateway;
        this.ioDispatcher = coroutineContext;
        this.args = provisionGooglePayScreen;
        this.navigator = screenNavigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$reportFailure(GooglePayPresenter googlePayPresenter, DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult, ContinuationImpl continuationImpl) {
        GooglePayPresenter$reportFailure$1 googlePayPresenter$reportFailure$1;
        int i;
        if (continuationImpl instanceof GooglePayPresenter$reportFailure$1) {
            googlePayPresenter$reportFailure$1 = (GooglePayPresenter$reportFailure$1) continuationImpl;
            int i2 = googlePayPresenter$reportFailure$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayPresenter$reportFailure$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = googlePayPresenter$reportFailure$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayPresenter$reportFailure$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!googlePayPresenter.args.reportAllProvisioningFailures) {
                        googlePayPresenter.navigator.goTo(googlePayPresenter.statusResultScreen(R.string.google_pay_default_error_message, StatusResult.Icon.FAILURE));
                        return Boolean.FALSE;
                    }
                    googlePayPresenter$reportFailure$1.label = 1;
                    if (googlePayPresenter.completeProvisioning(provisioningResult, googlePayPresenter$reportFailure$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.TRUE;
            }
        }
        googlePayPresenter$reportFailure$1 = new GooglePayPresenter$reportFailure$1(googlePayPresenter, continuationImpl);
        Object obj3 = googlePayPresenter$reportFailure$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayPresenter$reportFailure$1.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeProvisioning(DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult, Continuation continuation) {
        GooglePayPresenter$completeProvisioning$1 googlePayPresenter$completeProvisioning$1;
        int i;
        GooglePayProvisioningCompletion googlePayProvisioningCompletion;
        Screen statusResultScreen;
        if (continuation instanceof GooglePayPresenter$completeProvisioning$1) {
            googlePayPresenter$completeProvisioning$1 = (GooglePayPresenter$completeProvisioning$1) continuation;
            int i2 = googlePayPresenter$completeProvisioning$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayPresenter$completeProvisioning$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = googlePayPresenter$completeProvisioning$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayPresenter$completeProvisioning$1.label;
                BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    googlePayPresenter$completeProvisioning$1.L$0 = provisioningResult;
                    googlePayPresenter$completeProvisioning$1.label = 1;
                    obj = this.provisioningGateway.complete(provisionGooglePayScreen, provisioningResult, googlePayPresenter$completeProvisioning$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    provisioningResult = googlePayPresenter$completeProvisioning$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                googlePayProvisioningCompletion = (GooglePayProvisioningCompletion) obj;
                if (!(googlePayProvisioningCompletion instanceof GooglePayProvisioningCompletion.Success)) {
                    GooglePayProvisioningCompletion.Success success = (GooglePayProvisioningCompletion.Success) googlePayProvisioningCompletion;
                    if (provisioningResult == DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.USER_CANCELED) {
                        this.blockerFlowAnalytics.onFlowCancelled(provisionGooglePayScreen.blockersData);
                        statusResultScreen = provisionGooglePayScreen.blockersData.exitScreen;
                    } else {
                        statusResultScreen = this.blockersNavigator.getNext(provisionGooglePayScreen, success.blockersData);
                    }
                } else {
                    if (!(googlePayProvisioningCompletion instanceof GooglePayProvisioningCompletion.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    statusResultScreen = provisioningResult == DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.SUCCESS ? statusResultScreen(R.string.google_pay_default_success_message, StatusResult.Icon.SUCCESS) : statusResultScreen(R.string.google_pay_default_error_message, StatusResult.Icon.FAILURE);
                }
                this.navigator.goTo(statusResultScreen);
                return Unit.INSTANCE;
            }
        }
        googlePayPresenter$completeProvisioning$1 = new GooglePayPresenter$completeProvisioning$1(this, continuation);
        Object obj2 = googlePayPresenter$completeProvisioning$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayPresenter$completeProvisioning$1.label;
        BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen2 = this.args;
        if (i != 0) {
        }
        googlePayProvisioningCompletion = (GooglePayProvisioningCompletion) obj2;
        if (!(googlePayProvisioningCompletion instanceof GooglePayProvisioningCompletion.Success)) {
        }
        this.navigator.goTo(statusResultScreen);
        return Unit.INSTANCE;
    }

    /* renamed from: models, reason: collision with other method in class */
    public final void m3561models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-544093771);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GooglePayPresenter$models$1$1(this, null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, i3);
        }
    }

    public final BlockersScreens.StatusResultFullScreen statusResultScreen(int i, StatusResult.Icon icon) {
        AndroidStringManager androidStringManager = this.stringManager;
        StatusResult statusResult = new StatusResult(icon, androidStringManager.get(i), new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, androidStringManager.get(R.string.done), EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
        EmptyList emptyList = EmptyList.INSTANCE;
        BlockersData blockersData = this.args.blockersData;
        return FlowStarter.startStatusResultFlow$default(this.flowStarter, statusResult, emptyList, blockersData.exitScreen, blockersData.clientScenario, null, 48);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final /* bridge */ /* synthetic */ Object models(Flow flow, Composer composer, int i) {
        m3561models(flow, composer, i);
        return Unit.INSTANCE;
    }
}
