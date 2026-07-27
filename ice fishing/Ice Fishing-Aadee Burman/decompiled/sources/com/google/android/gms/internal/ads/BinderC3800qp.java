package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3800qp extends AbstractBinderC2671Me {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC3907sp f33418n;

    public BinderC3800qp(AbstractC3907sp abstractC3907sp) {
        this.f33418n = abstractC3907sp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void G1(ParcelFileDescriptor parcelFileDescriptor, C2739Qe c2739Qe) {
        this.f33418n.f34146n.b(new C4285zp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2739Qe));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void H2(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC3907sp abstractC3907sp = this.f33418n;
        abstractC3907sp.f34146n.b(new C4285zp(autoCloseInputStream, abstractC3907sp.f34150x));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void P0(u2.m mVar) {
        C3467kg c3467kg = this.f33418n.f34146n;
        mVar.getClass();
        c3467kg.c(new u2.l(mVar.f41294n, mVar.f41295u));
    }
}
