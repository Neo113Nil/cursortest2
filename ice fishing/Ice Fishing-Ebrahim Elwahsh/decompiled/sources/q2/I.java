package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.ads.M8;

/* loaded from: classes.dex */
public final class I extends Z2.a implements K {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 2);
    }

    @Override // q2.K
    public final A0 B() {
        A0 c4923x0;
        Parcel D02 = D0(A0(), 26);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c4923x0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c4923x0 = queryLocalInterface instanceof A0 ? (A0) queryLocalInterface : new C4923x0(readStrongBinder);
        }
        D02.recycle();
        return c4923x0;
    }

    @Override // q2.K
    public final void B0(InterfaceC4878a0 interfaceC4878a0) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4878a0);
        G0(A02, 45);
    }

    @Override // q2.K
    public final void C2(d1 d1Var, InterfaceC4873A interfaceC4873A) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, d1Var);
        AbstractC3241g8.e(A02, interfaceC4873A);
        G0(A02, 43);
    }

    @Override // q2.K
    public final void D1(g1 g1Var) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, g1Var);
        G0(A02, 13);
    }

    @Override // q2.K
    public final boolean L() {
        Parcel D02 = D0(A0(), 46);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // q2.K
    public final InterfaceC4921w0 M() {
        InterfaceC4921w0 c4919v0;
        Parcel D02 = D0(A0(), 41);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c4919v0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c4919v0 = queryLocalInterface instanceof InterfaceC4921w0 ? (InterfaceC4921w0) queryLocalInterface : new C4919v0(readStrongBinder);
        }
        D02.recycle();
        return c4919v0;
    }

    @Override // q2.K
    public final void P0(long j9) {
        Parcel A02 = A0();
        A02.writeLong(j9);
        G0(A02, 48);
    }

    @Override // q2.K
    public final void Q0(boolean z8) {
        Parcel A02 = A0();
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        A02.writeInt(z8 ? 1 : 0);
        G0(A02, 34);
    }

    @Override // q2.K
    public final void T2(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 44);
    }

    @Override // q2.K
    public final void W1(M8 m8) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, m8);
        G0(A02, 40);
    }

    @Override // q2.K
    public final void X2(InterfaceC4916u interfaceC4916u) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4916u);
        G0(A02, 20);
    }

    @Override // q2.K
    public final long Z() {
        Parcel D02 = D0(A0(), 47);
        long readLong = D02.readLong();
        D02.recycle();
        return readLong;
    }

    @Override // q2.K
    public final V2.a d() {
        return CL.f(D0(A0(), 1));
    }

    @Override // q2.K
    public final void e() {
        G0(A0(), 6);
    }

    @Override // q2.K
    public final void f() {
        G0(A0(), 5);
    }

    @Override // q2.K
    public final boolean f0(d1 d1Var) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, d1Var);
        Parcel D02 = D0(A02, 4);
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // q2.K
    public final g1 p() {
        Parcel D02 = D0(A0(), 12);
        g1 g1Var = (g1) AbstractC3241g8.b(D02, g1.CREATOR);
        D02.recycle();
        return g1Var;
    }

    @Override // q2.K
    public final void p3(InterfaceC4911r0 interfaceC4911r0) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4911r0);
        G0(A02, 42);
    }

    @Override // q2.K
    public final void r0(InterfaceC4922x interfaceC4922x) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4922x);
        G0(A02, 7);
    }

    @Override // q2.K
    public final String u() {
        Parcel D02 = D0(A0(), 31);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // q2.K
    public final void u2(boolean z8) {
        Parcel A02 = A0();
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        A02.writeInt(z8 ? 1 : 0);
        G0(A02, 22);
    }

    @Override // q2.K
    public final void w1(V v6) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, v6);
        G0(A02, 8);
    }

    @Override // q2.K
    public final void x() {
        G0(A0(), 2);
    }

    @Override // q2.K
    public final void x0(a1 a1Var) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, a1Var);
        G0(A02, 29);
    }
}
