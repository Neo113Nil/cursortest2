package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class gd6 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<gd6> CREATOR = new kg4(20);
    public final List a;
    public final List b;
    public final boolean c;

    public gd6(List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd6)) {
            return false;
        }
        gd6 gd6Var = (gd6) obj;
        return Intrinsics.d(this.a, gd6Var.a) && Intrinsics.d(this.b, gd6Var.b) && this.c == gd6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentRestrictions(disclaimers=");
        sb.append(this.a);
        sb.append(", disclaimersOld=");
        sb.append(this.b);
        sb.append(", available=");
        return ouj.r(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.a);
        while (n.hasNext()) {
            ((hs5) n.next()).writeToParcel(parcel, i);
        }
        Iterator n2 = f1d.n(parcel, this.b);
        while (n2.hasNext()) {
            parcel.writeString(((h94) n2.next()).name());
        }
        parcel.writeInt(this.c ? 1 : 0);
    }
}
