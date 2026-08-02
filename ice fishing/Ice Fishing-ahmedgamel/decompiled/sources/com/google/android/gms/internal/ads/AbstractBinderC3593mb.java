package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3593mb extends AbstractBinderC3359i8 implements InterfaceC3647nb {
    public static InterfaceC3647nb U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof InterfaceC3647nb ? (InterfaceC3647nb) queryLocalInterface : new C3539lb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((BinderC3271gb) this).f31343n);
            return true;
        }
        if (i != 3) {
            return false;
        }
        ArrayList arrayList = ((BinderC3271gb) this).f31345v;
        parcel2.writeNoException();
        parcel2.writeList(arrayList);
        return true;
    }
}
