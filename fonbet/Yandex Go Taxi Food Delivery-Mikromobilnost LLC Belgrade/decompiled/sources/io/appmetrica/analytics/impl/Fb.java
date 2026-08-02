package io.appmetrica.analytics.impl;

import android.os.IBinder;

/* loaded from: classes4.dex */
public final class Fb implements Hb {
    public final IBinder a;

    public Fb(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
