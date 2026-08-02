package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface OrderingMode extends Parcelable {

    public final class Available implements OrderingMode {
        public static final Available INSTANCE = new Available();
        public static final Parcelable.Creator<Available> CREATOR = new MenuItem.Creator(18);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Available);
        }

        public final int hashCode() {
            return 28029987;
        }

        public final String toString() {
            return "Available";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Unavailable implements OrderingMode {
        public static final Parcelable.Creator<Unavailable> CREATOR = new MenuItem.Creator(19);
        public final boolean isPermanent;
        public final String message;

        public Unavailable(String str, boolean z) {
            str.getClass();
            this.message = str;
            this.isPermanent = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unavailable)) {
                return false;
            }
            Unavailable unavailable = (Unavailable) obj;
            return Intrinsics.areEqual(this.message, unavailable.message) && this.isPermanent == unavailable.isPermanent;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isPermanent) + (this.message.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Unavailable(message=", this.message, ", isPermanent=", ")", this.isPermanent);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.message);
            parcel.writeInt(this.isPermanent ? 1 : 0);
        }
    }
}
