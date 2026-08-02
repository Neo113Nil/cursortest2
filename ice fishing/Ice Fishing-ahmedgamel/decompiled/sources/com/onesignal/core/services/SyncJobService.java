package com.onesignal.core.services;

import B7.h;
import I7.l;
import Q3.b;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.common.threading.c;
import p4.g;
import u7.v;
import z4.InterfaceC5233a;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class SyncJobService extends JobService {

    public static final class a extends h implements l {
        final /* synthetic */ JobParameters $jobParameters;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobParameters jobParameters, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$jobParameters = jobParameters;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return SyncJobService.this.new a(this.$jobParameters, interfaceC5240d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16, types: [android.app.job.JobService, com.onesignal.core.services.SyncJobService] */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r1;
            int i;
            InterfaceC5233a interfaceC5233a;
            A7.a aVar = A7.a.f215n;
            int i4 = this.label;
            v vVar = v.f41073a;
            if (i4 == 0) {
                b.s(obj);
                try {
                    SyncJobService syncJobService = SyncJobService.this;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = g.b(syncJobService, this);
                    if (obj != aVar) {
                        i = 0;
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    r1 = 0;
                    SyncJobService.this.jobFinished(this.$jobParameters, r1 != 0);
                    throw th;
                }
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r1 = this.I$0;
                interfaceC5233a = (InterfaceC5233a) this.L$0;
                try {
                    b.s(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC5233a.getNeedsJobReschedule(), null, 2, null);
                    r1 = interfaceC5233a.getNeedsJobReschedule();
                    interfaceC5233a.setNeedsJobReschedule(false);
                    SyncJobService.this.jobFinished(this.$jobParameters, r1);
                    return vVar;
                } catch (Throwable th2) {
                    th = th2;
                    SyncJobService.this.jobFinished(this.$jobParameters, r1 != 0);
                    throw th;
                }
            }
            i = this.I$0;
            try {
                b.s(obj);
            } catch (Throwable th3) {
                th = th3;
                r1 = i;
                SyncJobService.this.jobFinished(this.$jobParameters, r1 != 0);
                throw th;
            }
            if (!((Boolean) obj).booleanValue()) {
                SyncJobService.this.jobFinished(this.$jobParameters, i != 0);
                return vVar;
            }
            InterfaceC5233a interfaceC5233a2 = (InterfaceC5233a) g.a().getService(InterfaceC5233a.class);
            this.L$0 = interfaceC5233a2;
            this.I$0 = i;
            this.label = 2;
            if (interfaceC5233a2.runBackgroundServices(this) != aVar) {
                interfaceC5233a = interfaceC5233a2;
                com.onesignal.debug.internal.logging.b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC5233a.getNeedsJobReschedule(), null, 2, null);
                r1 = interfaceC5233a.getNeedsJobReschedule();
                interfaceC5233a.setNeedsJobReschedule(false);
                SyncJobService.this.jobFinished(this.$jobParameters, r1);
                return vVar;
            }
            return aVar;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        kotlin.jvm.internal.h.e(jobParameters, "jobParameters");
        com.onesignal.common.threading.b.INSTANCE.prewarm();
        c.suspendifyOnIO(new a(jobParameters, null));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        kotlin.jvm.internal.h.e(jobParameters, "jobParameters");
        try {
            boolean cancelRunBackgroundServices = ((InterfaceC5233a) g.a().getService(InterfaceC5233a.class)).cancelRunBackgroundServices();
            com.onesignal.debug.internal.logging.b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
            return cancelRunBackgroundServices;
        } catch (Exception unused) {
            com.onesignal.debug.internal.logging.b.error$default("SyncJobService onStopJob failed, omit and do not reschedule", null, 2, null);
            return false;
        }
    }
}
