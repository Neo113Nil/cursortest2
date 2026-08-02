package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class lf4 implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<lf4> CREATOR = new i02(28);
    private static final long serialVersionUID = 1;
    public final int a;
    public final kf4 b;
    public final Integer c;

    public lf4(int i, kf4 kf4Var, Integer num) {
        this.a = i;
        this.b = kf4Var;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf4)) {
            return false;
        }
        lf4 lf4Var = (lf4) obj;
        return this.a == lf4Var.a && this.b == lf4Var.b && Intrinsics.d(this.c, lf4Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        kf4 kf4Var = this.b;
        int hashCode2 = (hashCode + (kf4Var == null ? 0 : kf4Var.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ChartPositionInfo(position=" + this.a + ", progress=" + this.b + ", shift=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        kf4 kf4Var = this.b;
        if (kf4Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kf4Var.name());
        }
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num);
        }
    }
}
