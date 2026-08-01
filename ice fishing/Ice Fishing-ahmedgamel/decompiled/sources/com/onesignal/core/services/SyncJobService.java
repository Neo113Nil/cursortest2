package com.onesignal.core.services;

import B7.h;
import I7.l;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.bumptech.glide.d;
import com.onesignal.common.threading.c;
import com.onesignal.debug.internal.logging.b;
import p4.g;
import u7.v;
import z4.InterfaceC5260a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class SyncJobService extends JobService {

    public static final class a extends h implements l {
        final /* synthetic */ JobParameters $jobParameters;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobParameters jobParameters, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$jobParameters = jobParameters;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return SyncJobService.this.new a(this.$jobParameters, interfaceC5267d);
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
            ?? r12;
            int i;
            InterfaceC5260a interfaceC5260a;
            A7.a aVar = A7.a.f58n;
            int i6 = this.label;
            v vVar = v.f41353a;
            if (i6 == 0) {
                d.k(obj);
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
                    r12 = 0;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r12 = this.I$0;
                interfaceC5260a = (InterfaceC5260a) this.L$0;
                try {
                    d.k(obj);
                    b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC5260a.getNeedsJobReschedule(), null, 2, null);
                    r12 = interfaceC5260a.getNeedsJobReschedule();
                    interfaceC5260a.setNeedsJobReschedule(false);
                    SyncJobService.this.jobFinished(this.$jobParameters, r12);
                    return vVar;
                } catch (Throwable th2) {
                    th = th2;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            i = this.I$0;
            try {
                d.k(obj);
            } catch (Throwable th3) {
                th = th3;
                r12 = i;
                SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                throw th;
            }
            if (!((Boolean) obj).booleanValue()) {
                SyncJobService.this.jobFinished(this.$jobParameters, i != 0);
                return vVar;
            }
            InterfaceC5260a interfaceC5260a2 = (InterfaceC5260a) g.a().getService(InterfaceC5260a.class);
            this.L$0 = interfaceC5260a2;
            this.I$0 = i;
            this.label = 2;
            if (interfaceC5260a2.runBackgroundServices(this) != aVar) {
                interfaceC5260a = interfaceC5260a2;
                b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC5260a.getNeedsJobReschedule(), null, 2, null);
                r12 = interfaceC5260a.getNeedsJobReschedule();
                interfaceC5260a.setNeedsJobReschedule(false);
                SyncJobService.this.jobFinished(this.$jobParameters, r12);
                return vVar;
            }
            return aVar;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41353a);
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
            boolean cancelRunBackgroundServices = ((InterfaceC5260a) g.a().getService(InterfaceC5260a.class)).cancelRunBackgroundServices();
            b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
            return cancelRunBackgroundServices;
        } catch (Exception unused) {
            b.error$default("SyncJobService onStopJob failed, omit and do not reschedule", null, 2, null);
            return false;
        }
    }
}
