package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
import R2.InterfaceC0377c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import r2.AbstractC4897b;

/* loaded from: classes2.dex */
public final class Qw extends AbstractC4897b {

    /* renamed from: W, reason: collision with root package name */
    public final int f27892W;

    public Qw(Context context, Looper looper, InterfaceC0376b interfaceC0376b, InterfaceC0377c interfaceC0377c, int i) {
        super(context, looper, 116, interfaceC0376b, interfaceC0377c);
        this.f27892W = i;
    }

    @Override // R2.AbstractC0380f, P2.c
    public final int i() {
        return this.f27892W;
    }

    @Override // R2.AbstractC0380f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof Tw ? (Tw) queryLocalInterface : new Tw(iBinder, "com.google.android.gms.gass.internal.IGassService", 1);
    }

    @Override // R2.AbstractC0380f
    public final String v() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // R2.AbstractC0380f
    public final String w() {
        return "com.google.android.gms.gass.START";
    }
}
