package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* renamed from: s2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4954s extends AbstractBinderC3359i8 implements InterfaceC4920a0 {

    /* renamed from: n, reason: collision with root package name */
    public final m2.m f40511n;

    public BinderC4954s(m2.m mVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f40511n = mVar;
    }

    @Override // s2.InterfaceC4920a0
    public final void A() {
        m2.m mVar = this.f40511n;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    @Override // s2.InterfaceC4920a0
    public final void F() {
        m2.m mVar = this.f40511n;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
            AbstractC3411j8.f(parcel);
            U2(c4969z0);
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

    @Override // s2.InterfaceC4920a0
    public final void U2(C4969z0 c4969z0) {
        m2.m mVar = this.f40511n;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c4969z0.a());
        }
    }

    @Override // s2.InterfaceC4920a0
    public final void d() {
        m2.m mVar = this.f40511n;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // s2.InterfaceC4920a0
    public final void o() {
        m2.m mVar = this.f40511n;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }
}
