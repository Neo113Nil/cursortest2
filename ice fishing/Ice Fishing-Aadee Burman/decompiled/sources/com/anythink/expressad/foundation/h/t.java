package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    static boolean f19695a = false;

    /* renamed from: b, reason: collision with root package name */
    static String f19696b = "";

    /* renamed from: c, reason: collision with root package name */
    public static char[] f19697c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: d, reason: collision with root package name */
    private static final String f19698d = "common-exception";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19699e = "SameSDCardTool";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f19700f = false;

    /* renamed from: g, reason: collision with root package name */
    private static int f19701g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static int f19702h = -1;
    private static int i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static int f19703j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static String f19704k;

    public static void a(Context context) {
        if (f19700f) {
            return;
        }
        try {
            try {
                f19696b = context.getFilesDir().getAbsolutePath() + File.separator;
                if (context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0) {
                    f19695a = true;
                } else {
                    f19695a = false;
                }
                b(context);
            } catch (Exception unused) {
                f19696b = context.getFilesDir().getAbsolutePath() + File.separator;
                b(context);
            }
        } catch (Exception unused2) {
        }
        f19700f = true;
    }

    private static void b(Context context) {
        String c9 = c(context);
        f19704k = c9;
        com.anythink.expressad.foundation.g.c.d.a(new com.anythink.expressad.foundation.g.c.b(c9));
        com.anythink.expressad.foundation.g.c.d.a().b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (e() > 31457280) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String c(Context context) {
        File file;
        File externalFilesDir;
        File file2 = null;
        try {
            externalFilesDir = context.getExternalFilesDir(null);
        } catch (Throwable unused) {
        }
        if (externalFilesDir != null) {
            file = a(externalFilesDir);
            if (f19695a) {
                if (file == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStorageDirectory().getPath());
                    String str = File.separator;
                    u1.h.i(sb, str, "Android", str, "data");
                    sb.append(str);
                    sb.append(context.getPackageName());
                    file = a(new File(sb.toString()));
                }
            }
            file2 = file;
            if (file2 != null || !file2.exists()) {
                file2 = context.getFilesDir().getAbsoluteFile();
            }
            return file2.getAbsolutePath();
        }
        file = null;
        if (f19695a) {
        }
        file2 = file;
        if (file2 != null) {
        }
        file2 = context.getFilesDir().getAbsoluteFile();
        return file2.getAbsolutePath();
    }

    private static int d() {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            long longValue = ((Long) x.b(e9, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || f19702h == -1) {
                f19702h = Long.valueOf((e() / 1000) / 1000).intValue();
                x.a(e9, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f19702h;
    }

    private static long e() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return 0L;
    }

    private static boolean f() {
        return e() > 31457280;
    }

    private static int g() {
        if (f19701g == -1) {
            try {
                f19701g = new Long((h() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return f19701g;
    }

    private static long h() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return 0L;
    }

    private static int i() {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            long longValue = ((Long) x.b(e9, "TotalDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || i == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                i = Long.valueOf(((statFs.getBlockCount() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                x.a(e9, "TotalDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return i;
    }

    private static int j() {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            long longValue = ((Long) x.b(e9, "FreeDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || f19703j == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f19703j = Long.valueOf(((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                x.a(e9, "FreeDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f19703j;
    }

    private static long k() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    private static long l() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    public static boolean b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    private static long d(Context context) {
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            new StatFs(absolutePath).restat(absolutePath);
            return r0.getAvailableBlocks() * r0.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String a() {
        return f19704k;
    }

    private static File a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    private static boolean c() {
        return f19695a;
    }

    public static boolean a(long j6) {
        return e() > j6;
    }
}
