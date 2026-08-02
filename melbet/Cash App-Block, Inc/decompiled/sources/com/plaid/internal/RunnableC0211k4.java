package com.plaid.internal;

import android.net.ConnectivityManager;
import com.plaid.internal.C0220l4;

/* renamed from: com.plaid.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0211k4 implements Runnable {
    public final /* synthetic */ ConnectivityManager a;
    public final /* synthetic */ C0220l4.b b;

    public RunnableC0211k4(ConnectivityManager connectivityManager, C0220l4.b bVar) {
        this.a = connectivityManager;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterNetworkCallback(this.b);
    }
}
