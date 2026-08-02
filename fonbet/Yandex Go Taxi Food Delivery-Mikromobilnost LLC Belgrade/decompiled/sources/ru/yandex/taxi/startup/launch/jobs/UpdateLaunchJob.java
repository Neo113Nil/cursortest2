package ru.yandex.taxi.startup.launch.jobs;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.h6r;
import defpackage.iuy;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;
import ru.yandex.taxi.startup.launch.c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/startup/launch/jobs/UpdateLaunchJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdateLaunchJob extends GoCoroutineJob<h6r> {
    public UpdateLaunchJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpdateLaunchJob$doWork$1 updateLaunchJob$doWork$1;
        int i;
        if (continuationImpl instanceof UpdateLaunchJob$doWork$1) {
            updateLaunchJob$doWork$1 = (UpdateLaunchJob$doWork$1) continuationImpl;
            int i2 = updateLaunchJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateLaunchJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateLaunchJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateLaunchJob$doWork$1.label;
                if (i != 0) {
                    b.b(obj);
                    c cVar = (c) ((zzf) ((h6r) b())).n5.get();
                    updateLaunchJob$doWork$1.label = 1;
                    if (cVar.a("UpdateLaunchJob", updateLaunchJob$doWork$1, true) == coroutineSingletons) {
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
        updateLaunchJob$doWork$1 = new UpdateLaunchJob$doWork$1(this, continuationImpl);
        Object obj2 = updateLaunchJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateLaunchJob$doWork$1.label;
        if (i != 0) {
        }
        return new iuy();
    }
}
