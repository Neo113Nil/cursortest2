package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.p0;
import com.yandex.passport.api.y1;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new f(0);
    public final com.yandex.passport.internal.entities.k a;
    public final y1 b;
    public final com.yandex.passport.api.x c;
    public final String d;
    public final boolean e;
    public final com.yandex.passport.internal.credentials.f f;

    public g(com.yandex.passport.internal.entities.k kVar, y1 y1Var, com.yandex.passport.api.x xVar, String str, boolean z, com.yandex.passport.internal.credentials.f fVar) {
        kVar.getClass();
        y1Var.getClass();
        xVar.getClass();
        this.a = kVar;
        this.b = y1Var;
        this.c = xVar;
        this.d = str;
        this.e = z;
        this.f = fVar;
    }

    public final com.yandex.passport.internal.credentials.f d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p0 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && this.b == gVar.b && this.c == gVar.c && Intrinsics.d(this.d, gVar.d) && this.e == gVar.e && Intrinsics.d(this.f, gVar.f);
    }

    public final com.yandex.passport.api.x f() {
        return this.c;
    }

    public final boolean g() {
        return this.e;
    }

    public final String getMessage() {
        return this.d;
    }

    public final y1 h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int e = k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        com.yandex.passport.internal.credentials.f fVar = this.f;
        return e + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "AutoLoginProperties(filter=" + this.a + ", theme=" + this.b + ", mode=" + this.c + ", message=" + this.d + ", setAsCurrent=" + this.e + ", credentials=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
    }
}
