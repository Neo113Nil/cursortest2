package com.yandex.plus.pay.internal.feature.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.adapter.api.b0;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t implements Parcelable {
    public final boolean a;
    public final boolean b;
    public final r c;

    @NotNull
    public static final s Companion = new s();

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new b0(11);

    public /* synthetic */ t(int i, boolean z, boolean z2, r rVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, l.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = rVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b && Intrinsics.d(this.c, tVar.c);
    }

    public final int hashCode() {
        int e = k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        r rVar = this.c;
        return e + (rVar == null ? 0 : rVar.hashCode());
    }

    public final String toString() {
        return "PlusPayOfferDetailsConfiguration(requestSilentInvoiceAvailability=" + this.a + ", requestPaymentMethodsGroups=" + this.b + ", additionalOffers=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        r rVar = this.c;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i);
        }
    }

    public t(boolean z, boolean z2, r rVar) {
        this.a = z;
        this.b = z2;
        this.c = rVar;
    }
}
