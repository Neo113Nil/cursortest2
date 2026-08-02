package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zh5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<zh5> CREATOR = new kg4(5);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public final String a;
    public final boolean b;
    public final boolean c;

    public zh5(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final String d() {
        if (this.b) {
            return ouj.n(this.a, "-toast");
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh5)) {
            return false;
        }
        zh5 zh5Var = (zh5) obj;
        return Intrinsics.d(this.a, zh5Var.a) && this.b == zh5Var.b && this.c == zh5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(v3w.h("CommunicationTriggerAnchor(id=", this.a, ", addToastAnchor=", ", saveInMemory=", this.b), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
