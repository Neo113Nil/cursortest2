package com.yandex.plus.core.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class r extends s {
    public static final arf[] f;
    public final List b;
    public final List c;
    public final Pair d;
    public final Pair e;

    @NotNull
    public static final q Companion = new q();

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new com.yandex.plus.core.benchmark.g(7);

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{btf.a(bwfVar, new com.yandex.plus.bdui.plus.shared.serializer.d(17)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.shared.serializer.d(18)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.shared.serializer.d(19)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.shared.serializer.d(20))};
    }

    public /* synthetic */ r(int i, List list, List list2, Pair pair, Pair pair2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, p.a.getDescriptor());
            throw null;
        }
        this.b = list;
        this.c = list2;
        this.d = pair;
        this.e = pair2;
    }

    @Override // com.yandex.plus.core.data.common.s
    public final List d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.b, rVar.b) && Intrinsics.d(this.c, rVar.c) && Intrinsics.d(this.d, rVar.d) && Intrinsics.d(this.e, rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k5r.d(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "Radial(colors=" + this.b + ", positions=" + this.c + ", radius=" + this.d + ", center=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.b);
        while (n.hasNext()) {
            parcel.writeInt(((Number) n.next()).intValue());
        }
        Iterator n2 = f1d.n(parcel, this.c);
        while (n2.hasNext()) {
            parcel.writeDouble(((Number) n2.next()).doubleValue());
        }
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
    }

    public r(List list, ArrayList arrayList, Pair pair, Pair pair2) {
        pair.getClass();
        pair2.getClass();
        this.b = list;
        this.c = arrayList;
        this.d = pair;
        this.e = pair2;
    }
}
