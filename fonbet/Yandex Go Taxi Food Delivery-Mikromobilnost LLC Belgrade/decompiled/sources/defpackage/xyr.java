package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class xyr {
    public static final mzz a = new mzz(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final ycs0 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i30(4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new ycs0();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((pyr) list.get(i2)).h);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, NameNotFoundException -> 0x0098, all -> 0x0074, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:24:0x0070, B:26:0x0083, B:29:0x008f, B:34:0x0075, B:35:0x0078, B:36:0x0079, B:38:0x002e, B:40:0x0034, B:43:0x0038, B:45:0x003d, B:47:0x0048, B:56:0x0098, B:23:0x006a), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00a2, TRY_ENTER, TryCatch #1 {all -> 0x00a2, NameNotFoundException -> 0x0098, all -> 0x0074, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:24:0x0070, B:26:0x0083, B:29:0x008f, B:34:0x0075, B:35:0x0078, B:36:0x0079, B:38:0x002e, B:40:0x0034, B:43:0x0038, B:45:0x003d, B:47:0x0048, B:56:0x0098, B:23:0x006a), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wyr b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface a2;
        mzz mzzVar = a;
        Trace.beginSection(ffx.f0("getFontSync"));
        try {
            typeface = (Typeface) mzzVar.c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new wyr(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new wyr(typeface);
        }
        nzr a3 = nyr.a(context, list);
        List list2 = a3.b;
        int i3 = a3.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new wyr(i2);
                }
                if (list2.size() > 1) {
                    gp11 gp11Var = ep11.a;
                    Trace.beginSection(ffx.f0("TypefaceCompat.createFromFontInfoWithFallback"));
                    a2 = ep11.a.a(context, i, list2);
                    Trace.endSection();
                } else {
                    a2 = ep11.a(context, a3.a(), i);
                }
                if (a2 == null) {
                    return new wyr(-3);
                }
                mzzVar.d(str, a2);
                return new wyr(a2);
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            ozr[] a4 = a3.a();
            if (a4 != null && a4.length != 0) {
                int length = a4.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = a4[i4].f;
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
        Trace.endSection();
    }
}
