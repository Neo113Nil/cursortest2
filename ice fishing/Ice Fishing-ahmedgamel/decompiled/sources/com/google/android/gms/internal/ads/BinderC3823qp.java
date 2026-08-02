package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3823qp extends AbstractBinderC2691Me {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC3930sp f34185n;

    public BinderC3823qp(AbstractC3930sp abstractC3930sp) {
        this.f34185n = abstractC3930sp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void A1(ParcelFileDescriptor parcelFileDescriptor, C2759Qe c2759Qe) {
        this.f34185n.f34932n.b(new C4308zp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2759Qe));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void E2(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC3930sp abstractC3930sp = this.f34185n;
        abstractC3930sp.f34932n.b(new C4308zp(autoCloseInputStream, abstractC3930sp.f34936x));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void h2(w2.m mVar) {
        C3490kg c3490kg = this.f34185n.f34932n;
        mVar.getClass();
        c3490kg.c(new w2.l(mVar.f41687n, mVar.f41688u));
    }
}
