package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3651nf extends AbstractC0549a {
    public final IBinder r1(Y2.b bVar, String str, BinderC3487kd binderC3487kd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, bVar);
        F02.writeString(str);
        AbstractC3411j8.e(F02, binderC3487kd);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 1);
        IBinder readStrongBinder = K02.readStrongBinder();
        K02.recycle();
        return readStrongBinder;
    }
}
