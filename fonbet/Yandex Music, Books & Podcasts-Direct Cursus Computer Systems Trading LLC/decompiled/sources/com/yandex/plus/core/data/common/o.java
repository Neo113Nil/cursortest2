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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o extends s {
    public static final arf[] e;
    public final List b;
    public final List c;
    public final double d;

    @NotNull
    public static final n Companion = new n();

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new com.yandex.plus.core.benchmark.g(6);

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new com.yandex.plus.bdui.plus.shared.serializer.d(15)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.shared.serializer.d(16)), null};
    }

    public /* synthetic */ o(int i, List list, List list2, double d) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, m.a.getDescriptor());
            throw null;
        }
        this.b = list;
        this.c = list2;
        this.d = d;
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
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c) && Double.compare(this.d, oVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + k5r.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Linear(colors=");
        sb.append(this.b);
        sb.append(", positions=");
        sb.append(this.c);
        sb.append(", angle=");
        return k5r.n(sb, this.d, ')');
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
        parcel.writeDouble(this.d);
    }

    public o(List list, ArrayList arrayList, double d) {
        this.b = list;
        this.c = arrayList;
        this.d = d;
    }
}
