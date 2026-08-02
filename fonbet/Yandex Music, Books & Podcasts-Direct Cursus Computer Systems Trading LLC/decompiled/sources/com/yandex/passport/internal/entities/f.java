package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k5r;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new com.yandex.passport.internal.credentials.b(6);
    public final com.yandex.passport.api.impl.b a;
    public final String b;
    public final int c;

    public f(int i, com.yandex.passport.api.impl.b bVar, String str) {
        bVar.getClass();
        str.getClass();
        this.a = bVar;
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.a * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Code(environment=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return vz1.r(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
