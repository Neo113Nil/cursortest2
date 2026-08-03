package com.onesignal.core.services;

import ac.o;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.debug.internal.logging.b;
import fc.d;
import hc.j;
import oc.c;
import pc.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class SyncJobService extends JobService {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements c {
        final /* synthetic */ s $backgroundService;
        final /* synthetic */ JobParameters $jobParameters;
        int label;
        final /* synthetic */ SyncJobService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, SyncJobService syncJobService, JobParameters jobParameters, d dVar) {
            super(1, dVar);
            this.$backgroundService = sVar;
            this.this$0 = syncJobService;
            this.$jobParameters = jobParameters;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return new a(this.$backgroundService, this.this$0, this.$jobParameters, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                s8.a aVar = (s8.a) this.$backgroundService.f5683g;
                this.label = 1;
                Object runBackgroundServices = aVar.runBackgroundServices(this);
                gc.a aVar2 = gc.a.f2559g;
                if (runBackgroundServices == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + ((s8.a) this.$backgroundService.f5683g).getNeedsJobReschedule(), null, 2, null);
            boolean needsJobReschedule = ((s8.a) this.$backgroundService.f5683g).getNeedsJobReschedule();
            ((s8.a) this.$backgroundService.f5683g).setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, needsJobReschedule);
            return o.f277a;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        pc.j.e(jobParameters, "jobParameters");
        if (!h8.d.b(this)) {
            return false;
        }
        s sVar = new s();
        sVar.f5683g = h8.d.a().getService(s8.a.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(sVar, this, jobParameters, null), 1, null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        pc.j.e(jobParameters, "jobParameters");
        boolean cancelRunBackgroundServices = ((s8.a) h8.d.a().getService(s8.a.class)).cancelRunBackgroundServices();
        b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
        return cancelRunBackgroundServices;
    }
}
