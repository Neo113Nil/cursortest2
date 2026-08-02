package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2518Cb extends AbstractC0549a implements InterfaceC2535Db {
    public C2518Cb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2535Db
    public final boolean L3(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        Parcel K02 = K0(F02, 10);
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2535Db
    public final Y2.a b0() {
        return Wv.e(K0(F0(), 9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2535Db
    public final String g() {
        Parcel K02 = K0(F0(), 4);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }
}
