package app.cash.local.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FreeDeliveryMeter {
    public final String message;
    public final float progress;

    public FreeDeliveryMeter(String str, float f) {
        str.getClass();
        this.message = str;
        this.progress = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeDeliveryMeter)) {
            return false;
        }
        FreeDeliveryMeter freeDeliveryMeter = (FreeDeliveryMeter) obj;
        return Intrinsics.areEqual(this.message, freeDeliveryMeter.message) && Float.compare(this.progress, freeDeliveryMeter.progress) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.progress) + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return "FreeDeliveryMeter(message=" + this.message + ", progress=" + this.progress + ")";
    }
}
