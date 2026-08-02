package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vjt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<vjt> CREATOR = new b3s(15);
    public final gjt a;
    public final ujt b;

    public vjt(gjt gjtVar, ujt ujtVar) {
        gjtVar.getClass();
        ujtVar.getClass();
        this.a = gjtVar;
        this.b = ujtVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
