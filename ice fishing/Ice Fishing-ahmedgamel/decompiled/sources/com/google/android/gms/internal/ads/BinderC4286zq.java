package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import java.util.Objects;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.zq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4286zq extends AbstractBinderC3336i8 implements InterfaceC2585Hd {

    /* renamed from: n, reason: collision with root package name */
    public final C3477kq f35459n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2479Aq f35460u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4286zq(C2479Aq c2479Aq, C3477kq c3477kq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        Objects.requireNonNull(c2479Aq);
        this.f35460u = c2479Aq;
        this.f35459n = c3477kq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3895sd c3895sd;
        C2479Aq c2479Aq = this.f35460u;
        C3477kq c3477kq = this.f35459n;
        if (i == 1) {
            W2.a w02 = W2.b.w0(parcel.readStrongBinder());
            AbstractC3388j8.f(parcel);
            c2479Aq.f23754d = (View) W2.b.F0(w02);
            ((BinderC2564Fq) c3477kq.f31640c).j();
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            ((BinderC2564Fq) c3477kq.f31640c).O3(0, readString);
        } else if (i == 3) {
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            a(c4920z0);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c3895sd = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c3895sd = queryLocalInterface instanceof C3895sd ? (C3895sd) queryLocalInterface : new C3895sd(readStrongBinder);
            }
            AbstractC3388j8.f(parcel);
            c2479Aq.f23755e = c3895sd;
            ((BinderC2564Fq) c3477kq.f31640c).j();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2585Hd
    public final void a(C4920z0 c4920z0) {
        ((BinderC2564Fq) this.f35459n.f31640c).n3(c4920z0);
    }
}
