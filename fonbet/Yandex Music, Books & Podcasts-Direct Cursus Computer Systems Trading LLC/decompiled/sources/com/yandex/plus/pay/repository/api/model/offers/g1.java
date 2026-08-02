package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class g1 extends h1 {
    public final String b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.data.common.v e;

    @NotNull
    public static final f1 Companion = new f1();

    @NotNull
    public static final Parcelable.Creator<g1> CREATOR = new w0(3);
    public static final arf[] f = {null, null, null, btf.a(bwf.b, new com.yandex.plus.pay.internal.model.a(21))};

    public /* synthetic */ g1(int i, String str, String str2, String str3, com.yandex.plus.core.data.common.v vVar) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, e1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = vVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.b, g1Var.b) && Intrinsics.d(this.c, g1Var.c) && Intrinsics.d(this.d, g1Var.d) && Intrinsics.d(this.e, g1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "TextColor(altText=" + this.b + ", key=" + this.c + ", data=" + this.d + ", color=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
    }

    public g1(String str, String str2, String str3, com.yandex.plus.core.data.common.v vVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        vVar.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = vVar;
    }
}
