package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class VehicleTypeOption {
    public final String label;

    public VehicleTypeOption(String str) {
        str.getClass();
        this.label = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VehicleTypeOption) && Intrinsics.areEqual(this.label, ((VehicleTypeOption) obj).label);
    }

    public final int hashCode() {
        return this.label.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VehicleTypeOption(label=", this.label, ")");
    }
}
