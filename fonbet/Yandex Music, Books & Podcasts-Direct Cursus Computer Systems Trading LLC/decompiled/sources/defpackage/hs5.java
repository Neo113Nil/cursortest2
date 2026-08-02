package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class hs5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<hs5> CREATOR = new kg4(7);
    public final gs5 a;
    public final String b;

    public hs5(gs5 gs5Var, String str) {
        gs5Var.getClass();
        str.getClass();
        this.a = gs5Var;
        this.b = str;
    }

    public final String d() {
        return ouj.o(this.a.a, StringUtils.PROCESS_POSTFIX_DELIMITER, this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs5)) {
            return false;
        }
        hs5 hs5Var = (hs5) obj;
        return this.a == hs5Var.a && Intrinsics.d(this.b, hs5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompoundDisclaimer(type=" + this.a + ", id=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
    }
}
