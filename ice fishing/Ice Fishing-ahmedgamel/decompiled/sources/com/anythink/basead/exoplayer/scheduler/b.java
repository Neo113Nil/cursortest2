package com.anythink.basead.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.k.af;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8738a = "RequirementsWatcher";

    /* renamed from: b, reason: collision with root package name */
    private final Context f8739b;

    /* renamed from: c, reason: collision with root package name */
    private final c f8740c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.scheduler.a f8741d;

    /* renamed from: e, reason: collision with root package name */
    private C0037b f8742e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8743f;

    /* renamed from: g, reason: collision with root package name */
    private a f8744g;

    public final class a extends ConnectivityManager.NetworkCallback {
        private a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            super.onAvailable(network);
            Objects.toString(b.this);
            b.this.a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            super.onLost(network);
            Objects.toString(b.this);
            b.this.a(false);
        }

        public /* synthetic */ a(b bVar, byte b9) {
            this();
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.scheduler.b$b, reason: collision with other inner class name */
    public class C0037b extends BroadcastReceiver {
        private C0037b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            Objects.toString(b.this);
            intent.getAction();
            b.this.a(false);
        }

        public /* synthetic */ C0037b(b bVar, byte b9) {
            this();
        }
    }

    public interface c {
        void a();

        void b();
    }

    private b(Context context, c cVar, com.anythink.basead.exoplayer.scheduler.a aVar) {
        this.f8741d = aVar;
        this.f8740c = cVar;
        this.f8739b = context.getApplicationContext();
        toString();
    }

    private void b() {
        this.f8739b.unregisterReceiver(this.f8742e);
        this.f8742e = null;
        if (this.f8744g != null && af.f8346a >= 21) {
            ((ConnectivityManager) this.f8739b.getSystemService("connectivity")).unregisterNetworkCallback(this.f8744g);
            this.f8744g = null;
        }
        toString();
    }

    private com.anythink.basead.exoplayer.scheduler.a c() {
        return this.f8741d;
    }

    private void d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8739b.getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        a aVar = new a(this, (byte) 0);
        this.f8744g = aVar;
        connectivityManager.registerNetworkCallback(build, aVar);
    }

    private void e() {
        if (af.f8346a >= 21) {
            ((ConnectivityManager) this.f8739b.getSystemService("connectivity")).unregisterNetworkCallback(this.f8744g);
            this.f8744g = null;
        }
    }

    private static void f() {
    }

    private static /* synthetic */ void g() {
    }

    public final String toString() {
        return super.toString();
    }

    private void a() {
        com.anythink.basead.exoplayer.k.a.a(Looper.myLooper());
        a(true);
        IntentFilter intentFilter = new IntentFilter();
        byte b9 = 0;
        if (this.f8741d.a() != 0) {
            if (af.f8346a >= 23) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f8739b.getSystemService("connectivity");
                NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
                a aVar = new a(this, b9);
                this.f8744g = aVar;
                connectivityManager.registerNetworkCallback(build, aVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f8741d.b()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f8741d.c()) {
            if (af.f8346a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        C0037b c0037b = new C0037b(this, b9);
        this.f8742e = c0037b;
        this.f8739b.registerReceiver(c0037b, intentFilter, null, new Handler());
        toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z3) {
        boolean a9 = this.f8741d.a(this.f8739b);
        if (z3 || a9 != this.f8743f) {
            this.f8743f = a9;
        }
    }
}
