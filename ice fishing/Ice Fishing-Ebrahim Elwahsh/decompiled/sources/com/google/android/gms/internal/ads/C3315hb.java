package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3315hb extends Z2.a implements InterfaceC3421jb {
    public C3315hb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3421jb
    public final String d() {
        Parcel D02 = D0(A0(), 2);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3421jb
    public final ArrayList i() {
        Parcel D02 = D0(A0(), 3);
        ArrayList readArrayList = D02.readArrayList(AbstractC3241g8.f30958a);
        D02.recycle();
        return readArrayList;
    }
}
