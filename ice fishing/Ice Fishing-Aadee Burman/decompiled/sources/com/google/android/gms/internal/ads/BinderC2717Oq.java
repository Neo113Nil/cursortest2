package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Objects;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2717Oq extends AbstractBinderC3336i8 implements InterfaceC2653Ld {

    /* renamed from: n, reason: collision with root package name */
    public final C3477kq f26661n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2479Aq f26662u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2717Oq(C2479Aq c2479Aq, C3477kq c3477kq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        Objects.requireNonNull(c2479Aq);
        this.f26662u = c2479Aq;
        this.f26661n = c3477kq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4111wd c4057vd;
        C3477kq c3477kq = this.f26661n;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c4057vd = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                c4057vd = queryLocalInterface instanceof InterfaceC4111wd ? (InterfaceC4111wd) queryLocalInterface : new C4057vd(readStrongBinder);
            }
            AbstractC3388j8.f(parcel);
            this.f26662u.f23754d = c4057vd;
            ((BinderC2564Fq) c3477kq.f31640c).j();
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            ((BinderC2564Fq) c3477kq.f31640c).O3(0, readString);
        } else {
            if (i != 3) {
                return false;
            }
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            a(c4920z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2653Ld
    public final void a(C4920z0 c4920z0) {
        ((BinderC2564Fq) this.f26661n.f31640c).n3(c4920z0);
    }
}
