package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.BinderC3464kd;

/* renamed from: q2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4910u0 extends AbstractC0432a {
    public final InterfaceC4908t0 t1(W2.b bVar, BinderC3464kd binderC3464kd) {
        InterfaceC4908t0 c4906s0;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, bVar);
        AbstractC3388j8.e(H02, binderC3464kd);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 1);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4906s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4906s0 = queryLocalInterface instanceof InterfaceC4908t0 ? (InterfaceC4908t0) queryLocalInterface : new C4906s0(readStrongBinder);
        }
        M02.recycle();
        return c4906s0;
    }
}
