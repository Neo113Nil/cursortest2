package com.google.android.gms.internal.ads;

import android.os.Parcel;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3759pf extends AbstractBinderC3359i8 implements InterfaceC3813qf {
    public AbstractBinderC3759pf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            d();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            AbstractC3411j8.f(parcel);
            v(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
            AbstractC3411j8.f(parcel);
            a(c4969z0);
        }
        parcel2.writeNoException();
        return true;
    }
}
