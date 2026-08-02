package L;

import E2.M;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.google.android.gms.internal.ads.C0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.k;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0 f1703a = new C0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1704b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1705c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f1706d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1704b = threadPoolExecutor;
        f1705c = new Object();
        f1706d = new k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(String str, Context context, M m9, int i) {
        C0 c02 = f1703a;
        Typeface typeface = (Typeface) c02.a(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            I1.a a9 = c.a(context, m9);
            int i4 = 1;
            h[] hVarArr = (h[]) a9.f1304v;
            int i6 = a9.f1303u;
            if (i6 != 0) {
                if (i6 == 1) {
                    i4 = -2;
                    if (i4 != 0) {
                        return new f(i4);
                    }
                    Typeface d9 = G.j.f1038a.d(context, hVarArr, i);
                    if (d9 == null) {
                        return new f(-3);
                    }
                    c02.b(str, d9);
                    return new f(d9);
                }
                i4 = -3;
                if (i4 != 0) {
                }
            } else {
                if (hVarArr != null && hVarArr.length != 0) {
                    int length = hVarArr.length;
                    i4 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        int i10 = hVarArr[i9].f1711e;
                        if (i10 == 0) {
                            i9++;
                        } else if (i10 >= 0) {
                            i4 = i10;
                        }
                    }
                }
                if (i4 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
