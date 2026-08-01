package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4916x0 extends AbstractC0432a implements A0 {
    public C4916x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 2);
    }

    @Override // q2.A0
    public final void e2(C0 c02) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, c02);
        f1(H02, 8);
    }

    @Override // q2.A0
    public final float j() {
        throw null;
    }

    @Override // q2.A0
    public final float k() {
        throw null;
    }

    @Override // q2.A0
    public final void l0(boolean z3) {
        Parcel H02 = H0();
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        H02.writeInt(z3 ? 1 : 0);
        f1(H02, 3);
    }

    @Override // q2.A0
    public final float q() {
        throw null;
    }

    @Override // q2.A0
    public final C0 s() {
        C0 b02;
        Parcel M02 = M0(H0(), 11);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            b02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            b02 = queryLocalInterface instanceof C0 ? (C0) queryLocalInterface : new B0(readStrongBinder);
        }
        M02.recycle();
        return b02;
    }
}
