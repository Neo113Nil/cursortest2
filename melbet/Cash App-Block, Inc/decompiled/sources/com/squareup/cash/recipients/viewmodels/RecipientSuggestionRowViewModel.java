package com.squareup.cash.recipients.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecipientSuggestionRowViewModel {
    public final String accessoryContentDescription;
    public final boolean accessoryVisible;
    public final StackedAvatarViewModel.Avatar avatar;
    public final String avatarContentDescription;
    public final boolean avatarTappable;
    public final boolean avatarVisible;
    public final int id;
    public final boolean spinnerVisible;
    public final CharSequence subtitle;
    public final boolean subtitleVisible;
    public final CharSequence title;
    public final boolean titleVisible;

    public RecipientSuggestionRowViewModel(int i, CharSequence charSequence, String str, StackedAvatarViewModel.Avatar avatar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3) {
        this.id = i;
        this.title = charSequence;
        this.subtitle = str;
        this.avatar = avatar;
        this.avatarTappable = z;
        this.spinnerVisible = z2;
        this.avatarVisible = z3;
        this.titleVisible = z4;
        this.subtitleVisible = z5;
        this.accessoryVisible = z6;
        this.avatarContentDescription = str2;
        this.accessoryContentDescription = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSuggestionRowViewModel)) {
            return false;
        }
        RecipientSuggestionRowViewModel recipientSuggestionRowViewModel = (RecipientSuggestionRowViewModel) obj;
        return this.id == recipientSuggestionRowViewModel.id && Intrinsics.areEqual(this.title, recipientSuggestionRowViewModel.title) && Intrinsics.areEqual(this.subtitle, recipientSuggestionRowViewModel.subtitle) && Intrinsics.areEqual(this.avatar, recipientSuggestionRowViewModel.avatar) && this.avatarTappable == recipientSuggestionRowViewModel.avatarTappable && this.spinnerVisible == recipientSuggestionRowViewModel.spinnerVisible && this.avatarVisible == recipientSuggestionRowViewModel.avatarVisible && this.titleVisible == recipientSuggestionRowViewModel.titleVisible && this.subtitleVisible == recipientSuggestionRowViewModel.subtitleVisible && this.accessoryVisible == recipientSuggestionRowViewModel.accessoryVisible && Intrinsics.areEqual(this.avatarContentDescription, recipientSuggestionRowViewModel.avatarContentDescription) && Intrinsics.areEqual(this.accessoryContentDescription, recipientSuggestionRowViewModel.accessoryContentDescription);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        CharSequence charSequence = this.title;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.subtitle;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        StackedAvatarViewModel.Avatar avatar = this.avatar;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (avatar == null ? 0 : avatar.hashCode())) * 31, 31, this.avatarTappable), 31, this.spinnerVisible), 31, this.avatarVisible), 31, this.titleVisible), 31, this.subtitleVisible), 31, false), 31, this.accessoryVisible);
        String str = this.avatarContentDescription;
        int hashCode4 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessoryContentDescription;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecipientSuggestionRowViewModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append((Object) this.title);
        sb.append(", subtitle=");
        sb.append((Object) this.subtitle);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", avatarTappable=");
        re$$ExternalSyntheticOutline0.m(sb, this.avatarTappable, ", spinnerVisible=", this.spinnerVisible, ", avatarVisible=");
        re$$ExternalSyntheticOutline0.m(sb, this.avatarVisible, ", titleVisible=", this.titleVisible, ", subtitleVisible=");
        re$$ExternalSyntheticOutline0.m(sb, this.subtitleVisible, ", checked=false, accessoryVisible=", this.accessoryVisible, ", avatarContentDescription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.avatarContentDescription, ", accessoryContentDescription=", this.accessoryContentDescription, ")");
    }
}
