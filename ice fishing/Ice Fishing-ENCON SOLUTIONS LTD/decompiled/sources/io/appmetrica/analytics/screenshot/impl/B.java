package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7580a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7581b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7582c;

    public B(boolean z2, List list, long j2) {
        this.f7580a = z2;
        this.f7581b = list;
        this.f7582c = j2;
    }

    public final long a() {
        return this.f7582c;
    }

    public final boolean b() {
        return this.f7580a;
    }

    public final List c() {
        return this.f7581b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f7580a + ", mediaStoreColumnNames=" + this.f7581b + ", detectWindowSeconds=" + this.f7582c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f7580a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f7581b);
        parcel.writeLong(this.f7582c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
