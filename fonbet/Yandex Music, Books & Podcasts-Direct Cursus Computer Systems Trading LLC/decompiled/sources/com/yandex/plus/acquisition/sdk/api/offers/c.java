package com.yandex.plus.acquisition.sdk.api.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.acquisition.adapter.api.k;
import defpackage.dfi;
import defpackage.f1d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new k(5);
    public final String a;
    public final String b;
    public final e c;
    public final ArrayList d;
    public final a e;
    public final b f;
    public final Map g;
    public final boolean h;

    public c(String str, String str2, e eVar, ArrayList arrayList, a aVar, b bVar, Map map, boolean z) {
        str.getClass();
        aVar.getClass();
        bVar.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = eVar;
        this.d = arrayList;
        this.e = aVar;
        this.f = bVar;
        this.g = map;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && this.d.equals(cVar.d) && Intrinsics.d(this.e, cVar.e) && Intrinsics.d(this.f, cVar.f) && Intrinsics.d(this.g, cVar.g) && this.h == cVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.c;
        return Boolean.hashCode(this.h) + f1d.b(this.g, (this.f.hashCode() + ((this.e.hashCode() + dfi.b(this.d, (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionOffer(positionId=");
        sb.append(this.a);
        sb.append(", currentTariffName=");
        sb.append(this.b);
        sb.append(", tariff=");
        sb.append(this.c);
        sb.append(", options=");
        sb.append(this.d);
        sb.append(", assets=");
        sb.append(this.e);
        sb.append(", meta=");
        sb.append(this.f);
        sb.append(", payload=");
        sb.append(this.g);
        sb.append(", isSilentInvoiceAvailable=");
        return dfi.j(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        e eVar = this.c;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i);
        }
        ArrayList arrayList = this.d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e) it.next()).writeToParcel(parcel, i);
        }
        this.e.writeToParcel(parcel, i);
        this.f.writeToParcel(parcel, i);
        Iterator s = com.appsflyer.internal.k.s(this.g, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.h ? 1 : 0);
    }
}
