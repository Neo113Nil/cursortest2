package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class drt implements Parcelable, Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public static final cuk e = new cuk();

    @NotNull
    public static final Parcelable.Creator<drt> CREATOR = new b3s(18);
    public static final drt f = cuk.B(CommonUrlParts.Values.FALSE_INTEGER, "", "");

    public drt(String str, String str2, String str3, boolean z) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !drt.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.a, ((drt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder m = f1d.m("User(id=", this.a, ", login=", this.b, ", fullName=");
        m.append(this.c);
        m.append(", authorized=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
