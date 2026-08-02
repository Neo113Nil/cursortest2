package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class xfk implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<xfk> CREATOR = new pgj(29);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Set g;

    public xfk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set set) {
        set.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfk)) {
            return false;
        }
        xfk xfkVar = (xfk) obj;
        return this.a == xfkVar.a && this.b == xfkVar.b && this.c == xfkVar.c && this.d == xfkVar.d && this.e == xfkVar.e && this.f == xfkVar.f && Intrinsics.d(this.g, xfkVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder j = eta.j("PaymentMethodsFilter(isStoredCardAvailable=", this.a, ", isGooglePayAvailable=", this.b, ", isSBPAvailable=");
        dfi.t(j, this.c, ", isYandexBankAccountAvailable=", this.d, ", isNewSbpTokenAvailable=");
        dfi.t(j, this.e, ", isSbpTokenAvailable=", this.f, ", availableYaCardTypes=");
        j.append(this.g);
        j.append(")");
        return j.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        Set set = this.g;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((u7w) it.next()).writeToParcel(parcel, i);
        }
    }
}
