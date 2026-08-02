package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class t implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new com.yandex.passport.internal.credentials.b(13);
    public final String a;
    public final com.yandex.passport.api.impl.b b;
    public final String c;

    public t(com.yandex.passport.api.impl.b bVar, String str, String str2) {
        str.getClass();
        bVar.getClass();
        this.a = str;
        this.b = bVar;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b) && Intrinsics.d(this.c, tVar.c);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.a) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackId(value=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", displayName=");
        return dfi.i(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
