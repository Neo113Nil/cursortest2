package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.icefishingapp.icefishing.AbstractC4404f;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3678ob extends AbstractC0432a implements InterfaceC3732pb {
    public C3678ob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final float g() {
        Parcel M02 = M0(H0(), 5);
        float readFloat = M02.readFloat();
        M02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final W2.a h() {
        return AbstractC4404f.c(M0(H0(), 4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final q2.A0 j() {
        Parcel M02 = M0(H0(), 7);
        q2.A0 U3 = AbstractBinderC4918y0.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final boolean k() {
        Parcel M02 = M0(H0(), 8);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }
}
