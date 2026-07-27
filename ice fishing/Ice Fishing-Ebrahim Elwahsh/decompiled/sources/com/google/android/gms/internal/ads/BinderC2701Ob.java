package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2701Ob extends AbstractBinderC3186f8 implements InterfaceC2514Db {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3602mu f26703n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2701Ob(C3602mu c3602mu) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f26703n = c3602mu;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4284zb c4230yb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c4230yb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c4230yb = queryLocalInterface instanceof InterfaceC4284zb ? (InterfaceC4284zb) queryLocalInterface : new C4230yb(readStrongBinder);
        }
        String readString = parcel.readString();
        AbstractC3241g8.f(parcel);
        m1(c4230yb, readString);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2514Db
    public final void m1(InterfaceC4284zb interfaceC4284zb, String str) {
        Rx rx;
        C3602mu c3602mu = this.f26703n;
        if (((com.google.ads.mediation.e) c3602mu.f32775v) == null) {
            return;
        }
        synchronized (c3602mu) {
            rx = (Rx) c3602mu.f32776w;
            if (rx == null) {
                rx = new Rx(interfaceC4284zb);
                c3602mu.f32776w = rx;
            }
        }
        C4017ue c4017ue = (C4017ue) ((w2.m) ((com.google.ads.mediation.e) c3602mu.f32775v).f23706v);
        c4017ue.getClass();
        try {
            ((InterfaceC3693od) c4017ue.f34630u).T0((InterfaceC4284zb) rx.f27448u, str);
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }
}
