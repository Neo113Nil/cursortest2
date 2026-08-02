package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a1 extends h1 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    @NotNull
    public static final z0 Companion = new z0();

    @NotNull
    public static final Parcelable.Creator<a1> CREATOR = new w0(1);

    public /* synthetic */ a1(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, y0.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.b, a1Var.b) && Intrinsics.d(this.c, a1Var.c) && Intrinsics.d(this.d, a1Var.d) && Intrinsics.d(this.e, a1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(altText=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", data=");
        sb.append(this.d);
        sb.append(", link=");
        return dfi.i(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public a1(String str, String str2, String str3, String str4) {
        eta.r(str, str2, str3, str4);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
