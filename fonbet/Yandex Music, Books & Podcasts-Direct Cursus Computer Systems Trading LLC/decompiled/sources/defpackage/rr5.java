package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class rr5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<rr5> CREATOR = new kg4(6);
    public final String a;
    public final String b;
    public final jyr c = btf.b(new r25(7, this));

    public rr5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String d() {
        return ouj.o(this.a, StringUtils.PROCESS_POSTFIX_DELIMITER, this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return (String) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr5)) {
            return false;
        }
        rr5 rr5Var = (rr5) obj;
        return Intrinsics.d(this.a, rr5Var.a) && Intrinsics.d(this.b, rr5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("CompositeTrackId(trackId=", this.a, ", albumId=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
