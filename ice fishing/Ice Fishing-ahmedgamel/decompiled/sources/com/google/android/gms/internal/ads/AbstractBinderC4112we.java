package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.we, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4112we extends AbstractBinderC3336i8 implements InterfaceC4166xe {
    public static InterfaceC4166xe U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof InterfaceC4166xe ? (InterfaceC4166xe) queryLocalInterface : new C4058ve(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 2);
    }
}
