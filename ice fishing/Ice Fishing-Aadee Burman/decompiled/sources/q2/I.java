package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.P8;
import com.icefishing.icefishinglive2.AbstractC4404f;

/* loaded from: classes.dex */
public final class I extends AbstractC0432a implements K {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 2);
    }

    @Override // q2.K
    public final void A() {
        f1(H0(), 2);
    }

    @Override // q2.K
    public final void A0(long j6) {
        Parcel H02 = H0();
        H02.writeLong(j6);
        f1(H02, 48);
    }

    @Override // q2.K
    public final void B3(InterfaceC4909u interfaceC4909u) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4909u);
        f1(H02, 20);
    }

    @Override // q2.K
    public final InterfaceC4914w0 C() {
        InterfaceC4914w0 c4912v0;
        Parcel M02 = M0(H0(), 41);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4912v0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c4912v0 = queryLocalInterface instanceof InterfaceC4914w0 ? (InterfaceC4914w0) queryLocalInterface : new C4912v0(readStrongBinder);
        }
        M02.recycle();
        return c4912v0;
    }

    @Override // q2.K
    public final void C1(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 44);
    }

    @Override // q2.K
    public final String N() {
        Parcel M02 = M0(H0(), 31);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // q2.K
    public final void P3(P8 p82) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, p82);
        f1(H02, 40);
    }

    @Override // q2.K
    public final void U0(Z0 z02) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, z02);
        f1(H02, 29);
    }

    @Override // q2.K
    public final void U1(f1 f1Var) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, f1Var);
        f1(H02, 13);
    }

    @Override // q2.K
    public final A0 V() {
        A0 c4916x0;
        Parcel M02 = M0(H0(), 26);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4916x0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c4916x0 = queryLocalInterface instanceof A0 ? (A0) queryLocalInterface : new C4916x0(readStrongBinder);
        }
        M02.recycle();
        return c4916x0;
    }

    @Override // q2.K
    public final void X0(InterfaceC4871a0 interfaceC4871a0) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4871a0);
        f1(H02, 45);
    }

    @Override // q2.K
    public final void Z2(InterfaceC4915x interfaceC4915x) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4915x);
        f1(H02, 7);
    }

    @Override // q2.K
    public final W2.a c() {
        return AbstractC4404f.c(M0(H0(), 1));
    }

    @Override // q2.K
    public final void d() {
        f1(H0(), 5);
    }

    @Override // q2.K
    public final boolean d3(c1 c1Var) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c1Var);
        Parcel M02 = M0(H02, 4);
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // q2.K
    public final void e() {
        f1(H0(), 6);
    }

    @Override // q2.K
    public final long f0() {
        Parcel M02 = M0(H0(), 47);
        long readLong = M02.readLong();
        M02.recycle();
        return readLong;
    }

    @Override // q2.K
    public final void f2(boolean z3) {
        Parcel H02 = H0();
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        H02.writeInt(z3 ? 1 : 0);
        f1(H02, 22);
    }

    @Override // q2.K
    public final void m2(c1 c1Var, InterfaceC4868A interfaceC4868A) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c1Var);
        AbstractC3388j8.e(H02, interfaceC4868A);
        f1(H02, 43);
    }

    @Override // q2.K
    public final void o0(boolean z3) {
        Parcel H02 = H0();
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        H02.writeInt(z3 ? 1 : 0);
        f1(H02, 34);
    }

    @Override // q2.K
    public final f1 q() {
        Parcel M02 = M0(H0(), 12);
        f1 f1Var = (f1) AbstractC3388j8.b(M02, f1.CREATOR);
        M02.recycle();
        return f1Var;
    }

    @Override // q2.K
    public final void s0(InterfaceC4904r0 interfaceC4904r0) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4904r0);
        f1(H02, 42);
    }

    @Override // q2.K
    public final boolean u() {
        Parcel M02 = M0(H0(), 46);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // q2.K
    public final void x1(V v9) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, v9);
        f1(H02, 8);
    }
}
