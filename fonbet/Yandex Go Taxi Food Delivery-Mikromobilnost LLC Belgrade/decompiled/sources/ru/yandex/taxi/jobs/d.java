package ru.yandex.taxi.jobs;

import android.app.job.JobScheduler;
import android.content.Context;
import androidx.work.WorkManager;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.gl7;
import defpackage.hst;
import defpackage.i3y;
import defpackage.iw00;
import defpackage.jst;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.p951;
import defpackage.s951;
import defpackage.xby;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[Catch: all -> 0x0084, CancellationException -> 0x0085, TryCatch #2 {CancellationException -> 0x0085, all -> 0x0084, blocks: (B:11:0x002c, B:12:0x004a, B:13:0x0058, B:15:0x005e, B:22:0x007a, B:31:0x007e, B:38:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(WorkManager workManager, String str, ContinuationImpl continuationImpl) {
        WorkManagerExtensionsKt$readJobsInfo$1 workManagerExtensionsKt$readJobsInfo$1;
        int i;
        try {
            if (continuationImpl instanceof WorkManagerExtensionsKt$readJobsInfo$1) {
                workManagerExtensionsKt$readJobsInfo$1 = (WorkManagerExtensionsKt$readJobsInfo$1) continuationImpl;
                int i2 = workManagerExtensionsKt$readJobsInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    workManagerExtensionsKt$readJobsInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = workManagerExtensionsKt$readJobsInfo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = workManagerExtensionsKt$readJobsInfo$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        gl7 h = workManager.h(str);
                        workManagerExtensionsKt$readJobsInfo$1.L$0 = null;
                        workManagerExtensionsKt$readJobsInfo$1.L$1 = null;
                        workManagerExtensionsKt$readJobsInfo$1.label = 1;
                        obj = ooc.e(h, workManagerExtensionsKt$readJobsInfo$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        int i3 = s951.a[((p951) obj2).a().ordinal()];
                        if (i3 == 1 || i3 == 2 || i3 == 3) {
                            arrayList.add(obj2);
                        }
                    }
                    return new Pair(list, arrayList);
                }
            }
            if (i != 0) {
            }
            List list2 = (List) obj;
            ArrayList arrayList2 = new ArrayList();
            while (r5.hasNext()) {
            }
            return new Pair(list2, arrayList2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        workManagerExtensionsKt$readJobsInfo$1 = new WorkManagerExtensionsKt$readJobsInfo$1(continuationImpl);
        Object obj3 = workManagerExtensionsKt$readJobsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workManagerExtensionsKt$readJobsInfo$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Context context, b bVar, ContinuationImpl continuationImpl) {
        WorkOverflowHandleKt$handleJobsOverflow$1 workOverflowHandleKt$handleJobsOverflow$1;
        int i;
        zy11 zy11Var;
        try {
            if (continuationImpl instanceof WorkOverflowHandleKt$handleJobsOverflow$1) {
                workOverflowHandleKt$handleJobsOverflow$1 = (WorkOverflowHandleKt$handleJobsOverflow$1) continuationImpl;
                int i2 = workOverflowHandleKt$handleJobsOverflow$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    workOverflowHandleKt$handleJobsOverflow$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = workOverflowHandleKt$handleJobsOverflow$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = workOverflowHandleKt$handleJobsOverflow$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        workOverflowHandleKt$handleJobsOverflow$1.L$0 = null;
                        workOverflowHandleKt$handleJobsOverflow$1.L$1 = null;
                        workOverflowHandleKt$handleJobsOverflow$1.label = 1;
                        return c(context, bVar, workOverflowHandleKt$handleJobsOverflow$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "Works.OnOverflow:CleanupFailed", null, th, "Failed to cancel jobs on overflow", 2);
            return zy11Var;
        }
        workOverflowHandleKt$handleJobsOverflow$1 = new WorkOverflowHandleKt$handleJobsOverflow$1(continuationImpl);
        Object obj2 = workOverflowHandleKt$handleJobsOverflow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workOverflowHandleKt$handleJobsOverflow$1.label;
        zy11Var = zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014b A[LOOP:0: B:12:0x0145->B:14:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0 A[LOOP:1: B:24:0x00da->B:26:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Context context, b bVar, ContinuationImpl continuationImpl) {
        WorkOverflowHandleKt$handleJobsOverflowInner$1 workOverflowHandleKt$handleJobsOverflowInner$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        int size;
        JobScheduler jobScheduler;
        Map map;
        int i2;
        JobScheduler jobScheduler2;
        Iterator it;
        int i3;
        b bVar2 = bVar;
        if (continuationImpl instanceof WorkOverflowHandleKt$handleJobsOverflowInner$1) {
            workOverflowHandleKt$handleJobsOverflowInner$1 = (WorkOverflowHandleKt$handleJobsOverflowInner$1) continuationImpl;
            int i4 = workOverflowHandleKt$handleJobsOverflowInner$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                workOverflowHandleKt$handleJobsOverflowInner$1.label = i4 - Integer.MIN_VALUE;
                Object obj = workOverflowHandleKt$handleJobsOverflowInner$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = workOverflowHandleKt$handleJobsOverflowInner$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    JobScheduler jobScheduler3 = (JobScheduler) context.getSystemService(JobScheduler.class);
                    if (jobScheduler3 != null && (size = jobScheduler3.getAllPendingJobs().size()) >= 80) {
                        xby.l(jst.e, "Works.OnOverflow:LimitExceed", null, new IllegalStateException("Jobs overflow"), oyr.i(size, "Too many pending jobs: "), 2);
                        workOverflowHandleKt$handleJobsOverflowInner$1.L$0 = null;
                        workOverflowHandleKt$handleJobsOverflowInner$1.L$1 = bVar2;
                        workOverflowHandleKt$handleJobsOverflowInner$1.L$2 = jobScheduler3;
                        workOverflowHandleKt$handleJobsOverflowInner$1.L$3 = null;
                        workOverflowHandleKt$handleJobsOverflowInner$1.I$0 = size;
                        workOverflowHandleKt$handleJobsOverflowInner$1.label = 1;
                        Object n = bvf0.n(new WorkManagerExtensionsKt$readAllJobsInfo$2(((Map) ((i3y) bVar2.b.b).getValue()).keySet(), bVar2.d(), null), workOverflowHandleKt$handleJobsOverflowInner$1);
                        if (n != coroutineSingletons) {
                            jobScheduler = jobScheduler3;
                            obj = n;
                        }
                        return coroutineSingletons;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = workOverflowHandleKt$handleJobsOverflowInner$1.I$0;
                    map = (Map) workOverflowHandleKt$handleJobsOverflowInner$1.L$4;
                    jobScheduler2 = (JobScheduler) workOverflowHandleKt$handleJobsOverflowInner$1.L$2;
                    kotlin.b.b(obj);
                    it = ((Iterable) iw00.w(map).b).iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        i3 += ((List) ((Pair) ((Map.Entry) it.next()).getValue()).c()).size();
                    }
                    if (i3 < i2) {
                        jst.e.n(String.format("Works.OnOverflow.Unknown.Count.%d", Arrays.copyOf(new Object[]{new Integer(i2 - map.size())}, 1)));
                        jobScheduler2.cancelAll();
                    }
                    return zy11Var;
                }
                int i5 = workOverflowHandleKt$handleJobsOverflowInner$1.I$0;
                JobScheduler jobScheduler4 = (JobScheduler) workOverflowHandleKt$handleJobsOverflowInner$1.L$2;
                b bVar3 = (b) workOverflowHandleKt$handleJobsOverflowInner$1.L$1;
                kotlin.b.b(obj);
                size = i5;
                bVar2 = bVar3;
                jobScheduler = jobScheduler4;
                Map map2 = (Map) obj;
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    Pair pair = (Pair) entry.getValue();
                    hst hstVar = jst.e;
                    int size2 = ((List) pair.c()).size();
                    int size3 = ((List) pair.f()).size();
                    StringBuilder u = b64.u(size2, "Works.OnOverflow.", str, ".Count.", ".Active.");
                    u.append(size3);
                    hstVar.n(u.toString());
                }
                workOverflowHandleKt$handleJobsOverflowInner$1.L$0 = null;
                workOverflowHandleKt$handleJobsOverflowInner$1.L$1 = null;
                workOverflowHandleKt$handleJobsOverflowInner$1.L$2 = jobScheduler;
                workOverflowHandleKt$handleJobsOverflowInner$1.L$3 = null;
                workOverflowHandleKt$handleJobsOverflowInner$1.L$4 = map2;
                workOverflowHandleKt$handleJobsOverflowInner$1.I$0 = size;
                workOverflowHandleKt$handleJobsOverflowInner$1.label = 2;
                if (bVar2.b(workOverflowHandleKt$handleJobsOverflowInner$1) != coroutineSingletons) {
                    map = map2;
                    i2 = size;
                    jobScheduler2 = jobScheduler;
                    it = ((Iterable) iw00.w(map).b).iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                    }
                    if (i3 < i2) {
                    }
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        workOverflowHandleKt$handleJobsOverflowInner$1 = new WorkOverflowHandleKt$handleJobsOverflowInner$1(continuationImpl);
        Object obj2 = workOverflowHandleKt$handleJobsOverflowInner$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workOverflowHandleKt$handleJobsOverflowInner$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Map map22 = (Map) obj2;
        while (r10.hasNext()) {
        }
        workOverflowHandleKt$handleJobsOverflowInner$1.L$0 = null;
        workOverflowHandleKt$handleJobsOverflowInner$1.L$1 = null;
        workOverflowHandleKt$handleJobsOverflowInner$1.L$2 = jobScheduler;
        workOverflowHandleKt$handleJobsOverflowInner$1.L$3 = null;
        workOverflowHandleKt$handleJobsOverflowInner$1.L$4 = map22;
        workOverflowHandleKt$handleJobsOverflowInner$1.I$0 = size;
        workOverflowHandleKt$handleJobsOverflowInner$1.label = 2;
        if (bVar2.b(workOverflowHandleKt$handleJobsOverflowInner$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
