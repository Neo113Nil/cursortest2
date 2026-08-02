package com.yandex.plus.core.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class b0 implements Parcelable {
    public final String a;
    public final String b;

    @NotNull
    public static final a0 Companion = new a0();

    @NotNull
    public static final Parcelable.Creator<b0> CREATOR = new com.yandex.plus.core.benchmark.g(10);

    public /* synthetic */ b0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, z.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean d() {
        return URLUtil.isValidUrl(this.a) && URLUtil.isValidUrl(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.a, b0Var.a) && Intrinsics.d(this.b, b0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusThemedUrl(light=");
        sb.append(this.a);
        sb.append(", dark=");
        return dfi.i(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public b0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
