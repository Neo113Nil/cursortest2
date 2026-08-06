package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kbVzROOfKK implements Parcelable.Creator {
    public final /* synthetic */ int GWasM1elztuh;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.GWasM1elztuh) {
            case 0:
                parcel.getClass();
                return new FhVkB11j(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new bo0(parcel.readFloat());
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return new co0(parcel.readInt());
            default:
                return new do0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.GWasM1elztuh) {
            case 0:
                return new FhVkB11j[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new bo0[i];
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return new co0[i];
            default:
                return new do0[i];
        }
    }
}
