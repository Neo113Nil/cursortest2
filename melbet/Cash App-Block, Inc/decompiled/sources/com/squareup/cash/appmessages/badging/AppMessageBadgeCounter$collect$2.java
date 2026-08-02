package com.squareup.cash.appmessages.badging;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.db.InlineMessage;
import com.squareup.cash.appmessages.db.PopupMessage;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$GraphError;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$LoadedPriceMovement;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$LoadingPriceMovement;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$ZeroBalance;
import com.squareup.cash.bitcoin.applets.presenters.data.RealBitcoinAppletTileRepository;
import com.squareup.cash.investing.backend.api.DiscoveryHeader;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.api.model.InvestingSecurityTileContent;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.db.OwnedHoldings;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investing.viewmodels.search.CategoryTile$CategoryCarousel;
import com.squareup.cash.investing.viewmodels.search.DisclosureModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchRow;
import com.squareup.cash.investing.viewmodels.search.InvestingSecurityTileContentModel;
import com.squareup.cash.investing.viewmodels.search.SearchRowHeader;
import com.squareup.cash.investing.viewmodels.search.SecurityCarousel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.model.SavingsApplet;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.util.BigDecimalsKt;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.UuidKt;
import papa.SafeTrace;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes5.dex */
public final class AppMessageBadgeCounter$collect$2 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppMessageBadgeCounter$collect$2(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                AppMessageBadgeCounter$collect$2 appMessageBadgeCounter$collect$2 = new AppMessageBadgeCounter$collect$2((CardTabBadgeCounter) obj5, (Continuation) obj4, 0);
                appMessageBadgeCounter$collect$2.L$0 = (PopupMessage) obj;
                appMessageBadgeCounter$collect$2.L$1 = (InlineMessage) obj2;
                appMessageBadgeCounter$collect$2.L$2 = (SheetMessage) obj3;
                return appMessageBadgeCounter$collect$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                AppMessageBadgeCounter$collect$2 appMessageBadgeCounter$collect$22 = new AppMessageBadgeCounter$collect$2((RealBitcoinAppletTileRepository) obj5, (Continuation) obj4, 1);
                appMessageBadgeCounter$collect$22.L$0 = (InvestingGraphContentModel) obj;
                appMessageBadgeCounter$collect$22.L$1 = (Money) obj2;
                appMessageBadgeCounter$collect$22.L$2 = (Money) obj3;
                return appMessageBadgeCounter$collect$22.invokeSuspend(Unit.INSTANCE);
            case 2:
                AppMessageBadgeCounter$collect$2 appMessageBadgeCounter$collect$23 = new AppMessageBadgeCounter$collect$2((RealInvestmentEntities) obj5, (Continuation) obj4, 2);
                appMessageBadgeCounter$collect$23.L$0 = (CurrentPrice) obj;
                appMessageBadgeCounter$collect$23.L$1 = (OwnedHoldings) obj2;
                appMessageBadgeCounter$collect$23.L$2 = (Investment_entity) obj3;
                return appMessageBadgeCounter$collect$23.invokeSuspend(Unit.INSTANCE);
            case 3:
                AppMessageBadgeCounter$collect$2 appMessageBadgeCounter$collect$24 = new AppMessageBadgeCounter$collect$2((InvestingSearchPresenter) obj5, (Continuation) obj4, 3);
                appMessageBadgeCounter$collect$24.L$0 = (List) obj;
                appMessageBadgeCounter$collect$24.L$1 = (Map) obj2;
                appMessageBadgeCounter$collect$24.L$2 = (Investing_settings) obj3;
                return appMessageBadgeCounter$collect$24.invokeSuspend(Unit.INSTANCE);
            default:
                AppMessageBadgeCounter$collect$2 appMessageBadgeCounter$collect$25 = new AppMessageBadgeCounter$collect$2((SyncValuesBasedSavingsBalanceStore) obj5, (Continuation) obj4, 4);
                appMessageBadgeCounter$collect$25.L$0 = (VersionedSavingsFolders) obj;
                appMessageBadgeCounter$collect$25.L$1 = (List) obj2;
                appMessageBadgeCounter$collect$25.L$2 = (SavingsApplet) obj3;
                return appMessageBadgeCounter$collect$25.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l;
        Iterable listOf;
        String str;
        Object obj2;
        int i = this.$r8$classId;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                CardTabBadgeCounter cardTabBadgeCounter = (CardTabBadgeCounter) obj3;
                PopupMessage popupMessage = (PopupMessage) this.L$0;
                InlineMessage inlineMessage = (InlineMessage) this.L$1;
                SheetMessage sheetMessage = (SheetMessage) this.L$2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (popupMessage != null) {
                    cardTabBadgeCounter.getAppMessageManager().reportMessageDelivery(popupMessage.messageToken);
                }
                if (inlineMessage != null) {
                    cardTabBadgeCounter.getAppMessageManager().reportMessageDelivery(inlineMessage.messageToken);
                }
                if (sheetMessage != null) {
                    cardTabBadgeCounter.getAppMessageManager().reportMessageDelivery(sheetMessage.message_token);
                }
                return new Long(ArraysKt___ArraysKt.filterNotNull(new Object[]{popupMessage, inlineMessage, sheetMessage}).size());
            case 1:
                RealBitcoinAppletTileRepository realBitcoinAppletTileRepository = (RealBitcoinAppletTileRepository) obj3;
                InvestingGraphContentModel investingGraphContentModel = (InvestingGraphContentModel) this.L$0;
                Money money = (Money) this.L$1;
                Money money2 = (Money) this.L$2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String format2 = money != null ? realBitcoinAppletTileRepository.moneyFormatter.format(money) : null;
                if (format2 == null) {
                    format2 = "";
                }
                String str2 = format2;
                Long l2 = money.amount;
                if (l2 != null && l2.longValue() == 0) {
                    return new BitcoinRepositoryModel$Installed$ZeroBalance(str2);
                }
                if (investingGraphContentModel instanceof InvestingGraphContentModel.Loading) {
                    return BitcoinRepositoryModel$Installed$LoadingPriceMovement.INSTANCE;
                }
                if (!(investingGraphContentModel instanceof InvestingGraphContentModel.Loaded)) {
                    if (Intrinsics.areEqual(investingGraphContentModel, InvestingGraphContentModel.Error.INSTANCE)) {
                        Long l3 = money.amount;
                        return new BitcoinRepositoryModel$Installed$GraphError(str2, l3 != null ? l3.longValue() : 0L);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list = ((InvestingGraphContentModel.Loaded) investingGraphContentModel).points;
                BigDecimal movement = UuidKt.movement(true, (money2 == null || (l = money2.amount) == null) ? (long) ((InvestingGraphContentModel.Point) CollectionsKt.last(list)).y : l.longValue(), (long) ((InvestingGraphContentModel.Point) CollectionsKt.first(list)).y);
                InvestingCryptoImage.Companion.getClass();
                InvestingCryptoImage icon = zza.icon(movement);
                Long l4 = money.amount;
                long longValue = l4 != null ? l4.longValue() : 0L;
                BigDecimal abs = movement.abs();
                abs.getClass();
                return new BitcoinRepositoryModel$Installed$LoadedPriceMovement(str2, longValue, BigDecimalsKt.toPrettyString(abs, false).concat("%"), icon, investingGraphContentModel);
            case 2:
                CurrentPrice currentPrice = (CurrentPrice) this.L$0;
                OwnedHoldings ownedHoldings = (OwnedHoldings) this.L$1;
                Investment_entity investment_entity = (Investment_entity) this.L$2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestmentEntityWithPrice access$asOwned = ownedHoldings != null ? RealInvestmentEntities.access$asOwned((RealInvestmentEntities) obj3, ownedHoldings, currentPrice) : RealInvestmentEntitiesKt.asUnowned(investment_entity, currentPrice);
                String str3 = investment_entity.symbol;
                Long l5 = investment_entity.outstanding_shares;
                EmptyList emptyList = EmptyList.INSTANCE;
                l5.getClass();
                long longValue2 = l5.longValue();
                Color color = investment_entity.entity_color;
                if (color == null) {
                    String str4 = investment_entity.color;
                    str4.getClass();
                    color = ColorsKt.toColor(str4);
                }
                Color color2 = color;
                Money marketCap = RealInvestmentEntitiesKt.marketCap(currentPrice, l5);
                InvestmentEntityType investmentEntityType = investment_entity.f1153type;
                String str5 = investment_entity.about_text;
                ?? r0 = investment_entity.about_detail_rows;
                return new StockDetails(access$asOwned, str3, emptyList, longValue2, color2, marketCap, investmentEntityType, str5, r0 == 0 ? emptyList : r0);
            case 3:
                AndroidStringManager androidStringManager = ((InvestingSearchPresenter) obj3).stringManager;
                List list2 = (List) this.L$0;
                Map map = (Map) this.L$1;
                Investing_settings investing_settings = (Investing_settings) this.L$2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    DiscoveryHeader discoveryHeader = (DiscoveryHeader) entry.getKey();
                    List list3 = (List) entry.getValue();
                    SearchRowHeader searchRowHeader = new SearchRowHeader(discoveryHeader.text, discoveryHeader.description);
                    List<InvestingSecurityTileContent> list4 = list3;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (InvestingSecurityTileContent investingSecurityTileContent : list4) {
                        investingSecurityTileContent.getClass();
                        arrayList2.add(new InvestingSecurityTileContentModel(investingSecurityTileContent.image, investingSecurityTileContent.title, investingSecurityTileContent.ticker, investingSecurityTileContent.backgroundColor, investingSecurityTileContent.token));
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new InvestingSearchRow[]{searchRowHeader, new SecurityCarousel(arrayList2)}), arrayList);
                }
                if (list2.isEmpty()) {
                    listOf = EmptyList.INSTANCE;
                } else {
                    SearchRowHeader searchRowHeader2 = new SearchRowHeader(androidStringManager.get(R.string.search_category_carousels_title), null);
                    List<Category> list5 = list2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    for (Category category : list5) {
                        category.getClass();
                        String str6 = category.imageUrl;
                        str6.getClass();
                        String str7 = category.name;
                        Color color3 = category.color;
                        color3.getClass();
                        arrayList3.add(new InvestingCategoryTileContentModel(str6, str7, color3, category.token));
                    }
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new InvestingSearchRow[]{searchRowHeader2, new CategoryTile$CategoryCarousel(arrayList3)});
                }
                Object obj4 = investing_settings != null ? investing_settings.disclosures_web_url : null;
                if (obj4 == null) {
                    obj4 = "null";
                }
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.investing_home_disclosure)).format(new Object[]{obj4});
                format3.getClass();
                return CollectionsKt.plus((Collection) CollectionsKt.plus(listOf, (Collection) arrayList), (Object) new DisclosureModel(format3));
            default:
                VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) this.L$0;
                List list6 = (List) this.L$1;
                SavingsApplet savingsApplet = (SavingsApplet) this.L$2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SyncValuesBasedSavingsBalanceStore syncValuesBasedSavingsBalanceStore = (SyncValuesBasedSavingsBalanceStore) obj3;
                if (versionedSavingsFolders != null) {
                    str = versionedSavingsFolders.v2_balance_token;
                    if (str == null) {
                        syncValuesBasedSavingsBalanceStore.errorReporter.report(new GeneralSavingsError("Versioned savings folder exists and is enabled but no v2_balance_token found", null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                    if (str != null) {
                        return null;
                    }
                    Iterator it = list6.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (Intrinsics.areEqual(((BalanceSnapshot) obj2).instrument_token, str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj2;
                    if (balanceSnapshot == null) {
                        return null;
                    }
                    String str8 = balanceSnapshot.instrument_token;
                    str8.getClass();
                    Money money3 = balanceSnapshot.balance;
                    money3.getClass();
                    return new SavingsBalance(money3, str8, (savingsApplet != null ? savingsApplet.activeState : null) == SavingsApplet.CustomerActiveState.ADOPTED);
                }
                str = null;
                if (str != null) {
                }
        }
    }
}
