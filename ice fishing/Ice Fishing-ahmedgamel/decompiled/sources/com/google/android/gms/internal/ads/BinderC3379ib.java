package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ib, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3379ib extends AbstractBinderC3359i8 implements InterfaceC3862rb {

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f31818n;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f31819u;

    /* renamed from: v, reason: collision with root package name */
    public final double f31820v;

    /* renamed from: w, reason: collision with root package name */
    public final int f31821w;

    /* renamed from: x, reason: collision with root package name */
    public final int f31822x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f31823y;

    public BinderC3379ib(Drawable drawable, Uri uri, double d9, int i, int i4, HashMap hashMap) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f31818n = drawable;
        this.f31819u = uri;
        this.f31820v = d9;
        this.f31821w = i;
        this.f31822x = i4;
        this.f31823y = hashMap;
    }

    public static InterfaceC3862rb U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof InterfaceC3862rb ? (InterfaceC3862rb) queryLocalInterface : new C3809qb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Y2.a c9 = c();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, c9);
                return true;
            case 2:
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, this.f31819u);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f31820v);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f31821w);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f31822x);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f31823y);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final Y2.a c() {
        return new Y2.b(this.f31818n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final int d() {
        return this.f31822x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final Map e() {
        return this.f31823y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final Uri f() {
        return this.f31819u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final double i() {
        return this.f31820v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final int o() {
        return this.f31821w;
    }
}
