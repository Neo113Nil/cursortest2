package ru.yandex.taxi.logistics.job;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.guy;
import defpackage.h6r;
import defpackage.iuy;
import defpackage.m8x;
import defpackage.n8x;
import defpackage.ny61;
import defpackage.o8x;
import defpackage.p8x;
import defpackage.pci;
import defpackage.q8x;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.w511;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/logistics/job/DeliveryTaskJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveryTaskJob extends GoCoroutineJob<h6r> {
    public DeliveryTaskJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DeliveryTaskJob$doWork$1 deliveryTaskJob$doWork$1;
        int i;
        p8x p8xVar;
        if (continuationImpl instanceof DeliveryTaskJob$doWork$1) {
            deliveryTaskJob$doWork$1 = (DeliveryTaskJob$doWork$1) continuationImpl;
            int i2 = deliveryTaskJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryTaskJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryTaskJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryTaskJob$doWork$1.label;
                if (i != 0) {
                    b.b(obj);
                    q8x a = pci.a();
                    m8x m8xVar = new m8x(Collections.unmodifiableMap(getInputData().a));
                    deliveryTaskJob$doWork$1.L$0 = null;
                    deliveryTaskJob$doWork$1.L$1 = null;
                    deliveryTaskJob$doWork$1.L$2 = this;
                    deliveryTaskJob$doWork$1.label = 1;
                    obj = a.a(m8xVar, deliveryTaskJob$doWork$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (DeliveryTaskJob) deliveryTaskJob$doWork$1.L$2;
                    b.b(obj);
                }
                p8xVar = (p8x) obj;
                this.getClass();
                if (!(p8xVar instanceof o8x)) {
                    return new iuy();
                }
                if (p8xVar instanceof n8x) {
                    return new guy();
                }
                w511.b();
                return null;
            }
        }
        deliveryTaskJob$doWork$1 = new DeliveryTaskJob$doWork$1(this, continuationImpl);
        Object obj2 = deliveryTaskJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryTaskJob$doWork$1.label;
        if (i != 0) {
        }
        p8xVar = (p8x) obj2;
        this.getClass();
        if (!(p8xVar instanceof o8x)) {
        }
    }
}
