package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpaySearchViewEvent {

    public final class CategoryTileClicked implements AfterpaySearchViewEvent {
        public final String actionUrl;
        public final ArrayList analyticsActionEventSpecs;

        public CategoryTileClicked(String str, ArrayList arrayList) {
            str.getClass();
            this.actionUrl = str;
            this.analyticsActionEventSpecs = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryTileClicked)) {
                return false;
            }
            CategoryTileClicked categoryTileClicked = (CategoryTileClicked) obj;
            return Intrinsics.areEqual(this.actionUrl, categoryTileClicked.actionUrl) && this.analyticsActionEventSpecs.equals(categoryTileClicked.analyticsActionEventSpecs);
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode() + (this.actionUrl.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.analyticsActionEventSpecs, "CategoryTileClicked(actionUrl=", this.actionUrl, ", analyticsActionEventSpecs=", ")");
        }
    }

    public final class Close implements AfterpaySearchViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1602219332;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public interface FilterBottomSheetViewEvent extends AfterpaySearchViewEvent {

        public final class ClearFilterSelection implements FilterBottomSheetViewEvent {
            public final String filterGroupId;

            public ClearFilterSelection(String str) {
                this.filterGroupId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearFilterSelection) && this.filterGroupId.equals(((ClearFilterSelection) obj).filterGroupId);
            }

            public final int hashCode() {
                return this.filterGroupId.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClearFilterSelection(filterGroupId=", this.filterGroupId, ")");
            }
        }

        public final class CloseFilterBottomSheet implements FilterBottomSheetViewEvent {
            public static final CloseFilterBottomSheet INSTANCE = new CloseFilterBottomSheet();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseFilterBottomSheet);
            }

            public final int hashCode() {
                return -791221179;
            }

            public final String toString() {
                return "CloseFilterBottomSheet";
            }
        }

        public final class UpdateFilterSelection implements FilterBottomSheetViewEvent {
            public final String filterGroupId;
            public final String filterItemToken;

            public UpdateFilterSelection(String str, String str2) {
                this.filterGroupId = str;
                this.filterItemToken = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateFilterSelection)) {
                    return false;
                }
                UpdateFilterSelection updateFilterSelection = (UpdateFilterSelection) obj;
                return this.filterGroupId.equals(updateFilterSelection.filterGroupId) && Intrinsics.areEqual(this.filterItemToken, updateFilterSelection.filterItemToken);
            }

            public final int hashCode() {
                int hashCode = this.filterGroupId.hashCode() * 31;
                String str = this.filterItemToken;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("UpdateFilterSelection(filterGroupId=", this.filterGroupId, ", filterItemToken=", this.filterItemToken, ")");
            }
        }
    }

    public final class FilterClicked implements AfterpaySearchViewEvent {
        public final String filterGroupId;

        /* renamed from: type, reason: collision with root package name */
        public final AfterpaySearchViewModel.FilterPillViewModel.Type f1045type;

        public FilterClicked(String str, AfterpaySearchViewModel.FilterPillViewModel.Type type2) {
            this.filterGroupId = str;
            this.f1045type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterClicked)) {
                return false;
            }
            FilterClicked filterClicked = (FilterClicked) obj;
            return this.filterGroupId.equals(filterClicked.filterGroupId) && this.f1045type == filterClicked.f1045type;
        }

        public final int hashCode() {
            return this.f1045type.hashCode() + (this.filterGroupId.hashCode() * 31);
        }

        public final String toString() {
            return "FilterClicked(filterGroupId=" + this.filterGroupId + ", type=" + this.f1045type + ")";
        }
    }

    public final class NoResultsCtaButtonClicked implements AfterpaySearchViewEvent {
        public static final NoResultsCtaButtonClicked INSTANCE = new NoResultsCtaButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoResultsCtaButtonClicked);
        }

        public final int hashCode() {
            return 539267782;
        }

        public final String toString() {
            return "NoResultsCtaButtonClicked";
        }
    }

    public final class QueryUpdated implements AfterpaySearchViewEvent {
        public final TextFieldStateInputFieldText query;

        public QueryUpdated(TextFieldStateInputFieldText textFieldStateInputFieldText) {
            this.query = textFieldStateInputFieldText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QueryUpdated) && this.query.equals(((QueryUpdated) obj).query);
        }

        public final int hashCode() {
            return this.query.textFieldState.hashCode();
        }

        public final String toString() {
            return "QueryUpdated(query=" + this.query + ")";
        }
    }

    public final class RecentlyViewedCarouselViewed implements AfterpaySearchViewEvent {
        public static final RecentlyViewedCarouselViewed INSTANCE = new RecentlyViewedCarouselViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecentlyViewedCarouselViewed);
        }

        public final int hashCode() {
            return 1539101476;
        }

        public final String toString() {
            return "RecentlyViewedCarouselViewed";
        }
    }

    public final class RecentlyViewedItemClicked implements AfterpaySearchViewEvent {
        public final String id;

        public RecentlyViewedItemClicked(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecentlyViewedItemClicked) && Intrinsics.areEqual(this.id, ((RecentlyViewedItemClicked) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecentlyViewedItemClicked(id=", this.id, ")");
        }
    }

    public final class SearchResultRowClicked implements AfterpaySearchViewEvent {
        public final String rowId;
        public final String sectionId;

        public SearchResultRowClicked(String str, String str2) {
            str.getClass();
            this.sectionId = str;
            this.rowId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchResultRowClicked)) {
                return false;
            }
            SearchResultRowClicked searchResultRowClicked = (SearchResultRowClicked) obj;
            return Intrinsics.areEqual(this.sectionId, searchResultRowClicked.sectionId) && this.rowId.equals(searchResultRowClicked.rowId);
        }

        public final int hashCode() {
            return this.rowId.hashCode() + (this.sectionId.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SearchResultRowClicked(sectionId=", this.sectionId, ", rowId=", this.rowId, ")");
        }
    }

    public final class SearchResultRowViewed implements AfterpaySearchViewEvent {
        public final String rowId;
        public final String sectionId;

        public SearchResultRowViewed(String str, String str2) {
            str.getClass();
            this.sectionId = str;
            this.rowId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchResultRowViewed)) {
                return false;
            }
            SearchResultRowViewed searchResultRowViewed = (SearchResultRowViewed) obj;
            return Intrinsics.areEqual(this.sectionId, searchResultRowViewed.sectionId) && this.rowId.equals(searchResultRowViewed.rowId);
        }

        public final int hashCode() {
            return this.rowId.hashCode() + (this.sectionId.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SearchResultRowViewed(sectionId=", this.sectionId, ", rowId=", this.rowId, ")");
        }
    }

    public final class SectionViewed implements AfterpaySearchViewEvent {
        public final String sectionId;

        public SectionViewed(String str) {
            str.getClass();
            this.sectionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SectionViewed) && Intrinsics.areEqual(this.sectionId, ((SectionViewed) obj).sectionId);
        }

        public final int hashCode() {
            return this.sectionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionViewed(sectionId=", this.sectionId, ")");
        }
    }

    public final class TryAgainButtonClicked implements AfterpaySearchViewEvent {
        public static final TryAgainButtonClicked INSTANCE = new TryAgainButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainButtonClicked);
        }

        public final int hashCode() {
            return -923338372;
        }

        public final String toString() {
            return "TryAgainButtonClicked";
        }
    }

    public final class UpsellCardButtonTapped implements AfterpaySearchViewEvent {
        public final String actionUrl;
        public final List analyticsEventSpecs;

        public UpsellCardButtonTapped(String str, List list) {
            list.getClass();
            this.actionUrl = str;
            this.analyticsEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpsellCardButtonTapped)) {
                return false;
            }
            UpsellCardButtonTapped upsellCardButtonTapped = (UpsellCardButtonTapped) obj;
            return Intrinsics.areEqual(this.actionUrl, upsellCardButtonTapped.actionUrl) && Intrinsics.areEqual(this.analyticsEventSpecs, upsellCardButtonTapped.analyticsEventSpecs);
        }

        public final int hashCode() {
            String str = this.actionUrl;
            return this.analyticsEventSpecs.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("UpsellCardButtonTapped(actionUrl=", this.actionUrl, ", analyticsEventSpecs=", ")", this.analyticsEventSpecs);
        }
    }

    public final class UpsellCardTapped implements AfterpaySearchViewEvent {
        public final String actionUrl;
        public final List analyticsEventSpecs;

        public UpsellCardTapped(String str, List list) {
            list.getClass();
            this.actionUrl = str;
            this.analyticsEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpsellCardTapped)) {
                return false;
            }
            UpsellCardTapped upsellCardTapped = (UpsellCardTapped) obj;
            return Intrinsics.areEqual(this.actionUrl, upsellCardTapped.actionUrl) && Intrinsics.areEqual(this.analyticsEventSpecs, upsellCardTapped.analyticsEventSpecs);
        }

        public final int hashCode() {
            String str = this.actionUrl;
            return this.analyticsEventSpecs.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("UpsellCardTapped(actionUrl=", this.actionUrl, ", analyticsEventSpecs=", ")", this.analyticsEventSpecs);
        }
    }

    public final class UpsellCardViewed implements AfterpaySearchViewEvent {
        public final String analyticsEventSpec;

        public UpsellCardViewed(String str) {
            this.analyticsEventSpec = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpsellCardViewed) && Intrinsics.areEqual(this.analyticsEventSpec, ((UpsellCardViewed) obj).analyticsEventSpec);
        }

        public final int hashCode() {
            String str = this.analyticsEventSpec;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpsellCardViewed(analyticsEventSpec=", this.analyticsEventSpec, ")");
        }
    }
}
