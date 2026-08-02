package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c2o implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c2o> CREATOR = new s2m(10);
    public final d2o a;
    public final float b;
    public final float c;

    public c2o(d2o d2oVar, float f, float f2) {
        d2oVar.getClass();
        this.a = d2oVar;
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2o)) {
            return false;
        }
        c2o c2oVar = (c2o) obj;
        return this.a == c2oVar.a && Float.compare(this.b, c2oVar.b) == 0 && Float.compare(this.c, c2oVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + eta.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(currentValue=");
        sb.append(this.a);
        sb.append(", halfExpandedFraction=");
        sb.append(this.b);
        sb.append(", expandedFraction=");
        return su4.m(this.c, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }
}
