package com.squareup.cash.clientrouting.routers.bitcoin;

import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView$1$2$2;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$TextInputResult;
import com.squareup.protos.franklin.common.RequestContext;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class BitkeyAutoWithdrawRouter {
    public final AppService appService;
    public final RealClientScenarioCompleter clientScenarioCompleter;
    public final CoroutineContext ioDispatcher;
    public final Navigator navigator;

    public BitkeyAutoWithdrawRouter(AppService appService, RealClientScenarioCompleter realClientScenarioCompleter, CoroutineContext coroutineContext, Navigator navigator) {
        navigator.getClass();
        this.appService = appService;
        this.clientScenarioCompleter = realClientScenarioCompleter;
        this.ioDispatcher = coroutineContext;
        this.navigator = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitToPlasmaBlocker(BitkeyAutoWithdrawRouter bitkeyAutoWithdrawRouter, String str, String str2, ContinuationImpl continuationImpl) {
        BitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1 bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof BitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1) {
            bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1 = (BitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1) continuationImpl;
            int i2 = bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = bitkeyAutoWithdrawRouter.appService;
                    ClientScenario clientScenario = ClientScenario.PLASMA;
                    SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                    builder.blocker_descriptor_id = "AUTO_WITHDRAW_BITKEY_DEEP_LINK";
                    int i3 = 4;
                    builder.request = new SubmitBlockerRequest$Request$Request$SubmitFormRequest(new SubmitFormRequest(new RequestContext(null, null, "AUTO_WITHDRAW_BITKEY_DEEP_LINK", null, null, null, null, null, 8127), (String) null, CollectionsKt__CollectionsKt.listOf((Object[]) new SubmitFormRequest.ElementResult[]{new SubmitFormRequest.ElementResult("address", new SubmitFormRequest$ElementResult$Result$TextInputResult(new SubmitFormRequest.ElementResult.TextInputResult(CollectionsKt__CollectionsJVMKt.listOf(str))), i3), new SubmitFormRequest.ElementResult(TrackingEventsLoggerImpl.KEY_SESSION_TOKEN, new SubmitFormRequest$ElementResult$Result$TextInputResult(new SubmitFormRequest.ElementResult.TextInputResult(CollectionsKt__CollectionsJVMKt.listOf(str2))), i3)}), 10));
                    SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                    bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1.label = 1;
                    obj = appService.submitBlocker(clientScenario, str2, submitBlockerRequest, bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    Timber.Forest.d("Successfully submitted Bitkey auto-withdraw address", new Object[0]);
                    return obj;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.w("Failed to submit Bitkey auto-withdraw address", new Object[0]);
                    return obj;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1 = new BitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1(bitkeyAutoWithdrawRouter, continuationImpl);
        Object obj2 = bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitkeyAutoWithdrawRouter$submitToPlasmaBlocker$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        if (r0.collect(r2, r6) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.InitiateBitkeyAutoWithdraw initiateBitkeyAutoWithdraw, ContinuationImpl continuationImpl) {
        BitkeyAutoWithdrawRouter$route$1 bitkeyAutoWithdrawRouter$route$1;
        Object obj;
        int i;
        String str;
        ChannelFlowTransformLatest completeClientScenario;
        if (continuationImpl instanceof BitkeyAutoWithdrawRouter$route$1) {
            bitkeyAutoWithdrawRouter$route$1 = (BitkeyAutoWithdrawRouter$route$1) continuationImpl;
            int i2 = bitkeyAutoWithdrawRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitkeyAutoWithdrawRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                BitkeyAutoWithdrawRouter$route$1 bitkeyAutoWithdrawRouter$route$12 = bitkeyAutoWithdrawRouter$route$1;
                obj = bitkeyAutoWithdrawRouter$route$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitkeyAutoWithdrawRouter$route$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = initiateBitkeyAutoWithdraw.address;
                    String str3 = initiateBitkeyAutoWithdraw.sessionToken;
                    if (StringsKt.isBlank(str2) || StringsKt.isBlank(str3)) {
                        Timber.Forest.w("Bitkey auto-withdraw route missing required parameters", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    RealProfileManager$setPhoto$2 realProfileManager$setPhoto$2 = new RealProfileManager$setPhoto$2(this, str2, str3, continuation, 3);
                    bitkeyAutoWithdrawRouter$route$12.L$2 = str3;
                    bitkeyAutoWithdrawRouter$route$12.label = 1;
                    obj = JobKt.withContext(this.ioDispatcher, realProfileManager$setPhoto$2, bitkeyAutoWithdrawRouter$route$12);
                    if (obj != coroutineSingletons) {
                        str = str3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = bitkeyAutoWithdrawRouter$route$12.L$2;
                SafeTrace.throwOnFailure(obj);
                str = str4;
                if (((ApiResult) obj) instanceof ApiResult.Success) {
                    return Unit.INSTANCE;
                }
                completeClientScenario = this.clientScenarioCompleter.completeClientScenario(ClientScenario.PLASMA, (r24 & 2) != 0 ? null : null, new GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen(GrowToolsManagerScreen.Origin.BITCOIN), (r24 & 8) != 0 ? null : null, BlockersData.Flow.SERVER_FLOW, true, (r24 & 64) != 0 ? null : str, (r24 & 128) != 0 ? EmptyList.INSTANCE : null, null, null, false);
                CardModelView$1$2$2 cardModelView$1$2$2 = new CardModelView$1$2$2(this, 18);
                bitkeyAutoWithdrawRouter$route$12.L$2 = null;
                bitkeyAutoWithdrawRouter$route$12.label = 2;
            }
        }
        bitkeyAutoWithdrawRouter$route$1 = new BitkeyAutoWithdrawRouter$route$1(this, continuationImpl);
        BitkeyAutoWithdrawRouter$route$1 bitkeyAutoWithdrawRouter$route$122 = bitkeyAutoWithdrawRouter$route$1;
        obj = bitkeyAutoWithdrawRouter$route$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitkeyAutoWithdrawRouter$route$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((ApiResult) obj) instanceof ApiResult.Success) {
        }
    }
}
