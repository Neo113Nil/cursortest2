package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class iwg implements kwg {

    @NotNull
    public static final Parcelable.Creator<iwg> CREATOR = new pnf(10);
    public final u51 a;
    public final boolean b;

    public iwg(u51 u51Var, boolean z) {
        u51Var.getClass();
        this.a = u51Var;
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
