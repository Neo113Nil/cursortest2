package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.ef, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3167ef extends AbstractC0549a implements InterfaceC3221ff {
    public C3167ef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3221ff
    public final String d() {
        Parcel K02 = K0(F0(), 1);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3221ff
    public final int e() {
        Parcel K02 = K0(F0(), 2);
        int readInt = K02.readInt();
        K02.recycle();
        return readInt;
    }
}
