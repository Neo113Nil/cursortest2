package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3962tq extends AbstractBinderC3336i8 implements InterfaceC2551Fd {

    /* renamed from: n, reason: collision with root package name */
    public final C3477kq f34403n;

    public BinderC3962tq(C3477kq c3477kq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
        this.f34403n = c3477kq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3477kq c3477kq = this.f34403n;
        if (i == 2) {
            ((BinderC2564Fq) c3477kq.f31640c).j();
        } else if (i == 3) {
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            ((BinderC2564Fq) c3477kq.f31640c).O3(0, readString);
        } else {
            if (i != 4) {
                return false;
            }
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            a(c4920z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2551Fd
    public final void a(C4920z0 c4920z0) {
        ((BinderC2564Fq) this.f34403n.f31640c).n3(c4920z0);
    }
}
