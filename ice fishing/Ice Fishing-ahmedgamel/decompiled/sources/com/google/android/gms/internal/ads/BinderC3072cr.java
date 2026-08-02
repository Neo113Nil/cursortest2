package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.Objects;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.cr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3072cr extends AbstractBinderC3359i8 implements InterfaceC2707Nd {

    /* renamed from: n, reason: collision with root package name */
    public final C3500kq f30381n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3072cr(C4039uq c4039uq, C3500kq c3500kq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
        Objects.requireNonNull(c4039uq);
        this.f30381n = c3500kq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3500kq c3500kq = this.f30381n;
        if (i == 2) {
            ((BinderC2584Fq) c3500kq.f32422c).j();
        } else if (i == 3) {
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            ((BinderC2584Fq) c3500kq.f32422c).N3(0, readString);
        } else {
            if (i != 4) {
                return false;
            }
            C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
            AbstractC3411j8.f(parcel);
            a(c4969z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2707Nd
    public final void a(C4969z0 c4969z0) {
        ((BinderC2584Fq) this.f30381n.f32422c).r0(c4969z0);
    }
}
