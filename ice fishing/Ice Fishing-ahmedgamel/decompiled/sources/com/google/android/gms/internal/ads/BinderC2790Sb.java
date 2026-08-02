package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2790Sb extends AbstractBinderC3359i8 implements InterfaceC2603Hb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3504ku f28279n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2790Sb(C3504ku c3504ku) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f28279n = c3504ku;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2535Db c2518Cb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c2518Cb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c2518Cb = queryLocalInterface instanceof InterfaceC2535Db ? (InterfaceC2535Db) queryLocalInterface : new C2518Cb(readStrongBinder);
        }
        String readString = parcel.readString();
        AbstractC3411j8.f(parcel);
        g3(c2518Cb, readString);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2603Hb
    public final void g3(InterfaceC2535Db interfaceC2535Db, String str) {
        Qx qx;
        C3504ku c3504ku = this.f28279n;
        if (((Y0.b) c3504ku.f32446v) == null) {
            return;
        }
        synchronized (c3504ku) {
            qx = (Qx) c3504ku.f32447w;
            if (qx == null) {
                qx = new Qx(interfaceC2535Db);
                c3504ku.f32447w = qx;
            }
        }
        C4297ze c4297ze = (C4297ze) ((z2.l) ((Y0.b) c3504ku.f32446v).f3828v);
        c4297ze.getClass();
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).Z2((InterfaceC2535Db) qx.f27895u, str);
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
