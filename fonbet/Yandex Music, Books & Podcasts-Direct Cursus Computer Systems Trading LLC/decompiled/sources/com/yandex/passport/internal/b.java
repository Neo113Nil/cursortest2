package com.yandex.passport.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        str.getClass();
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

    public static b a(b bVar, String str, String str2, String str3, String str4, int i) {
        String str5 = bVar.a;
        if ((i & 2) != 0) {
            str = bVar.b;
        }
        String str6 = str;
        String str7 = (i & 4) != 0 ? bVar.c : null;
        String str8 = (i & 8) != 0 ? bVar.d : null;
        if ((i & 16) != 0) {
            str2 = bVar.e;
        }
        String str9 = str2;
        if ((i & 32) != 0) {
            str3 = bVar.f;
        }
        String str10 = str3;
        String str11 = bVar.g;
        String str12 = bVar.h;
        if ((i & 256) != 0) {
            str4 = bVar.i;
        }
        str5.getClass();
        return new b(str5, str6, str7, str8, str9, str10, str11, str12, str4);
    }

    public final Account d() {
        return new Account(this.a, com.yandex.passport.internal.ui.a.a);
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
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c) && Intrinsics.d(this.d, bVar.d) && Intrinsics.d(this.e, bVar.e) && Intrinsics.d(this.f, bVar.f) && Intrinsics.d(this.g, bVar.g) && Intrinsics.d(this.h, bVar.h) && Intrinsics.d(this.i, bVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountRow(name='");
        sb.append(this.a);
        sb.append("', masterTokenValue=");
        sb.append(com.yandex.passport.internal.util.l.b(this.b));
        sb.append(", uidString=");
        sb.append(this.c);
        sb.append(", userInfoBody=");
        sb.append(this.d);
        sb.append(", userInfoMeta=");
        sb.append(this.e);
        sb.append(", stashBody=");
        sb.append(this.f);
        sb.append(", legacyAccountType=");
        sb.append(this.g);
        sb.append(", legacyAffinity=");
        sb.append(this.h);
        sb.append(", legacyExtraDataBody=");
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
