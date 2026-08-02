package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafd;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersPlatformPay;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AddMoneyScreen;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AddMoneyRequest;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$AddMoneyRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AddMoneyBlockerPresenter implements MoleculePresenter {
    public final AddMoneyScreen addMoneyScreen;
    public final AppService appService;
    public final BlockersScreens.AddMoneyBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final CurrencyCode currency;
    public final boolean googlePayEnabled;
    public final GooglePayPaymentsClient googlePayPaymentsClient;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public AddMoneyBlockerPresenter(BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, AppService appService, FeatureFlagManager featureFlagManager, GooglePayPaymentsClient googlePayPaymentsClient, BlockersScreens.AddMoneyBlockerScreen addMoneyBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        CurrencyCode currencyCode;
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.appService = appService;
        this.googlePayPaymentsClient = googlePayPaymentsClient;
        this.args = addMoneyBlockerScreen;
        this.navigator = screenNavigator;
        AddMoneyScreen addMoneyScreen = addMoneyBlockerScreen.blocker.add_money_screen;
        addMoneyScreen.getClass();
        this.addMoneyScreen = addMoneyScreen;
        Money money = addMoneyScreen.initial_amount;
        if (money == null || (currencyCode = money.currency_code) == null) {
            Money money2 = addMoneyScreen.min_amount;
            currencyCode = money2 != null ? money2.currency_code : null;
            if (currencyCode == null) {
                Money money3 = addMoneyScreen.max_amount;
                currencyCode = money3 != null ? money3.currency_code : null;
                if (currencyCode == null) {
                    currencyCode = CurrencyCode.USD;
                }
            }
        }
        this.currency = currencyCode;
        this.googlePayEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersPlatformPay.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submit(AddMoneyBlockerPresenter addMoneyBlockerPresenter, Money money, AddMoneyRequest.PaymentMethod paymentMethod, ContinuationImpl continuationImpl) {
        AddMoneyBlockerPresenter$submit$1 addMoneyBlockerPresenter$submit$1;
        int i;
        BetterNavigator.ScreenNavigator screenNavigator;
        Object obj;
        BetterNavigator.ScreenNavigator screenNavigator2 = addMoneyBlockerPresenter.navigator;
        BlockersScreens.AddMoneyBlockerScreen addMoneyBlockerScreen = addMoneyBlockerPresenter.args;
        BlockersData blockersData = addMoneyBlockerScreen.blockersData;
        if (continuationImpl instanceof AddMoneyBlockerPresenter$submit$1) {
            addMoneyBlockerPresenter$submit$1 = (AddMoneyBlockerPresenter$submit$1) continuationImpl;
            int i2 = addMoneyBlockerPresenter$submit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                addMoneyBlockerPresenter$submit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = addMoneyBlockerPresenter$submit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addMoneyBlockerPresenter$submit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    AppService appService = addMoneyBlockerPresenter.appService;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData.flowToken;
                    SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                    String str2 = blockersData.blockerId;
                    str2.getClass();
                    builder.blocker_descriptor_id = str2;
                    screenNavigator = screenNavigator2;
                    builder.request = new SubmitBlockerRequest$Request$Request$AddMoneyRequest(new AddMoneyRequest(null, zzafd.withCurrencyOrDefault(money, addMoneyBlockerPresenter.currency, 0L), paymentMethod, ByteString.EMPTY));
                    SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                    addMoneyBlockerPresenter$submit$1.label = 1;
                    obj2 = appService.submitBlocker(clientScenario, str, submitBlockerRequest, addMoneyBlockerPresenter$submit$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    screenNavigator = screenNavigator2;
                }
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Success)) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) obj).response;
                    ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                    obj = Matcher$$ExternalSyntheticOutline0.m(mergeResponseContexts, mergeResponseContexts);
                } else if (!(obj instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (obj instanceof ApiResult.Success) {
                    BetterNavigator.ScreenNavigator screenNavigator3 = screenNavigator;
                    if (!(obj instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator3.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) obj, addMoneyBlockerScreen, addMoneyBlockerPresenter.stringManager));
                } else {
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) obj).response;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BetterNavigator.ScreenNavigator screenNavigator4 = screenNavigator;
                    screenNavigator4.goTo(addMoneyBlockerPresenter.blockersDataNavigator.getNext(addMoneyBlockerScreen, blockersData.updateFromResponseContext(responseContext, false)));
                }
                return Unit.INSTANCE;
            }
        }
        addMoneyBlockerPresenter$submit$1 = new AddMoneyBlockerPresenter$submit$1(addMoneyBlockerPresenter, continuationImpl);
        Object obj22 = addMoneyBlockerPresenter$submit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addMoneyBlockerPresenter$submit$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Success)) {
        }
        if (obj instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    public final boolean isSubmittable(Money money) {
        Long l = money.amount;
        if (l != null) {
            long longValue = l.longValue();
            Money money2 = this.addMoneyScreen.min_amount;
            Long l2 = money2 != null ? money2.amount : null;
            if (longValue > 0 && (l2 == null || longValue >= l2.longValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1586265720);
        Object rememberedValue = gapComposer.rememberedValue();
        CurrencyCode currencyCode = this.currency;
        AddMoneyScreen addMoneyScreen = this.addMoneyScreen;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(zzafd.withCurrencyOrDefault(addMoneyScreen.initial_amount, currencyCode, 0L));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new AddMoneyBlockerPresenter$models$1$1(this, mutableState3, null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
        boolean z = !((Boolean) mutableState2.getValue()).booleanValue() && isSubmittable((Money) mutableState.getValue());
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.derivedStateOf(new BulletinTileKt$$ExternalSyntheticLambda12(8, this, mutableState3));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        State state = (State) rememberedValue5;
        Updater.LaunchedEffect(gapComposer, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, mutableState, mutableState2, state, 27));
        String str = addMoneyScreen.title;
        str.getClass();
        String str2 = addMoneyScreen.subtitle;
        Money money = (Money) mutableState.getValue();
        Money withCurrencyOrDefault = zzafd.withCurrencyOrDefault(addMoneyScreen.max_amount, currencyCode, 10000000L);
        String str3 = addMoneyScreen.confirmation_button_text;
        str3.getClass();
        AddMoneyViewModel.Keypad keypad = new AddMoneyViewModel.Keypad(str, str2, money, str3, z, (String) state.getValue(), ((String) state.getValue()) != null && z, null, withCurrencyOrDefault, false, null);
        gapComposer.end(false);
        return keypad;
    }
}
