package f4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.ads.C2561Fo;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static Boolean f37794A;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f37795y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static Boolean f37796z;

    /* renamed from: n, reason: collision with root package name */
    public final Context f37797n;

    /* renamed from: u, reason: collision with root package name */
    public final C2561Fo f37798u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager.WakeLock f37799v;

    /* renamed from: w, reason: collision with root package name */
    public final u f37800w;

    /* renamed from: x, reason: collision with root package name */
    public final long f37801x;

    public w(u uVar, Context context, C2561Fo c2561Fo, long j9) {
        this.f37800w = uVar;
        this.f37797n = context;
        this.f37801x = j9;
        this.f37798u = c2561Fo;
        this.f37799v = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f37795y) {
            try {
                Boolean bool = f37794A;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f37794A = valueOf;
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
        boolean z8 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z8 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z8;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f37795y) {
            try {
                Boolean bool = f37796z;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f37796z = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z8;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f37797n.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z8 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z8;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        u uVar = this.f37800w;
        Context context = this.f37797n;
        boolean c4 = c(context);
        PowerManager.WakeLock wakeLock = this.f37799v;
        if (c4) {
            wakeLock.acquire(e.f37735a);
        }
        try {
            try {
                try {
                    uVar.d(true);
                    if (!this.f37798u.e()) {
                        uVar.d(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (uVar.e()) {
                            uVar.d(false);
                        } else {
                            uVar.f(this.f37801x);
                        }
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        new v(this, this).a();
                        if (!c(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e6) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e6.getMessage());
                    uVar.d(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
