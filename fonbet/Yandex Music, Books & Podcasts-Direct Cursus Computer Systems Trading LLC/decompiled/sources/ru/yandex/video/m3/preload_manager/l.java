package ru.yandex.video.m3.preload_manager;

import android.os.Handler;
import android.os.Looper;
import com.connectsdk.service.command.ServiceCommand;
import defpackage.avs;
import defpackage.c5b;
import defpackage.dvt;
import defpackage.liq;
import defpackage.nnm;
import defpackage.r8;
import defpackage.vnm;
import defpackage.vp3;
import defpackage.xiu;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.preload_manager.PreloadException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class l {
    public final xiu a;
    public final ExecutorService b;
    public final Handler c;
    public final k d;
    public final long e;
    public volatile nnm f;
    public vnm g;
    public Future h;
    public m i;
    public boolean j;

    public l(xiu xiuVar, ExecutorService executorService, Handler handler, k kVar, long j, liq liqVar, vp3 vp3Var) {
        xiuVar.getClass();
        vp3Var.getClass();
        this.a = xiuVar;
        this.b = executorService;
        this.c = handler;
        this.d = kVar;
        this.e = j;
        this.j = true;
    }

    public static void d(l lVar, JobResult jobResult, PreloadException preloadException, List list, int i) {
        if ((i & 2) != 0) {
            preloadException = null;
        }
        PreloadException preloadException2 = preloadException;
        if ((i & 4) != 0) {
            list = c5b.a;
        }
        dvt.c0(lVar.c, new r8(lVar, jobResult, list, preloadException2, 11));
    }

    public final synchronized void a() {
        Intrinsics.d(Looper.myLooper(), this.c.getLooper());
        Timber.INSTANCE.d("downloading interrupted by PreloadWorkerJobData.cancel", new Object[0]);
        m mVar = this.i;
        if (mVar != null) {
            mVar.g = true;
            Iterator it = mVar.f.iterator();
            while (it.hasNext()) {
                ((avs) it.next()).cancel(true);
            }
        }
        Future future = this.h;
        if (future == null) {
            Intrinsics.j("future");
            throw null;
        }
        future.cancel(true);
    }

    public final nnm b() {
        nnm nnmVar = this.f;
        if (nnmVar != null) {
            return nnmVar;
        }
        Intrinsics.j(ServiceCommand.TYPE_REQ);
        throw null;
    }

    public final synchronized void c(List list) {
        Intrinsics.d(Looper.myLooper(), this.c.getLooper());
        if (Thread.interrupted()) {
            throw new PreloadException.CanceledOperationException.CanceledTracksDownload("Canceled right before downloader creation", null, c5b.a, 2, null);
        }
        this.i = new m(list, b(), this.a, this.b, this.e);
    }
}
