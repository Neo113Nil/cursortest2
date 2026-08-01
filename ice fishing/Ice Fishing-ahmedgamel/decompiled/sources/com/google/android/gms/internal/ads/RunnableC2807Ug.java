package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Ug, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2807Ug implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27947n;

    /* renamed from: u, reason: collision with root package name */
    public final long f27948u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f27949v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f27950w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f27951x;

    public /* synthetic */ RunnableC2807Ug(C2570Gf c2570Gf, long j6, Ps ps, Bundle bundle) {
        this.f27947n = 1;
        this.f27949v = c2570Gf;
        this.f27948u = j6;
        this.f27950w = ps;
        this.f27951x = bundle;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f27950w).f36194b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.f27950w).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e9) {
            String message = e9.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e9.getMessage() != null) {
                    throw e9;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e9.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27947n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f27949v);
                hashMap.put("cachedSrc", (String) this.f27950w);
                hashMap.put("totalDuration", Long.toString(this.f27948u));
                ((AbstractC2839Wg) this.f27951x).n(hashMap);
                return;
            case 1:
                C4835j.f39733C.f39745k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f27948u;
                boolean booleanValue = ((Boolean) AbstractC2752Ra.f27286a.r()).booleanValue();
                Bundle bundle = (Bundle) this.f27951x;
                Ps ps = (Ps) this.f27950w;
                if (booleanValue) {
                    String canonicalName = ps.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(elapsedRealtime).length());
                    sb.append("Signal runtime (ms) : ");
                    sb.append(canonicalName);
                    sb.append(" = ");
                    sb.append(elapsedRealtime);
                    u2.z.k(sb.toString());
                }
                C3301ha c3301ha = AbstractC3569ma.J2;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32099P2)).booleanValue()) {
                        synchronized (((C2570Gf) this.f27949v)) {
                            int f3 = ps.f();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(f3).length() + 3);
                            sb2.append("sig");
                            sb2.append(f3);
                            bundle.putLong(sb2.toString(), elapsedRealtime);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                j4.q b9 = j4.q.b();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f27950w;
                boolean d2 = b9.d(firebaseMessaging.f36194b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f27949v;
                if (d2) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.f36200h.d()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!j4.q.b().d(firebaseMessaging.f36194b)) {
                                return;
                            }
                        } else if (!j4.q.b().c(firebaseMessaging.f36194b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.g(this.f27948u);
                            }
                            if (!j4.q.b().d(firebaseMessaging.f36194b)) {
                                return;
                            }
                        } else {
                            Q0.d dVar = new Q0.d(8);
                            dVar.f2629b = this;
                            dVar.a();
                            if (!j4.q.b().d(firebaseMessaging.f36194b)) {
                                return;
                            }
                        }
                    } catch (IOException e9) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e9.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!j4.q.b().d(firebaseMessaging.f36194b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (j4.q.b().d(firebaseMessaging.f36194b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public RunnableC2807Ug(AbstractC2839Wg abstractC2839Wg, String str, String str2, long j6) {
        this.f27947n = 0;
        this.f27949v = str;
        this.f27950w = str2;
        this.f27948u = j6;
        Objects.requireNonNull(abstractC2839Wg);
        this.f27951x = abstractC2839Wg;
    }

    public RunnableC2807Ug(FirebaseMessaging firebaseMessaging, long j6) {
        this.f27947n = 2;
        this.f27951x = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new U2.a("firebase-iid-executor"));
        this.f27950w = firebaseMessaging;
        this.f27948u = j6;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f36194b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f27949v = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
