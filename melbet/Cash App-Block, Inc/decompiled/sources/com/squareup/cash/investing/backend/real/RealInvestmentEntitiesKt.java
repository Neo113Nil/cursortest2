package com.squareup.cash.investing.backend.real;

import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.ImagesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public abstract class RealInvestmentEntitiesKt {
    public static final long INVESTING_ETF_LIVE_INTERVAL;
    public static final long INVESTING_LIVE_INTERVAL;
    public static final long INVESTING_STALENESS_THRESHOLD;

    static {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        INVESTING_LIVE_INTERVAL = DurationKt.toDuration(5, durationUnit);
        INVESTING_ETF_LIVE_INTERVAL = DurationKt.toDuration(5, DurationUnit.MINUTES);
        INVESTING_STALENESS_THRESHOLD = DurationKt.toDuration(30, durationUnit);
    }

    public static final InvestmentEntityWithPrice.Unowned asUnowned(Investment_entity investment_entity, CurrentPrice currentPrice) {
        investment_entity.getClass();
        long id = investment_entity.getId();
        InvestmentEntityToken investmentEntityToken = new InvestmentEntityToken(investment_entity.getToken());
        String display_name = investment_entity.getDisplay_name();
        Image icon = investment_entity.getIcon();
        if (icon == null) {
            String icon_url = investment_entity.getIcon_url();
            icon = icon_url != null ? ImagesKt.toImage(icon_url) : null;
        }
        String symbol = investment_entity.getSymbol();
        Color entity_color = investment_entity.getEntity_color();
        if (entity_color == null) {
            String color = investment_entity.getColor();
            color.getClass();
            entity_color = ColorsKt.toColor(color);
        }
        Color color2 = entity_color;
        boolean delisted = investment_entity.getDelisted();
        Money marketCap = marketCap(currentPrice, investment_entity.getOutstanding_shares());
        SyncInvestmentEntity.ReleaseStage release_stage = investment_entity.getRelease_stage();
        if (release_stage == null) {
            release_stage = SyncInvestmentEntity.ReleaseStage.RELEASED;
        }
        return new InvestmentEntityWithPrice.Unowned(id, investmentEntityToken, display_name, icon, currentPrice, symbol, color2, delisted, marketCap, release_stage);
    }

    public static final Money marketCap(CurrentPrice currentPrice, Long l) {
        Money money;
        if (currentPrice == null || (money = currentPrice.current_price) == null) {
            return null;
        }
        Long l2 = money.amount;
        l2.getClass();
        long longValue = l2.longValue();
        l.getClass();
        return Money.copy$default(money, Long.valueOf(l.longValue() * longValue), null, null, 6);
    }
}
