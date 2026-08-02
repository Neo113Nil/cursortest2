package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3443jn extends AbstractBinderC3359i8 implements InterfaceC2621Ic {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC3411j8.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2621Ic
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2621Ic
    public final void v(int i) {
    }
}
