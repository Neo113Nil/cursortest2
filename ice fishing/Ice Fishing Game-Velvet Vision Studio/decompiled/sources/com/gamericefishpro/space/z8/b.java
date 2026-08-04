package com.gamericefishpro.space.z8;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.gamericefishpro.space.s8.h;
import com.gamericefishpro.space.s8.j;
import com.gamericefishpro.space.v8.c0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static String g;
    public static int h;
    public static Boolean i;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                g = Application.getProcessName();
            } else {
                int iMyPid = h;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    h = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        try {
                            StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb.append("/proc/");
                            sb.append(iMyPid);
                            sb.append("/cmdline");
                            String string = sb.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    c0.g(line);
                                    strTrim = line.trim();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                    }
                                    g = strTrim;
                                    return g;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th2;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                g = strTrim;
            }
        }
        return g;
    }

    public static boolean b(Context context, int i2) {
        if (d(i2, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                j jVarA = j.a(context);
                jVarA.getClass();
                if (packageInfo != null) {
                    if (!j.c(packageInfo, false)) {
                        if (j.c(packageInfo, true)) {
                            if (!h.a((Context) jVarA.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        c.booleanValue();
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return d.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static boolean d(int i2, Context context, String str) {
        com.gamericefishpro.space.b9.b bVarA = com.gamericefishpro.space.b9.c.a(context);
        bVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) bVarA.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i2, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
