package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.u2;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class v implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<v> CREATOR = new f(8);
    public final l2 a;
    public final u2 b;
    public final o2 c;
    public final boolean d;

    public v(l2 l2Var, u2 u2Var, o2 o2Var, boolean z) {
        l2Var.getClass();
        u2Var.getClass();
        o2Var.getClass();
        this.a = l2Var;
        this.b = u2Var;
        this.c = o2Var;
        this.d = z;
    }

    public final l2 d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final o2 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.a, vVar.a) && Intrinsics.d(this.b, vVar.b) && Intrinsics.d(this.c, vVar.c) && this.d == vVar.d;
    }

    public final boolean f() {
        return this.d;
    }

    public final u2 g() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressPropertiesImpl(animation=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", showCancelButton=");
        return dfi.j(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ v() {
        this(new j2(), q2.a, n2.a, true);
    }
}
