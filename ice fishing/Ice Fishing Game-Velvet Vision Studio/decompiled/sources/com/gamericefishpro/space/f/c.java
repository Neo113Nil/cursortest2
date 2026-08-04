package com.gamericefishpro.space.f;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.gamericefishpro.space.d.n;
import com.gamericefishpro.space.d.o;
import com.gamericefishpro.space.d.r;
import com.gamericefishpro.space.tb.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final s a;
    public final r b;

    public c(s sVar, r rVar) {
        this.a = sVar;
        this.b = rVar;
        if ((sVar == null ? rVar : sVar) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }

    public final void a(b bVar) {
        s sVar = this.a;
        if (sVar != null) {
            s.a(sVar, (a) bVar.b);
            return;
        }
        r rVar = this.b;
        if (rVar == null) {
            throw new IllegalStateException("Unreachable");
        }
        com.gamericefishpro.space.d.s onBackPressedCallback = (com.gamericefishpro.space.d.s) bVar.a;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        o info = new o(onBackPressedCallback, null);
        Intrinsics.checkNotNullParameter(info, "info");
        n nVar = new n(onBackPressedCallback, info);
        onBackPressedCallback.a.add(nVar);
        s.a(rVar.a().c, nVar);
    }

    public final void b(b bVar) {
        boolean zIsTerminated;
        if (this.a != null) {
            ((a) bVar.b).e();
            return;
        }
        if (this.b == null) {
            throw new IllegalStateException("Unreachable");
        }
        com.gamericefishpro.space.d.s sVar = (com.gamericefishpro.space.d.s) bVar.a;
        ArrayList arrayList = sVar.a;
        CopyOnWriteArrayList copyOnWriteArrayList = sVar.c;
        Iterator it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((n) obj).e();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }
}
