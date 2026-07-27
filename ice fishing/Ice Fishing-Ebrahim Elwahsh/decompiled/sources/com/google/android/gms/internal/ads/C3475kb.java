package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3475kb extends Z2.a implements InterfaceC3529lb {
    public C3475kb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final V2.a e() {
        return CL.f(D0(A0(), 4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final float g() {
        Parcel D02 = D0(A0(), 5);
        float readFloat = D02.readFloat();
        D02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final q2.A0 h() {
        Parcel D02 = D0(A0(), 7);
        q2.A0 G32 = AbstractBinderC4925y0.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final boolean j() {
        Parcel D02 = D0(A0(), 8);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }
}
