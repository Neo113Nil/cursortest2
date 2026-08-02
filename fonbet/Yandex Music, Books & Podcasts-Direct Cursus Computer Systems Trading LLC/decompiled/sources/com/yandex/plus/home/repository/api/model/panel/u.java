package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u implements z {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new c(9);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.data.common.v e;
    public final com.yandex.plus.core.data.common.v f;
    public final com.yandex.plus.core.data.common.v g;
    public final d0 h;
    public final boolean i;
    public final com.yandex.plus.core.data.common.y j;
    public final com.yandex.plus.core.data.common.y k;
    public final com.yandex.plus.core.data.common.y l;

    public u(String str, String str2, String str3, String str4, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.v vVar2, com.yandex.plus.core.data.common.v vVar3, d0 d0Var, boolean z, com.yandex.plus.core.data.common.y yVar, com.yandex.plus.core.data.common.y yVar2, com.yandex.plus.core.data.common.y yVar3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        yVar.getClass();
        yVar2.getClass();
        yVar3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vVar;
        this.f = vVar2;
        this.g = vVar3;
        this.h = d0Var;
        this.i = z;
        this.j = yVar;
        this.k = yVar2;
        this.l = yVar3;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final boolean A() {
        return this.i;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v K() {
        throw null;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v L() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.a, uVar.a) && Intrinsics.d(this.b, uVar.b) && Intrinsics.d(this.c, uVar.c) && Intrinsics.d(this.d, uVar.d) && Intrinsics.d(this.e, uVar.e) && Intrinsics.d(this.f, uVar.f) && Intrinsics.d(this.g, uVar.g) && Intrinsics.d(this.h, uVar.h) && this.i == uVar.i && Intrinsics.d(this.j, uVar.j) && Intrinsics.d(this.k, uVar.k) && Intrinsics.d(this.l, uVar.l);
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v getBackgroundColor() {
        throw null;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getId() {
        return this.a;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getName() {
        return this.b;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getSubtitle() {
        throw null;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getTitle() {
        throw null;
    }

    public final int hashCode() {
        int f = com.appsflyer.internal.k.f(this.g, com.appsflyer.internal.k.f(this.f, com.appsflyer.internal.k.f(this.e, k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31);
        d0 d0Var = this.h;
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + k5r.e((f + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.i)) * 31)) * 31);
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final d0 q() {
        return this.h;
    }

    public final String toString() {
        return "Promo(id=" + this.a + ", name=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", titleTextColor=" + this.e + ", subtitleTextColor=" + this.f + ", backgroundColor=" + this.g + ", action=" + this.h + ", isWidthMatchParent=" + this.i + ", backgroundImageUrls=" + this.j + ", longLayoutImageUrls=" + this.k + ", shortLayoutImageUrls=" + this.l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        d0 d0Var = this.h;
        if (d0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
    }
}
