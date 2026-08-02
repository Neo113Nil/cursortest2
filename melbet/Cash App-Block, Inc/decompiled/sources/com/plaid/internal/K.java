package com.plaid.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import com.plaid.internal.AbstractC0321w7;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* loaded from: classes5.dex */
public final class K extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ L a;
    public final /* synthetic */ String b;
    public final /* synthetic */ SafeContinuation c;
    public final /* synthetic */ ConnectivityManager d;

    public K(L l, String str, SafeContinuation safeContinuation, ConnectivityManager connectivityManager) {
        this.a = l;
        this.b = str;
        this.c = safeContinuation;
        this.d = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        try {
            try {
                C0184h4 a = this.a.b.a(this.b, network);
                SafeContinuation safeContinuation = this.c;
                Result.Companion companion = Result.Companion;
                safeContinuation.resumeWith(a);
            } catch (AbstractC0321w7.c e) {
                SafeContinuation safeContinuation2 = this.c;
                Result.Companion companion2 = Result.Companion;
                safeContinuation2.resumeWith(new Result.Failure(e));
            }
        } finally {
            this.d.unregisterNetworkCallback(this);
        }
    }
}
