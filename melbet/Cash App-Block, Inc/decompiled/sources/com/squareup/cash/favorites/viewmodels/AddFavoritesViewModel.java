package com.squareup.cash.favorites.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.inputfieldtext.InputFieldText;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.Region;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AddFavoritesViewModel {
    public final boolean contactsPermissionGranted;
    public final String customEmptyMessage;
    public final List favoritedRecipients;
    public final boolean noResults;
    public final Region region;
    public final InputFieldText searchQuery;
    public final List sections;
    public final boolean shouldShowContactsSyncPrompt;
    public final boolean showLoadingIndicator;
    public final ToolbarViewModel toolbar;

    public AddFavoritesViewModel(InputFieldText inputFieldText, Region region, String str, ToolbarViewModel toolbarViewModel, List list, List list2, boolean z, boolean z2, boolean z3) {
        boolean z4 = list.isEmpty() && !z3;
        inputFieldText.getClass();
        list.getClass();
        list2.getClass();
        this.searchQuery = inputFieldText;
        this.region = region;
        this.customEmptyMessage = str;
        this.toolbar = toolbarViewModel;
        this.sections = list;
        this.favoritedRecipients = list2;
        this.contactsPermissionGranted = z;
        this.shouldShowContactsSyncPrompt = z2;
        this.showLoadingIndicator = z3;
        this.noResults = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddFavoritesViewModel)) {
            return false;
        }
        AddFavoritesViewModel addFavoritesViewModel = (AddFavoritesViewModel) obj;
        return Intrinsics.areEqual(this.searchQuery, addFavoritesViewModel.searchQuery) && this.region == addFavoritesViewModel.region && Intrinsics.areEqual(this.customEmptyMessage, addFavoritesViewModel.customEmptyMessage) && Intrinsics.areEqual(this.toolbar, addFavoritesViewModel.toolbar) && Intrinsics.areEqual(this.sections, addFavoritesViewModel.sections) && Intrinsics.areEqual(this.favoritedRecipients, addFavoritesViewModel.favoritedRecipients) && this.contactsPermissionGranted == addFavoritesViewModel.contactsPermissionGranted && this.shouldShowContactsSyncPrompt == addFavoritesViewModel.shouldShowContactsSyncPrompt && this.showLoadingIndicator == addFavoritesViewModel.showLoadingIndicator && this.noResults == addFavoritesViewModel.noResults;
    }

    public final int hashCode() {
        int hashCode = this.searchQuery.hashCode() * 31;
        Region region = this.region;
        int hashCode2 = (hashCode + (region == null ? 0 : region.hashCode())) * 31;
        String str = this.customEmptyMessage;
        return Boolean.hashCode(this.noResults) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.toolbar.title), 31, this.sections), 31, this.favoritedRecipients), 31, this.contactsPermissionGranted), 31, this.shouldShowContactsSyncPrompt), 31, this.showLoadingIndicator);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddFavoritesViewModel(searchQuery=");
        sb.append(this.searchQuery);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", customEmptyMessage=");
        sb.append(this.customEmptyMessage);
        sb.append(", toolbar=");
        sb.append(this.toolbar);
        sb.append(", sections=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.sections, ", favoritedRecipients=", this.favoritedRecipients, ", contactsPermissionGranted=");
        re$$ExternalSyntheticOutline0.m(sb, this.contactsPermissionGranted, ", shouldShowContactsSyncPrompt=", this.shouldShowContactsSyncPrompt, ", showLoadingIndicator=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.showLoadingIndicator, ", noResults=", this.noResults, ")");
    }
}
