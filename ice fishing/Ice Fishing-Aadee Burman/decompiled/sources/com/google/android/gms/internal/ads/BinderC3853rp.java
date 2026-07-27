package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3853rp extends AbstractBinderC2671Me {

    /* renamed from: n, reason: collision with root package name */
    public final C3467kg f33750n;

    /* renamed from: u, reason: collision with root package name */
    public final C2739Qe f33751u;

    public BinderC3853rp(C3467kg c3467kg, C2739Qe c2739Qe) {
        this.f33750n = c3467kg;
        this.f33751u = c2739Qe;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void G1(ParcelFileDescriptor parcelFileDescriptor, C2739Qe c2739Qe) {
        this.f33750n.b(new C4285zp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2739Qe));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void H2(ParcelFileDescriptor parcelFileDescriptor) {
        this.f33750n.b(new C4285zp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f33751u));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void P0(u2.m mVar) {
        mVar.getClass();
        this.f33750n.c(new u2.l(mVar.f41294n, mVar.f41295u));
    }
}
