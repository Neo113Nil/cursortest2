package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.k5r;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new com.yandex.passport.internal.credentials.b(7);
    public final com.yandex.passport.api.impl.b a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public h(com.yandex.passport.api.impl.b bVar, String str, String str2, String str3, String str4) {
        bVar.getClass();
        str3.getClass();
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        new URL(str3);
    }

    public final String d() {
        String str = this.d;
        String host = new URL(str).getHost();
        if (host != null) {
            return host;
        }
        b6e.l(str, "No host in return url ");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = this.b;
        if (str2 == null) {
            return null;
        }
        return "Session_id=" + str2 + "; sessionid2=" + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.a, hVar.a) && Intrinsics.d(this.b, hVar.b) && Intrinsics.d(this.c, hVar.c) && Intrinsics.d(this.d, hVar.d) && Intrinsics.d(this.e, hVar.e);
    }

    public final int hashCode() {
        int i = this.a.a * 31;
        String str = this.b;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        return c + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cookie(environment=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", sslSessionId=");
        sb.append(this.c);
        sb.append(", returnUrl=");
        sb.append(this.d);
        sb.append(", cookies=");
        return dfi.i(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public /* synthetic */ h(com.yandex.passport.api.impl.b bVar, String str, String str2, int i) {
        this(bVar, null, null, str, (i & 16) != 0 ? null : str2);
    }
}
