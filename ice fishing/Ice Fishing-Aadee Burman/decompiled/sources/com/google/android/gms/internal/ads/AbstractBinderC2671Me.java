package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Me, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2671Me extends AbstractBinderC3336i8 implements InterfaceC2688Ne {
    public AbstractBinderC2671Me() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3388j8.b(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC3388j8.f(parcel);
            H2(parcelFileDescriptor);
        } else if (i == 2) {
            u2.m mVar = (u2.m) AbstractC3388j8.b(parcel, u2.m.CREATOR);
            AbstractC3388j8.f(parcel);
            P0(mVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC3388j8.b(parcel, ParcelFileDescriptor.CREATOR);
            C2739Qe c2739Qe = (C2739Qe) AbstractC3388j8.b(parcel, C2739Qe.CREATOR);
            AbstractC3388j8.f(parcel);
            G1(parcelFileDescriptor2, c2739Qe);
        }
        parcel2.writeNoException();
        return true;
    }
}
