package com.squareup.cash.activity.presenters.receipts;

import androidx.collection.LruCache;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.history.screens.HistoryScreens;
import coil3.RealImageLoader$execute$result$1;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.ActivitiesCacheManager$takeForSingle$1;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager$Factory$Impl;
import com.squareup.cash.activity.backend.loader.ReceiptGetRequestHandler;
import com.squareup.cash.activity.backend.loader.ReceiptGetRequestHandler$Factory$Impl;
import com.squareup.cash.activity.backend.loader.SingleActivity;
import com.squareup.cash.activity.backend.loader.SingleActivityCache$InMemory;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.PaymentHistoryAvatarFactory;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.ReceiptSection;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okhttp3.internal.Tags;

/* loaded from: classes5.dex */
public final class ReceiptPresenter implements MoleculePresenter {
    public final ActivityAnalyticsService activityAnalyticsService;
    public final ActivitiesManager.ActivityContext activityContext;
    public final ActivityItemEventHandler.Factory activityItemEventHandlerFactory;
    public final HistoryScreens.PaymentReceipt args;
    public final SharedFlowImpl eventHandlerCallbacks;
    public final LazyPagingItems$collectLoadState$2 eventHandlerFlowCollector;
    public final SharedFlowImpl feedCallbackEvents;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final PaymentHistoryAvatarFactory paymentHistoryAvatarFactory;
    public final RealRouter router;
    public final RealSharedReactionState sharedReactionState;
    public final RealSingleActivityManager singleActivityManager;
    public final AndroidStringManager stringManager;

    public interface IntermediateState {

        public final class Loaded implements IntermediateState {
            public final FormattedPaymentHistoryActivityItem activityItem;
            public final StackedAvatarViewModel avatar;
            public final AvatarBadgeViewModel avatarBadge;
            public final ActivityItemViewModel itemViewModel;

            public Loaded(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, StackedAvatarViewModel stackedAvatarViewModel, AvatarBadgeViewModel avatarBadgeViewModel, ActivityItemViewModel activityItemViewModel) {
                formattedPaymentHistoryActivityItem.getClass();
                this.activityItem = formattedPaymentHistoryActivityItem;
                this.avatar = stackedAvatarViewModel;
                this.avatarBadge = avatarBadgeViewModel;
                this.itemViewModel = activityItemViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return Intrinsics.areEqual(this.activityItem, loaded.activityItem) && this.avatar.equals(loaded.avatar) && Intrinsics.areEqual(this.avatarBadge, loaded.avatarBadge) && this.itemViewModel.equals(loaded.itemViewModel);
            }

            public final int hashCode() {
                int hashCode = (this.avatar.hashCode() + (this.activityItem.hashCode() * 31)) * 31;
                AvatarBadgeViewModel avatarBadgeViewModel = this.avatarBadge;
                return this.itemViewModel.hashCode() + ((hashCode + (avatarBadgeViewModel == null ? 0 : avatarBadgeViewModel.hashCode())) * 31);
            }

            public final String toString() {
                return "Loaded(activityItem=" + this.activityItem + ", avatar=" + this.avatar + ", avatarBadge=" + this.avatarBadge + ", itemViewModel=" + this.itemViewModel + ")";
            }
        }

        public final class Loading implements IntermediateState {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1237555749;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public final class LoadingError implements IntermediateState {
            public static final LoadingError INSTANCE = new LoadingError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingError);
            }

            public final int hashCode() {
                return 1704056547;
            }

            public final String toString() {
                return "LoadingError";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentHistoryData.Icon.values().length];
            try {
                iArr[PaymentHistoryData.Icon.BUSINESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentHistoryData.Icon.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReceiptPresenter(HistoryScreens.PaymentReceipt paymentReceipt, BetterNavigator.ScreenNavigator screenNavigator, RealSingleActivityManager$Factory$Impl realSingleActivityManager$Factory$Impl, RealActivitiesCacheManager realActivitiesCacheManager, RealActivityTokenFactory realActivityTokenFactory, PaymentHistoryAvatarFactory paymentHistoryAvatarFactory, AndroidStringManager androidStringManager, ActivityItemEventHandler.Factory factory, IntentLauncher intentLauncher, RealRouter$Factory$Impl realRouter$Factory$Impl, RealSharedReactionState realSharedReactionState, ActivityAnalyticsService activityAnalyticsService, ReceiptGetRequestHandler$Factory$Impl receiptGetRequestHandler$Factory$Impl) {
        paymentReceipt.getClass();
        this.args = paymentReceipt;
        this.navigator = screenNavigator;
        this.paymentHistoryAvatarFactory = paymentHistoryAvatarFactory;
        this.stringManager = androidStringManager;
        this.activityItemEventHandlerFactory = factory;
        this.launcher = intentLauncher;
        this.sharedReactionState = realSharedReactionState;
        this.activityAnalyticsService = activityAnalyticsService;
        ActivityItemKey activityItemKey = paymentReceipt.activityItemKey;
        ReceiptGetRequestHandler create = receiptGetRequestHandler$Factory$Impl.create();
        activityItemKey.getClass();
        ActivityToken activityToken = activityItemKey.activityToken;
        activityToken = activityToken == null ? RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN) : activityToken;
        ActivityScope activityScope = activityItemKey.activityScope;
        ActivitiesManager.ActivityContext activityContext = new ActivitiesManager.ActivityContext(activityToken, activityScope == null ? ActivityScope.MY_ACTIVITY : activityScope, (ActivitiesManager.ActivityPageHandler) null, create);
        this.activityContext = activityContext;
        ActivityItemGlobalId activityItemGlobalId = activityItemKey.activityItemGlobalId;
        activityItemGlobalId = activityItemGlobalId.primary_activity_token == null ? ActivityItemGlobalId.copy$default(activityItemGlobalId, activityToken, null, 5) : activityItemGlobalId;
        ActivitiesCacheManager$takeForSingle$1 activitiesCacheManager$takeForSingle$1 = ActivitiesCacheManager$takeForSingle$1.INSTANCE;
        activityItemKey.getClass();
        LruCache lruCache = realActivitiesCacheManager.lruCacheSingle;
        SingleActivityCache$InMemory singleActivityCache$InMemory = (SingleActivityCache$InMemory) lruCache.get(activityItemKey);
        if (singleActivityCache$InMemory == null) {
            singleActivityCache$InMemory = (SingleActivityCache$InMemory) activitiesCacheManager$takeForSingle$1.invoke();
            lruCache.put(activityItemKey, singleActivityCache$InMemory);
        }
        String str = paymentReceipt.locale;
        this.singleActivityManager = realSingleActivityManager$Factory$Impl.create(activityContext, activityItemGlobalId, singleActivityCache$InMemory, str != null ? Locale.forLanguageTag(str) : null);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.feedCallbackEvents = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
        this.eventHandlerCallbacks = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        this.eventHandlerFlowCollector = new LazyPagingItems$collectLoadState$2(this, 22);
    }

    public static final Object access$handleButtonClick(ReceiptPresenter receiptPresenter, ActivityItemEventHandler activityItemEventHandler, IntermediateState intermediateState, PaymentHistoryButton paymentHistoryButton, SuspendLambda suspendLambda) {
        Object collect;
        IntermediateState.Loaded loaded = intermediateState instanceof IntermediateState.Loaded ? (IntermediateState.Loaded) intermediateState : null;
        return (loaded != null && (collect = activityItemEventHandler.handleEvent(loaded.itemViewModel, new ActivityItemViewEvent.PaymentHistoryButtonClicked(paymentHistoryButton), loaded.activityItem).collect(receiptPresenter.eventHandlerFlowCollector, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0  */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.squareup.cash.activity.viewmodels.ReceiptViewModel$Subtitle$AnnotatedText] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.squareup.cash.activity.viewmodels.ReceiptViewModel$Subtitle$Markdown] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.squareup.cash.activity.viewmodels.ReceiptViewModel$Subtitle] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        SingleActivity singleActivity;
        Object loadingError;
        Icons icons;
        Icons icons2;
        boolean areEqual;
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(368882177);
        HistoryScreens.PaymentReceipt paymentReceipt = this.args;
        boolean changed = gapComposer.changed(paymentReceipt);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 12;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        continuation = null;
        if (changed || rememberedValue == neverEqualPolicy) {
            RealSingleActivityManager realSingleActivityManager = this.singleActivityManager;
            realSingleActivityManager.getClass();
            RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.callbackFlow(new NetworkFetcher$doFetch$2(realSingleActivityManager, continuation, 19)), realSingleActivityManager, i2);
            gapComposer.updateRememberedValue(realBadger2$scheduleBadgeClearingWork$$inlined$map$1);
            rememberedValue = realBadger2$scheduleBadgeClearingWork$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, new SingleActivity(null, LoadingState.LOADING), null, gapComposer, 0, 2);
        boolean changed2 = gapComposer.changed(paymentReceipt);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(ReactionsState.Hidden.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        SharedFlowImpl sharedFlowImpl = this.feedCallbackEvents;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = this.activityItemEventHandlerFactory.create(this.navigator, new ScrollCapture$onScrollCaptureSearch$1(1, sharedFlowImpl, MutableSharedFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, 1));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        ActivityItemEventHandler activityItemEventHandler = (ActivityItemEventHandler) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        Object[] objArr = new Object[0];
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new MotionKt$$ExternalSyntheticLambda0(12);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue5, gapComposer, 48);
        Unit unit = Unit.INSTANCE;
        int i3 = (i & 112) ^ 48;
        boolean changed3 = ((i3 > 32 && gapComposer.changed(this)) || (i & 48) == 32) | gapComposer.changed(mutableState3) | gapComposer.changed(collectAsState);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new EditProfilePresenter$models$2$1(this, mutableState3, collectAsState, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue6);
        Object[] objArr2 = new Object[0];
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = new MotionKt$$ExternalSyntheticLambda0(13);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState4 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue7, gapComposer, 48);
        SingleActivity singleActivity2 = (SingleActivity) collectAsState.getValue();
        boolean changed4 = ((i3 > 32 && gapComposer.changed(this)) || (i & 48) == 32) | gapComposer.changed(collectAsState) | gapComposer.changed(mutableState4);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue8 == neverEqualPolicy) {
            singleActivity = singleActivity2;
            zzmh zzmhVar = new zzmh(this, collectAsState, mutableState4, continuation, 13);
            gapComposer.updateRememberedValue(zzmhVar);
            rememberedValue8 = zzmhVar;
        } else {
            singleActivity = singleActivity2;
        }
        IntermediateState.Loading loading = IntermediateState.Loading.INSTANCE;
        MutableState produceState = Updater.produceState(loading, singleActivity, (Function2) rememberedValue8, gapComposer, 6);
        SharedFlowImpl sharedFlowImpl2 = this.eventHandlerCallbacks;
        Updater.LaunchedEffect(gapComposer, sharedFlowImpl2, new RealImageLoader$execute$result$1(sharedFlowImpl2, (Continuation) null, this, collectAsState, mutableState, 29));
        Updater.LaunchedEffect(gapComposer, sharedFlowImpl, new EditProfilePresenter$models$2$1(sharedFlowImpl, continuation, this, 18));
        Updater.LaunchedEffect(gapComposer, flow, new EngineInterceptor$intercept$2(11, mutableState, flow, this, produceState, activityItemEventHandler, mutableState2, (Continuation) null));
        IntermediateState intermediateState = (IntermediateState) produceState.getValue();
        if (Intrinsics.areEqual(intermediateState, loading)) {
            loadingError = ReceiptViewModel.Loading.INSTANCE;
        } else if (intermediateState instanceof IntermediateState.Loaded) {
            IntermediateState.Loaded loaded = (IntermediateState.Loaded) intermediateState;
            PaymentHistoryData paymentHistoryData = loaded.activityItem.getPaymentHistoryData();
            PaymentHistoryData.Icon icon = paymentHistoryData.title_icon;
            int i4 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i4 == 1) {
                icons = Icons.Business24;
            } else if (i4 != 2) {
                icons2 = null;
                areEqual = Intrinsics.areEqual(paymentHistoryData.header_subtext_as_markdown, Boolean.TRUE);
                String str2 = paymentHistoryData.header_subtext;
                if (areEqual) {
                    if (str2 != null) {
                        continuation = new ReceiptViewModel.Subtitle.AnnotatedText(str2, Tags.toPersistentList(paymentHistoryData.header_subtext_attribute_ranges));
                    }
                } else if (str2 != null) {
                    continuation = new ReceiptViewModel.Subtitle.Markdown(str2);
                }
                ?? r16 = continuation;
                str = paymentHistoryData.header_text;
                if (str == null) {
                    str = "";
                }
                loadingError = new ReceiptViewModel.Loaded(str, r16, paymentHistoryData.amount_formatted, paymentHistoryData.amount_treatment, paymentHistoryData.amount_alternate_formatted, paymentHistoryData.amount_alternate_treatment, loaded.avatar, loaded.avatarBadge, paymentHistoryData.receipt_sections, paymentHistoryData.primary_button, paymentHistoryData.secondary_button, icons2, (ReceiptSection.TimelineEntry.EventDetailsOverlay) mutableState2.getValue(), (ReactionsState) mutableState.getValue());
            } else {
                icons = Icons.AccountVerified24;
            }
            icons2 = icons;
            areEqual = Intrinsics.areEqual(paymentHistoryData.header_subtext_as_markdown, Boolean.TRUE);
            String str22 = paymentHistoryData.header_subtext;
            if (areEqual) {
            }
            ?? r162 = continuation;
            str = paymentHistoryData.header_text;
            if (str == null) {
            }
            loadingError = new ReceiptViewModel.Loaded(str, r162, paymentHistoryData.amount_formatted, paymentHistoryData.amount_treatment, paymentHistoryData.amount_alternate_formatted, paymentHistoryData.amount_alternate_treatment, loaded.avatar, loaded.avatarBadge, paymentHistoryData.receipt_sections, paymentHistoryData.primary_button, paymentHistoryData.secondary_button, icons2, (ReceiptSection.TimelineEntry.EventDetailsOverlay) mutableState2.getValue(), (ReactionsState) mutableState.getValue());
        } else {
            if (!Intrinsics.areEqual(intermediateState, IntermediateState.LoadingError.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            AndroidStringManager androidStringManager = this.stringManager;
            loadingError = new ReceiptViewModel.LoadingError(androidStringManager.get(R.string.receipt_load_error_title), androidStringManager.get(R.string.receipt_load_error_description));
        }
        gapComposer.end(false);
        return loadingError;
    }
}
