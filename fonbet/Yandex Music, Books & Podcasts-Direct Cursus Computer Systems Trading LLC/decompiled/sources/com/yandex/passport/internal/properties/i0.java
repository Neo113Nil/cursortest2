package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.r0;
import com.yandex.passport.api.u0;
import defpackage.hrg;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i0> CREATOR = new f(17);
    public final com.yandex.passport.internal.network.p a;
    public final Map b;
    public final List c;
    public final List d;
    public final Map e;

    public i0(com.yandex.passport.internal.network.p pVar, LinkedHashMap linkedHashMap, ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap2) {
        this.a = pVar;
        this.b = linkedHashMap;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = linkedHashMap2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.a, i0Var.a) && Intrinsics.d(this.b, i0Var.b) && Intrinsics.d(this.c, i0Var.c) && Intrinsics.d(this.d, i0Var.d) && Intrinsics.d(this.e, i0Var.e);
    }

    public final int hashCode() {
        com.yandex.passport.internal.network.p pVar = this.a;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map2 = this.e;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateableProperties(urlOverride=");
        sb.append(this.a);
        sb.append(", locationsUrlOverride=");
        sb.append(this.b);
        sb.append(", productLocation=");
        sb.append(this.c);
        sb.append(", deviceGeoLocation=");
        sb.append(this.d);
        sb.append(", vpnBlockerAdditionalParams=");
        return k5r.p(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        com.yandex.passport.internal.network.p pVar = this.a;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i);
        }
        Map map = this.b;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                u0 u0Var = (u0) entry.getKey();
                u0Var.getClass();
                parcel.writeLong(u0Var.a);
                ((com.yandex.passport.internal.network.p) entry.getValue()).writeToParcel(parcel, i);
            }
        }
        List list = this.c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                ((r0) v.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.d;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator v2 = hrg.v(parcel, 1, list2);
            while (v2.hasNext()) {
                ((r0) v2.next()).writeToParcel(parcel, i);
            }
        }
        Map map2 = this.e;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeStringArray((String[]) entry2.getValue());
        }
    }
}
