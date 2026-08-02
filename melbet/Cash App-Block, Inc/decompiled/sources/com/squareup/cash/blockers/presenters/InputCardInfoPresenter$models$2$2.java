package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewEvent;
import com.squareup.cash.cdf.instrument.InstrumentLinkNavigate;
import com.squareup.cash.cdf.instrument.InstrumentLinkReceiveLinkResult;
import com.squareup.cash.cdf.instrument.InstrumentLinkRetry;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.LinkCardRequest;
import com.squareup.protos.franklin.app.LinkCardResponse;
import com.squareup.protos.franklin.common.KeyedCard;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.ProtoDefaults;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import okio.Okio;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class InputCardInfoPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ParcelableSnapshotMutableIntState $clearCardEditor$delegate;
    public final /* synthetic */ InputCardInfoViewEvent $event;
    public final /* synthetic */ MutableState $focusField$delegate;
    public final /* synthetic */ MutableState $isLoading$delegate;
    public final /* synthetic */ Ref$BooleanRef $linkFailed;
    public int I$0;
    public /* synthetic */ Object L$0;
    public ApiResult.Success L$2;
    public Instrument L$3;
    public BlockersData L$6;
    public PaymentInitiatorData L$7;
    public int label;
    public final /* synthetic */ InputCardInfoPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCardInfoPresenter$models$2$2(InputCardInfoPresenter inputCardInfoPresenter, Ref$BooleanRef ref$BooleanRef, InputCardInfoViewEvent inputCardInfoViewEvent, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = inputCardInfoPresenter;
        this.$linkFailed = ref$BooleanRef;
        this.$event = inputCardInfoViewEvent;
        this.$isLoading$delegate = mutableState;
        this.$clearCardEditor$delegate = parcelableSnapshotMutableIntState;
        this.$focusField$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InputCardInfoPresenter$models$2$2 inputCardInfoPresenter$models$2$2 = new InputCardInfoPresenter$models$2$2(this.this$0, this.$linkFailed, this.$event, this.$isLoading$delegate, this.$clearCardEditor$delegate, this.$focusField$delegate, continuation);
        inputCardInfoPresenter$models$2$2.L$0 = obj;
        return inputCardInfoPresenter$models$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InputCardInfoPresenter$models$2$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x023e, code lost:
    
        if (com.squareup.cash.blockers.presenters.InputCardInfoPresenter.access$initiatePayment(r1, r4, r78) == r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b2, code lost:
    
        if (r3 == r8) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r13;
        Object linkCard;
        Object obj2;
        Instrument instrument;
        Instrument instrument2;
        LinkCardResponse.Status status;
        int ordinal;
        BlockersData copy$default;
        PaymentInitiatorData paymentInitiatorData;
        int i;
        Object update;
        int i2;
        String str;
        MoneybotChatScreen moneybotChatScreen;
        InputCardInfoPresenter inputCardInfoPresenter = this.this$0;
        BlockersDataNavigator blockersDataNavigator = inputCardInfoPresenter.blockersNavigator;
        Analytics analytics = inputCardInfoPresenter.analytics;
        ClientScenario clientScenario = inputCardInfoPresenter.clientScenario;
        BetterNavigator.ScreenNavigator screenNavigator = inputCardInfoPresenter.navigator;
        BlockersScreens.InputCardInfoScreen inputCardInfoScreen = inputCardInfoPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        InputCardInfoViewEvent inputCardInfoViewEvent = this.$event;
        MutableState mutableState = this.$isLoading$delegate;
        Ref$BooleanRef ref$BooleanRef = this.$linkFailed;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            mutableState.setValue(Boolean.TRUE);
            analytics.track(new InstrumentLinkNavigate(InputCardInfoHelpersKt.toCdfEntryPoint(clientScenario), InstrumentLinkNavigate.Value.NEXT), null);
            if (ref$BooleanRef.element) {
                analytics.track(new InstrumentLinkRetry(InputCardInfoHelpersKt.toCdfEntryPoint(clientScenario)), null);
            }
            KeyedCard keyedCard = ((InputCardInfoViewEvent.TapNext) inputCardInfoViewEvent).card;
            RequestContext requestContext = inputCardInfoScreen.blockersData.requestContext;
            LinkCardRequest linkCardRequest = new LinkCardRequest(requestContext, keyedCard, requestContext.payment_tokens, null, inputCardInfoScreen.instrumentType, requestContext.transfer_token, Boolean.FALSE, null, null, ByteString.EMPTY);
            AppService appService = inputCardInfoPresenter.appService;
            String str2 = inputCardInfoScreen.blockersData.flowToken;
            this.L$0 = coroutineScope;
            r13 = 1;
            this.label = 1;
            linkCard = appService.linkCard(clientScenario, str2, linkCardRequest, this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    i2 = this.I$0;
                    paymentInitiatorData = this.L$7;
                    copy$default = this.L$6;
                    instrument = this.L$3;
                    SafeTrace.throwOnFailure(obj);
                    i = i2;
                    if (paymentInitiatorData == null) {
                        this.L$0 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i;
                        this.label = 4;
                    } else {
                        Screen next = blockersDataNavigator.getNext(inputCardInfoScreen, copy$default);
                        if (instrument != null && (str = instrument.token) != null) {
                            MoneybotChatScreen moneybotChatScreen2 = next instanceof MoneybotChatScreen ? (MoneybotChatScreen) next : null;
                            if (moneybotChatScreen2 != null) {
                                MoneybotPendingSheet$TransferOptionPicker moneybotPendingSheet$TransferOptionPicker = moneybotChatScreen2.pendingSheet;
                                if (moneybotPendingSheet$TransferOptionPicker == null) {
                                    moneybotPendingSheet$TransferOptionPicker = null;
                                }
                                if (moneybotPendingSheet$TransferOptionPicker == null) {
                                    moneybotChatScreen = moneybotChatScreen2;
                                } else {
                                    TransferOptionPickerSelection transferOptionPickerSelection = new TransferOptionPickerSelection(TransferOptions.DebitCard, str);
                                    String str3 = moneybotPendingSheet$TransferOptionPicker.placeholderKey;
                                    String str4 = moneybotPendingSheet$TransferOptionPicker.renderableKey;
                                    Money money = moneybotPendingSheet$TransferOptionPicker.amount;
                                    List list = moneybotPendingSheet$TransferOptionPicker.transferOptions;
                                    String str5 = moneybotPendingSheet$TransferOptionPicker.title;
                                    String str6 = moneybotPendingSheet$TransferOptionPicker.cta;
                                    boolean z = moneybotPendingSheet$TransferOptionPicker.forceDarkMode;
                                    List list2 = moneybotPendingSheet$TransferOptionPicker.hiddenOptionValues;
                                    boolean z2 = moneybotPendingSheet$TransferOptionPicker.balanceGatingEnabled;
                                    str3.getClass();
                                    money.getClass();
                                    list2.getClass();
                                    moneybotChatScreen = MoneybotChatScreen.copy$default(moneybotChatScreen2, null, new MoneybotPendingSheet$TransferOptionPicker(str3, str4, money, list, str5, str6, transferOptionPickerSelection, z, list2, z2), 31);
                                }
                            } else {
                                moneybotChatScreen = null;
                            }
                            if (moneybotChatScreen != null) {
                                next = moneybotChatScreen;
                            }
                        }
                        if (next instanceof BottomSheetScreen) {
                            screenNavigator.goTo(PaymentScreens$HomeScreens$Home.INSTANCE);
                        }
                        screenNavigator.goTo(next);
                    }
                    mutableState.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                instrument2 = this.L$3;
                obj2 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                instrument = instrument2;
                ApiResult.Success success = (ApiResult.Success) obj2;
                Object obj3 = success.response;
                Object obj4 = success.response;
                status = ((LinkCardResponse) obj3).status;
                if (status == null) {
                    status = ProtoDefaults.LINK_CARD_STATUS;
                }
                ordinal = status.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        inputCardInfoPresenter.analytics.track(new InstrumentLinkReceiveLinkResult(InputCardInfoHelpersKt.toCdfEntryPoint(inputCardInfoPresenter.clientScenario), r3 ? InstrumentLinkReceiveLinkResult.Result.SUCCESS : InstrumentLinkReceiveLinkResult.Result.FAILURE), null);
                        ref$BooleanRef.element = true;
                        BlockersData blockersData = inputCardInfoScreen.blockersData;
                        ResponseContext responseContext = ((LinkCardResponse) obj4).response_context;
                        responseContext.getClass();
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                        String nextBlockerId = updateFromResponseContext.getNextBlockerId();
                        if (nextBlockerId == null || nextBlockerId.equals(inputCardInfoScreen.blockersData.blockerId)) {
                            InputCardInfoPresenter.access$showErrorDialog(inputCardInfoPresenter, (LinkCardResponse) obj4);
                            MutableState mutableState2 = this.$focusField$delegate;
                            mutableState2.setValue(VersionedKt.update((Versioned) mutableState2.getValue(), ((LinkCardResponse) obj4).failure_field));
                        } else {
                            screenNavigator.goTo(blockersDataNavigator.getNext(inputCardInfoScreen, updateFromResponseContext));
                        }
                    } else {
                        if (ordinal != 3) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        inputCardInfoPresenter.analytics.track(new InstrumentLinkReceiveLinkResult(InputCardInfoHelpersKt.toCdfEntryPoint(inputCardInfoPresenter.clientScenario), r3 ? InstrumentLinkReceiveLinkResult.Result.SUCCESS : InstrumentLinkReceiveLinkResult.Result.FAILURE), null);
                        InputCardInfoPresenter.access$showErrorDialog(inputCardInfoPresenter, (LinkCardResponse) obj4);
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$clearCardEditor$delegate;
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                        Okio.boxInt(intValue);
                    }
                    mutableState.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                inputCardInfoPresenter.analytics.track(new InstrumentLinkReceiveLinkResult(InputCardInfoHelpersKt.toCdfEntryPoint(inputCardInfoPresenter.clientScenario), r3 ? InstrumentLinkReceiveLinkResult.Result.SUCCESS : InstrumentLinkReceiveLinkResult.Result.FAILURE), null);
                ref$BooleanRef.element = false;
                BlockersData blockersData2 = inputCardInfoScreen.blockersData;
                ResponseContext responseContext2 = ((LinkCardResponse) obj4).response_context;
                responseContext2.getClass();
                Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                copy$default = BlockersData.copy$default(blockersData2.updateFromResponseContext(responseContext2, false), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, new RedactedString(((InputCardInfoViewEvent.TapNext) inputCardInfoViewEvent).card.security_code), null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -134217729, JpegConstants.COM_MARKER);
                paymentInitiatorData = (PaymentInitiatorData) inputCardInfoScreen.paymentInitiatorData.getValue();
                i = (!inputCardInfoPresenter.appConfigRefreshOnlyWhenOnboarded || PlatformKt.hasOnboardedAccount(inputCardInfoPresenter.sessionManager)) ? 1 : 0;
                if (i != 0) {
                    AppConfigManager appConfigManager = inputCardInfoPresenter.appConfigManager;
                    this.L$0 = null;
                    this.L$2 = null;
                    this.L$3 = instrument;
                    this.L$6 = copy$default;
                    this.L$7 = paymentInitiatorData;
                    this.I$0 = i;
                    this.label = 3;
                    update = ((RealAppConfigManager) appConfigManager).update(false, this);
                    if (update != coroutineSingletons) {
                        i2 = i;
                        i = i2;
                    }
                    return coroutineSingletons;
                }
                if (paymentInitiatorData == null) {
                }
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            linkCard = obj;
            r13 = 1;
        }
        obj2 = (ApiResult) linkCard;
        if (!(obj2 instanceof ApiResult.Success)) {
            ref$BooleanRef.element = r13;
            mutableState.setValue(Boolean.FALSE);
            AndroidStringManager androidStringManager = inputCardInfoPresenter.stringManager;
            obj2.getClass();
            screenNavigator.goTo(new FailureMessageBlockerScreen(inputCardInfoScreen.blockersData, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) obj2, null).message, null, 4));
            return Unit.INSTANCE;
        }
        JobKt.launch$default(coroutineScope, null, null, new InputCardInfoPresenter$models$2$3(inputCardInfoPresenter, null, r13), 3);
        ApiResult.Success success2 = (ApiResult.Success) obj2;
        LinkCardResponse linkCardResponse = (LinkCardResponse) success2.response;
        Instrument instrument3 = linkCardResponse.instrument;
        String str7 = linkCardResponse.passcode_token;
        if (instrument3 != null) {
            AndroidBiometricsStore androidBiometricsStore = inputCardInfoPresenter.biometricsStore;
            String str8 = instrument3.token;
            str8.getClass();
            this.L$0 = null;
            this.L$2 = success2;
            this.L$3 = instrument3;
            this.label = 2;
            if (androidBiometricsStore.write(str8, str7, this) != coroutineSingletons) {
                instrument2 = instrument3;
                instrument = instrument2;
                ApiResult.Success success3 = (ApiResult.Success) obj2;
                Object obj32 = success3.response;
                Object obj42 = success3.response;
                status = ((LinkCardResponse) obj32).status;
                if (status == null) {
                }
                ordinal = status.ordinal();
                if (ordinal != 1) {
                }
            }
            return coroutineSingletons;
        }
        instrument = instrument3;
        ApiResult.Success success32 = (ApiResult.Success) obj2;
        Object obj322 = success32.response;
        Object obj422 = success32.response;
        status = ((LinkCardResponse) obj322).status;
        if (status == null) {
        }
        ordinal = status.ordinal();
        if (ordinal != 1) {
        }
    }
}
