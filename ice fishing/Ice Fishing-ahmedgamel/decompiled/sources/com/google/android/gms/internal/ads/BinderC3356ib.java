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
public final class BinderC3356ib extends AbstractBinderC3336i8 implements InterfaceC3839rb {

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f31047n;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f31048u;

    /* renamed from: v, reason: collision with root package name */
    public final double f31049v;

    /* renamed from: w, reason: collision with root package name */
    public final int f31050w;

    /* renamed from: x, reason: collision with root package name */
    public final int f31051x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f31052y;

    public BinderC3356ib(Drawable drawable, Uri uri, double d2, int i, int i6, HashMap hashMap) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f31047n = drawable;
        this.f31048u = uri;
        this.f31049v = d2;
        this.f31050w = i;
        this.f31051x = i6;
        this.f31052y = hashMap;
    }

    public static InterfaceC3839rb U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof InterfaceC3839rb ? (InterfaceC3839rb) queryLocalInterface : new C3786qb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                W2.a c9 = c();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, c9);
                return true;
            case 2:
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, this.f31048u);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f31049v);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f31050w);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f31051x);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f31052y);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final W2.a c() {
        return new W2.b(this.f31047n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final int d() {
        return this.f31051x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final Map e() {
        return this.f31052y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final Uri f() {
        return this.f31048u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final double i() {
        return this.f31049v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final int o() {
        return this.f31050w;
    }
}
