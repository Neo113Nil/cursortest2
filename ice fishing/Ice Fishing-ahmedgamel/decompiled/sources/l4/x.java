package l4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.ads.C2582Fo;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class x implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static Boolean f38976A;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f38977y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static Boolean f38978z;

    /* renamed from: n, reason: collision with root package name */
    public final Context f38979n;

    /* renamed from: u, reason: collision with root package name */
    public final C2582Fo f38980u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager.WakeLock f38981v;

    /* renamed from: w, reason: collision with root package name */
    public final v f38982w;

    /* renamed from: x, reason: collision with root package name */
    public final long f38983x;

    public x(v vVar, Context context, C2582Fo c2582Fo, long j6) {
        this.f38982w = vVar;
        this.f38979n = context;
        this.f38983x = j6;
        this.f38980u = c2582Fo;
        this.f38981v = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f38977y) {
            try {
                Boolean bool = f38976A;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f38976A = valueOf;
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
        boolean z6 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z6 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z6;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f38977y) {
            try {
                Boolean bool = f38978z;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f38978z = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z6;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f38979n.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z6 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f38982w;
        Context context = this.f38979n;
        boolean c9 = c(context);
        PowerManager.WakeLock wakeLock = this.f38981v;
        if (c9) {
            wakeLock.acquire(f.f38914a);
        }
        try {
            try {
                try {
                    vVar.d(true);
                    if (!this.f38980u.e()) {
                        vVar.d(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (vVar.e()) {
                            vVar.d(false);
                        } else {
                            vVar.f(this.f38983x);
                        }
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        new w(this, this).a();
                        if (!c(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e9) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e9.getMessage());
                    vVar.d(false);
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
