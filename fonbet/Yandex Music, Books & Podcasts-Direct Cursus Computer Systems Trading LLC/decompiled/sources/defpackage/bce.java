package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class bce extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ mmo s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bce(mmo mmoVar, int i) {
        super(0);
        this.r = i;
        this.s = mmoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2;
        pkn pknVar;
        long j;
        switch (this.r) {
            case 0:
                Context context = (Context) this.s.b;
                Bitmap.Config[] configArr = k.a;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                j4x j4xVar = new j4x(15);
                if (d > 0.0d) {
                    Bitmap.Config[] configArr2 = k.a;
                    try {
                        Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                        systemService2.getClass();
                        ActivityManager activityManager = (ActivityManager) systemService2;
                        i2 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused2) {
                        i2 = 256;
                    }
                    double d2 = 1024;
                    i = (int) (d * i2 * d2 * d2);
                } else {
                    i = 0;
                }
                return new vkn(i > 0 ? new nnd(i, j4xVar) : new efo(27, j4xVar), j4xVar);
            default:
                h1b h1bVar = h1b.g;
                Context context2 = (Context) this.s.b;
                synchronized (h1bVar) {
                    try {
                        pknVar = h1b.h;
                        if (pknVar == null) {
                            b9f b9fVar = lac.a;
                            dq7 dq7Var = ca8.a;
                            mn7 mn7Var = mn7.d;
                            Bitmap.Config[] configArr3 = k.a;
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File l = cbc.l(cacheDir, "image_cache");
                            String str = cak.b;
                            cak N = h1b.N(l);
                            if (0.02d > 0.0d) {
                                j = 10485760;
                                try {
                                    File file = N.toFile();
                                    file.mkdir();
                                    StatFs statFs = new StatFs(file.getAbsolutePath());
                                    j = yhn.f((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                } catch (Exception unused3) {
                                }
                            } else {
                                j = 0;
                            }
                            pkn pknVar2 = new pkn(j, b9fVar, N, mn7Var);
                            h1b.h = pknVar2;
                            pknVar = pknVar2;
                        }
                    } finally {
                    }
                }
                return pknVar;
        }
    }
}
