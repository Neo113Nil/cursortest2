package com.squareup.cash.profile.viewmodels;

import com.squareup.cash.screens.Redacted;
import com.squareup.protos.franklin.api.UiAlias;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileConfirmRemoveAliasViewModel {
    public final Redacted text;

    /* renamed from: type, reason: collision with root package name */
    public final UiAlias.Type f1191type;

    public ProfileConfirmRemoveAliasViewModel(UiAlias.Type type2, Redacted redacted) {
        type2.getClass();
        redacted.getClass();
        this.f1191type = type2;
        this.text = redacted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileConfirmRemoveAliasViewModel)) {
            return false;
        }
        ProfileConfirmRemoveAliasViewModel profileConfirmRemoveAliasViewModel = (ProfileConfirmRemoveAliasViewModel) obj;
        return this.f1191type == profileConfirmRemoveAliasViewModel.f1191type && Intrinsics.areEqual(this.text, profileConfirmRemoveAliasViewModel.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.f1191type.hashCode() * 31);
    }

    public final String toString() {
        return "ProfileConfirmRemoveAliasViewModel(type=" + this.f1191type + ", text=" + this.text + ")";
    }
}
