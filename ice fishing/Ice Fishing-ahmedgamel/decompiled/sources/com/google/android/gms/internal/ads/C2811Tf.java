package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2811Tf extends AbstractC0549a implements InterfaceC2845Vf {
    public final InterfaceC2794Sf r1(Y2.b bVar, BinderC3487kd binderC3487kd) {
        InterfaceC2794Sf c2760Qf;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, bVar);
        AbstractC3411j8.e(F02, binderC3487kd);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 2);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c2760Qf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2760Qf = queryLocalInterface instanceof InterfaceC2794Sf ? (InterfaceC2794Sf) queryLocalInterface : new C2760Qf(readStrongBinder);
        }
        K02.recycle();
        return c2760Qf;
    }
}
