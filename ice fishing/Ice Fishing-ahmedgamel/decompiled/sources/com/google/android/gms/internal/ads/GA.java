package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class GA implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2598Hq f24940n;

    public /* synthetic */ GA(C2598Hq c2598Hq) {
        Objects.requireNonNull(c2598Hq);
        this.f24940n = c2598Hq;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2598Hq c2598Hq = this.f24940n;
        ((C3933tE) c2598Hq.f25392w).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        c2598Hq.a(new RunnableC3048cq(19, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2598Hq c2598Hq = this.f24940n;
        ((C3933tE) c2598Hq.f25392w).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        c2598Hq.a(new RunnableC3807qw(9, this));
    }
}
