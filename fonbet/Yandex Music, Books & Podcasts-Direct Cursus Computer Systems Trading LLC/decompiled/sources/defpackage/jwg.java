package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jwg implements kwg {

    @NotNull
    public static final Parcelable.Creator<jwg> CREATOR = new pnf(11);
    public final eul a;
    public final boolean b;

    public jwg(eul eulVar, boolean z) {
        eulVar.getClass();
        this.a = eulVar;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
