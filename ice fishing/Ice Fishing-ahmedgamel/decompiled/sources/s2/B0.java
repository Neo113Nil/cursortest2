package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* loaded from: classes.dex */
public final class B0 extends AbstractC0549a implements C0 {
    public B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks", 1);
    }

    @Override // s2.C0
    public final void d() {
        d1(F0(), 1);
    }

    @Override // s2.C0
    public final void e() {
        d1(F0(), 2);
    }

    @Override // s2.C0
    public final void g() {
        d1(F0(), 4);
    }

    @Override // s2.C0
    public final void h() {
        d1(F0(), 3);
    }

    @Override // s2.C0
    public final void y2(boolean z6) {
        Parcel F02 = F0();
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        F02.writeInt(z6 ? 1 : 0);
        d1(F02, 5);
    }
}
