package com.anythink.core.common.v;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f16895a = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    public static String a() {
        try {
            String[] strArr = f16895a;
            int length = strArr.length;
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (new File(strArr[i]).exists()) {
                    z3 = true;
                    break;
                }
                i++;
            }
            String str = Build.TAGS;
            if (str != null) {
                if (str.contains("test-keys")) {
                    return "1";
                }
            }
            return z3 ? "1" : "2";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        String str;
        try {
            str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                str = Build.CPU_ABI2;
            }
        } catch (Throwable unused) {
        }
        return str != null ? str : "";
    }

    public static String c(Context context) {
        return g(context) ? "1" : "2";
    }

    public static String d(Context context) {
        String a9 = a(context, "ro.product.cpu.abi");
        return (a9 == null || TextUtils.isEmpty(a9) || !a9.contains("x86")) ? "2" : "1";
    }

    public static String e(Context context) {
        return "1".equals(a(context, "ro.kernel.qemu")) ? "1" : "2";
    }

    public static String f(Context context) {
        try {
            return String.valueOf(((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4));
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean g(Context context) {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(17)) == null) {
                return false;
            }
            return networkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean h(Context context) {
        return "1".equals(a(context, "ro.kernel.qemu"));
    }

    private static boolean i(Context context) {
        String a9 = a(context, "ro.product.cpu.abi");
        return (a9 == null || TextUtils.isEmpty(a9) || !a9.contains("x86")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Context context) {
        Intent registerReceiver;
        int intExtra;
        boolean z3;
        int i = 2;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = registerReceiver.getIntExtra("status", -1);
        } catch (Throwable unused) {
        }
        if (intExtra != 2 && intExtra != 5) {
            z3 = false;
            int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
            boolean z6 = intExtra2 != 2;
            boolean z9 = intExtra2 == 1;
            if (z3 && (z6 || z9)) {
                i = 1;
            }
            return String.valueOf(i);
        }
        z3 = true;
        int intExtra22 = registerReceiver.getIntExtra("plugged", -1);
        if (intExtra22 != 2) {
        }
        if (intExtra22 == 1) {
        }
        if (z3) {
            i = 1;
        }
        return String.valueOf(i);
    }

    public static String a(Context context) {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? "2" : "1";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
