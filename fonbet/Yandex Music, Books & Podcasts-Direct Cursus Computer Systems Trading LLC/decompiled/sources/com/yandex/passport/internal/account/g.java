package com.yandex.passport.internal.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.n;
import com.yandex.passport.api.z1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new com.yandex.passport.api.impl.a(27);
    public final z1 a;
    public final z1 b;
    public final n c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public g(z1 z1Var, z1 z1Var2, n nVar, String str, String str2, String str3, String str4) {
        z1Var.getClass();
        nVar.getClass();
        this.a = z1Var;
        this.b = z1Var2;
        this.c = nVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        z1 z1Var = this.b;
        if (z1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            z1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
