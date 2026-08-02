package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.family.familyhub.backend.api.ControlType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentControlViewEvent$ToggleEvent$ToggleChanged implements DependentControlViewEvent {
    public final ControlType controlType;
    public final boolean enabled;
    public final String tagDeviceId;

    public DependentControlViewEvent$ToggleEvent$ToggleChanged(boolean z, ControlType controlType, String str) {
        controlType.getClass();
        this.enabled = z;
        this.controlType = controlType;
        this.tagDeviceId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged)) {
            return false;
        }
        DependentControlViewEvent$ToggleEvent$ToggleChanged dependentControlViewEvent$ToggleEvent$ToggleChanged = (DependentControlViewEvent$ToggleEvent$ToggleChanged) obj;
        return this.enabled == dependentControlViewEvent$ToggleEvent$ToggleChanged.enabled && this.controlType == dependentControlViewEvent$ToggleEvent$ToggleChanged.controlType && Intrinsics.areEqual(this.tagDeviceId, dependentControlViewEvent$ToggleEvent$ToggleChanged.tagDeviceId);
    }

    public final int hashCode() {
        int hashCode = (this.controlType.hashCode() + (Boolean.hashCode(this.enabled) * 31)) * 31;
        String str = this.tagDeviceId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleChanged(enabled=");
        sb.append(this.enabled);
        sb.append(", controlType=");
        sb.append(this.controlType);
        sb.append(", tagDeviceId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tagDeviceId, ")");
    }
}
