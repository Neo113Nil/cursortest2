package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.Cart;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BrandSpot implements Parcelable {
    public static final Parcelable.Creator<BrandSpot> CREATOR = new Cart.Creator(15);
    public final String brandToken;
    public final String locationToken;

    public BrandSpot(String str, String str2) {
        str.getClass();
        this.brandToken = str;
        this.locationToken = str2;
    }

    public final BrandSpot clearLocation() {
        String str = this.brandToken;
        str.getClass();
        return new BrandSpot(str, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandSpot)) {
            return false;
        }
        BrandSpot brandSpot = (BrandSpot) obj;
        if (!Intrinsics.areEqual(this.brandToken, brandSpot.brandToken)) {
            return false;
        }
        String str = brandSpot.locationToken;
        String str2 = this.locationToken;
        if (str2 == null) {
            if (str == null) {
                areEqual = true;
            }
            areEqual = false;
        } else {
            if (str != null) {
                areEqual = Intrinsics.areEqual(str2, str);
            }
            areEqual = false;
        }
        return areEqual;
    }

    public final int hashCode() {
        int hashCode = this.brandToken.hashCode() * 31;
        String str = this.locationToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String m1229toStringimpl = BrandToken.m1229toStringimpl(this.brandToken);
        String str = this.locationToken;
        return Boxes$$ExternalSyntheticOutline1.m("BrandSpot(brandToken=", m1229toStringimpl, ", locationToken=", str == null ? "null" : LocationToken.m1252toStringimpl(str), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.brandToken);
        String str = this.locationToken;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
    }
}
