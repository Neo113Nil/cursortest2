package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o0 implements Parcelable {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final List d;

    @NotNull
    public static final n0 Companion = new n0();

    @NotNull
    public static final Parcelable.Creator<o0> CREATOR = new com.yandex.passport.api.impl.a(18);
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new com.yandex.passport.api.exception.l(15))};

    public /* synthetic */ o0(int i, String str, List list, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, m0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.a, o0Var.a) && this.b == o0Var.b && this.c == o0Var.c && Intrinsics.d(this.d, o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", isAccountBound=");
        sb.append(this.b);
        sb.append(", isPossible=");
        sb.append(this.c);
        sb.append(", offerDelays=");
        return eta.h(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        Iterator n = f1d.n(parcel, this.d);
        while (n.hasNext()) {
            parcel.writeInt(((Number) n.next()).intValue());
        }
    }

    public o0(String str, boolean z, boolean z2, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = arrayList;
    }
}
