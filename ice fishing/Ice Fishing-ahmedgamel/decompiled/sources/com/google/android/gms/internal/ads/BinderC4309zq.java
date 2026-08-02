package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import java.util.Objects;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.zq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4309zq extends AbstractBinderC3359i8 implements InterfaceC2605Hd {

    /* renamed from: n, reason: collision with root package name */
    public final C3500kq f36228n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2499Aq f36229u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4309zq(C2499Aq c2499Aq, C3500kq c3500kq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        Objects.requireNonNull(c2499Aq);
        this.f36229u = c2499Aq;
        this.f36228n = c3500kq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3918sd c3918sd;
        C2499Aq c2499Aq = this.f36229u;
        C3500kq c3500kq = this.f36228n;
        if (i == 1) {
            Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
            AbstractC3411j8.f(parcel);
            c2499Aq.f24526d = (View) Y2.b.D0(t02);
            ((BinderC2584Fq) c3500kq.f32422c).j();
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            ((BinderC2584Fq) c3500kq.f32422c).N3(0, readString);
        } else if (i == 3) {
            C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
            AbstractC3411j8.f(parcel);
            a(c4969z0);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c3918sd = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c3918sd = queryLocalInterface instanceof C3918sd ? (C3918sd) queryLocalInterface : new C3918sd(readStrongBinder);
            }
            AbstractC3411j8.f(parcel);
            c2499Aq.f24527e = c3918sd;
            ((BinderC2584Fq) c3500kq.f32422c).j();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2605Hd
    public final void a(C4969z0 c4969z0) {
        ((BinderC2584Fq) this.f36228n.f32422c).r0(c4969z0);
    }
}
