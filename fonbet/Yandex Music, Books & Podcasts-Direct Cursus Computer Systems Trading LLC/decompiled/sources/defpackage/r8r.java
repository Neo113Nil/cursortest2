package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class r8r implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tao b;

    public /* synthetic */ r8r(tao taoVar, int i) {
        this.a = i;
        this.b = taoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        int i = this.a;
        tao taoVar = this.b;
        switch (i) {
            case 0:
                return new x8r((xzi) taoVar.b, (is4) taoVar.c, (fi1) taoVar.e);
            default:
                b9f b9fVar = lac.a;
                dq7 dq7Var = ca8.a;
                mn7 mn7Var = mn7.d;
                File cacheDir = ((Context) taoVar.a).getCacheDir();
                cacheDir.mkdirs();
                File l = cbc.l(cacheDir, "image_cache");
                String str = cak.b;
                cak N = h1b.N(l);
                String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                absolutePath.getClass();
                try {
                    StatFs statFs = new StatFs(absolutePath);
                    j = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
                } catch (IllegalArgumentException unused) {
                    j = 0;
                }
                long d = yhn.d((int) (j * 0.1d), 262144000, 1073741824);
                if (d <= 0) {
                    xq0.x("size must be > 0.");
                    return null;
                }
                if (0.0d > 0.0d) {
                    try {
                        File file = N.toFile();
                        file.mkdir();
                        StatFs statFs2 = new StatFs(file.getAbsolutePath());
                        d = yhn.f((long) (0.0d * statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()), 10485760L, 262144000L);
                    } catch (Exception unused2) {
                        d = 10485760;
                    }
                }
                return new pkn(d, b9fVar, N, mn7Var);
        }
    }
}
