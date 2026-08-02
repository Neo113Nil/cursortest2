package com.squareup.cash.investing.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.inputfieldtext.InputFieldText;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public interface InvestingStockSelectionViewModel {

    public interface Loaded extends InvestingStockSelectionViewModel {

        public interface MultiSelect extends Loaded {

            public final class Browsing implements MultiSelect {
                public final InvestingStockSelectionViewModel$Header$TitleOnly header;
                public final MultiSelectParametersViewModel multiselectParameters;
                public final String searchBarPlaceholderText;
                public final SearchResultModel searchResults;

                public Browsing(InvestingStockSelectionViewModel$Header$TitleOnly investingStockSelectionViewModel$Header$TitleOnly, String str, SearchResultModel searchResultModel, MultiSelectParametersViewModel multiSelectParametersViewModel) {
                    NavigationIcon navigationIcon = NavigationIcon.CLOSE;
                    str.getClass();
                    searchResultModel.getClass();
                    this.header = investingStockSelectionViewModel$Header$TitleOnly;
                    this.searchBarPlaceholderText = str;
                    this.searchResults = searchResultModel;
                    this.multiselectParameters = multiSelectParametersViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Browsing)) {
                        return false;
                    }
                    Browsing browsing = (Browsing) obj;
                    if (!this.header.equals(browsing.header) || !Intrinsics.areEqual(this.searchBarPlaceholderText, browsing.searchBarPlaceholderText)) {
                        return false;
                    }
                    NavigationIcon navigationIcon = NavigationIcon.CLOSE;
                    return Intrinsics.areEqual(this.searchResults, browsing.searchResults) && this.multiselectParameters.equals(browsing.multiselectParameters);
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final InvestingStockSelectionViewModel$Header$TitleOnly getHeader() {
                    return this.header;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded.MultiSelect
                public final MultiSelectParametersViewModel getMultiselectParameters() {
                    return this.multiselectParameters;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final NavigationIcon getNavigationIcon() {
                    return NavigationIcon.CLOSE;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final String getSearchBarPlaceholderText() {
                    return this.searchBarPlaceholderText;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final SearchResultModel getSearchResults() {
                    return this.searchResults;
                }

                public final int hashCode() {
                    return this.multiselectParameters.hashCode() + ((this.searchResults.hashCode() + ((NavigationIcon.CLOSE.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.title.hashCode() * 31, 31, this.searchBarPlaceholderText)) * 31)) * 31);
                }

                public final String toString() {
                    return "Browsing(header=" + this.header + ", searchBarPlaceholderText=" + this.searchBarPlaceholderText + ", navigationIcon=" + NavigationIcon.CLOSE + ", searchResults=" + this.searchResults + ", multiselectParameters=" + this.multiselectParameters + ")";
                }
            }

            public final class MultiSelectParametersViewModel {
                public final boolean ctaButtonEnabled;
                public final String ctaLabel;
                public final String infoText;
                public final int maxSelections;

                public MultiSelectParametersViewModel(String str, String str2, int i, boolean z) {
                    str2.getClass();
                    this.maxSelections = i;
                    this.infoText = str;
                    this.ctaButtonEnabled = z;
                    this.ctaLabel = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof MultiSelectParametersViewModel)) {
                        return false;
                    }
                    MultiSelectParametersViewModel multiSelectParametersViewModel = (MultiSelectParametersViewModel) obj;
                    return this.maxSelections == multiSelectParametersViewModel.maxSelections && Intrinsics.areEqual(this.infoText, multiSelectParametersViewModel.infoText) && this.ctaButtonEnabled == multiSelectParametersViewModel.ctaButtonEnabled && Intrinsics.areEqual(this.ctaLabel, multiSelectParametersViewModel.ctaLabel);
                }

                public final int hashCode() {
                    int hashCode = Integer.hashCode(this.maxSelections) * 31;
                    String str = this.infoText;
                    return this.ctaLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.ctaButtonEnabled);
                }

                public final String toString() {
                    StringBuilder m = re$$ExternalSyntheticOutline0.m("MultiSelectParametersViewModel(maxSelections=", this.maxSelections, ", infoText=", this.infoText, ", ctaButtonEnabled=");
                    m.append(this.ctaButtonEnabled);
                    m.append(", ctaLabel=");
                    m.append(this.ctaLabel);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class SearchingStocks implements MultiSelect, Searching {
                public final InvestingStockSelectionViewModel$Header$TitleOnly header;
                public final MultiSelectParametersViewModel multiselectParameters;
                public final String searchBarPlaceholderText;
                public final SearchResultModel searchResults;
                public final InputFieldText searchText;

                public SearchingStocks(InvestingStockSelectionViewModel$Header$TitleOnly investingStockSelectionViewModel$Header$TitleOnly, InputFieldText inputFieldText, String str, SearchResultModel searchResultModel, MultiSelectParametersViewModel multiSelectParametersViewModel) {
                    NavigationIcon navigationIcon = NavigationIcon.CLOSE;
                    str.getClass();
                    searchResultModel.getClass();
                    this.header = investingStockSelectionViewModel$Header$TitleOnly;
                    this.searchText = inputFieldText;
                    this.searchBarPlaceholderText = str;
                    this.searchResults = searchResultModel;
                    this.multiselectParameters = multiSelectParametersViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SearchingStocks)) {
                        return false;
                    }
                    SearchingStocks searchingStocks = (SearchingStocks) obj;
                    if (!this.header.equals(searchingStocks.header) || !this.searchText.equals(searchingStocks.searchText) || !Intrinsics.areEqual(this.searchBarPlaceholderText, searchingStocks.searchBarPlaceholderText)) {
                        return false;
                    }
                    NavigationIcon navigationIcon = NavigationIcon.CLOSE;
                    return Intrinsics.areEqual(this.searchResults, searchingStocks.searchResults) && this.multiselectParameters.equals(searchingStocks.multiselectParameters);
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final InvestingStockSelectionViewModel$Header$TitleOnly getHeader() {
                    return this.header;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded.MultiSelect
                public final MultiSelectParametersViewModel getMultiselectParameters() {
                    return this.multiselectParameters;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final NavigationIcon getNavigationIcon() {
                    return NavigationIcon.CLOSE;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final String getSearchBarPlaceholderText() {
                    return this.searchBarPlaceholderText;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                public final SearchResultModel getSearchResults() {
                    return this.searchResults;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded.Searching
                public final InputFieldText getSearchText() {
                    return this.searchText;
                }

                public final int hashCode() {
                    return this.multiselectParameters.hashCode() + ((this.searchResults.hashCode() + ((NavigationIcon.CLOSE.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.searchText.hashCode() + (this.header.title.hashCode() * 31)) * 31, 31, this.searchBarPlaceholderText)) * 31)) * 31);
                }

                public final String toString() {
                    return "SearchingStocks(header=" + this.header + ", searchText=" + this.searchText + ", searchBarPlaceholderText=" + this.searchBarPlaceholderText + ", navigationIcon=" + NavigationIcon.CLOSE + ", searchResults=" + this.searchResults + ", multiselectParameters=" + this.multiselectParameters + ")";
                }
            }

            MultiSelectParametersViewModel getMultiselectParameters();
        }

        public interface Searching extends Loaded {
            InputFieldText getSearchText();
        }

        InvestingStockSelectionViewModel$Header$TitleOnly getHeader();

        NavigationIcon getNavigationIcon();

        String getSearchBarPlaceholderText();

        SearchResultModel getSearchResults();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NavigationIcon {
        public static final /* synthetic */ NavigationIcon[] $VALUES;
        public static final NavigationIcon CLOSE;

        /* JADX INFO: Fake field, exist only in values array */
        NavigationIcon EF0;

        static {
            NavigationIcon navigationIcon = new NavigationIcon("BACK", 0);
            NavigationIcon navigationIcon2 = new NavigationIcon("CLOSE", 1);
            CLOSE = navigationIcon2;
            $VALUES = new NavigationIcon[]{navigationIcon, navigationIcon2};
        }

        public static NavigationIcon valueOf(String str) {
            return (NavigationIcon) Enum.valueOf(NavigationIcon.class, str);
        }

        public static NavigationIcon[] values() {
            return (NavigationIcon[]) $VALUES.clone();
        }
    }

    public final class SearchResultItemModel {
        public final LinkScanner avatar;
        public final boolean enabled;
        public final InvestmentEntityToken entityToken;
        public final boolean selected;
        public final String stockName;
        public final String symbol;

        public SearchResultItemModel(InvestmentEntityToken investmentEntityToken, String str, String str2, LinkScanner linkScanner, boolean z, boolean z2) {
            investmentEntityToken.getClass();
            str.getClass();
            str2.getClass();
            linkScanner.getClass();
            this.entityToken = investmentEntityToken;
            this.stockName = str;
            this.symbol = str2;
            this.avatar = linkScanner;
            this.selected = z;
            this.enabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchResultItemModel)) {
                return false;
            }
            SearchResultItemModel searchResultItemModel = (SearchResultItemModel) obj;
            return Intrinsics.areEqual(this.entityToken, searchResultItemModel.entityToken) && Intrinsics.areEqual(this.stockName, searchResultItemModel.stockName) && Intrinsics.areEqual(this.symbol, searchResultItemModel.symbol) && Intrinsics.areEqual(this.avatar, searchResultItemModel.avatar) && this.selected == searchResultItemModel.selected && this.enabled == searchResultItemModel.enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entityToken.value.hashCode() * 31, 31, this.stockName), 31, this.symbol)) * 31, 31, this.selected);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchResultItemModel(entityToken=");
            sb.append(this.entityToken);
            sb.append(", stockName=");
            sb.append(this.stockName);
            sb.append(", symbol=");
            sb.append(this.symbol);
            sb.append(", avatar=");
            sb.append(this.avatar);
            sb.append(", selected=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.selected, ", enabled=", this.enabled, ")");
        }
    }

    public interface SearchResultModel {

        public final class LabeledSections implements SearchResultModel {
            public final Map results;

            public interface Header {

                public final class Selected implements Header {
                    public final String count;
                    public final String subtitle;
                    public final String title;

                    public Selected(String str, String str2, String str3) {
                        str.getClass();
                        this.title = str;
                        this.subtitle = str2;
                        this.count = str3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Selected)) {
                            return false;
                        }
                        Selected selected = (Selected) obj;
                        return Intrinsics.areEqual(this.title, selected.title) && Intrinsics.areEqual(this.subtitle, selected.subtitle) && this.count.equals(selected.count);
                    }

                    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        int hashCode = this.title.hashCode() * 31;
                        String str = this.subtitle;
                        return this.count.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Selected(title=", this.title, ", subtitle=", this.subtitle, ", count="), this.count, ")");
                    }
                }

                public final class Standard implements Header {
                    public final String title;

                    public Standard(String str) {
                        str.getClass();
                        this.title = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Standard) && Intrinsics.areEqual(this.title, ((Standard) obj).title);
                    }

                    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        return this.title.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Standard(title=", this.title, ")");
                    }
                }

                String getTitle();
            }

            public LabeledSections(Map map) {
                map.getClass();
                this.results = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LabeledSections) && Intrinsics.areEqual(this.results, ((LabeledSections) obj).results);
            }

            public final int hashCode() {
                return this.results.hashCode();
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m("LabeledSections(results=", ")", this.results);
            }
        }

        public final class UnlabeledSection implements SearchResultModel {
            public final ArrayList results;

            public UnlabeledSection(ArrayList arrayList) {
                this.results = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnlabeledSection) && this.results.equals(((UnlabeledSection) obj).results);
            }

            public final int hashCode() {
                return this.results.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("UnlabeledSection(results=", ")", this.results);
            }
        }
    }

    public final class Submitting implements InvestingStockSelectionViewModel {
        public static final Submitting INSTANCE = new Submitting();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submitting);
        }

        public final int hashCode() {
            return -1429346265;
        }

        public final String toString() {
            return "Submitting";
        }
    }
}
