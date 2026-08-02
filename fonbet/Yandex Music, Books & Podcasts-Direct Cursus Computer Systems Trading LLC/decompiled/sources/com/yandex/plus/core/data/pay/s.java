package com.yandex.plus.core.data.pay;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s implements t {
    public final String a;
    public final c b;

    @NotNull
    public static final r Companion = new r();

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new com.yandex.plus.core.benchmark.g(19);
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.bdui.plus.shared.serializer.d(23))};

    public /* synthetic */ s(int i, String str, c cVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, q.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.a, sVar.a) && Intrinsics.d(this.b, sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(selectButtonText=" + this.a + ", paymentMethod=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public s(String str, c cVar) {
        str.getClass();
        cVar.getClass();
        this.a = str;
        this.b = cVar;
    }
}
