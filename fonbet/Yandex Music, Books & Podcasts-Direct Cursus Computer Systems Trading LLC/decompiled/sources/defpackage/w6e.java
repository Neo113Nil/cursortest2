package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class w6e implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w6e(FirebaseMessaging firebaseMessaging, long j) {
        this.a = 1;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new swi("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        veb vebVar;
        switch (this.a) {
            case 0:
                Map map = (Map) this.c;
                if (map != null) {
                    long j = this.b;
                    String str = (String) map.get("name");
                    if (str == null) {
                        str = "error";
                    }
                    vebVar = new veb(j, str, (String) map.get(Constants.KEY_MESSAGE));
                } else {
                    nr1 nr1Var = (nr1) this.d;
                    nr1Var.getClass();
                    vebVar = new veb(nr1Var.k, "http error", nr1Var.m);
                }
                ((v7o) ((qdc) this.e).b).onError(vebVar);
                return;
            case 1:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                kkp v = kkp.v();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (v.x(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.h.g()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!kkp.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!kkp.v().w(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.h(this.b);
                            }
                            if (!kkp.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            l83 l83Var = new l83();
                            l83Var.b = this;
                            l83Var.b();
                            if (!kkp.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!kkp.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (kkp.v().x(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                ((vq6) this.e).execute((gyr) this.c);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append(((nud) this.d).toString());
                sb.append("(scheduled in SynchronizationContext with delay of ");
                return hrg.m(this.b, ")", sb);
            default:
                return super.toString();
        }
    }

    public w6e(qdc qdcVar, Map map, long j, nr1 nr1Var) {
        this.a = 0;
        this.e = qdcVar;
        this.c = map;
        this.b = j;
        this.d = nr1Var;
    }

    public w6e(vq6 vq6Var, gyr gyrVar, nud nudVar, long j) {
        this.a = 2;
        this.e = vq6Var;
        this.c = gyrVar;
        this.d = nudVar;
        this.b = j;
    }
}
