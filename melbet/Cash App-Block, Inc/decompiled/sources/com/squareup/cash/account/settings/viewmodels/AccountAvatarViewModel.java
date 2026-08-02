package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountAvatarViewModel {
    public final String accessibilityText;
    public final ColorModel backgroundColor;
    public final Character monogram;
    public final String photoUrl;

    public AccountAvatarViewModel(String str, Character ch, ColorModel colorModel, String str2) {
        colorModel.getClass();
        this.photoUrl = str;
        this.monogram = ch;
        this.backgroundColor = colorModel;
        this.accessibilityText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAvatarViewModel)) {
            return false;
        }
        AccountAvatarViewModel accountAvatarViewModel = (AccountAvatarViewModel) obj;
        return Intrinsics.areEqual(this.photoUrl, accountAvatarViewModel.photoUrl) && Intrinsics.areEqual(this.monogram, accountAvatarViewModel.monogram) && Intrinsics.areEqual(this.backgroundColor, accountAvatarViewModel.backgroundColor) && Intrinsics.areEqual(this.accessibilityText, accountAvatarViewModel.accessibilityText);
    }

    public final int hashCode() {
        String str = this.photoUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Character ch = this.monogram;
        int hashCode2 = (this.backgroundColor.hashCode() + ((hashCode + (ch == null ? 0 : ch.hashCode())) * 31)) * 31;
        String str2 = this.accessibilityText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AccountAvatarViewModel(photoUrl=" + this.photoUrl + ", monogram=" + this.monogram + ", backgroundColor=" + this.backgroundColor + ", accessibilityText=" + this.accessibilityText + ")";
    }
}
