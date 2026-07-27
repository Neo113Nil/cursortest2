package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class JA implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2631Jq f25737n;

    public /* synthetic */ JA(C2631Jq c2631Jq) {
        Objects.requireNonNull(c2631Jq);
        this.f25737n = c2631Jq;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2631Jq c2631Jq = this.f25737n;
        ((HE) c2631Jq.f25825w).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        c2631Jq.a(new RunnableC3329hp(20, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2631Jq c2631Jq = this.f25737n;
        ((HE) c2631Jq.f25825w).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        c2631Jq.a(new RunnableC3873rw(9, this));
    }
}
