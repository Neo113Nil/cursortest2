package com.squareup.cash.family.familyhub.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.ActivityFormattingResult;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.PaymentHistoryActivityData;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.presenters.PendingRequestActivityState;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityGetRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityGetResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.Serializable;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPendingRequestActivityManager implements PendingRequestActivityManager, HasObservability {
    public final ZiplineActivityItemFormatter activityItemFormatter;
    public final ActivityClientService activityService;
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final PaymentHistoryActivityItemPresenter$Factory$Impl paymentHistoryActivityItemPresenterFactory;
    public final SessionManager sessionManager;

    public RealPendingRequestActivityManager(ZiplineActivityItemFormatter ziplineActivityItemFormatter, PaymentHistoryActivityItemPresenter$Factory$Impl paymentHistoryActivityItemPresenter$Factory$Impl, ActivityClientService activityClientService, SessionManager sessionManager, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.activityItemFormatter = ziplineActivityItemFormatter;
        this.paymentHistoryActivityItemPresenterFactory = paymentHistoryActivityItemPresenter$Factory$Impl;
        this.activityService = activityClientService;
        this.sessionManager = sessionManager;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x001e, B:12:0x0022, B:14:0x0028, B:15:0x002e, B:18:0x0039, B:21:0x0047, B:24:0x0055, B:27:0x0063, B:30:0x0071, B:32:0x0075, B:34:0x0080, B:36:0x008e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #0 {Exception -> 0x007b, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x001e, B:12:0x0022, B:14:0x0028, B:15:0x002e, B:18:0x0039, B:21:0x0047, B:24:0x0055, B:27:0x0063, B:30:0x0071, B:32:0x0075, B:34:0x0080, B:36:0x008e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PaymentHistoryActivityData access$convertToPaymentHistoryActivityData(RealPendingRequestActivityManager realPendingRequestActivityManager, ActivityGetResponse activityGetResponse) {
        PaymentHistoryInputsRow paymentHistoryInputsRow;
        PaymentHistoryInputsRow paymentHistoryInputsRow2;
        UiPayment uiPayment;
        UiCustomer uiCustomer;
        UiCustomer uiCustomer2;
        ActivityItemGlobalId activityItemGlobalId;
        String str;
        FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(activityGetResponse, familyParsingErrorFactory, realPendingRequestActivityManager);
            ActivityRow activityRow = (ActivityRow) protoValidationScope.reportIfNullAndContinue("activityRow", (String) null, activityGetResponse.activityRow);
            if (activityRow != null) {
                ActivityRow.Body body = activityRow.body;
                if (body != null) {
                    ActivityRow.Body.PaymentHistoryInputsRow paymentHistoryInputsRow3 = body instanceof ActivityRow.Body.PaymentHistoryInputsRow ? (ActivityRow.Body.PaymentHistoryInputsRow) body : null;
                    if (paymentHistoryInputsRow3 != null) {
                        paymentHistoryInputsRow = paymentHistoryInputsRow3.getValue();
                        paymentHistoryInputsRow2 = (PaymentHistoryInputsRow) protoValidationScope.reportIfNullAndContinue("activityRow.body.payment_history_inputs_row", (String) null, paymentHistoryInputsRow);
                        if (paymentHistoryInputsRow2 != null && (uiPayment = (UiPayment) protoValidationScope.reportIfNullAndContinue("payment_history_inputs_row.payment", (String) null, paymentHistoryInputsRow2.payment)) != null && (uiCustomer = (UiCustomer) protoValidationScope.reportIfNullAndContinue("payment_history_inputs_row.sender", (String) null, paymentHistoryInputsRow2.sender)) != null && (uiCustomer2 = (UiCustomer) protoValidationScope.reportIfNullAndContinue("payment_history_inputs_row.recipient", (String) null, paymentHistoryInputsRow2.recipient)) != null && (activityItemGlobalId = (ActivityItemGlobalId) protoValidationScope.reportIfNullAndContinue("activityRow.activity_item_global_id", (String) null, activityRow.activity_item_global_id)) != null) {
                            Long l = activityRow.version;
                            long longValue = l == null ? l.longValue() : 0L;
                            str = (String) protoValidationScope.reportIfNullAndContinue("activityRow.row_id", (String) null, activityRow.row_id);
                            if (str != null) {
                                return new PaymentHistoryActivityData(longValue, activityItemGlobalId, null, activityRow.activity_row_section, uiCustomer, uiCustomer2, uiPayment, str, CollectionsKt.toSet(activityRow.product_classifiers), false);
                            }
                        }
                    }
                }
                paymentHistoryInputsRow = null;
                paymentHistoryInputsRow2 = (PaymentHistoryInputsRow) protoValidationScope.reportIfNullAndContinue("activityRow.body.payment_history_inputs_row", (String) null, paymentHistoryInputsRow);
                if (paymentHistoryInputsRow2 != null) {
                    Long l2 = activityRow.version;
                    long longValue2 = l2 == null ? l2.longValue() : 0L;
                    str = (String) protoValidationScope.reportIfNullAndContinue("activityRow.row_id", (String) null, activityRow.row_id);
                    if (str != null) {
                    }
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ActivityGetResponse.class), familyParsingErrorFactory, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$fetchActivity(RealPendingRequestActivityManager realPendingRequestActivityManager, String str, ContinuationImpl continuationImpl) {
        RealPendingRequestActivityManager$fetchActivity$1 realPendingRequestActivityManager$fetchActivity$1;
        int i;
        ApiResult.Success success;
        if (continuationImpl instanceof RealPendingRequestActivityManager$fetchActivity$1) {
            realPendingRequestActivityManager$fetchActivity$1 = (RealPendingRequestActivityManager$fetchActivity$1) continuationImpl;
            int i2 = realPendingRequestActivityManager$fetchActivity$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPendingRequestActivityManager$fetchActivity$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPendingRequestActivityManager$fetchActivity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPendingRequestActivityManager$fetchActivity$1.label;
                String str2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityToken activityToken = new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountToken(realPendingRequestActivityManager.sessionManager), str2, 12);
                    int i3 = 4;
                    ActivityGetRequest activityGetRequest = new ActivityGetRequest(new ActivityItemGlobalId(new ActivityItemGlobalId.ActivityId.ActivityItemId(new ActivityItemId(str, ActivityItemType.SPONSOR_PAYMENT_APPROVAL, i3)), activityToken, i3), activityToken, ActivityScope.MY_ACTIVITY);
                    ActivityClientService activityClientService = realPendingRequestActivityManager.activityService;
                    realPendingRequestActivityManager$fetchActivity$1.label = 1;
                    obj = activityClientService.activityGet(activityGetRequest, realPendingRequestActivityManager$fetchActivity$1);
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
                success = !(obj instanceof ApiResult.Success) ? (ApiResult.Success) obj : null;
                if (success == null) {
                    return (ActivityGetResponse) success.response;
                }
                return null;
            }
        }
        realPendingRequestActivityManager$fetchActivity$1 = new RealPendingRequestActivityManager$fetchActivity$1(realPendingRequestActivityManager, continuationImpl);
        Object obj2 = realPendingRequestActivityManager$fetchActivity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPendingRequestActivityManager$fetchActivity$1.label;
        String str22 = null;
        if (i != 0) {
        }
        if (!(obj2 instanceof ApiResult.Success)) {
        }
        if (success == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$formatActivityData(RealPendingRequestActivityManager realPendingRequestActivityManager, PaymentHistoryActivityData paymentHistoryActivityData, ContinuationImpl continuationImpl) {
        RealPendingRequestActivityManager$formatActivityData$1 realPendingRequestActivityManager$formatActivityData$1;
        int i;
        ActivityFormattingResult activityFormattingResult;
        if (continuationImpl instanceof RealPendingRequestActivityManager$formatActivityData$1) {
            realPendingRequestActivityManager$formatActivityData$1 = (RealPendingRequestActivityManager$formatActivityData$1) continuationImpl;
            int i2 = realPendingRequestActivityManager$formatActivityData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPendingRequestActivityManager$formatActivityData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPendingRequestActivityManager$formatActivityData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPendingRequestActivityManager$formatActivityData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ZiplineActivityItemFormatter ziplineActivityItemFormatter = realPendingRequestActivityManager.activityItemFormatter;
                    realPendingRequestActivityManager$formatActivityData$1.label = 1;
                    obj = ZiplineActivityItemFormatter.format$default(ziplineActivityItemFormatter, paymentHistoryActivityData, realPendingRequestActivityManager$formatActivityData$1);
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
                activityFormattingResult = (ActivityFormattingResult) obj;
                if (activityFormattingResult instanceof FormattedPaymentHistoryActivityItem) {
                    return null;
                }
                return (FormattedPaymentHistoryActivityItem) activityFormattingResult;
            }
        }
        realPendingRequestActivityManager$formatActivityData$1 = new RealPendingRequestActivityManager$formatActivityData$1(realPendingRequestActivityManager, continuationImpl);
        Object obj2 = realPendingRequestActivityManager$formatActivityData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPendingRequestActivityManager$formatActivityData$1.label;
        if (i != 0) {
        }
        activityFormattingResult = (ActivityFormattingResult) obj2;
        if (activityFormattingResult instanceof FormattedPaymentHistoryActivityItem) {
        }
    }

    public final UiCallbackModel createActivityUiCallbackModel(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, final BetterNavigator.ScreenNavigator screenNavigator, final Screen screen, final String str, final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, final RealRouter$Factory$Impl realRouter$Factory$Impl, GapComposer gapComposer) {
        formattedPaymentHistoryActivityItem.getClass();
        screen.getClass();
        realRouter$Factory$Impl.getClass();
        gapComposer.startReplaceGroup(-641357389);
        ActivityItemEventHandler.Factory factory = new ActivityItemEventHandler.Factory() { // from class: com.squareup.cash.family.familyhub.presenters.RealPendingRequestActivityManager$$ExternalSyntheticLambda0
            @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler.Factory
            public final ActivityItemEventHandler create(Navigator navigator, Function1 function1) {
                navigator.getClass();
                DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl2 = DefaultActivityItemEventHandler$Factory$Impl.this;
                BetterNavigator.ScreenNavigator screenNavigator2 = screenNavigator;
                final DefaultActivityItemEventHandler create = defaultActivityItemEventHandler$Factory$Impl2.create((Navigator) screenNavigator2, function1);
                final RealRouter create$1 = realRouter$Factory$Impl.create$1(screenNavigator2);
                final String str2 = str;
                final Screen screen2 = screen;
                return new ActivityItemEventHandler() { // from class: com.squareup.cash.family.familyhub.presenters.RealPendingRequestActivityManager$$ExternalSyntheticLambda1
                    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler
                    public final Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
                        String str3;
                        activityItemViewModel.getClass();
                        activityItemViewEvent.getClass();
                        activityItem.getClass();
                        boolean equals = activityItemViewEvent.equals(ActivityItemViewEvent.ItemClicked.INSTANCE);
                        DefaultActivityItemEventHandler defaultActivityItemEventHandler = create;
                        if ((equals || (activityItemViewEvent instanceof ActivityItemViewEvent.ButtonClicked)) && (str3 = str2) != null) {
                            Screen screen3 = screen2;
                            create$1.route(new RoutingParams(screen3, null, screen3, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str3);
                            return new StartedLazily$command$$inlined$unsafeFlow$1(new ActivityItemCallbackEvent[0], 4);
                        }
                        return defaultActivityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem);
                    }
                };
            }
        };
        boolean changed = gapComposer.changed(formattedPaymentHistoryActivityItem);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = this.paymentHistoryActivityItemPresenterFactory.create((Navigator) screenNavigator, (ActivityItem) formattedPaymentHistoryActivityItem, new ActivityItemPresentationContext(ActivityItemOrigin.MERCHANT_PROFILE, 0, screen, ActivityScope.SPONSORED_ACCOUNT, new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, "token", (String) null, 12), 1), factory, (Function1) null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        UiCallbackModel models = ((PaymentHistoryActivityItemPresenter) rememberedValue).models(gapComposer);
        gapComposer.end(false);
        return models;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    public final PendingRequestActivityState rememberPendingRequestActivityState(String str, String str2, GapComposer gapComposer) {
        String str3;
        String str4;
        gapComposer.startReplaceGroup(-2106245991);
        boolean changed = gapComposer.changed(str) | gapComposer.changed(str2);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (changed || rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(str == null ? PendingRequestActivityState.Failed.INSTANCE : PendingRequestActivityState.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changed2 = gapComposer.changed(str) | gapComposer.changed(mutableState) | gapComposer.changedInstance(this) | gapComposer.changed(str2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == obj) {
            str3 = str;
            str4 = str2;
            Object realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1(str3, this, str4, mutableState, null, 14);
            gapComposer.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
            rememberedValue2 = realFidesmoClient$observeDeviceState$1;
        } else {
            str3 = str;
            str4 = str2;
        }
        Updater.LaunchedEffect(str3, str4, (Function2) rememberedValue2, gapComposer);
        PendingRequestActivityState pendingRequestActivityState = (PendingRequestActivityState) mutableState.getValue();
        gapComposer.end(false);
        return pendingRequestActivityState;
    }
}
