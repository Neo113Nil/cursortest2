package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j71 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j71> CREATOR = new l(27);
    public final b81 a;
    public final u51 b;

    public j71(b81 b81Var, u51 u51Var) {
        b81Var.getClass();
        u51Var.getClass();
        this.a = b81Var;
        this.b = u51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j71)) {
            return false;
        }
        j71 j71Var = (j71) obj;
        return this.a == j71Var.a && Intrinsics.d(this.b, j71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Args(tab=" + this.a + ", artist=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
    }
}
