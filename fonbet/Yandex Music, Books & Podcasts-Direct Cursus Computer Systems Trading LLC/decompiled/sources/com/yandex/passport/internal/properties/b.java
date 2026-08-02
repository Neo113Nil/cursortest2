package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new com.yandex.passport.internal.credentials.b(27);
    public final z1 a;
    public final y1 b;
    public final String c;
    public final l d;

    public b(z1 z1Var, y1 y1Var, String str, l lVar) {
        z1Var.getClass();
        y1Var.getClass();
        lVar.getClass();
        this.a = z1Var;
        this.b = y1Var;
        this.c = str;
        this.d = lVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b == bVar.b && Intrinsics.d(this.c, bVar.c) && Intrinsics.d(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "AccountNotAuthorizedProperties(uid=" + this.a + ", theme=" + this.b + ", message=" + this.c + ", loginProperties=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
    }
}
