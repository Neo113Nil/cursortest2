package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t0 extends h1 {
    public final String b;
    public final String c;
    public final String d;

    @NotNull
    public static final s0 Companion = new s0();

    @NotNull
    public static final Parcelable.Creator<t0> CREATOR = new com.yandex.plus.pay.adapter.api.b0(29);

    public /* synthetic */ t0(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, r0.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.b, t0Var.b) && Intrinsics.d(this.c, t0Var.c) && Intrinsics.d(this.d, t0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Highlight(altText=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", data=");
        return dfi.i(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public t0(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
