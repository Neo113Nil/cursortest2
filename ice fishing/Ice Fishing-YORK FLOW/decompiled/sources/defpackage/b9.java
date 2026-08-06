package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b9 {
    public final defpackage.s81 ZpBGe2uQfcn8;
    public final defpackage.lt0 giKS3J6vZuNy;

    /* JADX WARN: Multi-variable type inference failed */
    public b9(defpackage.s81 s81Var, defpackage.lt0 lt0Var) {
        this.ZpBGe2uQfcn8 = s81Var;
        this.giKS3J6vZuNy = lt0Var;
        if ((s81Var == null ? lt0Var : s81Var) != null) {
            return;
        }
        defpackage.h7.w7APNrr0aGRc("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void ZpBGe2uQfcn8(defpackage.Jkfc0NcwyPL8 jkfc0NcwyPL8) {
        defpackage.s81 s81Var = this.ZpBGe2uQfcn8;
        if (s81Var != null) {
            defpackage.s81.fWTAfUmVKrZq(s81Var, (defpackage.z8) jkfc0NcwyPL8.giKS3J6vZuNy);
            return;
        }
        defpackage.lt0 lt0Var = this.giKS3J6vZuNy;
        if (lt0Var == null) {
            defpackage.h7.P05cfTpS5W5L("Unreachable");
            return;
        }
        defpackage.a9 a9Var = (defpackage.a9) jkfc0NcwyPL8.ZpBGe2uQfcn8;
        a9Var.getClass();
        defpackage.ft0 ft0Var = new defpackage.ft0(a9Var, new defpackage.gt0(a9Var, null));
        a9Var.ZpBGe2uQfcn8.add(ft0Var);
        defpackage.s81.fWTAfUmVKrZq(lt0Var.ZpBGe2uQfcn8(), ft0Var);
    }

    public final void giKS3J6vZuNy(defpackage.Jkfc0NcwyPL8 jkfc0NcwyPL8) {
        boolean isTerminated;
        if (this.ZpBGe2uQfcn8 != null) {
            ((defpackage.z8) jkfc0NcwyPL8.giKS3J6vZuNy).WDYagTQQm9ns();
            return;
        }
        if (this.giKS3J6vZuNy == null) {
            defpackage.h7.P05cfTpS5W5L("Unreachable");
            return;
        }
        defpackage.a9 a9Var = (defpackage.a9) jkfc0NcwyPL8.ZpBGe2uQfcn8;
        java.util.ArrayList arrayList = a9Var.ZpBGe2uQfcn8;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = a9Var.fWTAfUmVKrZq;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                int size = arrayList.size();
                while (i < size) {
                    java.lang.Object obj = arrayList.get(i);
                    i++;
                    ((defpackage.ft0) obj).WDYagTQQm9ns();
                }
                arrayList.clear();
                return;
            }
            java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) it.next();
            if (autoCloseable instanceof java.lang.AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof java.util.concurrent.ExecutorService) {
                java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) autoCloseable;
                if (executorService != java.util.concurrent.ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
                        } catch (java.lang.InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof android.content.res.TypedArray) {
                ((android.content.res.TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof android.media.MediaMetadataRetriever) {
                ((android.media.MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof android.media.MediaDrm)) {
                    throw new java.lang.IllegalArgumentException();
                }
                ((android.media.MediaDrm) autoCloseable).release();
            }
        }
    }
}
