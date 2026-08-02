package com.yandex.plus.pay.internal.feature.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.adapter.api.b0;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
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
public final class r implements Parcelable {
    public static final arf[] c;
    public final List a;
    public final List b;

    @NotNull
    public static final n Companion = new n();

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new b0(9);

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new com.yandex.plus.pay.internal.di.g(9)), btf.a(bwfVar, new com.yandex.plus.pay.internal.di.g(10))};
    }

    public /* synthetic */ r(int i, List list, List list2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, m.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
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
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalOffers(passedUpsaleSteps=");
        sb.append(this.a);
        sb.append(", offers=");
        return eta.h(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.a);
        while (n.hasNext()) {
            ((PlusPayUpsaleStep) n.next()).writeToParcel(parcel, i);
        }
        Iterator n2 = f1d.n(parcel, this.b);
        while (n2.hasNext()) {
            ((q) n2.next()).writeToParcel(parcel, i);
        }
    }

    public r(ArrayList arrayList, List list) {
        list.getClass();
        this.a = list;
        this.b = arrayList;
    }
}
