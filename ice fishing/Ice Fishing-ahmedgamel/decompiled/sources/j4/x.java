package j4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.ads.C2545Eo;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class x implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static Boolean f38464A;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f38465y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static Boolean f38466z;

    /* renamed from: n, reason: collision with root package name */
    public final Context f38467n;

    /* renamed from: u, reason: collision with root package name */
    public final C2545Eo f38468u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager.WakeLock f38469v;

    /* renamed from: w, reason: collision with root package name */
    public final v f38470w;

    /* renamed from: x, reason: collision with root package name */
    public final long f38471x;

    public x(v vVar, Context context, C2545Eo c2545Eo, long j6) {
        this.f38470w = vVar;
        this.f38467n = context;
        this.f38471x = j6;
        this.f38468u = c2545Eo;
        this.f38469v = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f38465y) {
            try {
                Boolean bool = f38464A;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f38464A = valueOf;
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
        boolean z3 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z3 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z3;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f38465y) {
            try {
                Boolean bool = f38466z;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f38466z = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z3;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f38467n.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z3 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f38470w;
        Context context = this.f38467n;
        boolean c9 = c(context);
        PowerManager.WakeLock wakeLock = this.f38469v;
        if (c9) {
            wakeLock.acquire(f.f38402a);
        }
        try {
            try {
                try {
                    vVar.d(true);
                    if (!this.f38468u.d()) {
                        vVar.d(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (vVar.e()) {
                            vVar.d(false);
                        } else {
                            vVar.f(this.f38471x);
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
