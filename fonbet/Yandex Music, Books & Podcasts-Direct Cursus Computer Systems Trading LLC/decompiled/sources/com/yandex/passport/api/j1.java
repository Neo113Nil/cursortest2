package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vz1;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j1> CREATOR = new a(4);
    public final i1 a;
    public final Set b;

    public j1(i1 i1Var, Set set) {
        i1Var.getClass();
        set.getClass();
        this.a = i1Var;
        this.b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a == j1Var.a && Intrinsics.d(this.b, j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassportParameterRule(sign=");
        sb.append(this.a);
        sb.append(", parameters=");
        return vz1.v(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        Set set = this.b;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
    }
}
