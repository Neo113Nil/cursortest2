package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.k5r;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new f(1);
    public final y1 a;
    public final z1 b;
    public final String c;
    public final boolean d;
    public final m0 e;
    public final com.yandex.passport.internal.entities.p f;
    public final LinkedHashMap g;

    public h(y1 y1Var, z1 z1Var, String str, boolean z, m0 m0Var, com.yandex.passport.internal.entities.p pVar, LinkedHashMap linkedHashMap) {
        y1Var.getClass();
        z1Var.getClass();
        this.a = y1Var;
        this.b = z1Var;
        this.c = str;
        this.d = z;
        this.e = m0Var;
        this.f = pVar;
        this.g = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && Intrinsics.d(this.b, hVar.b) && Intrinsics.d(this.c, hVar.c) && this.d == hVar.d && Intrinsics.d(this.e, hVar.e) && this.f.equals(hVar.f) && this.g.equals(hVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int e = k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        m0 m0Var = this.e;
        return this.g.hashCode() + k5r.d((e + (m0Var != null ? m0Var.hashCode() : 0)) * 31, 31, this.f.a);
    }

    public final String toString() {
        return "BindPhoneProperties(theme=" + this.a + ", uid=" + this.b + ", phoneNumber=" + this.c + ", isPhoneEditable=" + this.d + ", webAmProperties=" + this.e + ", partitions=" + this.f + ", headers=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        m0 m0Var = this.e;
        if (m0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m0Var.writeToParcel(parcel, i);
        }
        com.yandex.passport.internal.entities.p pVar = this.f;
        ArrayList arrayList = new ArrayList(v75.o(pVar, 10));
        Iterator it = pVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((m1) it.next()).a);
        }
        parcel.writeStringList(arrayList);
        LinkedHashMap linkedHashMap = this.g;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
