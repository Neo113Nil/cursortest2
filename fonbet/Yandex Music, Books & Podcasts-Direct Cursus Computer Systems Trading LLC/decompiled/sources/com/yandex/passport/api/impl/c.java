package com.yandex.passport.api.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import defpackage.dfi;
import defpackage.k5r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a(1);
    public final y1 a;
    public final b b;
    public final LinkedHashMap c;
    public final boolean d;
    public final boolean e;

    public c(y1 y1Var, b bVar, LinkedHashMap linkedHashMap, boolean z, boolean z2) {
        y1Var.getClass();
        bVar.getClass();
        this.a = y1Var;
        this.b = bVar;
        this.c = linkedHashMap;
        this.d = z;
        this.e = z2;
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
        return this.a == cVar.a && Intrinsics.d(this.b, cVar.b) && this.c.equals(cVar.c) && this.d == cVar.d && this.e == cVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.e((this.c.hashCode() + (((this.a.hashCode() * 31) + this.b.a) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserIdProperties(theme=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", customWebParams=");
        sb.append(this.c);
        sb.append(", showLoading=");
        sb.append(this.d);
        sb.append(", showUi=");
        return dfi.j(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
        LinkedHashMap linkedHashMap = this.c;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
