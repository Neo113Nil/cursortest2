package com.squareup.cash.activity.presenters;

import app.cash.badging.api.Badger2;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.RealImageLoader$execute$result$1;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.offline.OfflineFormattedActivityItem;
import com.squareup.cash.activity.backend.offline.OfflinePaymentActivityItem;
import com.squareup.cash.activity.backend.offline.OfflineTransferActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentActionCompletionDispatcher;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.treehouse.ActivityTreehouseCompatibility$Method;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class DefaultActivityItemEventHandler implements ActivityItemEventHandler {
    public static final Set ActionsForCompletion;
    public static final Set ActionsNeedingSpinner;
    public static final Set InvestingItemTypes = ArraysKt___ArraysKt.toSet(new ActivityItemType[]{ActivityItemType.INVESTMENT_ORDER, ActivityItemType.INVESTING_AUTOMATION_EXECUTION, ActivityItemType.INVESTMENT_DIVIDEND, ActivityItemType.INVESTMENT_CORRECTION, ActivityItemType.INVESTMENT_CORPORATE_ACTION});
    public final RealActivitiesCacheManager activitiesCacheManager;
    public final ActivityAnalyticsService activityAnalyticsService;
    public final ActivityDataBridge activityDataBridge;
    public final ActivityPaymentManager2 activityPaymentManager2;
    public final HostActivityDataBridge activityTreehouseCompatibility;
    public Job badgeClearingJob;
    public final Badger2 badger;
    public final FeatureFlagManager featureFlagManager;
    public final Function1 feedCallback;
    public final CoroutineContext ioDispatcher;
    public final Navigator navigator;
    public final RealPaymentActionCompletionDispatcher paymentActionCompletionDispatcher;
    public final PaymentManager paymentManager;
    public final RealReactionManager reactionManager;
    public final RealRouter router;
    public final CoroutineScope scope;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentHistoryButton.ButtonAction.values().length];
            try {
                iArr[PaymentHistoryButton.ButtonAction.ADD_REACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PaymentHistoryButton.ButtonAction buttonAction = PaymentHistoryButton.ButtonAction.CONFIRM;
        PaymentHistoryButton.ButtonAction buttonAction2 = PaymentHistoryButton.ButtonAction.CANCEL;
        PaymentHistoryButton.ButtonAction buttonAction3 = PaymentHistoryButton.ButtonAction.PASSCODE_CONFIRMATION;
        PaymentHistoryButton.ButtonAction buttonAction4 = PaymentHistoryButton.ButtonAction.LINK_CARD;
        PaymentHistoryButton.ButtonAction buttonAction5 = PaymentHistoryButton.ButtonAction.VERIFY_IDENTITY;
        PaymentHistoryButton.ButtonAction buttonAction6 = PaymentHistoryButton.ButtonAction.COMPLETE_SCENARIO_PLAN;
        ActionsNeedingSpinner = ArraysKt___ArraysKt.toSet(new PaymentHistoryButton.ButtonAction[]{buttonAction, buttonAction2, buttonAction3, buttonAction4, buttonAction5, buttonAction6, PaymentHistoryButton.ButtonAction.REFUND, PaymentHistoryButton.ButtonAction.COMPLETE_CLIENT_SCENARIO, PaymentHistoryButton.ButtonAction.BITCOIN_DEPOSIT_REVERSAL, PaymentHistoryButton.ButtonAction.CANCEL_INVESTMENT_ORDER, PaymentHistoryButton.ButtonAction.MAKE_LOAN_PAYMENT, PaymentHistoryButton.ButtonAction.SKIP_LOAN_PAYMENT, PaymentHistoryButton.ButtonAction.CANCEL_RECURRING_PURCHASE, PaymentHistoryButton.ButtonAction.ACCEPT_CRYPTO_PAYMENT, PaymentHistoryButton.ButtonAction.CANCEL_CRYPTO_ORDER});
        ActionsForCompletion = ArraysKt___ArraysKt.toSet(new PaymentHistoryButton.ButtonAction[]{buttonAction, buttonAction3, buttonAction4, buttonAction5, buttonAction6});
    }

    public DefaultActivityItemEventHandler(Navigator navigator, Function1 function1, RealRouter$Factory$Impl realRouter$Factory$Impl, ActivityPaymentManager2 activityPaymentManager2, Badger2 badger2, PaymentManager paymentManager, RealFlowTokenGenerator realFlowTokenGenerator, RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher, RealReactionManager realReactionManager, CoroutineScope coroutineScope, CoroutineContext coroutineContext, ActivityDataBridge activityDataBridge, HostActivityDataBridge hostActivityDataBridge, ActivityAnalyticsService activityAnalyticsService, FeatureFlagManager featureFlagManager, RealActivitiesCacheManager realActivitiesCacheManager) {
        navigator.getClass();
        this.navigator = navigator;
        this.feedCallback = function1;
        this.activityPaymentManager2 = activityPaymentManager2;
        this.badger = badger2;
        this.paymentManager = paymentManager;
        this.paymentActionCompletionDispatcher = realPaymentActionCompletionDispatcher;
        this.reactionManager = realReactionManager;
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
        this.activityDataBridge = activityDataBridge;
        this.activityTreehouseCompatibility = hostActivityDataBridge;
        this.activityAnalyticsService = activityAnalyticsService;
        this.featureFlagManager = featureFlagManager;
        this.activitiesCacheManager = realActivitiesCacheManager;
        this.router = realRouter$Factory$Impl.create$1(navigator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0066, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r12)._channel.send(r13, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$avatarClicked(DefaultActivityItemEventHandler defaultActivityItemEventHandler, ActivityItemViewModel activityItemViewModel, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, ProducerScope producerScope, ContinuationImpl continuationImpl) {
        DefaultActivityItemEventHandler$avatarClicked$1 defaultActivityItemEventHandler$avatarClicked$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ActivityItemViewModel activityItemViewModel2;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2;
        String str;
        if (continuationImpl instanceof DefaultActivityItemEventHandler$avatarClicked$1) {
            defaultActivityItemEventHandler$avatarClicked$1 = (DefaultActivityItemEventHandler$avatarClicked$1) continuationImpl;
            int i2 = defaultActivityItemEventHandler$avatarClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultActivityItemEventHandler$avatarClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultActivityItemEventHandler$avatarClicked$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultActivityItemEventHandler$avatarClicked$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual(formattedPaymentHistoryActivityItem.getPaymentHistoryData().is_tap_on_avatar_disabled, Boolean.TRUE)) {
                        return Unit.INSTANCE;
                    }
                    ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent = ActivityItemCallbackEvent.AnalyticsEvent.AvatarTapped;
                    defaultActivityItemEventHandler$avatarClicked$1.L$0 = activityItemViewModel;
                    defaultActivityItemEventHandler$avatarClicked$1.L$1 = formattedPaymentHistoryActivityItem;
                    defaultActivityItemEventHandler$avatarClicked$1.L$2 = producerScope;
                    defaultActivityItemEventHandler$avatarClicked$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        formattedPaymentHistoryActivityItem2 = defaultActivityItemEventHandler$avatarClicked$1.L$1;
                        activityItemViewModel2 = defaultActivityItemEventHandler$avatarClicked$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str = formattedPaymentHistoryActivityItem2.getPaymentHistoryData().avatar_url_to_open;
                        if (str == null) {
                            ActivityItemPresentationContext activityItemPresentationContext = activityItemViewModel2.presentationContext;
                            RealRouter realRouter = defaultActivityItemEventHandler.router;
                            Screen screen = activityItemPresentationContext.screen;
                            realRouter.route(new RoutingParams(screen, null, screen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                            return Unit.INSTANCE;
                        }
                        if (!formattedPaymentHistoryActivityItem2.isOffline() && ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem2) != ActivityItemType.NEW_DEVICE_LOGIN && ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem2) != ActivityItemType.TTP_ACTIVITY) {
                            JobKt.launch$default(defaultActivityItemEventHandler.scope, null, null, new DefaultActivityItemEventHandler$avatarClicked$2(formattedPaymentHistoryActivityItem2, defaultActivityItemEventHandler, (Continuation) null), 3);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    producerScope = defaultActivityItemEventHandler$avatarClicked$1.L$2;
                    formattedPaymentHistoryActivityItem = defaultActivityItemEventHandler$avatarClicked$1.L$1;
                    activityItemViewModel = defaultActivityItemEventHandler$avatarClicked$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                defaultActivityItemEventHandler$avatarClicked$1.L$0 = activityItemViewModel;
                defaultActivityItemEventHandler$avatarClicked$1.L$1 = formattedPaymentHistoryActivityItem;
                defaultActivityItemEventHandler$avatarClicked$1.L$2 = null;
                defaultActivityItemEventHandler$avatarClicked$1.label = 2;
                if (((ProducerCoroutine) producerScope)._channel.send(ActivityItemCallbackEvent.DismissBadge.INSTANCE, defaultActivityItemEventHandler$avatarClicked$1) != coroutineSingletons) {
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem3 = formattedPaymentHistoryActivityItem;
                    activityItemViewModel2 = activityItemViewModel;
                    formattedPaymentHistoryActivityItem2 = formattedPaymentHistoryActivityItem3;
                    str = formattedPaymentHistoryActivityItem2.getPaymentHistoryData().avatar_url_to_open;
                    if (str == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        defaultActivityItemEventHandler$avatarClicked$1 = new DefaultActivityItemEventHandler$avatarClicked$1(defaultActivityItemEventHandler, continuationImpl);
        Object obj2 = defaultActivityItemEventHandler$avatarClicked$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultActivityItemEventHandler$avatarClicked$1.label;
        if (i != 0) {
        }
        defaultActivityItemEventHandler$avatarClicked$1.L$0 = activityItemViewModel;
        defaultActivityItemEventHandler$avatarClicked$1.L$1 = formattedPaymentHistoryActivityItem;
        defaultActivityItemEventHandler$avatarClicked$1.L$2 = null;
        defaultActivityItemEventHandler$avatarClicked$1.label = 2;
        if (((ProducerCoroutine) producerScope)._channel.send(ActivityItemCallbackEvent.DismissBadge.INSTANCE, defaultActivityItemEventHandler$avatarClicked$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011c, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r5)._channel.send(r0, r7) == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011f, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013e, code lost:
    
        if (r0.join(r7) == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r0)._channel.send(r2, r7) == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r0)._channel.send(r2, r7) == r8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$buttonClicked(DefaultActivityItemEventHandler defaultActivityItemEventHandler, ActivityItemViewModel activityItemViewModel, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, PaymentHistoryButton paymentHistoryButton, ProducerScope producerScope, ContinuationImpl continuationImpl) {
        DefaultActivityItemEventHandler$buttonClicked$1 defaultActivityItemEventHandler$buttonClicked$1;
        int i;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2;
        PaymentHistoryButton paymentHistoryButton2;
        ActivityItemViewModel activityItemViewModel2;
        ActivityItemViewModel activityItemViewModel3;
        PaymentHistoryButton paymentHistoryButton3;
        PaymentHistoryButton.ButtonAction buttonAction;
        PaymentHistoryButton paymentHistoryButton4;
        Function1 function1;
        ProducerScope producerScope2 = producerScope;
        if (continuationImpl instanceof DefaultActivityItemEventHandler$buttonClicked$1) {
            defaultActivityItemEventHandler$buttonClicked$1 = (DefaultActivityItemEventHandler$buttonClicked$1) continuationImpl;
            int i2 = defaultActivityItemEventHandler$buttonClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultActivityItemEventHandler$buttonClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                DefaultActivityItemEventHandler$buttonClicked$1 defaultActivityItemEventHandler$buttonClicked$12 = defaultActivityItemEventHandler$buttonClicked$1;
                Object obj = defaultActivityItemEventHandler$buttonClicked$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultActivityItemEventHandler$buttonClicked$12.label;
                Set set = ActionsNeedingSpinner;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent = ActivityItemCallbackEvent.AnalyticsEvent.ButtonTapped;
                        defaultActivityItemEventHandler$buttonClicked$12.L$0 = activityItemViewModel;
                        formattedPaymentHistoryActivityItem2 = formattedPaymentHistoryActivityItem;
                        defaultActivityItemEventHandler$buttonClicked$12.L$1 = formattedPaymentHistoryActivityItem2;
                        paymentHistoryButton2 = paymentHistoryButton;
                        defaultActivityItemEventHandler$buttonClicked$12.L$2 = paymentHistoryButton2;
                        defaultActivityItemEventHandler$buttonClicked$12.L$3 = producerScope2;
                        defaultActivityItemEventHandler$buttonClicked$12.label = 1;
                        if (((ProducerCoroutine) producerScope2)._channel.send(analyticsEvent, defaultActivityItemEventHandler$buttonClicked$12) != coroutineSingletons) {
                            activityItemViewModel2 = activityItemViewModel;
                            defaultActivityItemEventHandler$buttonClicked$12.L$0 = activityItemViewModel2;
                            defaultActivityItemEventHandler$buttonClicked$12.L$1 = formattedPaymentHistoryActivityItem2;
                            defaultActivityItemEventHandler$buttonClicked$12.L$2 = paymentHistoryButton2;
                            defaultActivityItemEventHandler$buttonClicked$12.L$3 = producerScope2;
                            defaultActivityItemEventHandler$buttonClicked$12.label = 2;
                            if (((ProducerCoroutine) producerScope2)._channel.send(ActivityItemCallbackEvent.DismissBadge.INSTANCE, defaultActivityItemEventHandler$buttonClicked$12) != coroutineSingletons) {
                                PaymentHistoryButton paymentHistoryButton5 = paymentHistoryButton2;
                                activityItemViewModel3 = activityItemViewModel2;
                                paymentHistoryButton3 = paymentHistoryButton5;
                                if (CollectionsKt.contains(set, paymentHistoryButton3.action)) {
                                    ActivityItemCallbackEvent.ShowProgress showProgress = new ActivityItemCallbackEvent.ShowProgress();
                                    defaultActivityItemEventHandler$buttonClicked$12.L$0 = activityItemViewModel3;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$1 = formattedPaymentHistoryActivityItem2;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$2 = paymentHistoryButton3;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$3 = producerScope2;
                                    defaultActivityItemEventHandler$buttonClicked$12.label = 3;
                                    break;
                                }
                                if (paymentHistoryButton3.action == PaymentHistoryButton.ButtonAction.OPEN_URL) {
                                    ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent2 = ActivityItemCallbackEvent.AnalyticsEvent.LinkOpened;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$0 = activityItemViewModel3;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$1 = formattedPaymentHistoryActivityItem2;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$2 = paymentHistoryButton3;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$3 = producerScope2;
                                    defaultActivityItemEventHandler$buttonClicked$12.label = 4;
                                    break;
                                }
                                FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem3 = formattedPaymentHistoryActivityItem2;
                                ProducerScope producerScope3 = producerScope2;
                                buttonAction = paymentHistoryButton3.action;
                                if ((buttonAction != null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonAction.ordinal()]) == 1) {
                                    StandaloneCoroutine launch$default = JobKt.launch$default(defaultActivityItemEventHandler.scope, null, null, new DefaultActivityItemEventHandler$buttonClicked$2(defaultActivityItemEventHandler, formattedPaymentHistoryActivityItem3, paymentHistoryButton3, activityItemViewModel3, producerScope3, null), 3);
                                    defaultActivityItemEventHandler$buttonClicked$12.L$0 = null;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$1 = null;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$2 = paymentHistoryButton3;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$3 = null;
                                    defaultActivityItemEventHandler$buttonClicked$12.label = 6;
                                    break;
                                } else {
                                    ActivityItemCallbackEvent.ShowReactionPicker showReactionPicker = new ActivityItemCallbackEvent.ShowReactionPicker(true);
                                    defaultActivityItemEventHandler$buttonClicked$12.L$0 = null;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$1 = null;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$2 = paymentHistoryButton3;
                                    defaultActivityItemEventHandler$buttonClicked$12.L$3 = null;
                                    defaultActivityItemEventHandler$buttonClicked$12.label = 5;
                                    break;
                                }
                                if (CollectionsKt.contains(set, paymentHistoryButton4.action) && (function1 = defaultActivityItemEventHandler.feedCallback) != null) {
                                    function1.invoke(ActivityFeedCallbackEvent$RefreshFeed.INSTANCE);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        producerScope2 = defaultActivityItemEventHandler$buttonClicked$12.L$3;
                        PaymentHistoryButton paymentHistoryButton6 = defaultActivityItemEventHandler$buttonClicked$12.L$2;
                        formattedPaymentHistoryActivityItem2 = defaultActivityItemEventHandler$buttonClicked$12.L$1;
                        ActivityItemViewModel activityItemViewModel4 = defaultActivityItemEventHandler$buttonClicked$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        paymentHistoryButton2 = paymentHistoryButton6;
                        activityItemViewModel2 = activityItemViewModel4;
                        defaultActivityItemEventHandler$buttonClicked$12.L$0 = activityItemViewModel2;
                        defaultActivityItemEventHandler$buttonClicked$12.L$1 = formattedPaymentHistoryActivityItem2;
                        defaultActivityItemEventHandler$buttonClicked$12.L$2 = paymentHistoryButton2;
                        defaultActivityItemEventHandler$buttonClicked$12.L$3 = producerScope2;
                        defaultActivityItemEventHandler$buttonClicked$12.label = 2;
                        if (((ProducerCoroutine) producerScope2)._channel.send(ActivityItemCallbackEvent.DismissBadge.INSTANCE, defaultActivityItemEventHandler$buttonClicked$12) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        producerScope2 = defaultActivityItemEventHandler$buttonClicked$12.L$3;
                        paymentHistoryButton3 = defaultActivityItemEventHandler$buttonClicked$12.L$2;
                        formattedPaymentHistoryActivityItem2 = defaultActivityItemEventHandler$buttonClicked$12.L$1;
                        activityItemViewModel3 = defaultActivityItemEventHandler$buttonClicked$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (CollectionsKt.contains(set, paymentHistoryButton3.action)) {
                        }
                        if (paymentHistoryButton3.action == PaymentHistoryButton.ButtonAction.OPEN_URL) {
                        }
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem32 = formattedPaymentHistoryActivityItem2;
                        ProducerScope producerScope32 = producerScope2;
                        buttonAction = paymentHistoryButton3.action;
                        if ((buttonAction != null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonAction.ordinal()]) == 1) {
                        }
                        if (CollectionsKt.contains(set, paymentHistoryButton4.action)) {
                            function1.invoke(ActivityFeedCallbackEvent$RefreshFeed.INSTANCE);
                            break;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        producerScope2 = defaultActivityItemEventHandler$buttonClicked$12.L$3;
                        paymentHistoryButton3 = defaultActivityItemEventHandler$buttonClicked$12.L$2;
                        formattedPaymentHistoryActivityItem2 = defaultActivityItemEventHandler$buttonClicked$12.L$1;
                        activityItemViewModel3 = defaultActivityItemEventHandler$buttonClicked$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (paymentHistoryButton3.action == PaymentHistoryButton.ButtonAction.OPEN_URL) {
                        }
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem322 = formattedPaymentHistoryActivityItem2;
                        ProducerScope producerScope322 = producerScope2;
                        buttonAction = paymentHistoryButton3.action;
                        if ((buttonAction != null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonAction.ordinal()]) == 1) {
                        }
                        if (CollectionsKt.contains(set, paymentHistoryButton4.action)) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        producerScope2 = defaultActivityItemEventHandler$buttonClicked$12.L$3;
                        paymentHistoryButton3 = defaultActivityItemEventHandler$buttonClicked$12.L$2;
                        formattedPaymentHistoryActivityItem2 = defaultActivityItemEventHandler$buttonClicked$12.L$1;
                        activityItemViewModel3 = defaultActivityItemEventHandler$buttonClicked$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem3222 = formattedPaymentHistoryActivityItem2;
                        ProducerScope producerScope3222 = producerScope2;
                        buttonAction = paymentHistoryButton3.action;
                        if ((buttonAction != null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonAction.ordinal()]) == 1) {
                        }
                        if (CollectionsKt.contains(set, paymentHistoryButton4.action)) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                    case 6:
                        paymentHistoryButton4 = defaultActivityItemEventHandler$buttonClicked$12.L$2;
                        SafeTrace.throwOnFailure(obj);
                        if (CollectionsKt.contains(set, paymentHistoryButton4.action)) {
                        }
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        defaultActivityItemEventHandler$buttonClicked$1 = new DefaultActivityItemEventHandler$buttonClicked$1(defaultActivityItemEventHandler, continuationImpl);
        DefaultActivityItemEventHandler$buttonClicked$1 defaultActivityItemEventHandler$buttonClicked$122 = defaultActivityItemEventHandler$buttonClicked$1;
        Object obj2 = defaultActivityItemEventHandler$buttonClicked$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultActivityItemEventHandler$buttonClicked$122.label;
        Set set2 = ActionsNeedingSpinner;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (r0.join(r7) == r8) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$itemClicked(DefaultActivityItemEventHandler defaultActivityItemEventHandler, ActivityItemViewModel activityItemViewModel, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, ProducerScope producerScope, ContinuationImpl continuationImpl) {
        DefaultActivityItemEventHandler$itemClicked$1 defaultActivityItemEventHandler$itemClicked$1;
        DefaultActivityItemEventHandler$itemClicked$1 defaultActivityItemEventHandler$itemClicked$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        ActivityItemPresentationContext activityItemPresentationContext;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2;
        ActivityItemViewModel activityItemViewModel2;
        ActivityItemPresentationContext activityItemPresentationContext2;
        ProducerScope producerScope2;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem3;
        String str;
        boolean z;
        ActivityItemViewModel activityItemViewModel3 = activityItemViewModel;
        ProducerScope producerScope3 = producerScope;
        if (continuationImpl instanceof DefaultActivityItemEventHandler$itemClicked$1) {
            defaultActivityItemEventHandler$itemClicked$1 = (DefaultActivityItemEventHandler$itemClicked$1) continuationImpl;
            int i2 = defaultActivityItemEventHandler$itemClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultActivityItemEventHandler$itemClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                defaultActivityItemEventHandler$itemClicked$12 = defaultActivityItemEventHandler$itemClicked$1;
                Object obj = defaultActivityItemEventHandler$itemClicked$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultActivityItemEventHandler$itemClicked$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual(formattedPaymentHistoryActivityItem.getPaymentHistoryData().is_tap_on_row_disabled, Boolean.TRUE)) {
                        return Unit.INSTANCE;
                    }
                    activityItemPresentationContext = activityItemViewModel3.presentationContext;
                    ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent = ActivityItemCallbackEvent.AnalyticsEvent.ItemTapped;
                    defaultActivityItemEventHandler$itemClicked$12.L$0 = activityItemViewModel3;
                    defaultActivityItemEventHandler$itemClicked$12.L$1 = formattedPaymentHistoryActivityItem;
                    defaultActivityItemEventHandler$itemClicked$12.L$2 = producerScope3;
                    defaultActivityItemEventHandler$itemClicked$12.L$3 = activityItemPresentationContext;
                    defaultActivityItemEventHandler$itemClicked$12.label = 1;
                    if (((ProducerCoroutine) producerScope3)._channel.send(analyticsEvent, defaultActivityItemEventHandler$itemClicked$12) != coroutineSingletons) {
                        formattedPaymentHistoryActivityItem2 = formattedPaymentHistoryActivityItem;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ActivityItemPresentationContext activityItemPresentationContext3 = defaultActivityItemEventHandler$itemClicked$12.L$3;
                    producerScope3 = defaultActivityItemEventHandler$itemClicked$12.L$2;
                    formattedPaymentHistoryActivityItem2 = defaultActivityItemEventHandler$itemClicked$12.L$1;
                    ActivityItemViewModel activityItemViewModel4 = defaultActivityItemEventHandler$itemClicked$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    activityItemPresentationContext = activityItemPresentationContext3;
                    activityItemViewModel3 = activityItemViewModel4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    activityItemPresentationContext2 = defaultActivityItemEventHandler$itemClicked$12.L$3;
                    ProducerScope producerScope4 = defaultActivityItemEventHandler$itemClicked$12.L$2;
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem4 = defaultActivityItemEventHandler$itemClicked$12.L$1;
                    ActivityItemViewModel activityItemViewModel5 = defaultActivityItemEventHandler$itemClicked$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    producerScope2 = producerScope4;
                    formattedPaymentHistoryActivityItem3 = formattedPaymentHistoryActivityItem4;
                    activityItemViewModel2 = activityItemViewModel5;
                    str = formattedPaymentHistoryActivityItem3.getPaymentHistoryData().url_to_open;
                    if (str == null) {
                        RealRouter realRouter = defaultActivityItemEventHandler.router;
                        Screen screen = activityItemPresentationContext2.screen;
                        z = realRouter.route(new RoutingParams(screen, null, screen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return Unit.INSTANCE;
                    }
                    StandaloneCoroutine launch$default = JobKt.launch$default(defaultActivityItemEventHandler.scope, defaultActivityItemEventHandler.ioDispatcher, null, new RealImageLoader$execute$result$1(defaultActivityItemEventHandler, formattedPaymentHistoryActivityItem3, producerScope2, activityItemViewModel2, (Continuation) null, 28), 2);
                    defaultActivityItemEventHandler$itemClicked$12.L$0 = null;
                    defaultActivityItemEventHandler$itemClicked$12.L$1 = null;
                    defaultActivityItemEventHandler$itemClicked$12.L$2 = null;
                    defaultActivityItemEventHandler$itemClicked$12.L$3 = null;
                    defaultActivityItemEventHandler$itemClicked$12.label = 3;
                }
                defaultActivityItemEventHandler$itemClicked$12.L$0 = activityItemViewModel3;
                defaultActivityItemEventHandler$itemClicked$12.L$1 = formattedPaymentHistoryActivityItem2;
                defaultActivityItemEventHandler$itemClicked$12.L$2 = producerScope3;
                defaultActivityItemEventHandler$itemClicked$12.L$3 = activityItemPresentationContext;
                defaultActivityItemEventHandler$itemClicked$12.label = 2;
                if (((ProducerCoroutine) producerScope3)._channel.send(ActivityItemCallbackEvent.DismissBadge.INSTANCE, defaultActivityItemEventHandler$itemClicked$12) != coroutineSingletons) {
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem5 = formattedPaymentHistoryActivityItem2;
                    activityItemViewModel2 = activityItemViewModel3;
                    activityItemPresentationContext2 = activityItemPresentationContext;
                    producerScope2 = producerScope3;
                    formattedPaymentHistoryActivityItem3 = formattedPaymentHistoryActivityItem5;
                    str = formattedPaymentHistoryActivityItem3.getPaymentHistoryData().url_to_open;
                    if (str == null) {
                    }
                    if (!z) {
                    }
                }
                return coroutineSingletons;
            }
        }
        defaultActivityItemEventHandler$itemClicked$1 = new DefaultActivityItemEventHandler$itemClicked$1(defaultActivityItemEventHandler, continuationImpl);
        defaultActivityItemEventHandler$itemClicked$12 = defaultActivityItemEventHandler$itemClicked$1;
        Object obj2 = defaultActivityItemEventHandler$itemClicked$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultActivityItemEventHandler$itemClicked$12.label;
        if (i != 0) {
        }
        defaultActivityItemEventHandler$itemClicked$12.L$0 = activityItemViewModel3;
        defaultActivityItemEventHandler$itemClicked$12.L$1 = formattedPaymentHistoryActivityItem2;
        defaultActivityItemEventHandler$itemClicked$12.L$2 = producerScope3;
        defaultActivityItemEventHandler$itemClicked$12.L$3 = activityItemPresentationContext;
        defaultActivityItemEventHandler$itemClicked$12.label = 2;
        if (((ProducerCoroutine) producerScope3)._channel.send(ActivityItemCallbackEvent.DismissBadge.INSTANCE, defaultActivityItemEventHandler$itemClicked$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$reactionSelected(DefaultActivityItemEventHandler defaultActivityItemEventHandler, String str, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, ProducerScope producerScope, ContinuationImpl continuationImpl) {
        DefaultActivityItemEventHandler$reactionSelected$1 defaultActivityItemEventHandler$reactionSelected$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2;
        String str2;
        ActivityItemCallbackEvent.ShowProgress showProgress;
        String str3;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem3;
        ProducerScope producerScope2 = producerScope;
        if (continuationImpl instanceof DefaultActivityItemEventHandler$reactionSelected$1) {
            defaultActivityItemEventHandler$reactionSelected$1 = (DefaultActivityItemEventHandler$reactionSelected$1) continuationImpl;
            int i2 = defaultActivityItemEventHandler$reactionSelected$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultActivityItemEventHandler$reactionSelected$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultActivityItemEventHandler$reactionSelected$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultActivityItemEventHandler$reactionSelected$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityItemCallbackEvent.ShowReactionPicker showReactionPicker = new ActivityItemCallbackEvent.ShowReactionPicker(false);
                    defaultActivityItemEventHandler$reactionSelected$1.L$0 = str;
                    formattedPaymentHistoryActivityItem2 = formattedPaymentHistoryActivityItem;
                    defaultActivityItemEventHandler$reactionSelected$1.L$1 = formattedPaymentHistoryActivityItem2;
                    defaultActivityItemEventHandler$reactionSelected$1.L$2 = producerScope2;
                    defaultActivityItemEventHandler$reactionSelected$1.label = 1;
                    if (((ProducerCoroutine) producerScope2)._channel.send(showReactionPicker, defaultActivityItemEventHandler$reactionSelected$1) != coroutineSingletons) {
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    formattedPaymentHistoryActivityItem3 = defaultActivityItemEventHandler$reactionSelected$1.L$1;
                    String str4 = defaultActivityItemEventHandler$reactionSelected$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str3 = str4;
                    RealReactionManager realReactionManager = defaultActivityItemEventHandler.reactionManager;
                    String removePrefix = StringsKt.removePrefix("P_", ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem3));
                    Money money = formattedPaymentHistoryActivityItem3.getUiPayment().amount;
                    RealReactionManager.addReaction$default(realReactionManager, removePrefix, (money == null ? money.currency_code : null) == CurrencyCode.BTC ? "CRYPTO" : null, str3, "ACTIVITY_ITEM_BUTTON", new yf$$ExternalSyntheticLambda2(defaultActivityItemEventHandler, 25), 16);
                    return Unit.INSTANCE;
                }
                producerScope2 = defaultActivityItemEventHandler$reactionSelected$1.L$2;
                FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem4 = defaultActivityItemEventHandler$reactionSelected$1.L$1;
                String str5 = defaultActivityItemEventHandler$reactionSelected$1.L$0;
                SafeTrace.throwOnFailure(obj);
                formattedPaymentHistoryActivityItem2 = formattedPaymentHistoryActivityItem4;
                str2 = str5;
                showProgress = new ActivityItemCallbackEvent.ShowProgress();
                defaultActivityItemEventHandler$reactionSelected$1.L$0 = str2;
                defaultActivityItemEventHandler$reactionSelected$1.L$1 = formattedPaymentHistoryActivityItem2;
                defaultActivityItemEventHandler$reactionSelected$1.L$2 = null;
                defaultActivityItemEventHandler$reactionSelected$1.label = 2;
                if (((ProducerCoroutine) producerScope2)._channel.send(showProgress, defaultActivityItemEventHandler$reactionSelected$1) != coroutineSingletons) {
                    str3 = str2;
                    formattedPaymentHistoryActivityItem3 = formattedPaymentHistoryActivityItem2;
                    RealReactionManager realReactionManager2 = defaultActivityItemEventHandler.reactionManager;
                    String removePrefix2 = StringsKt.removePrefix("P_", ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem3));
                    Money money2 = formattedPaymentHistoryActivityItem3.getUiPayment().amount;
                    RealReactionManager.addReaction$default(realReactionManager2, removePrefix2, (money2 == null ? money2.currency_code : null) == CurrencyCode.BTC ? "CRYPTO" : null, str3, "ACTIVITY_ITEM_BUTTON", new yf$$ExternalSyntheticLambda2(defaultActivityItemEventHandler, 25), 16);
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        defaultActivityItemEventHandler$reactionSelected$1 = new DefaultActivityItemEventHandler$reactionSelected$1(defaultActivityItemEventHandler, continuationImpl);
        Object obj2 = defaultActivityItemEventHandler$reactionSelected$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultActivityItemEventHandler$reactionSelected$1.label;
        if (i != 0) {
        }
        showProgress = new ActivityItemCallbackEvent.ShowProgress();
        defaultActivityItemEventHandler$reactionSelected$1.L$0 = str2;
        defaultActivityItemEventHandler$reactionSelected$1.L$1 = formattedPaymentHistoryActivityItem2;
        defaultActivityItemEventHandler$reactionSelected$1.L$2 = null;
        defaultActivityItemEventHandler$reactionSelected$1.label = 2;
        if (((ProducerCoroutine) producerScope2)._channel.send(showProgress, defaultActivityItemEventHandler$reactionSelected$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static final Object access$setCachedActivityItem(DefaultActivityItemEventHandler defaultActivityItemEventHandler, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, RealImageLoader$execute$result$1 realImageLoader$execute$result$1) {
        ActivityDataBridge activityDataBridge = defaultActivityItemEventHandler.activityDataBridge;
        if (!defaultActivityItemEventHandler.activityTreehouseCompatibility.canUse(ActivityTreehouseCompatibility$Method.SetOfflineCachedActivityItem)) {
            Object cachedActivityItem = activityDataBridge.setCachedActivityItem(serializable(formattedPaymentHistoryActivityItem), realImageLoader$execute$result$1);
            return cachedActivityItem == CoroutineSingletons.COROUTINE_SUSPENDED ? cachedActivityItem : Unit.INSTANCE;
        }
        if (!(formattedPaymentHistoryActivityItem instanceof OfflineFormattedActivityItem)) {
            Object cachedActivityItem2 = activityDataBridge.setCachedActivityItem(serializable(formattedPaymentHistoryActivityItem), realImageLoader$execute$result$1);
            return cachedActivityItem2 == CoroutineSingletons.COROUTINE_SUSPENDED ? cachedActivityItem2 : Unit.INSTANCE;
        }
        OfflineFormattedActivityItem offlineFormattedActivityItem = (OfflineFormattedActivityItem) formattedPaymentHistoryActivityItem;
        Long l = offlineFormattedActivityItem.uiPayment.created_at;
        long longValue = l != null ? l.longValue() : 0L;
        if (!(offlineFormattedActivityItem instanceof OfflinePaymentActivityItem)) {
            if (offlineFormattedActivityItem instanceof OfflineTransferActivityItem) {
                Object cachedActivityItemFromTransferFundsRequest = activityDataBridge.setCachedActivityItemFromTransferFundsRequest(TransferFundsRequest.ADAPTER.encodeByteString(((OfflineTransferActivityItem) formattedPaymentHistoryActivityItem).transferFundsRequest), longValue, realImageLoader$execute$result$1);
                return cachedActivityItemFromTransferFundsRequest == CoroutineSingletons.COROUTINE_SUSPENDED ? cachedActivityItemFromTransferFundsRequest : Unit.INSTANCE;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        OfflinePaymentActivityItem offlinePaymentActivityItem = (OfflinePaymentActivityItem) formattedPaymentHistoryActivityItem;
        String str = offlinePaymentActivityItem.getter.id;
        if (str != null) {
            Object cachedActivityItemFromInitiatePaymentRequest = activityDataBridge.setCachedActivityItemFromInitiatePaymentRequest(InitiatePaymentRequest.ADAPTER.encodeByteString(offlinePaymentActivityItem.initiatePaymentRequest), str, longValue, realImageLoader$execute$result$1);
            return cachedActivityItemFromInitiatePaymentRequest == CoroutineSingletons.COROUTINE_SUSPENDED ? cachedActivityItemFromInitiatePaymentRequest : Unit.INSTANCE;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Payment getter id was null");
        return null;
    }

    public static SerializableActivityItem serializable(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        String itemId = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
        String itemId2 = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
        ByteString encodeByteString = UiPayment.ADAPTER.encodeByteString(formattedPaymentHistoryActivityItem.getUiPayment());
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        ByteString encodeByteString2 = protoAdapter.encodeByteString(formattedPaymentHistoryActivityItem.getUiSender());
        ByteString encodeByteString3 = protoAdapter.encodeByteString(formattedPaymentHistoryActivityItem.getUiRecipient());
        ActivityItemType itemType = ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem);
        ByteString encodeByteString4 = itemType != null ? ActivityItemType.ADAPTER.encodeByteString(itemType) : null;
        ActivityRowSection section = formattedPaymentHistoryActivityItem.getSection();
        return new SerializableActivityItem(itemId, itemId2, encodeByteString, encodeByteString2, encodeByteString3, encodeByteString4, section != null ? ActivityRowSection.ADAPTER.encodeByteString(section) : null, formattedPaymentHistoryActivityItem.isBadged(), formattedPaymentHistoryActivityItem.isOffline(), formattedPaymentHistoryActivityItem.getVersion(), null);
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler
    public final Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemViewModel.getClass();
        activityItemViewEvent.getClass();
        activityItem.getClass();
        return FlowKt.channelFlow(new RealImageLoader$execute$result$1(activityItem, activityItemViewEvent, this, activityItemViewModel, (Continuation) null, 27));
    }
}
