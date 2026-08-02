package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new com.yandex.passport.internal.credentials.b(26);
    public final com.yandex.passport.api.e a;
    public final com.yandex.passport.api.d b;
    public final boolean c;
    public final boolean d;

    public a(com.yandex.passport.api.e eVar, com.yandex.passport.api.d dVar, boolean z, boolean z2) {
        eVar.getClass();
        dVar.getClass();
        this.a = eVar;
        this.b = dVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Intrinsics.d(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountListProperties(showMode=");
        sb.append(this.a);
        sb.append(", branding=");
        sb.append(this.b);
        sb.append(", showCloseButton=");
        sb.append(this.c);
        sb.append(", markPlusUsers=");
        return dfi.j(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
