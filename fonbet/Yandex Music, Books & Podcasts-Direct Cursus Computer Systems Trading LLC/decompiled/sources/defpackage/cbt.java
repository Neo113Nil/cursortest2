package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class cbt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<cbt> CREATOR = new b3s(11);
    public final String a;
    public final List b;

    public cbt(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.a = str;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbt)) {
            return false;
        }
        cbt cbtVar = (cbt) obj;
        return Intrinsics.d(this.a, cbtVar.a) && Intrinsics.d(this.b, cbtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("TrustedUrl(url=", this.a, ", tags=", ")", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
    }
}
