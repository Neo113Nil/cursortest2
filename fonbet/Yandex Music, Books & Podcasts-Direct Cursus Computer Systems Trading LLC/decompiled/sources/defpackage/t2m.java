package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t2m implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<t2m> CREATOR = new s2m(0);
    private static final long serialVersionUID = 1;
    public final rr5 a;
    public final Date b;

    public t2m(rr5 rr5Var, Date date) {
        rr5Var.getClass();
        this.a = rr5Var;
        this.b = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t2m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.d(this.a, ((t2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlaylistTrackTuple(id=" + this.a + ", timestamp=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeSerializable(this.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t2m(String str, String str2, Date date) {
        this(q6k.A(str, str2), date);
        str.getClass();
    }
}
