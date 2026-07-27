package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4911v extends AbstractC0432a implements InterfaceC4915x {
    public C4911v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 2);
    }

    @Override // q2.InterfaceC4915x
    public final void G(C4920z0 c4920z0) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c4920z0);
        f1(H02, 8);
    }

    @Override // q2.InterfaceC4915x
    public final void d() {
        f1(H0(), 4);
    }

    @Override // q2.InterfaceC4915x
    public final void e() {
        f1(H0(), 5);
    }

    @Override // q2.InterfaceC4915x
    public final void g() {
        f1(H0(), 9);
    }

    @Override // q2.InterfaceC4915x
    public final void h() {
        f1(H0(), 6);
    }

    @Override // q2.InterfaceC4915x
    public final void n() {
        f1(H0(), 7);
    }

    @Override // q2.InterfaceC4915x
    public final void o() {
        f1(H0(), 3);
    }

    @Override // q2.InterfaceC4915x
    public final void t() {
        f1(H0(), 1);
    }

    @Override // q2.InterfaceC4915x
    public final void x(int i) {
        Parcel H02 = H0();
        H02.writeInt(i);
        f1(H02, 2);
    }
}
