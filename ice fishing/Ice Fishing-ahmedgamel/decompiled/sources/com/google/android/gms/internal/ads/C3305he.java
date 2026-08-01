package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3305he extends AbstractC0432a implements InterfaceC3411je {
    public final InterfaceC3251ge t1(W2.b bVar, BinderC3464kd binderC3464kd) {
        InterfaceC3251ge c3197fe;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, bVar);
        AbstractC3388j8.e(H02, binderC3464kd);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 1);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c3197fe = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3197fe = queryLocalInterface instanceof InterfaceC3251ge ? (InterfaceC3251ge) queryLocalInterface : new C3197fe(readStrongBinder);
        }
        M02.recycle();
        return c3197fe;
    }
}
