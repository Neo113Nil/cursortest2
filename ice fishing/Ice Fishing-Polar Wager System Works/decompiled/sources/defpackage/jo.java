package defpackage;

/* loaded from: classes.dex */
public final class jo implements defpackage.hq {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final /* synthetic */ java.lang.Object oh6vYeIP;
    public final /* synthetic */ java.lang.Object r1MBDhnF;

    public /* synthetic */ jo(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
        this.r1MBDhnF = obj2;
    }

    @Override // defpackage.hq
    public final void IHQe1A4L2xu() {
        boolean isTerminated;
        int i = this.IHQe1A4L2xu;
        java.lang.Object obj = this.r1MBDhnF;
        java.lang.Object obj2 = this.oh6vYeIP;
        switch (i) {
            case 0:
                ((defpackage.nm0) obj2).JlrlGoKF.SH1y5HwkJhh.xiZrDbcSW0((defpackage.go) obj);
                return;
            case 1:
                ((defpackage.bd0) obj2).AARZUJiTa.ez2rX8ReCYw(obj);
                return;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.Iterator it = ((java.util.List) ((defpackage.ec1) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((defpackage.gg) obj).oh6vYeIP().r1MBDhnF((defpackage.nm0) it.next());
                }
                return;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.q7 q7Var = (defpackage.q7) obj2;
                defpackage.mg mgVar = (defpackage.mg) obj;
                if (q7Var.IHQe1A4L2xu != null) {
                    mgVar.oh6vYeIP.adDC3e2L();
                    return;
                }
                if (q7Var.oh6vYeIP == null) {
                    defpackage.db.AARZUJiTa("Unreachable");
                    return;
                }
                defpackage.p7 p7Var = mgVar.IHQe1A4L2xu;
                java.util.ArrayList arrayList = p7Var.IHQe1A4L2xu;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = p7Var.r1MBDhnF;
                java.util.Iterator it2 = copyOnWriteArrayList.iterator();
                it2.getClass();
                while (true) {
                    int i2 = 0;
                    if (!it2.hasNext()) {
                        copyOnWriteArrayList.clear();
                        int size = arrayList.size();
                        while (i2 < size) {
                            java.lang.Object obj3 = arrayList.get(i2);
                            i2++;
                            ((defpackage.nq0) obj3).adDC3e2L();
                        }
                        arrayList.clear();
                        return;
                    }
                    java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) it2.next();
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
                                    if (i2 == 0) {
                                        executorService.shutdownNow();
                                        i2 = 1;
                                    }
                                }
                            }
                            if (i2 != 0) {
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
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.li1) obj2).SH1y5HwkJhh.remove((defpackage.li1) obj);
                return;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.li1 li1Var = (defpackage.li1) obj2;
                li1Var.getClass();
                defpackage.fi1 fi1Var = (defpackage.fi1) ((defpackage.gi1) obj).oh6vYeIP.getValue();
                if (fi1Var != null) {
                    li1Var.riuEU0zW4.remove(fi1Var.adDC3e2L);
                    return;
                }
                return;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.li1) obj2).riuEU0zW4.remove((defpackage.ji1) obj);
                return;
            default:
                defpackage.wo1 wo1Var = (defpackage.wo1) obj2;
                android.view.View view = (android.view.View) obj;
                int i3 = wo1Var.kNAkVymC - 1;
                wo1Var.kNAkVymC = i3;
                if (i3 == 0) {
                    int i4 = defpackage.mm1.IHQe1A4L2xu;
                    defpackage.hm1.oh6vYeIP(view, null);
                    defpackage.mm1.IHQe1A4L2xu(view, null);
                    view.removeOnAttachStateChangeListener(wo1Var.V7bD7b8KA);
                    return;
                }
                return;
        }
    }
}
