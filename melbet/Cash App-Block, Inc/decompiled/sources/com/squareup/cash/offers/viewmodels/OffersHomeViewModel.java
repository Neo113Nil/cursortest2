package com.squareup.cash.offers.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersHomeViewModel {
    public final OffersHomeListingViewModel browseListingViewModel;
    public final boolean isPresenterInitialized;
    public final boolean isRefreshing;
    public final String searchPlaceholder;
    public final UiCallbackModel searchViewModel;
    public final String titleBarTitle;

    public OffersHomeViewModel(boolean z, String str, OffersHomeListingViewModel offersHomeListingViewModel, UiCallbackModel uiCallbackModel, String str2, boolean z2) {
        str.getClass();
        offersHomeListingViewModel.getClass();
        str2.getClass();
        this.isPresenterInitialized = z;
        this.searchPlaceholder = str;
        this.browseListingViewModel = offersHomeListingViewModel;
        this.searchViewModel = uiCallbackModel;
        this.titleBarTitle = str2;
        this.isRefreshing = z2;
        OffersSearchViewModel offersSearchViewModel = (OffersSearchViewModel) uiCallbackModel.model;
        if (offersSearchViewModel.isLoadingFullscreen) {
            return;
        }
        offersSearchViewModel.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersHomeViewModel)) {
            return false;
        }
        OffersHomeViewModel offersHomeViewModel = (OffersHomeViewModel) obj;
        return this.isPresenterInitialized == offersHomeViewModel.isPresenterInitialized && Intrinsics.areEqual(this.searchPlaceholder, offersHomeViewModel.searchPlaceholder) && Intrinsics.areEqual(this.browseListingViewModel, offersHomeViewModel.browseListingViewModel) && this.searchViewModel.equals(offersHomeViewModel.searchViewModel) && Intrinsics.areEqual(this.titleBarTitle, offersHomeViewModel.titleBarTitle) && this.isRefreshing == offersHomeViewModel.isRefreshing;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isRefreshing) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.searchViewModel.hashCode() + ((this.browseListingViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isPresenterInitialized) * 31, 31, this.searchPlaceholder)) * 31)) * 31, 31, this.titleBarTitle);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("OffersHomeViewModel(isPresenterInitialized=", ", searchPlaceholder=", this.searchPlaceholder, ", browseListingViewModel=", this.isPresenterInitialized);
        m.append(this.browseListingViewModel);
        m.append(", searchViewModel=");
        m.append(this.searchViewModel);
        m.append(", titleBarTitle=");
        return re$$ExternalSyntheticOutline0.m(m, this.titleBarTitle, ", isRefreshing=", this.isRefreshing, ")");
    }
}
