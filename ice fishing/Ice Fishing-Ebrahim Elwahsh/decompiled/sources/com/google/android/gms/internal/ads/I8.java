package com.google.android.gms.internal.ads;

import android.os.Parcel;
import k2.AbstractC4642m;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final class I8 extends AbstractBinderC3186f8 implements O8 {

    /* renamed from: n, reason: collision with root package name */
    public AbstractC4642m f25531n;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            x();
        } else if (i == 2) {
            o();
        } else if (i == 3) {
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            c0(c4927z0);
        } else if (i == 4) {
            f();
        } else {
            if (i != 5) {
                return false;
            }
            e();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.O8
    public final void c0(C4927z0 c4927z0) {
        AbstractC4642m abstractC4642m = this.f25531n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdFailedToShowFullScreenContent(c4927z0.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.O8
    public final void e() {
        AbstractC4642m abstractC4642m = this.f25531n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.O8
    public final void f() {
        AbstractC4642m abstractC4642m = this.f25531n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.O8
    public final void o() {
        AbstractC4642m abstractC4642m = this.f25531n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.O8
    public final void x() {
        AbstractC4642m abstractC4642m = this.f25531n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdShowedFullScreenContent();
        }
    }
}
