package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zus implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<zus> CREATOR = new b3s(8);
    public static final zus b = new zus(-1);
    public final int a;

    public zus(int i) {
        this.a = i;
        if (i < -1) {
            su4.s(2, null, k5r.i(i, "Illegal track queue position "), null);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zus) && this.a == ((zus) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "TrackDialogMeta(trackQueuePosition=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
