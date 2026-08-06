package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D implements Parcelable {
    public static final C CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7583a;

    /* renamed from: b, reason: collision with root package name */
    public final F f7584b;

    public D(boolean z2, F f2) {
        this.f7583a = z2;
        this.f7584b = f2;
    }

    public final F a() {
        return this.f7584b;
    }

    public final boolean b() {
        return this.f7583a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f7583a + ", config=" + this.f7584b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f7583a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f7584b, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(j0 j0Var) {
        this(r0, r3 != null ? new F(r3) : null);
        boolean b2 = j0Var.b();
        k0 a2 = j0Var.a();
    }
}
