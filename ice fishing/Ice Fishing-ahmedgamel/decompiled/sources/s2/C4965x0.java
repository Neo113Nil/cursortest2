package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* renamed from: s2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4965x0 extends AbstractC0549a implements A0 {
    public C4965x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 1);
    }

    @Override // s2.A0
    public final void Y1(C0 c02) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, c02);
        d1(F02, 8);
    }

    @Override // s2.A0
    public final float j() {
        throw null;
    }

    @Override // s2.A0
    public final float k() {
        throw null;
    }

    @Override // s2.A0
    public final void l0(boolean z6) {
        Parcel F02 = F0();
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        F02.writeInt(z6 ? 1 : 0);
        d1(F02, 3);
    }

    @Override // s2.A0
    public final float q() {
        throw null;
    }

    @Override // s2.A0
    public final C0 s() {
        C0 b02;
        Parcel K02 = K0(F0(), 11);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            b02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            b02 = queryLocalInterface instanceof C0 ? (C0) queryLocalInterface : new B0(readStrongBinder);
        }
        K02.recycle();
        return b02;
    }
}
