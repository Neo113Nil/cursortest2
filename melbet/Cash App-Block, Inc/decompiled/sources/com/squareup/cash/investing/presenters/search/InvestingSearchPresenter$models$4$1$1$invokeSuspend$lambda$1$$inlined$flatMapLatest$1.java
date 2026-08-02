package com.squareup.cash.investing.presenters.search;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.runtime.MutableState;
import androidx.room.util.DBUtil;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$2;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries$selectDiscoveries$2;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries.SelectDiscoveriesQuery;
import com.squareup.cash.investing.db.InvestingSearchTableQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.db.InvestingSearchTableQueries$EntityWithUpComingIpoBySearchQuery;
import com.squareup.cash.investing.db.InvestingSearchTableQueries$entityWithUpComingIpoBySearch$2;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder$findByCashtag$4;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ CoroutineScope $$this$launch$inlined;
    public final /* synthetic */ ColorModel $accentColor$inlined;
    public final /* synthetic */ Collection $filterConfigurations$inlined;
    public final /* synthetic */ MutableState $searchedText$delegate$inlined;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ InvestingSearchPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1(MutableState mutableState, ColorModel colorModel, InvestingSearchPresenter investingSearchPresenter, Collection collection, Continuation continuation, CoroutineScope coroutineScope) {
        super(3, continuation);
        this.this$0 = investingSearchPresenter;
        this.$filterConfigurations$inlined = collection;
        this.$$this$launch$inlined = coroutineScope;
        this.$searchedText$delegate$inlined = mutableState;
        this.$accentColor$inlined = colorModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1 investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1 = new InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1(this.$searchedText$delegate$inlined, this.$accentColor$inlined, this.this$0, this.$filterConfigurations$inlined, (Continuation) obj3, this.$$this$launch$inlined);
        investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1.L$1 = obj2;
        return investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowOn;
        Flow inviteContactsPresenter$special$$inlined$map$1;
        InvestingSearchPresenter investingSearchPresenter = this.this$0;
        RealCategoryBackend realCategoryBackend = investingSearchPresenter.categoryBackend;
        CategoryToken categoryToken = investingSearchPresenter.categoryToken;
        FlowCollector flowCollector = this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FilterGroupCarousel filterGroupCarousel = (FilterGroupCarousel) obj2;
            Collection collection = this.$filterConfigurations$inlined;
            MutableState mutableState = this.$searchedText$delegate$inlined;
            if (categoryToken == null && StringsKt.isBlank((String) mutableState.getValue()) && WebSocketProtocol.hasNoSelection(collection)) {
                FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(investingSearchPresenter.database.investingSettingsQueries.select$2()), investingSearchPresenter.ioDispatcher);
                FlowQuery$mapToList$$inlined$map$1 rootCategories = realCategoryBackend.rootCategories();
                RealInvestmentEntities realInvestmentEntities = investingSearchPresenter.investmentEntities;
                InvestingDiscoveryQueries investingDiscoveryQueries = realInvestmentEntities.cashDatabase.investingDiscoveryQueries;
                investingDiscoveryQueries.getClass();
                InvestingDiscoveryQueries$selectDiscoveries$2 investingDiscoveryQueries$selectDiscoveries$2 = InvestingDiscoveryQueries$selectDiscoveries$2.INSTANCE;
                inviteContactsPresenter$special$$inlined$map$1 = FlowKt.shareIn(FlowKt.combine(rootCategories, new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(investingDiscoveryQueries.new SelectDiscoveriesQuery(true, new TooltipBoxKt$$ExternalSyntheticLambda2(investingDiscoveryQueries))), realInvestmentEntities.ioDispatcher), 15), mapToOneOrNull, new AppMessageBadgeCounter$collect$2(investingSearchPresenter, null, 3)), this.$$this$launch$inlined, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
            } else {
                String str = (String) mutableState.getValue();
                List list = CollectionsKt.toList(collection);
                CoroutineContext coroutineContext = realCategoryBackend.ioDispatcher;
                str.getClass();
                list.getClass();
                ArrayList arrayList = new ArrayList(list);
                if (categoryToken != null) {
                    arrayList.add(new FilterConfiguration.Categories(new FilterToken(""), CollectionsKt__CollectionsJVMKt.listOf(categoryToken)));
                }
                if (arrayList.isEmpty()) {
                    InvestingDiscoveryQueries investingDiscoveryQueries2 = realCategoryBackend.investingSearchQueries;
                    ByteString.Companion companion = InvestmentEntityStatus.Companion;
                    ByteString.Companion companion2 = SyncInvestmentEntity.ReleaseStage.Companion;
                    investingDiscoveryQueries2.getClass();
                    InvestingSearchTableQueries$entityWithUpComingIpoBySearch$2 investingSearchTableQueries$entityWithUpComingIpoBySearch$2 = InvestingSearchTableQueries$entityWithUpComingIpoBySearch$2.INSTANCE;
                    flowOn = DBUtil.toFlow(new InvestingSearchTableQueries$EntityWithUpComingIpoBySearchQuery(investingDiscoveryQueries2, str, new InvestingSearchTableQueries$$ExternalSyntheticLambda0(investingDiscoveryQueries2, 0)));
                } else {
                    flowOn = FlowKt.flowOn(FlowKt.flatMapConcat(new GLSceneScopeProvider$SceneScope$2$1$1(realCategoryBackend, str, continuation, 27), new AppLockMonitor$special$$inlined$map$2(CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, new GpsConfigQueries$$ExternalSyntheticLambda2(realCategoryBackend, 19), 30), 19)), coroutineContext);
                }
                Flow transformLatest = FlowKt.transformLatest(DBUtil.mapToList(flowOn, coroutineContext), new AnchoredDraggableNode$drag$2(null, realCategoryBackend, 24));
                if (arrayList.isEmpty()) {
                    CategoryQueries categoryQueries = realCategoryBackend.categoryQueries;
                    UiAlias.Type.Companion companion3 = SyncInvestmentCategory.CategoryType.Companion;
                    RealCategoryBackend$$ExternalSyntheticLambda1 realCategoryBackend$$ExternalSyntheticLambda1 = new RealCategoryBackend$$ExternalSyntheticLambda1(0);
                    categoryQueries.getClass();
                    transformLatest = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new BadgeQueries$VersionQuery(categoryQueries, str, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(11, realCategoryBackend$$ExternalSyntheticLambda1, categoryQueries))), coroutineContext), 18), transformLatest, new RealRecipientFinder$findByCashtag$4(3, null, 2), 0);
                }
                inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(transformLatest, investingSearchPresenter, 10);
            }
            Flow flow = inviteContactsPresenter$special$$inlined$map$1;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            FlowKt.ensureActive(flowCollector);
            Object collect = flow.collect(new ZiplineLoader$load$2.AnonymousClass1(flowCollector, this.$filterConfigurations$inlined, investingSearchPresenter, this.$accentColor$inlined, filterGroupCarousel, mutableState, 9), this);
            if (collect != coroutineSingletons) {
                collect = Unit.INSTANCE;
            }
            if (collect != coroutineSingletons) {
                collect = Unit.INSTANCE;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
