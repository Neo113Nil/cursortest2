package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3570mb extends AbstractBinderC3336i8 implements InterfaceC3624nb {
    public static InterfaceC3624nb U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof InterfaceC3624nb ? (InterfaceC3624nb) queryLocalInterface : new C3516lb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((BinderC3248gb) this).f30576n);
            return true;
        }
        if (i != 3) {
            return false;
        }
        ArrayList arrayList = ((BinderC3248gb) this).f30578v;
        parcel2.writeNoException();
        parcel2.writeList(arrayList);
        return true;
    }
}
