package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4918v extends Z2.a implements InterfaceC4922x {
    public C4918v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 2);
    }

    @Override // q2.InterfaceC4922x
    public final void D(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 2);
    }

    @Override // q2.InterfaceC4922x
    public final void c() {
        G0(A0(), 3);
    }

    @Override // q2.InterfaceC4922x
    public final void e() {
        G0(A0(), 5);
    }

    @Override // q2.InterfaceC4922x
    public final void f() {
        G0(A0(), 4);
    }

    @Override // q2.InterfaceC4922x
    public final void g() {
        G0(A0(), 6);
    }

    @Override // q2.InterfaceC4922x
    public final void h() {
        G0(A0(), 7);
    }

    @Override // q2.InterfaceC4922x
    public final void h0(C4927z0 c4927z0) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c4927z0);
        G0(A02, 8);
    }

    @Override // q2.InterfaceC4922x
    public final void l() {
        G0(A0(), 9);
    }

    @Override // q2.InterfaceC4922x
    public final void z() {
        G0(A0(), 1);
    }
}
