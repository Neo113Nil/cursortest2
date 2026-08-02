package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.ld, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3541ld extends AbstractC0549a implements InterfaceC3595md {
    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final InterfaceC2741Pd G(String str) {
        InterfaceC2741Pd c2724Od;
        Parcel F02 = F0();
        F02.writeString(str);
        Parcel K02 = K0(F02, 3);
        IBinder readStrongBinder = K02.readStrongBinder();
        int i = BinderC2809Td.f28531u;
        if (readStrongBinder == null) {
            c2724Od = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c2724Od = queryLocalInterface instanceof InterfaceC2741Pd ? (InterfaceC2741Pd) queryLocalInterface : new C2724Od(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 1);
        }
        K02.recycle();
        return c2724Od;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final InterfaceC3703od b(String str) {
        InterfaceC3703od c3649nd;
        Parcel F02 = F0();
        F02.writeString(str);
        Parcel K02 = K0(F02, 1);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c3649nd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c3649nd = queryLocalInterface instanceof InterfaceC3703od ? (InterfaceC3703od) queryLocalInterface : new C3649nd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 1);
        }
        K02.recycle();
        return c3649nd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final boolean y0(String str) {
        Parcel F02 = F0();
        F02.writeString(str);
        Parcel K02 = K0(F02, 4);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final boolean z(String str) {
        Parcel F02 = F0();
        F02.writeString(str);
        Parcel K02 = K0(F02, 2);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }
}
