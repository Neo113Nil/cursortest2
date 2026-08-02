package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j0> CREATOR = new f(18);
    public final y1 a;
    public final com.yandex.passport.api.impl.b b;
    public final v c;
    public final LinkedHashMap d;

    public j0(y1 y1Var, com.yandex.passport.api.impl.b bVar, v vVar, LinkedHashMap linkedHashMap) {
        y1Var.getClass();
        bVar.getClass();
        vVar.getClass();
        this.a = y1Var;
        this.b = bVar;
        this.c = vVar;
        this.d = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.a == j0Var.a && Intrinsics.d(this.b, j0Var.b) && Intrinsics.d(this.c, j0Var.c) && this.d.equals(j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (((this.a.hashCode() * 31) + this.b.a) * 31)) * 31);
    }

    public final String toString() {
        return "UserMenuProperties(theme=" + this.a + ", environment=" + this.b + ", progressProperties=" + this.c + ", customWebParams=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        LinkedHashMap linkedHashMap = this.d;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
