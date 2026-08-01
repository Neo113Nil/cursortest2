package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ld, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3518ld extends AbstractC0432a implements InterfaceC3572md {
    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final boolean B0(String str) {
        Parcel H02 = H0();
        H02.writeString(str);
        Parcel M02 = M0(H02, 4);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final InterfaceC2721Pd H(String str) {
        InterfaceC2721Pd c2704Od;
        Parcel H02 = H0();
        H02.writeString(str);
        Parcel M02 = M0(H02, 3);
        IBinder readStrongBinder = M02.readStrongBinder();
        int i = BinderC2788Td.f27744u;
        if (readStrongBinder == null) {
            c2704Od = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c2704Od = queryLocalInterface instanceof InterfaceC2721Pd ? (InterfaceC2721Pd) queryLocalInterface : new C2704Od(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 2);
        }
        M02.recycle();
        return c2704Od;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final InterfaceC3680od b(String str) {
        InterfaceC3680od c3626nd;
        Parcel H02 = H0();
        H02.writeString(str);
        Parcel M02 = M0(H02, 1);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c3626nd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c3626nd = queryLocalInterface instanceof InterfaceC3680od ? (InterfaceC3680od) queryLocalInterface : new C3626nd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 2);
        }
        M02.recycle();
        return c3626nd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final boolean z(String str) {
        Parcel H02 = H0();
        H02.writeString(str);
        Parcel M02 = M0(H02, 2);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }
}
