package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.protos.franklin.api.Region;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MainPaymentViewModel {
    public final boolean contactsPermissionGranted;
    public final InstrumentSelectionRowViewModel instrumentSelectionRowViewModel;
    public final boolean isBitcoin;
    public final boolean isNoteEnabled;
    public final boolean isNoteVisible;
    public final boolean isRestoreState;
    public final String noResultMessage;
    public final boolean noResults;
    public final String note;
    public final String noteHint;
    public final PersonalizePaymentEntrypointButtonViewModel personalizePaymentButtonState;
    public final RecipientsInputViewConfig recipientsInputViewConfig;
    public final Region region;
    public final String searchHint;
    public final String searchQuery;
    public final List sections;
    public final Map selectedRecipients;
    public final Versioned shouldClearFocus;
    public final boolean shouldLockSelectedRecipient;
    public final Versioned shouldRequestNoteFocus;
    public final boolean shouldShowBlockedBadge;
    public final boolean shouldShowContactsSyncPrompt;
    public final boolean showLoadingIndicator;
    public final ToolbarViewModel toolbarViewModel;

    public MainPaymentViewModel(String str, List list, Region region, Map map, boolean z, boolean z2, ToolbarViewModel toolbarViewModel, String str2, boolean z3, boolean z4, boolean z5, String str3, String str4, boolean z6, PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel, Versioned versioned, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, Versioned versioned2, boolean z7, String str5, RecipientsInputViewConfig recipientsInputViewConfig, boolean z8) {
        boolean z9 = list.isEmpty() && !z;
        str.getClass();
        list.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        personalizePaymentEntrypointButtonViewModel.getClass();
        this.searchQuery = str;
        this.sections = list;
        this.region = region;
        this.selectedRecipients = map;
        this.showLoadingIndicator = z;
        this.noResults = z9;
        this.contactsPermissionGranted = z2;
        this.toolbarViewModel = toolbarViewModel;
        this.note = str2;
        this.shouldShowContactsSyncPrompt = z3;
        this.isRestoreState = z4;
        this.shouldLockSelectedRecipient = z5;
        this.searchHint = str3;
        this.noteHint = str4;
        this.isNoteVisible = true;
        this.isNoteEnabled = z6;
        this.personalizePaymentButtonState = personalizePaymentEntrypointButtonViewModel;
        this.shouldRequestNoteFocus = versioned;
        this.instrumentSelectionRowViewModel = instrumentSelectionRowViewModel;
        this.shouldClearFocus = versioned2;
        this.shouldShowBlockedBadge = z7;
        this.noResultMessage = str5;
        this.recipientsInputViewConfig = recipientsInputViewConfig;
        this.isBitcoin = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPaymentViewModel)) {
            return false;
        }
        MainPaymentViewModel mainPaymentViewModel = (MainPaymentViewModel) obj;
        return Intrinsics.areEqual(this.searchQuery, mainPaymentViewModel.searchQuery) && Intrinsics.areEqual(this.sections, mainPaymentViewModel.sections) && this.region == mainPaymentViewModel.region && Intrinsics.areEqual(this.selectedRecipients, mainPaymentViewModel.selectedRecipients) && this.showLoadingIndicator == mainPaymentViewModel.showLoadingIndicator && this.noResults == mainPaymentViewModel.noResults && this.contactsPermissionGranted == mainPaymentViewModel.contactsPermissionGranted && Intrinsics.areEqual(this.toolbarViewModel, mainPaymentViewModel.toolbarViewModel) && Intrinsics.areEqual(this.note, mainPaymentViewModel.note) && this.shouldShowContactsSyncPrompt == mainPaymentViewModel.shouldShowContactsSyncPrompt && this.isRestoreState == mainPaymentViewModel.isRestoreState && this.shouldLockSelectedRecipient == mainPaymentViewModel.shouldLockSelectedRecipient && Intrinsics.areEqual(this.searchHint, mainPaymentViewModel.searchHint) && Intrinsics.areEqual(this.noteHint, mainPaymentViewModel.noteHint) && this.isNoteVisible == mainPaymentViewModel.isNoteVisible && this.isNoteEnabled == mainPaymentViewModel.isNoteEnabled && Intrinsics.areEqual(this.personalizePaymentButtonState, mainPaymentViewModel.personalizePaymentButtonState) && Intrinsics.areEqual(this.shouldRequestNoteFocus, mainPaymentViewModel.shouldRequestNoteFocus) && Intrinsics.areEqual(this.instrumentSelectionRowViewModel, mainPaymentViewModel.instrumentSelectionRowViewModel) && Intrinsics.areEqual(this.shouldClearFocus, mainPaymentViewModel.shouldClearFocus) && this.shouldShowBlockedBadge == mainPaymentViewModel.shouldShowBlockedBadge && Intrinsics.areEqual(this.noResultMessage, mainPaymentViewModel.noResultMessage) && Intrinsics.areEqual(this.recipientsInputViewConfig, mainPaymentViewModel.recipientsInputViewConfig) && this.isBitcoin == mainPaymentViewModel.isBitcoin;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.searchQuery.hashCode() * 31, 31, this.sections);
        Region region = this.region;
        int hashCode = (this.personalizePaymentButtonState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.toolbarViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m((m + (region == null ? 0 : region.hashCode())) * 31, this.selectedRecipients, 31), 31, this.showLoadingIndicator), 31, this.noResults), 31, this.contactsPermissionGranted)) * 31, 31, this.note), 31, this.shouldShowContactsSyncPrompt), 31, this.isRestoreState), 31, this.shouldLockSelectedRecipient), 31, this.searchHint), 31, this.noteHint), 31, this.isNoteVisible), 31, this.isNoteEnabled)) * 31;
        Versioned versioned = this.shouldRequestNoteFocus;
        int hashCode2 = (hashCode + (versioned == null ? 0 : versioned.hashCode())) * 31;
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = this.instrumentSelectionRowViewModel;
        int hashCode3 = (hashCode2 + (instrumentSelectionRowViewModel == null ? 0 : instrumentSelectionRowViewModel.hashCode())) * 31;
        Versioned versioned2 = this.shouldClearFocus;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (versioned2 == null ? 0 : versioned2.hashCode())) * 31, 31, this.shouldShowBlockedBadge);
        String str = this.noResultMessage;
        return Boolean.hashCode(this.isBitcoin) + ((this.recipientsInputViewConfig.hashCode() + ((m2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("MainPaymentViewModel(searchQuery=", this.searchQuery, ", sections=", ", region=", this.sections);
        m.append(this.region);
        m.append(", selectedRecipients=");
        m.append(this.selectedRecipients);
        m.append(", showLoadingIndicator=");
        re$$ExternalSyntheticOutline0.m(m, this.showLoadingIndicator, ", noResults=", this.noResults, ", contactsPermissionGranted=");
        m.append(this.contactsPermissionGranted);
        m.append(", toolbarViewModel=");
        m.append(this.toolbarViewModel);
        m.append(", note=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.note, ", shouldShowContactsSyncPrompt=", this.shouldShowContactsSyncPrompt, ", isRestoreState=");
        re$$ExternalSyntheticOutline0.m(m, this.isRestoreState, ", shouldLockSelectedRecipient=", this.shouldLockSelectedRecipient, ", searchHint=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.searchHint, ", noteHint=", this.noteHint, ", isNoteVisible=");
        re$$ExternalSyntheticOutline0.m(m, this.isNoteVisible, ", isNoteEnabled=", this.isNoteEnabled, ", personalizePaymentButtonState=");
        m.append(this.personalizePaymentButtonState);
        m.append(", shouldRequestNoteFocus=");
        m.append(this.shouldRequestNoteFocus);
        m.append(", instrumentSelectionRowViewModel=");
        m.append(this.instrumentSelectionRowViewModel);
        m.append(", shouldClearFocus=");
        m.append(this.shouldClearFocus);
        m.append(", shouldShowBlockedBadge=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.shouldShowBlockedBadge, ", noResultMessage=", this.noResultMessage, ", recipientsInputViewConfig=");
        m.append(this.recipientsInputViewConfig);
        m.append(", isBitcoin=");
        m.append(this.isBitcoin);
        m.append(")");
        return m.toString();
    }
}
