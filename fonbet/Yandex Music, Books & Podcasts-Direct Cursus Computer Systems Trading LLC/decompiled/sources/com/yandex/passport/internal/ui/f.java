package com.yandex.passport.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new com.yandex.passport.internal.properties.f(26);
    public final String a;
    public final Throwable b;

    public f(String str, Throwable th) {
        str.getClass();
        th.getClass();
        this.a = str;
        this.b = th;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventError(errorCode=");
        sb.append(this.a);
        sb.append(", exception=");
        return f1d.k(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeSerializable(this.b);
    }

    public /* synthetic */ f(String str) {
        this(str, new Throwable(str));
    }
}
