package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new f(3);
    public final y1 a;
    public final z1 b;
    public final String c;
    public final String d;
    public final String e;

    public j(y1 y1Var, z1 z1Var, String str, String str2, String str3) {
        y1Var.getClass();
        z1Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = y1Var;
        this.b = z1Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && Intrinsics.d(this.b, jVar.b) && Intrinsics.d(this.c, jVar.c) && Intrinsics.d(this.d, jVar.d) && Intrinsics.d(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsiaBindProperties(theme=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", application=");
        sb.append(this.c);
        sb.append(", consumer=");
        sb.append(this.d);
        sb.append(", scope=");
        return dfi.i(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
