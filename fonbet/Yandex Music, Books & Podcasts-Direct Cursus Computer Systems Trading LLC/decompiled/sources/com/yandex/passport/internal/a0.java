package com.yandex.passport.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.x1;
import defpackage.b6e;
import defpackage.e5b;
import defpackage.f9h;
import defpackage.k5r;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a0> CREATOR = new a(4);
    public final w1 a;
    public final z b;
    public final String c;
    public final boolean d;
    public final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a0(w1 w1Var, z zVar, String str, f9h f9hVar, int i) {
        this(w1Var, zVar, r3, r4, r10);
        String str2 = (i & 4) != 0 ? null : str;
        boolean z = (i & 8) == 0;
        Map map = f9hVar;
        if ((i & 16) != 0) {
            Map map2 = e5b.a;
            map2.getClass();
            map = map2;
        }
    }

    public final x1 d() {
        switch (this.a.ordinal()) {
            case 0:
                return x1.VKONTAKTE;
            case 1:
                return x1.FACEBOOK;
            case 2:
                return x1.TWITTER;
            case 3:
                return x1.ODNOKLASSNIKI;
            case 4:
                return x1.MAILRU;
            case 5:
                return x1.GOOGLE;
            case 6:
                return x1.ESIA;
            case 7:
                return x1.TV1001;
            case 8:
                return x1.GOOGLE;
            case 9:
                return x1.MICROSOFT;
            case 10:
                return x1.MAILRU;
            case 11:
                return x1.YAHOO;
            case 12:
                return x1.RAMBLER;
            case 13:
                return x1.OTHER;
            default:
                b6e.s();
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && this.b == a0Var.b && Intrinsics.d(this.c, a0Var.c) && this.d == a0Var.d && Intrinsics.d(this.e, a0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.e.hashCode() + k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialConfiguration(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", scope=");
        sb.append(this.c);
        sb.append(", isBrowserRequired=");
        sb.append(this.d);
        sb.append(", extraQueryParams=");
        return k5r.p(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator s = com.appsflyer.internal.k.s(this.e, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public a0(w1 w1Var, z zVar, String str, boolean z, Map map) {
        w1Var.getClass();
        zVar.getClass();
        map.getClass();
        this.a = w1Var;
        this.b = zVar;
        this.c = str;
        this.d = z;
        this.e = map;
    }
}
