package s2;

import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.InterfaceC3595md;

/* renamed from: s2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4922b0 extends AbstractC0549a implements InterfaceC4926d0 {
    @Override // s2.InterfaceC4926d0
    public final InterfaceC3595md getAdapterCreator() {
        Parcel K02 = K0(F0(), 2);
        InterfaceC3595md U32 = BinderC3487kd.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // s2.InterfaceC4926d0
    public final M0 getLiteSdkVersion() {
        Parcel K02 = K0(F0(), 1);
        M0 m0 = (M0) AbstractC3411j8.b(K02, M0.CREATOR);
        K02.recycle();
        return m0;
    }
}
