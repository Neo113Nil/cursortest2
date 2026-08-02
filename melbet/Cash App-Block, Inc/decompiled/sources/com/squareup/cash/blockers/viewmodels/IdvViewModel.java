package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class IdvViewModel {
    public final boolean isLoading;

    public IdvViewModel(boolean z) {
        this.isLoading = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdvViewModel) && this.isLoading == ((IdvViewModel) obj).isLoading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoading);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("IdvViewModel(isLoading=", ")", this.isLoading);
    }
}
