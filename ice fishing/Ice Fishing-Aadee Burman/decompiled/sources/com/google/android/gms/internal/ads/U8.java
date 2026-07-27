package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class U8 extends Q2.a {
    public static final Parcelable.Creator<U8> CREATOR = new V8(0);

    /* renamed from: n, reason: collision with root package name */
    public ParcelFileDescriptor f27904n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27905u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f27906v;

    /* renamed from: w, reason: collision with root package name */
    public final long f27907w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f27908x;

    public U8(ParcelFileDescriptor parcelFileDescriptor, boolean z3, boolean z6, long j6, boolean z9) {
        this.f27904n = parcelFileDescriptor;
        this.f27905u = z3;
        this.f27906v = z6;
        this.f27907w = j6;
        this.f27908x = z9;
    }

    public final synchronized boolean a() {
        return this.f27904n != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f27904n == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f27904n);
        this.f27904n = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean c() {
        return this.f27906v;
    }

    public final synchronized boolean d() {
        return this.f27908x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z3;
        long j6;
        int G7 = A8.b.G(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f27904n;
        }
        A8.b.y(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z3 = this.f27905u;
        }
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean c9 = c();
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(c9 ? 1 : 0);
        synchronized (this) {
            j6 = this.f27907w;
        }
        A8.b.F(parcel, 5, 8);
        parcel.writeLong(j6);
        boolean d2 = d();
        A8.b.F(parcel, 6, 4);
        parcel.writeInt(d2 ? 1 : 0);
        A8.b.I(parcel, G7);
    }

    public U8() {
        this(null, false, false, 0L, false);
    }
}
