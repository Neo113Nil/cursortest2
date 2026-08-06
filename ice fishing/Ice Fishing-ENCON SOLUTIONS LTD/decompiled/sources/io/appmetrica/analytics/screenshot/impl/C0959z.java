package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959z implements Parcelable {
    public static final C0958y CREATOR = new C0958y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7684a;

    public C0959z(boolean z2) {
        this.f7684a = z2;
    }

    public final boolean a() {
        return this.f7684a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f7684a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f7684a ? (byte) 1 : (byte) 0);
    }

    public C0959z(h0 h0Var) {
        this(h0Var.a());
    }
}
