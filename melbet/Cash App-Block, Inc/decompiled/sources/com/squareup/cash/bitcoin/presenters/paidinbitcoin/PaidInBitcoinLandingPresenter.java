package com.squareup.cash.bitcoin.presenters.paidinbitcoin;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.navigation.api.RealCashLocalNavigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.screens.PaidInBitcoinLandingScreen;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.cdf.crypto.CryptoAllocatePayrollStartPaychecksAllocationFlow;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.payroll.RealCryptoPayrollProvider;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.directdeposit.navigation.real.RealDirectDepositInboundNavigator$Factory$Impl;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.paychecks.api.v1.AddOrEditAllocationDestinationRequest;
import com.squareup.protos.cash.paychecks.api.v1.AddOrEditAllocationDestinationResponse;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.BitcoinDestination;

/* loaded from: classes5.dex */
public final class PaidInBitcoinLandingPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final PaychecksAppService appService;
    public final PaidInBitcoinLandingScreen args;
    public final RealCryptoPayrollProvider cryptoPayrollProvider;
    public final RealCashLocalNavigator directDepositInboundNavigator;
    public final FlowStarter flowStarter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public PaidInBitcoinLandingPresenter(BetterNavigator.ScreenNavigator screenNavigator, PaidInBitcoinLandingScreen paidInBitcoinLandingScreen, RealCryptoPayrollProvider realCryptoPayrollProvider, AndroidStringManager androidStringManager, Analytics analytics, PaychecksAppService paychecksAppService, FlowStarter flowStarter, RealDirectDepositInboundNavigator$Factory$Impl realDirectDepositInboundNavigator$Factory$Impl) {
        paidInBitcoinLandingScreen.getClass();
        this.navigator = screenNavigator;
        this.args = paidInBitcoinLandingScreen;
        this.cryptoPayrollProvider = realCryptoPayrollProvider;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.appService = paychecksAppService;
        this.flowStarter = flowStarter;
        this.directDepositInboundNavigator = new RealCashLocalNavigator(screenNavigator, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$launchEditAllocation(PaidInBitcoinLandingPresenter paidInBitcoinLandingPresenter, boolean z, ContinuationImpl continuationImpl) {
        PaidInBitcoinLandingPresenter$launchEditAllocation$1 paidInBitcoinLandingPresenter$launchEditAllocation$1;
        int i;
        String str;
        ApiResult apiResult;
        PaidInBitcoinLandingScreen paidInBitcoinLandingScreen = paidInBitcoinLandingPresenter.args;
        BetterNavigator.ScreenNavigator screenNavigator = paidInBitcoinLandingPresenter.navigator;
        if (continuationImpl instanceof PaidInBitcoinLandingPresenter$launchEditAllocation$1) {
            paidInBitcoinLandingPresenter$launchEditAllocation$1 = (PaidInBitcoinLandingPresenter$launchEditAllocation$1) continuationImpl;
            int i2 = paidInBitcoinLandingPresenter$launchEditAllocation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paidInBitcoinLandingPresenter$launchEditAllocation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paidInBitcoinLandingPresenter$launchEditAllocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidInBitcoinLandingPresenter$launchEditAllocation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    paidInBitcoinLandingPresenter.analytics.track(new CryptoAllocatePayrollStartPaychecksAllocationFlow(Boolean.valueOf(z)), null);
                    AddOrEditAllocationDestinationRequest addOrEditAllocationDestinationRequest = new AddOrEditAllocationDestinationRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), new AllocationDestination(new AllocationDestination.Destination.Bitcoin(new BitcoinDestination())));
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    PaychecksAppService paychecksAppService = paidInBitcoinLandingPresenter.appService;
                    paidInBitcoinLandingPresenter$launchEditAllocation$1.L$1 = generateToken;
                    paidInBitcoinLandingPresenter$launchEditAllocation$1.label = 1;
                    Object addOrEditAllocationDestination = paychecksAppService.addOrEditAllocationDestination(generateToken, addOrEditAllocationDestinationRequest, paidInBitcoinLandingPresenter$launchEditAllocation$1);
                    if (addOrEditAllocationDestination == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = generateToken;
                    obj = addOrEditAllocationDestination;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = paidInBitcoinLandingPresenter$launchEditAllocation$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, paidInBitcoinLandingScreen, paidInBitcoinLandingPresenter.stringManager));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FlowStarter flowStarter = paidInBitcoinLandingPresenter.flowStarter;
                    ResponseContext responseContext = ((AddOrEditAllocationDestinationResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startEditPaycheckDistributionFlow(str, responseContext, paidInBitcoinLandingScreen.exitScreen, ColorModel.Bitcoin.INSTANCE));
                }
                return Unit.INSTANCE;
            }
        }
        paidInBitcoinLandingPresenter$launchEditAllocation$1 = new PaidInBitcoinLandingPresenter$launchEditAllocation$1(paidInBitcoinLandingPresenter, continuationImpl);
        Object obj2 = paidInBitcoinLandingPresenter$launchEditAllocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidInBitcoinLandingPresenter$launchEditAllocation$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1086850766);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(this.cryptoPayrollProvider.syncEntityReader.getAllEntitiesFlow(AndroidSyncValueSpecs.CryptoPayrollPreference), 2);
            gapComposer.updateRememberedValue(realGooglePayer$createWallet$$inlined$filter$1);
            rememberedValue = realGooglePayer$createWallet$$inlined$filter$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(flow, (Continuation) null, this, collectAsState, 5));
        Integer num = (Integer) collectAsState.getValue();
        int intValue = (num != null ? num.intValue() : 0) / 100;
        boolean z = intValue > 0;
        boolean z2 = !z;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            Object[] objArr = {Integer.valueOf(intValue)};
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str = new MessageFormat(resources.getString(R.string.paid_in_bitcoin_sell_subtitle_with_percentage)).format(objArr);
            str.getClass();
        } else {
            str = androidStringManager.get(R.string.paid_in_bitcoin_sell_subtitle);
        }
        PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel = new PaidInBitcoinLandingViewModel(str, z ? androidStringManager.get(R.string.paid_in_bitcoin_update_percentage_button) : androidStringManager.get(R.string.paid_in_bitcoin_select_percentage_button), z2);
        gapComposer.end(false);
        return paidInBitcoinLandingViewModel;
    }
}
