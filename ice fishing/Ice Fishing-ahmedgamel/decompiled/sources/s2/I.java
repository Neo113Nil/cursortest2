package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.P8;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class I extends AbstractC0549a implements K {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 1);
    }

    @Override // s2.K
    public final void A() {
        d1(F0(), 2);
    }

    @Override // s2.K
    public final InterfaceC4963w0 C() {
        InterfaceC4963w0 c4961v0;
        Parcel K02 = K0(F0(), 41);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4961v0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c4961v0 = queryLocalInterface instanceof InterfaceC4963w0 ? (InterfaceC4963w0) queryLocalInterface : new C4961v0(readStrongBinder);
        }
        K02.recycle();
        return c4961v0;
    }

    @Override // s2.K
    public final boolean D3(c1 c1Var) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c1Var);
        Parcel K02 = K0(F02, 4);
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // s2.K
    public final void E3(InterfaceC4920a0 interfaceC4920a0) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4920a0);
        d1(F02, 45);
    }

    @Override // s2.K
    public final void F2(f1 f1Var) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, f1Var);
        d1(F02, 13);
    }

    @Override // s2.K
    public final void H1(InterfaceC4964x interfaceC4964x) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4964x);
        d1(F02, 7);
    }

    @Override // s2.K
    public final void I3(c1 c1Var, InterfaceC4917A interfaceC4917A) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c1Var);
        AbstractC3411j8.e(F02, interfaceC4917A);
        d1(F02, 43);
    }

    @Override // s2.K
    public final void M3(InterfaceC4953r0 interfaceC4953r0) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4953r0);
        d1(F02, 42);
    }

    @Override // s2.K
    public final String N() {
        Parcel K02 = K0(F0(), 31);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // s2.K
    public final void P3(P8 p82) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, p82);
        d1(F02, 40);
    }

    @Override // s2.K
    public final A0 V() {
        A0 c4965x0;
        Parcel K02 = K0(F0(), 26);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4965x0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c4965x0 = queryLocalInterface instanceof A0 ? (A0) queryLocalInterface : new C4965x0(readStrongBinder);
        }
        K02.recycle();
        return c4965x0;
    }

    @Override // s2.K
    public final Y2.a c() {
        return Wv.e(K0(F0(), 1));
    }

    @Override // s2.K
    public final void c2(boolean z6) {
        Parcel F02 = F0();
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        F02.writeInt(z6 ? 1 : 0);
        d1(F02, 22);
    }

    @Override // s2.K
    public final void d() {
        d1(F0(), 5);
    }

    @Override // s2.K
    public final void e() {
        d1(F0(), 6);
    }

    @Override // s2.K
    public final long g0() {
        Parcel K02 = K0(F0(), 47);
        long readLong = K02.readLong();
        K02.recycle();
        return readLong;
    }

    @Override // s2.K
    public final void n0(boolean z6) {
        Parcel F02 = F0();
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        F02.writeInt(z6 ? 1 : 0);
        d1(F02, 34);
    }

    @Override // s2.K
    public final void o0(V v9) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, v9);
        d1(F02, 8);
    }

    @Override // s2.K
    public final void o2(Z0 z02) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, z02);
        d1(F02, 29);
    }

    @Override // s2.K
    public final void p3(InterfaceC4958u interfaceC4958u) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4958u);
        d1(F02, 20);
    }

    @Override // s2.K
    public final f1 q() {
        Parcel K02 = K0(F0(), 12);
        f1 f1Var = (f1) AbstractC3411j8.b(K02, f1.CREATOR);
        K02.recycle();
        return f1Var;
    }

    @Override // s2.K
    public final boolean u() {
        Parcel K02 = K0(F0(), 46);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // s2.K
    public final void w0(long j6) {
        Parcel F02 = F0();
        F02.writeLong(j6);
        d1(F02, 48);
    }

    @Override // s2.K
    public final void x0(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 44);
    }
}
