package com.squareup.cash.score.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileAvatarViewModel {
    public final String monogram;
    public final String photoUrl;

    public ProfileAvatarViewModel(String str, String str2) {
        this.photoUrl = str;
        this.monogram = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAvatarViewModel)) {
            return false;
        }
        ProfileAvatarViewModel profileAvatarViewModel = (ProfileAvatarViewModel) obj;
        return Intrinsics.areEqual(this.photoUrl, profileAvatarViewModel.photoUrl) && Intrinsics.areEqual(this.monogram, profileAvatarViewModel.monogram);
    }

    public final int hashCode() {
        String str = this.photoUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.monogram;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ProfileAvatarViewModel(photoUrl=", this.photoUrl, ", monogram=", this.monogram, ")");
    }
}
