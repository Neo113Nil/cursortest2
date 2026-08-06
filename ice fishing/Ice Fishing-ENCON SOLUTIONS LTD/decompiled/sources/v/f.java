package v;

import J1.u;
import N1.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.k;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l.f f8493a = new l.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f8494b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8495c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f8496d;

    static {
        i iVar = new i();
        iVar.f8503a = "fonts-androidx";
        iVar.f8504b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), iVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f8494b = threadPoolExecutor;
        f8495c = new Object();
        f8496d = new k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(String str, Context context, u uVar, int i2) {
        l.f fVar = f8493a;
        Typeface typeface = (Typeface) fVar.a(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            n a2 = AbstractC1053b.a(context, uVar);
            int i3 = 1;
            g[] gVarArr = (g[]) a2.f1224b;
            int i4 = a2.f1223a;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = -2;
                    if (i3 != 0) {
                        return new e(i3);
                    }
                    Typeface k2 = r.d.f8452a.k(context, gVarArr, i2);
                    if (k2 == null) {
                        return new e(-3);
                    }
                    fVar.b(str, k2);
                    return new e(k2);
                }
                i3 = -3;
                if (i3 != 0) {
                }
            } else {
                if (gVarArr != null && gVarArr.length != 0) {
                    int length = gVarArr.length;
                    i3 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        int i6 = gVarArr[i5].f8501e;
                        if (i6 == 0) {
                            i5++;
                        } else if (i6 >= 0) {
                            i3 = i6;
                        }
                    }
                }
                if (i3 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }
}
