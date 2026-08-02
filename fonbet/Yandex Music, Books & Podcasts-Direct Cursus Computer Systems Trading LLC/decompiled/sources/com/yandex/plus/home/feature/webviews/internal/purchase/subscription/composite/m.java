package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.home.datasource.openapi.models.u6;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m implements Parcelable {
    public final com.yandex.plus.pay.adapter.api.j a;

    @NotNull
    public static final l Companion = new l();

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new com.yandex.plus.core.benchmark.g(23);
    public static final arf[] b = {btf.a(bwf.b, new u6(22))};

    public /* synthetic */ m(int i, com.yandex.plus.pay.adapter.api.j jVar) {
        if (1 == (i & 1)) {
            this.a = jVar;
        } else {
            u7g.V(i, 1, k.a.getDescriptor());
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
        return (obj instanceof m) && Intrinsics.d(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompositeSubscriptionProduct(offer=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }

    public m(com.yandex.plus.pay.adapter.api.j jVar) {
        jVar.getClass();
        this.a = jVar;
    }
}
