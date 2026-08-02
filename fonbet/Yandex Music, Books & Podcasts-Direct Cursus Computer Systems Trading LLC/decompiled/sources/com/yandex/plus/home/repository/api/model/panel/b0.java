package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import defpackage.f1d;
import defpackage.k5r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b0> CREATOR = new c(14);
    public final String a;
    public final String b;
    public final a0 c;
    public final boolean d;
    public final List e;

    public b0(String str, String str2, a0 a0Var, boolean z, List list) {
        str.getClass();
        str2.getClass();
        a0Var.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = a0Var;
        this.d = z;
        this.e = list;
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
        return Intrinsics.d(this.a, b0Var.a) && Intrinsics.d(this.b, b0Var.b) && this.c == b0Var.c && this.d == b0Var.d && Intrinsics.d(this.e, b0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.e((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Section(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", hasHeavyShortcuts=");
        sb.append(this.d);
        sb.append(", shortcuts=");
        return eta.h(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeInt(this.d ? 1 : 0);
        Iterator n = f1d.n(parcel, this.e);
        while (n.hasNext()) {
            parcel.writeParcelable((Parcelable) n.next(), i);
        }
    }
}
