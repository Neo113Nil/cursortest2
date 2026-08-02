package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* renamed from: s2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4952q0 extends AbstractC0549a implements InterfaceC4953r0 {
    public C4952q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 1);
    }

    @Override // s2.InterfaceC4953r0
    public final void R3(g1 g1Var) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, g1Var);
        d1(F02, 1);
    }

    @Override // s2.InterfaceC4953r0
    public final boolean e() {
        Parcel K02 = K0(F0(), 2);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }
}
