package com.squareup.cash.offers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersSearchViewModel {
    public final FilterGroupsSectionViewModel filterGroupSectionViewModel;
    public final String filterTokens;
    public final boolean isLoadingFullscreen;
    public final boolean isLoadingSearchResults;
    public final boolean isSearchMode;
    public final OffersSearchListViewModel listViewModel;
    public final int responseId;
    public final boolean searchResultsLoading;

    public abstract class OffersSearchListViewModel {

        public final class Error extends OffersSearchListViewModel {
            public final OffersMessageViewModel errorModel;

            public Error(OffersMessageViewModel offersMessageViewModel) {
                this.errorModel = offersMessageViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.errorModel.equals(((Error) obj).errorModel);
            }

            public final int hashCode() {
                return this.errorModel.hashCode();
            }

            public final String toString() {
                return "Error(errorModel=" + this.errorModel + ")";
            }
        }

        public final class Initial extends OffersSearchListViewModel {
            public static final Initial INSTANCE = new Initial();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Initial);
            }

            public final int hashCode() {
                return 1417205498;
            }

            public final String toString() {
                return "Initial";
            }
        }

        public final class Loaded extends OffersSearchListViewModel {
            public final List items;

            public Loaded(ListBuilder listBuilder) {
                listBuilder.getClass();
                this.items = listBuilder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && Intrinsics.areEqual(this.items, ((Loaded) obj).items);
            }

            public final int hashCode() {
                return this.items.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(items=", ")", this.items);
            }
        }

        public final class Loading extends OffersSearchListViewModel {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -194486030;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public OffersSearchViewModel(boolean z, String str, FilterGroupsSectionViewModel filterGroupsSectionViewModel, OffersSearchListViewModel offersSearchListViewModel, int i, boolean z2, boolean z3) {
        str.getClass();
        filterGroupsSectionViewModel.getClass();
        offersSearchListViewModel.getClass();
        this.isSearchMode = z;
        this.filterTokens = str;
        this.filterGroupSectionViewModel = filterGroupsSectionViewModel;
        this.listViewModel = offersSearchListViewModel;
        this.responseId = i;
        this.isLoadingFullscreen = z2;
        this.isLoadingSearchResults = z3;
        this.searchResultsLoading = !z2 && z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSearchViewModel)) {
            return false;
        }
        OffersSearchViewModel offersSearchViewModel = (OffersSearchViewModel) obj;
        return this.isSearchMode == offersSearchViewModel.isSearchMode && Intrinsics.areEqual(this.filterTokens, offersSearchViewModel.filterTokens) && Intrinsics.areEqual(this.filterGroupSectionViewModel, offersSearchViewModel.filterGroupSectionViewModel) && Intrinsics.areEqual(this.listViewModel, offersSearchViewModel.listViewModel) && this.responseId == offersSearchViewModel.responseId && this.isLoadingFullscreen == offersSearchViewModel.isLoadingFullscreen && this.isLoadingSearchResults == offersSearchViewModel.isLoadingSearchResults;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoadingSearchResults) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.responseId, (this.listViewModel.hashCode() + ((this.filterGroupSectionViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isSearchMode) * 31, 31, this.filterTokens)) * 31)) * 31, 31), 31, this.isLoadingFullscreen);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("OffersSearchViewModel(isSearchMode=", ", filterTokens=", this.filterTokens, ", filterGroupSectionViewModel=", this.isSearchMode);
        m.append(this.filterGroupSectionViewModel);
        m.append(", listViewModel=");
        m.append(this.listViewModel);
        m.append(", responseId=");
        m.append(this.responseId);
        m.append(", isLoadingFullscreen=");
        m.append(this.isLoadingFullscreen);
        m.append(", isLoadingSearchResults=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isLoadingSearchResults, ")");
    }
}
