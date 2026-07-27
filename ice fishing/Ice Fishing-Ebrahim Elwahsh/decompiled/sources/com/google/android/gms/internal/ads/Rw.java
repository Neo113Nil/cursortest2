package com.google.android.gms.internal.ads;

import O2.InterfaceC0365b;
import O2.InterfaceC0366c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p2.AbstractC4857b;

/* loaded from: classes2.dex */
public final class Rw extends AbstractC4857b {

    /* renamed from: W, reason: collision with root package name */
    public final int f27444W;

    public Rw(Context context, Looper looper, InterfaceC0365b interfaceC0365b, InterfaceC0366c interfaceC0366c, int i) {
        super(context, looper, 116, interfaceC0365b, interfaceC0366c);
        this.f27444W = i;
    }

    @Override // O2.AbstractC0369f, M2.c
    public final int k() {
        return this.f27444W;
    }

    @Override // O2.AbstractC0369f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof Uw ? (Uw) queryLocalInterface : new Uw(iBinder, "com.google.android.gms.gass.internal.IGassService", 2);
    }

    @Override // O2.AbstractC0369f
    public final String v() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // O2.AbstractC0369f
    public final String w() {
        return "com.google.android.gms.gass.START";
    }
}
