package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class zh {
    public static final Object MdtA4re8;
    public static final ThreadPoolExecutor NCTxEWno;
    public static final mq qoPGr6Ce = new mq(16);
    public static final p70 wxUZMvaN;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new z20());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        NCTxEWno = threadPoolExecutor;
        MdtA4re8 = new Object();
        wxUZMvaN = new p70(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yh NCTxEWno(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface P7K7Inc8;
        mq mqVar = qoPGr6Ce;
        f50.wxUZMvaN("getFontSync");
        try {
            typeface = (Typeface) mqVar.Qr9iLBAD(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new yh(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new yh(typeface);
        }
        DPHdAVYO qoPGr6Ce2 = sh.qoPGr6Ce(context, list);
        List list2 = (List) qoPGr6Ce2.NCTxEWno;
        int i3 = qoPGr6Ce2.qoPGr6Ce;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new yh(i2);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    ei[] eiVarArr = (ei[]) list2.get(0);
                    e50 e50Var = me0.qoPGr6Ce;
                    f50.wxUZMvaN("TypefaceCompat.createFromFontInfo");
                    P7K7Inc8 = me0.qoPGr6Ce.P7K7Inc8(context, eiVarArr, i);
                    Trace.endSection();
                    if (P7K7Inc8 != null) {
                        return new yh(-3);
                    }
                    mqVar.ow5vqvCr(str, P7K7Inc8);
                    return new yh(P7K7Inc8);
                }
                e50 e50Var2 = me0.qoPGr6Ce;
                f50.wxUZMvaN("TypefaceCompat.createFromFontInfoWithFallback");
                P7K7Inc8 = me0.qoPGr6Ce.b2ZJblxo(context, list2, i);
                Trace.endSection();
                if (P7K7Inc8 != null) {
                }
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            ei[] eiVarArr2 = (ei[]) list2.get(0);
            if (eiVarArr2 != null && eiVarArr2.length != 0) {
                int length = eiVarArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = eiVarArr2[i4].P7K7Inc8;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
    }

    public static String qoPGr6Ce(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((th) list.get(i2)).b2ZJblxo);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
