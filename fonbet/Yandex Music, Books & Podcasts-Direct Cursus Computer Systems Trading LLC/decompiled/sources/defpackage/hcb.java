package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hcb implements icb {

    @NotNull
    public static final Parcelable.Creator<hcb> CREATOR = new vn7(23);
    public final yxc a;
    public final boolean b;

    public hcb(yxc yxcVar, boolean z) {
        yxcVar.getClass();
        this.a = yxcVar;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcb)) {
            return false;
        }
        hcb hcbVar = (hcb) obj;
        return Intrinsics.d(this.a, hcbVar.a) && this.b == hcbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(userInfo=" + this.a + ", wasAutoLogin=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
