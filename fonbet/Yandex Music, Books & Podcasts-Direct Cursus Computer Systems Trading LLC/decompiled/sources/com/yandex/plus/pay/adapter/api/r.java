package com.yandex.plus.pay.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class r implements Parcelable {
    public final String a;
    public final boolean b;

    @NotNull
    public static final q Companion = new q();

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(25);

    public /* synthetic */ r(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, p.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
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
        return Intrinsics.d(this.a, rVar.a) && this.b == rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleBillingConfig(googleCountryCode=");
        sb.append(this.a);
        sb.append(", isNativePaymentAllowed=");
        return dfi.j(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public r(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
