package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public final class InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails implements InstrumentSelectionViewEvent {
    public final int id;
    public final boolean isSecondaryOption;

    public InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails(int i, boolean z) {
        this.id = i;
        this.isSecondaryOption = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails)) {
            return false;
        }
        InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails instrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails = (InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails) obj;
        return this.id == instrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails.id && this.isSecondaryOption == instrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails.isSecondaryOption;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSecondaryOption) + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return "ShowOptionDetails(id=" + this.id + ", isSecondaryOption=" + this.isSecondaryOption + ")";
    }
}
