package d8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import b0.s0;
import java.io.IOException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final Object f1758l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f1759m;

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f1760n;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1761g;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f1762h;

    /* renamed from: i, reason: collision with root package name */
    public final PowerManager.WakeLock f1763i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f1764j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1765k;

    public d0(b0 b0Var, Context context, s0 s0Var, long j3) {
        this.f1764j = b0Var;
        this.f1761g = context;
        this.f1765k = j3;
        this.f1762h = s0Var;
        this.f1763i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f1758l) {
            try {
                Boolean bool = f1760n;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f1760n = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f1758l) {
            try {
                Boolean bool = f1759m;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f1759m = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f1761g.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z10 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f1764j;
        Context context = this.f1761g;
        boolean c3 = c(context);
        PowerManager.WakeLock wakeLock = this.f1763i;
        if (c3) {
            wakeLock.acquire(f.f1770a);
        }
        try {
            try {
                try {
                    b0Var.d(true);
                    if (!this.f1762h.e()) {
                        b0Var.d(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || d()) {
                        if (b0Var.e()) {
                            b0Var.d(false);
                        } else {
                            b0Var.f(this.f1765k);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new c0(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    b0Var.d(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
