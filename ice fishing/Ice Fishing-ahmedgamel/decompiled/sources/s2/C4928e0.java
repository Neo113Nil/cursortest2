package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.C4295zc;
import com.google.android.gms.internal.ads.InterfaceC2536Dc;
import com.google.android.gms.internal.ads.InterfaceC3595md;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4928e0 extends AbstractC0549a implements InterfaceC4932g0 {
    public C4928e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 1);
    }

    @Override // s2.InterfaceC4932g0
    public final void C() {
        d1(F0(), 15);
    }

    @Override // s2.InterfaceC4932g0
    public final void S3(InterfaceC2536Dc interfaceC2536Dc) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC2536Dc);
        d1(F02, 12);
    }

    @Override // s2.InterfaceC4932g0
    public final void U(String str) {
        Parcel F02 = F0();
        F02.writeString(str);
        d1(F02, 18);
    }

    @Override // s2.InterfaceC4932g0
    public final void W1(W0 w02) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, w02);
        d1(F02, 14);
    }

    @Override // s2.InterfaceC4932g0
    public final void Z(boolean z6) {
        Parcel F02 = F0();
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        F02.writeInt(z6 ? 1 : 0);
        d1(F02, 4);
    }

    @Override // s2.InterfaceC4932g0
    public final void a2(InterfaceC3595md interfaceC3595md) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC3595md);
        d1(F02, 11);
    }

    @Override // s2.InterfaceC4932g0
    public final void d() {
        d1(F0(), 1);
    }

    @Override // s2.InterfaceC4932g0
    public final void i3(Y2.a aVar, String str) {
        Parcel F02 = F0();
        F02.writeString(null);
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 6);
    }

    @Override // s2.InterfaceC4932g0
    public final List m() {
        Parcel K02 = K0(F0(), 13);
        ArrayList createTypedArrayList = K02.createTypedArrayList(C4295zc.CREATOR);
        K02.recycle();
        return createTypedArrayList;
    }

    @Override // s2.InterfaceC4932g0
    public final void q1() {
        d1(F0(), 19);
    }
}
