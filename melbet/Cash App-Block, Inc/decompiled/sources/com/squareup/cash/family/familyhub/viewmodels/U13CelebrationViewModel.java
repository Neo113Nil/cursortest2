package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U13CelebrationViewModel {
    public final String buttonText;
    public final String title;

    public U13CelebrationViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.buttonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U13CelebrationViewModel)) {
            return false;
        }
        U13CelebrationViewModel u13CelebrationViewModel = (U13CelebrationViewModel) obj;
        return Intrinsics.areEqual(this.title, u13CelebrationViewModel.title) && Intrinsics.areEqual(this.buttonText, u13CelebrationViewModel.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("U13CelebrationViewModel(title=", this.title, ", buttonText=", this.buttonText, ")");
    }
}
