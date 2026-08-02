package com.yandex.plus.pay.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class z implements d0 {
    public final com.yandex.plus.core.data.pay.k a;

    @NotNull
    public static final y Companion = new y();

    @NotNull
    public static final Parcelable.Creator<z> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(28);

    public /* synthetic */ z(int i, com.yandex.plus.core.data.pay.k kVar) {
        if (1 == (i & 1)) {
            this.a = kVar;
        } else {
            u7g.V(i, 1, x.a.getDescriptor());
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
        return (obj instanceof z) && Intrinsics.d(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentMethodSelection(errorState=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }

    public z(com.yandex.plus.core.data.pay.k kVar) {
        kVar.getClass();
        this.a = kVar;
    }
}
