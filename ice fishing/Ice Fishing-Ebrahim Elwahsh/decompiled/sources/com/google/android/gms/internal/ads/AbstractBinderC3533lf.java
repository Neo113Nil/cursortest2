package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3533lf extends AbstractBinderC3186f8 implements InterfaceC3587mf {
    public AbstractBinderC3533lf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            c();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            AbstractC3241g8.f(parcel);
            s(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            a(c4927z0);
        }
        parcel2.writeNoException();
        return true;
    }
}
