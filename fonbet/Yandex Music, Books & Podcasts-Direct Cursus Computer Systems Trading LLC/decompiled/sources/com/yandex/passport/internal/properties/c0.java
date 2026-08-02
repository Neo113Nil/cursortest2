package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c0 implements Parcelable {
    public final z1 a;
    public final v b;
    public final y1 c;
    public static final b0 d = new b0();

    @NotNull
    public static final Parcelable.Creator<c0> CREATOR = new f(11);

    public c0(z1 z1Var, v vVar, y1 y1Var) {
        vVar.getClass();
        y1Var.getClass();
        this.a = z1Var;
        this.b = vVar;
        this.c = y1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.a, c0Var.a) && Intrinsics.d(this.b, c0Var.b) && this.c == c0Var.c;
    }

    public final int hashCode() {
        z1 z1Var = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((z1Var == null ? 0 : z1Var.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "SetCurrentAccountPropertiesImpl(uid=" + this.a + ", progressProperties=" + this.b + ", theme=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        z1 z1Var = this.a;
        if (z1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            z1Var.writeToParcel(parcel, i);
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c.name());
    }
}
