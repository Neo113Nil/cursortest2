package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Tb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2807Tb extends AbstractBinderC3359i8 implements InterfaceC2637Jb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3504ku f28528n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2807Tb(C3504ku c3504ku) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f28528n = c3504ku;
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
        AbstractC3411j8.f(parcel);
        g2(c2518Cb);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2637Jb
    public final void g2(InterfaceC2535Db interfaceC2535Db) {
        Qx qx;
        String str;
        C3504ku c3504ku = this.f28528n;
        Y0.b bVar = (Y0.b) c3504ku.f32445u;
        synchronized (c3504ku) {
            qx = (Qx) c3504ku.f32447w;
            if (qx == null) {
                qx = new Qx(interfaceC2535Db);
                c3504ku.f32447w = qx;
            }
        }
        C4297ze c4297ze = (C4297ze) ((z2.l) bVar.f3828v);
        c4297ze.getClass();
        R2.w.d("#008 Must be called on the main UI thread.");
        try {
            str = ((InterfaceC2535Db) qx.f27895u).g();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            str = null;
        }
        x2.i.a("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        c4297ze.f36135w = qx;
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).j();
        } catch (RemoteException e10) {
            x2.i.i("#007 Could not call remote method.", e10);
        }
    }
}
