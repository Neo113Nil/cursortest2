package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2790Tf extends AbstractC0432a implements InterfaceC2822Vf {
    public final InterfaceC2774Sf t1(W2.b bVar, BinderC3464kd binderC3464kd) {
        InterfaceC2774Sf c2740Qf;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, bVar);
        AbstractC3388j8.e(H02, binderC3464kd);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 2);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c2740Qf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2740Qf = queryLocalInterface instanceof InterfaceC2774Sf ? (InterfaceC2774Sf) queryLocalInterface : new C2740Qf(readStrongBinder);
        }
        M02.recycle();
        return c2740Qf;
    }
}
