package e3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.q;
import s.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final q f2086a = new q(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2087b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2088c;

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f2089d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2087b = threadPoolExecutor;
        f2088c = new Object();
        f2089d = new q0(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb.append(((e) list.get(i11)).f2076g);
            sb.append("-");
            sb.append(i10);
            if (i11 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h b(String str, Context context, List list, int i10) {
        Typeface typeface;
        int i11;
        Typeface u10;
        q qVar = f2086a;
        x4.f.y("getFontSync");
        try {
            typeface = (Typeface) qVar.a(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new h(typeface);
        }
        j a6 = d.a(context, list);
        List list2 = (List) a6.f2092c;
        int i12 = a6.f2091b;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = -2;
                if (i11 == 0) {
                    return new h(i11);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    k[] kVarArr = (k[]) list2.get(0);
                    v6.a aVar = a3.d.f199a;
                    x4.f.y("TypefaceCompat.createFromFontInfo");
                    u10 = a3.d.f199a.u(context, kVarArr, i10);
                    Trace.endSection();
                    if (u10 != null) {
                        return new h(-3);
                    }
                    qVar.b(str, u10);
                    return new h(u10);
                }
                v6.a aVar2 = a3.d.f199a;
                x4.f.y("TypefaceCompat.createFromFontInfoWithFallback");
                u10 = a3.d.f199a.v(context, list2, i10);
                Trace.endSection();
                if (u10 != null) {
                }
            }
            i11 = -3;
            if (i11 == 0) {
            }
        } else {
            k[] kVarArr2 = (k[]) list2.get(0);
            if (kVarArr2 != null && kVarArr2.length != 0) {
                int length = kVarArr2.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        i11 = 0;
                        break;
                    }
                    int i14 = kVarArr2[i13].f2098f;
                    if (i14 == 0) {
                        i13++;
                    } else if (i14 >= 0) {
                        i11 = i14;
                    }
                }
                if (i11 == 0) {
                }
            }
            i11 = 1;
            if (i11 == 0) {
            }
        }
    }
}
