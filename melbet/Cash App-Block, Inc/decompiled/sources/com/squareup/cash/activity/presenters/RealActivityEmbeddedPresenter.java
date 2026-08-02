package com.squareup.cash.activity.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityFeedProducer;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattingFailedActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.views.ErrorActivityItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.datetimeformatter.real.RealDateTimeFormatterFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealActivityEmbeddedPresenter {
    public final ActivitiesManager activitiesManager;
    public final ActivityFeedProducer activityFeedProducer;
    public final ActivityItemPresenter.Factory activityItemPresenterFactory;
    public final ActivityEmbeddedPresenter$Configuration configuration;
    public final RealDateTimeFormatterFactory dateTimeFormatterFactory;
    public final SharedFlowImpl feedCallbackEvents;
    public StandaloneCoroutine loadMoreJob;
    public final Navigator navigator;
    public final ChannelFlowBuilder refreshEvents;
    public final SharedFlowImpl refreshTrigger;
    public final AndroidStringManager strings;

    public final class IntermediateFeedState {
        public final List feedEntries;
        public final boolean hasMore;
        public final LoadingState loadingState;

        public IntermediateFeedState(LoadingState loadingState, boolean z, List list) {
            loadingState.getClass();
            list.getClass();
            this.loadingState = loadingState;
            this.hasMore = z;
            this.feedEntries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntermediateFeedState)) {
                return false;
            }
            IntermediateFeedState intermediateFeedState = (IntermediateFeedState) obj;
            return this.loadingState == intermediateFeedState.loadingState && this.hasMore == intermediateFeedState.hasMore && Intrinsics.areEqual(this.feedEntries, intermediateFeedState.feedEntries);
        }

        public final int hashCode() {
            return this.feedEntries.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.loadingState.hashCode() * 31, 31, this.hasMore);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntermediateFeedState(loadingState=");
            sb.append(this.loadingState);
            sb.append(", hasMore=");
            sb.append(this.hasMore);
            sb.append(", feedEntries=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.feedEntries, ")");
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                LoadingState loadingState = LoadingState.LOADING;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealActivityEmbeddedPresenter(Navigator navigator, ActivityEmbeddedPresenter$Configuration activityEmbeddedPresenter$Configuration, ActivitiesManager.Factory factory, ActivityFeedProducer activityFeedProducer, AndroidStringManager androidStringManager, ActivityItemPresenter.Factory factory2, RealDateTimeFormatterFactory realDateTimeFormatterFactory) {
        navigator.getClass();
        this.navigator = navigator;
        this.configuration = activityEmbeddedPresenter$Configuration;
        this.strings = androidStringManager;
        this.dateTimeFormatterFactory = realDateTimeFormatterFactory;
        ActivityItemPresenter.Factory factory3 = activityEmbeddedPresenter$Configuration.activityItemPresenterFactory;
        this.activityItemPresenterFactory = factory3 != null ? factory3 : factory2;
        ActivitiesManager.Factory factory4 = activityEmbeddedPresenter$Configuration.activitiesManagerFactory;
        this.activitiesManager = (factory4 != null ? factory4 : factory).create(activityEmbeddedPresenter$Configuration.activityContext, activityEmbeddedPresenter$Configuration.activityCache);
        ActivityFeedProducer activityFeedProducer2 = activityEmbeddedPresenter$Configuration.activityFeedProducer;
        this.activityFeedProducer = activityFeedProducer2 != null ? activityFeedProducer2 : activityFeedProducer;
        SharedFlowImpl MutableSharedFlow = FlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_LATEST);
        this.refreshTrigger = MutableSharedFlow;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
        this.feedCallbackEvents = MutableSharedFlow$default;
        this.refreshEvents = FlowKt.merge(MutableSharedFlow, new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new ActivityTabPresenter$special$$inlined$map$1(MutableSharedFlow$default, 1), 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$buildFeedEntries(RealActivityEmbeddedPresenter realActivityEmbeddedPresenter, Activities activities, ContinuationImpl continuationImpl) {
        RealActivityEmbeddedPresenter$buildFeedEntries$1 realActivityEmbeddedPresenter$buildFeedEntries$1;
        int i;
        ListBuilder createListBuilder;
        Activities activities2;
        ListBuilder listBuilder;
        ListBuilder listBuilder2;
        List list;
        ActivityEmbeddedPresenter$Configuration activityEmbeddedPresenter$Configuration = realActivityEmbeddedPresenter.configuration;
        if (continuationImpl instanceof RealActivityEmbeddedPresenter$buildFeedEntries$1) {
            realActivityEmbeddedPresenter$buildFeedEntries$1 = (RealActivityEmbeddedPresenter$buildFeedEntries$1) continuationImpl;
            int i2 = realActivityEmbeddedPresenter$buildFeedEntries$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realActivityEmbeddedPresenter$buildFeedEntries$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealActivityEmbeddedPresenter$buildFeedEntries$1 realActivityEmbeddedPresenter$buildFeedEntries$12 = realActivityEmbeddedPresenter$buildFeedEntries$1;
                Object obj = realActivityEmbeddedPresenter$buildFeedEntries$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realActivityEmbeddedPresenter$buildFeedEntries$12.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    int i4 = 0;
                    if (activityEmbeddedPresenter$Configuration.showFeedHeader) {
                        List list2 = activities.recentActivities;
                        createListBuilder.add(new SectionHeaderScope$$ExternalSyntheticLambda1(activities, list2 != null ? list2.size() : 0, realActivityEmbeddedPresenter));
                    }
                    if (!activityEmbeddedPresenter$Configuration.showSectionHeaders) {
                        activities2 = activities;
                        Iterable iterable = activities2.recentActivities;
                        if (iterable == null) {
                            iterable = EmptyList.INSTANCE;
                        }
                        int size = createListBuilder.getSize();
                        List take = CollectionsKt.take(iterable, activityEmbeddedPresenter$Configuration.showMoreThreshold);
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                        for (Object obj2 : take) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            ActivityItem activityItem = (ActivityItem) obj2;
                            arrayList.add(activityItem instanceof FormattingFailedActivityItem ? new SharedPresenterUtilsKt$$ExternalSyntheticLambda1((FormattingFailedActivityItem) activityItem, i3) : new SectionHeaderScope$$ExternalSyntheticLambda1(realActivityEmbeddedPresenter, activityItem, i4 + size, 8));
                            i4 = i5;
                        }
                        createListBuilder.addAll(arrayList);
                        listBuilder = createListBuilder;
                        list = activities2.recentActivities;
                        if (list != null && list.isEmpty()) {
                            createListBuilder.add(new CartBannerViewKt$$ExternalSyntheticLambda2(realActivityEmbeddedPresenter, 24));
                        }
                        if (activityEmbeddedPresenter$Configuration.showFeedFooter) {
                            createListBuilder.add(new ErrorActivityItemKt$$ExternalSyntheticLambda0(13));
                        }
                        return CollectionsKt__CollectionsJVMKt.build(listBuilder);
                    }
                    ActivityFeedProducer activityFeedProducer = realActivityEmbeddedPresenter.activityFeedProducer;
                    int i6 = activityEmbeddedPresenter$Configuration.showMoreThreshold;
                    realActivityEmbeddedPresenter$buildFeedEntries$12.L$0 = activities;
                    realActivityEmbeddedPresenter$buildFeedEntries$12.L$1 = createListBuilder;
                    realActivityEmbeddedPresenter$buildFeedEntries$12.L$2 = createListBuilder;
                    realActivityEmbeddedPresenter$buildFeedEntries$12.label = 1;
                    Object produceFeed$default = ActivityFeedProducer.produceFeed$default(activityFeedProducer, activities, null, i6, realActivityEmbeddedPresenter$buildFeedEntries$12, 2);
                    activities2 = activities;
                    if (produceFeed$default == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    listBuilder = createListBuilder;
                    obj = produceFeed$default;
                    listBuilder2 = listBuilder;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    listBuilder2 = realActivityEmbeddedPresenter$buildFeedEntries$12.L$2;
                    listBuilder = realActivityEmbeddedPresenter$buildFeedEntries$12.L$1;
                    activities2 = realActivityEmbeddedPresenter$buildFeedEntries$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                zzaad.addGroupedActivityItems(listBuilder2, (List) obj, realActivityEmbeddedPresenter.strings, new ScoreUiFactory$$ExternalSyntheticLambda0(realActivityEmbeddedPresenter, 4), realActivityEmbeddedPresenter.dateTimeFormatterFactory);
                createListBuilder = listBuilder2;
                list = activities2.recentActivities;
                if (list != null) {
                    createListBuilder.add(new CartBannerViewKt$$ExternalSyntheticLambda2(realActivityEmbeddedPresenter, 24));
                }
                if (activityEmbeddedPresenter$Configuration.showFeedFooter) {
                }
                return CollectionsKt__CollectionsJVMKt.build(listBuilder);
            }
        }
        realActivityEmbeddedPresenter$buildFeedEntries$1 = new RealActivityEmbeddedPresenter$buildFeedEntries$1(realActivityEmbeddedPresenter, continuationImpl);
        RealActivityEmbeddedPresenter$buildFeedEntries$1 realActivityEmbeddedPresenter$buildFeedEntries$122 = realActivityEmbeddedPresenter$buildFeedEntries$1;
        Object obj3 = realActivityEmbeddedPresenter$buildFeedEntries$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realActivityEmbeddedPresenter$buildFeedEntries$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        zzaad.addGroupedActivityItems(listBuilder2, (List) obj3, realActivityEmbeddedPresenter.strings, new ScoreUiFactory$$ExternalSyntheticLambda0(realActivityEmbeddedPresenter, 4), realActivityEmbeddedPresenter.dateTimeFormatterFactory);
        createListBuilder = listBuilder2;
        list = activities2.recentActivities;
        if (list != null) {
        }
        if (activityEmbeddedPresenter$Configuration.showFeedFooter) {
        }
        return CollectionsKt__CollectionsJVMKt.build(listBuilder);
    }

    public final UiCallbackModel models(Composer composer, int i) {
        StandaloneCoroutine standaloneCoroutine;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1932035530);
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            MotionKt$$ExternalSyntheticLambda0 motionKt$$ExternalSyntheticLambda0 = new MotionKt$$ExternalSyntheticLambda0(11);
            gapComposer.updateRememberedValue(motionKt$$ExternalSyntheticLambda0);
            obj = motionKt$$ExternalSyntheticLambda0;
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj, gapComposer, 48);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj2 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj2 = mutableStateOf$default;
        }
        MutableState mutableState2 = (MutableState) obj2;
        ChannelFlowBuilder channelFlowBuilder = this.refreshEvents;
        ActivityEmbeddedViewModel.LoadingError loadingError = null;
        Updater.LaunchedEffect(gapComposer, channelFlowBuilder, new zzmo((Flow) channelFlowBuilder, (Continuation) (false ? 1 : 0), (Object) this, (Object) mutableState2, 25));
        Unit unit = Unit.INSTANCE;
        int i2 = (i & 14) ^ 6;
        int i3 = 1;
        boolean changed = ((i2 > 4 && gapComposer.changed(this)) || (i & 6) == 4) | gapComposer.changed(mutableState);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue3;
        if (changed || rememberedValue3 == neverEqualPolicy) {
            RealActivityEmbeddedPresenter$models$1$1 realActivityEmbeddedPresenter$models$1$1 = new RealActivityEmbeddedPresenter$models$1$1(this, mutableState, false ? 1 : 0, i3);
            gapComposer.updateRememberedValue(realActivityEmbeddedPresenter$models$1$1);
            obj3 = realActivityEmbeddedPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj3);
        LoadingState loadingState = LoadingState.LOADING;
        IntermediateFeedState intermediateFeedState = new IntermediateFeedState(loadingState, false, EmptyList.INSTANCE);
        boolean z = (i2 > 4 && gapComposer.changed(this)) || (i & 6) == 4;
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue4;
        if (z || rememberedValue4 == neverEqualPolicy) {
            NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(this, false ? 1 : 0, 24);
            gapComposer.updateRememberedValue(networkFetcher$doFetch$2);
            obj4 = networkFetcher$doFetch$2;
        }
        MutableState produceState = Updater.produceState(intermediateFeedState, this, (Function2) obj4, gapComposer, (i << 3) & 112);
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy) {
            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(createCompositionCoroutineScope);
            obj5 = createCompositionCoroutineScope;
        }
        CoroutineScope coroutineScope = (CoroutineScope) obj5;
        boolean z2 = ((IntermediateFeedState) produceState.getValue()).loadingState == loadingState && ((standaloneCoroutine = this.loadMoreJob) == null || !standaloneCoroutine.isActive());
        boolean z3 = ((IntermediateFeedState) produceState.getValue()).hasMore && !((Boolean) mutableState2.getValue()).booleanValue();
        int i4 = WhenMappings.$EnumSwitchMapping$0[((IntermediateFeedState) produceState.getValue()).loadingState.ordinal()];
        ActivityEmbeddedPresenter$Configuration activityEmbeddedPresenter$Configuration = this.configuration;
        if (i4 == 1) {
            String str = activityEmbeddedPresenter$Configuration.customErrorMessage;
            if (str == null) {
                str = this.strings.get(R.string.activity_embedded_error_title);
            }
            loadingError = new ActivityEmbeddedViewModel.LoadingError(str);
        }
        ActivityEmbeddedViewModel.LoadingError loadingError2 = loadingError;
        gapComposer.startReplaceGroup(-1260214942);
        List list = ((IntermediateFeedState) produceState.getValue()).feedEntries;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((ActivityFeedEntry) ((Function2) it.next()).invoke(gapComposer, 0));
        }
        gapComposer.end(false);
        ActivityEmbeddedViewModel activityEmbeddedViewModel = new ActivityEmbeddedViewModel(z2, z3, loadingError2, arrayList, activityEmbeddedPresenter$Configuration.compact, activityEmbeddedPresenter$Configuration.showLoadingIndicator);
        boolean changedInstance = gapComposer.changedInstance(coroutineScope);
        if ((i2 <= 4 || !gapComposer.changed(this)) && (i & 6) != 4) {
            i3 = 0;
        }
        int i5 = (changedInstance ? 1 : 0) | i3;
        Object rememberedValue6 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue6;
        if (i5 != 0 || rememberedValue6 == neverEqualPolicy) {
            CombinedModifier$$ExternalSyntheticLambda0 combinedModifier$$ExternalSyntheticLambda0 = new CombinedModifier$$ExternalSyntheticLambda0(18, coroutineScope, this);
            gapComposer.updateRememberedValue(combinedModifier$$ExternalSyntheticLambda0);
            obj6 = combinedModifier$$ExternalSyntheticLambda0;
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) obj6, activityEmbeddedViewModel);
        gapComposer.end(false);
        return uiCallbackModel;
    }

    public final ActivityItemPresenter rememberActivityItemPresenter(ActivityItem activityItem, int i, GapComposer gapComposer) {
        boolean changed = gapComposer.changed(activityItem);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            ActivityItemOrigin activityItemOrigin = ActivityItemOrigin.MERCHANT_PROFILE;
            ActivityEmbeddedPresenter$Configuration activityEmbeddedPresenter$Configuration = this.configuration;
            Screen screen = activityEmbeddedPresenter$Configuration.screenArgs;
            ActivitiesManager.ActivityContext activityContext = activityEmbeddedPresenter$Configuration.activityContext;
            rememberedValue = this.activityItemPresenterFactory.create(this.navigator, activityItem, new ActivityItemPresentationContext(activityItemOrigin, i, screen, activityContext.activityScope, activityContext.activityToken, activityEmbeddedPresenter$Configuration.secondaryLabelMaxLines), activityEmbeddedPresenter$Configuration.activityItemEventHandlerFactory, new NetworkFetcher$fetch$2(1, this.feedCallbackEvents, StateFlowKt.class, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V", 1, 21));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (ActivityItemPresenter) rememberedValue;
    }
}
