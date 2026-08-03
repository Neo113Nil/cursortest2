package t6;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6532a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f6533b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f6534c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f6535d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f6536e;

    /* renamed from: f, reason: collision with root package name */
    public static String f6537f;

    /* renamed from: g, reason: collision with root package name */
    public static int f6538g;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (f6537f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f6537f = processName;
            } else {
                int i10 = f6538g;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f6538g = i10;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        String str2 = "/proc/" + i10 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                u.g(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
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
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f6537f = str;
            }
        }
        return f6537f;
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6533b == null) {
            f6533b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f6533b.booleanValue();
        if (f6534c == null) {
            f6534c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f6534c.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
