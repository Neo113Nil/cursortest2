package ru.yandex.taxi.jobs;

import defpackage.as21;
import defpackage.bvf0;
import defpackage.i3y;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xby;
import defpackage.yw60;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.push.j;

/* loaded from: classes9.dex */
public final class e implements yw60 {
    public final as21 a;
    public final j b;
    public final tt2 c;
    public final b d;

    public e(as21 as21Var, j jVar, tt2 tt2Var, b bVar) {
        this.a = as21Var;
        this.b = jVar;
        this.c = tt2Var;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, ContinuationImpl continuationImpl) {
        WorkersStartupInteractor$checkJobsOverflow$1 workersStartupInteractor$checkJobsOverflow$1;
        int i;
        String str;
        boolean booleanValue;
        boolean z;
        eVar.getClass();
        if (continuationImpl instanceof WorkersStartupInteractor$checkJobsOverflow$1) {
            workersStartupInteractor$checkJobsOverflow$1 = (WorkersStartupInteractor$checkJobsOverflow$1) continuationImpl;
            int i2 = workersStartupInteractor$checkJobsOverflow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                workersStartupInteractor$checkJobsOverflow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = workersStartupInteractor$checkJobsOverflow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = workersStartupInteractor$checkJobsOverflow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = eVar.b;
                    workersStartupInteractor$checkJobsOverflow$1.label = 1;
                    obj = jVar.g(workersStartupInteractor$checkJobsOverflow$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        z = workersStartupInteractor$checkJobsOverflow$1.Z$0;
                        kotlin.b.b(obj);
                        booleanValue = z;
                        workersStartupInteractor$checkJobsOverflow$1.L$0 = null;
                        workersStartupInteractor$checkJobsOverflow$1.Z$0 = booleanValue;
                        workersStartupInteractor$checkJobsOverflow$1.label = 4;
                        Object i3 = eVar.i(workersStartupInteractor$checkJobsOverflow$1);
                        return i3 != obj2 ? obj2 : i3;
                    }
                    str = (String) workersStartupInteractor$checkJobsOverflow$1.L$0;
                    kotlin.b.b(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        workersStartupInteractor$checkJobsOverflow$1.L$0 = null;
                        workersStartupInteractor$checkJobsOverflow$1.Z$0 = booleanValue;
                        workersStartupInteractor$checkJobsOverflow$1.label = 3;
                        if (eVar.k(str, workersStartupInteractor$checkJobsOverflow$1) != obj2) {
                            z = booleanValue;
                            booleanValue = z;
                        }
                    }
                    workersStartupInteractor$checkJobsOverflow$1.L$0 = null;
                    workersStartupInteractor$checkJobsOverflow$1.Z$0 = booleanValue;
                    workersStartupInteractor$checkJobsOverflow$1.label = 4;
                    Object i32 = eVar.i(workersStartupInteractor$checkJobsOverflow$1);
                    if (i32 != obj2) {
                    }
                }
                str = (String) obj;
                eVar.c.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                WorkersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$1 workersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$1 = new WorkersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$1(str, eVar, null);
                workersStartupInteractor$checkJobsOverflow$1.L$0 = str;
                workersStartupInteractor$checkJobsOverflow$1.label = 2;
                obj = tje.k0(mdhVar, workersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$1, workersStartupInteractor$checkJobsOverflow$1);
            }
        }
        workersStartupInteractor$checkJobsOverflow$1 = new WorkersStartupInteractor$checkJobsOverflow$1(eVar, continuationImpl);
        Object obj3 = workersStartupInteractor$checkJobsOverflow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workersStartupInteractor$checkJobsOverflow$1.label;
        if (i != 0) {
        }
        str = (String) obj3;
        eVar.c.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        WorkersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$1 workersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$12 = new WorkersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$1(str, eVar, null);
        workersStartupInteractor$checkJobsOverflow$1.L$0 = str;
        workersStartupInteractor$checkJobsOverflow$1.label = 2;
        obj3 = tje.k0(mdhVar2, workersStartupInteractor$checkJobsOverflow$isPruneTokenChanged$12, workersStartupInteractor$checkJobsOverflow$1);
    }

    @Override // defpackage.yw60
    public final void e() {
        tje.N(this.d.c, null, null, new WorkersStartupInteractor$onAppCreated$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "WorkersStartupInteractor";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        WorkersStartupInteractor$logKnownJob$1 workersStartupInteractor$logKnownJob$1;
        int i;
        zy11 zy11Var;
        try {
            if (continuationImpl instanceof WorkersStartupInteractor$logKnownJob$1) {
                workersStartupInteractor$logKnownJob$1 = (WorkersStartupInteractor$logKnownJob$1) continuationImpl;
                int i2 = workersStartupInteractor$logKnownJob$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    workersStartupInteractor$logKnownJob$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = workersStartupInteractor$logKnownJob$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = workersStartupInteractor$logKnownJob$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        workersStartupInteractor$logKnownJob$1.label = 1;
                        return j(workersStartupInteractor$logKnownJob$1) == obj2 ? obj2 : zy11Var;
                    }
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "Works.Startup:LogFailed", null, th, "Error while logging works", 2);
            return zy11Var;
        }
        workersStartupInteractor$logKnownJob$1 = new WorkersStartupInteractor$logKnownJob$1(this, continuationImpl);
        Object obj3 = workersStartupInteractor$logKnownJob$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workersStartupInteractor$logKnownJob$1.label;
        zy11Var = zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[LOOP:0: B:11:0x005f->B:13:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        WorkersStartupInteractor$logKnownJobInner$1 workersStartupInteractor$logKnownJobInner$1;
        int i;
        if (continuationImpl instanceof WorkersStartupInteractor$logKnownJobInner$1) {
            workersStartupInteractor$logKnownJobInner$1 = (WorkersStartupInteractor$logKnownJobInner$1) continuationImpl;
            int i2 = workersStartupInteractor$logKnownJobInner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                workersStartupInteractor$logKnownJobInner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = workersStartupInteractor$logKnownJobInner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = workersStartupInteractor$logKnownJobInner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    workersStartupInteractor$logKnownJobInner$1.label = 1;
                    b bVar = this.d;
                    obj = bvf0.n(new WorkManagerExtensionsKt$readAllJobsInfo$2(((Map) ((i3y) bVar.b.b).getValue()).keySet(), bVar.d(), null), workersStartupInteractor$logKnownJobInner$1);
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
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Pair pair = (Pair) entry.getValue();
                    qv10.C(new Object[]{str, new Integer(((List) pair.c()).size()), new Integer(((List) pair.f()).size())}, 3, "Works.Startup.%s.Count.%d.Active.%d", jst.e);
                }
                return zy11.a;
            }
        }
        workersStartupInteractor$logKnownJobInner$1 = new WorkersStartupInteractor$logKnownJobInner$1(this, continuationImpl);
        Object obj2 = workersStartupInteractor$logKnownJobInner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workersStartupInteractor$logKnownJobInner$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, ContinuationImpl continuationImpl) {
        WorkersStartupInteractor$pruneAllJobs$1 workersStartupInteractor$pruneAllJobs$1;
        int i;
        zy11 zy11Var;
        try {
            if (continuationImpl instanceof WorkersStartupInteractor$pruneAllJobs$1) {
                workersStartupInteractor$pruneAllJobs$1 = (WorkersStartupInteractor$pruneAllJobs$1) continuationImpl;
                int i2 = workersStartupInteractor$pruneAllJobs$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    workersStartupInteractor$pruneAllJobs$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = workersStartupInteractor$pruneAllJobs$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = workersStartupInteractor$pruneAllJobs$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        b bVar = this.d;
                        workersStartupInteractor$pruneAllJobs$1.L$0 = str;
                        workersStartupInteractor$pruneAllJobs$1.label = 1;
                        if (bVar.b(workersStartupInteractor$pruneAllJobs$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) workersStartupInteractor$pruneAllJobs$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.a.g("PRUNE_JOBS_TOKEN", str);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            this.a.g("PRUNE_JOBS_TOKEN", str);
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "Works.Startup:CleanupFailed", null, th, "Failed to cancel works", 2);
            return zy11Var;
        }
        workersStartupInteractor$pruneAllJobs$1 = new WorkersStartupInteractor$pruneAllJobs$1(this, continuationImpl);
        Object obj2 = workersStartupInteractor$pruneAllJobs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workersStartupInteractor$pruneAllJobs$1.label;
        zy11Var = zy11.a;
    }
}
