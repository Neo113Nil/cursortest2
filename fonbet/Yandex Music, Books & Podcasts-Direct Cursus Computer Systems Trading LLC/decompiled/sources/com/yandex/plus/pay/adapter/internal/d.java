package com.yandex.plus.pay.adapter.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d implements com.yandex.plus.pay.adapter.api.b {
    public final PlusPayCompositeOffers.Offer.Assets a;

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new c();

    public /* synthetic */ d(int i, PlusPayCompositeOffers.Offer.Assets assets) {
        if (1 == (i & 1)) {
            this.a = assets;
        } else {
            u7g.V(i, 1, a.a.getDescriptor());
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
        return (obj instanceof d) && Intrinsics.d(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AssetsImpl(actualAssets=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }

    public d(PlusPayCompositeOffers.Offer.Assets assets) {
        assets.getClass();
        this.a = assets;
    }
}
