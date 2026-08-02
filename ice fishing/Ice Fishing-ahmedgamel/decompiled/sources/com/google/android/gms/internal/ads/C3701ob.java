package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3701ob extends AbstractC0549a implements InterfaceC3755pb {
    public C3701ob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final float g() {
        Parcel K02 = K0(F0(), 5);
        float readFloat = K02.readFloat();
        K02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final Y2.a h() {
        return Wv.e(K0(F0(), 4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final s2.A0 j() {
        Parcel K02 = K0(F0(), 7);
        s2.A0 U32 = AbstractBinderC4967y0.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final boolean k() {
        Parcel K02 = K0(F0(), 8);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }
}
