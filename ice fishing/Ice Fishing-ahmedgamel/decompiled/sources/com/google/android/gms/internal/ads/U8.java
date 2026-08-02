package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class U8 extends S2.a {
    public static final Parcelable.Creator<U8> CREATOR = new V8(0);

    /* renamed from: n, reason: collision with root package name */
    public ParcelFileDescriptor f28701n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f28702u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f28703v;

    /* renamed from: w, reason: collision with root package name */
    public final long f28704w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f28705x;

    public U8(ParcelFileDescriptor parcelFileDescriptor, boolean z6, boolean z9, long j6, boolean z10) {
        this.f28701n = parcelFileDescriptor;
        this.f28702u = z6;
        this.f28703v = z9;
        this.f28704w = j6;
        this.f28705x = z10;
    }

    public final synchronized boolean a() {
        return this.f28701n != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f28701n == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f28701n);
        this.f28701n = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean c() {
        return this.f28703v;
    }

    public final synchronized boolean d() {
        return this.f28705x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z6;
        long j6;
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f28701n;
        }
        com.bumptech.glide.e.q(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z6 = this.f28702u;
        }
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean c9 = c();
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(c9 ? 1 : 0);
        synchronized (this) {
            j6 = this.f28704w;
        }
        com.bumptech.glide.e.w(parcel, 5, 8);
        parcel.writeLong(j6);
        boolean d9 = d();
        com.bumptech.glide.e.w(parcel, 6, 4);
        parcel.writeInt(d9 ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public U8() {
        this(null, false, false, 0L, false);
    }
}
