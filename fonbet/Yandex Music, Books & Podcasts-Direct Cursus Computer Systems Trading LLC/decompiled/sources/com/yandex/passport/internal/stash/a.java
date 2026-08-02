package com.yandex.passport.internal.stash;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.yandex.passport.internal.properties.f;
import defpackage.k5r;
import defpackage.uah;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new f(25);
    public final Map a;

    public a(Map map) {
        map.getClass();
        this.a = map;
    }

    public final String a(b bVar) {
        bVar.getClass();
        return (String) this.a.get(bVar.a);
    }

    public final a b(b bVar, String str, boolean z) {
        bVar.getClass();
        String str2 = bVar.a;
        Map map = this.a;
        Map f = str == null ? uah.f(str2, map) : uah.j(map, new Pair(str2, str));
        if (z) {
            f = uah.j(f, new Pair("timestamp.v2_" + str2, String.valueOf(System.currentTimeMillis())));
        }
        return new a(f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("Stash(storage="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator s = k.s(this.a, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
