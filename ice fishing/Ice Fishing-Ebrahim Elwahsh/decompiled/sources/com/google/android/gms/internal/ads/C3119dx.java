package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3119dx {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3229fx f30262a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30263b = true;

    public C3119dx(InterfaceC3229fx interfaceC3229fx) {
        this.f30262a = interfaceC3229fx;
    }

    public static C3119dx a(Context context, String str) {
        InterfaceC3229fx c3174ex;
        try {
            try {
                try {
                    IBinder b9 = W2.c.c(context, W2.c.f3426b).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b9 == null) {
                        c3174ex = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c3174ex = queryLocalInterface instanceof InterfaceC3229fx ? (InterfaceC3229fx) queryLocalInterface : new C3174ex(b9, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 2);
                    }
                    c3174ex.v3(new V2.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new C3119dx(c3174ex);
                } catch (RemoteException | Pw | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new C3119dx(new BinderC3283gx());
                }
            } catch (Exception e6) {
                throw new Pw(e6);
            }
        } catch (Exception e9) {
            throw new Pw(e9);
        }
    }
}
