package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.o1;
import defpackage.eta;
import defpackage.f1d;
import defpackage.vhp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp(with = q.class)
/* loaded from: classes4.dex */
public final class p implements o1, Parcelable {
    public final List a;

    @NotNull
    public static final o Companion = new o();

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new com.yandex.passport.internal.credentials.b(11);

    public p(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        return eta.h(new StringBuilder("Partitions(partitions="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.a);
        while (n.hasNext()) {
            parcel.writeString(((m1) n.next()).a);
        }
    }
}
