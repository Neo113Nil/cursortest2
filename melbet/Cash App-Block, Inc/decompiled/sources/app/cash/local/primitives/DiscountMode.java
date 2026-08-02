package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface DiscountMode extends Parcelable {

    public final class Disabled implements DiscountMode {
        public static final Disabled INSTANCE = new Disabled();
        public static final Parcelable.Creator<Disabled> CREATOR = new Line.Creator(5);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Disabled);
        }

        public final int hashCode() {
            return -1674221675;
        }

        public final String toString() {
            return "Disabled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Enabled implements DiscountMode {
        public static final Parcelable.Creator<Enabled> CREATOR = new Line.Creator(6);
        public final boolean multipleCodes;
        public final String placeholder;

        public Enabled(boolean z, String str) {
            str.getClass();
            this.multipleCodes = z;
            this.placeholder = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj;
            return this.multipleCodes == enabled.multipleCodes && Intrinsics.areEqual(this.placeholder, enabled.placeholder);
        }

        public final int hashCode() {
            return this.placeholder.hashCode() + (Boolean.hashCode(this.multipleCodes) * 31);
        }

        public final String toString() {
            return "Enabled(multipleCodes=" + this.multipleCodes + ", placeholder=" + this.placeholder + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.multipleCodes ? 1 : 0);
            parcel.writeString(this.placeholder);
        }
    }
}
