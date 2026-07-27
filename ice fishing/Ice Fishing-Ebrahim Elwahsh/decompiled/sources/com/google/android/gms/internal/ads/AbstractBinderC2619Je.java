package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Je, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2619Je extends AbstractBinderC3186f8 implements InterfaceC2636Ke {
    public AbstractBinderC2619Je() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3241g8.b(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC3241g8.f(parcel);
            B2(parcelFileDescriptor);
        } else if (i == 2) {
            t2.n nVar = (t2.n) AbstractC3241g8.b(parcel, t2.n.CREATOR);
            AbstractC3241g8.f(parcel);
            J0(nVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC3241g8.b(parcel, ParcelFileDescriptor.CREATOR);
            C2687Ne c2687Ne = (C2687Ne) AbstractC3241g8.b(parcel, C2687Ne.CREATOR);
            AbstractC3241g8.f(parcel);
            m3(parcelFileDescriptor2, c2687Ne);
        }
        parcel2.writeNoException();
        return true;
    }
}
