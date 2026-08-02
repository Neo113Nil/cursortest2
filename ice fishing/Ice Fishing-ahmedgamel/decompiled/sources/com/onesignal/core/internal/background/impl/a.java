package com.onesignal.core.internal.background.impl;

import B7.h;
import I7.p;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import S7.Y;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.core.services.SyncJobService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import u7.v;
import x4.e;
import x4.f;
import z4.InterfaceC5233a;
import z4.InterfaceC5234b;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements e, InterfaceC5233a, com.onesignal.core.internal.startup.b {
    public static final C0184a Companion = new C0184a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<InterfaceC5234b> _backgroundServices;
    private final K4.a _time;
    private Y backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* renamed from: com.onesignal.core.internal.background.impl.a$a, reason: collision with other inner class name */
    public static final class C0184a {
        public /* synthetic */ C0184a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0184a() {
        }
    }

    public static final class b extends i implements I7.a {
        public b() {
            super(0);
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return v.f41073a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16invoke() {
            a.this.cancelSyncTask();
        }
    }

    public static final class c extends i implements I7.a {
        public c() {
            super(0);
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m17invoke();
            return v.f41073a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m17invoke() {
            a.this.scheduleBackground();
        }
    }

    public static final class d extends h implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: com.onesignal.core.internal.background.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0185a extends h implements p {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0185a(a aVar, InterfaceC5240d interfaceC5240d) {
                super(2, interfaceC5240d);
                this.this$0 = aVar;
            }

            @Override // B7.a
            public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
                return new C0185a(this.this$0, interfaceC5240d);
            }

            @Override // I7.p
            public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
                return ((C0185a) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    Q3.b.s(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar2 = this.this$0;
                    synchronized (obj2) {
                        aVar2.nextScheduledSyncTimeMs = 0L;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    Q3.b.s(obj);
                }
                while (it.hasNext()) {
                    InterfaceC5234b interfaceC5234b = (InterfaceC5234b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (interfaceC5234b.backgroundRun(this) == aVar) {
                        return aVar;
                    }
                }
                this.this$0.scheduleBackground();
                return v.f41073a;
            }
        }

        public d(InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            d dVar = a.this.new d(interfaceC5240d);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((d) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            InterfaceC0408w interfaceC0408w = (InterfaceC0408w) this.L$0;
            com.onesignal.debug.internal.logging.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar2 = a.this;
            aVar2.backgroundSyncJob = AbstractC0410y.o(interfaceC0408w, F.f2999b, new C0185a(aVar2, null), 2);
            return v.f41073a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f _applicationService, K4.a _time, List<? extends InterfaceC5234b> _backgroundServices) {
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
        Y y7;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (y7 = this.backgroundSyncJob) != null) {
                kotlin.jvm.internal.h.b(y7);
                if (y7.j()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<InterfaceC5234b> it = this._backgroundServices.iterator();
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

    private final void scheduleBackgroundSyncTask(long j6) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j6);
        }
    }

    private final void scheduleSyncServiceAsJob(long j6) {
        com.onesignal.debug.internal.logging.b.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j6, null, 2, null);
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
        builder.setMinimumLatency(j6).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        kotlin.jvm.internal.h.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            com.onesignal.debug.internal.logging.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e9) {
            com.onesignal.debug.internal.logging.b.info("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e9);
        }
    }

    private final void scheduleSyncTask(long j6) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j6 > this.nextScheduledSyncTimeMs) {
                com.onesignal.debug.internal.logging.b.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j6 < com.anythink.basead.exoplayer.f.f7973a) {
                    j6 = 5000;
                }
                scheduleBackgroundSyncTask(j6);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j6;
            }
        }
    }

    @Override // z4.InterfaceC5233a
    public boolean cancelRunBackgroundServices() {
        Y y7 = this.backgroundSyncJob;
        if (y7 == null || !y7.j()) {
            return false;
        }
        Y y9 = this.backgroundSyncJob;
        kotlin.jvm.internal.h.b(y9);
        y9.a(null);
        return true;
    }

    @Override // z4.InterfaceC5233a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // x4.e
    public void onFocus(boolean z6) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new b());
    }

    @Override // x4.e
    public void onUnfocused() {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // z4.InterfaceC5233a
    public Object runBackgroundServices(InterfaceC5240d interfaceC5240d) {
        Object e9 = AbstractC0410y.e(new d(null), interfaceC5240d);
        return e9 == A7.a.f215n ? e9 : v.f41073a;
    }

    @Override // z4.InterfaceC5233a
    public void setNeedsJobReschedule(boolean z6) {
        this.needsJobReschedule = z6;
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
