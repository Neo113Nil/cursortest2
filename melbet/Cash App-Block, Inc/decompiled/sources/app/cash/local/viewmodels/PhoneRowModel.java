package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class PhoneRowModel {
    public final String label;
    public final String number;

    public PhoneRowModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.number = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneRowModel)) {
            return false;
        }
        PhoneRowModel phoneRowModel = (PhoneRowModel) obj;
        return Intrinsics.areEqual(this.label, phoneRowModel.label) && Intrinsics.areEqual(this.number, phoneRowModel.number);
    }

    public final int hashCode() {
        return this.number.hashCode() + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PhoneRowModel(label=", this.label, ", number=", this.number, ")");
    }
}
