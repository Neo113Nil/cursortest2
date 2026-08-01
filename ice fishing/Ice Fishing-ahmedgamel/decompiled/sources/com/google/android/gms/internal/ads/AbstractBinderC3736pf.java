package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3736pf extends AbstractBinderC3336i8 implements InterfaceC3790qf {
    public AbstractBinderC3736pf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            d();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            AbstractC3388j8.f(parcel);
            v(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            a(c4920z0);
        }
        parcel2.writeNoException();
        return true;
    }
}
