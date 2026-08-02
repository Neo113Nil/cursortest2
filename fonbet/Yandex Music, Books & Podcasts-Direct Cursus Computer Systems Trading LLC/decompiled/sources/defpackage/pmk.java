package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class pmk implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<pmk> CREATOR = new tgk(9);
    public final boolean a;
    public final lmk b;

    public pmk(boolean z, lmk lmkVar) {
        lmkVar.getClass();
        this.a = z;
        this.b = lmkVar;
    }

    public final boolean d() {
        lmk lmkVar = this.b;
        boolean z = this.a;
        if (z && lmkVar.b) {
            return true;
        }
        if (z && lmkVar.c) {
            return true;
        }
        return z && lmkVar.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        this.b.writeToParcel(parcel, i);
    }
}
