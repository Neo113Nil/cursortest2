package com.yandex.plus.core.data.pay;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class k implements t {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;

    @NotNull
    public static final j Companion = new j();

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new com.yandex.plus.core.benchmark.g(16);

    public /* synthetic */ k(int i, Integer num, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, i.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.a, kVar.a) && Intrinsics.d(this.b, kVar.b) && Intrinsics.d(this.c, kVar.c) && Intrinsics.d(this.d, kVar.d) && Intrinsics.d(this.e, kVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return this.e.hashCode() + k5r.c((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(message=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", kind=");
        sb.append(this.d);
        sb.append(", trigger=");
        return dfi.i(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.appsflyer.internal.k.v(parcel, 1, num);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public k(Integer num, String str, String str2, String str3, String str4) {
        dfi.s(str, str3, str4);
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
