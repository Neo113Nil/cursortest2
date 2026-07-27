package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3425jf extends Z2.a {
    public final IBinder R0(V2.b bVar, String str, BinderC3317hd binderC3317hd) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, bVar);
        A02.writeString(str);
        AbstractC3241g8.e(A02, binderC3317hd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 1);
        IBinder readStrongBinder = D02.readStrongBinder();
        D02.recycle();
        return readStrongBinder;
    }
}
