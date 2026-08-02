package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o implements z {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new c(4);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.data.common.v e;
    public final com.yandex.plus.core.data.common.v f;
    public final d0 g;
    public final boolean h;
    public final com.yandex.plus.core.data.common.v i;
    public final Map j;
    public final boolean k;

    public o(String str, String str2, String str3, String str4, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.v vVar2, d0 d0Var, boolean z, com.yandex.plus.core.data.common.v vVar3, Map map, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vVar;
        this.f = vVar2;
        this.g = d0Var;
        this.h = z;
        this.i = vVar3;
        this.j = map;
        this.k = z2;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final boolean A() {
        return this.h;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v K() {
        throw null;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v L() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.a, oVar.a) && Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c) && Intrinsics.d(this.d, oVar.d) && Intrinsics.d(this.e, oVar.e) && Intrinsics.d(this.f, oVar.f) && Intrinsics.d(this.g, oVar.g) && this.h == oVar.h && Intrinsics.d(this.i, oVar.i) && Intrinsics.d(this.j, oVar.j) && this.k == oVar.k;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v getBackgroundColor() {
        throw null;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getId() {
        return this.a;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getName() {
        return this.b;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getSubtitle() {
        throw null;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getTitle() {
        throw null;
    }

    public final int hashCode() {
        int f = com.appsflyer.internal.k.f(this.f, com.appsflyer.internal.k.f(this.e, k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
        d0 d0Var = this.g;
        int f2 = com.appsflyer.internal.k.f(this.i, k5r.e((f + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.h), 31);
        Map map = this.j;
        return Boolean.hashCode(this.k) + ((f2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final d0 q() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Family(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", titleTextColor=");
        sb.append(this.e);
        sb.append(", subtitleTextColor=");
        sb.append(this.f);
        sb.append(", action=");
        sb.append(this.g);
        sb.append(", isWidthMatchParent=");
        sb.append(this.h);
        sb.append(", backgroundColor=");
        sb.append(this.i);
        sb.append(", subtitlePluralForms=");
        sb.append(this.j);
        sb.append(", sharingFamilyInvitation=");
        return dfi.j(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        d0 d0Var = this.g;
        if (d0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeParcelable(this.i, i);
        Map map = this.j;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeInt(this.k ? 1 : 0);
    }
}
