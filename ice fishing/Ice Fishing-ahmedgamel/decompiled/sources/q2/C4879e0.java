package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.C4272zc;
import com.google.android.gms.internal.ads.InterfaceC2516Dc;
import com.google.android.gms.internal.ads.InterfaceC3572md;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4879e0 extends AbstractC0432a implements InterfaceC4883g0 {
    public C4879e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 2);
    }

    @Override // q2.InterfaceC4883g0
    public final void C() {
        f1(H0(), 15);
    }

    @Override // q2.InterfaceC4883g0
    public final void S3(InterfaceC2516Dc interfaceC2516Dc) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC2516Dc);
        f1(H02, 12);
    }

    @Override // q2.InterfaceC4883g0
    public final void U(String str) {
        Parcel H02 = H0();
        H02.writeString(str);
        f1(H02, 18);
    }

    @Override // q2.InterfaceC4883g0
    public final void Z(boolean z3) {
        Parcel H02 = H0();
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        H02.writeInt(z3 ? 1 : 0);
        f1(H02, 4);
    }

    @Override // q2.InterfaceC4883g0
    public final void c2(InterfaceC3572md interfaceC3572md) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC3572md);
        f1(H02, 11);
    }

    @Override // q2.InterfaceC4883g0
    public final void d() {
        f1(H0(), 1);
    }

    @Override // q2.InterfaceC4883g0
    public final void i1(W2.a aVar, String str) {
        Parcel H02 = H0();
        H02.writeString(null);
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 6);
    }

    @Override // q2.InterfaceC4883g0
    public final void i2(W0 w02) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, w02);
        f1(H02, 14);
    }

    @Override // q2.InterfaceC4883g0
    public final List m() {
        Parcel M02 = M0(H0(), 13);
        ArrayList createTypedArrayList = M02.createTypedArrayList(C4272zc.CREATOR);
        M02.recycle();
        return createTypedArrayList;
    }

    @Override // q2.InterfaceC4883g0
    public final void r1() {
        f1(H0(), 19);
    }
}
