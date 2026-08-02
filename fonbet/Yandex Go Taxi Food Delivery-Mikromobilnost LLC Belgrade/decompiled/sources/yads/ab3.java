package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ab3 implements Parcelable {
    public static final Parcelable.Creator<ab3> CREATOR = new ya3();
    public final za3 b;
    public final float c;

    public ab3(Parcel parcel) {
        za3 za3Var = parcel.readInt() == -1 ? null : za3.values()[parcel.readInt()];
        float readFloat = parcel.readFloat();
        this.b = za3Var;
        this.c = readFloat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        za3 za3Var = this.b;
        parcel.writeInt(za3Var != null ? za3Var.ordinal() : -1);
        parcel.writeFloat(this.c);
    }

    public ab3(za3 za3Var, float f) {
        this.b = za3Var;
        this.c = f;
    }
}
