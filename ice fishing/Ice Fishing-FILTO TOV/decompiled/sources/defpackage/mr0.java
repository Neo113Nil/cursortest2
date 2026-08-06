package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class mr0 {
    public static final /* synthetic */ int[] GWasM1elztuh = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static String AvO7iQsrTN(String str, int i) {
        return str + i;
    }

    public static void E7jCp8Ls(int i, int i2, int i3, int i4, int i5) {
        rj0.OOA6hdeuvCS(i);
        rj0.OOA6hdeuvCS(i2);
        rj0.OOA6hdeuvCS(i3);
        rj0.OOA6hdeuvCS(i4);
        rj0.OOA6hdeuvCS(i5);
    }

    public static vc EljAMC1QTz(String str) {
        t10.X1lG3V04pd(str);
        return new vc();
    }

    public static int GWasM1elztuh(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static String JFJ3QoxA(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static int OOA6hdeuvCS(y81 y81Var, int i, int i2) {
        return (y81Var.hashCode() + i) * i2;
    }

    public static /* synthetic */ void WIEu4Ya2g8(Object obj) {
        if (obj == null) {
            return;
        }
        o4.YmKjaVtbfp5Z();
    }

    public static int X1lG3V04pd(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static void XnEVoBF0td1l(int i, qx qxVar, int i2, r2 r2Var) {
        qxVar.dcDmLGVhzWm(Integer.valueOf(i));
        qxVar.Yi7zF1RB1(r2Var, Integer.valueOf(i2));
    }

    public static int Yi7zF1RB1(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static /* synthetic */ int YmKjaVtbfp5Z(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static String encWxUiV2(String str, int i, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ void iwATDS1i01k(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static String mOu10nynGul(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static StringBuilder rQPn8YBR(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void uFEq9NpZ(long j, StringBuilder sb, String str) {
        sb.append((Object) yb.mOu10nynGul(j));
        sb.append(str);
    }

    public static int xqGvceK5x(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }
}
