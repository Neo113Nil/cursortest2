package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.inputfieldtext.InputFieldText;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpaySearchViewModel {
    public final BodyViewModel bodyViewModel;
    public final FilterBottomSheetViewModel filterBottomSheet;
    public final List filterPillViewModels;
    public final InputFieldText query;
    public final String queryPlaceholder;
    public final String title;

    public final class CategorySectionHeaderViewModel {
        public final String tapActionUrl;
        public final String title;

        public CategorySectionHeaderViewModel(String str, String str2) {
            this.title = str;
            this.tapActionUrl = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategorySectionHeaderViewModel)) {
                return false;
            }
            CategorySectionHeaderViewModel categorySectionHeaderViewModel = (CategorySectionHeaderViewModel) obj;
            return this.title.equals(categorySectionHeaderViewModel.title) && Intrinsics.areEqual(this.tapActionUrl, categorySectionHeaderViewModel.tapActionUrl);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.tapActionUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CategorySectionHeaderViewModel(title=", this.title, ", tapActionUrl=", this.tapActionUrl, ")");
        }
    }

    /* loaded from: classes6.dex */
    public interface CategoryTileViewModel {

        /* loaded from: classes5.dex */
        public final class CategoryIconTileViewModel implements CategoryTileViewModel {
            public final Color backgroundColor;
            public final Image icon;
            public final String impressionEventSpec;
            public final String tapActionUrl;
            public final String title;

            public CategoryIconTileViewModel(String str, String str2, String str3, Image image, Color color) {
                image.getClass();
                this.title = str;
                this.tapActionUrl = str2;
                this.impressionEventSpec = str3;
                this.icon = image;
                this.backgroundColor = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CategoryIconTileViewModel)) {
                    return false;
                }
                CategoryIconTileViewModel categoryIconTileViewModel = (CategoryIconTileViewModel) obj;
                return this.title.equals(categoryIconTileViewModel.title) && this.tapActionUrl.equals(categoryIconTileViewModel.tapActionUrl) && Intrinsics.areEqual(this.impressionEventSpec, categoryIconTileViewModel.impressionEventSpec) && Intrinsics.areEqual(this.icon, categoryIconTileViewModel.icon) && this.backgroundColor.equals(categoryIconTileViewModel.backgroundColor);
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel.CategoryTileViewModel
            public final String getImpressionEventSpec() {
                return this.impressionEventSpec;
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel.CategoryTileViewModel
            public final String getTapActionUrl() {
                return this.tapActionUrl;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.tapActionUrl);
                String str = this.impressionEventSpec;
                return this.backgroundColor.hashCode() + ((this.icon.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CategoryIconTileViewModel(title=", this.title, ", tapActionUrl=", this.tapActionUrl, ", impressionEventSpec=");
                m.append(this.impressionEventSpec);
                m.append(", icon=");
                m.append(this.icon);
                m.append(", backgroundColor=");
                m.append(this.backgroundColor);
                m.append(")");
                return m.toString();
            }
        }

        /* loaded from: classes5.dex */
        public final class CategoryImageTileViewModel implements CategoryTileViewModel {
            public final Image backgroundImage;
            public final String impressionEventSpec;
            public final String tapActionUrl;
            public final String title;

            public CategoryImageTileViewModel(Image image, String str, String str2, String str3) {
                image.getClass();
                this.title = str;
                this.tapActionUrl = str2;
                this.impressionEventSpec = str3;
                this.backgroundImage = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CategoryImageTileViewModel)) {
                    return false;
                }
                CategoryImageTileViewModel categoryImageTileViewModel = (CategoryImageTileViewModel) obj;
                return this.title.equals(categoryImageTileViewModel.title) && this.tapActionUrl.equals(categoryImageTileViewModel.tapActionUrl) && Intrinsics.areEqual(this.impressionEventSpec, categoryImageTileViewModel.impressionEventSpec) && Intrinsics.areEqual(this.backgroundImage, categoryImageTileViewModel.backgroundImage);
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel.CategoryTileViewModel
            public final String getImpressionEventSpec() {
                return this.impressionEventSpec;
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel.CategoryTileViewModel
            public final String getTapActionUrl() {
                return this.tapActionUrl;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.tapActionUrl);
                String str = this.impressionEventSpec;
                return this.backgroundImage.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CategoryImageTileViewModel(title=", this.title, ", tapActionUrl=", this.tapActionUrl, ", impressionEventSpec=");
                m.append(this.impressionEventSpec);
                m.append(", backgroundImage=");
                m.append(this.backgroundImage);
                m.append(")");
                return m.toString();
            }
        }

        String getImpressionEventSpec();

        String getTapActionUrl();
    }

    public final class CategoryTilesSectionViewModel {
        public final CategorySectionHeaderViewModel header;
        public final String id;
        public final String impressionEventSpec;
        public final ArrayList tiles;

        public CategoryTilesSectionViewModel(String str, CategorySectionHeaderViewModel categorySectionHeaderViewModel, ArrayList arrayList, String str2) {
            str.getClass();
            this.id = str;
            this.header = categorySectionHeaderViewModel;
            this.tiles = arrayList;
            this.impressionEventSpec = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryTilesSectionViewModel)) {
                return false;
            }
            CategoryTilesSectionViewModel categoryTilesSectionViewModel = (CategoryTilesSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, categoryTilesSectionViewModel.id) && this.header.equals(categoryTilesSectionViewModel.header) && this.tiles.equals(categoryTilesSectionViewModel.tiles) && Intrinsics.areEqual(this.impressionEventSpec, categoryTilesSectionViewModel.impressionEventSpec);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.tiles, (this.header.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
            String str = this.impressionEventSpec;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "CategoryTilesSectionViewModel(id=" + this.id + ", header=" + this.header + ", tiles=" + this.tiles + ", impressionEventSpec=" + this.impressionEventSpec + ")";
        }
    }

    public final class FilterBottomSheetViewModel {
        public final String applyButtonText;
        public final String filterGroupId;
        public final String resetButtonText;
        public final List rows;
        public final String selectedItemToken;
        public final String title;

        public final class FilterBottomSheetRowViewModel {
            public final String iconId;
            public final String name;
            public final String token;

            public FilterBottomSheetRowViewModel(String str, String str2, String str3) {
                str.getClass();
                str3.getClass();
                this.token = str;
                this.name = str2;
                this.iconId = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FilterBottomSheetRowViewModel)) {
                    return false;
                }
                FilterBottomSheetRowViewModel filterBottomSheetRowViewModel = (FilterBottomSheetRowViewModel) obj;
                return Intrinsics.areEqual(this.token, filterBottomSheetRowViewModel.token) && this.name.equals(filterBottomSheetRowViewModel.name) && Intrinsics.areEqual(this.iconId, filterBottomSheetRowViewModel.iconId);
            }

            public final int hashCode() {
                return this.iconId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilterBottomSheetRowViewModel(token=", this.token, ", name=", this.name, ", iconId="), this.iconId, ")");
            }
        }

        public FilterBottomSheetViewModel(String str, String str2, String str3, String str4, String str5, List list) {
            list.getClass();
            this.filterGroupId = str;
            this.title = str2;
            this.applyButtonText = str3;
            this.resetButtonText = str4;
            this.selectedItemToken = str5;
            this.rows = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterBottomSheetViewModel)) {
                return false;
            }
            FilterBottomSheetViewModel filterBottomSheetViewModel = (FilterBottomSheetViewModel) obj;
            return this.filterGroupId.equals(filterBottomSheetViewModel.filterGroupId) && this.title.equals(filterBottomSheetViewModel.title) && this.applyButtonText.equals(filterBottomSheetViewModel.applyButtonText) && this.resetButtonText.equals(filterBottomSheetViewModel.resetButtonText) && Intrinsics.areEqual(this.selectedItemToken, filterBottomSheetViewModel.selectedItemToken) && Intrinsics.areEqual(this.rows, filterBottomSheetViewModel.rows);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.filterGroupId.hashCode() * 31, 31, this.title), 31, this.applyButtonText), 31, this.resetButtonText);
            String str = this.selectedItemToken;
            return this.rows.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilterBottomSheetViewModel(filterGroupId=", this.filterGroupId, ", title=", this.title, ", applyButtonText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.applyButtonText, ", resetButtonText=", this.resetButtonText, ", selectedItemToken=");
            m.append(this.selectedItemToken);
            m.append(", rows=");
            m.append(this.rows);
            m.append(")");
            return m.toString();
        }
    }

    public final class FilterPillViewModel {
        public final String id;
        public final boolean selected;
        public final String text;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1044type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type SHEET;
            public static final Type TOGGLE;

            static {
                Type type2 = new Type("TOGGLE", 0);
                TOGGLE = type2;
                Type type3 = new Type("SHEET", 1);
                SHEET = type3;
                $VALUES = new Type[]{type2, type3};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public FilterPillViewModel(String str, String str2, boolean z, Type type2) {
            this.id = str;
            this.text = str2;
            this.selected = z;
            this.f1044type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterPillViewModel)) {
                return false;
            }
            FilterPillViewModel filterPillViewModel = (FilterPillViewModel) obj;
            return this.id.equals(filterPillViewModel.id) && this.text.equals(filterPillViewModel.text) && this.selected == filterPillViewModel.selected && this.f1044type == filterPillViewModel.f1044type;
        }

        public final int hashCode() {
            return this.f1044type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.text), 31, this.selected);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilterPillViewModel(id=", this.id, ", text=", this.text, ", selected=");
            m.append(this.selected);
            m.append(", type=");
            m.append(this.f1044type);
            m.append(")");
            return m.toString();
        }
    }

    public AfterpaySearchViewModel(String str, String str2, InputFieldText inputFieldText, List list, BodyViewModel bodyViewModel, FilterBottomSheetViewModel filterBottomSheetViewModel) {
        str.getClass();
        str2.getClass();
        inputFieldText.getClass();
        list.getClass();
        this.title = str;
        this.queryPlaceholder = str2;
        this.query = inputFieldText;
        this.filterPillViewModels = list;
        this.bodyViewModel = bodyViewModel;
        this.filterBottomSheet = filterBottomSheetViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpaySearchViewModel)) {
            return false;
        }
        AfterpaySearchViewModel afterpaySearchViewModel = (AfterpaySearchViewModel) obj;
        return Intrinsics.areEqual(this.title, afterpaySearchViewModel.title) && Intrinsics.areEqual(this.queryPlaceholder, afterpaySearchViewModel.queryPlaceholder) && Intrinsics.areEqual(this.query, afterpaySearchViewModel.query) && Intrinsics.areEqual(this.filterPillViewModels, afterpaySearchViewModel.filterPillViewModels) && this.bodyViewModel.equals(afterpaySearchViewModel.bodyViewModel) && Intrinsics.areEqual(this.filterBottomSheet, afterpaySearchViewModel.filterBottomSheet);
    }

    public final int hashCode() {
        int hashCode = (this.bodyViewModel.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.query.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.queryPlaceholder)) * 31, 31, this.filterPillViewModels)) * 31;
        FilterBottomSheetViewModel filterBottomSheetViewModel = this.filterBottomSheet;
        return hashCode + (filterBottomSheetViewModel == null ? 0 : filterBottomSheetViewModel.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpaySearchViewModel(title=", this.title, ", queryPlaceholder=", this.queryPlaceholder, ", query=");
        m.append(this.query);
        m.append(", filterPillViewModels=");
        m.append(this.filterPillViewModels);
        m.append(", bodyViewModel=");
        m.append(this.bodyViewModel);
        m.append(", filterBottomSheet=");
        m.append(this.filterBottomSheet);
        m.append(")");
        return m.toString();
    }

    public interface BodyViewModel {

        public final class LoadingViewModel implements BodyViewModel {
            public static final LoadingViewModel INSTANCE = new LoadingViewModel();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingViewModel);
            }

            public final int hashCode() {
                return -1369018629;
            }

            public final String toString() {
                return "LoadingViewModel";
            }
        }

        public final class ResultsViewModel implements BodyViewModel {
            public final CategoryTilesSectionViewModel categoryTilesSectionViewModel;
            public final RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel;
            public final List sections;
            public final boolean updateInProgress;
            public final UpsellCardSectionViewModel upsellCardSectionViewModel;

            public final class RecentlyViewedCarouselViewModel {
                public final List entries;
                public final boolean showFooterDivider;
                public final String subtitle;
                public final String title;

                public final class CarouselEntryViewModel {
                    public final StackedAvatarViewModel.Single avatar;
                    public final String id;
                    public final String name;

                    public CarouselEntryViewModel(StackedAvatarViewModel.Single single, String str, String str2) {
                        this.id = str;
                        this.name = str2;
                        this.avatar = single;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CarouselEntryViewModel)) {
                            return false;
                        }
                        CarouselEntryViewModel carouselEntryViewModel = (CarouselEntryViewModel) obj;
                        return this.id.equals(carouselEntryViewModel.id) && this.name.equals(carouselEntryViewModel.name) && this.avatar.equals(carouselEntryViewModel.avatar);
                    }

                    public final int hashCode() {
                        return this.avatar.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CarouselEntryViewModel(id=", this.id, ", name=", this.name, ", avatar=");
                        m.append(this.avatar);
                        m.append(")");
                        return m.toString();
                    }
                }

                public RecentlyViewedCarouselViewModel(String str, String str2, List list, boolean z) {
                    list.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.entries = list;
                    this.showFooterDivider = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RecentlyViewedCarouselViewModel)) {
                        return false;
                    }
                    RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel = (RecentlyViewedCarouselViewModel) obj;
                    return this.title.equals(recentlyViewedCarouselViewModel.title) && Intrinsics.areEqual(this.subtitle, recentlyViewedCarouselViewModel.subtitle) && Intrinsics.areEqual(this.entries, recentlyViewedCarouselViewModel.entries) && this.showFooterDivider == recentlyViewedCarouselViewModel.showFooterDivider;
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    return Boolean.hashCode(this.showFooterDivider) + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.entries);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecentlyViewedCarouselViewModel(title=", this.title, ", subtitle=", this.subtitle, ", entries=");
                    m.append(this.entries);
                    m.append(", showFooterDivider=");
                    m.append(this.showFooterDivider);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class RowViewModel {
                public final StackedAvatarViewModel.Single avatar;
                public final String id;
                public final String subtitle;
                public final String title;

                public RowViewModel(StackedAvatarViewModel.Single single, String str, String str2, String str3) {
                    this.id = str;
                    this.title = str2;
                    this.subtitle = str3;
                    this.avatar = single;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RowViewModel)) {
                        return false;
                    }
                    RowViewModel rowViewModel = (RowViewModel) obj;
                    return this.id.equals(rowViewModel.id) && this.title.equals(rowViewModel.title) && Intrinsics.areEqual(this.subtitle, rowViewModel.subtitle) && Intrinsics.areEqual(this.avatar, rowViewModel.avatar);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
                    String str = this.subtitle;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    StackedAvatarViewModel.Single single = this.avatar;
                    return hashCode + (single != null ? single.avatar.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RowViewModel(id=", this.id, ", title=", this.title, ", subtitle=");
                    m.append(this.subtitle);
                    m.append(", avatar=");
                    m.append(this.avatar);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class SectionViewModel {
                public final String id;
                public final List rowViewModels;
                public final boolean showFooterDivider;
                public final String subtitle;
                public final String title;

                public SectionViewModel(String str, String str2, String str3, List list, boolean z) {
                    str.getClass();
                    list.getClass();
                    this.id = str;
                    this.title = str2;
                    this.subtitle = str3;
                    this.rowViewModels = list;
                    this.showFooterDivider = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SectionViewModel)) {
                        return false;
                    }
                    SectionViewModel sectionViewModel = (SectionViewModel) obj;
                    return Intrinsics.areEqual(this.id, sectionViewModel.id) && this.title.equals(sectionViewModel.title) && Intrinsics.areEqual(this.subtitle, sectionViewModel.subtitle) && Intrinsics.areEqual(this.rowViewModels, sectionViewModel.rowViewModels) && this.showFooterDivider == sectionViewModel.showFooterDivider;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
                    String str = this.subtitle;
                    return Boolean.hashCode(this.showFooterDivider) + Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.rowViewModels);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionViewModel(id=", this.id, ", title=", this.title, ", subtitle=");
                    NavAction$$ExternalSyntheticOutline0.m(this.subtitle, ", rowViewModels=", ", showFooterDivider=", m, this.rowViewModels);
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showFooterDivider, ")");
                }
            }

            public final class UpsellCardSectionViewModel {
                public final String id;
                public final AfterpayAppletUpsellCardViewModel upsellCard;

                public UpsellCardSectionViewModel(String str, AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel) {
                    str.getClass();
                    this.id = str;
                    this.upsellCard = afterpayAppletUpsellCardViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UpsellCardSectionViewModel)) {
                        return false;
                    }
                    UpsellCardSectionViewModel upsellCardSectionViewModel = (UpsellCardSectionViewModel) obj;
                    return Intrinsics.areEqual(this.id, upsellCardSectionViewModel.id) && this.upsellCard.equals(upsellCardSectionViewModel.upsellCard);
                }

                public final int hashCode() {
                    return this.upsellCard.hashCode() + (this.id.hashCode() * 31);
                }

                public final String toString() {
                    return "UpsellCardSectionViewModel(id=" + this.id + ", upsellCard=" + this.upsellCard + ")";
                }
            }

            public ResultsViewModel(RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel, UpsellCardSectionViewModel upsellCardSectionViewModel, List list, int i) {
                this((i & 1) != 0 ? null : recentlyViewedCarouselViewModel, null, (i & 4) != 0 ? null : upsellCardSectionViewModel, list, false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ResultsViewModel)) {
                    return false;
                }
                ResultsViewModel resultsViewModel = (ResultsViewModel) obj;
                return Intrinsics.areEqual(this.recentlyViewedCarouselViewModel, resultsViewModel.recentlyViewedCarouselViewModel) && Intrinsics.areEqual(this.categoryTilesSectionViewModel, resultsViewModel.categoryTilesSectionViewModel) && Intrinsics.areEqual(this.upsellCardSectionViewModel, resultsViewModel.upsellCardSectionViewModel) && Intrinsics.areEqual(this.sections, resultsViewModel.sections) && this.updateInProgress == resultsViewModel.updateInProgress;
            }

            public final int hashCode() {
                RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel = this.recentlyViewedCarouselViewModel;
                int hashCode = (recentlyViewedCarouselViewModel == null ? 0 : recentlyViewedCarouselViewModel.hashCode()) * 31;
                CategoryTilesSectionViewModel categoryTilesSectionViewModel = this.categoryTilesSectionViewModel;
                int hashCode2 = (hashCode + (categoryTilesSectionViewModel == null ? 0 : categoryTilesSectionViewModel.hashCode())) * 31;
                UpsellCardSectionViewModel upsellCardSectionViewModel = this.upsellCardSectionViewModel;
                return Boolean.hashCode(this.updateInProgress) + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (upsellCardSectionViewModel != null ? upsellCardSectionViewModel.hashCode() : 0)) * 31, 31, this.sections);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ResultsViewModel(recentlyViewedCarouselViewModel=");
                sb.append(this.recentlyViewedCarouselViewModel);
                sb.append(", categoryTilesSectionViewModel=");
                sb.append(this.categoryTilesSectionViewModel);
                sb.append(", upsellCardSectionViewModel=");
                sb.append(this.upsellCardSectionViewModel);
                sb.append(", sections=");
                sb.append(this.sections);
                sb.append(", updateInProgress=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.updateInProgress, ")");
            }

            public ResultsViewModel(RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel, CategoryTilesSectionViewModel categoryTilesSectionViewModel, UpsellCardSectionViewModel upsellCardSectionViewModel, List list, boolean z) {
                list.getClass();
                this.recentlyViewedCarouselViewModel = recentlyViewedCarouselViewModel;
                this.categoryTilesSectionViewModel = categoryTilesSectionViewModel;
                this.upsellCardSectionViewModel = upsellCardSectionViewModel;
                this.sections = list;
                this.updateInProgress = z;
            }
        }

        public final class NoContentViewModel implements BodyViewModel {
            public final AfterpaySearchViewEvent buttonClickEvent;
            public final String buttonIconId;
            public final String buttonText;
            public final boolean fallbackToLocalImage;
            public final Image remoteImage;
            public final String subtitle;
            public final String title;

            public /* synthetic */ NoContentViewModel(String str, String str2, Image image, String str3, String str4, AfterpaySearchViewEvent afterpaySearchViewEvent, int i) {
                this(str, str2, (i & 4) != 0 ? null : image, (i & 8) == 0, str3, str4, afterpaySearchViewEvent);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NoContentViewModel)) {
                    return false;
                }
                NoContentViewModel noContentViewModel = (NoContentViewModel) obj;
                return Intrinsics.areEqual(this.title, noContentViewModel.title) && Intrinsics.areEqual(this.subtitle, noContentViewModel.subtitle) && Intrinsics.areEqual(this.remoteImage, noContentViewModel.remoteImage) && this.fallbackToLocalImage == noContentViewModel.fallbackToLocalImage && Intrinsics.areEqual(this.buttonText, noContentViewModel.buttonText) && Intrinsics.areEqual(this.buttonIconId, noContentViewModel.buttonIconId) && Intrinsics.areEqual(this.buttonClickEvent, noContentViewModel.buttonClickEvent);
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Image image = this.remoteImage;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.fallbackToLocalImage);
                String str3 = this.buttonText;
                int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.buttonIconId;
                return this.buttonClickEvent.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoContentViewModel(title=", this.title, ", subtitle=", this.subtitle, ", remoteImage=");
                m.append(this.remoteImage);
                m.append(", fallbackToLocalImage=");
                m.append(this.fallbackToLocalImage);
                m.append(", buttonText=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.buttonText, ", buttonIconId=", this.buttonIconId, ", buttonClickEvent=");
                m.append(this.buttonClickEvent);
                m.append(")");
                return m.toString();
            }

            public NoContentViewModel(String str, String str2, Image image, boolean z, String str3, String str4, AfterpaySearchViewEvent afterpaySearchViewEvent) {
                this.title = str;
                this.subtitle = str2;
                this.remoteImage = image;
                this.fallbackToLocalImage = z;
                this.buttonText = str3;
                this.buttonIconId = str4;
                this.buttonClickEvent = afterpaySearchViewEvent;
            }
        }
    }
}
