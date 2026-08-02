package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class w implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<w> CREATOR = new com.yandex.passport.internal.credentials.b(16);
    public final com.yandex.passport.api.impl.b a;
    public final String b;
    public final String c;
    public final String d;

    public w(com.yandex.passport.api.impl.b bVar, String str, String str2, String str3) {
        bVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.a, wVar.a) && Intrinsics.d(this.b, wVar.b) && Intrinsics.d(this.c, wVar.c) && Intrinsics.d(this.d, wVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.a * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCredentials(environment=");
        sb.append(this.a);
        sb.append(", login=");
        sb.append(this.b);
        sb.append(", password=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        return dfi.i(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
