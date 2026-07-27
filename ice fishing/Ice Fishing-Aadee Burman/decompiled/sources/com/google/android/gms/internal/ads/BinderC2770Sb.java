package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2770Sb extends AbstractBinderC3336i8 implements InterfaceC2583Hb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3481ku f27487n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2770Sb(C3481ku c3481ku) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f27487n = c3481ku;
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
        String readString = parcel.readString();
        AbstractC3388j8.f(parcel);
        m3(c2498Cb, readString);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2583Hb
    public final void m3(InterfaceC2515Db interfaceC2515Db, String str) {
        Qx qx;
        C3481ku c3481ku = this.f27487n;
        if (((com.google.ads.mediation.e) c3481ku.f31664v) == null) {
            return;
        }
        synchronized (c3481ku) {
            qx = (Qx) c3481ku.f31665w;
            if (qx == null) {
                qx = new Qx(interfaceC2515Db);
                c3481ku.f31665w = qx;
            }
        }
        C4274ze c4274ze = (C4274ze) ((x2.m) ((com.google.ads.mediation.e) c3481ku.f31664v).f23550v);
        c4274ze.getClass();
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).g3((InterfaceC2515Db) qx.f27139u, str);
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
