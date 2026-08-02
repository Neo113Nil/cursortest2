package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class rf4 implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<rf4> CREATOR = new i02(29);
    private static final long serialVersionUID = 1;
    public final Long a;
    public final mqs b;
    public final Date c;
    public final lf4 d;
    public final Boolean e;

    public rf4(Long l, mqs mqsVar, Date date, lf4 lf4Var, Boolean bool) {
        mqsVar.getClass();
        lf4Var.getClass();
        this.a = l;
        this.b = mqsVar;
        this.c = date;
        this.d = lf4Var;
        this.e = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf4)) {
            return false;
        }
        rf4 rf4Var = (rf4) obj;
        return Intrinsics.d(this.a, rf4Var.a) && Intrinsics.d(this.b, rf4Var.b) && Intrinsics.d(this.c, rf4Var.c) && Intrinsics.d(this.d, rf4Var.d) && Intrinsics.d(this.e, rf4Var.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int c = k5r.c((l == null ? 0 : l.hashCode()) * 31, 31, this.b.a);
        Date date = this.c;
        int hashCode = (this.d.hashCode() + ((c + (date == null ? 0 : date.hashCode())) * 31)) * 31;
        Boolean bool = this.e;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ChartTrack(id=" + this.a + ", track=" + this.b + ", timestamp=" + this.c + ", chart=" + this.d + ", recent=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Long l = this.a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeSerializable(this.c);
        this.d.writeToParcel(parcel, i);
        Boolean bool = this.e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
