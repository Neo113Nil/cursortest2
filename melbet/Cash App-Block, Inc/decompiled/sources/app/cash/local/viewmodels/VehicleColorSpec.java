package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface VehicleColorSpec {

    public final class Gradient implements VehicleColorSpec {
        public final List colorStops;

        public Gradient(List list) {
            list.getClass();
            this.colorStops = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Gradient) && Intrinsics.areEqual(this.colorStops, ((Gradient) obj).colorStops);
        }

        public final int hashCode() {
            return this.colorStops.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Gradient(colorStops=", ")", this.colorStops);
        }
    }

    public final class Solid implements VehicleColorSpec {
        public final long colorValue;

        public Solid(long j) {
            this.colorValue = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Solid) && this.colorValue == ((Solid) obj).colorValue;
        }

        public final int hashCode() {
            return Long.hashCode(this.colorValue);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.colorValue, "Solid(colorValue=", ")");
        }
    }
}
