package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2993bf extends Z2.a implements InterfaceC3047cf {
    public C2993bf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3047cf
    public final String c() {
        Parcel D02 = D0(A0(), 1);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3047cf
    public final int f() {
        Parcel D02 = D0(A0(), 2);
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }
}
