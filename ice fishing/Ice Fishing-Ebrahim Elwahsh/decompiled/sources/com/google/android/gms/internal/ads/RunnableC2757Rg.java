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

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2757Rg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27392n;

    /* renamed from: u, reason: collision with root package name */
    public final long f27393u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f27394v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f27395w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f27396x;

    public /* synthetic */ RunnableC2757Rg(C2518Df c2518Df, long j9, Rs rs, Bundle bundle) {
        this.f27392n = 1;
        this.f27394v = c2518Df;
        this.f27393u = j9;
        this.f27395w = rs;
        this.f27396x = bundle;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f27395w).f36356b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.f27395w).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e6) {
            String message = e6.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e6.getMessage() != null) {
                    throw e6;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e6.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27392n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f27394v);
                hashMap.put("cachedSrc", (String) this.f27395w);
                hashMap.put("totalDuration", Long.toString(this.f27393u));
                ((AbstractC2791Tg) this.f27396x).n(hashMap);
                return;
            case 1:
                p2.j.f39798C.f39810k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f27393u;
                boolean booleanValue = ((Boolean) AbstractC2666Ma.f26351a.r()).booleanValue();
                Bundle bundle = (Bundle) this.f27396x;
                Rs rs = (Rs) this.f27395w;
                if (booleanValue) {
                    String canonicalName = rs.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(elapsedRealtime).length());
                    sb.append("Signal runtime (ms) : ");
                    sb.append(canonicalName);
                    sb.append(" = ");
                    sb.append(elapsedRealtime);
                    t2.C.k(sb.toString());
                }
                C3151ea c3151ea = AbstractC3368ia.f31467J2;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31520P2)).booleanValue()) {
                        synchronized (((C2518Df) this.f27394v)) {
                            int d2 = rs.d();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 3);
                            sb2.append("sig");
                            sb2.append(d2);
                            bundle.putLong(sb2.toString(), elapsedRealtime);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                f4.p f6 = f4.p.f();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f27395w;
                boolean j9 = f6.j(firebaseMessaging.f36356b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f27394v;
                if (j9) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.f36362h.e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!f4.p.f().j(firebaseMessaging.f36356b)) {
                                return;
                            }
                        } else if (!f4.p.f().g(firebaseMessaging.f36356b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.g(this.f27393u);
                            }
                            if (!f4.p.f().j(firebaseMessaging.f36356b)) {
                                return;
                            }
                        } else {
                            Q0.d dVar = new Q0.d(7);
                            dVar.f2699b = this;
                            dVar.a();
                            if (!f4.p.f().j(firebaseMessaging.f36356b)) {
                                return;
                            }
                        }
                    } catch (IOException e6) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e6.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!f4.p.f().j(firebaseMessaging.f36356b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (f4.p.f().j(firebaseMessaging.f36356b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public RunnableC2757Rg(AbstractC2791Tg abstractC2791Tg, String str, String str2, long j9) {
        this.f27392n = 0;
        this.f27394v = str;
        this.f27395w = str2;
        this.f27393u = j9;
        Objects.requireNonNull(abstractC2791Tg);
        this.f27396x = abstractC2791Tg;
    }

    public RunnableC2757Rg(FirebaseMessaging firebaseMessaging, long j9) {
        this.f27392n = 2;
        this.f27396x = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new T2.a("firebase-iid-executor", 0));
        this.f27395w = firebaseMessaging;
        this.f27393u = j9;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f36356b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f27394v = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
