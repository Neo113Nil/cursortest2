package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Objects;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2767Rq extends AbstractBinderC3186f8 implements InterfaceC2601Id {

    /* renamed from: n, reason: collision with root package name */
    public final C3598mq f27427n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2529Dq f27428u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2767Rq(C2529Dq c2529Dq, C3598mq c3598mq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        Objects.requireNonNull(c2529Dq);
        this.f27428u = c2529Dq;
        this.f27427n = c3598mq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3962td c3908sd;
        C3598mq c3598mq = this.f27427n;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c3908sd = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                c3908sd = queryLocalInterface instanceof InterfaceC3962td ? (InterfaceC3962td) queryLocalInterface : new C3908sd(readStrongBinder);
            }
            AbstractC3241g8.f(parcel);
            this.f27428u.f24574d = c3908sd;
            ((BinderC2597Hq) c3598mq.f32762c).h();
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            ((BinderC2597Hq) c3598mq.f32762c).A3(0, readString);
        } else {
            if (i != 3) {
                return false;
            }
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            a(c4927z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2601Id
    public final void a(C4927z0 c4927z0) {
        ((BinderC2597Hq) this.f27427n.f32762c).d3(c4927z0);
    }
}
