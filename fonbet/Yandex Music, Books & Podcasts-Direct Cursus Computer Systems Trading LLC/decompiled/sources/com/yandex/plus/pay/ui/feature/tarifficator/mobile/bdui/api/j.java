package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.repository.api.model.offers.w0;
import defpackage.dfi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j implements l {

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new w0(24);
    public final Map a;
    public final com.yandex.plus.pay.ui.api.feature.payment.g b;
    public final boolean c;

    public j(Map map, com.yandex.plus.pay.ui.api.feature.payment.g gVar, boolean z) {
        gVar.getClass();
        this.a = map;
        this.b = gVar;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.a, jVar.a) && Intrinsics.d(this.b, jVar.b) && this.c == jVar.c;
    }

    public final int hashCode() {
        Map map = this.a;
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentError(payload=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", errorScreenSkipped=");
        return dfi.j(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        a.c.e(this.a, parcel);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
