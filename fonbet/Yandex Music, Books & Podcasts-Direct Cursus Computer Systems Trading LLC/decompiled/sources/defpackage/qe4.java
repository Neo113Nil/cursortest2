package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class qe4 implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<qe4> CREATOR = new i02(25);
    private static final long serialVersionUID = 1;
    public final cvl a;
    public final List b;

    public qe4(cvl cvlVar, List list) {
        cvlVar.getClass();
        list.getClass();
        this.a = cvlVar;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe4)) {
            return false;
        }
        qe4 qe4Var = (qe4) obj;
        return Intrinsics.d(this.a, qe4Var.a) && Intrinsics.d(this.b, qe4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Chart(header=" + this.a + ", tracks=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        Iterator n = f1d.n(parcel, this.b);
        while (n.hasNext()) {
            ((rf4) n.next()).writeToParcel(parcel, i);
        }
    }
}
