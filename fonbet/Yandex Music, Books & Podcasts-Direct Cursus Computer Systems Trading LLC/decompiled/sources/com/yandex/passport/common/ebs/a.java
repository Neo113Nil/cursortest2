package com.yandex.passport.common.ebs;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.eta;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new com.yandex.passport.api.impl.a(10);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        eta.s(str, str2, str3, str4, str5);
        eta.r(str6, str7, str8, str9);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
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
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e) && Intrinsics.d(this.f, aVar.f) && Intrinsics.d(this.g, aVar.g) && Intrinsics.d(this.h, aVar.h) && Intrinsics.d(this.i, aVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometricAuthSdkProperties(bioCollectionType=");
        sb.append(this.a);
        sb.append(", tibUri=");
        sb.append(this.b);
        sb.append(", consumerApiUri=");
        sb.append(this.c);
        sb.append(", ebsUriTemplate=");
        sb.append(this.d);
        sb.append(", redirectUri=");
        sb.append(this.e);
        sb.append(", esiaSessionId=");
        sb.append(this.f);
        sb.append(", sid=");
        sb.append(this.g);
        sb.append(", esiaCookie=");
        sb.append(this.h);
        sb.append(", trackId=");
        return dfi.i(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
