package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c9 implements Parcelable {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final List g;
    public final String h;
    public final boolean i;

    @NotNull
    public static final b9 Companion = new b9();

    @NotNull
    public static final Parcelable.Creator<c9> CREATOR = new com.yandex.passport.api.impl.a(25);
    public static final arf[] j = {null, null, null, null, null, null, btf.a(bwf.b, new k5(15)), null, null};

    public c9(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, List list, String str3, boolean z5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = c5b.a;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z5;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return Intrinsics.d(this.a, c9Var.a) && this.b == c9Var.b && this.c == c9Var.c && this.d == c9Var.d && this.e == c9Var.e && Intrinsics.d(this.f, c9Var.f) && Intrinsics.d(this.g, c9Var.g) && Intrinsics.d(this.h, c9Var.h) && this.i == c9Var.i;
    }

    public final int hashCode() {
        String str = this.a;
        int e = k5r.e(k5r.e(k5r.e(k5r.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int d = k5r.d((e + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        return Boolean.hashCode(this.i) + ((d + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(status=");
        sb.append(this.a);
        sb.append(", isComplete=");
        sb.append(this.b);
        sb.append(", isCompletionAvailable=");
        sb.append(this.c);
        sb.append(", isCompletionRecommended=");
        sb.append(this.d);
        sb.append(", isCompletionRequired=");
        sb.append(this.e);
        sb.append(", completionUrl=");
        sb.append(this.f);
        sb.append(", members=");
        sb.append(this.g);
        sb.append(", xTokenClientId=");
        sb.append(this.h);
        sb.append(", xTokenNeedReset=");
        return dfi.j(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        Iterator n = f1d.n(parcel, this.g);
        while (n.hasNext()) {
            ((c4) n.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public c9(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, ArrayList arrayList, String str3, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str2;
        this.g = arrayList;
        this.h = str3;
        this.i = z5;
    }
}
