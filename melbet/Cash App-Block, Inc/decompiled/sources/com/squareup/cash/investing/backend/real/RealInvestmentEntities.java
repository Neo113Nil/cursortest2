package com.squareup.cash.investing.backend.real;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$2;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$holdingForToken$2;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$holdingsForState$2;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$myHoldings$2;
import com.squareup.cash.investing.db.OwnedHoldings;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.ImagesKt;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class RealInvestmentEntities {
    public final CashAccountDatabaseImpl cashDatabase;
    public final RealEntityPriceRefresher entityPriceRefresher;
    public final CoroutineContext ioDispatcher;
    public final Signal signOutSignal;

    public RealInvestmentEntities(CashAccountDatabaseImpl cashAccountDatabaseImpl, RealEntityPriceRefresher realEntityPriceRefresher, Signal signal, CoroutineContext coroutineContext) {
        this.cashDatabase = cashAccountDatabaseImpl;
        this.entityPriceRefresher = realEntityPriceRefresher;
        this.signOutSignal = signal;
        this.ioDispatcher = coroutineContext;
    }

    public static final InvestmentEntityWithPrice.Owned access$asOwned(RealInvestmentEntities realInvestmentEntities, OwnedHoldings ownedHoldings, CurrentPrice currentPrice) {
        long id = ownedHoldings.getId();
        InvestmentEntityToken investmentEntityToken = new InvestmentEntityToken(ownedHoldings.getToken());
        String display_name = ownedHoldings.getDisplay_name();
        Image icon = ownedHoldings.getIcon();
        if (icon == null) {
            String icon_url = ownedHoldings.getIcon_url();
            icon = icon_url != null ? ImagesKt.toImage(icon_url) : null;
        }
        Image image = icon;
        String units = ownedHoldings.getUnits();
        long invested_amount = ownedHoldings.getInvested_amount();
        String symbol = ownedHoldings.getSymbol();
        Color entity_color = ownedHoldings.getEntity_color();
        if (entity_color == null) {
            String color = ownedHoldings.getColor();
            color.getClass();
            entity_color = ColorsKt.toColor(color);
        }
        return new InvestmentEntityWithPrice.Owned(id, investmentEntityToken, display_name, image, currentPrice, symbol, entity_color, units, invested_amount, ownedHoldings.getDelisted(), RealInvestmentEntitiesKt.marketCap(currentPrice, ownedHoldings.getOutstanding_shares()), ownedHoldings.getDaily_gain_params(), SyncInvestmentEntity.ReleaseStage.RELEASED);
    }

    public final ChannelFlowTransformLatest followingStocks() {
        InvestmentEntityQueries investmentEntityQueries = this.cashDatabase.investmentHoldingQueries;
        ResourceFileSystem.Companion companion = SyncInvestmentHolding.InvestmentHoldingState.Companion;
        investmentEntityQueries.getClass();
        InvestmentHoldingQueries$holdingsForState$2 investmentHoldingQueries$holdingsForState$2 = InvestmentHoldingQueries$holdingsForState$2.INSTANCE;
        int i = 1;
        return FlowKt.transformLatest(DBUtil.mapToList(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(investmentEntityQueries, new InvestmentHoldingQueries$$ExternalSyntheticLambda5(investmentEntityQueries, i))), this.ioDispatcher), new RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1(null, this, i));
    }

    public final ChannelFlowTransformLatest ownedStocks() {
        InvestmentEntityQueries investmentEntityQueries = this.cashDatabase.investmentHoldingQueries;
        investmentEntityQueries.getClass();
        InvestmentHoldingQueries$myHoldings$2 investmentHoldingQueries$myHoldings$2 = InvestmentHoldingQueries$myHoldings$2.INSTANCE;
        SqlDriver sqlDriver = investmentEntityQueries.driver;
        InvestmentHoldingQueries$$ExternalSyntheticLambda5 investmentHoldingQueries$$ExternalSyntheticLambda5 = new InvestmentHoldingQueries$$ExternalSyntheticLambda5(investmentEntityQueries, 3);
        sqlDriver.getClass();
        return FlowKt.transformLatest(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-881198191, new String[]{"investment_holding", "investment_entity"}, sqlDriver, "InvestmentHolding.sq", "myHoldings", "SELECT ownedHoldings.token, ownedHoldings.units, ownedHoldings.invested_amount, ownedHoldings.currency, ownedHoldings.state, ownedHoldings.daily_gain_params, ownedHoldings.average_cost, ownedHoldings.id, ownedHoldings.symbol, ownedHoldings.type, ownedHoldings.display_name, ownedHoldings.icon_url, ownedHoldings.outstanding_shares, ownedHoldings.color, ownedHoldings.status, ownedHoldings.about_text, ownedHoldings.about_detail_rows, ownedHoldings.search_ordering, ownedHoldings.delisted, ownedHoldings.entity_color, ownedHoldings.icon, ownedHoldings.release_stage\nFROM ownedHoldings", investmentHoldingQueries$$ExternalSyntheticLambda5)), this.ioDispatcher), new RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1(null, this, 0));
    }

    public final Flow stockDetails(InvestmentEntityToken investmentEntityToken) {
        investmentEntityToken.getClass();
        Transform$special$$inlined$map$1 transform$special$$inlined$map$1 = new Transform$special$$inlined$map$1(this.entityPriceRefresher.observe(CollectionsKt__CollectionsJVMKt.listOf(investmentEntityToken)), investmentEntityToken, 26);
        CashAccountDatabaseImpl cashAccountDatabaseImpl = this.cashDatabase;
        InvestmentEntityQueries investmentEntityQueries = cashAccountDatabaseImpl.investmentHoldingQueries;
        String value = investmentEntityToken.getValue();
        ResourceFileSystem.Companion companion = SyncInvestmentHolding.InvestmentHoldingState.Companion;
        investmentEntityQueries.getClass();
        value.getClass();
        InvestmentHoldingQueries$holdingForToken$2 investmentHoldingQueries$holdingForToken$2 = InvestmentHoldingQueries$holdingForToken$2.INSTANCE;
        int i = 2;
        SafeFlow flow = DBUtil.toFlow(new BadgeQueries$VersionQuery(investmentEntityQueries, value, new InvestmentHoldingQueries$$ExternalSyntheticLambda5(investmentEntityQueries, i)));
        CoroutineContext coroutineContext = this.ioDispatcher;
        return StateFlowKt.runUntil(FlowKt.flowOn(FlowKt.combine(transform$special$$inlined$map$1, DBUtil.mapToOneOrNull(flow, coroutineContext), new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(cashAccountDatabaseImpl.investmentEntityQueries.forToken(investmentEntityToken.getValue())), coroutineContext), new AppMessageBadgeCounter$collect$2(this, null, i)), coroutineContext), this.signOutSignal);
    }
}
