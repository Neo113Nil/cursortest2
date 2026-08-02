package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.preload_manager.JobResult;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.d;
import ru.yandex.video.m3.preload_manager.j;
import ru.yandex.video.m3.preload_manager.l;
import ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker$PreloadErrorData;
import ru.yandex.video.m3.preload_manager.tracking.a;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class vnm extends uif implements ryc {
    public final /* synthetic */ nnm r;
    public final /* synthetic */ wnm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnm(nnm nnmVar, wnm wnmVar) {
        super(4);
        this.r = nnmVar;
        this.s = wnmVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        nnm b;
        l lVar = (l) obj;
        JobResult jobResult = (JobResult) obj2;
        List list = (List) obj3;
        PreloadException preloadException = (PreloadException) obj4;
        lVar.getClass();
        jobResult.getClass();
        list.getClass();
        Timber.INSTANCE.d("finished job of request = " + this.r + ", status = " + jobResult.name() + " error = " + preloadException, new Object[0]);
        Intrinsics.d(this.s.b.getLooper(), Looper.myLooper());
        int G = xz0.G(this.s.e, lVar);
        if (jobResult == JobResult.SUCCESS && G < 0 && (b = this.s.c.b(this.r.l)) != null) {
            this.s.c.e(b);
        }
        if (G >= 0) {
            wnm wnmVar = this.s;
            wnmVar.e[G] = null;
            wnmVar.d();
        }
        int i = unm.a[jobResult.ordinal()];
        int i2 = 1;
        if (i == 1) {
            d dVar = this.s.d;
            nnm nnmVar = this.r;
            yjj yjjVar = dVar.b;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((a) ((j) next)).e(nnmVar, list);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
            dVar.a.c(new afg(22, nnmVar, list));
            dVar.a(nnmVar);
        } else if (i != 2) {
            if (i == 3) {
                d dVar2 = this.s.d;
                nnm nnmVar2 = this.r;
                preloadException.getClass();
                yjj yjjVar2 = dVar2.b;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it2 = u02.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    try {
                        r7o r7oVar3 = z7o.b;
                        a aVar = (a) ((j) next2);
                        aVar.getClass();
                        PreloadEventTracker$PreloadErrorData a2 = a.a(preloadException);
                        String r0 = y5g.r0(preloadException);
                        EventType eventType = EventType.ERROR;
                        PreloadException.ApiCallError apiCallError = preloadException instanceof PreloadException.ApiCallError ? (PreloadException.ApiCallError) preloadException : null;
                        aVar.a.b(aVar.b(nnmVar2, r0, eventType, a2, apiCallError != null ? apiCallError.getTimestamp() : System.currentTimeMillis()));
                        t7oVar2 = Unit.a;
                    } catch (Throwable th2) {
                        r7o r7oVar4 = z7o.b;
                        t7oVar2 = new t7o(th2);
                    }
                    Throwable a3 = z7o.a(t7oVar2);
                    if (a3 != null) {
                        Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                    }
                }
                dVar2.a.c(new gnm(nnmVar2, preloadException, i2));
                dVar2.a(nnmVar2);
            }
        } else if (lVar.j) {
            d dVar3 = this.s.d;
            nnm nnmVar3 = this.r;
            preloadException.getClass();
            dVar3.d(nnmVar3, preloadException);
        }
        return Unit.a;
    }
}
