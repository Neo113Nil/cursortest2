package com.onesignal.core.internal.background.impl;

import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import O7.Y;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.core.services.SyncJobService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import q7.v;
import t4.e;
import t4.f;
import v4.InterfaceC5126a;
import v4.InterfaceC5127b;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class a implements e, InterfaceC5126a, com.onesignal.core.internal.startup.b {
    public static final C0183a Companion = new C0183a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<InterfaceC5127b> _backgroundServices;
    private final G4.a _time;
    private Y backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* renamed from: com.onesignal.core.internal.background.impl.a$a, reason: collision with other inner class name */
    public static final class C0183a {
        public /* synthetic */ C0183a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0183a() {
        }
    }

    public static final class b extends i implements E7.a {
        public b() {
            super(0);
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() {
            a.this.cancelSyncTask();
        }
    }

    public static final class c extends i implements E7.a {
        public c() {
            super(0);
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() {
            a.this.scheduleBackground();
        }
    }

    public static final class d extends h implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: com.onesignal.core.internal.background.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0184a extends h implements p {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0184a(a aVar, InterfaceC5133d interfaceC5133d) {
                super(2, interfaceC5133d);
                this.this$0 = aVar;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
                return new C0184a(this.this$0, interfaceC5133d);
            }

            @Override // E7.p
            public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
                return ((C0184a) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar = this.this$0;
                    synchronized (obj2) {
                        aVar.nextScheduledSyncTimeMs = 0L;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                while (it.hasNext()) {
                    InterfaceC5127b interfaceC5127b = (InterfaceC5127b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (interfaceC5127b.backgroundRun(this) == enumC5179a) {
                        return enumC5179a;
                    }
                }
                this.this$0.scheduleBackground();
                return v.f40183a;
            }
        }

        public d(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            d dVar = a.this.new d(interfaceC5133d);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            InterfaceC0397w interfaceC0397w = (InterfaceC0397w) this.L$0;
            com.onesignal.debug.internal.logging.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar = a.this;
            aVar.backgroundSyncJob = AbstractC0399y.o(interfaceC0397w, F.f2552b, new C0184a(aVar, null), 2);
            return v.f40183a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f _applicationService, G4.a _time, List<? extends InterfaceC5127b> _backgroundServices) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_backgroundServices, "_backgroundServices");
        this._applicationService = _applicationService;
        this._time = _time;
        this._backgroundServices = _backgroundServices;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        com.onesignal.debug.internal.logging.b.debug$default(a.class.getSimpleName().concat(" cancel background sync"), null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
        }
    }

    private final boolean hasBootPermission() {
        return E.e.a(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        Y y6;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (y6 = this.backgroundSyncJob) != null) {
                kotlin.jvm.internal.h.b(y6);
                if (y6.j()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<InterfaceC5127b> it = this._backgroundServices.iterator();
        Long l9 = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l9 == null || scheduleBackgroundRunIn.longValue() < l9.longValue())) {
                l9 = scheduleBackgroundRunIn;
            }
        }
        if (l9 != null) {
            scheduleSyncTask(l9.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j9) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j9);
        }
    }

    private final void scheduleSyncServiceAsJob(long j9) {
        com.onesignal.debug.internal.logging.b.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j9, null, 2, null);
        if (isJobIdRunning()) {
            com.onesignal.debug.internal.logging.b.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        kotlin.jvm.internal.h.b(appContext);
        Class<?> cls = this.syncServiceJobClass;
        kotlin.jvm.internal.h.b(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j9).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        kotlin.jvm.internal.h.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            com.onesignal.debug.internal.logging.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e6) {
            com.onesignal.debug.internal.logging.b.info("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e6);
        }
    }

    private final void scheduleSyncTask(long j9) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j9 > this.nextScheduledSyncTimeMs) {
                com.onesignal.debug.internal.logging.b.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j9 < com.anythink.basead.exoplayer.f.f7344a) {
                    j9 = 5000;
                }
                scheduleBackgroundSyncTask(j9);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j9;
            }
        }
    }

    @Override // v4.InterfaceC5126a
    public boolean cancelRunBackgroundServices() {
        Y y6 = this.backgroundSyncJob;
        if (y6 == null || !y6.j()) {
            return false;
        }
        Y y8 = this.backgroundSyncJob;
        kotlin.jvm.internal.h.b(y8);
        y8.a(null);
        return true;
    }

    @Override // v4.InterfaceC5126a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // t4.e
    public void onFocus(boolean z8) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new b());
    }

    @Override // t4.e
    public void onUnfocused() {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // v4.InterfaceC5126a
    public Object runBackgroundServices(InterfaceC5133d interfaceC5133d) {
        Object e6 = AbstractC0399y.e(new d(null), interfaceC5133d);
        return e6 == EnumC5179a.f41704n ? e6 : v.f40183a;
    }

    @Override // v4.InterfaceC5126a
    public void setNeedsJobReschedule(boolean z8) {
        this.needsJobReschedule = z8;
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
