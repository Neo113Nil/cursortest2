package com.onesignal.core.internal.background.impl;

import ac.o;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.core.services.SyncJobService;
import fc.d;
import hc.j;
import java.util.Iterator;
import java.util.List;
import q8.e;
import q8.f;
import yc.a0;
import yc.b1;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements e, s8.a, d9.b {
    public static final C0010a Companion = new C0010a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<s8.b> _backgroundServices;
    private final e9.a _time;
    private b1 backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.background.impl.a$a, reason: collision with other inner class name */
    public static final class C0010a {
        public /* synthetic */ C0010a(pc.f fVar) {
            this();
        }

        private C0010a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements oc.e {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.core.internal.background.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0011a extends j implements oc.e {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0011a(a aVar, d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
            }

            @Override // hc.a
            public final d create(Object obj, d dVar) {
                return new C0011a(this.this$0, dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                gc.a aVar = gc.a.f2559g;
                int i10 = this.label;
                if (i10 == 0) {
                    v6.a.W(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar2 = this.this$0;
                    synchronized (obj2) {
                        aVar2.nextScheduledSyncTimeMs = 0L;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    v6.a.W(obj);
                }
                while (it.hasNext()) {
                    s8.b bVar = (s8.b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (bVar.backgroundRun(this) == aVar) {
                        return aVar;
                    }
                }
                this.this$0.scheduleBackground();
                return o.f277a;
            }

            @Override // oc.e
            public final Object invoke(y yVar, d dVar) {
                return ((C0011a) create(yVar, dVar)).invokeSuspend(o.f277a);
            }
        }

        public b(d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final d create(Object obj, d dVar) {
            b bVar = a.this.new b(dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            y yVar = (y) this.L$0;
            com.onesignal.debug.internal.logging.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar = a.this;
            aVar.backgroundSyncJob = a0.q(yVar, i0.f8860b, new C0011a(aVar, null), 2);
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f fVar, e9.a aVar, List<? extends s8.b> list) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(aVar, "_time");
        pc.j.e(list, "_backgroundServices");
        this._applicationService = fVar;
        this._time = aVar;
        this._backgroundServices = list;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        com.onesignal.debug.internal.logging.b.debug$default(a.class.getSimpleName().concat(" cancel background sync"), null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            pc.j.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
        }
    }

    private final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
        }
    }

    private final boolean hasBootPermission() {
        return y2.a.a(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        b1 b1Var;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        pc.j.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (b1Var = this.backgroundSyncJob) != null) {
                pc.j.b(b1Var);
                if (b1Var.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<s8.b> it = this._backgroundServices.iterator();
        Long l10 = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l10 == null || scheduleBackgroundRunIn.longValue() < l10.longValue())) {
                l10 = scheduleBackgroundRunIn;
            }
        }
        if (l10 != null) {
            scheduleSyncTask(l10.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j3) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j3);
        }
    }

    private final void scheduleSyncServiceAsJob(long j3) {
        com.onesignal.debug.internal.logging.b.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j3, null, 2, null);
        if (isJobIdRunning()) {
            com.onesignal.debug.internal.logging.b.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        pc.j.b(appContext);
        Class<?> cls = this.syncServiceJobClass;
        pc.j.b(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j3).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        pc.j.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        pc.j.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            com.onesignal.debug.internal.logging.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e10) {
            com.onesignal.debug.internal.logging.b.error("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e10);
        }
    }

    private final void scheduleSyncTask(long j3) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j3 > this.nextScheduledSyncTimeMs) {
                com.onesignal.debug.internal.logging.b.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j3 < 5000) {
                    j3 = 5000;
                }
                scheduleBackgroundSyncTask(j3);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j3;
            }
        }
    }

    @Override // s8.a
    public boolean cancelRunBackgroundServices() {
        b1 b1Var = this.backgroundSyncJob;
        if (b1Var == null || !b1Var.b()) {
            return false;
        }
        b1 b1Var2 = this.backgroundSyncJob;
        pc.j.b(b1Var2);
        b1Var2.a(null);
        return true;
    }

    @Override // s8.a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // q8.e
    public void onFocus(boolean z10) {
        cancelSyncTask();
    }

    @Override // q8.e
    public void onUnfocused() {
        scheduleBackground();
    }

    @Override // s8.a
    public Object runBackgroundServices(d dVar) {
        Object e10 = a0.e(new b(null), dVar);
        return e10 == gc.a.f2559g ? e10 : o.f277a;
    }

    @Override // s8.a
    public void setNeedsJobReschedule(boolean z10) {
        this.needsJobReschedule = z10;
    }

    @Override // d9.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
