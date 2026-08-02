package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nmx extends l9 {
    public static final Parcelable.Creator<nmx> CREATOR = new oex(29);

    public final boolean equals(Object obj) {
        return obj instanceof nmx;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(0);
        o8g.p0(parcel, o0);
    }
}
