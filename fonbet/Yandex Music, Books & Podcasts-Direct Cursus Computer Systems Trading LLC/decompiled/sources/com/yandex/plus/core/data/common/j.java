package com.yandex.plus.core.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.f1d;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j extends k {
    public final List b;

    @NotNull
    public static final i Companion = new i();

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new com.yandex.plus.core.benchmark.g(5);
    public static final arf[] c = {btf.a(bwf.b, new com.yandex.plus.bdui.plus.shared.serializer.d(13))};

    public /* synthetic */ j(List list, int i) {
        if (1 == (i & 1)) {
            this.b = list;
        } else {
            u7g.V(i, 1, h.a.getDescriptor());
            throw null;
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
        return (obj instanceof j) && Intrinsics.d(this.b, ((j) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("Gradient(gradients="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.b);
        while (n.hasNext()) {
            parcel.writeParcelable((Parcelable) n.next(), i);
        }
    }

    public j(List list) {
        list.getClass();
        this.b = list;
    }
}
