package L;

import C2.N;
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
    public static final C0 f1594a = new C0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1595b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1596c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f1597d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1595b = threadPoolExecutor;
        f1596c = new Object();
        f1597d = new k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(String str, Context context, N n9, int i) {
        C0 c02 = f1594a;
        Typeface typeface = (Typeface) c02.a(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            G1.a a9 = c.a(context, n9);
            int i6 = 1;
            h[] hVarArr = (h[]) a9.f1051v;
            int i9 = a9.f1050u;
            if (i9 != 0) {
                if (i9 == 1) {
                    i6 = -2;
                    if (i6 != 0) {
                        return new f(i6);
                    }
                    Typeface e9 = G.j.f1012a.e(context, hVarArr, i);
                    if (e9 == null) {
                        return new f(-3);
                    }
                    c02.b(str, e9);
                    return new f(e9);
                }
                i6 = -3;
                if (i6 != 0) {
                }
            } else {
                if (hVarArr != null && hVarArr.length != 0) {
                    int length = hVarArr.length;
                    i6 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        int i11 = hVarArr[i10].f1602e;
                        if (i11 == 0) {
                            i10++;
                        } else if (i11 >= 0) {
                            i6 = i11;
                        }
                    }
                }
                if (i6 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
