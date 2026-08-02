package ru.yandex.taxi.order.analytics.marknotify;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.h6r;
import defpackage.huy;
import defpackage.iuy;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sw00;
import defpackage.vnt;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/order/analytics/marknotify/ClickedOrdersSendingJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClickedOrdersSendingJob extends GoCoroutineJob<h6r> {
    public final String d;

    public ClickedOrdersSendingJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
        String a = workerParameters.b.a("ORDER_SCREEN_TYPE_VALUE_ARG");
        if (a == null) {
            jst.e.getClass();
        }
        this.d = a == null ? "" : a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ClickedOrdersSendingJob$doWork$1 clickedOrdersSendingJob$doWork$1;
        int i;
        Object obj;
        if (continuationImpl instanceof ClickedOrdersSendingJob$doWork$1) {
            clickedOrdersSendingJob$doWork$1 = (ClickedOrdersSendingJob$doWork$1) continuationImpl;
            int i2 = clickedOrdersSendingJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clickedOrdersSendingJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = clickedOrdersSendingJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clickedOrdersSendingJob$doWork$1.label;
                String str = this.d;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sw00 sw00Var = (sw00) ((zzf) ((h6r) b())).Mi.get();
                    clickedOrdersSendingJob$doWork$1.L$0 = sw00Var;
                    clickedOrdersSendingJob$doWork$1.label = 1;
                    a aVar = (a) sw00Var;
                    Object c = aVar.c(str, clickedOrdersSendingJob$doWork$1);
                    obj = aVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return ((Boolean) obj2).booleanValue() ? new huy() : new iuy();
                    }
                    Object obj3 = (sw00) clickedOrdersSendingJob$doWork$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj3;
                }
                clickedOrdersSendingJob$doWork$1.L$0 = null;
                clickedOrdersSendingJob$doWork$1.label = 2;
                obj2 = ((a) obj).b(str, clickedOrdersSendingJob$doWork$1);
            }
        }
        clickedOrdersSendingJob$doWork$1 = new ClickedOrdersSendingJob$doWork$1(this, continuationImpl);
        Object obj22 = clickedOrdersSendingJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clickedOrdersSendingJob$doWork$1.label;
        String str2 = this.d;
        if (i != 0) {
        }
        clickedOrdersSendingJob$doWork$1.L$0 = null;
        clickedOrdersSendingJob$doWork$1.label = 2;
        obj22 = ((a) obj).b(str2, clickedOrdersSendingJob$doWork$1);
    }
}
