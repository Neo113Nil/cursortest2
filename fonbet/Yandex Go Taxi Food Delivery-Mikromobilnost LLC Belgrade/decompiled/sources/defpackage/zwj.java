package defpackage;

import android.os.StatFs;
import java.io.File;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class zwj {
    public oq90 a;
    public final hfx b = r1r.a;
    public double c = 0.02d;
    public long d = 10485760;
    public long e = 262144000;
    public final EmptyCoroutineContext f = EmptyCoroutineContext.a;

    public final sci0 a() {
        long j;
        oq90 oq90Var = this.a;
        if (oq90Var == null) {
            ny61.r("directory == null");
            return null;
        }
        double d = this.c;
        if (d > 0.0d) {
            try {
                File file = oq90Var.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                j = y6i0.f((long) (d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), this.d, this.e);
            } catch (Exception unused) {
                j = this.d;
            }
        } else {
            j = 0;
        }
        return new sci0(j, oq90Var, this.b, this.f);
    }
}
