package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final G CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7588a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7589b;

    public H(boolean z2, long j2) {
        this.f7588a = z2;
        this.f7589b = j2;
    }

    public final long a() {
        return this.f7589b;
    }

    public final boolean b() {
        return this.f7588a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f7588a + ", delaySeconds=" + this.f7589b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f7588a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7589b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
