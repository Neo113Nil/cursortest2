package com.yandex.plus.pay.ui.yb.web.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.l;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new l(5);
    public final String a;
    public final long b;
    public final long c;
    public final com.yandex.plus.pay.ui.yb.api.e d;

    public b(String str, long j, long j2, com.yandex.plus.pay.ui.yb.api.e eVar) {
        str.getClass();
        eVar.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + tlm.c(this.c, tlm.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Arguments(url=" + this.a + ", startedTimeoutMillis=" + this.b + ", loadedTimeoutMillis=" + this.c + ", actionScenario=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d.name());
    }
}
