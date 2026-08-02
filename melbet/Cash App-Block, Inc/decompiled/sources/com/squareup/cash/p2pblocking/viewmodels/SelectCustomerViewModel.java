package com.squareup.cash.p2pblocking.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.inputfieldtext.InputFieldText;
import com.squareup.protos.franklin.api.Region;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectCustomerViewModel {
    public final String continueButtonText;
    public final String headerTitle;
    public final boolean isLoading;
    public final String promptSearchMessage;
    public final String promptSearchTitle;
    public final Region region;
    public final String searchBarPlaceholder;
    public final List searchResults;
    public final String searchResultsTitle;
    public final InputFieldText searchText;
    public final boolean showContinueButton;
    public final List suggestionResults;
    public final String suggestionResultsTitle;
    public final String title;
    public final P2PFailureDialogModel unableToUnblockDialog;
    public final boolean useBackNavigation;

    public SelectCustomerViewModel(InputFieldText inputFieldText, String str, List list, String str2, String str3, String str4, List list2, String str5, Region region, boolean z, P2PFailureDialogModel p2PFailureDialogModel, boolean z2, boolean z3, String str6, String str7, String str8) {
        inputFieldText.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        list2.getClass();
        str5.getClass();
        this.searchText = inputFieldText;
        this.searchBarPlaceholder = str;
        this.suggestionResults = list;
        this.suggestionResultsTitle = str2;
        this.title = str3;
        this.headerTitle = str4;
        this.searchResults = list2;
        this.searchResultsTitle = str5;
        this.region = region;
        this.isLoading = z;
        this.unableToUnblockDialog = p2PFailureDialogModel;
        this.useBackNavigation = z2;
        this.showContinueButton = z3;
        this.continueButtonText = str6;
        this.promptSearchTitle = str7;
        this.promptSearchMessage = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectCustomerViewModel)) {
            return false;
        }
        SelectCustomerViewModel selectCustomerViewModel = (SelectCustomerViewModel) obj;
        return Intrinsics.areEqual(this.searchText, selectCustomerViewModel.searchText) && Intrinsics.areEqual(this.searchBarPlaceholder, selectCustomerViewModel.searchBarPlaceholder) && Intrinsics.areEqual(this.suggestionResults, selectCustomerViewModel.suggestionResults) && Intrinsics.areEqual(this.suggestionResultsTitle, selectCustomerViewModel.suggestionResultsTitle) && Intrinsics.areEqual(this.title, selectCustomerViewModel.title) && Intrinsics.areEqual(this.headerTitle, selectCustomerViewModel.headerTitle) && Intrinsics.areEqual(this.searchResults, selectCustomerViewModel.searchResults) && Intrinsics.areEqual(this.searchResultsTitle, selectCustomerViewModel.searchResultsTitle) && this.region == selectCustomerViewModel.region && this.isLoading == selectCustomerViewModel.isLoading && Intrinsics.areEqual(this.unableToUnblockDialog, selectCustomerViewModel.unableToUnblockDialog) && this.useBackNavigation == selectCustomerViewModel.useBackNavigation && this.showContinueButton == selectCustomerViewModel.showContinueButton && Intrinsics.areEqual(this.continueButtonText, selectCustomerViewModel.continueButtonText) && Intrinsics.areEqual(this.promptSearchTitle, selectCustomerViewModel.promptSearchTitle) && Intrinsics.areEqual(this.promptSearchMessage, selectCustomerViewModel.promptSearchMessage);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.searchText.hashCode() * 31, 31, this.searchBarPlaceholder), 31, this.suggestionResults), 31, this.suggestionResultsTitle);
        String str = this.title;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headerTitle;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.searchResults), 31, this.searchResultsTitle);
        Region region = this.region;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (region == null ? 0 : region.hashCode())) * 31, 31, this.isLoading);
        P2PFailureDialogModel p2PFailureDialogModel = this.unableToUnblockDialog;
        int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (p2PFailureDialogModel == null ? 0 : p2PFailureDialogModel.hashCode())) * 31, 31, this.useBackNavigation), 31, this.showContinueButton);
        String str3 = this.continueButtonText;
        int hashCode2 = (m4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promptSearchTitle;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promptSearchMessage;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectCustomerViewModel(searchText=");
        sb.append(this.searchText);
        sb.append(", searchBarPlaceholder=");
        sb.append(this.searchBarPlaceholder);
        sb.append(", suggestionResults=");
        Recorder$$ExternalSyntheticOutline2.m(", suggestionResultsTitle=", this.suggestionResultsTitle, ", title=", sb, this.suggestionResults);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", headerTitle=", this.headerTitle, ", searchResults=");
        Recorder$$ExternalSyntheticOutline2.m(", searchResultsTitle=", this.searchResultsTitle, ", region=", sb, this.searchResults);
        sb.append(this.region);
        sb.append(", isLoading=");
        sb.append(this.isLoading);
        sb.append(", unableToUnblockDialog=");
        sb.append(this.unableToUnblockDialog);
        sb.append(", useBackNavigation=");
        sb.append(this.useBackNavigation);
        sb.append(", showContinueButton=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.showContinueButton, ", continueButtonText=", this.continueButtonText, ", promptSearchTitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.promptSearchTitle, ", promptSearchMessage=", this.promptSearchMessage, ")");
    }
}
