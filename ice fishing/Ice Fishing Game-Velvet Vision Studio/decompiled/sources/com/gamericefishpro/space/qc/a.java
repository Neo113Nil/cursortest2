package com.gamericefishpro.space.qc;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.gamericefishpro.space.lc.e;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.d1;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import com.onesignal.core.services.SyncJobService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e, com.gamericefishpro.space.pc.a, com.gamericefishpro.space.jd.b {
    public static final C0039a Companion = new C0039a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<com.gamericefishpro.space.pc.b> _backgroundServices;
    private final com.gamericefishpro.space.kd.a _time;
    private d1 backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* JADX INFO: renamed from: com.gamericefishpro.space.qc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0039a {
        public /* synthetic */ C0039a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0039a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.gamericefishpro.space.qc.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0040a extends i implements Function2 {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0040a(a aVar, com.gamericefishpro.space.th.a aVar2) {
                super(2, aVar2);
                this.this$0 = aVar;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                return new C0040a(this.this$0, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                return ((C0040a) create(xVar, aVar)).invokeSuspend(Unit.a);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.label;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar2 = this.this$0;
                    synchronized (obj2) {
                        aVar2.nextScheduledSyncTimeMs = 0L;
                        Unit unit = Unit.a;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                while (it.hasNext()) {
                    com.gamericefishpro.space.pc.b bVar = (com.gamericefishpro.space.pc.b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (bVar.backgroundRun(this) == aVar) {
                        return aVar;
                    }
                }
                this.this$0.scheduleBackground();
                return Unit.a;
            }
        }

        public b(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            b bVar = a.this.new b(aVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            x xVar = (x) this.L$0;
            com.gamericefishpro.space.od.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar2 = a.this;
            aVar2.backgroundSyncJob = a0.u(xVar, k0.b, new C0040a(aVar2, null), 2);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f _applicationService, com.gamericefishpro.space.kd.a _time, List<? extends com.gamericefishpro.space.pc.b> _backgroundServices) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_backgroundServices, "_backgroundServices");
        this._applicationService = _applicationService;
        this._time = _time;
        this._backgroundServices = _backgroundServices;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        com.gamericefishpro.space.od.b.debug$default(a.class.getSimpleName().concat(" cancel background sync"), null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
            Unit unit = Unit.a;
        }
    }

    private final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
            Unit unit = Unit.a;
        }
    }

    private final boolean hasBootPermission() {
        return com.gamericefishpro.space.s3.a.a(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        d1 d1Var;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (d1Var = this.backgroundSyncJob) != null) {
                Intrinsics.b(d1Var);
                if (d1Var.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<com.gamericefishpro.space.pc.b> it = this._backgroundServices.iterator();
        Long l = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l == null || scheduleBackgroundRunIn.longValue() < l.longValue())) {
                l = scheduleBackgroundRunIn;
            }
        }
        if (l != null) {
            scheduleSyncTask(l.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j);
            Unit unit = Unit.a;
        }
    }

    private final void scheduleSyncServiceAsJob(long j) {
        com.gamericefishpro.space.od.b.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j, null, 2, null);
        if (isJobIdRunning()) {
            com.gamericefishpro.space.od.b.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        Intrinsics.b(appContext);
        Class<?> cls = this.syncServiceJobClass;
        Intrinsics.b(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        Intrinsics.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            com.gamericefishpro.space.od.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e) {
            com.gamericefishpro.space.od.b.error("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    private final void scheduleSyncTask(long j) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j > this.nextScheduledSyncTimeMs) {
                com.gamericefishpro.space.od.b.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j < 5000) {
                    j = 5000;
                }
                scheduleBackgroundSyncTask(j);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j;
                Unit unit = Unit.a;
            }
        }
    }

    @Override // com.gamericefishpro.space.pc.a
    public boolean cancelRunBackgroundServices() {
        d1 d1Var = this.backgroundSyncJob;
        if (d1Var == null || !d1Var.b()) {
            return false;
        }
        d1 d1Var2 = this.backgroundSyncJob;
        Intrinsics.b(d1Var2);
        d1Var2.c(null);
        return true;
    }

    @Override // com.gamericefishpro.space.pc.a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onFocus(boolean z) {
        cancelSyncTask();
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onUnfocused() {
        scheduleBackground();
    }

    @Override // com.gamericefishpro.space.pc.a
    public Object runBackgroundServices(com.gamericefishpro.space.th.a aVar) {
        Object objH = a0.h(new b(null), aVar);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }

    @Override // com.gamericefishpro.space.pc.a
    public void setNeedsJobReschedule(boolean z) {
        this.needsJobReschedule = z;
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
