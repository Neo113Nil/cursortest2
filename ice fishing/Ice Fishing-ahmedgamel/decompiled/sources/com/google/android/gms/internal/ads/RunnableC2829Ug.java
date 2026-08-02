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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Ug, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2829Ug implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28745n;

    /* renamed from: u, reason: collision with root package name */
    public final long f28746u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28747v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f28748w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f28749x;

    public /* synthetic */ RunnableC2829Ug(C2590Gf c2590Gf, long j6, Ps ps, Bundle bundle) {
        this.f28745n = 1;
        this.f28747v = c2590Gf;
        this.f28746u = j6;
        this.f28748w = ps;
        this.f28749x = bundle;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f28748w).f36961b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.f28748w).a() == null) {
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
        switch (this.f28745n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f28747v);
                hashMap.put("cachedSrc", (String) this.f28748w);
                hashMap.put("totalDuration", Long.toString(this.f28746u));
                ((AbstractC2862Wg) this.f28749x).n(hashMap);
                return;
            case 1:
                C4906k.f40186C.f40198k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f28746u;
                boolean booleanValue = ((Boolean) AbstractC2772Ra.f27970a.r()).booleanValue();
                Bundle bundle = (Bundle) this.f28749x;
                Ps ps = (Ps) this.f28748w;
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
                    w2.z.k(sb.toString());
                }
                C3324ha c3324ha = AbstractC3592ma.f32828J2;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32879P2)).booleanValue()) {
                        synchronized (((C2590Gf) this.f28747v)) {
                            int f2 = ps.f();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(f2).length() + 3);
                            sb2.append("sig");
                            sb2.append(f2);
                            bundle.putLong(sb2.toString(), elapsedRealtime);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                l4.q g9 = l4.q.g();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f28748w;
                boolean i = g9.i(firebaseMessaging.f36961b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f28747v;
                if (i) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.f36967h.e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!l4.q.g().i(firebaseMessaging.f36961b)) {
                                return;
                            }
                        } else if (!l4.q.g().h(firebaseMessaging.f36961b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.g(this.f28746u);
                            }
                            if (!l4.q.g().i(firebaseMessaging.f36961b)) {
                                return;
                            }
                        } else {
                            Q0.d dVar = new Q0.d(8);
                            dVar.f2464b = this;
                            dVar.a();
                            if (!l4.q.g().i(firebaseMessaging.f36961b)) {
                                return;
                            }
                        }
                    } catch (IOException e9) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e9.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!l4.q.g().i(firebaseMessaging.f36961b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (l4.q.g().i(firebaseMessaging.f36961b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public RunnableC2829Ug(AbstractC2862Wg abstractC2862Wg, String str, String str2, long j6) {
        this.f28745n = 0;
        this.f28747v = str;
        this.f28748w = str2;
        this.f28746u = j6;
        Objects.requireNonNull(abstractC2862Wg);
        this.f28749x = abstractC2862Wg;
    }

    public RunnableC2829Ug(FirebaseMessaging firebaseMessaging, long j6) {
        this.f28745n = 2;
        this.f28749x = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W2.a("firebase-iid-executor"));
        this.f28748w = firebaseMessaging;
        this.f28746u = j6;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f36961b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f28747v = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
