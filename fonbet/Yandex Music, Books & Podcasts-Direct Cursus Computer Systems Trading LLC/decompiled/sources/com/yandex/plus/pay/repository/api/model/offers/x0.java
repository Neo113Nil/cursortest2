package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x0 extends h1 {
    public final String b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.data.common.y e;

    @NotNull
    public static final v0 Companion = new v0();

    @NotNull
    public static final Parcelable.Creator<x0> CREATOR = new w0(0);

    public /* synthetic */ x0(int i, String str, String str2, String str3, com.yandex.plus.core.data.common.y yVar) {
        if (11 != (i & 11)) {
            u7g.V(i, 11, u0.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = yVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.b, x0Var.b) && Intrinsics.d(this.c, x0Var.c) && Intrinsics.d(this.d, x0Var.d) && Intrinsics.d(this.e, x0Var.e);
    }

    public final int hashCode() {
        int c = k5r.c(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Icon(altText=" + this.b + ", key=" + this.c + ", data=" + this.d + ", image=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
    }

    public x0(String str, String str2, String str3, com.yandex.plus.core.data.common.y yVar) {
        str.getClass();
        str2.getClass();
        yVar.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = yVar;
    }
}
