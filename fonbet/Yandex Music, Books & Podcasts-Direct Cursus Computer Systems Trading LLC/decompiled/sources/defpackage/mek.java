package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class mek implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<mek> CREATOR = new pgj(15);
    public final bg2 a;
    public final vgk b;

    public mek(bg2 bg2Var, vgk vgkVar) {
        bg2Var.getClass();
        vgkVar.getClass();
        this.a = bg2Var;
        this.b = vgkVar;
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
