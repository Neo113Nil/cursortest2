package ru.yandex.taxi.startup.launch.jobs;

import android.content.Context;
import android.content.Intent;
import androidx.work.WorkerParameters;
import com.yandex.go.feedback_common.services.FeedbackQueueService;
import defpackage.h6r;
import defpackage.huy;
import defpackage.iuy;
import defpackage.ny61;
import defpackage.osb1;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.ytq;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;
import ru.yandex.taxi.startup.launch.c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/startup/launch/jobs/ConnectivityStatusJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ConnectivityStatusJob extends GoCoroutineJob<h6r> {
    public ConnectivityStatusJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ConnectivityStatusJob$doWork$1 connectivityStatusJob$doWork$1;
        int i;
        if (continuationImpl instanceof ConnectivityStatusJob$doWork$1) {
            connectivityStatusJob$doWork$1 = (ConnectivityStatusJob$doWork$1) continuationImpl;
            int i2 = connectivityStatusJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                connectivityStatusJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = connectivityStatusJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = connectivityStatusJob$doWork$1.label;
                if (i != 0) {
                    b.b(obj);
                    Context applicationContext = getApplicationContext();
                    if (!osb1.b(applicationContext)) {
                        return new huy();
                    }
                    androidx.localbroadcastmanager.content.a.a(applicationContext).c(new Intent("ru.yandex.taxi.CONNECTION_APPEARED"));
                    ytq ytqVar = FeedbackQueueService.Companion;
                    Intent intent = new Intent();
                    ytqVar.getClass();
                    ytq.a(applicationContext, intent);
                    c cVar = (c) ((zzf) ((h6r) b())).n5.get();
                    connectivityStatusJob$doWork$1.L$0 = null;
                    connectivityStatusJob$doWork$1.label = 1;
                    if (cVar.a("ConnectivityStatusJob", connectivityStatusJob$doWork$1, true) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return new iuy();
            }
        }
        connectivityStatusJob$doWork$1 = new ConnectivityStatusJob$doWork$1(this, continuationImpl);
        Object obj2 = connectivityStatusJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = connectivityStatusJob$doWork$1.label;
        if (i != 0) {
        }
        return new iuy();
    }
}
