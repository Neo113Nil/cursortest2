package com.squareup.cash.investing.viewmodels.search;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingSearchViewEvent {

    public final class BackClicked extends InvestingSearchViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -202384628;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CategoryClicked extends InvestingSearchViewEvent {
        public final CategoryToken token;

        public CategoryClicked(CategoryToken categoryToken) {
            categoryToken.getClass();
            this.token = categoryToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryClicked) && Intrinsics.areEqual(this.token, ((CategoryClicked) obj).token);
        }

        public final int hashCode() {
            return this.token.value.hashCode();
        }

        public final String toString() {
            return "CategoryClicked(token=" + this.token + ")";
        }
    }

    public final class DisclosureClicked extends InvestingSearchViewEvent {
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

    public final class FilterConfigurationSelected extends InvestingSearchViewEvent {
        public final FilterConfiguration filterConfiguration;

        public FilterConfigurationSelected(FilterConfiguration filterConfiguration) {
            filterConfiguration.getClass();
            this.filterConfiguration = filterConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterConfigurationSelected) && Intrinsics.areEqual(this.filterConfiguration, ((FilterConfigurationSelected) obj).filterConfiguration);
        }

        public final int hashCode() {
            return this.filterConfiguration.hashCode();
        }

        public final String toString() {
            return "FilterConfigurationSelected(filterConfiguration=" + this.filterConfiguration + ")";
        }
    }

    public final class FilterMenuClicked extends InvestingSearchViewEvent {
        public static final FilterMenuClicked INSTANCE = new FilterMenuClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FilterMenuClicked);
        }

        public final int hashCode() {
            return 2138557436;
        }

        public final String toString() {
            return "FilterMenuClicked";
        }
    }

    public final class FilterSelected extends InvestingSearchViewEvent {
        public final FilterToken filterToken;

        public FilterSelected(FilterToken filterToken) {
            filterToken.getClass();
            this.filterToken = filterToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterSelected) && Intrinsics.areEqual(this.filterToken, ((FilterSelected) obj).filterToken);
        }

        public final int hashCode() {
            return this.filterToken.value.hashCode();
        }

        public final String toString() {
            return "FilterSelected(filterToken=" + this.filterToken + ")";
        }
    }

    public final class InteractedWithSearchBar extends InvestingSearchViewEvent {
        public static final InteractedWithSearchBar INSTANCE = new InteractedWithSearchBar();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InteractedWithSearchBar);
        }

        public final int hashCode() {
            return 444041116;
        }

        public final String toString() {
            return "InteractedWithSearchBar";
        }
    }

    public final class ResetFiltersClicked extends InvestingSearchViewEvent {
        public static final ResetFiltersClicked INSTANCE = new ResetFiltersClicked();
    }

    public final class SearchTextChanged extends InvestingSearchViewEvent {
        public final String text;

        public SearchTextChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && Intrinsics.areEqual(this.text, ((SearchTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChanged(text=", this.text, ")");
        }
    }

    public final class StockClicked extends InvestingSearchViewEvent {
        public final SearchStockOrigin origin;
        public final String symbol;
        public final InvestmentEntityToken token;

        public interface SearchStockOrigin {

            /* loaded from: classes9.dex */
            public final class CategoryDetail implements SearchStockOrigin {
                public static final CategoryDetail INSTANCE = new CategoryDetail();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof CategoryDetail);
                }

                public final int hashCode() {
                    return 813056562;
                }

                public final String toString() {
                    return "CategoryDetail";
                }
            }

            public final class SearchCarousel implements SearchStockOrigin {
                public final List tickers;

                public SearchCarousel(List list) {
                    list.getClass();
                    this.tickers = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SearchCarousel) && Intrinsics.areEqual(this.tickers, ((SearchCarousel) obj).tickers);
                }

                public final int hashCode() {
                    return this.tickers.hashCode();
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("SearchCarousel(tickers=", ")", this.tickers);
                }
            }

            /* loaded from: classes8.dex */
            public final class StockRow implements SearchStockOrigin {
                public static final StockRow INSTANCE = new StockRow();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof StockRow);
                }

                public final int hashCode() {
                    return 2145063015;
                }

                public final String toString() {
                    return "StockRow";
                }
            }
        }

        public StockClicked(InvestmentEntityToken investmentEntityToken, SearchStockOrigin searchStockOrigin, String str) {
            investmentEntityToken.getClass();
            str.getClass();
            this.token = investmentEntityToken;
            this.origin = searchStockOrigin;
            this.symbol = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StockClicked)) {
                return false;
            }
            StockClicked stockClicked = (StockClicked) obj;
            return Intrinsics.areEqual(this.token, stockClicked.token) && this.origin.equals(stockClicked.origin) && Intrinsics.areEqual(this.symbol, stockClicked.symbol);
        }

        public final int hashCode() {
            return this.symbol.hashCode() + ((this.origin.hashCode() + (this.token.value.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StockClicked(token=");
            sb.append(this.token);
            sb.append(", origin=");
            sb.append(this.origin);
            sb.append(", symbol=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.symbol, ")");
        }
    }
}
