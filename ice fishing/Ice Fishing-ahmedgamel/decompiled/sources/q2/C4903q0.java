package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4903q0 extends AbstractC0432a implements InterfaceC4904r0 {
    public C4903q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 2);
    }

    @Override // q2.InterfaceC4904r0
    public final boolean e() {
        Parcel M02 = M0(H0(), 2);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // q2.InterfaceC4904r0
    public final void p1(g1 g1Var) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, g1Var);
        f1(H02, 1);
    }
}
