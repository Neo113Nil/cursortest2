package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.BinderC3487kd;

/* renamed from: s2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4959u0 extends AbstractC0549a {
    public final InterfaceC4957t0 r1(Y2.b bVar, BinderC3487kd binderC3487kd) {
        InterfaceC4957t0 c4955s0;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, bVar);
        AbstractC3411j8.e(F02, binderC3487kd);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 1);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4955s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4955s0 = queryLocalInterface instanceof InterfaceC4957t0 ? (InterfaceC4957t0) queryLocalInterface : new C4955s0(readStrongBinder);
        }
        K02.recycle();
        return c4955s0;
    }
}
