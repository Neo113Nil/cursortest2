package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class s0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s0> CREATOR = new e(1);
    public final k1 a;
    public final int b;
    public final Integer c;
    public final String d;
    public final com.yandex.passport.sloth.data.m e;
    public final boolean f;

    public s0(k1 k1Var, int i, Integer num, String str, com.yandex.passport.sloth.data.m mVar, boolean z) {
        this.a = k1Var;
        this.b = i;
        this.c = num;
        this.d = str;
        this.e = mVar;
        this.f = z;
    }

    public static s0 a(s0 s0Var, k1 k1Var, int i, Integer num, String str, com.yandex.passport.sloth.data.m mVar, int i2) {
        if ((i2 & 1) != 0) {
            k1Var = s0Var.a;
        }
        k1 k1Var2 = k1Var;
        if ((i2 & 2) != 0) {
            i = s0Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num = s0Var.c;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            str = s0Var.d;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            mVar = s0Var.e;
        }
        com.yandex.passport.sloth.data.m mVar2 = mVar;
        boolean z = (i2 & 32) != 0 ? s0Var.f : true;
        s0Var.getClass();
        return new s0(k1Var2, i3, num2, str2, mVar2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.a, s0Var.a) && this.b == s0Var.b && Intrinsics.d(this.c, s0Var.c) && Intrinsics.d(this.d, s0Var.d) && Intrinsics.d(this.e, s0Var.e) && this.f == s0Var.f;
    }

    public final int hashCode() {
        k1 k1Var = this.a;
        int a = f1d.a(this.b, (k1Var == null ? 0 : k1Var.hashCode()) * 31, 31);
        Integer num = this.c;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.yandex.passport.sloth.data.m mVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(ebsProcessState=");
        sb.append(this.a);
        sb.append(", countRetryingTrackIdRequests=");
        sb.append(this.b);
        sb.append(", resultCode=");
        sb.append(this.c);
        sb.append(", trackId=");
        sb.append(this.d);
        sb.append(", slothParams=");
        sb.append(this.e);
        sb.append(", againInitEbs=");
        return dfi.j(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.appsflyer.internal.k.v(parcel, 1, num);
        }
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
