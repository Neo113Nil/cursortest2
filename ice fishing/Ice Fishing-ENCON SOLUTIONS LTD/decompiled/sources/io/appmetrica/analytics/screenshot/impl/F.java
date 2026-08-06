package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final C0959z f7585a;

    /* renamed from: b, reason: collision with root package name */
    public final H f7586b;

    /* renamed from: c, reason: collision with root package name */
    public final B f7587c;

    public F(C0959z c0959z, H h2, B b2) {
        this.f7585a = c0959z;
        this.f7586b = h2;
        this.f7587c = b2;
    }

    public final C0959z a() {
        return this.f7585a;
    }

    public final B b() {
        return this.f7587c;
    }

    public final H c() {
        return this.f7586b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f7585a + ", serviceCaptorConfig=" + this.f7586b + ", contentObserverCaptorConfig=" + this.f7587c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f7585a, i2);
        parcel.writeParcelable(this.f7586b, i2);
        parcel.writeParcelable(this.f7587c, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(k0 k0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        h0 a2 = k0Var.a();
        C0959z c0959z = a2 != null ? new C0959z(a2) : null;
        l0 c2 = k0Var.c();
        H h2 = c2 != null ? new H(c2) : null;
        i0 b2 = k0Var.b();
    }
}
