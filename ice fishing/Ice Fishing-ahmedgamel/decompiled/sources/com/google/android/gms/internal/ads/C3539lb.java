package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3539lb extends AbstractC0549a implements InterfaceC3647nb {
    public C3539lb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3647nb
    public final String c() {
        Parcel K02 = K0(F0(), 2);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3647nb
    public final ArrayList f() {
        Parcel K02 = K0(F0(), 3);
        ArrayList readArrayList = K02.readArrayList(AbstractC3411j8.f31986a);
        K02.recycle();
        return readArrayList;
    }
}
