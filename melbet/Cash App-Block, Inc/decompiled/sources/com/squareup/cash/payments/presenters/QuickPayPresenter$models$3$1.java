package com.squareup.cash.payments.presenters;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.compose.ui.graphics.BrushKt;
import androidx.core.math.MathUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.fidesmo.views.ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1;
import com.squareup.cash.fidesmo.views.ScanningStepAnimationTrigger;
import com.squareup.cash.fidesmo.views.StepTurnAnimationQueue;
import com.squareup.cash.instruments.backend.real.RealInstrumentSelectorManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.offers.backend.api.HomeResult;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.offers.presenters.OffersTabMapperKt;
import com.squareup.cash.offers.viewmodels.LegalTextViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeListingViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem;
import com.squareup.cash.offers.viewmodels.itemviewmodels.InfoTileViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHeaderViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSaleChipViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.PillViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.CLOClusterSection;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection$CategoryTile$Style$IconStyle;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection$CategoryTile$Style$ImageStyle;
import com.squareup.protos.cash.shop.rendering.api.ClusterInfoItem;
import com.squareup.protos.cash.shop.rendering.api.ClusterItem;
import com.squareup.protos.cash.shop.rendering.api.ClusterSection;
import com.squareup.protos.cash.shop.rendering.api.ClusterSize;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection$Content$CloClusterSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection$Content$ClusterSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection$Content$HeroSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection$Content$PillSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection$Content$TileSection;
import com.squareup.protos.cash.shop.rendering.api.OfferBadge;
import com.squareup.protos.cash.shop.rendering.api.PillSection;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.ui.Avatar;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import okhttp3.internal.Tags;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class QuickPayPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $balanceSnapshot$delegate;
    public final /* synthetic */ Object $hasActiveSponsorship$delegate;
    public final /* synthetic */ Object $hasPassedIdv;
    public /* synthetic */ Object $instrumentLinkingConfig;
    public final /* synthetic */ Object $instrumentSelection$delegate;
    public /* synthetic */ Object $instrumentSelectionRowViewModel$delegate;
    public final /* synthetic */ Object $instruments$delegate;
    public final /* synthetic */ Object $profile$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $state$delegate;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayPresenter$models$3$1(MutableState mutableState, MutableState mutableState2, QuickPayPresenter quickPayPresenter, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, Continuation continuation) {
        super(2, continuation);
        this.$instrumentLinkingConfig = mutableState;
        this.$hasPassedIdv = mutableState2;
        this.this$0 = quickPayPresenter;
        this.$state$delegate = mutableState3;
        this.$instrumentSelection$delegate = mutableState4;
        this.$profile$delegate = mutableState5;
        this.$balanceSnapshot$delegate = mutableState6;
        this.$instruments$delegate = mutableState7;
        this.$hasActiveSponsorship$delegate = mutableState8;
        this.$instrumentSelectionRowViewModel$delegate = mutableState9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$hasActiveSponsorship$delegate;
        Object obj3 = this.$instruments$delegate;
        Object obj4 = this.$balanceSnapshot$delegate;
        Object obj5 = this.$profile$delegate;
        Object obj6 = this.$instrumentSelection$delegate;
        Object obj7 = this.$state$delegate;
        Object obj8 = this.$hasPassedIdv;
        Object obj9 = this.this$0;
        switch (i) {
            case 0:
                return new QuickPayPresenter$models$3$1((MutableState) this.$instrumentLinkingConfig, (MutableState) obj8, (QuickPayPresenter) obj9, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, (MutableState) this.$instrumentSelectionRowViewModel$delegate, continuation);
            case 1:
                QuickPayPresenter$models$3$1 quickPayPresenter$models$3$1 = new QuickPayPresenter$models$3$1((ThemeSwitcherViewModel.Loaded) obj8, (Animatable) obj7, (Animatable) obj6, (Animatable) obj5, (Function1) obj4, (Animatable) obj3, (Animatable) obj2, (Animatable) this.$instrumentSelectionRowViewModel$delegate, (Animatable) obj9, continuation);
                quickPayPresenter$models$3$1.$instrumentLinkingConfig = obj;
                return quickPayPresenter$models$3$1;
            case 2:
                return new QuickPayPresenter$models$3$1((ScanningStepAnimationTrigger) obj5, (StepTurnAnimationQueue) obj4, (CoroutineScope) obj3, (Animatable) obj2, (Animatable) this.$instrumentSelectionRowViewModel$delegate, (MutableState) this.$instrumentLinkingConfig, (MutableState) obj8, (MutableFloatState) obj9, (MutableState) obj7, (MutableState) obj6, continuation);
            default:
                QuickPayPresenter$models$3$1 quickPayPresenter$models$3$12 = new QuickPayPresenter$models$3$1((OffersHomePresenter) obj9, (MutableState) this.$instrumentLinkingConfig, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
                quickPayPresenter$models$3$12.$instrumentSelectionRowViewModel$delegate = obj;
                return quickPayPresenter$models$3$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((QuickPayPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((QuickPayPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((QuickPayPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((QuickPayPresenter$models$3$1) create((HomeResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x058d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x072e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0735 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x07c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e A[LOOP:2: B:50:0x0168->B:52:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:? A[LOOP:13: B:516:0x07cb->B:536:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:? A[LOOP:12: B:503:0x079f->B:543:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fa  */
    /* JADX WARN: Type inference failed for: r4v24, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v30, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LegalTextViewModel legalTextViewModel;
        Object obj2;
        FormattedDetail formattedDetail;
        FormattedDetail formattedDetail2;
        ClusterInfoItem clusterInfoItem;
        HeroSection heroSection;
        PillSection pillSection;
        OffersSpanAction.EndLoading endLoading;
        RealOffersSpanManager realOffersSpanManager;
        HeroSection heroSection2;
        CategoryTileSection categoryTileSection;
        String str;
        ClusterSection clusterSection;
        long j;
        CLOClusterSection cLOClusterSection;
        CLOClusterSection cLOClusterSection2;
        int i;
        ?? r4;
        String str2;
        Object cLOClusterSectionViewModel;
        String str3;
        AnalyticsEvent analyticsEvent;
        ClusterSection clusterSection2;
        int i2;
        ?? r42;
        String str4;
        OffersSaleChipViewModel offersSaleChipViewModel;
        String str5;
        AnalyticsEvent analyticsEvent2;
        CategoryTileSection categoryTileSection2;
        CategoryTileSection.CategoryTile.IconStyle iconStyle;
        CategoryTileSection.CategoryTile.ImageStyle imageStyle;
        String str6;
        CategoryOffersTileViewModel categoryImageTileViewModel;
        zzle zzleVar;
        Image image;
        String str7;
        zzle zzleVar2;
        Image image2;
        Color color;
        String str8;
        zzle zzleVar3;
        HeroSection.HeroTile heroTile;
        PillSection pillSection2;
        Iterator it;
        UrlTapAction urlTapAction;
        Iterator it2;
        int i3 = this.$r8$classId;
        Object obj3 = this.$hasActiveSponsorship$delegate;
        Object obj4 = this.$instruments$delegate;
        Object obj5 = this.$profile$delegate;
        Object obj6 = this.$instrumentSelection$delegate;
        Object obj7 = this.$state$delegate;
        Object obj8 = this.$hasPassedIdv;
        Object obj9 = this.this$0;
        Object obj10 = this.$balanceSnapshot$delegate;
        switch (i3) {
            case 0:
                RealInstrumentSelectorManager realInstrumentSelectorManager = ((QuickPayPresenter) obj9).instrumentSelectorManager;
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj10;
                MutableState mutableState3 = (MutableState) obj8;
                MutableState mutableState4 = (MutableState) this.$instrumentLinkingConfig;
                MutableState mutableState5 = (MutableState) obj4;
                MutableState mutableState6 = (MutableState) obj5;
                MutableState mutableState7 = (MutableState) obj6;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState8 = (MutableState) obj7;
                List list = ((QuickPayState) mutableState8.getValue()).paymentGetters;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(MathUtils.toRecipient(zzahi.toRecipient((PaymentRecipient) it3.next())));
                }
                mutableState7.setValue(GoogleMapKt.loadInstrument(((QuickPayState) mutableState8.getValue()).orientation, arrayList, (InstrumentSelection) mutableState7.getValue(), (Profile) mutableState6.getValue(), null, ((QuickPayState) mutableState8.getValue()).amount, (BalanceSnapshot) mutableState2.getValue(), (List) mutableState5.getValue(), (InstrumentLinkingConfig) mutableState4.getValue(), (Boolean) mutableState3.getValue(), true, ((Boolean) mutableState.getValue()).booleanValue(), false));
                ((MutableState) this.$instrumentSelectionRowViewModel$delegate).setValue(realInstrumentSelectorManager.createInstrumentSelectionViewModel(realInstrumentSelectorManager.getToolbarSubtitle(((QuickPayState) mutableState8.getValue()).orientation, arrayList, (InstrumentSelection) mutableState7.getValue(), null, ((QuickPayState) mutableState8.getValue()).amount, (Profile) mutableState6.getValue(), (BalanceSnapshot) mutableState2.getValue(), (List) mutableState5.getValue(), (InstrumentLinkingConfig) mutableState4.getValue(), (Boolean) mutableState3.getValue(), ((Boolean) mutableState.getValue()).booleanValue(), false), realInstrumentSelectorManager.getToolbarCreditCardFee(((QuickPayState) mutableState8.getValue()).orientation, arrayList, (InstrumentSelection) mutableState7.getValue(), null, ((QuickPayState) mutableState8.getValue()).amount, (Profile) mutableState6.getValue(), (List) mutableState5.getValue(), (InstrumentLinkingConfig) mutableState4.getValue(), (Boolean) mutableState3.getValue(), ((Boolean) mutableState.getValue()).booleanValue()), arrayList, (InstrumentSelection) mutableState7.getValue(), null, ((QuickPayState) mutableState8.getValue()).orientation, (Profile) mutableState6.getValue(), (BalanceSnapshot) mutableState2.getValue(), (List) mutableState5.getValue(), (InstrumentLinkingConfig) mutableState4.getValue(), (Boolean) mutableState3.getValue(), ((QuickPayState) mutableState8.getValue()).amount, ((QuickPayState) mutableState8.getValue()).isPromptForInstrumentOpen, null, ((QuickPayState) mutableState8.getValue()).amount.currency_code, false));
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.$instrumentLinkingConfig;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ThemeSwitcherViewModel.Loaded loaded = (ThemeSwitcherViewModel.Loaded) obj8;
                if (loaded.previousTheme != null) {
                    JobKt.launch$default(coroutineScope, null, null, new RealImageLoader$execute$result$1(loaded, (Animatable) obj7, (Animatable) obj6, (Animatable) obj5, (Function1) obj10, null, 21), 3);
                    JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj4, null, 9), 3);
                    JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj3, null, 10), 3);
                    JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) this.$instrumentSelectionRowViewModel$delegate, null, 11), 3);
                    PaymentPadTheme paymentPadTheme = loaded.selectedTheme;
                    if (paymentPadTheme == PaymentPadTheme.GLITTER || paymentPadTheme == PaymentPadTheme.TORTOISE) {
                        JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj9, null, 12), 3);
                    }
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ScanningStepAnimationTrigger scanningStepAnimationTrigger = (ScanningStepAnimationTrigger) obj5;
                if (scanningStepAnimationTrigger != null) {
                    StepTurnAnimationQueue stepTurnAnimationQueue = (StepTurnAnimationQueue) obj10;
                    stepTurnAnimationQueue.pendingTurnCount += scanningStepAnimationTrigger.turnCount;
                    StandaloneCoroutine standaloneCoroutine = stepTurnAnimationQueue.animationJob;
                    if (standaloneCoroutine == null || !standaloneCoroutine.isActive()) {
                        StepTurnAnimationQueue stepTurnAnimationQueue2 = (StepTurnAnimationQueue) obj10;
                        stepTurnAnimationQueue2.animationJob = JobKt.launch$default((CoroutineScope) obj4, null, null, new ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1(stepTurnAnimationQueue2, (Animatable) obj3, (Animatable) this.$instrumentSelectionRowViewModel$delegate, (MutableState) this.$instrumentLinkingConfig, (MutableState) obj8, (MutableFloatState) obj9, (MutableState) obj7, (MutableState) obj6, null), 3);
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                MutableState mutableState9 = (MutableState) this.$instrumentLinkingConfig;
                OffersHomePresenter offersHomePresenter = (OffersHomePresenter) obj9;
                RealOffersSpanManager realOffersSpanManager2 = offersHomePresenter.spanManager;
                HomeResult homeResult = (HomeResult) this.$instrumentSelectionRowViewModel$delegate;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!(homeResult instanceof HomeResult.HomeLoading)) {
                    boolean z = homeResult instanceof HomeResult.HomeError;
                    OffersSpanAction.EndRootSpan endRootSpan = OffersSpanAction.EndRootSpan.INSTANCE;
                    OffersSpanAction.EndLoading endLoading2 = OffersSpanAction.EndLoading.INSTANCE;
                    if (z) {
                        mutableState9.setValue(OffersHomePresenter.access$constructHomeErrorViewModel(offersHomePresenter, ((HomeResult.HomeError) homeResult).result));
                        realOffersSpanManager2.onAction(endLoading2);
                        realOffersSpanManager2.onAction(endRootSpan);
                    } else if (!(homeResult instanceof HomeResult.HomeData)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        HomeResult.HomeData homeData = (HomeResult.HomeData) homeResult;
                        boolean z2 = homeData.hasValidCache;
                        if (!z2) {
                            realOffersSpanManager2.onAction(new OffersSpanAction.StartLoading("offers_browse_loading", false));
                        }
                        OffersTabHomeResponse offersTabHomeResponse = homeData.data;
                        MutableState mutableState10 = (MutableState) obj5;
                        MutableState mutableState11 = (MutableState) obj10;
                        MutableState mutableState12 = (MutableState) obj4;
                        MutableState mutableState13 = (MutableState) obj3;
                        offersTabHomeResponse.getClass();
                        List list2 = offersTabHomeResponse.sections;
                        String str9 = offersTabHomeResponse.search_bar_placeholder_text;
                        str9.getClass();
                        ((MutableState) obj8).setValue(str9);
                        String str10 = (String) ((MutableState) obj7).getValue();
                        String str11 = (String) ((MutableState) obj6).getValue();
                        long millis = offersHomePresenter.clock.millis();
                        str11.getClass();
                        List list3 = list2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                HomeSection homeSection = (HomeSection) it4.next();
                                homeSection.getClass();
                                List list4 = list3;
                                zzku zzkuVar = homeSection.content;
                                Iterator it5 = it4;
                                String str12 = homeSection.section_id;
                                OffersSpanAction.EndRootSpan endRootSpan2 = endRootSpan;
                                AnalyticsEvent analyticsEvent3 = homeSection.analytics_view_event;
                                if (zzkuVar != null) {
                                    HomeSection$Content$PillSection homeSection$Content$PillSection = zzkuVar instanceof HomeSection$Content$PillSection ? (HomeSection$Content$PillSection) zzkuVar : null;
                                    if (homeSection$Content$PillSection != null) {
                                        pillSection = homeSection$Content$PillSection.value;
                                        if (pillSection == null) {
                                            str12.getClass();
                                            if (analyticsEvent3 == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: content?.pill_section.analytics_view_event == null");
                                                break;
                                            } else {
                                                OffersAnalyticsEventSpec offersAnalyticsEventSpec = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent3);
                                                if (zzkuVar != null) {
                                                    HomeSection$Content$PillSection homeSection$Content$PillSection2 = zzkuVar instanceof HomeSection$Content$PillSection ? (HomeSection$Content$PillSection) zzkuVar : null;
                                                    if (homeSection$Content$PillSection2 != null) {
                                                        pillSection2 = homeSection$Content$PillSection2.value;
                                                        pillSection2.getClass();
                                                        List list5 = pillSection2.pills;
                                                        endLoading = endLoading2;
                                                        realOffersSpanManager = realOffersSpanManager2;
                                                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                                        it = list5.iterator();
                                                        while (it.hasNext()) {
                                                            PillSection.Pill pill = (PillSection.Pill) it.next();
                                                            AnalyticsEvent analyticsEvent4 = pill.analytics_view_event;
                                                            Iterator it6 = it;
                                                            TapAction tapAction = pill.tap_action;
                                                            if (analyticsEvent4 == null) {
                                                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: pill.analytics_view_event == null");
                                                                break;
                                                            } else {
                                                                OffersAnalyticsEventSpec offersAnalyticsEventSpec2 = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent4);
                                                                String str13 = pill.text;
                                                                str13.getClass();
                                                                Color color2 = pill.background_color;
                                                                tapAction.getClass();
                                                                zzle zzleVar4 = tapAction.action;
                                                                if (zzleVar4 != null) {
                                                                    TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar4 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar4 : null;
                                                                    if (tapAction$Action$UrlAction != null) {
                                                                        urlTapAction = tapAction$Action$UrlAction.value;
                                                                        urlTapAction.getClass();
                                                                        String str14 = urlTapAction.action_url;
                                                                        str14.getClass();
                                                                        List list6 = tapAction.analytics_tap_events;
                                                                        PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
                                                                        for (it2 = list6.iterator(); it2.hasNext(); it2 = it2) {
                                                                            builder.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it2.next()));
                                                                        }
                                                                        arrayList3.add(new PillViewModel(offersAnalyticsEventSpec2, str13, color2, color2, str14, builder.build()));
                                                                        it = it6;
                                                                    }
                                                                }
                                                                urlTapAction = null;
                                                                urlTapAction.getClass();
                                                                String str142 = urlTapAction.action_url;
                                                                str142.getClass();
                                                                List list62 = tapAction.analytics_tap_events;
                                                                PersistentVectorBuilder builder2 = SmallPersistentVector.EMPTY.builder();
                                                                while (it2.hasNext()) {
                                                                }
                                                                arrayList3.add(new PillViewModel(offersAnalyticsEventSpec2, str13, color2, color2, str142, builder2.build()));
                                                                it = it6;
                                                            }
                                                        }
                                                        cLOClusterSectionViewModel = new OffersHomeListItemViewModel.CategoryPillsSectionViewModel(str12, offersAnalyticsEventSpec, Tags.toPersistentList(arrayList3));
                                                        str = str10;
                                                        j = millis;
                                                    }
                                                }
                                                pillSection2 = null;
                                                pillSection2.getClass();
                                                List list52 = pillSection2.pills;
                                                endLoading = endLoading2;
                                                realOffersSpanManager = realOffersSpanManager2;
                                                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list52, 10));
                                                it = list52.iterator();
                                                while (it.hasNext()) {
                                                }
                                                cLOClusterSectionViewModel = new OffersHomeListItemViewModel.CategoryPillsSectionViewModel(str12, offersAnalyticsEventSpec, Tags.toPersistentList(arrayList32));
                                                str = str10;
                                                j = millis;
                                            }
                                        } else {
                                            endLoading = endLoading2;
                                            realOffersSpanManager = realOffersSpanManager2;
                                            if (zzkuVar != null) {
                                                HomeSection$Content$HeroSection homeSection$Content$HeroSection = zzkuVar instanceof HomeSection$Content$HeroSection ? (HomeSection$Content$HeroSection) zzkuVar : null;
                                                if (homeSection$Content$HeroSection != null) {
                                                    heroSection2 = homeSection$Content$HeroSection.value;
                                                    if (heroSection2 == null) {
                                                        if (zzkuVar != null) {
                                                            HomeSection$Content$HeroSection homeSection$Content$HeroSection2 = zzkuVar instanceof HomeSection$Content$HeroSection ? (HomeSection$Content$HeroSection) zzkuVar : null;
                                                            HeroSection heroSection3 = homeSection$Content$HeroSection2 != null ? homeSection$Content$HeroSection2.value : null;
                                                            if (heroSection3 != null) {
                                                                heroTile = AndroidTileMode_androidKt.currentEffectiveHeroTile(heroSection3, millis);
                                                                if (analyticsEvent3 != null) {
                                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: content?.hero_section analytics_view_event is null");
                                                                    break;
                                                                } else {
                                                                    cLOClusterSectionViewModel = heroTile != null ? AndroidTileMode_androidKt.toHeroTileListItemViewModel(heroTile, str10, ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent3)) : OffersHomeListItemViewModel.HeroOffersTileViewModel.Placeholder.INSTANCE;
                                                                    str = str10;
                                                                    j = millis;
                                                                }
                                                            }
                                                        }
                                                        heroTile = null;
                                                        if (analyticsEvent3 != null) {
                                                        }
                                                    } else {
                                                        if (zzkuVar != null) {
                                                            HomeSection$Content$TileSection homeSection$Content$TileSection = zzkuVar instanceof HomeSection$Content$TileSection ? (HomeSection$Content$TileSection) zzkuVar : null;
                                                            if (homeSection$Content$TileSection != null) {
                                                                categoryTileSection = homeSection$Content$TileSection.value;
                                                                if (categoryTileSection == null) {
                                                                    SectionHeader sectionHeader = homeSection.section_header;
                                                                    sectionHeader.getClass();
                                                                    str12.getClass();
                                                                    OffersHeaderViewModel headerViewModel = OffersTabMapperKt.toHeaderViewModel(sectionHeader, str12);
                                                                    if (analyticsEvent3 == null) {
                                                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: category_tile_section.analytics_view_event == null");
                                                                        break;
                                                                    } else {
                                                                        OffersAnalyticsEventSpec offersAnalyticsEventSpec3 = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent3);
                                                                        if (zzkuVar != null) {
                                                                            HomeSection$Content$TileSection homeSection$Content$TileSection2 = zzkuVar instanceof HomeSection$Content$TileSection ? (HomeSection$Content$TileSection) zzkuVar : null;
                                                                            if (homeSection$Content$TileSection2 != null) {
                                                                                categoryTileSection2 = homeSection$Content$TileSection2.value;
                                                                                categoryTileSection2.getClass();
                                                                                List<CategoryTileSection.CategoryTile> list7 = categoryTileSection2.tiles;
                                                                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                                                                for (CategoryTileSection.CategoryTile categoryTile : list7) {
                                                                                    zzkq zzkqVar = categoryTile.style;
                                                                                    OffersHeaderViewModel offersHeaderViewModel = headerViewModel;
                                                                                    AnalyticsEvent analyticsEvent5 = categoryTile.analytics_view_event;
                                                                                    TapAction tapAction2 = categoryTile.tap_action;
                                                                                    String str15 = str10;
                                                                                    StyledText styledText = categoryTile.title;
                                                                                    if (zzkqVar != null) {
                                                                                        CategoryTileSection$CategoryTile$Style$IconStyle categoryTileSection$CategoryTile$Style$IconStyle = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle ? (CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar : null;
                                                                                        if (categoryTileSection$CategoryTile$Style$IconStyle != null) {
                                                                                            iconStyle = categoryTileSection$CategoryTile$Style$IconStyle.value;
                                                                                            if (iconStyle != null) {
                                                                                                if (zzkqVar != null) {
                                                                                                    CategoryTileSection$CategoryTile$Style$ImageStyle categoryTileSection$CategoryTile$Style$ImageStyle = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$ImageStyle ? (CategoryTileSection$CategoryTile$Style$ImageStyle) zzkqVar : null;
                                                                                                    if (categoryTileSection$CategoryTile$Style$ImageStyle != null) {
                                                                                                        imageStyle = categoryTileSection$CategoryTile$Style$ImageStyle.value;
                                                                                                        if (imageStyle != null) {
                                                                                                            if (analyticsEvent5 == null) {
                                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                break;
                                                                                                            } else {
                                                                                                                OffersAnalyticsEventSpec offersAnalyticsEventSpec4 = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent5);
                                                                                                                if (styledText == null) {
                                                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                    break;
                                                                                                                } else {
                                                                                                                    Image image3 = categoryTile.picture;
                                                                                                                    if (image3 == null) {
                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        if (tapAction2 != null && (zzleVar = tapAction2.action) != null) {
                                                                                                                            TapAction$Action$UrlAction tapAction$Action$UrlAction2 = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                                                                                                                            UrlTapAction urlTapAction2 = tapAction$Action$UrlAction2 != null ? tapAction$Action$UrlAction2.value : null;
                                                                                                                            if (urlTapAction2 != null) {
                                                                                                                                str6 = urlTapAction2.action_url;
                                                                                                                                if (str6 != null) {
                                                                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                                    break;
                                                                                                                                } else {
                                                                                                                                    List list8 = tapAction2 != null ? tapAction2.analytics_tap_events : null;
                                                                                                                                    if (list8 == null) {
                                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                                        break;
                                                                                                                                    } else {
                                                                                                                                        PersistentVectorBuilder builder3 = SmallPersistentVector.EMPTY.builder();
                                                                                                                                        Iterator it7 = list8.iterator();
                                                                                                                                        while (it7.hasNext()) {
                                                                                                                                            builder3.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it7.next()));
                                                                                                                                        }
                                                                                                                                        categoryImageTileViewModel = new CategoryOffersTileViewModel.CategoryImageTileViewModel(offersAnalyticsEventSpec4, styledText, str6, builder3.build(), image3);
                                                                                                                                        arrayList4.add(categoryImageTileViewModel);
                                                                                                                                        headerViewModel = offersHeaderViewModel;
                                                                                                                                        str10 = str15;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        str6 = null;
                                                                                                                        if (str6 != null) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else if (analyticsEvent5 == null) {
                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                            break;
                                                                                                        } else {
                                                                                                            OffersAnalyticsEventSpec offersAnalyticsEventSpec5 = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent5);
                                                                                                            if (styledText == null) {
                                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                break;
                                                                                                            } else {
                                                                                                                if (zzkqVar != null) {
                                                                                                                    CategoryTileSection$CategoryTile$Style$ImageStyle categoryTileSection$CategoryTile$Style$ImageStyle2 = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$ImageStyle ? (CategoryTileSection$CategoryTile$Style$ImageStyle) zzkqVar : null;
                                                                                                                    CategoryTileSection.CategoryTile.ImageStyle imageStyle2 = categoryTileSection$CategoryTile$Style$ImageStyle2 != null ? categoryTileSection$CategoryTile$Style$ImageStyle2.value : null;
                                                                                                                    if (imageStyle2 != null) {
                                                                                                                        image = imageStyle2.background_image;
                                                                                                                        if (image != null) {
                                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                            break;
                                                                                                                        } else {
                                                                                                                            if (tapAction2 != null && (zzleVar2 = tapAction2.action) != null) {
                                                                                                                                TapAction$Action$UrlAction tapAction$Action$UrlAction3 = zzleVar2 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar2 : null;
                                                                                                                                UrlTapAction urlTapAction3 = tapAction$Action$UrlAction3 != null ? tapAction$Action$UrlAction3.value : null;
                                                                                                                                if (urlTapAction3 != null) {
                                                                                                                                    str7 = urlTapAction3.action_url;
                                                                                                                                    if (str7 != null) {
                                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                                        break;
                                                                                                                                    } else {
                                                                                                                                        List list9 = tapAction2 != null ? tapAction2.analytics_tap_events : null;
                                                                                                                                        if (list9 == null) {
                                                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                                            break;
                                                                                                                                        } else {
                                                                                                                                            PersistentVectorBuilder builder4 = SmallPersistentVector.EMPTY.builder();
                                                                                                                                            Iterator it8 = list9.iterator();
                                                                                                                                            while (it8.hasNext()) {
                                                                                                                                                builder4.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it8.next()));
                                                                                                                                            }
                                                                                                                                            categoryImageTileViewModel = new CategoryOffersTileViewModel.CategoryImageTileViewModel(offersAnalyticsEventSpec5, styledText, str7, builder4.build(), image);
                                                                                                                                            arrayList4.add(categoryImageTileViewModel);
                                                                                                                                            headerViewModel = offersHeaderViewModel;
                                                                                                                                            str10 = str15;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            str7 = null;
                                                                                                                            if (str7 != null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                image = null;
                                                                                                                if (image != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                imageStyle = null;
                                                                                                if (imageStyle != null) {
                                                                                                }
                                                                                            } else if (analyticsEvent5 == null) {
                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                break;
                                                                                            } else {
                                                                                                OffersAnalyticsEventSpec offersAnalyticsEventSpec6 = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent5);
                                                                                                if (styledText == null) {
                                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                    break;
                                                                                                } else {
                                                                                                    if (zzkqVar != null) {
                                                                                                        CategoryTileSection$CategoryTile$Style$IconStyle categoryTileSection$CategoryTile$Style$IconStyle2 = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle ? (CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar : null;
                                                                                                        CategoryTileSection.CategoryTile.IconStyle iconStyle2 = categoryTileSection$CategoryTile$Style$IconStyle2 != null ? categoryTileSection$CategoryTile$Style$IconStyle2.value : null;
                                                                                                        if (iconStyle2 != null) {
                                                                                                            image2 = iconStyle2.icon;
                                                                                                            if (image2 != null) {
                                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                break;
                                                                                                            } else {
                                                                                                                if (zzkqVar != null) {
                                                                                                                    CategoryTileSection$CategoryTile$Style$IconStyle categoryTileSection$CategoryTile$Style$IconStyle3 = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle ? (CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar : null;
                                                                                                                    CategoryTileSection.CategoryTile.IconStyle iconStyle3 = categoryTileSection$CategoryTile$Style$IconStyle3 != null ? categoryTileSection$CategoryTile$Style$IconStyle3.value : null;
                                                                                                                    if (iconStyle3 != null) {
                                                                                                                        color = iconStyle3.background_color;
                                                                                                                        if (color != null) {
                                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                            break;
                                                                                                                        } else {
                                                                                                                            if (tapAction2 != null && (zzleVar3 = tapAction2.action) != null) {
                                                                                                                                TapAction$Action$UrlAction tapAction$Action$UrlAction4 = zzleVar3 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar3 : null;
                                                                                                                                UrlTapAction urlTapAction4 = tapAction$Action$UrlAction4 != null ? tapAction$Action$UrlAction4.value : null;
                                                                                                                                if (urlTapAction4 != null) {
                                                                                                                                    str8 = urlTapAction4.action_url;
                                                                                                                                    if (str8 != null) {
                                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                                        break;
                                                                                                                                    } else {
                                                                                                                                        List list10 = tapAction2 != null ? tapAction2.analytics_tap_events : null;
                                                                                                                                        if (list10 == null) {
                                                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                                                                            break;
                                                                                                                                        } else {
                                                                                                                                            PersistentVectorBuilder builder5 = SmallPersistentVector.EMPTY.builder();
                                                                                                                                            Iterator it9 = list10.iterator();
                                                                                                                                            while (it9.hasNext()) {
                                                                                                                                                builder5.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it9.next()));
                                                                                                                                            }
                                                                                                                                            categoryImageTileViewModel = new CategoryOffersTileViewModel.CategoryIconTileViewModel(offersAnalyticsEventSpec6, styledText, str8, builder5.build(), image2, color);
                                                                                                                                            arrayList4.add(categoryImageTileViewModel);
                                                                                                                                            headerViewModel = offersHeaderViewModel;
                                                                                                                                            str10 = str15;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            str8 = null;
                                                                                                                            if (str8 != null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                color = null;
                                                                                                                if (color != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    image2 = null;
                                                                                                    if (image2 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    iconStyle = null;
                                                                                    if (iconStyle != null) {
                                                                                    }
                                                                                }
                                                                                str = str10;
                                                                                String str16 = str11;
                                                                                j = millis;
                                                                                cLOClusterSectionViewModel = new OffersHomeListItemViewModel.CategoryTilesSectionViewModel(str12, str16, offersAnalyticsEventSpec3, headerViewModel, Tags.toPersistentList(arrayList4));
                                                                                str2 = str16;
                                                                                arrayList2.add(cLOClusterSectionViewModel);
                                                                                str11 = str2;
                                                                                list3 = list4;
                                                                                it4 = it5;
                                                                                endRootSpan = endRootSpan2;
                                                                                endLoading2 = endLoading;
                                                                                realOffersSpanManager2 = realOffersSpanManager;
                                                                                millis = j;
                                                                                str10 = str;
                                                                            }
                                                                        }
                                                                        categoryTileSection2 = null;
                                                                        categoryTileSection2.getClass();
                                                                        List<CategoryTileSection.CategoryTile> list72 = categoryTileSection2.tiles;
                                                                        ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list72, 10));
                                                                        while (r4.hasNext()) {
                                                                        }
                                                                        str = str10;
                                                                        String str162 = str11;
                                                                        j = millis;
                                                                        cLOClusterSectionViewModel = new OffersHomeListItemViewModel.CategoryTilesSectionViewModel(str12, str162, offersAnalyticsEventSpec3, headerViewModel, Tags.toPersistentList(arrayList42));
                                                                        str2 = str162;
                                                                        arrayList2.add(cLOClusterSectionViewModel);
                                                                        str11 = str2;
                                                                        list3 = list4;
                                                                        it4 = it5;
                                                                        endRootSpan = endRootSpan2;
                                                                        endLoading2 = endLoading;
                                                                        realOffersSpanManager2 = realOffersSpanManager;
                                                                        millis = j;
                                                                        str10 = str;
                                                                    }
                                                                } else {
                                                                    str = str10;
                                                                    if (zzkuVar != null) {
                                                                        HomeSection$Content$ClusterSection homeSection$Content$ClusterSection = zzkuVar instanceof HomeSection$Content$ClusterSection ? (HomeSection$Content$ClusterSection) zzkuVar : null;
                                                                        if (homeSection$Content$ClusterSection != null) {
                                                                            clusterSection = homeSection$Content$ClusterSection.value;
                                                                            if (clusterSection == null) {
                                                                                if (zzkuVar != null) {
                                                                                    HomeSection$Content$ClusterSection homeSection$Content$ClusterSection2 = zzkuVar instanceof HomeSection$Content$ClusterSection ? (HomeSection$Content$ClusterSection) zzkuVar : null;
                                                                                    if (homeSection$Content$ClusterSection2 != null) {
                                                                                        clusterSection2 = homeSection$Content$ClusterSection2.value;
                                                                                        if (clusterSection2 != null) {
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: cluster home section cannot be null");
                                                                                            break;
                                                                                        } else {
                                                                                            List list11 = clusterSection2.cluster_items;
                                                                                            ClusterSize clusterSize = clusterSection2.cluster_size;
                                                                                            if (clusterSize == null) {
                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: clo cluster size cannot be null");
                                                                                                break;
                                                                                            } else {
                                                                                                int size = list11.size();
                                                                                                int ordinal = clusterSize.ordinal();
                                                                                                if (ordinal != 0) {
                                                                                                    j = millis;
                                                                                                    if (ordinal == 1) {
                                                                                                        i2 = 4;
                                                                                                    } else if (ordinal != 2) {
                                                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                        break;
                                                                                                    } else {
                                                                                                        i2 = 5;
                                                                                                    }
                                                                                                } else {
                                                                                                    j = millis;
                                                                                                    i2 = 3;
                                                                                                }
                                                                                                if (size >= i2) {
                                                                                                    ArrayList reorderItemsByRanking = BrushKt.reorderItemsByRanking(list11, clusterSize);
                                                                                                    r42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(reorderItemsByRanking, 10));
                                                                                                    Iterator it10 = reorderItemsByRanking.iterator();
                                                                                                    while (it10.hasNext()) {
                                                                                                        ClusterItem clusterItem = (ClusterItem) it10.next();
                                                                                                        Avatar avatar = clusterItem.avatar;
                                                                                                        TapAction tapAction3 = clusterItem.tap_action;
                                                                                                        if (avatar == null) {
                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: avatar was null");
                                                                                                            break;
                                                                                                        } else {
                                                                                                            LegacyOffersAvatarViewModel legacyOffersAvatarViewModel$default = OffersTabMapperKt.toLegacyOffersAvatarViewModel$default(avatar);
                                                                                                            String str17 = clusterItem.offer_token;
                                                                                                            if (str17 == null) {
                                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: offer token cannot be null");
                                                                                                                break;
                                                                                                            } else {
                                                                                                                OffersItemToken offersItemToken = OffersTabMapperKt.getOffersItemToken(clusterItem.business_token, clusterItem.engaged_token);
                                                                                                                StyledText styledText2 = clusterItem.subtitle;
                                                                                                                OfferBadge offerBadge = clusterItem.merchant_sale_badge;
                                                                                                                Iterator it11 = it10;
                                                                                                                if (offerBadge != null) {
                                                                                                                    StyledText styledText3 = offerBadge.title;
                                                                                                                    if (styledText3 == null) {
                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: sale chip title must not be null");
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        str4 = str17;
                                                                                                                        offersSaleChipViewModel = new OffersSaleChipViewModel(styledText3, offerBadge.background_color);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    str4 = str17;
                                                                                                                    offersSaleChipViewModel = null;
                                                                                                                }
                                                                                                                StyledText styledText4 = clusterItem.title;
                                                                                                                tapAction3.getClass();
                                                                                                                zzle zzleVar5 = tapAction3.action;
                                                                                                                if (zzleVar5 != null) {
                                                                                                                    TapAction$Action$UrlAction tapAction$Action$UrlAction5 = zzleVar5 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar5 : null;
                                                                                                                    UrlTapAction urlTapAction5 = tapAction$Action$UrlAction5 != null ? tapAction$Action$UrlAction5.value : null;
                                                                                                                    if (urlTapAction5 != null) {
                                                                                                                        str5 = urlTapAction5.action_url;
                                                                                                                        str5.getClass();
                                                                                                                        analyticsEvent2 = clusterItem.analytics_view_event;
                                                                                                                        if (analyticsEvent2 != null) {
                                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: cluster item analytics event is null");
                                                                                                                            break;
                                                                                                                        } else {
                                                                                                                            OffersAnalyticsEventSpec offersAnalyticsEventSpec7 = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent2);
                                                                                                                            List list12 = tapAction3.analytics_tap_events;
                                                                                                                            PersistentVectorBuilder builder6 = SmallPersistentVector.EMPTY.builder();
                                                                                                                            Iterator it12 = list12.iterator();
                                                                                                                            while (it12.hasNext()) {
                                                                                                                                builder6.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it12.next()));
                                                                                                                            }
                                                                                                                            r42.add(new ClusterItem.ClusterItemViewModel(legacyOffersAvatarViewModel$default, styledText4, styledText2, str5, str4, offersItemToken, offersSaleChipViewModel, builder6.build(), offersAnalyticsEventSpec7, clusterItem.boost_token, false));
                                                                                                                            it10 = it11;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                str5 = null;
                                                                                                                str5.getClass();
                                                                                                                analyticsEvent2 = clusterItem.analytics_view_event;
                                                                                                                if (analyticsEvent2 != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    r42 = EmptyList.INSTANCE;
                                                                                                }
                                                                                                AbstractPersistentList persistentList = Tags.toPersistentList((Iterable) r42);
                                                                                                if (str12 == null) {
                                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: section id was null");
                                                                                                    break;
                                                                                                } else {
                                                                                                    ClusterInfoItem clusterInfoItem2 = clusterSection2.info_item;
                                                                                                    if (clusterInfoItem2 == null) {
                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: info item was null");
                                                                                                        break;
                                                                                                    } else {
                                                                                                        InfoTileViewModel infoCollectionTile = BrushKt.toInfoCollectionTile(clusterInfoItem2);
                                                                                                        if (analyticsEvent3 == null) {
                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: impression event should not be null");
                                                                                                            break;
                                                                                                        } else {
                                                                                                            cLOClusterSectionViewModel = new OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel(str12, infoCollectionTile, persistentList, str11, ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent3));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                clusterSection2 = null;
                                                                                if (clusterSection2 != null) {
                                                                                }
                                                                            } else {
                                                                                j = millis;
                                                                                if (zzkuVar != null) {
                                                                                    HomeSection$Content$CloClusterSection homeSection$Content$CloClusterSection = zzkuVar instanceof HomeSection$Content$CloClusterSection ? (HomeSection$Content$CloClusterSection) zzkuVar : null;
                                                                                    if (homeSection$Content$CloClusterSection != null) {
                                                                                        cLOClusterSection = homeSection$Content$CloClusterSection.value;
                                                                                        if (cLOClusterSection != null) {
                                                                                            a$$ExternalSyntheticBUOutline0.m$1("Home Section must contain one non null section");
                                                                                            break;
                                                                                        } else {
                                                                                            if (zzkuVar != null) {
                                                                                                HomeSection$Content$CloClusterSection homeSection$Content$CloClusterSection2 = zzkuVar instanceof HomeSection$Content$CloClusterSection ? (HomeSection$Content$CloClusterSection) zzkuVar : null;
                                                                                                if (homeSection$Content$CloClusterSection2 != null) {
                                                                                                    cLOClusterSection2 = homeSection$Content$CloClusterSection2.value;
                                                                                                    if (cLOClusterSection2 != null) {
                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: clo cluster home section cannot be null");
                                                                                                        break;
                                                                                                    } else {
                                                                                                        List list13 = cLOClusterSection2.cluster_items;
                                                                                                        ClusterSize clusterSize2 = cLOClusterSection2.cluster_size;
                                                                                                        if (clusterSize2 == null) {
                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: clo cluster size cannot be null");
                                                                                                            break;
                                                                                                        } else {
                                                                                                            int size2 = list13.size();
                                                                                                            int ordinal2 = clusterSize2.ordinal();
                                                                                                            if (ordinal2 == 0) {
                                                                                                                i = 3;
                                                                                                            } else if (ordinal2 == 1) {
                                                                                                                i = 4;
                                                                                                            } else if (ordinal2 != 2) {
                                                                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                                break;
                                                                                                            } else {
                                                                                                                i = 5;
                                                                                                            }
                                                                                                            if (size2 >= i) {
                                                                                                                ArrayList reorderItemsByRanking2 = BrushKt.reorderItemsByRanking(list13, clusterSize2);
                                                                                                                r4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(reorderItemsByRanking2, 10));
                                                                                                                Iterator it13 = reorderItemsByRanking2.iterator();
                                                                                                                while (it13.hasNext()) {
                                                                                                                    com.squareup.protos.cash.shop.rendering.api.ClusterItem clusterItem2 = (com.squareup.protos.cash.shop.rendering.api.ClusterItem) it13.next();
                                                                                                                    Avatar avatar2 = clusterItem2.avatar;
                                                                                                                    TapAction tapAction4 = clusterItem2.tap_action;
                                                                                                                    if (avatar2 == null) {
                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: avatar was null");
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        LegacyOffersAvatarViewModel legacyOffersAvatarViewModel$default2 = OffersTabMapperKt.toLegacyOffersAvatarViewModel$default(avatar2);
                                                                                                                        StyledText styledText5 = clusterItem2.subtitle;
                                                                                                                        StyledText styledText6 = clusterItem2.title;
                                                                                                                        tapAction4.getClass();
                                                                                                                        zzle zzleVar6 = tapAction4.action;
                                                                                                                        Iterator it14 = it13;
                                                                                                                        if (zzleVar6 != null) {
                                                                                                                            TapAction$Action$UrlAction tapAction$Action$UrlAction6 = zzleVar6 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar6 : null;
                                                                                                                            UrlTapAction urlTapAction6 = tapAction$Action$UrlAction6 != null ? tapAction$Action$UrlAction6.value : null;
                                                                                                                            if (urlTapAction6 != null) {
                                                                                                                                str3 = urlTapAction6.action_url;
                                                                                                                                str3.getClass();
                                                                                                                                analyticsEvent = clusterItem2.analytics_view_event;
                                                                                                                                if (analyticsEvent != null) {
                                                                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: cluster item analytics event is null");
                                                                                                                                    break;
                                                                                                                                } else {
                                                                                                                                    OffersAnalyticsEventSpec offersAnalyticsEventSpec8 = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent);
                                                                                                                                    String str18 = clusterItem2.offer_token;
                                                                                                                                    if (str18 == null) {
                                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: offer token cannot be null");
                                                                                                                                        break;
                                                                                                                                    } else {
                                                                                                                                        OffersItemToken offersItemToken2 = OffersTabMapperKt.getOffersItemToken(clusterItem2.business_token, clusterItem2.engaged_token);
                                                                                                                                        List list14 = tapAction4.analytics_tap_events;
                                                                                                                                        PersistentVectorBuilder builder7 = SmallPersistentVector.EMPTY.builder();
                                                                                                                                        Iterator it15 = list14.iterator();
                                                                                                                                        while (it15.hasNext()) {
                                                                                                                                            builder7.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it15.next()));
                                                                                                                                        }
                                                                                                                                        AbstractPersistentList build = builder7.build();
                                                                                                                                        String str19 = clusterItem2.boost_token;
                                                                                                                                        if (str19 == null) {
                                                                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: boost token cannot be null");
                                                                                                                                            break;
                                                                                                                                        } else {
                                                                                                                                            r4.add(new ClusterItem.CLOClusterItemViewModel(legacyOffersAvatarViewModel$default2, styledText6, styledText5, str3, str18, offersItemToken2, null, build, offersAnalyticsEventSpec8, str19, false));
                                                                                                                                            it13 = it14;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        str3 = null;
                                                                                                                        str3.getClass();
                                                                                                                        analyticsEvent = clusterItem2.analytics_view_event;
                                                                                                                        if (analyticsEvent != null) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                r4 = EmptyList.INSTANCE;
                                                                                                            }
                                                                                                            AbstractPersistentList persistentList2 = Tags.toPersistentList((Iterable) r4);
                                                                                                            if (str12 == null) {
                                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: section id was null");
                                                                                                                break;
                                                                                                            } else {
                                                                                                                ClusterInfoItem clusterInfoItem3 = cLOClusterSection2.info_item;
                                                                                                                if (clusterInfoItem3 == null) {
                                                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: info item was null");
                                                                                                                    break;
                                                                                                                } else {
                                                                                                                    InfoTileViewModel infoCollectionTile2 = BrushKt.toInfoCollectionTile(clusterInfoItem3);
                                                                                                                    if (analyticsEvent3 == null) {
                                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: impression event should not be null");
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        str2 = str11;
                                                                                                                        cLOClusterSectionViewModel = new OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel(str12, infoCollectionTile2, persistentList2, str11, ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent3));
                                                                                                                        arrayList2.add(cLOClusterSectionViewModel);
                                                                                                                        str11 = str2;
                                                                                                                        list3 = list4;
                                                                                                                        it4 = it5;
                                                                                                                        endRootSpan = endRootSpan2;
                                                                                                                        endLoading2 = endLoading;
                                                                                                                        realOffersSpanManager2 = realOffersSpanManager;
                                                                                                                        millis = j;
                                                                                                                        str10 = str;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            cLOClusterSection2 = null;
                                                                                            if (cLOClusterSection2 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                cLOClusterSection = null;
                                                                                if (cLOClusterSection != null) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    clusterSection = null;
                                                                    if (clusterSection == null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        categoryTileSection = null;
                                                        if (categoryTileSection == null) {
                                                        }
                                                    }
                                                }
                                            }
                                            heroSection2 = null;
                                            if (heroSection2 == null) {
                                            }
                                        }
                                        str2 = str11;
                                        arrayList2.add(cLOClusterSectionViewModel);
                                        str11 = str2;
                                        list3 = list4;
                                        it4 = it5;
                                        endRootSpan = endRootSpan2;
                                        endLoading2 = endLoading;
                                        realOffersSpanManager2 = realOffersSpanManager;
                                        millis = j;
                                        str10 = str;
                                    }
                                }
                                pillSection = null;
                                if (pillSection == null) {
                                }
                                str2 = str11;
                                arrayList2.add(cLOClusterSectionViewModel);
                                str11 = str2;
                                list3 = list4;
                                it4 = it5;
                                endRootSpan = endRootSpan2;
                                endLoading2 = endLoading;
                                realOffersSpanManager2 = realOffersSpanManager;
                                millis = j;
                                str10 = str;
                            } else {
                                OffersSpanAction.EndLoading endLoading3 = endLoading2;
                                List list15 = list3;
                                OffersSpanAction.EndRootSpan endRootSpan3 = endRootSpan;
                                RealOffersSpanManager realOffersSpanManager3 = realOffersSpanManager2;
                                String str20 = str11;
                                AbstractPersistentList persistentList3 = Tags.toPersistentList(arrayList2);
                                StyledText styledText7 = offersTabHomeResponse.footer_markdown_text;
                                if (styledText7 != null) {
                                    String str21 = styledText7.text;
                                    if (str21 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: legal footer markdown text was null");
                                        break;
                                    } else {
                                        legalTextViewModel = new LegalTextViewModel(styledText7.text_color, str21);
                                    }
                                } else {
                                    legalTextViewModel = null;
                                }
                                OffersHomeListingViewModel.Loaded loaded2 = new OffersHomeListingViewModel.Loaded(str20, persistentList3, legalTextViewModel);
                                ArrayList arrayList5 = new ArrayList();
                                ListIterator listIterator = persistentList3.listIterator(0);
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    if (next instanceof OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) {
                                        arrayList5.add(next);
                                    }
                                }
                                mutableState10.setValue((OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) CollectionsKt.firstOrNull((List) arrayList5));
                                mutableState9.setValue(loaded2);
                                AnalyticsEvent analyticsEvent6 = offersTabHomeResponse.analytics_view_event;
                                analyticsEvent6.getClass();
                                mutableState11.setValue(ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent6));
                                Iterator it16 = list15.iterator();
                                while (true) {
                                    if (it16.hasNext()) {
                                        obj2 = it16.next();
                                        zzku zzkuVar2 = ((HomeSection) obj2).content;
                                        if (zzkuVar2 != null) {
                                            HomeSection$Content$HeroSection homeSection$Content$HeroSection3 = zzkuVar2 instanceof HomeSection$Content$HeroSection ? (HomeSection$Content$HeroSection) zzkuVar2 : null;
                                            if (homeSection$Content$HeroSection3 != null) {
                                                heroSection = homeSection$Content$HeroSection3.value;
                                                if (heroSection == null) {
                                                }
                                            }
                                        }
                                        heroSection = null;
                                        if (heroSection == null) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                mutableState12.setValue((HomeSection) obj2);
                                Iterator it17 = list15.iterator();
                                while (true) {
                                    if (it17.hasNext()) {
                                        zzku zzkuVar3 = ((HomeSection) it17.next()).content;
                                        if (zzkuVar3 != null) {
                                            HomeSection$Content$ClusterSection homeSection$Content$ClusterSection3 = zzkuVar3 instanceof HomeSection$Content$ClusterSection ? (HomeSection$Content$ClusterSection) zzkuVar3 : null;
                                            ClusterSection clusterSection3 = homeSection$Content$ClusterSection3 != null ? homeSection$Content$ClusterSection3.value : null;
                                            if (clusterSection3 != null && (clusterInfoItem = clusterSection3.info_item) != null) {
                                                formattedDetail2 = clusterInfoItem.formatted_details;
                                                if (formattedDetail2 == null) {
                                                    formattedDetail = formattedDetail2;
                                                }
                                            }
                                        }
                                        formattedDetail2 = null;
                                        if (formattedDetail2 == null) {
                                        }
                                    } else {
                                        formattedDetail = null;
                                    }
                                }
                                mutableState13.setValue(formattedDetail);
                                if (z2) {
                                    realOffersSpanManager3.onAction(endLoading3);
                                    realOffersSpanManager3.onAction(endRootSpan3);
                                }
                            }
                        }
                    }
                } else {
                    realOffersSpanManager2.onAction(new OffersSpanAction.StartLoading("offers_browse_loading", true));
                    mutableState9.setValue(OffersHomeListingViewModel.Loading.INSTANCE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayPresenter$models$3$1(ThemeSwitcherViewModel.Loaded loaded, Animatable animatable, Animatable animatable2, Animatable animatable3, Function1 function1, Animatable animatable4, Animatable animatable5, Animatable animatable6, Animatable animatable7, Continuation continuation) {
        super(2, continuation);
        this.$hasPassedIdv = loaded;
        this.$state$delegate = animatable;
        this.$instrumentSelection$delegate = animatable2;
        this.$profile$delegate = animatable3;
        this.$balanceSnapshot$delegate = function1;
        this.$instruments$delegate = animatable4;
        this.$hasActiveSponsorship$delegate = animatable5;
        this.$instrumentSelectionRowViewModel$delegate = animatable6;
        this.this$0 = animatable7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayPresenter$models$3$1(ScanningStepAnimationTrigger scanningStepAnimationTrigger, StepTurnAnimationQueue stepTurnAnimationQueue, CoroutineScope coroutineScope, Animatable animatable, Animatable animatable2, MutableState mutableState, MutableState mutableState2, MutableFloatState mutableFloatState, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$profile$delegate = scanningStepAnimationTrigger;
        this.$balanceSnapshot$delegate = stepTurnAnimationQueue;
        this.$instruments$delegate = coroutineScope;
        this.$hasActiveSponsorship$delegate = animatable;
        this.$instrumentSelectionRowViewModel$delegate = animatable2;
        this.$instrumentLinkingConfig = mutableState;
        this.$hasPassedIdv = mutableState2;
        this.this$0 = mutableFloatState;
        this.$state$delegate = mutableState3;
        this.$instrumentSelection$delegate = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayPresenter$models$3$1(OffersHomePresenter offersHomePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offersHomePresenter;
        this.$instrumentLinkingConfig = mutableState;
        this.$hasPassedIdv = mutableState2;
        this.$state$delegate = mutableState3;
        this.$instrumentSelection$delegate = mutableState4;
        this.$profile$delegate = mutableState5;
        this.$balanceSnapshot$delegate = mutableState6;
        this.$instruments$delegate = mutableState7;
        this.$hasActiveSponsorship$delegate = mutableState8;
    }
}
