package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3876rp extends AbstractBinderC2691Me {

    /* renamed from: n, reason: collision with root package name */
    public final C3490kg f34518n;

    /* renamed from: u, reason: collision with root package name */
    public final C2759Qe f34519u;

    public BinderC3876rp(C3490kg c3490kg, C2759Qe c2759Qe) {
        this.f34518n = c3490kg;
        this.f34519u = c2759Qe;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void A1(ParcelFileDescriptor parcelFileDescriptor, C2759Qe c2759Qe) {
        this.f34518n.b(new C4308zp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2759Qe));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void E2(ParcelFileDescriptor parcelFileDescriptor) {
        this.f34518n.b(new C4308zp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f34519u));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void h2(w2.m mVar) {
        mVar.getClass();
        this.f34518n.c(new w2.l(mVar.f41687n, mVar.f41688u));
    }
}
