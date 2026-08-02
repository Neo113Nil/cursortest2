package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PlaidLinkViewModel;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.instrument.InstrumentLinkAuthenticateInstitution;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.plaid.api.Institution;
import com.squareup.cash.plaid.api.PlaidLinkResult;
import com.squareup.cash.plaid.real.RealPlaidEventListener$events$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.OAuthResolveFlowResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class PlaidLinkPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.PlaidLinkScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersDataNavigator;
    public boolean hasSearched;
    public final Moshi moshi;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Signal signOutSignal;
    public final AndroidStringManager stringManager;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/blockers/presenters/PlaidLinkPresenter$PlaidLinkMetadata", "", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public final /* data */ class PlaidLinkMetadata {
        public final String account_id;
        public final String link_session_id;

        public PlaidLinkMetadata(String str, String str2) {
            this.account_id = str;
            this.link_session_id = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaidLinkMetadata)) {
                return false;
            }
            PlaidLinkMetadata plaidLinkMetadata = (PlaidLinkMetadata) obj;
            return this.account_id.equals(plaidLinkMetadata.account_id) && Intrinsics.areEqual(this.link_session_id, plaidLinkMetadata.link_session_id);
        }

        public final int hashCode() {
            int hashCode = this.account_id.hashCode() * 31;
            String str = this.link_session_id;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("PlaidLinkMetadata(account_id=", this.account_id, ", link_session_id=", this.link_session_id, ")");
        }
    }

    public PlaidLinkPresenter(AppService appService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, BlockerFlowListener blockerFlowListener, Analytics analytics, Moshi moshi, Op.Companion companion, Signal signal, BlockersScreens.PlaidLinkScreen plaidLinkScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.appService = appService;
        this.stringManager = androidStringManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.analytics = analytics;
        this.moshi = moshi;
        this.signOutSignal = signal;
        this.args = plaidLinkScreen;
        this.navigator = screenNavigator;
        OAuthConfig oAuthConfig = plaidLinkScreen.blockersData.bankAccountOauthConfig;
        oAuthConfig.getClass();
        OAuthConfig.FlowType flowType = oAuthConfig.flow_type;
        if (flowType == OAuthConfig.FlowType.PLAID_AUTH || flowType == OAuthConfig.FlowType.PLAID_RELINK) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Unexpected flow type");
        throw null;
    }

    public static void trackInstrumentLink$default(PlaidLinkPresenter plaidLinkPresenter, InstrumentLinkAuthenticateInstitution.Status status, String str, String str2, String str3, ApiResult.Failure failure, String str4, int i) {
        BlockersData.AnalyticsData.Source source;
        String str5 = (i & 2) != 0 ? null : str;
        String str6 = (i & 4) != 0 ? null : str2;
        String str7 = (i & 8) != 0 ? null : str3;
        ApiResult.Failure failure2 = (i & 16) != 0 ? null : failure;
        String str8 = (i & 32) != 0 ? null : str4;
        BlockersData blockersData = plaidLinkPresenter.args.blockersData;
        OAuthConfig oAuthConfig = blockersData.bankAccountOauthConfig;
        oAuthConfig.getClass();
        OAuthConfig.FlowType flowType = oAuthConfig.flow_type;
        Analytics analytics = plaidLinkPresenter.analytics;
        ClientScenario clientScenario = blockersData.clientScenario;
        String name = clientScenario != null ? clientScenario.name() : null;
        String str9 = blockersData.flowToken;
        InstrumentLinkAuthenticateInstitution.FlowType flowType2 = flowType == OAuthConfig.FlowType.PLAID_AUTH ? InstrumentLinkAuthenticateInstitution.FlowType.PLAID_AUTH : InstrumentLinkAuthenticateInstitution.FlowType.PLAID_RELINK;
        String name2 = blockersData.ratePlan.name();
        ApiResult.Failure.HttpFailure httpFailure = failure2 instanceof ApiResult.Failure.HttpFailure ? (ApiResult.Failure.HttpFailure) failure2 : null;
        Integer valueOf = httpFailure != null ? Integer.valueOf(httpFailure.code) : null;
        Boolean valueOf2 = Boolean.valueOf(failure2 instanceof ApiResult.Failure.NetworkFailure);
        if (failure2 == null) {
            valueOf2 = null;
        }
        BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
        analytics.track(new InstrumentLinkAuthenticateInstitution(name, str8, str9, flowType2, str6, str7, str5, valueOf2, name2, valueOf, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName(), status), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleLinkSuccess(PlaidLinkResult.Success success, ContinuationImpl continuationImpl) {
        PlaidLinkPresenter$handleLinkSuccess$1 plaidLinkPresenter$handleLinkSuccess$1;
        int i;
        PlaidLinkResult.Success success2;
        ApiResult apiResult;
        InstrumentLinkAuthenticateInstitution.Status status;
        if (continuationImpl instanceof PlaidLinkPresenter$handleLinkSuccess$1) {
            plaidLinkPresenter$handleLinkSuccess$1 = (PlaidLinkPresenter$handleLinkSuccess$1) continuationImpl;
            int i2 = plaidLinkPresenter$handleLinkSuccess$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                plaidLinkPresenter$handleLinkSuccess$1.label = i2 - PKIFailureInfo.systemUnavail;
                PlaidLinkPresenter$handleLinkSuccess$1 plaidLinkPresenter$handleLinkSuccess$12 = plaidLinkPresenter$handleLinkSuccess$1;
                Object obj = plaidLinkPresenter$handleLinkSuccess$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaidLinkPresenter$handleLinkSuccess$12.label;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentLinkAuthenticateInstitution.Status status2 = InstrumentLinkAuthenticateInstitution.Status.RECEIVE_LINK_RESULT;
                    Institution institution = success.institution;
                    trackInstrumentLink$default(this, status2, null, institution.id, institution.name, null, null, 50);
                    PlaidLinkPresenter$handleLinkSuccess$result$1 plaidLinkPresenter$handleLinkSuccess$result$1 = new PlaidLinkPresenter$handleLinkSuccess$result$1(this, success, null);
                    plaidLinkPresenter$handleLinkSuccess$12.L$0 = success;
                    plaidLinkPresenter$handleLinkSuccess$12.label = 1;
                    obj = StateFlowKt.until(this.signOutSignal, plaidLinkPresenter$handleLinkSuccess$result$1, plaidLinkPresenter$handleLinkSuccess$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    success2 = success;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    success2 = plaidLinkPresenter$handleLinkSuccess$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult != null) {
                    return Unit.INSTANCE;
                }
                boolean z = apiResult instanceof ApiResult.Success;
                BlockersScreens.PlaidLinkScreen plaidLinkScreen = this.args;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                int i3 = 4;
                String str = "Failed to resolve OAuth flow";
                if (z) {
                    OAuthResolveFlowResponse oAuthResolveFlowResponse = (OAuthResolveFlowResponse) ((ApiResult.Success) apiResult).response;
                    OAuthResolveFlowResponse.Status status3 = oAuthResolveFlowResponse.status;
                    status3.getClass();
                    int ordinal = status3.ordinal();
                    if (ordinal == 1) {
                        status = InstrumentLinkAuthenticateInstitution.Status.RESOLVED;
                    } else if (ordinal == 2) {
                        status = InstrumentLinkAuthenticateInstitution.Status.FAILURE;
                        ResponseContext responseContext = oAuthResolveFlowResponse.response_context;
                        responseContext.getClass();
                        BlockersData blockersData = plaidLinkScreen.blockersData;
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        screenNavigator.goTo(this.blockersDataNavigator.getNext(plaidLinkScreen, blockersData.updateFromResponseContext(responseContext, false)));
                    } else if (ordinal == 3) {
                        status = InstrumentLinkAuthenticateInstitution.Status.TOO_MANY_ATTEMPTS;
                    } else {
                        if (ordinal != 4) {
                            Path$$ExternalSyntheticBUOutline0.m(oAuthResolveFlowResponse.status, "Unsupported status: ");
                            return null;
                        }
                        status = InstrumentLinkAuthenticateInstitution.Status.CONCURRENT_MODIFICATION;
                    }
                    str = null;
                    ResponseContext responseContext2 = oAuthResolveFlowResponse.response_context;
                    responseContext2.getClass();
                    BlockersData blockersData2 = plaidLinkScreen.blockersData;
                    Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                    screenNavigator.goTo(this.blockersDataNavigator.getNext(plaidLinkScreen, blockersData2.updateFromResponseContext(responseContext2, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Error resolving oauth flow", new Object[0]);
                    InstrumentLinkAuthenticateInstitution.Status status4 = InstrumentLinkAuthenticateInstitution.Status.ERROR;
                    screenNavigator.goTo(new FailureMessageBlockerScreen(plaidLinkScreen.blockersData, TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult, null).message, objArr == true ? 1 : 0, i3));
                    status = status4;
                }
                Institution institution2 = success2.institution;
                trackInstrumentLink$default(this, status, null, institution2.id, institution2.name, apiResult instanceof ApiResult.Failure ? (ApiResult.Failure) apiResult : null, str, 2);
                return Unit.INSTANCE;
            }
        }
        plaidLinkPresenter$handleLinkSuccess$1 = new PlaidLinkPresenter$handleLinkSuccess$1(this, continuationImpl);
        PlaidLinkPresenter$handleLinkSuccess$1 plaidLinkPresenter$handleLinkSuccess$122 = plaidLinkPresenter$handleLinkSuccess$1;
        Object obj2 = plaidLinkPresenter$handleLinkSuccess$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaidLinkPresenter$handleLinkSuccess$122.label;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult != null) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1221850476);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(PlaidLinkViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Continuation continuation = null;
        CallbackFlowBuilder callbackFlow = FlowKt.callbackFlow(new RealPlaidEventListener$events$1(2, null));
        Updater.LaunchedEffect(gapComposer, callbackFlow, new PasscodePresenter$models$1$2(callbackFlow, continuation, this, 15));
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(21, mutableState, this, flow, continuation));
        PlaidLinkViewModel plaidLinkViewModel = (PlaidLinkViewModel) mutableState.getValue();
        gapComposer.end(false);
        return plaidLinkViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck appService;
        public final Provider blockerFlowAnalytics;
        public final Provider blockersDataNavigator;
        public final LambdaProvider moshi;
        public final DoubleCheck signOutSignal;
        public final LambdaProvider stringManager;

        public MetroFactory(RealReferralManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3) {
            this.blockersDataNavigator = metroFactory;
            this.stringManager = lambdaProvider;
            this.appService = doubleCheck;
            this.analytics = doubleCheck2;
            this.blockerFlowAnalytics = metroFactory2;
            this.moshi = lambdaProvider2;
            this.signOutSignal = doubleCheck3;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, DoubleCheck doubleCheck3, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider2) {
            this.stringManager = lambdaProvider;
            this.appService = doubleCheck;
            this.analytics = doubleCheck2;
            this.blockersDataNavigator = instanceFactory;
            this.signOutSignal = doubleCheck3;
            this.blockerFlowAnalytics = instanceFactory2;
            this.moshi = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, RealGlobalConfigDataSource.MetroFactory metroFactory2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3) {
            this.appService = doubleCheck;
            this.stringManager = lambdaProvider;
            this.blockersDataNavigator = metroFactory;
            this.blockerFlowAnalytics = metroFactory2;
            this.analytics = doubleCheck2;
            this.moshi = lambdaProvider2;
            this.signOutSignal = doubleCheck3;
        }

        public MetroFactory(InstanceFactory instanceFactory, RealMessageSigner.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3) {
            this.blockersDataNavigator = instanceFactory;
            this.blockerFlowAnalytics = metroFactory;
            this.appService = doubleCheck;
            this.analytics = doubleCheck2;
            this.stringManager = lambdaProvider;
            this.moshi = lambdaProvider2;
            this.signOutSignal = doubleCheck3;
        }
    }
}
