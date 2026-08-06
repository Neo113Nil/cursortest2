package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class k00 {
    public static final defpackage.ud1 JhCgjQRTAOCT;
    public static final defpackage.rj0 ZpBGe2uQfcn8 = new defpackage.rj0(16);
    public static final java.lang.Object fWTAfUmVKrZq;
    public static final java.util.concurrent.ThreadPoolExecutor giKS3J6vZuNy;

    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new defpackage.v41());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        giKS3J6vZuNy = threadPoolExecutor;
        fWTAfUmVKrZq = new java.lang.Object();
        JhCgjQRTAOCT = new defpackage.ud1();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.j00 ZpBGe2uQfcn8(java.lang.String str, android.content.Context context, java.util.List list) {
        android.graphics.Typeface typeface;
        int i;
        android.graphics.Typeface WmetiUbpKU9I;
        defpackage.rj0 rj0Var = ZpBGe2uQfcn8;
        defpackage.v70.Ns0WNyEWdPsk("getFontSync");
        try {
            typeface = (android.graphics.Typeface) rj0Var.fWTAfUmVKrZq(str);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return new defpackage.j00(-1);
        } catch (java.lang.Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new defpackage.j00(typeface);
        }
        defpackage.wg ZpBGe2uQfcn82 = defpackage.d00.ZpBGe2uQfcn8(context, list);
        java.util.List list2 = (java.util.List) ZpBGe2uQfcn82.giKS3J6vZuNy;
        int i2 = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
        if (i2 != 0) {
            if (i2 == 1) {
                i = -2;
                if (i == 0) {
                    return new defpackage.j00(i);
                }
                if (list2.size() <= 1 || android.os.Build.VERSION.SDK_INT < 29) {
                    defpackage.y00[] y00VarArr = (defpackage.y00[]) list2.get(0);
                    defpackage.q70 q70Var = defpackage.rq1.ZpBGe2uQfcn8;
                    defpackage.v70.Ns0WNyEWdPsk("TypefaceCompat.createFromFontInfo");
                    WmetiUbpKU9I = defpackage.rq1.ZpBGe2uQfcn8.WmetiUbpKU9I(context, y00VarArr);
                    android.os.Trace.endSection();
                    if (WmetiUbpKU9I != null) {
                        return new defpackage.j00(-3);
                    }
                    rj0Var.JhCgjQRTAOCT(str, WmetiUbpKU9I);
                    return new defpackage.j00(WmetiUbpKU9I);
                }
                defpackage.q70 q70Var2 = defpackage.rq1.ZpBGe2uQfcn8;
                defpackage.v70.Ns0WNyEWdPsk("TypefaceCompat.createFromFontInfoWithFallback");
                WmetiUbpKU9I = defpackage.rq1.ZpBGe2uQfcn8.s0TASMVLSWD5(context, list2);
                android.os.Trace.endSection();
                if (WmetiUbpKU9I != null) {
                }
            }
            i = -3;
            if (i == 0) {
            }
        } else {
            defpackage.y00[] y00VarArr2 = (defpackage.y00[]) list2.get(0);
            if (y00VarArr2 != null && y00VarArr2.length != 0) {
                int length = y00VarArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i = 0;
                        break;
                    }
                    int i4 = y00VarArr2[i3].oh71FJcDz6S2;
                    if (i4 == 0) {
                        i3++;
                    } else if (i4 >= 0) {
                        i = i4;
                    }
                }
                if (i == 0) {
                }
            }
            i = 1;
            if (i == 0) {
            }
        }
    }
}
