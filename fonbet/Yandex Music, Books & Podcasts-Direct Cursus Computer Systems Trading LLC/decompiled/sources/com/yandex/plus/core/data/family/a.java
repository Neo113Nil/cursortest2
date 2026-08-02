package com.yandex.plus.core.data.family;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.benchmark.g;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new g(11);
    public final int a;
    public final c b;
    public final ArrayList c;

    public a(int i, c cVar, ArrayList arrayList) {
        cVar.getClass();
        this.a = i;
        this.b = cVar;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Intrinsics.d(this.b, aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Family(capacity=");
        sb.append(this.a);
        sb.append(", headOfFamily=");
        sb.append(this.b);
        sb.append(", members=");
        return k5r.o(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
        ArrayList arrayList = this.c;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).writeToParcel(parcel, i);
        }
    }
}
