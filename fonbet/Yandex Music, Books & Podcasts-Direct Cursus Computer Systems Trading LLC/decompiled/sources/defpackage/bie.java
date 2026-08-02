package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class bie extends cie implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<bie> CREATOR = new a5c(25);
    public final ffk a;

    public bie(ffk ffkVar) {
        ffkVar.getClass();
        this.a = ffkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
