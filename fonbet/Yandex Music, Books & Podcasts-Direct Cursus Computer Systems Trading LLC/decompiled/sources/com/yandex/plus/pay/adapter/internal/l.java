package com.yandex.plus.pay.adapter.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l implements com.yandex.plus.pay.adapter.api.e0 {
    public final PlusPayPrice a;

    @NotNull
    public static final k Companion = new k();

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new com.yandex.plus.pay.adapter.api.b0(1);

    public /* synthetic */ l(int i, PlusPayPrice plusPayPrice) {
        if (1 == (i & 1)) {
            this.a = plusPayPrice;
        } else {
            u7g.V(i, 1, j.a.getDescriptor());
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
        return (obj instanceof l) && Intrinsics.d(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompositeOfferPriceImpl(actualPrice=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }

    public l(PlusPayPrice plusPayPrice) {
        plusPayPrice.getClass();
        this.a = plusPayPrice;
    }
}
