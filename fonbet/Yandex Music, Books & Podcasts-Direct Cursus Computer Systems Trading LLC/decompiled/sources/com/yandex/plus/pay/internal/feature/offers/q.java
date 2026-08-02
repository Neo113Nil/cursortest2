package com.yandex.plus.pay.internal.feature.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.adapter.api.b0;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class q implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final PlusPayUpsaleStep d;
    public final boolean e;

    @NotNull
    public static final p Companion = new p();

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new b0(10);
    public static final arf[] f = {null, null, null, btf.a(bwf.b, new com.yandex.plus.pay.internal.di.g(11)), null};

    public /* synthetic */ q(int i, String str, String str2, String str3, PlusPayUpsaleStep plusPayUpsaleStep, boolean z) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, o.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = plusPayUpsaleStep;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.a, qVar.a) && Intrinsics.d(this.b, qVar.b) && Intrinsics.d(this.c, qVar.c) && this.d == qVar.d && this.e == qVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Offer(offerName=");
        sb.append(this.a);
        sb.append(", offersBatchId=");
        sb.append(this.b);
        sb.append(", positionId=");
        sb.append(this.c);
        sb.append(", upsaleStep=");
        sb.append(this.d);
        sb.append(", isSelected=");
        return dfi.j(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public q(String str, String str2, String str3, PlusPayUpsaleStep plusPayUpsaleStep, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        plusPayUpsaleStep.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = plusPayUpsaleStep;
        this.e = z;
    }
}
