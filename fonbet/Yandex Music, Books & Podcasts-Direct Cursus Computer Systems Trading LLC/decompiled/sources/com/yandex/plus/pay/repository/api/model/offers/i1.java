package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.f1d;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class i1 implements Parcelable {
    public final String a;
    public final List b;

    @NotNull
    public static final p0 Companion = new p0();

    @NotNull
    public static final Parcelable.Creator<i1> CREATOR = new com.yandex.plus.pay.adapter.api.b0(28);
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.pay.internal.model.a(19))};

    public /* synthetic */ i1(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.d(this.a, i1Var.a) && Intrinsics.d(this.b, i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RichText(text=");
        sb.append(this.a);
        sb.append(", items=");
        return eta.h(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Iterator n = f1d.n(parcel, this.b);
        while (n.hasNext()) {
            parcel.writeParcelable((Parcelable) n.next(), i);
        }
    }

    public i1(String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }
}
