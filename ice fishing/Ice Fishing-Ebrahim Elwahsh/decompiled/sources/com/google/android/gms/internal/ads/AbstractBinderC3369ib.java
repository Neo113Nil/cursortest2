package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ib, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3369ib extends AbstractBinderC3186f8 implements InterfaceC3421jb {
    public static InterfaceC3421jb G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof InterfaceC3421jb ? (InterfaceC3421jb) queryLocalInterface : new C3315hb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((BinderC2989bb) this).f29513n);
            return true;
        }
        if (i != 3) {
            return false;
        }
        ArrayList arrayList = ((BinderC2989bb) this).f29515v;
        parcel2.writeNoException();
        parcel2.writeList(arrayList);
        return true;
    }
}
