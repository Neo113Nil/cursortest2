package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList implements InstrumentSelectionViewEvent {
    public final boolean isSecondaryOption;

    public InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList(boolean z) {
        this.isSecondaryOption = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList) && this.isSecondaryOption == ((InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList) obj).isSecondaryOption;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSecondaryOption);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ShowOptionsList(isSecondaryOption=", ")", this.isSecondaryOption);
    }
}
