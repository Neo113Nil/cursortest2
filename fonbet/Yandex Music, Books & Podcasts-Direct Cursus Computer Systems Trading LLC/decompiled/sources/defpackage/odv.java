package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class odv implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<odv> CREATOR = new b3s(25);
    public final String a;
    public final boolean b;

    public odv(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odv)) {
            return false;
        }
        odv odvVar = (odv) obj;
        return Intrinsics.d(this.a, odvVar.a) && this.b == odvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("WebViewData(url=", this.a, ", needAuthorization=", ")", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
