package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class oom implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<oom> CREATOR = new s2m(5);
    public final boolean a;
    public final double b;
    public final Double c;

    public oom(boolean z, double d, Double d2) {
        this.a = z;
        this.b = d;
        this.c = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oom)) {
            return false;
        }
        oom oomVar = (oom) obj;
        return this.a == oomVar.a && Double.compare(this.b, oomVar.b) == 0 && Intrinsics.d(this.c, oomVar.c);
    }

    public final int hashCode() {
        int b = k5r.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        Double d = this.c;
        return b + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "PreselectButtonState(active=" + this.a + ", total=" + this.b + ", subTotal=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeDouble(this.b);
        Double d = this.c;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }
}
