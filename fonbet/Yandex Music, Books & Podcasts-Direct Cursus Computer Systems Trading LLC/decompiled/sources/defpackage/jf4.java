package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class jf4 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<jf4> CREATOR = new i02(27);
    public final int a;
    public final mf4 b;

    public jf4(int i, mf4 mf4Var) {
        this.a = i;
        this.b = mf4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf4)) {
            return false;
        }
        jf4 jf4Var = (jf4) obj;
        return this.a == jf4Var.a && Intrinsics.d(this.b, jf4Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        mf4 mf4Var = this.b;
        return hashCode + (mf4Var == null ? 0 : mf4Var.hashCode());
    }

    public final String toString() {
        return "ChartPosition(position=" + this.a + ", chartProgress=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
