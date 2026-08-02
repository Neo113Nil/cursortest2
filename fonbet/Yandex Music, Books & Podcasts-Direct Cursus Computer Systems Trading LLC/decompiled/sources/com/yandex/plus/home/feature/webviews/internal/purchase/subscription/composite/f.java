package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.p;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class f implements g {
    public static final arf[] e;
    public final a0 a;
    public final List b;
    public final p c;
    public final String d;

    @NotNull
    public static final e Companion = new e();

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new com.yandex.plus.core.benchmark.g(22);

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{null, btf.a(bwfVar, new u6(20)), btf.a(bwfVar, new u6(21)), null};
    }

    public /* synthetic */ f(int i, a0 a0Var, List list, p pVar, String str) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, d.a.getDescriptor());
            throw null;
        }
        this.a = a0Var;
        this.b = list;
        this.c = pVar;
        this.d = str;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g
    public final List P() {
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && Intrinsics.d(this.c, fVar.c) && Intrinsics.d(this.d, fVar.d);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g
    public final a0 getConfig() {
        return this.a;
    }

    public final int hashCode() {
        a0 a0Var = this.a;
        int d = k5r.d((a0Var == null ? 0 : a0Var.hashCode()) * 31, 31, this.b);
        p pVar = this.c;
        return this.d.hashCode() + ((d + (pVar != null ? pVar.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g
    public final p s() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stories(config=");
        sb.append(this.a);
        sb.append(", products=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", storyId=");
        return dfi.i(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        Iterator n = f1d.n(parcel, this.b);
        while (n.hasNext()) {
            m mVar = (m) n.next();
            mVar.getClass();
            parcel.writeParcelable(mVar.a, i);
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }

    public f(a0 a0Var, List list, p pVar, String str) {
        list.getClass();
        str.getClass();
        this.a = a0Var;
        this.b = list;
        this.c = pVar;
        this.d = str;
    }
}
