package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.family.familyhub.backend.api.ControlType;

/* loaded from: classes6.dex */
public final class DependentControlViewEvent$ToggleEvent$LimitClicked implements DependentControlViewEvent {
    public final ControlType controlType;

    public DependentControlViewEvent$ToggleEvent$LimitClicked(ControlType controlType) {
        controlType.getClass();
        this.controlType = controlType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DependentControlViewEvent$ToggleEvent$LimitClicked) && this.controlType == ((DependentControlViewEvent$ToggleEvent$LimitClicked) obj).controlType;
    }

    public final int hashCode() {
        return this.controlType.hashCode();
    }

    public final String toString() {
        return "LimitClicked(controlType=" + this.controlType + ")";
    }
}
