package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3131dx {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3239fx f30653a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30654b = true;

    public C3131dx(InterfaceC3239fx interfaceC3239fx) {
        this.f30653a = interfaceC3239fx;
    }

    public static C3131dx a(Context context, String str) {
        InterfaceC3239fx c3185ex;
        try {
            try {
                try {
                    IBinder b9 = Z2.b.c(context, Z2.b.f4122b).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b9 == null) {
                        c3185ex = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c3185ex = queryLocalInterface instanceof InterfaceC3239fx ? (InterfaceC3239fx) queryLocalInterface : new C3185ex(b9, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 1);
                    }
                    c3185ex.T1(new Y2.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new C3131dx(c3185ex);
                } catch (Exception e9) {
                    throw new Ow(e9);
                }
            } catch (RemoteException | Ow | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new C3131dx(new BinderC3293gx());
            }
        } catch (Exception e10) {
            throw new Ow(e10);
        }
    }
}
