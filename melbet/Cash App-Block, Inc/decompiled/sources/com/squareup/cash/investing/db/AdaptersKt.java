package com.squareup.cash.investing.db;

import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import coil3.ImageLoader$Builder;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.investing.db.categories.Category$Adapter;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.EquityDiscoveryAnimationTile;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import okio.internal.DefaultSocket;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final Category$Adapter investingBitcoinPortfolioGraphCacheAdapter;
    public static final BlockersConfig.Adapter investingEntityPriceCacheAdapter;
    public static final Local_tab_content.Adapter investingNewsAdapter;
    public static final ImageLoader$Builder investingSettingsAdapter;
    public static final ScenarioPlan.Adapter investingStocksPortfolioGraphCacheAdapter;
    public static final Category$Adapter investmentCategoryAdapter;
    public static final zzlj investmentEntityAdapter;
    public static final ExpressivePaymentsStickerConfig.Adapter investmentFilterGroupAdapter;
    public static final DefaultSocket investmentHoldingsAdapter;
    public static final StampsConfig.Adapter investmentPerformanceAdapter;

    static {
        EnumColumnAdapter enumColumnAdapter = new EnumColumnAdapter(InvestmentEntityStatus.values());
        EnumColumnAdapter enumColumnAdapter2 = new EnumColumnAdapter(InvestmentEntityType.values());
        WireRepeatedAdapter wireRepeatedAdapter = new WireRepeatedAdapter(SyncInvestmentEntity.DetailRow.ADAPTER, 0);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        WireAdapter wireAdapter = new WireAdapter(protoAdapter);
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        investmentEntityAdapter = new zzlj(enumColumnAdapter2, enumColumnAdapter, wireRepeatedAdapter, wireAdapter, new WireAdapter(protoAdapter2), new EnumColumnAdapter(SyncInvestmentEntity.ReleaseStage.values()));
        EnumColumnAdapter enumColumnAdapter3 = new EnumColumnAdapter(CurrencyCode.values());
        EnumColumnAdapter enumColumnAdapter4 = new EnumColumnAdapter(SyncInvestmentHolding.InvestmentHoldingState.values());
        WireAdapter wireAdapter2 = new WireAdapter(SyncInvestmentHolding.DailyGainParams.ADAPTER);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        investmentHoldingsAdapter = new DefaultSocket(enumColumnAdapter3, enumColumnAdapter4, wireAdapter2, new WireAdapter(protoAdapter3), 2);
        WireAdapter wireAdapter3 = new WireAdapter(protoAdapter3);
        WireAdapter wireAdapter4 = new WireAdapter(protoAdapter3);
        ProtoAdapter protoAdapter4 = LearnMoreConfiguration.ADAPTER;
        investingSettingsAdapter = new ImageLoader$Builder(wireAdapter3, wireAdapter4, new WireAdapter(protoAdapter4), new WireRepeatedAdapter(EquityDiscoveryAnimationTile.ADAPTER, 0), new WireAdapter(protoAdapter4), new WireAdapter(protoAdapter3), new WireAdapter(protoAdapter3), new WireAdapter(CustomOrderConfiguration.ADAPTER));
        investingEntityPriceCacheAdapter = new BlockersConfig.Adapter(new WireAdapter(CurrentPrice.ADAPTER));
        investingStocksPortfolioGraphCacheAdapter = new ScenarioPlan.Adapter(new EnumColumnAdapter(HistoricalRange.values()), new WireAdapter(BalanceHistory.ADAPTER));
        investingBitcoinPortfolioGraphCacheAdapter = new Category$Adapter(new EnumColumnAdapter(CurrencyCode.values()), new EnumColumnAdapter(HistoricalRange.values()), new WireAdapter(PriceHistory.ADAPTER));
        investmentPerformanceAdapter = new StampsConfig.Adapter(new WireRepeatedAdapter(Section.ADAPTER, 0));
        investmentCategoryAdapter = new Category$Adapter(new EnumColumnAdapter(SyncInvestmentCategory.PrefixIcon.values()), new EnumColumnAdapter(SyncInvestmentCategory.CategoryType.values()), new WireAdapter(protoAdapter));
        investmentFilterGroupAdapter = new ExpressivePaymentsStickerConfig.Adapter(new WireRepeatedAdapter(SyncInvestmentFilterGroup.Subfilter.ADAPTER, 0), new WireRepeatedAdapter(SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER, 0), new EnumColumnAdapter(SyncInvestmentFilterGroup.JoinType.values()));
        investingNewsAdapter = new Local_tab_content.Adapter(new WireAdapter(protoAdapter2));
    }
}
