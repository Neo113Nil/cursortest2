package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new com.yandex.passport.internal.credentials.b(8);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public i(String str, int i, int i2, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && Intrinsics.d(this.b, iVar.b) && Intrinsics.d(this.c, iVar.c) && this.d == iVar.d && this.e == iVar.e;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.e) + f1d.a(this.d, (c + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceCode(deviceCode=");
        sb.append(this.a);
        sb.append(", userCode=");
        sb.append(this.b);
        sb.append(", verificationUrl=");
        sb.append(this.c);
        sb.append(", interval=");
        sb.append(this.d);
        sb.append(", expiresIn=");
        return vz1.r(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
