package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4910q0 extends Z2.a implements InterfaceC4911r0 {
    public C4910q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 2);
    }

    @Override // q2.InterfaceC4911r0
    public final boolean f() {
        Parcel D02 = D0(A0(), 2);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // q2.InterfaceC4911r0
    public final void v1(h1 h1Var) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, h1Var);
        G0(A02, 1);
    }
}
