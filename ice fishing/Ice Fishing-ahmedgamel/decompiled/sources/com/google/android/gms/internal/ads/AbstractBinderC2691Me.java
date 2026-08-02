package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Me, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2691Me extends AbstractBinderC3359i8 implements InterfaceC2708Ne {
    public AbstractBinderC2691Me() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3411j8.b(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC3411j8.f(parcel);
            E2(parcelFileDescriptor);
        } else if (i == 2) {
            w2.m mVar = (w2.m) AbstractC3411j8.b(parcel, w2.m.CREATOR);
            AbstractC3411j8.f(parcel);
            h2(mVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC3411j8.b(parcel, ParcelFileDescriptor.CREATOR);
            C2759Qe c2759Qe = (C2759Qe) AbstractC3411j8.b(parcel, C2759Qe.CREATOR);
            AbstractC3411j8.f(parcel);
            A1(parcelFileDescriptor2, c2759Qe);
        }
        parcel2.writeNoException();
        return true;
    }
}
