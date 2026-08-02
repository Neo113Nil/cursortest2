package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.InterfaceC3595md;

/* loaded from: classes.dex */
public final class L extends AbstractC0549a {
    public L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 1);
    }

    public final IBinder r1(Y2.b bVar, f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, bVar);
        AbstractC3411j8.c(F02, f1Var);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        F02.writeInt(i);
        Parcel K02 = K0(F02, 2);
        IBinder readStrongBinder = K02.readStrongBinder();
        K02.recycle();
        return readStrongBinder;
    }
}
