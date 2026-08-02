package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.we, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4135we extends AbstractBinderC3359i8 implements InterfaceC4189xe {
    public static InterfaceC4189xe U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof InterfaceC4189xe ? (InterfaceC4189xe) queryLocalInterface : new C4081ve(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 1);
    }
}
