package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Objects;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2737Oq extends AbstractBinderC3359i8 implements InterfaceC2673Ld {

    /* renamed from: n, reason: collision with root package name */
    public final C3500kq f27444n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2499Aq f27445u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2737Oq(C2499Aq c2499Aq, C3500kq c3500kq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        Objects.requireNonNull(c2499Aq);
        this.f27445u = c2499Aq;
        this.f27444n = c3500kq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4134wd c4080vd;
        C3500kq c3500kq = this.f27444n;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c4080vd = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                c4080vd = queryLocalInterface instanceof InterfaceC4134wd ? (InterfaceC4134wd) queryLocalInterface : new C4080vd(readStrongBinder);
            }
            AbstractC3411j8.f(parcel);
            this.f27445u.f24526d = c4080vd;
            ((BinderC2584Fq) c3500kq.f32422c).j();
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            ((BinderC2584Fq) c3500kq.f32422c).N3(0, readString);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2673Ld
    public final void a(C4969z0 c4969z0) {
        ((BinderC2584Fq) this.f27444n.f32422c).r0(c4969z0);
    }
}
