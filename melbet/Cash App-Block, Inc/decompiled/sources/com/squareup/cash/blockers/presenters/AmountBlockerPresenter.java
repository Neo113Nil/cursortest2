package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ScientificNumber;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SetAmountRequest$Result$AmountResult;
import com.squareup.protos.franklin.app.SetAmountRequest$Result$PercentageResult;
import com.squareup.protos.franklin.app.SetAmountResponse;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AmountBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.AmountScreen args;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public AmountBlockerPresenter(BlockersScreens.AmountScreen amountScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, AppService appService, Analytics analytics, BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, LocalizedMoneyFormatter.Factory factory) {
        this.args = amountScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.appService = appService;
        this.analytics = analytics;
        this.blockersNavigator = blockersDataNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.moneyFormatter = factory.createNoSymbolCompact();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleHelpSubmission(AmountBlockerPresenter amountBlockerPresenter, BlockerAction.SubmitAction submitAction, ContinuationImpl continuationImpl) {
        AmountBlockerPresenter$handleHelpSubmission$1 amountBlockerPresenter$handleHelpSubmission$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = amountBlockerPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = amountBlockerPresenter.navigator;
        BlockersScreens.AmountScreen amountScreen = amountBlockerPresenter.args;
        BlockersData blockersData = amountScreen.blockersData;
        if (continuationImpl instanceof AmountBlockerPresenter$handleHelpSubmission$1) {
            amountBlockerPresenter$handleHelpSubmission$1 = (AmountBlockerPresenter$handleHelpSubmission$1) continuationImpl;
            int i2 = amountBlockerPresenter$handleHelpSubmission$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                amountBlockerPresenter$handleHelpSubmission$1.label = i2 - PKIFailureInfo.systemUnavail;
                AmountBlockerPresenter$handleHelpSubmission$1 amountBlockerPresenter$handleHelpSubmission$12 = amountBlockerPresenter$handleHelpSubmission$1;
                Object obj = amountBlockerPresenter$handleHelpSubmission$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = amountBlockerPresenter$handleHelpSubmission$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = amountBlockerPresenter.analytics;
                    BlockersData blockersData2 = amountScreen.blockersData;
                    AmountBlockerPresenter$handleHelpSubmission$result$1 amountBlockerPresenter$handleHelpSubmission$result$1 = new AmountBlockerPresenter$handleHelpSubmission$result$1(amountBlockerPresenter, submitAction, null);
                    amountBlockerPresenter$handleHelpSubmission$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, amountBlockerPresenter$handleHelpSubmission$12, null, amountBlockerPresenter$handleHelpSubmission$result$1);
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
                if (apiResult instanceof ApiResult.Success) {
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, androidStringManager.get(R.string.generic_network_error), null, 4));
                } else {
                    ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    String str = responseContext.dialog_message;
                    if (str != null) {
                        screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str, responseContext.dialog_title, 2));
                    } else {
                        screenNavigator.goTo(amountBlockerPresenter.blockersNavigator.getNext(amountScreen, updateFromResponseContext));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        amountBlockerPresenter$handleHelpSubmission$1 = new AmountBlockerPresenter$handleHelpSubmission$1(amountBlockerPresenter, continuationImpl);
        AmountBlockerPresenter$handleHelpSubmission$1 amountBlockerPresenter$handleHelpSubmission$122 = amountBlockerPresenter$handleHelpSubmission$1;
        Object obj2 = amountBlockerPresenter$handleHelpSubmission$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = amountBlockerPresenter$handleHelpSubmission$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSubmission(AmountBlockerPresenter amountBlockerPresenter, SetAmountRequest setAmountRequest, Function0 function0, Function0 function02, ContinuationImpl continuationImpl) {
        AmountBlockerPresenter$handleSubmission$1 amountBlockerPresenter$handleSubmission$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = amountBlockerPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = amountBlockerPresenter.navigator;
        BlockersScreens.AmountScreen amountScreen = amountBlockerPresenter.args;
        if (continuationImpl instanceof AmountBlockerPresenter$handleSubmission$1) {
            amountBlockerPresenter$handleSubmission$1 = (AmountBlockerPresenter$handleSubmission$1) continuationImpl;
            int i2 = amountBlockerPresenter$handleSubmission$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                amountBlockerPresenter$handleSubmission$1.label = i2 - PKIFailureInfo.systemUnavail;
                AmountBlockerPresenter$handleSubmission$1 amountBlockerPresenter$handleSubmission$12 = amountBlockerPresenter$handleSubmission$1;
                Object obj = amountBlockerPresenter$handleSubmission$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = amountBlockerPresenter$handleSubmission$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function0.invoke();
                    Analytics analytics = amountBlockerPresenter.analytics;
                    BlockersData blockersData = amountScreen.blockersData;
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(amountBlockerPresenter, setAmountRequest, continuation, 16);
                    amountBlockerPresenter$handleSubmission$12.L$2 = function02;
                    amountBlockerPresenter$handleSubmission$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, amountBlockerPresenter$handleSubmission$12, null, pagingDataPresenter$collectFrom$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function02 = amountBlockerPresenter$handleSubmission$12.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersData blockersData2 = amountScreen.blockersData;
                    ResponseContext responseContext = ((SetAmountResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(amountBlockerPresenter.blockersNavigator.getNext(amountScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function02.invoke();
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, null, 14));
                }
                return Unit.INSTANCE;
            }
        }
        amountBlockerPresenter$handleSubmission$1 = new AmountBlockerPresenter$handleSubmission$1(amountBlockerPresenter, continuationImpl);
        AmountBlockerPresenter$handleSubmission$1 amountBlockerPresenter$handleSubmission$122 = amountBlockerPresenter$handleSubmission$1;
        Object obj2 = amountBlockerPresenter$handleSubmission$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = amountBlockerPresenter$handleSubmission$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static final SetAmountRequest access$toAmountRequest(AmountBlockerPresenter amountBlockerPresenter, AmountPickerViewEvent amountPickerViewEvent) {
        SetAmountRequest setAmountRequest = new SetAmountRequest(amountBlockerPresenter.args.blockersData.requestContext, (SetAmountRequest$Result$AmountResult) null, 6);
        if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
            return SetAmountRequest.copy$default(setAmountRequest, null, new SetAmountRequest$Result$AmountResult(new SetAmountRequest.AmountResult(((AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent).amount)), null, 5);
        }
        if (!(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(amountPickerViewEvent, "Unexpected picker event: ");
            return null;
        }
        BigDecimal bigDecimal = ((AmountPickerViewEvent$Full$PercentSubmitted) amountPickerViewEvent).amount;
        Long valueOf = Long.valueOf(bigDecimal.unscaledValue().longValue());
        Integer valueOf2 = Integer.valueOf(-bigDecimal.scale());
        ByteString byteString = ByteString.EMPTY;
        return SetAmountRequest.copy$default(setAmountRequest, null, new SetAmountRequest$Result$PercentageResult(new SetAmountRequest.PercentageResult(new ScientificNumber(valueOf, valueOf2, byteString), byteString)), null, 5);
    }

    public static AmountPickerViewModel.Ready.Amount toAmount(BlockersScreens.AmountScreen.Config config, Object obj) {
        if (config instanceof BlockersScreens.AmountScreen.Config.MoneyConfig) {
            obj.getClass();
            return new AmountPickerViewModel.Ready.Amount.MoneyAmount((Money) obj);
        }
        if (!(config instanceof BlockersScreens.AmountScreen.Config.PercentConfig)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        obj.getClass();
        ScientificNumber scientificNumber = (ScientificNumber) obj;
        Long l = scientificNumber.significand;
        l.getClass();
        long longValue = l.longValue();
        Integer num = scientificNumber.magnitude;
        num.getClass();
        BigDecimal valueOf = BigDecimal.valueOf(longValue, -num.intValue());
        valueOf.getClass();
        return new AmountPickerViewModel.Ready.Amount.PercentAmount(valueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        AmountConfig percentConfig;
        boolean z;
        Object ready;
        Money money;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1864530458);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        String str = 0;
        str = 0;
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(10, mutableState, this, flow, (Continuation) str));
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            ready = new AmountPickerViewModel.Loading();
        } else {
            BlockersScreens.AmountScreen amountScreen = this.args;
            String str2 = amountScreen.title;
            BlockersScreens.AmountScreen.Config config = amountScreen.config;
            String str3 = amountScreen.subtitle;
            String str4 = amountScreen.buttonLabel;
            AmountPickerViewModel.Ready.Amount amount = toAmount(config, config.getMinimumAmount());
            AmountPickerViewModel.Ready.Amount amount2 = toAmount(config, config.getMaximumAmount());
            boolean z2 = config instanceof BlockersScreens.AmountScreen.Config.MoneyConfig;
            if (z2) {
                CurrencyCode currencyCode = ((BlockersScreens.AmountScreen.Config.MoneyConfig) config).minimumAmount.currency_code;
                currencyCode.getClass();
                percentConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, 6, 6);
            } else {
                if (!(config instanceof BlockersScreens.AmountScreen.Config.PercentConfig)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                percentConfig = new AmountConfig.PercentConfig(127);
            }
            int totalFractionalDigitCount = percentConfig.getTotalFractionalDigitCount();
            boolean z3 = true;
            if (totalFractionalDigitCount > 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            AmountSelectorWidgetModel amountSelectorWidgetModel = new AmountSelectorWidgetModel(EmptyList.INSTANCE);
            BlockersScreens.AmountScreen.Config.MoneyConfig moneyConfig = z2 ? (BlockersScreens.AmountScreen.Config.MoneyConfig) config : null;
            if (moneyConfig != null && (money = moneyConfig.prefilledAmount) != null) {
                str = this.moneyFormatter.format(money);
            }
            ready = new AmountPickerViewModel.Ready(str2, str3, str4, amount, amount2, z3, null, amountSelectorWidgetModel, null, str, false, amountScreen.helpAction != null ? z : false, null, null, 13632);
        }
        gapComposer.end(false);
        return ready;
    }
}
