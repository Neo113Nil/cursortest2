package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* renamed from: s2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4960v extends AbstractC0549a implements InterfaceC4964x {
    public C4960v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 1);
    }

    @Override // s2.InterfaceC4964x
    public final void M(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 8);
    }

    @Override // s2.InterfaceC4964x
    public final void d() {
        d1(F0(), 4);
    }

    @Override // s2.InterfaceC4964x
    public final void e() {
        d1(F0(), 5);
    }

    @Override // s2.InterfaceC4964x
    public final void g() {
        d1(F0(), 9);
    }

    @Override // s2.InterfaceC4964x
    public final void h() {
        d1(F0(), 6);
    }

    @Override // s2.InterfaceC4964x
    public final void n() {
        d1(F0(), 7);
    }

    @Override // s2.InterfaceC4964x
    public final void o() {
        d1(F0(), 3);
    }

    @Override // s2.InterfaceC4964x
    public final void t() {
        d1(F0(), 1);
    }

    @Override // s2.InterfaceC4964x
    public final void x(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 2);
    }
}
