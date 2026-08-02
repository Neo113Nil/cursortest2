package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u4h implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<u4h> CREATOR = new pnf(18);
    private static final long serialVersionUID = 1;
    public final drt a;
    public final r54 b;

    public u4h(drt drtVar, r54 r54Var) {
        this.a = drtVar;
        this.b = r54Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4h)) {
            return false;
        }
        u4h u4hVar = (u4h) obj;
        return Intrinsics.d(this.a, u4hVar.a) && Intrinsics.d(this.b, u4hVar.b);
    }

    public final int hashCode() {
        drt drtVar = this.a;
        int hashCode = (drtVar == null ? 0 : drtVar.a.hashCode()) * 31;
        r54 r54Var = this.b;
        return hashCode + (r54Var != null ? r54Var.hashCode() : 0);
    }

    public final String toString() {
        return "MadeFor(userInfo=" + this.a + ", caseForms=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        drt drtVar = this.a;
        if (drtVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            drtVar.writeToParcel(parcel, i);
        }
        r54 r54Var = this.b;
        if (r54Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r54Var.writeToParcel(parcel, i);
        }
    }
}
