package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3328he extends AbstractC0549a implements InterfaceC3434je {
    public final InterfaceC3274ge r1(Y2.b bVar, BinderC3487kd binderC3487kd) {
        InterfaceC3274ge c3220fe;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, bVar);
        AbstractC3411j8.e(F02, binderC3487kd);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 1);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c3220fe = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3220fe = queryLocalInterface instanceof InterfaceC3274ge ? (InterfaceC3274ge) queryLocalInterface : new C3220fe(readStrongBinder);
        }
        K02.recycle();
        return c3220fe;
    }
}
