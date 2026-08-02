package com.squareup.cash.payments.viewmodels;

import com.squareup.cash.common.viewmodels.AvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ConfirmRecipientDialogViewModel {
    public final AvatarViewModel avatarViewModel;
    public final boolean canViewProfile;
    public final String flagEmoji;
    public final String messageText;
    public final Character monogram;
    public final String primaryButtonText;
    public final String titleText;

    public ConfirmRecipientDialogViewModel(String str, String str2, boolean z, AvatarViewModel avatarViewModel, Character ch, String str3, String str4, int i) {
        ch = (i & 16) != 0 ? null : ch;
        str4 = (i & 64) != 0 ? null : str4;
        this.titleText = str;
        this.messageText = str2;
        this.canViewProfile = z;
        this.avatarViewModel = avatarViewModel;
        this.monogram = ch;
        this.primaryButtonText = str3;
        this.flagEmoji = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmRecipientDialogViewModel)) {
            return false;
        }
        ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj;
        return Intrinsics.areEqual(this.titleText, confirmRecipientDialogViewModel.titleText) && this.messageText.equals(confirmRecipientDialogViewModel.messageText) && this.canViewProfile == confirmRecipientDialogViewModel.canViewProfile && Intrinsics.areEqual(this.avatarViewModel, confirmRecipientDialogViewModel.avatarViewModel) && Intrinsics.areEqual(this.monogram, confirmRecipientDialogViewModel.monogram) && Intrinsics.areEqual(this.primaryButtonText, confirmRecipientDialogViewModel.primaryButtonText) && Intrinsics.areEqual(this.flagEmoji, confirmRecipientDialogViewModel.flagEmoji);
    }

    public final int hashCode() {
        String str = this.titleText;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.messageText), 31, this.canViewProfile);
        AvatarViewModel avatarViewModel = this.avatarViewModel;
        int hashCode = (m + (avatarViewModel == null ? 0 : avatarViewModel.hashCode())) * 31;
        Character ch = this.monogram;
        int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
        String str2 = this.primaryButtonText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flagEmoji;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmRecipientDialogViewModel(titleText=", this.titleText, ", messageText=", this.messageText, ", canViewProfile=");
        m.append(this.canViewProfile);
        m.append(", avatarViewModel=");
        m.append(this.avatarViewModel);
        m.append(", monogram=");
        m.append(this.monogram);
        m.append(", primaryButtonText=");
        m.append(this.primaryButtonText);
        m.append(", flagEmoji=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.flagEmoji, ")");
    }
}
