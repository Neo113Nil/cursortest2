package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3628nf extends AbstractC0432a {
    public final IBinder t1(W2.b bVar, String str, BinderC3464kd binderC3464kd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, bVar);
        H02.writeString(str);
        AbstractC3388j8.e(H02, binderC3464kd);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 1);
        IBinder readStrongBinder = M02.readStrongBinder();
        M02.recycle();
        return readStrongBinder;
    }
}
