package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class q21 {
    public static final defpackage.z41 ZpBGe2uQfcn8 = new defpackage.z41();
    public static final java.lang.Object giKS3J6vZuNy = new java.lang.Object();
    public static defpackage.l21 fWTAfUmVKrZq = null;

    public static long ZpBGe2uQfcn8(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return android.os.Build.VERSION.SDK_INT >= 33 ? defpackage.hwoZxnIesQBZ.giKS3J6vZuNy(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fWTAfUmVKrZq(android.content.Context context, boolean z) {
        boolean z2;
        defpackage.p21 ZpBGe2uQfcn82;
        defpackage.p21 p21Var;
        int i;
        if (z || fWTAfUmVKrZq == null) {
            synchronized (giKS3J6vZuNy) {
                if (!z) {
                    if (fWTAfUmVKrZq != null) {
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
                        long ZpBGe2uQfcn83 = ZpBGe2uQfcn8(context);
                        java.io.File file3 = new java.io.File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                ZpBGe2uQfcn82 = defpackage.p21.ZpBGe2uQfcn8(file3);
                            } catch (java.io.IOException unused2) {
                                giKS3J6vZuNy();
                                return;
                            }
                        } else {
                            ZpBGe2uQfcn82 = null;
                        }
                        if (ZpBGe2uQfcn82 != null && ZpBGe2uQfcn82.fWTAfUmVKrZq == ZpBGe2uQfcn83 && (i = ZpBGe2uQfcn82.giKS3J6vZuNy) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (ZpBGe2uQfcn82 != null && ZpBGe2uQfcn82.giKS3J6vZuNy == 2 && i2 == 1 && length < ZpBGe2uQfcn82.JhCgjQRTAOCT) {
                                i2 = 3;
                            }
                            p21Var = new defpackage.p21(1, i2, ZpBGe2uQfcn83, length2);
                            if (ZpBGe2uQfcn82 != null || !ZpBGe2uQfcn82.equals(p21Var)) {
                                p21Var.giKS3J6vZuNy(file3);
                            }
                            giKS3J6vZuNy();
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
                        if (ZpBGe2uQfcn82 != null) {
                            i2 = 3;
                        }
                        p21Var = new defpackage.p21(1, i2, ZpBGe2uQfcn83, length2);
                        if (ZpBGe2uQfcn82 != null) {
                        }
                        p21Var.giKS3J6vZuNy(file3);
                        giKS3J6vZuNy();
                        return;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                        giKS3J6vZuNy();
                        return;
                    }
                }
                giKS3J6vZuNy();
            }
        }
    }

    public static defpackage.l21 giKS3J6vZuNy() {
        defpackage.l21 l21Var = new defpackage.l21(3);
        fWTAfUmVKrZq = l21Var;
        defpackage.z41 z41Var = ZpBGe2uQfcn8;
        z41Var.getClass();
        if (defpackage.IBvW5fLsPuHy.GE9mJIPrb8gP.gUjdnLbkVAaA(z41Var, null, l21Var)) {
            defpackage.IBvW5fLsPuHy.giKS3J6vZuNy(z41Var);
        }
        return fWTAfUmVKrZq;
    }
}
