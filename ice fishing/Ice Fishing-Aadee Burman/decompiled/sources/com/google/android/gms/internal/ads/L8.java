package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class L8 extends AbstractBinderC3336i8 implements R8 {

    /* renamed from: n, reason: collision with root package name */
    public k2.m f26067n;

    @Override // com.google.android.gms.internal.ads.R8
    public final void A() {
        k2.m mVar = this.f26067n;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.R8
    public final void F() {
        k2.m mVar = this.f26067n;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.R8
    public final void M2(C4920z0 c4920z0) {
        k2.m mVar = this.f26067n;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c4920z0.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            A();
        } else if (i == 2) {
            F();
        } else if (i == 3) {
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            M2(c4920z0);
        } else if (i == 4) {
            d();
        } else {
            if (i != 5) {
                return false;
            }
            e();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.R8
    public final void d() {
        k2.m mVar = this.f26067n;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.R8
    public final void e() {
        k2.m mVar = this.f26067n;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }
}
