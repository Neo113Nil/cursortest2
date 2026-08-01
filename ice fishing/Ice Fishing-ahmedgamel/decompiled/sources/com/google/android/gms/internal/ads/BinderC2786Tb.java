package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Tb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2786Tb extends AbstractBinderC3336i8 implements InterfaceC2617Jb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3481ku f27741n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2786Tb(C3481ku c3481ku) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f27741n = c3481ku;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2515Db c2498Cb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c2498Cb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c2498Cb = queryLocalInterface instanceof InterfaceC2515Db ? (InterfaceC2515Db) queryLocalInterface : new C2498Cb(readStrongBinder);
        }
        AbstractC3388j8.f(parcel);
        n2(c2498Cb);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2617Jb
    public final void n2(InterfaceC2515Db interfaceC2515Db) {
        Qx qx;
        String str;
        C3481ku c3481ku = this.f27741n;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) c3481ku.f31663u;
        synchronized (c3481ku) {
            qx = (Qx) c3481ku.f31665w;
            if (qx == null) {
                qx = new Qx(interfaceC2515Db);
                c3481ku.f31665w = qx;
            }
        }
        C4274ze c4274ze = (C4274ze) ((x2.m) eVar.f23550v);
        c4274ze.getClass();
        P2.w.d("#008 Must be called on the main UI thread.");
        try {
            str = ((InterfaceC2515Db) qx.f27139u).g();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            str = null;
        }
        v2.i.a("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        c4274ze.f35362w = qx;
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).j();
        } catch (RemoteException e10) {
            v2.i.i("#007 Could not call remote method.", e10);
        }
    }
}
