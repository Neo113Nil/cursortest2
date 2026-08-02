package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3809qb extends AbstractC0549a implements InterfaceC3862rb {
    public C3809qb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final Y2.a c() {
        return Wv.e(K0(F0(), 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final int d() {
        Parcel K02 = K0(F0(), 5);
        int readInt = K02.readInt();
        K02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final Map e() {
        Parcel K02 = K0(F0(), 6);
        HashMap readHashMap = K02.readHashMap(AbstractC3411j8.f31986a);
        K02.recycle();
        return readHashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final Uri f() {
        Parcel K02 = K0(F0(), 2);
        Uri uri = (Uri) AbstractC3411j8.b(K02, Uri.CREATOR);
        K02.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final double i() {
        Parcel K02 = K0(F0(), 3);
        double readDouble = K02.readDouble();
        K02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862rb
    public final int o() {
        Parcel K02 = K0(F0(), 4);
        int readInt = K02.readInt();
        K02.recycle();
        return readInt;
    }
}
