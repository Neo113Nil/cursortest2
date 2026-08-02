package com.squareup.cash.profile.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class ProfileHeaderMenuViewModel {
    public final boolean showClear;

    public ProfileHeaderMenuViewModel(boolean z) {
        this.showClear = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileHeaderMenuViewModel) && this.showClear == ((ProfileHeaderMenuViewModel) obj).showClear;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showClear);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ProfileHeaderMenuViewModel(showClear=", ")", this.showClear);
    }
}
