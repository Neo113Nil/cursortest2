package com.google.android.gms.internal.ads;

import P2.InterfaceC0372b;
import P2.InterfaceC0373c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p2.AbstractC4827b;

/* loaded from: classes2.dex */
public final class Qw extends AbstractC4827b {

    /* renamed from: W, reason: collision with root package name */
    public final int f27136W;

    public Qw(Context context, Looper looper, InterfaceC0372b interfaceC0372b, InterfaceC0373c interfaceC0373c, int i) {
        super(context, looper, 116, interfaceC0372b, interfaceC0373c);
        this.f27136W = i;
    }

    @Override // P2.AbstractC0376f, N2.c
    public final int j() {
        return this.f27136W;
    }

    @Override // P2.AbstractC0376f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof Tw ? (Tw) queryLocalInterface : new Tw(iBinder, "com.google.android.gms.gass.internal.IGassService", 2);
    }

    @Override // P2.AbstractC0376f
    public final String v() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // P2.AbstractC0376f
    public final String w() {
        return "com.google.android.gms.gass.START";
    }
}
