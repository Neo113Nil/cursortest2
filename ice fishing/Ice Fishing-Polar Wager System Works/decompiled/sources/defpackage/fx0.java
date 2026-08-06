package defpackage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class fx0 {
    public static final /* synthetic */ int[] IHQe1A4L2xu = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static defpackage.cf AARZUJiTa(java.lang.String str) {
        defpackage.x50.r1MBDhnF(str);
        return new defpackage.cf();
    }

    public static void DFo87pBq1E5(int i, int i2, int i3, int i4, int i5) {
        defpackage.c80.oh6vYeIP(i);
        defpackage.c80.oh6vYeIP(i2);
        defpackage.c80.oh6vYeIP(i3);
        defpackage.c80.oh6vYeIP(i4);
        defpackage.c80.oh6vYeIP(i5);
    }

    public static java.lang.String EXtogiMhuM(int i, int i2, java.lang.String str, java.lang.String str2) {
        return str + i + str2 + i2;
    }

    public static void EgCjBq0SZwJ(java.lang.StringBuilder sb, int i, java.lang.String str, int i2, java.lang.String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static int F7NU4MC0GW(int i, int i2, java.lang.String str) {
        return (str.hashCode() + i) * i2;
    }

    public static /* synthetic */ void G3OKOH3wZRC(java.lang.AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof java.lang.AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof java.util.concurrent.ExecutorService)) {
            if (autoCloseable instanceof android.content.res.TypedArray) {
                ((android.content.res.TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof android.media.MediaMetadataRetriever) {
                ((android.media.MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof android.media.MediaDrm)) {
                    throw new java.lang.IllegalArgumentException();
                }
                ((android.media.MediaDrm) autoCloseable).release();
                return;
            }
        }
        java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) autoCloseable;
        if (executorService == java.util.concurrent.ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static int IHQe1A4L2xu(float f, int i, int i2) {
        return (java.lang.Float.hashCode(f) + i) * i2;
    }

    public static java.lang.StringBuilder JlrlGoKF(int i, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void QoRHpC4k(defpackage.k31 k31Var) {
        boolean isTerminated;
        if (k31Var instanceof java.lang.AutoCloseable) {
            k31Var.close();
            return;
        }
        if (!(k31Var instanceof java.util.concurrent.ExecutorService)) {
            if (k31Var instanceof android.content.res.TypedArray) {
                ((android.content.res.TypedArray) k31Var).recycle();
                return;
            } else if (k31Var instanceof android.media.MediaMetadataRetriever) {
                ((android.media.MediaMetadataRetriever) k31Var).release();
                return;
            } else {
                if (!(k31Var instanceof android.media.MediaDrm)) {
                    throw new java.lang.IllegalArgumentException();
                }
                ((android.media.MediaDrm) k31Var).release();
                return;
            }
        }
        java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) k31Var;
        if (executorService == java.util.concurrent.ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static java.lang.String SH1y5HwkJhh(java.lang.String str, int i) {
        return str + i;
    }

    public static void SyNS6RMn(int i, defpackage.t10 t10Var, int i2, defpackage.g4 g4Var) {
        t10Var.OtkytngK3Mr(java.lang.Integer.valueOf(i));
        t10Var.oh6vYeIP(g4Var, java.lang.Integer.valueOf(i2));
    }

    public static int adDC3e2L(int i, int i2, boolean z) {
        return (java.lang.Boolean.hashCode(z) + i) * i2;
    }

    public static void cnag84Bm(long j, java.lang.StringBuilder sb, java.lang.String str) {
        sb.append((java.lang.Object) defpackage.ae.riuEU0zW4(j));
        sb.append(str);
    }

    public static java.lang.String ez2rX8ReCYw(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ int fnWB2E7cs(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ void kd6TUFXn(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        defpackage.db.kd6TUFXn();
    }

    public static int oh6vYeIP(int i, int i2, int i3) {
        return (java.lang.Integer.hashCode(i) + i2) * i3;
    }

    public static int r1MBDhnF(int i, int i2, long j) {
        return (java.lang.Long.hashCode(j) + i) * i2;
    }

    public static java.lang.String riuEU0zW4(int i, java.lang.String str, java.lang.String str2) {
        return str + i + str2;
    }

    public static int xiZrDbcSW0(defpackage.dg1 dg1Var, int i, int i2) {
        return (dg1Var.hashCode() + i) * i2;
    }
}
