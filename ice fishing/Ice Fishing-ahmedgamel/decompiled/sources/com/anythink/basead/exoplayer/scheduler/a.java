package com.anythink.basead.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9514a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9515b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9516c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9517d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9518e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f9519f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9520g = 16;

    /* renamed from: h, reason: collision with root package name */
    private static final int f9521h = 7;
    private static final String i = "Requirements";

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f9522j = null;

    /* renamed from: k, reason: collision with root package name */
    private final int f9523k;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.basead.exoplayer.scheduler.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0036a {
    }

    private a(int i4, boolean z6, boolean z9) {
        this(i4 | (z6 ? 16 : 0) | (z9 ? 8 : 0));
    }

    private static void e() {
    }

    public final int a() {
        return this.f9523k & 7;
    }

    public final boolean b() {
        return (this.f9523k & 16) != 0;
    }

    public final boolean c() {
        return (this.f9523k & 8) != 0;
    }

    public final int d() {
        return this.f9523k;
    }

    public final String toString() {
        return super.toString();
    }

    public a(int i4) {
        this.f9523k = i4;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        if (af.f9132a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    private boolean b(Context context) {
        int i4;
        boolean z6;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i6 = this.f9523k & 7;
        if (i6 == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || ((i4 = af.f9132a) >= 23 && ((activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)))) {
            return false;
        }
        if (i6 == 1) {
            return true;
        }
        if (i6 == 3) {
            return !activeNetworkInfo.isRoaming();
        }
        if (i4 >= 16) {
            z6 = connectivityManager.isActiveNetworkMetered();
        } else {
            int type = activeNetworkInfo.getType();
            z6 = (type == 1 || type == 7 || type == 9) ? false : true;
        }
        if (i6 == 2) {
            return !z6;
        }
        if (i6 == 4) {
            return z6;
        }
        throw new IllegalStateException();
    }

    private boolean c(Context context) {
        if (!b()) {
            return true;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean d(Context context) {
        if (!c()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i4 = af.f9132a;
        return i4 >= 23 ? !powerManager.isDeviceIdleMode() : i4 >= 20 ? !powerManager.isInteractive() : !powerManager.isScreenOn();
    }

    private static boolean a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (af.f9132a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0047, code lost:
    
        if (r7.isRoaming() == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Context context) {
        boolean z6;
        int i4;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Intent registerReceiver;
        int intExtra;
        boolean z9;
        int i6 = this.f9523k & 7;
        if (i6 != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && ((i4 = af.f9132a) < 23 || ((activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(16)))) {
                if (i6 != 1) {
                    if (i6 != 3) {
                        if (i4 >= 16) {
                            z6 = connectivityManager.isActiveNetworkMetered();
                        } else {
                            int type = activeNetworkInfo.getType();
                            z6 = (type == 1 || type == 7 || type == 9) ? false : true;
                        }
                        if (i6 != 2) {
                            if (i6 != 4) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    if (z6) {
                        if (!b() || ((registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5))) {
                            if (c()) {
                                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                int i9 = af.f9132a;
                                if (i9 < 23 ? i9 < 20 ? powerManager.isScreenOn() : powerManager.isInteractive() : powerManager.isDeviceIdleMode()) {
                                    z9 = false;
                                    if (!z9) {
                                        return true;
                                    }
                                }
                            }
                            z9 = true;
                            if (!z9) {
                            }
                        }
                    }
                    return false;
                }
            }
            z6 = false;
            if (z6) {
            }
            return false;
        }
        z6 = true;
        if (z6) {
        }
        return false;
    }
}
