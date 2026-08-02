package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class onf implements snf {

    @NotNull
    public static final Parcelable.Creator<onf> CREATOR = new a5c(29);
    public final String a;
    public final Bundle b;
    public final boolean c;

    public onf(String str, Bundle bundle, boolean z) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
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
        if (!(obj instanceof onf)) {
            return false;
        }
        onf onfVar = (onf) obj;
        return Intrinsics.d(this.a, onfVar.a) && Intrinsics.d(this.b, onfVar.b) && this.c == onfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvisibleRadioStation(stationId=");
        sb.append(this.a);
        sb.append(", urlPlayBundle=");
        sb.append(this.b);
        sb.append(", openPlayer=");
        return ouj.r(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
