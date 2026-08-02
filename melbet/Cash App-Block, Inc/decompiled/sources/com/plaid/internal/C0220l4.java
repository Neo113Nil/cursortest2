package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.provider.Settings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.plaid.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0220l4 {
    public final Context a;
    public final C0323x0 b;

    /* renamed from: com.plaid.internal.l4$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0202j4.values().length];
            a = iArr;
            try {
                iArr[EnumC0202j4.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0202j4.WIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.plaid.internal.l4$b */
    public static class b extends ConnectivityManager.NetworkCallback {
        public final C0323x0 a;
        public final CountDownLatch b;
        public volatile C0175g4 c;
        public volatile RunnableC0211k4 d;
        public final ConnectivityManager e;

        public b(ConnectivityManager connectivityManager) {
            W3 w3 = Z3.a;
            this.a = new C0323x0("network-callback");
            this.b = new CountDownLatch(1);
            this.e = connectivityManager;
        }

        public final void a(Network network, NetworkCapabilities networkCapabilities) {
            if (this.d == null) {
                this.a.a(W3.ERROR, "network callback already unregistered", new Object[0]);
                return;
            }
            try {
                C0166f4 c0166f4 = new C0166f4(networkCapabilities);
                EnumC0340z enumC0340z = c0166f4.c == EnumC0340z.YES ? c0166f4.d : EnumC0340z.NO;
                if (this.c != null && this.c.a.equals(network)) {
                    this.a.a(W3.INFO, "update validated network %s %s", network, c0166f4);
                    this.c.c = enumC0340z;
                } else {
                    if (this.c != null || enumC0340z == EnumC0340z.NO) {
                        this.a.a(W3.INFO, "update network %s %s", network, c0166f4);
                        return;
                    }
                    this.a.a(W3.INFO, "found validated network %s %s", network, c0166f4);
                    this.c = new C0175g4(network, this.d);
                    this.c.c = enumC0340z;
                    this.b.countDown();
                }
            } catch (RuntimeException e) {
                this.a.a(e, "fatal network callback error");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            NetworkCapabilities networkCapabilities = this.e.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                this.a.a(W3.INFO, "available network %s", network);
                a(network, networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            a(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            if (this.c == null || !this.c.a.equals(network)) {
                return;
            }
            this.a.a(W3.INFO, "lost network %s", network);
            C0175g4 c0175g4 = this.c;
            if (c0175g4.d) {
                return;
            }
            c0175g4.d = true;
            c0175g4.b.run();
        }
    }

    public C0220l4(Context context) {
        W3 w3 = Z3.a;
        this.b = new C0323x0("network-utils");
        this.a = context;
    }

    public final C0175g4 a(EnumC0202j4 enumC0202j4) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            this.b.a(W3.ERROR, "ConnectivityManager is null!", new Object[0]);
            a$$ExternalSyntheticBUOutline0.m$1("ConnectivityManager not available!");
            return null;
        }
        NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
        int i2 = a.a[enumC0202j4.ordinal()];
        if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 3;
        }
        NetworkRequest build = addCapability.addTransportType(i).build();
        b bVar = new b(connectivityManager);
        this.b.a(W3.DEBUG, "Network %s requested, waiting (%d)ms for result (%s)", enumC0202j4, 10000, Thread.currentThread());
        bVar.d = new RunnableC0211k4(connectivityManager, bVar);
        connectivityManager.requestNetwork(build, bVar);
        try {
            bVar.b.await(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (bVar.c == null) {
            RunnableC0211k4 runnableC0211k4 = bVar.d;
            runnableC0211k4.a.unregisterNetworkCallback(runnableC0211k4.b);
        }
        return bVar.c;
    }

    public final boolean a() {
        W3 w3 = W3.DEBUG;
        this.b.a(w3, "isAirplaneMode: Checking if device is in airplane mode.", new Object[0]);
        boolean z = Settings.Global.getInt(this.a.getContentResolver(), "airplane_mode_on", 0) != 0;
        this.b.a(w3, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("isAirplaneMode: Airplane mode "), z ? "IS" : "IS NOT", " active."), new Object[0]);
        return z;
    }
}
