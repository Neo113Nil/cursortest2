package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes5.dex */
public final class ConfirmCvvViewModel {
    public final int cvvLength;
    public final String title;

    public ConfirmCvvViewModel(int i, String str) {
        this.cvvLength = i;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmCvvViewModel)) {
            return false;
        }
        ConfirmCvvViewModel confirmCvvViewModel = (ConfirmCvvViewModel) obj;
        return this.cvvLength == confirmCvvViewModel.cvvLength && this.title.equals(confirmCvvViewModel.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.cvvLength) * 31);
    }

    public final String toString() {
        return "ConfirmCvvViewModel(cvvLength=" + this.cvvLength + ", title=" + this.title + ")";
    }
}
