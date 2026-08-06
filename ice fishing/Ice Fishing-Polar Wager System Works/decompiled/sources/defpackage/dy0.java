package defpackage;

/* loaded from: classes.dex */
public abstract class dy0 {
    public static final defpackage.i11 IHQe1A4L2xu = new defpackage.i11();
    public static final java.lang.Object oh6vYeIP = new java.lang.Object();
    public static defpackage.ky r1MBDhnF = null;

    public static long IHQe1A4L2xu(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return android.os.Build.VERSION.SDK_INT >= 33 ? defpackage.qvFH3dnF.IHQe1A4L2xu(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static defpackage.ky oh6vYeIP() {
        defpackage.ky kyVar = new defpackage.ky(24);
        r1MBDhnF = kyVar;
        defpackage.i11 i11Var = IHQe1A4L2xu;
        i11Var.getClass();
        if (defpackage.hyxIchWRW.SH1y5HwkJhh.fnWB2E7cs(i11Var, null, kyVar)) {
            defpackage.hyxIchWRW.oh6vYeIP(i11Var);
        }
        return r1MBDhnF;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r1MBDhnF(android.content.Context context, boolean z) {
        boolean z2;
        defpackage.cy0 IHQe1A4L2xu2;
        defpackage.cy0 cy0Var;
        int i;
        if (z || r1MBDhnF == null) {
            synchronized (oh6vYeIP) {
                if (!z) {
                    if (r1MBDhnF != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    android.content.res.AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (java.io.IOException unused) {
                    z2 = false;
                }
                int i3 = android.os.Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    java.io.File file = new java.io.File(new java.io.File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    java.io.File file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long IHQe1A4L2xu3 = IHQe1A4L2xu(context);
                        java.io.File file3 = new java.io.File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                IHQe1A4L2xu2 = defpackage.cy0.IHQe1A4L2xu(file3);
                            } catch (java.io.IOException unused2) {
                                oh6vYeIP();
                                return;
                            }
                        } else {
                            IHQe1A4L2xu2 = null;
                        }
                        if (IHQe1A4L2xu2 != null && IHQe1A4L2xu2.r1MBDhnF == IHQe1A4L2xu3 && (i = IHQe1A4L2xu2.oh6vYeIP) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (IHQe1A4L2xu2 != null && IHQe1A4L2xu2.oh6vYeIP == 2 && i2 == 1 && length < IHQe1A4L2xu2.F7NU4MC0GW) {
                                i2 = 3;
                            }
                            cy0Var = new defpackage.cy0(1, i2, IHQe1A4L2xu3, length2);
                            if (IHQe1A4L2xu2 != null || !IHQe1A4L2xu2.equals(cy0Var)) {
                                cy0Var.oh6vYeIP(file3);
                            }
                            oh6vYeIP();
                            return;
                        }
                        if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (IHQe1A4L2xu2 != null) {
                            i2 = 3;
                        }
                        cy0Var = new defpackage.cy0(1, i2, IHQe1A4L2xu3, length2);
                        if (IHQe1A4L2xu2 != null) {
                        }
                        cy0Var.oh6vYeIP(file3);
                        oh6vYeIP();
                        return;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                        oh6vYeIP();
                        return;
                    }
                }
                oh6vYeIP();
            }
        }
    }
}
