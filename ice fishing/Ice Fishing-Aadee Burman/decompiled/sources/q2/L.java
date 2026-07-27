package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.InterfaceC3572md;

/* loaded from: classes.dex */
public final class L extends AbstractC0432a {
    public L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 2);
    }

    public final IBinder t1(W2.b bVar, f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, bVar);
        AbstractC3388j8.c(H02, f1Var);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        H02.writeInt(i);
        Parcel M02 = M0(H02, 2);
        IBinder readStrongBinder = M02.readStrongBinder();
        M02.recycle();
        return readStrongBinder;
    }
}
