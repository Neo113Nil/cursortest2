package d8;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final long f1828g;

    /* renamed from: h, reason: collision with root package name */
    public final PowerManager.WakeLock f1829h;

    /* renamed from: i, reason: collision with root package name */
    public final FirebaseMessaging f1830i;

    public x(FirebaseMessaging firebaseMessaging, long j3) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new u6.a("firebase-iid-executor"));
        this.f1830i = firebaseMessaging;
        this.f1828g = j3;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f1461b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f1829h = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1830i.f1461b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f1830i.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f1829h;
        s c3 = s.c();
        FirebaseMessaging firebaseMessaging = this.f1830i;
        if (c3.e(firebaseMessaging.f1461b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f1468i = true;
                }
                if (!firebaseMessaging.f1467h.e()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f1468i = false;
                    }
                    if (s.c().e(firebaseMessaging.f1461b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (s.c().d(firebaseMessaging.f1461b) && !a()) {
                    w wVar = new w();
                    wVar.f1827b = this;
                    wVar.a();
                    if (s.c().e(firebaseMessaging.f1461b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f1468i = false;
                    }
                } else {
                    firebaseMessaging.e(this.f1828g);
                }
                if (s.c().e(firebaseMessaging.f1461b)) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f1468i = false;
                    if (s.c().e(firebaseMessaging.f1461b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (s.c().e(firebaseMessaging.f1461b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
