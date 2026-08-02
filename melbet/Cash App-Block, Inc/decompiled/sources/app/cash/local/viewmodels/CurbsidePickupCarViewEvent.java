package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface CurbsidePickupCarViewEvent {

    public final class ColorSelected implements CurbsidePickupCarViewEvent {
        public final VehicleColorOption option;

        public ColorSelected(VehicleColorOption vehicleColorOption) {
            vehicleColorOption.getClass();
            this.option = vehicleColorOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ColorSelected) && Intrinsics.areEqual(this.option, ((ColorSelected) obj).option);
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final String toString() {
            return "ColorSelected(option=" + this.option + ")";
        }
    }

    public final class Confirm implements CurbsidePickupCarViewEvent {
        public final String note;

        public Confirm(String str) {
            str.getClass();
            this.note = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Confirm) && Intrinsics.areEqual(this.note, ((Confirm) obj).note);
        }

        public final int hashCode() {
            return this.note.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Confirm(note=", this.note, ")");
        }
    }

    public final class Exit implements CurbsidePickupCarViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -628583768;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class TypeSelected implements CurbsidePickupCarViewEvent {
        public final VehicleTypeOption option;

        public TypeSelected(VehicleTypeOption vehicleTypeOption) {
            vehicleTypeOption.getClass();
            this.option = vehicleTypeOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypeSelected) && Intrinsics.areEqual(this.option, ((TypeSelected) obj).option);
        }

        public final int hashCode() {
            return this.option.label.hashCode();
        }

        public final String toString() {
            return "TypeSelected(option=" + this.option + ")";
        }
    }
}
