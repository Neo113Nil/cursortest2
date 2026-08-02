package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e0> CREATOR = new f(13);
    public final com.yandex.passport.internal.entities.k a;
    public final y1 b;
    public final z1 c;
    public final w1 d;

    public e0(com.yandex.passport.internal.entities.k kVar, y1 y1Var, z1 z1Var, w1 w1Var) {
        kVar.getClass();
        y1Var.getClass();
        z1Var.getClass();
        w1Var.getClass();
        this.a = kVar;
        this.b = y1Var;
        this.c = z1Var;
        this.d = w1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.a, e0Var.a) && this.b == e0Var.b && Intrinsics.d(this.c, e0Var.c) && this.d == e0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SocialBindProperties(filter=" + this.a + ", theme=" + this.b + ", uid=" + this.c + ", socialBindingConfiguration=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b.name());
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d.name());
    }
}
