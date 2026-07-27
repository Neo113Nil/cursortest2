package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.in, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3380in extends AbstractBinderC3186f8 implements InterfaceC2515Dc {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC3241g8.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Dc
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Dc
    public final void s(int i) {
    }
}
