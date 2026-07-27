package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3108dx {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3216fx f29861a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29862b = true;

    public C3108dx(InterfaceC3216fx interfaceC3216fx) {
        this.f29861a = interfaceC3216fx;
    }

    public static C3108dx a(Context context, String str) {
        InterfaceC3216fx c3162ex;
        try {
            try {
                try {
                    IBinder b9 = X2.c.c(context, X2.c.f3774b).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b9 == null) {
                        c3162ex = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c3162ex = queryLocalInterface instanceof InterfaceC3216fx ? (InterfaceC3216fx) queryLocalInterface : new C3162ex(b9, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 2);
                    }
                    c3162ex.a2(new W2.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new C3108dx(c3162ex);
                } catch (Exception e9) {
                    throw new Ow(e9);
                }
            } catch (RemoteException | Ow | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new C3108dx(new BinderC3270gx());
            }
        } catch (Exception e10) {
            throw new Ow(e10);
        }
    }
}
