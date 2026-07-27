package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4905s extends AbstractBinderC3336i8 implements InterfaceC4871a0 {

    /* renamed from: n, reason: collision with root package name */
    public final k2.m f40209n;

    public BinderC4905s(k2.m mVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f40209n = mVar;
    }

    @Override // q2.InterfaceC4871a0
    public final void A() {
        k2.m mVar = this.f40209n;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    @Override // q2.InterfaceC4871a0
    public final void F() {
        k2.m mVar = this.f40209n;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            t0(c4920z0);
        } else if (i == 2) {
            A();
        } else if (i == 3) {
            F();
        } else if (i == 4) {
            o();
        } else {
            if (i != 5) {
                return false;
            }
            d();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.InterfaceC4871a0
    public final void d() {
        k2.m mVar = this.f40209n;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // q2.InterfaceC4871a0
    public final void o() {
        k2.m mVar = this.f40209n;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // q2.InterfaceC4871a0
    public final void t0(C4920z0 c4920z0) {
        k2.m mVar = this.f40209n;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c4920z0.a());
        }
    }
}
