package com.yandex.plus.bdui.plus.scenario;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.benchmark.r;
import defpackage.dfi;
import defpackage.f1d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class q implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new com.yandex.plus.acquisition.adapter.api.k(27);
    public final Long a;
    public final com.yandex.plus.bdui.query.e b;
    public final int c;
    public final ArrayList d;
    public final r e;

    public q(Long l, com.yandex.plus.bdui.query.e eVar, int i, ArrayList arrayList, r rVar) {
        rVar.getClass();
        this.a = l;
        this.b = eVar;
        this.c = i;
        this.d = arrayList;
        this.e = rVar;
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
        return Intrinsics.d(this.a, qVar.a) && Intrinsics.d(this.b, qVar.b) && this.c == qVar.c && this.d.equals(qVar.d) && Intrinsics.d(this.e, qVar.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        com.yandex.plus.bdui.query.e eVar = this.b;
        return this.e.hashCode() + dfi.b(this.d, f1d.a(this.c, (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "SessionDump(userId=" + this.a + ", query=" + this.b + ", documentCount=" + this.c + ", benchmarkDumps=" + this.d + ", benchmarkSequenceDump=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Long l = this.a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        ArrayList arrayList = this.d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        parcel.writeParcelable(this.e, i);
    }
}
