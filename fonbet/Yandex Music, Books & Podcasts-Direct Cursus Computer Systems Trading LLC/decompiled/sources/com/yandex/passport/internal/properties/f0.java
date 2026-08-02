package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.z1;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f0> CREATOR = new f(14);
    public final z1 a;
    public final String b;

    public f0(z1 z1Var, String str) {
        this.a = z1Var;
        this.b = str;
    }

    public final z1 d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.a, f0Var.a) && Intrinsics.d(this.b, f0Var.b);
    }

    public final String getMessage() {
        return this.b;
    }

    public final int hashCode() {
        z1 z1Var = this.a;
        int hashCode = (z1Var == null ? 0 : z1Var.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialRegistrationProperties(uid=");
        sb.append(this.a);
        sb.append(", message=");
        return dfi.i(sb, this.b, ')');
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
        parcel.writeString(this.b);
    }
}
