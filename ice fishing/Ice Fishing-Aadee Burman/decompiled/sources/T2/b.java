package T2;

import P2.w;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3078a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f3079b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f3080c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f3081d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f3082e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f3083f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f3084g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f3085h;
    public static String i;

    /* renamed from: j, reason: collision with root package name */
    public static int f3086j;

    /* renamed from: k, reason: collision with root package name */
    public static Boolean f3087k;

    public static void a(Context context, Throwable th) {
        try {
            w.h(context);
        } catch (Exception e9) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e9);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i6 = 0;
        for (byte b9 : bArr) {
            char[] cArr2 = f3079b;
            cArr[i6] = cArr2[(b9 & 255) >>> 4];
            cArr[i6 + 1] = cArr2[b9 & 15];
            i6 += 2;
        }
        return new String(cArr);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long d(InputStream inputStream, OutputStream outputStream, boolean z3) {
        byte[] bArr = new byte[1024];
        long j6 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                j6 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z3) {
                    c(inputStream);
                    c(outputStream);
                }
                throw th;
            }
        }
        if (z3) {
            c(inputStream);
            c(outputStream);
        }
        return j6;
    }

    public static String e() {
        BufferedReader bufferedReader;
        String processName;
        if (i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                i = processName;
            } else {
                int i6 = f3086j;
                if (i6 == 0) {
                    i6 = Process.myPid();
                    f3086j = i6;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i6 > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 14);
                        sb.append("/proc/");
                        sb.append(i6);
                        sb.append("/cmdline");
                        String sb2 = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb2));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        w.h(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        c(bufferedReader2);
                        throw th;
                    }
                    c(bufferedReader);
                }
                i = str;
            }
        }
        return i;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean h(Context context) {
        if (f3082e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z3 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z3 = true;
            }
            f3082e = Boolean.valueOf(z3);
        }
        return f3082e.booleanValue();
    }

    public static boolean i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3080c == null) {
            f3080c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f3080c.booleanValue();
        if (k(context)) {
            return !f() || g();
        }
        return false;
    }

    public static byte[] j(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i6 = 0;
        while (i6 < length) {
            int i9 = i6 + 2;
            bArr[i6 / 2] = (byte) Integer.parseInt(str.substring(i6, i9), 16);
            i6 = i9;
        }
        return bArr;
    }

    public static boolean k(Context context) {
        if (f3081d == null) {
            f3081d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3081d.booleanValue();
    }
}
