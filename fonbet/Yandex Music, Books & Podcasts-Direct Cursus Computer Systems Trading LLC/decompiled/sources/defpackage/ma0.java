package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ma0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ma0> CREATOR = new l(18);
    public final lf3 a;
    public final boolean b;

    public ma0(lf3 lf3Var, boolean z) {
        lf3Var.getClass();
        this.a = lf3Var;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
    }
}
