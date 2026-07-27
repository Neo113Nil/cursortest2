package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3583mb extends Z2.a implements InterfaceC3637nb {
    public C3583mb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final int c() {
        Parcel D02 = D0(A0(), 4);
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final V2.a d() {
        return CL.f(D0(A0(), 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final Map e() {
        Parcel D02 = D0(A0(), 6);
        HashMap readHashMap = D02.readHashMap(AbstractC3241g8.f30958a);
        D02.recycle();
        return readHashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final int f() {
        Parcel D02 = D0(A0(), 5);
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final Uri i() {
        Parcel D02 = D0(A0(), 2);
        Uri uri = (Uri) AbstractC3241g8.b(D02, Uri.CREATOR);
        D02.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final double o() {
        Parcel D02 = D0(A0(), 3);
        double readDouble = D02.readDouble();
        D02.recycle();
        return readDouble;
    }
}
