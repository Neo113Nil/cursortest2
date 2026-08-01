package L;

import a.AbstractC0078a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.j0;
import r.C0342j;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f427a = new j0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f428b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f429c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0342j f430d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f428b = threadPoolExecutor;
        f429c = new Object();
        f430d = new C0342j(0);
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((e) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, all -> 0x0078, all -> 0x00aa, NameNotFoundException -> 0x00af, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0052, B:20:0x005b, B:22:0x0061, B:24:0x0067, B:27:0x0074, B:29:0x0095, B:32:0x00a1, B:37:0x0079, B:38:0x007c, B:39:0x007d, B:42:0x0090, B:45:0x00ab, B:46:0x00ae, B:48:0x0030, B:50:0x0038, B:53:0x003c, B:55:0x0040, B:57:0x004b, B:66:0x00af, B:26:0x006e, B:41:0x008a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #1 {all -> 0x0019, all -> 0x0078, all -> 0x00aa, NameNotFoundException -> 0x00af, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0052, B:20:0x005b, B:22:0x0061, B:24:0x0067, B:27:0x0074, B:29:0x0095, B:32:0x00a1, B:37:0x0079, B:38:0x007c, B:39:0x007d, B:42:0x0090, B:45:0x00ab, B:46:0x00ae, B:48:0x0030, B:50:0x0038, B:53:0x003c, B:55:0x0040, B:57:0x004b, B:66:0x00af, B:26:0x006e, B:41:0x008a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, all -> 0x0078, all -> 0x00aa, NameNotFoundException -> 0x00af, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0052, B:20:0x005b, B:22:0x0061, B:24:0x0067, B:27:0x0074, B:29:0x0095, B:32:0x00a1, B:37:0x0079, B:38:0x007c, B:39:0x007d, B:42:0x0090, B:45:0x00ab, B:46:0x00ae, B:48:0x0030, B:50:0x0038, B:53:0x003c, B:55:0x0040, B:57:0x004b, B:66:0x00af, B:26:0x006e, B:41:0x008a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x0019, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0019, all -> 0x0078, all -> 0x00aa, NameNotFoundException -> 0x00af, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0052, B:20:0x005b, B:22:0x0061, B:24:0x0067, B:27:0x0074, B:29:0x0095, B:32:0x00a1, B:37:0x0079, B:38:0x007c, B:39:0x007d, B:42:0x0090, B:45:0x00ab, B:46:0x00ae, B:48:0x0030, B:50:0x0038, B:53:0x003c, B:55:0x0040, B:57:0x004b, B:66:0x00af, B:26:0x006e, B:41:0x008a), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface p2;
        h0.f.b("getFontSync");
        j0 j0Var = f427a;
        try {
            typeface = (Typeface) j0Var.f(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new h(typeface);
        }
        B0.g a2 = d.a(context, list);
        int i3 = a2.f46a;
        List list2 = (List) a2.f47b;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new h(i2);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    j[] jVarArr = (j[]) list2.get(0);
                    AbstractC0078a abstractC0078a = G.f.f268a;
                    h0.f.b("TypefaceCompat.createFromFontInfo");
                    p2 = G.f.f268a.p(context, jVarArr, i);
                    Trace.endSection();
                    if (p2 != null) {
                        return new h(-3);
                    }
                    j0Var.j(str, p2);
                    return new h(p2);
                }
                AbstractC0078a abstractC0078a2 = G.f.f268a;
                h0.f.b("TypefaceCompat.createFromFontInfoWithFallback");
                p2 = G.f.f268a.q(context, list2, i);
                Trace.endSection();
                if (p2 != null) {
                }
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            j[] jVarArr2 = (j[]) list2.get(0);
            if (jVarArr2 != null && jVarArr2.length != 0) {
                int length = jVarArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = jVarArr2[i4].e;
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
}
