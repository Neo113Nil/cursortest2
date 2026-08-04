package com.onesignal.core.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.wa.b;
import com.gamericefishpro.space.xb.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class SyncJobService extends JobService {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ a0 $backgroundService;
        final /* synthetic */ JobParameters $jobParameters;
        int label;
        final /* synthetic */ SyncJobService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, SyncJobService syncJobService, JobParameters jobParameters, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$backgroundService = a0Var;
            this.this$0 = syncJobService;
            this.$jobParameters = jobParameters;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new a(this.$backgroundService, this.this$0, this.$jobParameters, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                b.P(obj);
                com.gamericefishpro.space.pc.a aVar2 = (com.gamericefishpro.space.pc.a) this.$backgroundService.d;
                this.label = 1;
                if (aVar2.runBackgroundServices(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.P(obj);
            }
            com.gamericefishpro.space.od.b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + ((com.gamericefishpro.space.pc.a) this.$backgroundService.d).getNeedsJobReschedule(), null, 2, null);
            boolean needsJobReschedule = ((com.gamericefishpro.space.pc.a) this.$backgroundService.d).getNeedsJobReschedule();
            ((com.gamericefishpro.space.pc.a) this.$backgroundService.d).setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, needsJobReschedule);
            return Unit.a;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Intrinsics.checkNotNullParameter(jobParameters, "jobParameters");
        if (!c.b(this)) {
            return false;
        }
        a0 a0Var = new a0();
        a0Var.d = c.a().getService(com.gamericefishpro.space.pc.a.class);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new a(a0Var, this, jobParameters, null), 1, null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        Intrinsics.checkNotNullParameter(jobParameters, "jobParameters");
        boolean zCancelRunBackgroundServices = ((com.gamericefishpro.space.pc.a) c.a().getService(com.gamericefishpro.space.pc.a.class)).cancelRunBackgroundServices();
        com.gamericefishpro.space.od.b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + zCancelRunBackgroundServices, null, 2, null);
        return zCancelRunBackgroundServices;
    }
}
