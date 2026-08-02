package app.cash.local.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class VehicleColorOption {
    public final VehicleColorSpec colorSpec;
    public final String label;

    public VehicleColorOption(String str, VehicleColorSpec vehicleColorSpec) {
        str.getClass();
        this.label = str;
        this.colorSpec = vehicleColorSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleColorOption)) {
            return false;
        }
        VehicleColorOption vehicleColorOption = (VehicleColorOption) obj;
        return Intrinsics.areEqual(this.label, vehicleColorOption.label) && this.colorSpec.equals(vehicleColorOption.colorSpec);
    }

    public final int hashCode() {
        return this.colorSpec.hashCode() + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return "VehicleColorOption(label=" + this.label + ", colorSpec=" + this.colorSpec + ")";
    }
}
