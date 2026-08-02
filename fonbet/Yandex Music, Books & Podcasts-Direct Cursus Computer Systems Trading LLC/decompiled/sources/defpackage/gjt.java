package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class gjt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<gjt> CREATOR = new b3s(13);
    public final String a;
    public final String b;
    public final cjt c;

    public gjt(String str, String str2, cjt cjtVar) {
        str.getClass();
        str2.getClass();
        cjtVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = cjtVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjt)) {
            return false;
        }
        gjt gjtVar = (gjt) obj;
        return Intrinsics.d(this.a, gjtVar.a) && Intrinsics.d(this.b, gjtVar.b) && Intrinsics.d(this.c, gjtVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("UniversalEntitiesContentType(id=", this.a, ", entityType=", this.b, ", configuration=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
