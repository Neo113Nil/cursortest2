package q2;

import a3.AbstractC0432a;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.InterfaceC3572md;

/* renamed from: q2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4873b0 extends AbstractC0432a implements InterfaceC4877d0 {
    @Override // q2.InterfaceC4877d0
    public final InterfaceC3572md getAdapterCreator() {
        Parcel M02 = M0(H0(), 2);
        InterfaceC3572md U3 = BinderC3464kd.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // q2.InterfaceC4877d0
    public final M0 getLiteSdkVersion() {
        Parcel M02 = M0(H0(), 1);
        M0 m0 = (M0) AbstractC3388j8.b(M02, M0.CREATOR);
        M02.recycle();
        return m0;
    }
}
