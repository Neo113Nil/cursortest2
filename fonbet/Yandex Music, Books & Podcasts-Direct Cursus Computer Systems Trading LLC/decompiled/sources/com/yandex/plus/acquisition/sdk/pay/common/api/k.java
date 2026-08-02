package com.yandex.plus.acquisition.sdk.pay.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new com.yandex.plus.acquisition.adapter.api.k(13);
    public final int a;
    public final String b;
    public final String c;
    public final g d;
    public final String e;
    public final boolean f;
    public final j g;
    public final e h;
    public final String i;
    public final f j;
    public final com.yandex.plus.acquisition.sdk.api.offers.c k;

    public k(int i, String str, String str2, g gVar, String str3, boolean z, j jVar, e eVar, String str4, f fVar, com.yandex.plus.acquisition.sdk.api.offers.c cVar) {
        gVar.getClass();
        jVar.getClass();
        eVar.getClass();
        str4.getClass();
        fVar.getClass();
        cVar.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = gVar;
        this.e = str3;
        this.f = z;
        this.g = jVar;
        this.h = eVar;
        this.i = str4;
        this.j = fVar;
        this.k = cVar;
    }

    public static k a(k kVar, boolean z) {
        int i = kVar.a;
        String str = kVar.b;
        String str2 = kVar.c;
        g gVar = kVar.d;
        String str3 = kVar.e;
        j jVar = kVar.g;
        e eVar = kVar.h;
        String str4 = kVar.i;
        f fVar = kVar.j;
        com.yandex.plus.acquisition.sdk.api.offers.c cVar = kVar.k;
        kVar.getClass();
        gVar.getClass();
        jVar.getClass();
        eVar.getClass();
        str4.getClass();
        fVar.getClass();
        cVar.getClass();
        return new k(i, str, str2, gVar, str3, z, jVar, eVar, str4, fVar, cVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && Intrinsics.d(this.b, kVar.b) && Intrinsics.d(this.c, kVar.c) && Intrinsics.d(this.d, kVar.d) && Intrinsics.d(this.e, kVar.e) && this.f == kVar.f && Intrinsics.d(this.g, kVar.g) && Intrinsics.d(this.h, kVar.h) && Intrinsics.d(this.i, kVar.i) && Intrinsics.d(this.j, kVar.j) && Intrinsics.d(this.k, kVar.k);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.e;
        return this.k.hashCode() + ((this.j.hashCode() + k5r.c((this.h.hashCode() + ((this.g.hashCode() + k5r.e((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31, 31, this.i)) * 31);
    }

    public final String toString() {
        return "PlusAcquisitionSmartOffer(priority=" + this.a + ", page=" + this.b + ", place=" + this.c + ", targetAndFeatures=" + this.d + ", offerToken=" + this.e + ", isOneClickEnabled=" + this.f + ", texts=" + this.g + ", legals=" + this.h + ", language=" + this.i + ", meta=" + this.j + ", compositeOffer=" + this.k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
        this.h.writeToParcel(parcel, i);
        parcel.writeString(this.i);
        this.j.writeToParcel(parcel, i);
        parcel.writeParcelable(this.k, i);
    }
}
