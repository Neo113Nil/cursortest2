package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.InterfaceC3423jd;

/* renamed from: q2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4880b0 extends Z2.a implements InterfaceC4884d0 {
    @Override // q2.InterfaceC4884d0
    public final InterfaceC3423jd getAdapterCreator() {
        Parcel D02 = D0(A0(), 2);
        InterfaceC3423jd G32 = BinderC3317hd.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // q2.InterfaceC4884d0
    public final M0 getLiteSdkVersion() {
        Parcel D02 = D0(A0(), 1);
        M0 m0 = (M0) AbstractC3241g8.b(D02, M0.CREATOR);
        D02.recycle();
        return m0;
    }
}
