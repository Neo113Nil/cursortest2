package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class GA implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2618Hq f25730n;

    public /* synthetic */ GA(C2618Hq c2618Hq) {
        Objects.requireNonNull(c2618Hq);
        this.f25730n = c2618Hq;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2618Hq c2618Hq = this.f25730n;
        ((C3956tE) c2618Hq.f26135w).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        c2618Hq.a(new RunnableC3071cq(19, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2618Hq c2618Hq = this.f25730n;
        ((C3956tE) c2618Hq.f26135w).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        c2618Hq.a(new RunnableC3830qw(9, this));
    }
}
