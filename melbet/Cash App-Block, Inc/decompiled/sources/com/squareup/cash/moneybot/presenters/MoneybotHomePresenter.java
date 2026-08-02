package com.squareup.cash.moneybot.presenters;

import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.SwipeKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.db.InvestingNewsArticleQueries$articles$2;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderableTapAction;
import com.squareup.cash.moneybot.backend.api.model.chat.Widget;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.GroupingKt__GroupingJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotHomePresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object analyticsService;
    public final Object contentExceededLoadTime$delegate;
    public final Object currentNbaIndex$delegate;
    public final ErrorReporter errorReporter;
    public final Parcelable failedToLoadHome$delegate;
    public final Object loadableNbas$delegate;
    public final Object moneybotFlagsHelper;
    public final Object moneybotPromptManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object nextBestActionManager;
    public final Object pluginRegistry;
    public final Object router;
    public boolean shouldAnimateHomeEntrance;
    public final Object tabToolbarPresenter;
    public final Object widgetManager;
    public final Object widgets$delegate;

    public MoneybotHomePresenter(BetterNavigator.ScreenNavigator screenNavigator, RealMoneybotAnalyticsService realMoneybotAnalyticsService, EglCore eglCore, RealUuidGenerator realUuidGenerator, RealMoneybotWidgetManager realMoneybotWidgetManager, RealMoneybotPromptManager realMoneybotPromptManager, MoneybotFlagsHelper moneybotFlagsHelper, ClientRenderablePluginRegistry clientRenderablePluginRegistry, ErrorReporter errorReporter, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        boolean z = false;
        this.$r8$classId = 0;
        this.navigator = screenNavigator;
        this.analyticsService = realMoneybotAnalyticsService;
        this.nextBestActionManager = eglCore;
        this.widgetManager = realMoneybotWidgetManager;
        this.moneybotPromptManager = realMoneybotPromptManager;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.pluginRegistry = clientRenderablePluginRegistry;
        this.errorReporter = errorReporter;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.tabToolbarPresenter = tabToolbarPresenter$Factory$Impl.create(screenNavigator, MoneybotHomeScreen.INSTANCE);
        this.loadableNbas$delegate = Updater.mutableStateOf$default(Loadable.Loading.INSTANCE);
        this.currentNbaIndex$delegate = Updater.mutableStateOf$default(0);
        this.widgets$delegate = Updater.mutableStateOf$default(EmptyList.INSTANCE);
        this.failedToLoadHome$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        if (isContentLoading() && moneybotFlagsHelper.loadingDelayMs() == 0) {
            z = true;
        }
        this.contentExceededLoadTime$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
    }

    public static final ScreenSource access$getSourceType(MoneybotHomePresenter moneybotHomePresenter, NewsKind newsKind) {
        if ((newsKind instanceof NewsKind.StocksPortfolio) || Intrinsics.areEqual(newsKind, NewsKind.BitcoinPortfolio.INSTANCE)) {
            return ScreenSource.PORTFOLIO;
        }
        if (newsKind instanceof NewsKind.Stock) {
            return ScreenSource.STOCK_DETAIL;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadContent(MoneybotHomePresenter moneybotHomePresenter, CoroutineScope coroutineScope, String str, ContinuationImpl continuationImpl) {
        MoneybotHomePresenter$loadContent$1 moneybotHomePresenter$loadContent$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        DeferredCoroutine async$default;
        Job job;
        Object await;
        ApiResult apiResult;
        ApiResult apiResult2;
        MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) moneybotHomePresenter.moneybotFlagsHelper;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) moneybotHomePresenter.loadableNbas$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = (ParcelableSnapshotMutableState) moneybotHomePresenter.failedToLoadHome$delegate;
        if (continuationImpl instanceof MoneybotHomePresenter$loadContent$1) {
            moneybotHomePresenter$loadContent$1 = (MoneybotHomePresenter$loadContent$1) continuationImpl;
            int i2 = moneybotHomePresenter$loadContent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotHomePresenter$loadContent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = moneybotHomePresenter$loadContent$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotHomePresenter$loadContent$1.label;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
                    int i4 = 0;
                    ((ParcelableSnapshotMutableState) moneybotHomePresenter.contentExceededLoadTime$delegate).setValue(Boolean.valueOf(moneybotFlagsHelper.loadingDelayMs() == 0));
                    JobKt.launch$default(coroutineScope, null, null, new MoneybotHomePresenter$loadContent$2(moneybotHomePresenter, continuation, i4), 3);
                    StandaloneCoroutine launch$default = moneybotFlagsHelper.loadingDelayMs() > 0 ? JobKt.launch$default(coroutineScope, null, null, new MoneybotHomePresenter$loadContent$2(moneybotHomePresenter, continuation, i3), 3) : null;
                    DeferredCoroutine async$default2 = JobKt.async$default(coroutineScope, null, null, new MoneybotHomePresenter$loadContent$nbaDeferred$1(moneybotHomePresenter, str, continuation, i4), 3);
                    async$default = JobKt.async$default(coroutineScope, null, null, new MoneybotHomePresenter$loadContent$nbaDeferred$1(moneybotHomePresenter, str, continuation, i3), 3);
                    moneybotHomePresenter$loadContent$1.L$2 = launch$default;
                    moneybotHomePresenter$loadContent$1.L$4 = async$default;
                    moneybotHomePresenter$loadContent$1.label = 1;
                    Object awaitInternal = async$default2.awaitInternal(moneybotHomePresenter$loadContent$1);
                    if (awaitInternal != coroutineSingletons) {
                        StandaloneCoroutine standaloneCoroutine = launch$default;
                        obj = awaitInternal;
                        job = standaloneCoroutine;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    apiResult = moneybotHomePresenter$loadContent$1.L$5;
                    job = moneybotHomePresenter$loadContent$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    apiResult2 = (ApiResult) obj;
                    if (job != null) {
                        job.cancel(null);
                    }
                    if (!(apiResult instanceof ApiResult.Failure) && (apiResult2 instanceof ApiResult.Failure)) {
                        parcelableSnapshotMutableState2.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                        parcelableSnapshotMutableState.setValue(new Loadable.Failed(((ApiResult.Failure.NetworkFailure) apiResult).error));
                    } else if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        parcelableSnapshotMutableState.setValue(new Loadable.Failed(new Throwable("Failed to load NBA")));
                    }
                    if (apiResult2 instanceof ApiResult.Failure) {
                        ((ParcelableSnapshotMutableState) moneybotHomePresenter.widgets$delegate).setValue(EmptyList.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
                async$default = moneybotHomePresenter$loadContent$1.L$4;
                job = moneybotHomePresenter$loadContent$1.L$2;
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult3 = (ApiResult) obj;
                moneybotHomePresenter$loadContent$1.L$2 = job;
                moneybotHomePresenter$loadContent$1.L$4 = null;
                moneybotHomePresenter$loadContent$1.L$5 = apiResult3;
                moneybotHomePresenter$loadContent$1.label = 2;
                await = async$default.await(moneybotHomePresenter$loadContent$1);
                if (await != coroutineSingletons) {
                    obj = await;
                    apiResult = apiResult3;
                    apiResult2 = (ApiResult) obj;
                    if (job != null) {
                    }
                    if (!(apiResult instanceof ApiResult.Failure)) {
                    }
                    if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    }
                    if (apiResult2 instanceof ApiResult.Failure) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        moneybotHomePresenter$loadContent$1 = new MoneybotHomePresenter$loadContent$1(moneybotHomePresenter, continuationImpl);
        Object obj2 = moneybotHomePresenter$loadContent$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotHomePresenter$loadContent$1.label;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ApiResult apiResult32 = (ApiResult) obj2;
        moneybotHomePresenter$loadContent$1.L$2 = job;
        moneybotHomePresenter$loadContent$1.L$4 = null;
        moneybotHomePresenter$loadContent$1.L$5 = apiResult32;
        moneybotHomePresenter$loadContent$1.label = 2;
        await = async$default.await(moneybotHomePresenter$loadContent$1);
        if (await != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static String getAnalyticsName(NewsKind newsKind) {
        if (newsKind instanceof NewsKind.StocksPortfolio) {
            return "PORTFOLIO";
        }
        if (newsKind instanceof NewsKind.BitcoinPortfolio) {
            return "BITCOIN";
        }
        if (newsKind instanceof NewsKind.Stock) {
            return "STOCK_DETAIL";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public boolean isContentLoading() {
        return (((Loadable) ((ParcelableSnapshotMutableState) this.loadableNbas$delegate).getValue()) instanceof Loadable.Loading) && ((List) ((ParcelableSnapshotMutableState) this.widgets$delegate).getValue()).isEmpty() && !((Boolean) ((ParcelableSnapshotMutableState) this.failedToLoadHome$delegate).getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Loadable loadable;
        boolean z;
        Object obj;
        Iterator it;
        Loadable loadable2;
        String str;
        boolean z2;
        boolean changedInstance;
        Object rememberedValue;
        UiCallbackModel rememberCallbackModel;
        MoneybotHomeViewEvent.WidgetTapAction chatKickoff;
        UiCallbackModel uiCallbackModel;
        MoneybotHomeViewModel.WidgetCard.Action action;
        MoneybotHomeViewModel.WidgetCard widgetCard;
        int i2 = this.$r8$classId;
        Object obj2 = this.loadableNbas$delegate;
        Object obj3 = this.tabToolbarPresenter;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.widgets$delegate;
        Continuation continuation = null;
        Parcelable parcelable = this.failedToLoadHome$delegate;
        byte b = 0;
        switch (i2) {
            case 0:
                int i3 = 23;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) obj4;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1519674664);
                Object[] objArr = new Object[0];
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda6(14);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 48);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer.consume(MoleculePresenterKt.LocalPresenterLifecycleOwner);
                int i4 = 48 ^ (i & 112);
                boolean changed = ((i4 > 32 && gapComposer.changed(this)) || (i & 48) == 32) | gapComposer.changed(mutableState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new MusicViewKt$$ExternalSyntheticLambda6(4, this, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                SwipeKt.SwipeHandler(this, (Function1) rememberedValue3, gapComposer, (i >> 3) & 14);
                String str2 = (String) mutableState.getValue();
                boolean changed2 = ((i4 > 32 && gapComposer.changed(this)) || (i & 48) == 32) | gapComposer.changed(mutableState) | gapComposer.changedInstance(lifecycleOwner);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new MoneybotHomePresenter$models$2$1(mutableState, lifecycleOwner, this, null);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect(gapComposer, str2, (Function2) rememberedValue4);
                Continuation continuation2 = null;
                Updater.LaunchedEffect(gapComposer, flow, new MusicPresenter$models$1$1(flow, continuation2, (MoleculePresenter) this, mutableState, 13));
                Object rememberedValue5 = gapComposer.rememberedValue();
                int i5 = 10;
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new RealActivityInvitePresenter(i3, new NullStateSwipeConfigProvider(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, i5), 5), this, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                TabToolbarInternalViewModel copy$default = TabToolbarInternalViewModel.copy$default(((TabToolbarPresenter) obj3).models((Flow) rememberedValue5, (Composer) gapComposer, 0), CollectionsKt__CollectionsJVMKt.listOf(new TabToolbarInternalViewModel.ImageButton(TabToolbarInternalViewModel.ToolbarButton.Id.MoneybotOverflowMenu, 0, TabToolbarInternalViewModel.ButtonBackgroundType.SOLID, 12)), null, null, 28);
                boolean canvasBackgroundEnabled = ((MoneybotFlagsHelper) this.moneybotFlagsHelper).canvasBackgroundEnabled();
                if (((Boolean) ((ParcelableSnapshotMutableState) parcelable).getValue()).booleanValue()) {
                    gapComposer.startReplaceGroup(625098576);
                    gapComposer.end(false);
                    obj = new MoneybotHomeViewModel.Error(copy$default, canvasBackgroundEnabled);
                    z = false;
                } else {
                    gapComposer.startReplaceGroup(625255157);
                    String str3 = (String) mutableState.getValue();
                    String str4 = str3 == null ? "" : str3;
                    int i6 = i << 6;
                    gapComposer.startReplaceGroup(-1009438985);
                    if (isContentLoading()) {
                        obj = new MoneybotHomeViewModel.Loading(copy$default, canvasBackgroundEnabled, ((Boolean) ((ParcelableSnapshotMutableState) this.contentExceededLoadTime$delegate).getValue()).booleanValue());
                        z = false;
                        gapComposer.end(false);
                    } else {
                        List list = (List) parcelableSnapshotMutableState.getValue();
                        Map eachCount = GroupingKt__GroupingJVMKt.eachCount(new zzb(list));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str5 = ((Widget) it2.next()).widgetId;
                            int intValue = ((Number) linkedHashMap.getOrDefault(str5, 0)).intValue();
                            linkedHashMap.put(str5, Integer.valueOf(intValue + 1));
                            Continuation continuation3 = continuation2;
                            if (((Number) MapsKt__MapsKt.getValue(eachCount, str5)).intValue() != 1 && intValue != 0) {
                                str5 = Boxes$$ExternalSyntheticOutline1.m(intValue, str5, "__dup_");
                            }
                            arrayList.add(str5);
                            continuation2 = continuation3;
                        }
                        ?? r16 = continuation2;
                        Loadable loadable3 = (Loadable) ((ParcelableSnapshotMutableState) obj2).getValue();
                        int i7 = (i6 & 7168) ^ 3072;
                        boolean z3 = (i7 > 2048 && gapComposer.changed(this)) || (i6 & 3072) == 2048;
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (z3 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new Overlay$$ExternalSyntheticLambda0(this, 1);
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        Function1 function1 = (Function1) rememberedValue6;
                        loadable3.getClass();
                        function1.getClass();
                        if (loadable3 instanceof Loadable.Loaded) {
                            loadable = new Loadable.Loaded(function1.invoke(((Loadable.Loaded) loadable3).value));
                        } else if (loadable3 instanceof Loadable.Failed) {
                            loadable = new Loadable.Failed(((Loadable.Failed) loadable3).error);
                        } else {
                            loadable = Loadable.Loading.INSTANCE;
                            if (!loadable3.equals(loadable)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        List list2 = (List) parcelableSnapshotMutableState.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = list2.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw r16;
                            }
                            Widget widget = (Widget) next;
                            String str6 = (String) arrayList.get(i8);
                            gapComposer.startReplaceGroup(-108344813);
                            ClientRenderable clientRenderable = widget.clientRenderable;
                            String str7 = widget.widgetId;
                            boolean z4 = clientRenderable instanceof ClientRenderable.PluginComponent;
                            TabToolbarInternalViewModel tabToolbarInternalViewModel = copy$default;
                            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                            boolean z5 = canvasBackgroundEnabled;
                            ErrorReporter errorReporter = this.errorReporter;
                            if (z4) {
                                it = it3;
                                ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) this.pluginRegistry;
                                ClientRenderable.PluginComponent pluginComponent = (ClientRenderable.PluginComponent) clientRenderable;
                                loadable2 = loadable;
                                ClientRenderType clientRenderType = pluginComponent.renderType;
                                clientRenderType.getClass();
                                ClientRenderablePlugin clientRenderablePlugin = (ClientRenderablePlugin) clientRenderablePluginRegistry.plugins.get(clientRenderType);
                                if (clientRenderablePlugin == null) {
                                    errorReporter.report(new GeneralMoneybotError("No plugin registered for widget " + str7 + " render type: " + clientRenderType), defaultSamplingStrategy);
                                    gapComposer.end(false);
                                } else {
                                    com.squareup.protos.cash.kgoose.api.v3.ClientRenderable clientRenderable2 = pluginComponent.proto;
                                    PluginContext pluginContext = new PluginContext(null, str4, null, MoneybotHomeScreen.INSTANCE, str6);
                                    String str8 = str4;
                                    if (i7 <= 2048 || !gapComposer.changed(this)) {
                                        str = str8;
                                        if ((i6 & 3072) != 2048) {
                                            z2 = false;
                                            changedInstance = z2 | gapComposer.changedInstance(widget) | gapComposer.changedInstance(clientRenderable);
                                            rememberedValue = gapComposer.rememberedValue();
                                            if (!changedInstance || rememberedValue == neverEqualPolicy) {
                                                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(3, this, widget, clientRenderable);
                                                gapComposer.updateRememberedValue(rememberedValue);
                                            }
                                            rememberCallbackModel = clientRenderablePlugin.rememberCallbackModel(clientRenderable2, null, pluginContext, this.navigator, null, rememberedValue, gapComposer, 16);
                                            if (rememberCallbackModel != null) {
                                                gapComposer.end(false);
                                                widgetCard = r16;
                                            } else {
                                                String str9 = widget.widgetId;
                                                ClientRenderType clientRenderType2 = pluginComponent.renderType;
                                                ClientRenderableTapAction tapAction = widget.clientRenderable.getTapAction();
                                                if (tapAction != null) {
                                                    chatKickoff = new MoneybotHomeViewEvent.WidgetTapAction.ClientRoute(tapAction.clientRoute);
                                                } else {
                                                    ChatKickoffParams chatKickoffParams = widget.kickoffParams;
                                                    chatKickoff = chatKickoffParams != null ? new MoneybotHomeViewEvent.WidgetTapAction.ChatKickoff(chatKickoffParams) : r16;
                                                }
                                                if (chatKickoff != null) {
                                                    uiCallbackModel = rememberCallbackModel;
                                                    action = new MoneybotHomeViewModel.WidgetCard.Action(new MoneybotHomeViewEvent.WidgetTapped(chatKickoff, str7));
                                                } else {
                                                    uiCallbackModel = rememberCallbackModel;
                                                    action = r16;
                                                }
                                                MoneybotHomeViewModel.WidgetCard widgetCard2 = new MoneybotHomeViewModel.WidgetCard(str9, str6, clientRenderType2, uiCallbackModel, action, !widget.permanent ? new MoneybotHomeViewModel.WidgetCard.Action(new MoneybotHomeViewEvent.DeleteWidget(str7)) : r16, new MoneybotHomeViewEvent.WidgetViewed(str7));
                                                gapComposer.end(false);
                                                widgetCard = widgetCard2;
                                            }
                                            if (widgetCard != null) {
                                                arrayList2.add(widgetCard);
                                            }
                                            str4 = str;
                                            copy$default = tabToolbarInternalViewModel;
                                            it3 = it;
                                            i8 = i9;
                                            canvasBackgroundEnabled = z5;
                                            loadable = loadable2;
                                        }
                                    } else {
                                        str = str8;
                                    }
                                    z2 = true;
                                    changedInstance = z2 | gapComposer.changedInstance(widget) | gapComposer.changedInstance(clientRenderable);
                                    rememberedValue = gapComposer.rememberedValue();
                                    if (!changedInstance) {
                                    }
                                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(3, this, widget, clientRenderable);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                    rememberCallbackModel = clientRenderablePlugin.rememberCallbackModel(clientRenderable2, null, pluginContext, this.navigator, null, rememberedValue, gapComposer, 16);
                                    if (rememberCallbackModel != null) {
                                    }
                                    if (widgetCard != null) {
                                    }
                                    str4 = str;
                                    copy$default = tabToolbarInternalViewModel;
                                    it3 = it;
                                    i8 = i9;
                                    canvasBackgroundEnabled = z5;
                                    loadable = loadable2;
                                }
                            } else {
                                it = it3;
                                errorReporter.report(new GeneralMoneybotError(CameraSelector$$ExternalSyntheticOutline0.m("Widget ", str7, " has unsupported client renderable type: ", Reflection.factory.getOrCreateKotlinClass(clientRenderable.getClass()).getSimpleName())), defaultSamplingStrategy);
                                gapComposer.end(false);
                                loadable2 = loadable;
                            }
                            widgetCard = r16;
                            str = str4;
                            if (widgetCard != null) {
                            }
                            str4 = str;
                            copy$default = tabToolbarInternalViewModel;
                            it3 = it;
                            i8 = i9;
                            canvasBackgroundEnabled = z5;
                            loadable = loadable2;
                        }
                        MoneybotHomeViewModel.Content content = new MoneybotHomeViewModel.Content(copy$default, canvasBackgroundEnabled, str4, loadable, arrayList2, this.shouldAnimateHomeEntrance);
                        z = false;
                        gapComposer.end(false);
                        obj = content;
                    }
                    gapComposer.end(z);
                }
                Object obj5 = obj;
                gapComposer.end(z);
                return obj5;
            default:
                NewsKind newsKind = (NewsKind) parcelable;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(156734269);
                InvestingState investingStates = ((RealInvestingStateManager) obj4).investingStates(gapComposer2);
                Object[] objArr2 = new Object[0];
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new ClusterItemKt$$ExternalSyntheticLambda0(19);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue7, gapComposer2, 48);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = ((RealBitcoinActivityProvider) obj3).hasBitcoinActivity();
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                int i10 = 23;
                Updater.LaunchedEffect(gapComposer2, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (Object) this, (Object) investingStates, (Object) Updater.collectAsState((Flow) rememberedValue8, Boolean.FALSE, null, gapComposer2, 48, 2), mutableState2, 13));
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new RealKeyStoreProvider$load$2(this, continuation, i10);
                    gapComposer2.updateRememberedValue(rememberedValue9);
                }
                Updater.LaunchedEffect(gapComposer2, newsKind, (Function2) rememberedValue9);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    GpsConfigQueries gpsConfigQueries = ((CashAccountDatabaseImpl) this.analyticsService).investingNewsArticleQueries;
                    gpsConfigQueries.getClass();
                    newsKind.getClass();
                    InvestingNewsArticleQueries$articles$2 investingNewsArticleQueries$articles$2 = InvestingNewsArticleQueries$articles$2.INSTANCE;
                    SafeFlow flow2 = DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, newsKind, new TooltipBoxKt$$ExternalSyntheticLambda2(gpsConfigQueries, b)));
                    CoroutineContext coroutineContext = (CoroutineContext) this.currentNbaIndex$delegate;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new InviteContactsPresenter$special$$inlined$map$1(DBUtil.mapToList(flow2, coroutineContext), this, 12), new GenieViewKt$GenieView$1$1(this, continuation, 6), 3);
                    int i11 = 2;
                    Flow flowOn = FlowKt.flowOn(new SafeFlow(new MusicPresenter$models$2$1(this, continuation, i11)), coroutineContext);
                    Duration.Companion companion = Duration.Companion;
                    rememberedValue10 = FlowKt.distinctUntilChanged(FlowKt.transformLatest(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i11, continuation, i10), new InviteContactsPresenter$filterContacts$$inlined$map$1((Flow) this.router, 25)), new AnchoredDraggableNode$drag$2(continuation, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.flowOn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowKt__MergeKt$flatMapConcat$$inlined$map$1, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i11, continuation, 24), TickerKt.m3996tickerFlowQTBD994$default(DurationKt.toDuration(1, DurationUnit.MINUTES))), new MulticastedPagingData$asPagingData$2(3, continuation, 7), b), (CoroutineContext) obj2), flowOn, new CardModelView$getActiveHeat$2$2(this, continuation, 14), b), 27)));
                    gapComposer2.updateRememberedValue(rememberedValue10);
                }
                InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) Updater.collectAsState((Flow) rememberedValue10, new InvestingCryptoNewsViewModel(EmptyList.INSTANCE, "", null), null, gapComposer2, 48, 2).getValue();
                gapComposer2.end(false);
                return investingCryptoNewsViewModel;
        }
    }

    public MoneybotHomePresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, AndroidStringManager androidStringManager, RealInvestingSyncer realInvestingSyncer, IntentLauncher intentLauncher, Analytics analytics, Flow flow, RealBitcoinActivityProvider realBitcoinActivityProvider, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, RealInvestingStateManager realInvestingStateManager, ErrorReporter errorReporter, BetterNavigator.ScreenNavigator screenNavigator, NewsKind newsKind, EquityType equityType, boolean z) {
        this.$r8$classId = 1;
        newsKind.getClass();
        this.analyticsService = cashAccountDatabaseImpl;
        this.nextBestActionManager = androidClock;
        this.widgetManager = androidStringManager;
        this.moneybotPromptManager = realInvestingSyncer;
        this.moneybotFlagsHelper = intentLauncher;
        this.pluginRegistry = analytics;
        this.router = flow;
        this.tabToolbarPresenter = realBitcoinActivityProvider;
        this.loadableNbas$delegate = coroutineContext;
        this.currentNbaIndex$delegate = coroutineContext2;
        this.widgets$delegate = realInvestingStateManager;
        this.errorReporter = errorReporter;
        this.navigator = screenNavigator;
        this.failedToLoadHome$delegate = newsKind;
        this.contentExceededLoadTime$delegate = equityType;
        this.shouldAnimateHomeEntrance = z;
    }
}
