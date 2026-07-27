package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ef, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3144ef extends AbstractC0432a implements InterfaceC3198ff {
    public C3144ef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3198ff
    public final String d() {
        Parcel M02 = M0(H0(), 1);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3198ff
    public final int e() {
        Parcel M02 = M0(H0(), 2);
        int readInt = M02.readInt();
        M02.recycle();
        return readInt;
    }
}
