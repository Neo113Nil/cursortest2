package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d0> CREATOR = new c(15);
    public final String a;
    public final com.yandex.plus.core.data.common.v b;
    public final String c;
    public final String d;
    public final a e;
    public final com.yandex.plus.core.data.common.v f;

    public d0(String str, com.yandex.plus.core.data.common.v vVar, String str2, String str3, a aVar, com.yandex.plus.core.data.common.v vVar2) {
        str.getClass();
        vVar.getClass();
        str2.getClass();
        str3.getClass();
        aVar.getClass();
        vVar2.getClass();
        this.a = str;
        this.b = vVar;
        this.c = str2;
        this.d = str3;
        this.e = aVar;
        this.f = vVar2;
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
        return Intrinsics.d(this.a, d0Var.a) && Intrinsics.d(this.b, d0Var.b) && Intrinsics.d(this.c, d0Var.c) && Intrinsics.d(this.d, d0Var.d) && this.e == d0Var.e && Intrinsics.d(this.f, d0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + k5r.c(k5r.c(com.appsflyer.internal.k.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        return "ShortcutAction(title=" + this.a + ", textColor=" + this.b + ", url=" + this.c + ", deeplink=" + this.d + ", actionType=" + this.e + ", backgroundColor=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeParcelable(this.f, i);
    }
}
