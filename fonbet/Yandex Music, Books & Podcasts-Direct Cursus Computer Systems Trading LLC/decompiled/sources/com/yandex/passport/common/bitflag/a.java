package com.yandex.passport.common.bitflag;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.get;
import defpackage.het;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new com.yandex.passport.api.impl.a(3);
    public int a;

    public a(int i) {
        this.a = i;
    }

    public final boolean a(int i) {
        int i2 = this.a;
        get getVar = het.b;
        return ((1 << i) & i2) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
