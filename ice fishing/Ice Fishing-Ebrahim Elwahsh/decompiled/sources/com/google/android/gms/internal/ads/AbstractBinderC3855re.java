package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3855re extends AbstractBinderC3186f8 implements InterfaceC3909se {
    public static InterfaceC3909se G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof InterfaceC3909se ? (InterfaceC3909se) queryLocalInterface : new C3802qe(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 2);
    }
}
