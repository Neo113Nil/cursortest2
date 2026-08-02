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
public final class d0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d0> CREATOR = new f(12);
    public final com.yandex.passport.internal.entities.k a;
    public final y1 b;
    public final z1 c;
    public final String d;
    public final String e;

    public d0(com.yandex.passport.internal.entities.k kVar, y1 y1Var, z1 z1Var, String str, String str2) {
        kVar.getClass();
        y1Var.getClass();
        str.getClass();
        this.a = kVar;
        this.b = y1Var;
        this.c = z1Var;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.a, d0Var.a) && this.b == d0Var.b && Intrinsics.d(this.c, d0Var.c) && Intrinsics.d(this.d, d0Var.d) && Intrinsics.d(this.e, d0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        z1 z1Var = this.c;
        int c = k5r.c((hashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialApplicationBindProperties(filter=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", uid=");
        sb.append(this.c);
        sb.append(", applicationName=");
        sb.append(this.d);
        sb.append(", clientId=");
        return dfi.i(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b.name());
        z1 z1Var = this.c;
        if (z1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            z1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
