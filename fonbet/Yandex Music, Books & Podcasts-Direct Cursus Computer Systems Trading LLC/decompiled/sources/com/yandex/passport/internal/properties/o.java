package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class o implements e1, Parcelable {
    public final y1 a;
    public final z1 b;
    public final String c;
    public final String d;
    public final boolean e;
    public static final n f = new n();

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new f(5);

    public o(y1 y1Var, z1 z1Var, String str, String str2, boolean z) {
        y1Var.getClass();
        z1Var.getClass();
        str.getClass();
        str2.getClass();
        this.a = y1Var;
        this.b = z1Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // com.yandex.passport.api.e1
    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.api.e1
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c) && Intrinsics.d(this.d, oVar.d) && this.e == oVar.e;
    }

    @Override // com.yandex.passport.api.e1
    public final boolean f() {
        return this.e;
    }

    @Override // com.yandex.passport.api.e1
    public final y1 getTheme() {
        return this.a;
    }

    @Override // com.yandex.passport.api.e1
    public final z1 getUid() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagingPlusDevicesPropertiesImpl(theme=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", service=");
        sb.append(this.c);
        sb.append(", brand=");
        sb.append(this.d);
        sb.append(", isForceShowManagingPlusDevices=");
        return dfi.j(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
