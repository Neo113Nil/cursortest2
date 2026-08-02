package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.i1;
import com.yandex.passport.api.j1;
import com.yandex.passport.api.k0;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.o1;
import com.yandex.passport.api.p0;
import defpackage.b6e;
import defpackage.k5r;
import defpackage.tah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k implements p0, Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new com.yandex.passport.internal.credentials.b(9);
    public final com.yandex.passport.api.impl.b a;
    public final com.yandex.passport.api.impl.b b;
    public final com.yandex.passport.common.bitflag.b c;
    public final o1 d;
    public final LinkedHashMap e;

    public k(com.yandex.passport.api.impl.b bVar, com.yandex.passport.api.impl.b bVar2, com.yandex.passport.common.bitflag.b bVar3, o1 o1Var, LinkedHashMap linkedHashMap) {
        bVar.getClass();
        bVar3.getClass();
        o1Var.getClass();
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
        this.d = o1Var;
        this.e = linkedHashMap;
    }

    public final boolean a(com.yandex.passport.api.n nVar) {
        nVar.getClass();
        com.yandex.passport.common.bitflag.b bVar = this.c;
        bVar.getClass();
        nVar.getClass();
        return bVar.a.a(nVar.a);
    }

    public final boolean b(com.yandex.passport.api.n nVar) {
        nVar.getClass();
        com.yandex.passport.api.n[] values = com.yandex.passport.api.n.values();
        ArrayList arrayList = new ArrayList();
        for (com.yandex.passport.api.n nVar2 : values) {
            if (this.c.a.a(nVar2.a)) {
                arrayList.add(nVar2);
            }
        }
        EnumSet noneOf = EnumSet.noneOf(com.yandex.passport.api.n.class);
        noneOf.addAll(arrayList);
        return noneOf.size() == 1 && CollectionsKt.P(noneOf) == nVar;
    }

    @Override // com.yandex.passport.api.p0
    public final Map d() {
        j1 j1Var;
        LinkedHashMap linkedHashMap = this.e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            com.yandex.passport.data.models.j jVar = (com.yandex.passport.data.models.j) entry.getValue();
            jVar.getClass();
            com.yandex.passport.data.models.i iVar = jVar.a;
            Set set = jVar.b;
            int ordinal = iVar.ordinal();
            if (ordinal == 0) {
                j1Var = new j1(i1.a, set);
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                j1Var = new j1(i1.b, set);
            }
            linkedHashMap2.put(key, j1Var);
        }
        return linkedHashMap2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.api.p0
    public final k0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.a, kVar.a) && Intrinsics.d(this.b, kVar.b) && Intrinsics.d(this.c, kVar.c) && Intrinsics.d(this.d, kVar.d) && this.e.equals(kVar.e);
    }

    @Override // com.yandex.passport.api.p0
    public final k0 f() {
        return this.a;
    }

    @Override // com.yandex.passport.api.p0
    public final o1 h() {
        return this.d;
    }

    public final int hashCode() {
        int i = this.a.a * 31;
        com.yandex.passport.api.impl.b bVar = this.b;
        return this.e.hashCode() + k5r.d((((i + (bVar == null ? 0 : bVar.a)) * 31) + this.c.a.a) * 31, 31, ((p) this.d).a);
    }

    @Override // com.yandex.passport.api.p0
    public final EnumSet j() {
        com.yandex.passport.api.n[] values = com.yandex.passport.api.n.values();
        ArrayList arrayList = new ArrayList();
        for (com.yandex.passport.api.n nVar : values) {
            if (this.c.a.a(nVar.a)) {
                arrayList.add(nVar);
            }
        }
        EnumSet noneOf = EnumSet.noneOf(com.yandex.passport.api.n.class);
        noneOf.addAll(arrayList);
        return noneOf;
    }

    public final String toString() {
        return "Filter(primaryEnvironment=" + this.a + ", secondaryTeamEnvironment=" + this.b + ", flagHolder=" + this.c + ", partitions=" + this.d + ", internalFilterRules=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        com.yandex.passport.common.bitflag.b bVar = this.c;
        bVar.getClass();
        parcel.writeParcelable(bVar.a, i);
        o1 o1Var = this.d;
        o1Var.getClass();
        ArrayList arrayList = new ArrayList(v75.o(o1Var, 10));
        Iterator it = o1Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((m1) it.next()).a);
        }
        parcel.writeStringList(arrayList);
        LinkedHashMap linkedHashMap = this.e;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
