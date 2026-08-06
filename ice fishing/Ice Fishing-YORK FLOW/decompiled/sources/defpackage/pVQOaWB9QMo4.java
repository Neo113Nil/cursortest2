package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class pVQOaWB9QMo4 {
    public static /* synthetic */ void BHfvd2J71qpO(java.lang.AutoCloseable autoCloseable) {
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

    public static java.lang.String GE9mJIPrb8gP(java.lang.StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static int JhCgjQRTAOCT(int i, int i2, boolean z) {
        return (java.lang.Boolean.hashCode(z) + i) * i2;
    }

    public static java.lang.String Ns0WNyEWdPsk(java.lang.StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static java.lang.String P05cfTpS5W5L(int i, int i2, java.lang.String str, java.lang.String str2) {
        return str + i + str2 + i2;
    }

    public static java.lang.ClassCastException QiMR8OkAhezm(java.lang.Object obj) {
        obj.getClass();
        return new java.lang.ClassCastException();
    }

    public static void T1fB7bDYiVJQ(int i, defpackage.e30 e30Var, int i2, defpackage.h5 h5Var) {
        e30Var.EgL5gQQnyJKX(java.lang.Integer.valueOf(i));
        e30Var.giKS3J6vZuNy(h5Var, java.lang.Integer.valueOf(i2));
    }

    public static int WDYagTQQm9ns(defpackage.pn1 pn1Var, int i, int i2) {
        return (pn1Var.hashCode() + i) * i2;
    }

    public static void WmetiUbpKU9I(long j, java.lang.StringBuilder sb, java.lang.String str) {
        sb.append((java.lang.Object) defpackage.pf.e6mdH7fiFuta(j));
        sb.append(str);
    }

    public static void XntWc4eZSQ8j(int i, defpackage.e30 e30Var, defpackage.h5 h5Var, defpackage.e30 e30Var2, defpackage.n nVar) {
        defpackage.t80.w6IV1lieBIux(h5Var, e30Var, java.lang.Integer.valueOf(i));
        defpackage.t80.Mearx7yMn90V(e30Var2, nVar);
    }

    public static /* synthetic */ void ZVVdXbWmyCSK(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        defpackage.p81.ZpBGe2uQfcn8();
    }

    public static int ZpBGe2uQfcn8(float f, int i, int i2) {
        return (java.lang.Float.hashCode(f) + i) * i2;
    }

    public static java.lang.String e6mdH7fiFuta(java.lang.String str, int i) {
        return str + i;
    }

    public static java.lang.String fNwYGHIYeJcR(java.lang.StringBuilder sb, java.lang.String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static int fWTAfUmVKrZq(int i, int i2, long j) {
        return (java.lang.Long.hashCode(j) + i) * i2;
    }

    public static void gUjdnLbkVAaA(int i, int i2, int i3, int i4, int i5) {
        defpackage.v70.giKS3J6vZuNy(i);
        defpackage.v70.giKS3J6vZuNy(i2);
        defpackage.v70.giKS3J6vZuNy(i3);
        defpackage.v70.giKS3J6vZuNy(i4);
        defpackage.v70.giKS3J6vZuNy(i5);
    }

    public static int giKS3J6vZuNy(int i, int i2, int i3) {
        return (java.lang.Integer.hashCode(i) + i2) * i3;
    }

    public static java.lang.StringBuilder h3m55N1URyyK(int i, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static defpackage.vg oh71FJcDz6S2(java.lang.String str) {
        defpackage.e80.fWTAfUmVKrZq(str);
        return new defpackage.vg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s0TASMVLSWD5(defpackage.a71 a71Var) {
        boolean isTerminated;
        if (a71Var instanceof java.lang.AutoCloseable) {
            a71Var.close();
            return;
        }
        if (!(a71Var instanceof java.util.concurrent.ExecutorService)) {
            if (a71Var instanceof android.content.res.TypedArray) {
                ((android.content.res.TypedArray) a71Var).recycle();
                return;
            } else if (a71Var instanceof android.media.MediaMetadataRetriever) {
                ((android.media.MediaMetadataRetriever) a71Var).release();
                return;
            } else {
                if (!(a71Var instanceof android.media.MediaDrm)) {
                    throw new java.lang.IllegalArgumentException();
                }
                ((android.media.MediaDrm) a71Var).release();
                return;
            }
        }
        java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) a71Var;
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
}
