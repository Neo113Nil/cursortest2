package com.squareup.cash.investing.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import com.nimbusds.jose.util.DeflateUtils;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingHomeViewEvent {

    public final class ClickStockMetric extends InvestingHomeViewEvent {
        public final long headerId;

        public ClickStockMetric(long j) {
            this.headerId = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickStockMetric) && this.headerId == ((ClickStockMetric) obj).headerId;
        }

        public final int hashCode() {
            return Long.hashCode(this.headerId);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.headerId, "ClickStockMetric(headerId=", ")");
        }
    }

    public final class Close extends InvestingHomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1338199873;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DependentAutoInvestClicked extends InvestingHomeViewEvent {
        public final String recurringId;

        public DependentAutoInvestClicked(String str) {
            str.getClass();
            this.recurringId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DependentAutoInvestClicked) && Intrinsics.areEqual(this.recurringId, ((DependentAutoInvestClicked) obj).recurringId);
        }

        public final int hashCode() {
            return this.recurringId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentAutoInvestClicked(recurringId=", RecurringPreferenceId.m3732toStringimpl(this.recurringId), ")");
        }
    }

    public final class DependentAutoInvestInfoClicked extends InvestingHomeViewEvent {
        public static final DependentAutoInvestInfoClicked INSTANCE = new DependentAutoInvestInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DependentAutoInvestInfoClicked);
        }

        public final int hashCode() {
            return -318522417;
        }

        public final String toString() {
            return "DependentAutoInvestInfoClicked";
        }
    }

    public final class DependentDisabledStateCtaClicked extends InvestingHomeViewEvent {
        public static final DependentDisabledStateCtaClicked INSTANCE = new DependentDisabledStateCtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DependentDisabledStateCtaClicked);
        }

        public final int hashCode() {
            return -1064906714;
        }

        public final String toString() {
            return "DependentDisabledStateCtaClicked";
        }
    }

    public final class DisclosureClicked extends InvestingHomeViewEvent {
        public final String url;

        public DisclosureClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureClicked) && Intrinsics.areEqual(this.url, ((DisclosureClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureClicked(url=", this.url, ")");
        }
    }

    public final class MyFirstStockClicked extends InvestingHomeViewEvent {
        public final boolean isBitcoin;
        public final String url;

        public MyFirstStockClicked(boolean z, String str) {
            str.getClass();
            this.isBitcoin = z;
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MyFirstStockClicked)) {
                return false;
            }
            MyFirstStockClicked myFirstStockClicked = (MyFirstStockClicked) obj;
            return this.isBitcoin == myFirstStockClicked.isBitcoin && Intrinsics.areEqual(this.url, myFirstStockClicked.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + (Boolean.hashCode(this.isBitcoin) * 31);
        }

        public final String toString() {
            return "MyFirstStockClicked(isBitcoin=" + this.isBitcoin + ", url=" + this.url + ")";
        }
    }

    public final class NewsEvent extends InvestingHomeViewEvent {
        public final InvestingCryptoNewsViewEvent event;

        public NewsEvent(InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent) {
            investingCryptoNewsViewEvent.getClass();
            this.event = investingCryptoNewsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewsEvent) && Intrinsics.areEqual(this.event, ((NewsEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "NewsEvent(event=" + this.event + ")";
        }
    }

    public final class PendingTradesTileViewAllClicked extends InvestingHomeViewEvent {
        public static final PendingTradesTileViewAllClicked INSTANCE = new PendingTradesTileViewAllClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PendingTradesTileViewAllClicked);
        }

        public final int hashCode() {
            return 1251192006;
        }

        public final String toString() {
            return "PendingTradesTileViewAllClicked";
        }
    }

    public final class ScrollEvent extends InvestingHomeViewEvent {
        public static final ScrollEvent INSTANCE = new ScrollEvent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScrollEvent);
        }

        public final int hashCode() {
            return 1465398612;
        }

        public final String toString() {
            return "ScrollEvent";
        }
    }

    public final class ScrubPoint extends InvestingHomeViewEvent {
        public final InvestingGraphContentModel.Point point;

        public ScrubPoint(InvestingGraphContentModel.Point point) {
            this.point = point;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrubPoint) && Intrinsics.areEqual(this.point, ((ScrubPoint) obj).point);
        }

        public final int hashCode() {
            InvestingGraphContentModel.Point point = this.point;
            if (point == null) {
                return 0;
            }
            return point.hashCode();
        }

        public final String toString() {
            return "ScrubPoint(point=" + this.point + ")";
        }
    }

    public final class SearchClicked extends InvestingHomeViewEvent {
        public final Source source;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Source {
            public static final /* synthetic */ Source[] $VALUES;
            public static final Source NEW_CUSTOMER_CTA_BUTTON;
            public static final Source PORTFOLIO_SEARCH_BAR;

            static {
                Source source = new Source("NEW_CUSTOMER_CTA_BUTTON", 0);
                NEW_CUSTOMER_CTA_BUTTON = source;
                Source source2 = new Source("PORTFOLIO_SEARCH_BAR", 1);
                PORTFOLIO_SEARCH_BAR = source2;
                $VALUES = new Source[]{source, source2};
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        public SearchClicked(Source source) {
            this.source = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchClicked) && this.source == ((SearchClicked) obj).source;
        }

        public final int hashCode() {
            return this.source.hashCode();
        }

        public final String toString() {
            return "SearchClicked(source=" + this.source + ")";
        }
    }

    public final class SelectCategory extends InvestingHomeViewEvent {
        public final CategoryToken token;

        public SelectCategory(CategoryToken categoryToken) {
            categoryToken.getClass();
            this.token = categoryToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectCategory) && Intrinsics.areEqual(this.token, ((SelectCategory) obj).token);
        }

        public final int hashCode() {
            return this.token.value.hashCode();
        }

        public final String toString() {
            return "SelectCategory(token=" + this.token + ")";
        }
    }

    public final class SelectHistoricalRange extends InvestingHomeViewEvent {
        public final HistoricalRange range;

        public SelectHistoricalRange(HistoricalRange historicalRange) {
            historicalRange.getClass();
            this.range = historicalRange;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectHistoricalRange) && this.range == ((SelectHistoricalRange) obj).range;
        }

        public final int hashCode() {
            return this.range.hashCode();
        }

        public final String toString() {
            return "SelectHistoricalRange(range=" + this.range + ")";
        }
    }

    public final class SelectStock extends InvestingHomeViewEvent {
        public final DeflateUtils source;
        public final InvestmentEntityToken token;

        public SelectStock(InvestmentEntityToken investmentEntityToken, DeflateUtils deflateUtils) {
            investmentEntityToken.getClass();
            this.token = investmentEntityToken;
            this.source = deflateUtils;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectStock)) {
                return false;
            }
            SelectStock selectStock = (SelectStock) obj;
            return Intrinsics.areEqual(this.token, selectStock.token) && this.source.equals(selectStock.source);
        }

        public final int hashCode() {
            return this.source.hashCode() + (this.token.value.hashCode() * 31);
        }

        public final String toString() {
            return "SelectStock(token=" + this.token + ", source=" + this.source + ")";
        }
    }

    public final class SettingsMenuIconClicked extends InvestingHomeViewEvent {
        public static final SettingsMenuIconClicked INSTANCE = new SettingsMenuIconClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SettingsMenuIconClicked);
        }

        public final int hashCode() {
            return 1432523507;
        }

        public final String toString() {
            return "SettingsMenuIconClicked";
        }
    }

    public final class ShowPortfolioPerformance extends InvestingHomeViewEvent {
        public static final ShowPortfolioPerformance INSTANCE = new ShowPortfolioPerformance();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowPortfolioPerformance);
        }

        public final int hashCode() {
            return 73881150;
        }

        public final String toString() {
            return "ShowPortfolioPerformance";
        }
    }

    public final class StocksTransferStatusTileClicked extends InvestingHomeViewEvent {
        public static final StocksTransferStatusTileClicked INSTANCE = new StocksTransferStatusTileClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StocksTransferStatusTileClicked);
        }

        public final int hashCode() {
            return 397513734;
        }

        public final String toString() {
            return "StocksTransferStatusTileClicked";
        }
    }
}
