package com.google.android.gms.internal.ads;

import android.os.Parcel;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class L8 extends AbstractBinderC3359i8 implements R8 {

    /* renamed from: n, reason: collision with root package name */
    public m2.m f26867n;

    @Override // com.google.android.gms.internal.ads.R8
    public final void A() {
        m2.m mVar = this.f26867n;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.R8
    public final void F() {
        m2.m mVar = this.f26867n;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            A();
        } else if (i == 2) {
            F();
        } else if (i == 3) {
            C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
            AbstractC3411j8.f(parcel);
            n3(c4969z0);
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
        m2.m mVar = this.f26867n;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.R8
    public final void e() {
        m2.m mVar = this.f26867n;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.R8
    public final void n3(C4969z0 c4969z0) {
        m2.m mVar = this.f26867n;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c4969z0.a());
        }
    }
}
