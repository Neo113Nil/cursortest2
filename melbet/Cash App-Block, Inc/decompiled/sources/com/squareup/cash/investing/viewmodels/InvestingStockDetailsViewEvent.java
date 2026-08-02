package com.squareup.cash.investing.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewEvent;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingStockDetailsViewEvent {

    public final class AnalystOpinionsEvent extends InvestingStockDetailsViewEvent {
        public final InvestingAnalystOpinionsViewEvent$MoreInfoClicked event;

        public AnalystOpinionsEvent(InvestingAnalystOpinionsViewEvent$MoreInfoClicked investingAnalystOpinionsViewEvent$MoreInfoClicked) {
            investingAnalystOpinionsViewEvent$MoreInfoClicked.getClass();
            this.event = investingAnalystOpinionsViewEvent$MoreInfoClicked;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnalystOpinionsEvent) && Intrinsics.areEqual(this.event, ((AnalystOpinionsEvent) obj).event);
        }

        public final int hashCode() {
            this.event.getClass();
            return -365963698;
        }

        public final String toString() {
            return "AnalystOpinionsEvent(event=" + this.event + ")";
        }
    }

    public final class CategoryClick extends InvestingStockDetailsViewEvent {
        public final CategoryToken categoryToken;

        public CategoryClick(CategoryToken categoryToken) {
            categoryToken.getClass();
            this.categoryToken = categoryToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryClick) && Intrinsics.areEqual(this.categoryToken, ((CategoryClick) obj).categoryToken);
        }

        public final int hashCode() {
            return this.categoryToken.value.hashCode();
        }

        public final String toString() {
            return "CategoryClick(categoryToken=" + this.categoryToken + ")";
        }
    }

    public final class Close extends InvestingStockDetailsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -494862158;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DisclosureLinkClick extends InvestingStockDetailsViewEvent {
        public final String url;

        public DisclosureLinkClick(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureLinkClick) && Intrinsics.areEqual(this.url, ((DisclosureLinkClick) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureLinkClick(url=", this.url, ")");
        }
    }

    public final class EarningsEvent extends InvestingStockDetailsViewEvent {
        public final InvestingEarningsViewEvent$MoreInfoClicked event;

        public EarningsEvent(InvestingEarningsViewEvent$MoreInfoClicked investingEarningsViewEvent$MoreInfoClicked) {
            investingEarningsViewEvent$MoreInfoClicked.getClass();
            this.event = investingEarningsViewEvent$MoreInfoClicked;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EarningsEvent) && Intrinsics.areEqual(this.event, ((EarningsEvent) obj).event);
        }

        public final int hashCode() {
            this.event.getClass();
            return 1248253196;
        }

        public final String toString() {
            return "EarningsEvent(event=" + this.event + ")";
        }
    }

    public final class EtfHoldingsEvent extends InvestingStockDetailsViewEvent {
        public final InvestingEtfHoldingsViewEvent event;

        public EtfHoldingsEvent(InvestingEtfHoldingsViewEvent investingEtfHoldingsViewEvent) {
            investingEtfHoldingsViewEvent.getClass();
            this.event = investingEtfHoldingsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EtfHoldingsEvent) && Intrinsics.areEqual(this.event, ((EtfHoldingsEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "EtfHoldingsEvent(event=" + this.event + ")";
        }
    }

    public final class FinancialEvent extends InvestingStockDetailsViewEvent {
        public final InvestingFinancialViewEvent event;

        public FinancialEvent(InvestingFinancialViewEvent investingFinancialViewEvent) {
            investingFinancialViewEvent.getClass();
            this.event = investingFinancialViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinancialEvent) && Intrinsics.areEqual(this.event, ((FinancialEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "FinancialEvent(event=" + this.event + ")";
        }
    }

    public final class FirstButtonTap extends InvestingStockDetailsViewEvent {
        public static final FirstButtonTap INSTANCE = new FirstButtonTap();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FirstButtonTap);
        }

        public final int hashCode() {
            return -213574457;
        }

        public final String toString() {
            return "FirstButtonTap";
        }
    }

    public final class GraphEvent extends InvestingStockDetailsViewEvent {
        public final InvestingGraphViewEvent investingGraphViewEvent;

        public GraphEvent(InvestingGraphViewEvent investingGraphViewEvent) {
            this.investingGraphViewEvent = investingGraphViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GraphEvent) && this.investingGraphViewEvent.equals(((GraphEvent) obj).investingGraphViewEvent);
        }

        public final int hashCode() {
            return this.investingGraphViewEvent.hashCode();
        }

        public final String toString() {
            return "GraphEvent(investingGraphViewEvent=" + this.investingGraphViewEvent + ")";
        }
    }

    public final class KeyStatEvent extends InvestingStockDetailsViewEvent {
        public final InvestingDetailTileViewEvent$KeyStatsDetailsClicked event;

        public KeyStatEvent(InvestingDetailTileViewEvent$KeyStatsDetailsClicked investingDetailTileViewEvent$KeyStatsDetailsClicked) {
            investingDetailTileViewEvent$KeyStatsDetailsClicked.getClass();
            this.event = investingDetailTileViewEvent$KeyStatsDetailsClicked;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KeyStatEvent) && Intrinsics.areEqual(this.event, ((KeyStatEvent) obj).event);
        }

        public final int hashCode() {
            this.event.getClass();
            return 1101295166;
        }

        public final String toString() {
            return "KeyStatEvent(event=" + this.event + ")";
        }
    }

    public final class NewsEvent extends InvestingStockDetailsViewEvent {
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

    public final class RecurringPurchaseItemTap extends InvestingStockDetailsViewEvent {
        public final String preferenceId;

        public RecurringPurchaseItemTap(String str) {
            str.getClass();
            this.preferenceId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecurringPurchaseItemTap) && Intrinsics.areEqual(this.preferenceId, ((RecurringPurchaseItemTap) obj).preferenceId);
        }

        public final int hashCode() {
            return this.preferenceId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecurringPurchaseItemTap(preferenceId=", RecurringPreferenceId.m3732toStringimpl(this.preferenceId), ")");
        }
    }

    public final class SecondButtonTap extends InvestingStockDetailsViewEvent {
        public static final SecondButtonTap INSTANCE = new SecondButtonTap();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondButtonTap);
        }

        public final int hashCode() {
            return 1088265015;
        }

        public final String toString() {
            return "SecondButtonTap";
        }
    }

    public final class ShowEntityPerformance extends InvestingStockDetailsViewEvent {
        public static final ShowEntityPerformance INSTANCE = new ShowEntityPerformance();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowEntityPerformance);
        }

        public final int hashCode() {
            return 138749322;
        }

        public final String toString() {
            return "ShowEntityPerformance";
        }
    }
}
