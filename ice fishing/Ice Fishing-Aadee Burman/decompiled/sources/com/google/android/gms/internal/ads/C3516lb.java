package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3516lb extends AbstractC0432a implements InterfaceC3624nb {
    public C3516lb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3624nb
    public final String c() {
        Parcel M02 = M0(H0(), 2);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3624nb
    public final ArrayList f() {
        Parcel M02 = M0(H0(), 3);
        ArrayList readArrayList = M02.readArrayList(AbstractC3388j8.f31199a);
        M02.recycle();
        return readArrayList;
    }
}
