package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* loaded from: classes.dex */
public final class B0 extends AbstractC0432a implements C0 {
    public B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks", 2);
    }

    @Override // q2.C0
    public final void C2(boolean z3) {
        Parcel H02 = H0();
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        H02.writeInt(z3 ? 1 : 0);
        f1(H02, 5);
    }

    @Override // q2.C0
    public final void d() {
        f1(H0(), 1);
    }

    @Override // q2.C0
    public final void e() {
        f1(H0(), 2);
    }

    @Override // q2.C0
    public final void g() {
        f1(H0(), 4);
    }

    @Override // q2.C0
    public final void h() {
        f1(H0(), 3);
    }
}
