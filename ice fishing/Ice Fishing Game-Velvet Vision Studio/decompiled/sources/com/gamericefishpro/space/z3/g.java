package com.gamericefishpro.space.z3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.gamericefishpro.space.g0.r;
import com.gamericefishpro.space.r5.s0;
import com.gamericefishpro.space.t.r0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final s0 a = new s0(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final r0 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new r0(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((c) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static f b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceH;
        s0 s0Var = a;
        com.gamericefishpro.space.u6.f.k("getFontSync");
        try {
            Typeface typeface = (Typeface) s0Var.d(str);
            if (typeface != null) {
                f fVar = new f(typeface);
                Trace.endSection();
                return fVar;
            }
            try {
                r rVarA = b.a(context, list);
                List list2 = rVarA.b;
                int i3 = rVarA.a;
                if (i3 == 0) {
                    h[] hVarArr = (h[]) list2.get(0);
                    if (hVarArr == null || hVarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = hVarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = hVarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    f fVar2 = new f(i2);
                    Trace.endSection();
                    return fVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    h[] hVarArr2 = (h[]) list2.get(0);
                    com.gamericefishpro.space.a.a aVar = com.gamericefishpro.space.u3.f.a;
                    com.gamericefishpro.space.u6.f.k("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceH = com.gamericefishpro.space.u3.f.a.h(context, hVarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    com.gamericefishpro.space.a.a aVar2 = com.gamericefishpro.space.u3.f.a;
                    com.gamericefishpro.space.u6.f.k("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceH = com.gamericefishpro.space.u3.f.a.i(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceH == null) {
                    f fVar3 = new f(-3);
                    Trace.endSection();
                    return fVar3;
                }
                s0Var.g(str, typefaceH);
                f fVar4 = new f(typefaceH);
                Trace.endSection();
                return fVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                f fVar5 = new f(-1);
                Trace.endSection();
                return fVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
